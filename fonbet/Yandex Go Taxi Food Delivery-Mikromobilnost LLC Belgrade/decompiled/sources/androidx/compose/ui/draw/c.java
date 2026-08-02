package androidx.compose.ui.draw;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import defpackage.aa10;
import defpackage.c1y;
import defpackage.cjs0;
import defpackage.cot;
import defpackage.e530;
import defpackage.jt1;
import defpackage.k28;
import defpackage.n8e;
import defpackage.nhe;
import defpackage.p8e;
import defpackage.pa90;
import defpackage.pam;
import defpackage.sb2;
import defpackage.tls;
import defpackage.v0y;
import defpackage.wec;
import defpackage.x910;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class c extends e530 implements v0y, pam {
    public pa90 a;
    public boolean b;
    public jt1 c;
    public nhe w;
    public float x;
    public wec y;

    public static boolean F0(long j) {
        return !cjs0.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean G0(long j) {
        return !cjs0.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean E0() {
        return this.b && this.a.i() != 9205357640488583168L;
    }

    public final long H0(long j) {
        boolean z = false;
        boolean z2 = n8e.e(j) && n8e.d(j);
        if (n8e.g(j) && n8e.f(j)) {
            z = true;
        }
        if ((!E0() && z2) || z) {
            return n8e.b(n8e.i(j), j, 0, n8e.h(j), 0, 10);
        }
        long i = this.a.i();
        int round = G0(i) ? Math.round(Float.intBitsToFloat((int) (i >> 32))) : n8e.k(j);
        int round2 = F0(i) ? Math.round(Float.intBitsToFloat((int) (i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) : n8e.j(j);
        int g = p8e.g(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(p8e.f(round2, j)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(g) << 32);
        if (E0()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!G0(this.a.i()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.a.i() >> 32))) << 32) | (Float.floatToRawIntBits(!F0(this.a.i()) ? Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) : Float.intBitsToFloat((int) (this.a.i() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == 0.0f) ? 0L : sb2.J(floatToRawIntBits2, this.w.j(floatToRawIntBits2, floatToRawIntBits));
        }
        return n8e.b(p8e.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), j, 0, p8e.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))), j), 0, 10);
    }

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (!E0()) {
            return x910Var.k0(i);
        }
        long H0 = H0(p8e.b(0, 0, 0, i, 7));
        return Math.max(n8e.k(H0), x910Var.k0(i));
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (!E0()) {
            return x910Var.e0(i);
        }
        long H0 = H0(p8e.b(0, 0, 0, i, 7));
        return Math.max(n8e.k(H0), x910Var.e0(i));
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        k28 k28Var = c1yVar.a;
        long i = this.a.i();
        long floatToRawIntBits = (Float.floatToRawIntBits(G0(i) ? Float.intBitsToFloat((int) (i >> 32)) : Float.intBitsToFloat((int) (k28Var.c() >> 32))) << 32) | (Float.floatToRawIntBits(F0(i) ? Float.intBitsToFloat((int) (i & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) : Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        long J = (Float.intBitsToFloat((int) (k28Var.c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == 0.0f) ? 0L : sb2.J(floatToRawIntBits, this.w.j(floatToRawIntBits, k28Var.c()));
        long a = this.c.a((Math.round(Float.intBitsToFloat((int) (J >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (J & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Math.round(Float.intBitsToFloat((int) (k28Var.c() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), c1yVar.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        ((cot) k28Var.b.a).n(f, f2);
        try {
            this.a.g(c1yVar, J, this.x, this.y);
            ((cot) k28Var.b.a).n(-f, -f2);
            c1yVar.a();
        } catch (Throwable th) {
            ((cot) k28Var.b.a).n(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        final o l0 = x910Var.l0(H0(j));
        return kVar.w(l0.a, l0.b, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a.o((o.a) obj, o.this, 0, 0);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (!E0()) {
            return x910Var.V(i);
        }
        long H0 = H0(p8e.b(0, i, 0, 0, 13));
        return Math.max(n8e.j(H0), x910Var.V(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.x + ", colorFilter=" + this.y + ')';
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (!E0()) {
            return x910Var.y(i);
        }
        long H0 = H0(p8e.b(0, i, 0, 0, 13));
        return Math.max(n8e.j(H0), x910Var.y(i));
    }
}
