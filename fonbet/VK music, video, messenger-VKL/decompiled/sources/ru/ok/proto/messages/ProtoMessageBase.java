package ru.ok.proto.messages;

import ru.ok.proto.rtmp.ProtocolException;
import ru.ok.proto.rtmp.amf.entries.AmfMessageBase;
import ru.ok.proto.rtmp.amf.entries.AmfNumber;
import ru.ok.proto.rtmp.amf.entries.AmfString;

/* loaded from: classes9.dex */
public class ProtoMessageBase extends AmfMessageBase {
    private AmfString name;
    private AmfNumber transactionId;

    public ProtoMessageBase() {
        this.name = new AmfString();
        this.transactionId = new AmfNumber();
    }

    public String getName() {
        return this.name.getValue();
    }

    public double getTransactionId() {
        return this.transactionId.getValue();
    }

    public void setTransactionId(double d) {
        this.transactionId.setValue(d);
    }

    @Override // ru.ok.proto.rtmp.amf.entries.AmfMessageBase
    public void visit(AmfMessageBase.Visitor visitor) throws ProtocolException {
        super.visit(visitor);
        visitor.visit(this.name);
        visitor.visit(this.transactionId);
    }

    public ProtoMessageBase(String str) {
        this(str, 0);
    }

    public ProtoMessageBase(String str, int i) {
        this.name = new AmfString(str);
        this.transactionId = new AmfNumber(i);
    }
}
