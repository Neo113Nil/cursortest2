package defpackage;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class lf1 extends hjv {
    public static final e2f0 e = new e2f0(ff1.class, new xfo(11));
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf1(Class cls, g2f0[] g2f0VarArr, int i) {
        super(cls, g2f0VarArr);
        this.d = i;
    }

    public static ujx m(int i, int i2, HashType hashType, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        lg1 C = mg1.C();
        rg1 A = sg1.A();
        A.e();
        sg1.x((sg1) A.b);
        sg1 sg1Var = (sg1) A.b();
        C.e();
        mg1.x((mg1) C.b, sg1Var);
        C.e();
        mg1.y((mg1) C.b, i);
        mg1 mg1Var = (mg1) C.b();
        pou C2 = qou.C();
        vou C3 = wou.C();
        C3.e();
        wou.x((wou) C3.b, hashType);
        C3.e();
        wou.y((wou) C3.b, i2);
        wou wouVar = (wou) C3.b();
        C2.e();
        qou.x((qou) C2.b, wouVar);
        C2.e();
        qou.y((qou) C2.b, 32);
        qou qouVar = (qou) C2.b();
        yf1 B = zf1.B();
        B.e();
        zf1.x((zf1) B.b, mg1Var);
        B.e();
        zf1.y((zf1) B.b, qouVar);
        return new ujx((zf1) B.b(), keyTemplate$OutputPrefixType);
    }

    public static ujx n(int i, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        zg1 B = ah1.B();
        B.e();
        ah1.y((ah1) B.b, i);
        dh1 A = eh1.A();
        A.e();
        eh1.x((eh1) A.b);
        eh1 eh1Var = (eh1) A.b();
        B.e();
        ah1.x((ah1) B.b, eh1Var);
        return new ujx((ah1) B.b(), keyTemplate$OutputPrefixType);
    }

    public static ujx o(int i, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        nh1 z = oh1.z();
        z.e();
        oh1.x((oh1) z.b, i);
        return new ujx((oh1) z.b(), keyTemplate$OutputPrefixType);
    }

    public static ujx p(int i, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        zh1 z = ai1.z();
        z.e();
        ai1.x((ai1) z.b, i);
        return new ujx((ai1) z.b(), keyTemplate$OutputPrefixType);
    }

    public static void q(qf1 qf1Var) {
        if (qf1Var.z() < 10) {
            kbs.v("tag size too short");
        } else {
            if (qf1Var.z() <= 16) {
                return;
            }
            kbs.v("tag size too long");
        }
    }

    @Override // defpackage.hjv
    public TinkFipsUtil$AlgorithmFipsCompatibility e() {
        switch (this.d) {
            case 1:
                return TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
            case 2:
            default:
                return super.e();
            case 3:
                return TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
        }
    }

    @Override // defpackage.hjv
    public final String f() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 7:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 8:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    @Override // defpackage.hjv
    public final w3 h() {
        switch (this.d) {
            case 0:
                return new kf1(if1.class);
            case 1:
                return new kf1(this);
            case 2:
                return new kf1(this, (byte) 0);
            case 3:
                return new kf1(this, (char) 0);
            case 4:
                return new kf1(this, 0);
            case 5:
                return new kf1(this, (short) 0);
            case 6:
                return new kf1(this, (byte) 0, false);
            case 7:
                return new kf1(this, (byte) 0, (byte) 0);
            case 8:
                return new kf1(this, (byte) 0, (char) 0);
            default:
                return new kf1(this, (byte) 0, 0);
        }
    }

    @Override // defpackage.hjv
    public final KeyData$KeyMaterialType i() {
        switch (this.d) {
            case 0:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 1:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 2:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 3:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 4:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 5:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 6:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 7:
                return KeyData$KeyMaterialType.REMOTE;
            case 8:
                return KeyData$KeyMaterialType.REMOTE;
            default:
                return KeyData$KeyMaterialType.SYMMETRIC;
        }
    }

    @Override // defpackage.hjv
    public final vt10 j(ByteString byteString) {
        switch (this.d) {
            case 0:
                return ef1.E(byteString, oyo.b());
            case 1:
                return vf1.E(byteString, oyo.b());
            case 2:
                return wg1.E(byteString, oyo.b());
            case 3:
                return kh1.C(byteString, oyo.b());
            case 4:
                return wh1.C(byteString, oyo.b());
            case 5:
                return hi1.C(byteString, oyo.b());
            case 6:
                return v79.C(byteString, oyo.b());
            case 7:
                return ulx.C(byteString, oyo.b());
            case 8:
                return dmx.C(byteString, oyo.b());
            default:
                return ad51.C(byteString, oyo.b());
        }
    }

    @Override // defpackage.hjv
    public final void l(vt10 vt10Var) {
        switch (this.d) {
            case 0:
                ef1 ef1Var = (ef1) vt10Var;
                d131.c(ef1Var.C());
                if (ef1Var.A().size() == 32) {
                    q(ef1Var.B());
                    return;
                } else {
                    kbs.v("AesCmacKey size wrong, must be 32 bytes");
                    return;
                }
            case 1:
                vf1 vf1Var = (vf1) vt10Var;
                d131.c(vf1Var.C());
                g2f0[] g2f0VarArr = {new ng1(gg1.class)};
                HashMap hashMap = new HashMap();
                for (g2f0 g2f0Var : g2f0VarArr) {
                    boolean containsKey = hashMap.containsKey(g2f0Var.a);
                    Class cls = g2f0Var.a;
                    if (containsKey) {
                        vg10.g(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                        return;
                    }
                    hashMap.put(cls, g2f0Var);
                }
                if (g2f0VarArr.length > 0) {
                    Class cls2 = g2f0VarArr[0].a;
                }
                Collections.unmodifiableMap(hashMap);
                pg1.m(vf1Var.A());
                new sou();
                sou.n(vf1Var.B());
                return;
            case 2:
                wg1 wg1Var = (wg1) vt10Var;
                d131.c(wg1Var.C());
                d131.a(wg1Var.A().size());
                if (wg1Var.B().z() == 12 || wg1Var.B().z() == 16) {
                    return;
                }
                kbs.v("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                kh1 kh1Var = (kh1) vt10Var;
                d131.c(kh1Var.A());
                d131.a(kh1Var.z().size());
                return;
            case 4:
                wh1 wh1Var = (wh1) vt10Var;
                d131.c(wh1Var.A());
                d131.a(wh1Var.z().size());
                return;
            case 5:
                hi1 hi1Var = (hi1) vt10Var;
                d131.c(hi1Var.A());
                if (hi1Var.z().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + hi1Var.z().size() + ". Valid keys must have 64 bytes.");
            case 6:
                v79 v79Var = (v79) vt10Var;
                d131.c(v79Var.A());
                if (v79Var.z().size() == 32) {
                    return;
                }
                kbs.v("invalid ChaCha20Poly1305Key: incorrect key length");
                return;
            case 7:
                d131.c(((ulx) vt10Var).A());
                return;
            case 8:
                d131.c(((dmx) vt10Var).A());
                return;
            default:
                ad51 ad51Var = (ad51) vt10Var;
                d131.c(ad51Var.A());
                if (ad51Var.z().size() == 32) {
                    return;
                }
                kbs.v("invalid XChaCha20Poly1305Key: incorrect key length");
                return;
        }
    }
}
