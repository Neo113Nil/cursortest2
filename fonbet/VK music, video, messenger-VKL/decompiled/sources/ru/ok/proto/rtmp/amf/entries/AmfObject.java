package ru.ok.proto.rtmp.amf.entries;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import ru.ok.proto.rtmp.ProtocolException;
import ru.ok.proto.rtmp.amf.AmfEntry;
import ru.ok.proto.rtmp.amf.AmfUtil;
import ru.ok.proto.rtmp.amf.entries.AmfObjectBase;

/* loaded from: classes9.dex */
public class AmfObject extends AmfObjectBase {
    Map<String, AmfEntry> properties;

    public AmfObject() {
        this.properties = new HashMap();
    }

    @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase, ru.ok.proto.rtmp.amf.AmfEntry
    public void deserialize(ByteBuffer byteBuffer) throws ProtocolException {
        while (true) {
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
                Map<String, AmfEntry> map = this.properties;
                if (b == 5) {
                    createByType = null;
                }
                map.put(deserializeStatic, createByType);
            }
        }
    }

    public Map<String, AmfEntry> getProperties() {
        return this.properties;
    }

    @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase, ru.ok.proto.rtmp.amf.AmfEntry
    public void serialize(ByteBuffer byteBuffer) throws ProtocolException {
        for (Map.Entry<String, AmfEntry> entry : this.properties.entrySet()) {
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

    @Override // ru.ok.proto.rtmp.amf.entries.AmfObjectBase
    public void visit(AmfObjectBase.Visitor visitor) throws ProtocolException {
        super.visit(visitor);
        for (Map.Entry<String, AmfEntry> entry : this.properties.entrySet()) {
            visitor.visit(entry.getKey(), entry.getValue());
        }
    }

    public AmfObject(Map<String, Object> map) {
        this.properties = new HashMap(map.size() * 2);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            AmfEntry amf = AmfUtil.toAmf(entry.getValue());
            if (amf != null) {
                this.properties.put(entry.getKey(), amf);
            }
        }
    }
}
