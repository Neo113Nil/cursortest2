package ru.ok.proto.rtmp.amf.entries;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import ru.ok.proto.rtmp.ProtocolException;
import ru.ok.proto.rtmp.amf.AmfEntry;
import xsna.ne7;

/* loaded from: classes9.dex */
public class AmfMessageBase implements AmfEntry {
    private static final String TAG = "Publisher";

    public static class DeserializingVisitor implements Visitor {
        private ByteBuffer data;

        public DeserializingVisitor(ByteBuffer byteBuffer) {
            this.data = byteBuffer;
        }

        @Override // ru.ok.proto.rtmp.amf.entries.AmfMessageBase.Visitor
        public void visit(AmfEntry amfEntry) throws ProtocolException {
            byte b = this.data.get();
            if (5 == b) {
                return;
            }
            if (amfEntry.getType() == b) {
                amfEntry.deserialize(this.data);
                return;
            }
            throw new ProtocolException("Unexpected AMF type: expected=" + ((int) amfEntry.getType()) + "; received=" + ((int) b));
        }
    }

    public static class SerializingVisitor implements Visitor {
        private ByteBuffer buffer;

        public SerializingVisitor(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
        }

        @Override // ru.ok.proto.rtmp.amf.entries.AmfMessageBase.Visitor
        public void visit(AmfEntry amfEntry) throws ProtocolException {
            this.buffer.put(amfEntry.getType());
            amfEntry.serialize(this.buffer);
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

        @Override // ru.ok.proto.rtmp.amf.entries.AmfMessageBase.Visitor
        public void visit(AmfEntry amfEntry) throws ProtocolException {
            this.result = amfEntry.getSize() + 1 + this.result;
        }

        private SizeCountingVisitor() {
        }
    }

    public static class ToStringVisitor implements Visitor {
        private StringBuilder result = new StringBuilder();
        private boolean first = true;

        @Override // ru.ok.proto.rtmp.amf.entries.AmfMessageBase.Visitor
        public void visit(AmfEntry amfEntry) throws ProtocolException {
            if (!this.first) {
                this.result.append(StringUtils.COMMA);
            }
            this.first = false;
            this.result.append(amfEntry.toString());
        }
    }

    public interface Visitor {
        void visit(AmfEntry amfEntry) throws ProtocolException;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void deserialize(ByteBuffer byteBuffer) throws ProtocolException {
        visit(new DeserializingVisitor(byteBuffer));
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public int getSize() throws ProtocolException {
        SizeCountingVisitor sizeCountingVisitor = new SizeCountingVisitor(0);
        visit(sizeCountingVisitor);
        return sizeCountingVisitor.getResult();
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public byte getType() {
        return (byte) 3;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void serialize(ByteBuffer byteBuffer) throws ProtocolException {
        visit(new SerializingVisitor(byteBuffer));
    }

    public String toString() {
        ToStringVisitor toStringVisitor = new ToStringVisitor();
        try {
            visit(toStringVisitor);
        } catch (ProtocolException e) {
            ne7.n(TAG, "toString failed: " + e);
        }
        return "{" + toStringVisitor.result.toString() + "}";
    }

    public void visit(Visitor visitor) throws ProtocolException {
    }
}
