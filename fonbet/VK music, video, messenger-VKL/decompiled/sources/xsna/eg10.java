package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import ru.ok.gl.tf.Tensorflow;
import xsna.yk8;

/* compiled from: MarqueeText.kt */
/* loaded from: classes3.dex */
public final class eg10 {
    public static final void a(final us2 us2Var, final long j, final q630 q630Var, long j2, final long j3, long j4, long j5, int i, boolean z, Map map, frv0 frv0Var, float f, int i2, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        Map map2;
        int i5;
        androidx.compose.runtime.a aVar2;
        final long j6;
        final long j7;
        final long j8;
        final int i6;
        final boolean z2;
        final frv0 frv0Var2;
        final float f2;
        final int i7;
        final Map map3;
        long j9;
        Map map4;
        frv0 frv0Var3;
        int i8;
        final float f3;
        int i9;
        int i10;
        boolean z3;
        long j10;
        boolean z4;
        boolean z5;
        long j11;
        int i11;
        int i12;
        androidx.compose.runtime.a M = aVar.M(-299530603);
        int i13 = i3 | (M.J(us2Var) ? 4 : 2) | (M.p(j) ? 32 : 16) | 920325120;
        int i14 = i4 & 32768;
        if (i14 != 0) {
            i5 = 224662;
            map2 = map;
        } else {
            map2 = map;
            i5 = (M.y(map2) ? 131072 : 65536) | 28054;
        }
        int i15 = i5 | 113770496;
        if (M.t(i13 & 1, ((306783379 & i13) == 306783378 && (38347923 & i15) == 38347922) ? false : true)) {
            M.V();
            if ((i3 & 1) == 0 || M.i()) {
                j9 = l5g.k;
                long j12 = fno0.c;
                map4 = i14 != 0 ? jgp.b : map2;
                frv0Var3 = (frv0) M.r(grv0.a);
                i8 = i15 & (-3670129);
                f3 = 32;
                i9 = 1200;
                i10 = 1;
                z3 = true;
                j10 = j12;
                z4 = false;
                z5 = true;
                j11 = j10;
            } else {
                M.h();
                int i16 = i15 & (-3670129);
                j9 = j2;
                j10 = j4;
                frv0Var3 = frv0Var;
                f3 = f;
                i9 = i2;
                i8 = i16;
                map4 = map2;
                z4 = false;
                z5 = true;
                j11 = j5;
                i10 = i;
                z3 = z;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-299530603, i13, i8, "com.vk.music.stickyplayer.presentation.components.MarqueeText (MarqueeText.kt:115)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                i11 = i13;
                i12 = i10;
                x = androidx.compose.runtime.k.b(new q9x(0L));
                M.R(x);
            } else {
                i11 = i13;
                i12 = i10;
            }
            final wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new tcu(9);
                M.R(x2);
            }
            q630 a = rdu.a(q630Var, (izs) x2);
            int i17 = i8;
            if ((i11 & 112) == 32) {
                z4 = z5;
            }
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new izs() { // from class: xsna.ag10
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        ggj ggjVar = (ggj) obj;
                        ggjVar.s1();
                        if (((int) (((q9x) wh50Var.getValue()).a >> 32)) > ((int) (j >> 32))) {
                            float f4 = f3;
                            eg10.c(ggjVar, true, f4);
                            eg10.c(ggjVar, false, f4);
                        }
                        return s3q0.a;
                    }
                };
                M.R(x3);
            }
            q630 f4 = bu00.f(a, (izs) x3);
            int i18 = i9;
            q630 f5 = jgz.f(f4, i18);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new x26(1, wh50Var);
                M.R(x4);
            }
            aVar2 = M;
            float f6 = f3;
            long j13 = j9;
            int i19 = i12;
            boolean z6 = z3;
            yqv0.b(us2Var, txj0.f(sv1.z(f5, (izs) x4), 1.0f), j13, j3, j10, j11, i19, z6, 1, null, map4, frv0Var3, aVar2, (i11 & 14) | 920350080, 224304 | (29360128 & (i17 << 6)), 69632);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = f6;
            j6 = j13;
            j7 = j10;
            j8 = j11;
            i6 = i19;
            z2 = z6;
            map3 = map4;
            frv0Var2 = frv0Var3;
            i7 = i18;
        } else {
            aVar2 = M;
            aVar2.h();
            j6 = j2;
            j7 = j4;
            j8 = j5;
            i6 = i;
            z2 = z;
            frv0Var2 = frv0Var;
            f2 = f;
            i7 = i2;
            map3 = map2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(j, q630Var, j6, j3, j7, j8, i6, z2, map3, frv0Var2, f2, i7, i3, i4) { // from class: xsna.bg10
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ int i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ Map k;
                public final /* synthetic */ frv0 l;
                public final /* synthetic */ float m;
                public final /* synthetic */ int n;
                public final /* synthetic */ int o;

                {
                    this.o = i4;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(24961);
                    eg10.a(us2.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (androidx.compose.runtime.a) obj, I, this.o);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final long j, q630 q630Var, final long j2, int i, int i2, boolean z, int i3, final frv0 frv0Var, float f, int i4, androidx.compose.runtime.a aVar, final int i5, final int i6) {
        final int i7;
        int i8;
        int i9;
        int i10;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final int i11;
        final boolean z2;
        final int i12;
        final float f2;
        final int i13;
        androidx.compose.runtime.f s;
        final float f3;
        int i14;
        int i15;
        boolean z3;
        int i16;
        androidx.compose.runtime.a M = aVar.M(1753029239);
        int i17 = (M.J(str) ? 4 : 2) | i5 | (M.p(j) ? 32 : 16);
        if ((i5 & 3072) == 0) {
            i17 |= M.p(j2) ? 2048 : 1024;
        }
        int i18 = i17 | 221184;
        if ((i6 & 64) == 0) {
            i7 = i;
            if (M.o(i7)) {
                i8 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                i9 = i18 | i8 | 918552576;
                i10 = (M.J(frv0Var) ? 4 : 2) | Tensorflow.FRAME_WIDTH;
                if (M.t(i9 & 1, (306783379 & i9) == 306783378 || (i10 & 147) != 146)) {
                    q630Var2 = q630Var;
                    aVar2 = M;
                    aVar2.h();
                    i11 = i2;
                    z2 = z;
                    i12 = i3;
                    f2 = f;
                    i13 = i4;
                } else {
                    M.V();
                    if ((i5 & 1) == 0 || M.i()) {
                        if ((i6 & 64) != 0) {
                            i9 &= -3670017;
                            i7 = 0;
                        }
                        f3 = 32;
                        i14 = 1200;
                        i15 = 1;
                        z3 = true;
                        i16 = 1;
                    } else {
                        M.h();
                        if ((i6 & 64) != 0) {
                            i9 &= -3670017;
                        }
                        i15 = i2;
                        z3 = z;
                        i16 = i3;
                        f3 = f;
                        i14 = i4;
                    }
                    int i19 = i7;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1753029239, i9, i10, "com.vk.music.stickyplayer.presentation.components.MarqueeText (MarqueeText.kt:56)");
                    }
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(new q9x(0L));
                        M.R(x);
                    }
                    final wh50 wh50Var = (wh50) x;
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new xmz(3);
                        M.R(x2);
                    }
                    q630Var2 = q630Var;
                    q630 a = rdu.a(q630Var2, (izs) x2);
                    int i20 = i9;
                    boolean z4 = (i20 & 112) == 32;
                    Object x3 = M.x();
                    if (z4 || x3 == c0012a) {
                        x3 = new izs() { // from class: xsna.cg10
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                ggj ggjVar = (ggj) obj;
                                ggjVar.s1();
                                if (((int) (((q9x) wh50Var.getValue()).a >> 32)) > ((int) (j >> 32))) {
                                    float f4 = f3;
                                    eg10.c(ggjVar, true, f4);
                                    eg10.c(ggjVar, false, f4);
                                }
                                return s3q0.a;
                            }
                        };
                        M.R(x3);
                    }
                    q630 f4 = jgz.f(bu00.f(a, (izs) x3), i14);
                    Object x4 = M.x();
                    if (x4 == c0012a) {
                        x4 = new f0z(wh50Var, 5);
                        M.R(x4);
                    }
                    aVar2 = M;
                    yqv0.c(str, txj0.f(sv1.z(f4, (izs) x4), 1.0f), j2, null, null, 0, i19, null, i15, z3, i16, 1, null, frv0Var, aVar2, (i20 & 14) | ((i20 >> 3) & 896) | 27648 | (i20 & 3670016) | 905969664, 54 | ((i10 << 9) & 7168), 4256);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    i13 = i14;
                    i7 = i19;
                    i11 = i15;
                    z2 = z3;
                    i12 = i16;
                    f2 = f3;
                }
                s = aVar2.s();
                if (s == null) {
                    final q630 q630Var3 = q630Var2;
                    s.d = new wzs() { // from class: xsna.dg10
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i5 | 1);
                            eg10.b(str, j, q630Var3, j2, i7, i11, z2, i12, frv0Var, f2, i13, (androidx.compose.runtime.a) obj, I, i6);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            i7 = i;
        }
        i8 = 524288;
        i9 = i18 | i8 | 918552576;
        i10 = (M.J(frv0Var) ? 4 : 2) | Tensorflow.FRAME_WIDTH;
        if (M.t(i9 & 1, (306783379 & i9) == 306783378 || (i10 & 147) != 146)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void c(ggj ggjVar, boolean z, float f) {
        float I0 = ggjVar.I0(f);
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        long floatToRawIntBits = (Float.floatToRawIntBits(z ? 0.0f : Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - I0) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(I0) << 32);
        List l = e43.l(new l5g(l5g.j), new l5g(l5g.b));
        if (!z) {
            f2 = Float.intBitsToFloat((int) (ggjVar.d() >> 32));
        }
        if (!z) {
            I0 = Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - I0;
        }
        oio.x1(ggjVar, yk8.a.a(l, f2, I0, 8), floatToRawIntBits, floatToRawIntBits2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 6, 56);
    }
}
