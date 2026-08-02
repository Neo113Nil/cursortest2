package defpackage;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class kf1 extends w3 {
    public final /* synthetic */ int c = 0;

    public kf1(lf1 lf1Var, byte b, byte b2) {
        super(1, xlx.class);
    }

    @Override // defpackage.w3
    public final vt10 b(vt10 vt10Var) {
        switch (this.c) {
            case 0:
                if1 if1Var = (if1) vt10Var;
                df1 D = ef1.D();
                D.i();
                byte[] a = i6i0.a(if1Var.z());
                D.g(ByteString.f(0, a.length, a));
                D.h(if1Var.A());
                return (ef1) D.b();
            case 1:
                zf1 zf1Var = (zf1) vt10Var;
                jg1 jg1Var = (jg1) new pg1().h().b(zf1Var.z());
                new sou();
                qou A = zf1Var.A();
                lou E = mou.E();
                E.i();
                E.h(A.B());
                byte[] a2 = i6i0.a(A.A());
                E.g(ByteString.f(0, a2.length, a2));
                mou mouVar = (mou) E.b();
                uf1 D2 = vf1.D();
                D2.g(jg1Var);
                D2.h(mouVar);
                D2.i();
                return (vf1) D2.b();
            case 2:
                ah1 ah1Var = (ah1) vt10Var;
                vg1 D3 = wg1.D();
                byte[] a3 = i6i0.a(ah1Var.z());
                D3.g(ByteString.f(0, a3.length, a3));
                D3.h(ah1Var.A());
                D3.i();
                return (wg1) D3.b();
            case 3:
                jh1 B = kh1.B();
                byte[] a4 = i6i0.a(((oh1) vt10Var).y());
                ByteString f = ByteString.f(0, a4.length, a4);
                B.e();
                kh1.y((kh1) B.b, f);
                B.e();
                kh1.x((kh1) B.b);
                return (kh1) B.b();
            case 4:
                vh1 B2 = wh1.B();
                byte[] a5 = i6i0.a(((ai1) vt10Var).y());
                B2.g(ByteString.f(0, a5.length, a5));
                B2.h();
                return (wh1) B2.b();
            case 5:
                gi1 B3 = hi1.B();
                byte[] a6 = i6i0.a(((li1) vt10Var).y());
                ByteString f2 = ByteString.f(0, a6.length, a6);
                B3.e();
                hi1.y((hi1) B3.b, f2);
                B3.e();
                hi1.x((hi1) B3.b);
                return (hi1) B3.b();
            case 6:
                u79 B4 = v79.B();
                B4.h();
                byte[] a7 = i6i0.a(32);
                B4.g(ByteString.f(0, a7.length, a7));
                return (v79) B4.b();
            case 7:
                qou qouVar = (qou) vt10Var;
                lou E2 = mou.E();
                E2.i();
                E2.h(qouVar.B());
                byte[] a8 = i6i0.a(qouVar.A());
                E2.g(ByteString.f(0, a8.length, a8));
                return (mou) E2.b();
            case 8:
                tlx B5 = ulx.B();
                B5.g((xlx) vt10Var);
                B5.h();
                return (ulx) B5.b();
            case 9:
                cmx B6 = dmx.B();
                B6.g((gmx) vt10Var);
                B6.h();
                return (dmx) B6.b();
            default:
                zc51 B7 = ad51.B();
                B7.h();
                byte[] a9 = i6i0.a(32);
                B7.g(ByteString.f(0, a9.length, a9));
                return (ad51) B7.b();
        }
    }

    @Override // defpackage.w3
    public Map g() {
        switch (this.c) {
            case 0:
                HashMap hashMap = new HashMap();
                hf1 B = if1.B();
                B.e();
                if1.x((if1) B.b);
                pf1 A = qf1.A();
                A.e();
                qf1.x((qf1) A.b);
                qf1 qf1Var = (qf1) A.b();
                B.e();
                if1.y((if1) B.b, qf1Var);
                if1 if1Var = (if1) B.b();
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType = KeyTemplate$OutputPrefixType.TINK;
                hashMap.put("AES_CMAC", new ujx(if1Var, keyTemplate$OutputPrefixType));
                hf1 B2 = if1.B();
                B2.e();
                if1.x((if1) B2.b);
                pf1 A2 = qf1.A();
                A2.e();
                qf1.x((qf1) A2.b);
                qf1 qf1Var2 = (qf1) A2.b();
                B2.e();
                if1.y((if1) B2.b, qf1Var2);
                hashMap.put("AES256_CMAC", new ujx((if1) B2.b(), keyTemplate$OutputPrefixType));
                hf1 B3 = if1.B();
                B3.e();
                if1.x((if1) B3.b);
                pf1 A3 = qf1.A();
                A3.e();
                qf1.x((qf1) A3.b);
                qf1 qf1Var3 = (qf1) A3.b();
                B3.e();
                if1.y((if1) B3.b, qf1Var3);
                hashMap.put("AES256_CMAC_RAW", new ujx((if1) B3.b(), KeyTemplate$OutputPrefixType.RAW));
                return Collections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                HashType hashType = HashType.SHA256;
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType2 = KeyTemplate$OutputPrefixType.TINK;
                hashMap2.put("AES128_CTR_HMAC_SHA256", lf1.m(16, 16, hashType, keyTemplate$OutputPrefixType2));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType3 = KeyTemplate$OutputPrefixType.RAW;
                hashMap2.put("AES128_CTR_HMAC_SHA256_RAW", lf1.m(16, 16, hashType, keyTemplate$OutputPrefixType3));
                hashMap2.put("AES256_CTR_HMAC_SHA256", lf1.m(32, 32, hashType, keyTemplate$OutputPrefixType2));
                hashMap2.put("AES256_CTR_HMAC_SHA256_RAW", lf1.m(32, 32, hashType, keyTemplate$OutputPrefixType3));
                return Collections.unmodifiableMap(hashMap2);
            case 2:
                HashMap hashMap3 = new HashMap();
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType4 = KeyTemplate$OutputPrefixType.TINK;
                hashMap3.put("AES128_EAX", lf1.n(16, keyTemplate$OutputPrefixType4));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType5 = KeyTemplate$OutputPrefixType.RAW;
                hashMap3.put("AES128_EAX_RAW", lf1.n(16, keyTemplate$OutputPrefixType5));
                hashMap3.put("AES256_EAX", lf1.n(32, keyTemplate$OutputPrefixType4));
                hashMap3.put("AES256_EAX_RAW", lf1.n(32, keyTemplate$OutputPrefixType5));
                return Collections.unmodifiableMap(hashMap3);
            case 3:
                HashMap hashMap4 = new HashMap();
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType6 = KeyTemplate$OutputPrefixType.TINK;
                hashMap4.put("AES128_GCM", lf1.o(16, keyTemplate$OutputPrefixType6));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType7 = KeyTemplate$OutputPrefixType.RAW;
                hashMap4.put("AES128_GCM_RAW", lf1.o(16, keyTemplate$OutputPrefixType7));
                hashMap4.put("AES256_GCM", lf1.o(32, keyTemplate$OutputPrefixType6));
                hashMap4.put("AES256_GCM_RAW", lf1.o(32, keyTemplate$OutputPrefixType7));
                return Collections.unmodifiableMap(hashMap4);
            case 4:
                HashMap hashMap5 = new HashMap();
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType8 = KeyTemplate$OutputPrefixType.TINK;
                hashMap5.put("AES128_GCM_SIV", lf1.p(16, keyTemplate$OutputPrefixType8));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType9 = KeyTemplate$OutputPrefixType.RAW;
                hashMap5.put("AES128_GCM_SIV_RAW", lf1.p(16, keyTemplate$OutputPrefixType9));
                hashMap5.put("AES256_GCM_SIV", lf1.p(32, keyTemplate$OutputPrefixType8));
                hashMap5.put("AES256_GCM_SIV_RAW", lf1.p(32, keyTemplate$OutputPrefixType9));
                return Collections.unmodifiableMap(hashMap5);
            case 5:
                HashMap hashMap6 = new HashMap();
                ki1 z = li1.z();
                z.e();
                li1.x((li1) z.b);
                hashMap6.put("AES256_SIV", new ujx((li1) z.b(), KeyTemplate$OutputPrefixType.TINK));
                ki1 z2 = li1.z();
                z2.e();
                li1.x((li1) z2.b);
                hashMap6.put("AES256_SIV_RAW", new ujx((li1) z2.b(), KeyTemplate$OutputPrefixType.RAW));
                return Collections.unmodifiableMap(hashMap6);
            case 6:
                HashMap hashMap7 = new HashMap();
                hashMap7.put("CHACHA20_POLY1305", new ujx(z79.x(), KeyTemplate$OutputPrefixType.TINK));
                hashMap7.put("CHACHA20_POLY1305_RAW", new ujx(z79.x(), KeyTemplate$OutputPrefixType.RAW));
                return Collections.unmodifiableMap(hashMap7);
            case 7:
                HashMap hashMap8 = new HashMap();
                HashType hashType2 = HashType.SHA256;
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType10 = KeyTemplate$OutputPrefixType.TINK;
                hashMap8.put("HMAC_SHA256_128BITTAG", sou.m(32, 16, hashType2, keyTemplate$OutputPrefixType10));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType11 = KeyTemplate$OutputPrefixType.RAW;
                hashMap8.put("HMAC_SHA256_128BITTAG_RAW", sou.m(32, 16, hashType2, keyTemplate$OutputPrefixType11));
                hashMap8.put("HMAC_SHA256_256BITTAG", sou.m(32, 32, hashType2, keyTemplate$OutputPrefixType10));
                hashMap8.put("HMAC_SHA256_256BITTAG_RAW", sou.m(32, 32, hashType2, keyTemplate$OutputPrefixType11));
                HashType hashType3 = HashType.SHA512;
                hashMap8.put("HMAC_SHA512_128BITTAG", sou.m(64, 16, hashType3, keyTemplate$OutputPrefixType10));
                hashMap8.put("HMAC_SHA512_128BITTAG_RAW", sou.m(64, 16, hashType3, keyTemplate$OutputPrefixType11));
                hashMap8.put("HMAC_SHA512_256BITTAG", sou.m(64, 32, hashType3, keyTemplate$OutputPrefixType10));
                hashMap8.put("HMAC_SHA512_256BITTAG_RAW", sou.m(64, 32, hashType3, keyTemplate$OutputPrefixType11));
                hashMap8.put("HMAC_SHA512_512BITTAG", sou.m(64, 64, hashType3, keyTemplate$OutputPrefixType10));
                hashMap8.put("HMAC_SHA512_512BITTAG_RAW", sou.m(64, 64, hashType3, keyTemplate$OutputPrefixType11));
                return Collections.unmodifiableMap(hashMap8);
            case 8:
            case 9:
            default:
                return super.g();
            case 10:
                HashMap hashMap9 = new HashMap();
                hashMap9.put("XCHACHA20_POLY1305", new ujx(ed51.x(), KeyTemplate$OutputPrefixType.TINK));
                hashMap9.put("XCHACHA20_POLY1305_RAW", new ujx(ed51.x(), KeyTemplate$OutputPrefixType.RAW));
                return Collections.unmodifiableMap(hashMap9);
        }
    }

    @Override // defpackage.w3
    public final vt10 h(ByteString byteString) {
        switch (this.c) {
            case 0:
                return if1.C(byteString, oyo.b());
            case 1:
                return zf1.C(byteString, oyo.b());
            case 2:
                return ah1.C(byteString, oyo.b());
            case 3:
                return oh1.A(byteString, oyo.b());
            case 4:
                return ai1.A(byteString, oyo.b());
            case 5:
                return li1.A(byteString, oyo.b());
            case 6:
                return z79.y(byteString, oyo.b());
            case 7:
                return qou.D(byteString, oyo.b());
            case 8:
                return xlx.z(byteString, oyo.b());
            case 9:
                return gmx.B(byteString, oyo.b());
            default:
                return ed51.y(byteString, oyo.b());
        }
    }

    @Override // defpackage.w3
    public final void i(vt10 vt10Var) {
        switch (this.c) {
            case 0:
                if1 if1Var = (if1) vt10Var;
                lf1.q(if1Var.A());
                if (if1Var.z() == 32) {
                    return;
                }
                kbs.v("AesCmacKey size wrong, must be 32 bytes");
                return;
            case 1:
                zf1 zf1Var = (zf1) vt10Var;
                new pg1().h().i(zf1Var.z());
                new sou();
                qou A = zf1Var.A();
                if (A.A() < 16) {
                    kbs.v("key too short");
                    return;
                } else {
                    sou.o(A.B());
                    d131.a(zf1Var.z().A());
                    return;
                }
            case 2:
                ah1 ah1Var = (ah1) vt10Var;
                d131.a(ah1Var.z());
                if (ah1Var.A().z() == 12 || ah1Var.A().z() == 16) {
                    return;
                }
                kbs.v("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                d131.a(((oh1) vt10Var).y());
                return;
            case 4:
                d131.a(((ai1) vt10Var).y());
                return;
            case 5:
                li1 li1Var = (li1) vt10Var;
                if (li1Var.y() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + li1Var.y() + ". Valid keys must have 64 bytes.");
            case 6:
                return;
            case 7:
                qou qouVar = (qou) vt10Var;
                if (qouVar.A() >= 16) {
                    sou.o(qouVar.B());
                    return;
                } else {
                    kbs.v("key too short");
                    return;
                }
            case 8:
                return;
            case 9:
                gmx gmxVar = (gmx) vt10Var;
                if (gmxVar.z().isEmpty() || !gmxVar.A()) {
                    kbs.v("invalid key format: missing KEK URI or DEK template");
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ kf1(Class cls) {
        super(1, cls);
    }

    public kf1(lf1 lf1Var, byte b, char c) {
        super(1, gmx.class);
    }

    public kf1(lf1 lf1Var, char c) {
        super(1, oh1.class);
    }

    public kf1(lf1 lf1Var, byte b) {
        super(1, ah1.class);
    }

    public kf1(lf1 lf1Var, byte b, boolean z) {
        super(1, z79.class);
    }

    public kf1(lf1 lf1Var, int i) {
        super(1, ai1.class);
    }

    public kf1(lf1 lf1Var, byte b, int i) {
        super(1, ed51.class);
    }

    public kf1(lf1 lf1Var, short s) {
        super(1, li1.class);
    }

    public kf1(lf1 lf1Var) {
        super(1, zf1.class);
    }

    public kf1(sou souVar) {
        super(1, qou.class);
    }
}
