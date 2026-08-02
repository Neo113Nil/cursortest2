package ru.ok.proto.okmp.messages;

import ru.ok.proto.messages.ProtoMessageBase;
import ru.ok.proto.rtmp.ProtocolException;
import ru.ok.proto.rtmp.amf.entries.AmfMessageBase;
import ru.ok.proto.rtmp.amf.entries.AmfString;

/* loaded from: classes9.dex */
public class PublishMessage extends ProtoMessageBase {
    private final AmfString streamName;

    public PublishMessage(String str) {
        super("publish");
        this.streamName = new AmfString(str);
    }

    @Override // ru.ok.proto.messages.ProtoMessageBase, ru.ok.proto.rtmp.amf.entries.AmfMessageBase
    public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
        super.visit(visitor);
        visitor.visit(this.streamName);
    }
}
