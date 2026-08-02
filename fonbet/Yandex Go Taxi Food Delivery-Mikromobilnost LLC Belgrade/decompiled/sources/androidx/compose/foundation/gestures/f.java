package androidx.compose.foundation.gestures;

import defpackage.e530;
import defpackage.fud;
import defpackage.ga10;
import defpackage.gge;
import defpackage.hge;
import defpackage.hkp0;
import defpackage.jl40;
import defpackage.k6w;
import defpackage.lxv;
import defpackage.npb1;
import defpackage.ok6;
import defpackage.rzo;
import defpackage.tje;
import defpackage.uk6;
import defpackage.vk6;
import defpackage.w511;
import defpackage.wz40;
import defpackage.yk6;
import defpackage.zii0;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class f extends e530 implements fud, ga10 {
    public boolean B;
    public Orientation a;
    public final y b;
    public boolean c;
    public vk6 w;
    public final hkp0 x;
    public boolean z;
    public final ok6 y = new ok6();
    public long A = -1;

    public f(Orientation orientation, y yVar, boolean z, vk6 vk6Var, hkp0 hkp0Var) {
        this.a = orientation;
        this.b = yVar;
        this.c = z;
        this.w = vk6Var;
        this.x = hkp0Var;
    }

    public static final float E0(f fVar, vk6 vk6Var, long j) {
        char c;
        float f;
        long j2;
        zii0 zii0Var;
        int compare;
        long j3 = fVar.A;
        wz40 wz40Var = fVar.y.a;
        int i = wz40Var.c - 1;
        Object[] objArr = wz40Var.a;
        if (i < objArr.length) {
            zii0Var = null;
            while (true) {
                if (i < 0) {
                    c = HexString.CHAR_SPACE;
                    f = 0.0f;
                    j2 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                    break;
                }
                zii0 zii0Var2 = (zii0) ((gge) objArr[i]).a.invoke();
                if (zii0Var2 != null) {
                    long d = zii0Var2.d();
                    long a0 = rzo.a0(fVar.F0());
                    f = 0.0f;
                    int i2 = hge.a[fVar.a.ordinal()];
                    if (i2 == 1) {
                        c = HexString.CHAR_SPACE;
                        j2 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        compare = Float.compare(Float.intBitsToFloat((int) (d & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (a0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                    } else {
                        if (i2 != 2) {
                            w511.b();
                            return 0.0f;
                        }
                        c = HexString.CHAR_SPACE;
                        j2 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        compare = Float.compare(Float.intBitsToFloat((int) (d >> 32)), Float.intBitsToFloat((int) (a0 >> 32)));
                    }
                    if (compare <= 0) {
                        zii0Var = zii0Var2;
                    } else if (zii0Var == null) {
                        zii0Var = zii0Var2;
                    }
                }
                i--;
            }
        } else {
            c = HexString.CHAR_SPACE;
            f = 0.0f;
            j2 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            zii0Var = null;
        }
        if (zii0Var == null) {
            zii0 zii0Var3 = fVar.z ? (zii0) fVar.x.invoke() : null;
            if (zii0Var3 == null) {
                return f;
            }
            zii0Var = zii0Var3;
        }
        long a02 = rzo.a0(j3);
        int i3 = hge.a[fVar.a.ordinal()];
        if (i3 == 1) {
            float f2 = zii0Var.b;
            return vk6Var.a(f2 - ((int) (j & j2)), zii0Var.d - f2, Float.intBitsToFloat((int) (a02 & j2)));
        }
        if (i3 == 2) {
            float f3 = zii0Var.a;
            return vk6Var.a(f3 - ((int) (j >> c)), zii0Var.c - f3, Float.intBitsToFloat((int) (a02 >> c)));
        }
        w511.b();
        return f;
    }

    public static boolean G0(f fVar, zii0 zii0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = fVar.F0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long I0 = fVar.I0(zii0Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (I0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (I0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) <= 0.5f;
    }

    public final long F0() {
        long j = this.A;
        if (k6w.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void H0(long j) {
        vk6 vk6Var = this.w;
        if (vk6Var == null) {
            vk6Var = (vk6) npb1.c(this, yk6.a);
        }
        vk6 vk6Var2 = vk6Var;
        if (this.B) {
            lxv.c("launchAnimation called when previous animation was running");
        }
        vk6 vk6Var3 = this.w;
        if (vk6Var3 == null) {
            vk6Var3 = (vk6) npb1.c(this, yk6.a);
        }
        vk6Var3.getClass();
        vk6.a.getClass();
        tje.N(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, new b0(uk6.b), vk6Var2, j, null), 1);
    }

    public final long I0(zii0 zii0Var, long j, long j2) {
        long a0 = rzo.a0(j);
        int i = hge.a[this.a.ordinal()];
        if (i == 1) {
            vk6 vk6Var = this.w;
            if (vk6Var == null) {
                vk6Var = (vk6) npb1.c(this, yk6.a);
            }
            float f = zii0Var.b;
            float a = vk6Var.a(f - ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), zii0Var.d - f, Float.intBitsToFloat((int) (a0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        if (i != 2) {
            w511.b();
            return 0L;
        }
        vk6 vk6Var2 = this.w;
        if (vk6Var2 == null) {
            vk6Var2 = (vk6) npb1.c(this, yk6.a);
        }
        float f2 = zii0Var.a;
        return (Float.floatToRawIntBits(vk6Var2.a(f2 - ((int) (j2 >> 32)), zii0Var.c - f2, Float.intBitsToFloat((int) (a0 >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    @Override // defpackage.ga10
    public final void a(long j) {
        int q;
        long F0 = F0();
        this.A = j;
        int i = hge.a[this.a.ordinal()];
        if (i == 1) {
            q = jl40.q((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (int) (F0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            q = jl40.q((int) (j >> 32), (int) (F0 >> 32));
        }
        if (q >= 0) {
            return;
        }
        long j2 = !this.c ? this.a == Orientation.Vertical ? (((int) (F0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : (((int) (F0 >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        zii0 zii0Var = (zii0) this.x.invoke();
        if (zii0Var == null || this.B || this.z || !G0(this, zii0Var, F0, 0L, 2) || G0(this, zii0Var, 0L, j2, 1)) {
            return;
        }
        this.z = true;
        H0(j2);
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }
}
