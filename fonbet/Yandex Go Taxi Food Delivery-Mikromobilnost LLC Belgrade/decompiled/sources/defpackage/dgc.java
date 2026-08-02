package defpackage;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;

/* loaded from: classes.dex */
public abstract class dgc {
    public static final a7u0 a = new a7u0(new y99(29));
    public static final a7u0 b = new a7u0(new bgc(0));

    public static final long a(agc agcVar, long j) {
        long j2 = agcVar.a;
        long j3 = agcVar.U;
        long j4 = agcVar.Q;
        long j5 = agcVar.M;
        long j6 = agcVar.q;
        if (ldc.c(j, j2)) {
            return agcVar.b;
        }
        if (ldc.c(j, agcVar.f)) {
            return agcVar.g;
        }
        if (ldc.c(j, agcVar.j)) {
            return agcVar.k;
        }
        if (ldc.c(j, agcVar.n)) {
            return agcVar.o;
        }
        if (ldc.c(j, agcVar.w)) {
            return agcVar.x;
        }
        if (ldc.c(j, agcVar.c)) {
            return agcVar.d;
        }
        if (ldc.c(j, agcVar.h)) {
            return agcVar.i;
        }
        if (ldc.c(j, agcVar.l)) {
            return agcVar.m;
        }
        if (ldc.c(j, agcVar.y)) {
            return agcVar.z;
        }
        if (ldc.c(j, agcVar.u)) {
            return agcVar.v;
        }
        if (ldc.c(j, agcVar.p)) {
            return j6;
        }
        if (ldc.c(j, agcVar.r)) {
            return agcVar.s;
        }
        if (ldc.c(j, agcVar.D) || ldc.c(j, agcVar.F) || ldc.c(j, agcVar.G) || ldc.c(j, agcVar.H) || ldc.c(j, agcVar.I) || ldc.c(j, agcVar.J) || ldc.c(j, agcVar.E)) {
            return j6;
        }
        if (ldc.c(j, agcVar.K) || ldc.c(j, agcVar.L)) {
            return j5;
        }
        if (ldc.c(j, agcVar.O) || ldc.c(j, agcVar.P)) {
            return j4;
        }
        if (ldc.c(j, agcVar.S) || ldc.c(j, agcVar.T)) {
            return j3;
        }
        int i = ldc.n;
        return ldc.m;
    }

    public static final long b(long j, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(89373914);
        long a2 = a((agc) btsVar.m(a), j);
        if (a2 == 16) {
            a2 = ((ldc) btsVar.m(bfe.a())).a;
        }
        btsVar.t(false);
        return a2;
    }

    public static final long c(agc agcVar, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (cgc.a[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return agcVar.n;
            case 2:
                return agcVar.w;
            case 3:
                return agcVar.y;
            case 4:
                return agcVar.v;
            case 5:
                return agcVar.e;
            case 6:
                return agcVar.u;
            case 7:
                return agcVar.o;
            case 8:
                return agcVar.x;
            case 9:
                return agcVar.z;
            case 10:
                return agcVar.b;
            case 11:
                return agcVar.d;
            case 12:
                return agcVar.g;
            case 13:
                return agcVar.i;
            case 14:
                return agcVar.q;
            case 15:
                return agcVar.s;
            case 16:
                return agcVar.t;
            case 17:
                return agcVar.k;
            case 18:
                return agcVar.m;
            case 19:
                return agcVar.A;
            case 20:
                return agcVar.B;
            case 21:
                return agcVar.a;
            case 22:
                return agcVar.c;
            case 23:
                return agcVar.C;
            case 24:
                return agcVar.f;
            case 25:
                return agcVar.h;
            case 26:
                return agcVar.p;
            case 27:
                return agcVar.r;
            case 28:
                return agcVar.D;
            case 29:
                return agcVar.F;
            case 30:
                return agcVar.G;
            case 31:
                return agcVar.H;
            case 32:
                return agcVar.I;
            case 33:
                return agcVar.J;
            case 34:
                return agcVar.E;
            case 35:
                return agcVar.j;
            case 36:
                return agcVar.l;
            case 37:
                return agcVar.K;
            case 38:
                return agcVar.L;
            case 39:
                return agcVar.M;
            case 40:
                return agcVar.N;
            case 41:
                return agcVar.O;
            case 42:
                return agcVar.P;
            case 43:
                return agcVar.Q;
            case 44:
                return agcVar.R;
            case 45:
                return agcVar.S;
            case 46:
                return agcVar.T;
            case 47:
                return agcVar.U;
            case 48:
                return agcVar.V;
            default:
                w511.b();
                return 0L;
        }
    }

    public static final long d(ColorSchemeKeyTokens colorSchemeKeyTokens, fid fidVar) {
        return c((agc) ((bts) fidVar).m(a), colorSchemeKeyTokens);
    }

    public static agc e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, int i, int i2) {
        long j36 = (i & 1) != 0 ? nfc.z : j;
        return new agc(j36, (i & 2) != 0 ? nfc.j : j2, (i & 4) != 0 ? nfc.A : j3, (i & 8) != 0 ? nfc.k : j4, (i & 16) != 0 ? nfc.e : j5, (i & 32) != 0 ? nfc.E : j6, (i & 64) != 0 ? nfc.n : j7, (i & 128) != 0 ? nfc.F : j8, (i & 256) != 0 ? nfc.o : j9, (i & 512) != 0 ? nfc.R : j10, (i & 1024) != 0 ? nfc.t : j11, (i & 2048) != 0 ? nfc.S : j12, (i & 4096) != 0 ? nfc.u : j13, (i & 8192) != 0 ? nfc.a : j14, (i & 16384) != 0 ? nfc.g : j15, (32768 & i) != 0 ? nfc.I : j16, (65536 & i) != 0 ? nfc.r : j17, (131072 & i) != 0 ? nfc.Q : j18, (262144 & i) != 0 ? nfc.s : j19, j36, (1048576 & i) != 0 ? nfc.f : j20, (2097152 & i) != 0 ? nfc.d : j21, (4194304 & i) != 0 ? nfc.b : j22, (8388608 & i) != 0 ? nfc.h : j23, (16777216 & i) != 0 ? nfc.c : j24, (33554432 & i) != 0 ? nfc.i : j25, (67108864 & i) != 0 ? nfc.x : j26, (134217728 & i) != 0 ? nfc.y : j27, (268435456 & i) != 0 ? nfc.D : j28, (536870912 & i) != 0 ? nfc.J : j29, (i2 & 8) != 0 ? nfc.P : j35, (1073741824 & i) != 0 ? nfc.K : j30, (i & Integer.MIN_VALUE) != 0 ? nfc.L : j31, (i2 & 1) != 0 ? nfc.M : j32, (i2 & 2) != 0 ? nfc.N : j33, (i2 & 4) != 0 ? nfc.O : j34, nfc.B, nfc.C, nfc.l, nfc.m, nfc.G, nfc.H, nfc.p, nfc.q, nfc.T, nfc.U, nfc.v, nfc.w);
    }
}
