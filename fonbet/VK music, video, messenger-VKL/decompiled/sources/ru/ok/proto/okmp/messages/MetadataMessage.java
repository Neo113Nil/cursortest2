package ru.ok.proto.okmp.messages;

import java.util.Map;
import ru.ok.proto.messages.ProtoMessageBase;
import ru.ok.proto.rtmp.ProtocolException;
import ru.ok.proto.rtmp.amf.entries.AmfMessageBase;
import ru.ok.proto.rtmp.amf.entries.AmfObject;

/* loaded from: classes9.dex */
public class MetadataMessage extends ProtoMessageBase {
    private final AmfObject metadata;

    public MetadataMessage(Map<String, Object> map) {
        super("metadata");
        this.metadata = new AmfObject(map);
    }

    @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
    public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
        super.visit(visitor);
        visitor.visit(this.metadata);
    }
}
