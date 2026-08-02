package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes11.dex */
public final class df1 extends k implements yt10 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public df1(int i) {
        super(r1);
        ef1 ef1Var;
        ef1Var = ef1.DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0031a
    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public final void g(ByteString byteString) {
        e();
        ef1.y((ef1) this.b, byteString);
    }

    @Override // defpackage.yt10
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return this.a;
    }

    public final void h(qf1 qf1Var) {
        e();
        ef1.z((ef1) this.b, qf1Var);
    }

    public final void i() {
        e();
        ef1.x((ef1) this.b);
    }
}
