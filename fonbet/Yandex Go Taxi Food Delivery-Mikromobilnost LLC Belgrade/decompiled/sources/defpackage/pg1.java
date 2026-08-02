package defpackage;

import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.ByteString;

/* loaded from: classes11.dex */
public final class pg1 extends hjv {
    public pg1() {
        super(jg1.class, new ng1(gg1.class));
    }

    public static void m(jg1 jg1Var) {
        d131.c(jg1Var.D());
        d131.a(jg1Var.B().size());
        sg1 C = jg1Var.C();
        if (C.z() < 12 || C.z() > 16) {
            kbs.v("invalid IV size");
        }
    }

    @Override // defpackage.hjv
    public final String f() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // defpackage.hjv
    public final w3 h() {
        return new og1(1, mg1.class);
    }

    @Override // defpackage.hjv
    public final KeyData$KeyMaterialType i() {
        return KeyData$KeyMaterialType.SYMMETRIC;
    }

    @Override // defpackage.hjv
    public final vt10 j(ByteString byteString) {
        return jg1.F(byteString, oyo.b());
    }

    @Override // defpackage.hjv
    public final /* bridge */ /* synthetic */ void l(vt10 vt10Var) {
        m((jg1) vt10Var);
    }
}
