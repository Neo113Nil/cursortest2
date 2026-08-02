package defpackage;

import androidx.compose.ui.node.s;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ooz implements rzx {
    public final noz a;

    public ooz(noz nozVar) {
        this.a = nozVar;
    }

    @Override // defpackage.rzx
    public final void B(rzx rzxVar, float[] fArr) {
        this.a.I.B(rzxVar, fArr);
    }

    @Override // defpackage.rzx
    public final long G(long j) {
        return wu60.f(this.a.I.G(j), b());
    }

    @Override // defpackage.rzx
    public final long T(rzx rzxVar, long j) {
        return U(rzxVar, j);
    }

    @Override // defpackage.rzx
    public final long U(rzx rzxVar, long j) {
        boolean z = rzxVar instanceof ooz;
        noz nozVar = this.a;
        if (!z) {
            noz b = bhb1.b(nozVar);
            s sVar = b.I;
            long U = U(b.L, j);
            float f = (int) (b.J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            long e = wu60.e(U, (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!sVar.d()) {
                ixv.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            sVar.k1();
            s sVar2 = sVar.K;
            if (sVar2 != null) {
                sVar = sVar2;
            }
            return wu60.f(e, sVar.U(rzxVar, 0L));
        }
        noz nozVar2 = ((ooz) rzxVar).a;
        s sVar3 = nozVar2.I;
        sVar3.k1();
        noz Z0 = nozVar.I.X0(sVar3).Z0();
        if (Z0 != null) {
            long b2 = z5w.b(z5w.c(nozVar2.T0(Z0, false), wwg.V(j)), nozVar.T0(Z0, false));
            float f2 = (int) (b2 >> 32);
            float f3 = (int) (b2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        noz b3 = bhb1.b(nozVar2);
        long c = z5w.c(z5w.c(nozVar2.T0(b3, false), b3.J), wwg.V(j));
        noz b4 = bhb1.b(nozVar);
        long b5 = z5w.b(c, z5w.c(nozVar.T0(b4, false), b4.J));
        float f4 = (int) (b5 >> 32);
        float f5 = (int) (b5 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        long floatToRawIntBits = Float.floatToRawIntBits(f4);
        return b4.I.K.U(b3.I.K, (Float.floatToRawIntBits(f5) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (floatToRawIntBits << 32));
    }

    public final s a() {
        return this.a.I;
    }

    public final long b() {
        noz nozVar = this.a;
        noz b = bhb1.b(nozVar);
        return wu60.e(U(b.L, 0L), nozVar.I.U(b.I, 0L));
    }

    @Override // defpackage.rzx
    public final void b0(float[] fArr) {
        this.a.I.b0(fArr);
    }

    @Override // defpackage.rzx
    public final boolean d() {
        return this.a.I.d();
    }

    @Override // defpackage.rzx
    public final long e() {
        noz nozVar = this.a;
        return (nozVar.a << 32) | (nozVar.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.rzx
    public final zii0 j(rzx rzxVar, boolean z) {
        return this.a.I.j(rzxVar, z);
    }

    @Override // defpackage.rzx
    /* renamed from: localToScreen-MK-Hz9U */
    public final long mo43localToScreenMKHz9U(long j) {
        return this.a.I.mo43localToScreenMKHz9U(wu60.f(0L, b()));
    }

    @Override // defpackage.rzx
    public final long m(long j) {
        return this.a.I.m(wu60.f(j, b()));
    }

    @Override // defpackage.rzx
    public final rzx q() {
        noz Z0;
        if (!d()) {
            ixv.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        s sVar = ((s) this.a.I.I.a0.e).K;
        if (sVar == null || (Z0 = sVar.Z0()) == null) {
            return null;
        }
        return Z0.L;
    }

    @Override // defpackage.rzx
    /* renamed from: screenToLocal-MK-Hz9U */
    public final long mo44screenToLocalMKHz9U(long j) {
        return wu60.f(this.a.I.mo44screenToLocalMKHz9U(j), b());
    }

    @Override // defpackage.rzx
    public final long v(long j) {
        return this.a.I.v(wu60.f(j, b()));
    }
}
