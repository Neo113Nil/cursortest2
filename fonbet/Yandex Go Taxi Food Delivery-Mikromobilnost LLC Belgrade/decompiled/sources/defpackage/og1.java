package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;

/* loaded from: classes11.dex */
public final class og1 extends w3 {
    @Override // defpackage.w3
    public final vt10 b(vt10 vt10Var) {
        mg1 mg1Var = (mg1) vt10Var;
        ig1 E = jg1.E();
        sg1 B = mg1Var.B();
        E.e();
        jg1.y((jg1) E.b, B);
        byte[] a = i6i0.a(mg1Var.A());
        ByteString f = ByteString.f(0, a.length, a);
        E.e();
        jg1.z((jg1) E.b, f);
        E.e();
        jg1.x((jg1) E.b);
        return (jg1) E.b();
    }

    @Override // defpackage.w3
    public final vt10 h(ByteString byteString) {
        return mg1.D(byteString, oyo.b());
    }

    @Override // defpackage.w3
    public final void i(vt10 vt10Var) {
        mg1 mg1Var = (mg1) vt10Var;
        d131.a(mg1Var.A());
        sg1 B = mg1Var.B();
        if (B.z() < 12 || B.z() > 16) {
            kbs.v("invalid IV size");
        }
    }
}
