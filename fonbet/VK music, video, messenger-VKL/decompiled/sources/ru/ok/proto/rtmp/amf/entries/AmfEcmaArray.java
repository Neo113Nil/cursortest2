package ru.ok.proto.rtmp.amf.entries;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.ok.proto.rtmp.ProtocolException;
import ru.ok.proto.rtmp.amf.AmfEntry;
import ru.ok.proto.rtmp.amf.AmfUtil;

/* loaded from: classes9.dex */
public class AmfEcmaArray implements AmfEntry {
    private final Map<String, AmfEntry> entries;

    public AmfEcmaArray() {
        this.entries = new HashMap();
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void deserialize(ByteBuffer byteBuffer) throws ProtocolException {
        int i = byteBuffer.getInt();
        for (int i2 = 0; i2 < i; i2++) {
            String deserializeStatic = AmfString.deserializeStatic(byteBuffer);
            byte b = byteBuffer.get();
            if (b == 9) {
                return;
            }
            AmfEntry createByType = AmfUtil.createByType(b);
            if (createByType == null) {
                AmfUtil.skipEntry(b, byteBuffer);
            } else {
                createByType.deserialize(byteBuffer);
                Map<String, AmfEntry> map = this.entries;
                if (b == 5) {
                    createByType = null;
                }
                map.put(deserializeStatic, createByType);
            }
        }
    }

    public Map<String, AmfEntry> getEntries() {
        return this.entries;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public final int getSize() throws ProtocolException {
        Iterator<Map.Entry<String, AmfEntry>> it = this.entries.entrySet().iterator();
        int i = 4;
        while (true) {
            int i2 = 3;
            if (!it.hasNext()) {
                return i + 3;
            }
            Map.Entry<String, AmfEntry> next = it.next();
            int sizeStatic = AmfString.getSizeStatic(next.getKey()) + i;
            AmfEntry value = next.getValue();
            if (value != null) {
                i2 = value.getSize() + 1;
            }
            i = sizeStatic + i2;
        }
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public final byte getType() {
        return (byte) 8;
    }

    @Override // ru.ok.proto.rtmp.amf.AmfEntry
    public void serialize(ByteBuffer byteBuffer) throws ProtocolException {
        byteBuffer.putInt(this.entries.size());
        for (Map.Entry<String, AmfEntry> entry : this.entries.entrySet()) {
            AmfString.serializeStatic(byteBuffer, entry.getKey());
            AmfEntry value = entry.getValue();
            if (value == null) {
                value = AmfNull.INSTANCE;
            }
            byteBuffer.put(value.getType());
            value.serialize(byteBuffer);
        }
        byteBuffer.putShort((short) 0);
        byteBuffer.put((byte) 9);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<String, AmfEntry> entry : this.entries.entrySet()) {
            AmfEntry value = entry.getValue();
            sb.append(entry.getKey());
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(value == null ? "null" : value.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    public AmfEcmaArray(Map<String, Object> map) {
        this.entries = new HashMap(map.size() * 2);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            AmfEntry amf = AmfUtil.toAmf(entry.getValue());
            if (amf != null) {
                this.entries.put(entry.getKey(), amf);
            }
        }
    }
}
