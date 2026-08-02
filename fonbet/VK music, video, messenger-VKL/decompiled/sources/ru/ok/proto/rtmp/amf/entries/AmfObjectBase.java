package ru.ok.proto.rtmp.amf.entries;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import ru.ok.proto.rtmp.ProtocolException;
import ru.ok.proto.rtmp.amf.AmfEntry;
import ru.ok.proto.rtmp.amf.AmfUtil;
import xsna.ne7;
import xsna.t33;

/* loaded from: classes9.dex */
public class AmfObjectBase implements AmfEntry {
    private static final String TAG = "Publisher";

    public static class MappingVisitor implements Visitor {
        Map<String, AmfEntry> result;

        public /* synthetic */ MappingVisitor(int i) {
            this();
        }

        public Map<String, AmfEntry> getResult() {
            return this.result;
        }

        @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase.Visitor
        public void visit(String str, AmfEntry amfEntry) throws ProtocolException {
            this.result.put(str, amfEntry);
        }

        private MappingVisitor() {
            this.result = new HashMap(30);
        }
    }

    public static class SerializingVisitor implements Visitor {
        private ByteBuffer buffer;

        public SerializingVisitor(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
        }

        @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase.Visitor
        public void visit(String str, AmfEntry amfEntry) throws ProtocolException {
            AmfString.serializeStatic(this.buffer, str);
            if (amfEntry == null) {
                this.buffer.put((byte) 5);
            } else {
                this.buffer.put(amfEntry.getType());
                amfEntry.serialize(this.buffer);
            }
        }
    }

    public static class SizeCountingVisitor implements Visitor {
        private int result;

        public /* synthetic */ SizeCountingVisitor(int i) {
            this();
        }

        public int getResult() {
            return this.result;
        }

        @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase.Visitor
        public void visit(String str, AmfEntry amfEntry) throws ProtocolException {
            this.result = AmfString.getSizeStatic(str) + 1 + (amfEntry == null ? 0 : amfEntry.getSize()) + this.result;
        }

        private SizeCountingVisitor() {
        }
    }

    public static class ToStringVisitor implements Visitor {
        private StringBuilder result = new StringBuilder();
        private boolean first = true;

        @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase.Visitor
        public void visit(String str, AmfEntry amfEntry) throws ProtocolException {
            if (!this.first) {
                this.result.append(StringUtils.COMMA);
            }
            this.first = false;
            this.result.append(str);
            this.result.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            this.result.append(amfEntry == null ? "null" : amfEntry.toString());
        }
    }

    public interface Visitor {
        void visit(String str, AmfEntry amfEntry) throws ProtocolException;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void deserialize(ByteBuffer byteBuffer) throws ProtocolException {
        MappingVisitor mappingVisitor = new MappingVisitor(0);
        visit(mappingVisitor);
        Map<String, AmfEntry> result = mappingVisitor.getResult();
        while (byteBuffer.hasRemaining()) {
            String deserializeStatic = AmfString.deserializeStatic(byteBuffer);
            byte b = byteBuffer.get();
            if (b == 9) {
                return;
            }
            AmfEntry amfEntry = result.get(deserializeStatic);
            if (amfEntry == null) {
                AmfUtil.skipEntry(b, byteBuffer);
            } else {
                if (amfEntry.getType() != b) {
                    StringBuilder a = t33.a("AMF unexpected type for property \"", deserializeStatic, "\"; expected=");
                    a.append((int) amfEntry.getType());
                    a.append("; received=");
                    a.append((int) b);
                    throw new ProtocolException(a.toString());
                }
                amfEntry.deserialize(byteBuffer);
            }
        }
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public final int getSize() throws ProtocolException {
        SizeCountingVisitor sizeCountingVisitor = new SizeCountingVisitor(0);
        visit(sizeCountingVisitor);
        return sizeCountingVisitor.getResult() + 3;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public final byte getType() {
        return (byte) 3;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void serialize(ByteBuffer byteBuffer) throws ProtocolException {
        visit(new SerializingVisitor(byteBuffer));
        byteBuffer.putShort((short) 0);
        byteBuffer.put((byte) 9);
    }

    public String toString() {
        ToStringVisitor toStringVisitor = new ToStringVisitor();
        try {
            visit(toStringVisitor);
        } catch (ProtocolException e) {
            ne7.n(TAG, "toString failed" + e);
        }
        return "{" + ((Object) toStringVisitor.result) + "}";
    }

    public void visit(Visitor visitor) throws ProtocolException {
    }
}
