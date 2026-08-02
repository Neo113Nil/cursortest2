package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.er9;
import xsna.q630;
import xsna.yk8;

/* compiled from: VkFadeText.kt */
/* loaded from: classes17.dex */
public final class ntu0 {

    /* compiled from: VkFadeText.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final us2 us2Var, final wjo0 wjo0Var, final azl azlVar, final wh50 wh50Var, final q630 q630Var, final frv0 frv0Var, final long j, final int i, final boolean z, final boolean z2, final pco pcoVar, final int i2, final Map map, final izs izsVar, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        wjo0 wjo0Var2;
        azl azlVar2;
        wh50 wh50Var2;
        int i6;
        androidx.compose.runtime.a M = aVar.M(-2074169721);
        if ((i3 & 6) == 0) {
            i5 = (M.J(us2Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            wjo0Var2 = wjo0Var;
            i5 |= M.J(wjo0Var2) ? 32 : 16;
        } else {
            wjo0Var2 = wjo0Var;
        }
        if ((i3 & 384) == 0) {
            azlVar2 = azlVar;
            i5 |= M.J(azlVar2) ? 256 : 128;
        } else {
            azlVar2 = azlVar;
        }
        if ((i3 & 3072) == 0) {
            wh50Var2 = wh50Var;
            i5 |= M.J(wh50Var2) ? 2048 : 1024;
        } else {
            wh50Var2 = wh50Var;
        }
        if ((i3 & 24576) == 0) {
            i5 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= M.J(frv0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= M.p(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= M.o(i) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= M.l(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= M.l(z2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (M.J(pcoVar) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= M.o(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= M.y(map) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i7 = i6;
        if (M.t(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            M.V();
            if ((i3 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2074169721, i5, i7, "com.vk.core.compose.component.MultilineFadeToEdge (VkFadeText.kt:165)");
            }
            final wjo0 wjo0Var3 = wjo0Var2;
            final azl azlVar3 = azlVar2;
            final wh50 wh50Var3 = wh50Var2;
            ua8.a(q630Var, null, false, kai.c(-1979093283, new yzs() { // from class: xsna.ltu0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1979093283, intValue, -1, "com.vk.core.compose.component.MultilineFadeToEdge.<anonymous> (VkFadeText.kt:167)");
                        }
                        int I0 = (int) azl.this.I0(va8Var.j());
                        us2 us2Var2 = us2Var;
                        boolean J = aVar2.J(us2Var2) | aVar2.o(I0);
                        frv0 frv0Var2 = frv0Var;
                        boolean J2 = J | aVar2.J(frv0Var2);
                        int i8 = i;
                        boolean o = J2 | aVar2.o(i8);
                        Object x = aVar2.x();
                        Object obj4 = a.C0011a.a;
                        if (o || x == obj4) {
                            x = wjo0.b(wjo0Var3, ws2.d(us2Var2, null), frv0Var2.a, 1, true, i8, s6j.b(0, I0, 0, 0, 13), null, null, null, 1952);
                            aVar2.R(x);
                        }
                        ljo0 ljo0Var = (ljo0) x;
                        int i9 = ljo0Var.b.f;
                        q630.a aVar3 = q630.a.a;
                        long j2 = j;
                        int i10 = i2;
                        izs izsVar2 = izsVar;
                        wh50 wh50Var4 = wh50Var3;
                        Map map2 = map;
                        if (i9 < i8 || !ljo0Var.e()) {
                            aVar2.K(2143658445);
                            boolean J3 = aVar2.J(izsVar2) | aVar2.J(wh50Var4);
                            Object x2 = aVar2.x();
                            if (J3 || x2 == obj4) {
                                x2 = new prd0(9, izsVar2, wh50Var4);
                                aVar2.R(x2);
                            }
                            yqv0.d(us2Var2, aVar3, j2, i10, null, 0, false, i8, (izs) x2, map2, frv0Var2, aVar2, 48, 0, 952);
                            aVar2.j();
                        } else {
                            aVar2.K(2144105062);
                            ntu0.b(us2Var2, ljo0Var, i8, z, z2, wh50Var4, aVar3, frv0Var2, j2, pcoVar, i10, map2, izsVar2, aVar2, 1572928);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i5 >> 12) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mtu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i3 | 1);
                    int I2 = ne7.I(i4);
                    ntu0.a(us2.this, wjo0Var, azlVar, wh50Var, q630Var, frv0Var, j, i, z, z2, pcoVar, i2, map, izsVar, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final us2 us2Var, final ljo0 ljo0Var, final int i, final boolean z, final boolean z2, final wh50 wh50Var, final q630 q630Var, final frv0 frv0Var, final long j, final pco pcoVar, final int i2, final Map map, final izs izsVar, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-239893006);
        int i4 = i3 | (M.J(us2Var) ? 4 : 2) | (M.y(ljo0Var) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192) | (M.J(wh50Var) ? 131072 : 65536) | (M.J(frv0Var) ? 8388608 : 4194304) | (M.p(j) ? 67108864 : 33554432) | (M.J(pcoVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i5 = (M.o(i2) ? 4 : 2) | (M.y(map) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            M.V();
            if ((i3 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-239893006, i4, i5, "com.vk.core.compose.component.SplitFadeText (VkFadeText.kt:232)");
            }
            int c = ljo0Var.b.c(i - 2, true);
            String str = us2Var.subSequence(0, c).c;
            String str2 = us2Var.subSequence(c, us2Var.c.length()).c;
            izsVar.invoke(ljo0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            final wh50 wh50Var2 = (wh50) x;
            final azl azlVar = (azl) M.r(uvi.h);
            final LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
            int i6 = i4 >> 18;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            us2 e = ws2.e(str);
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            int i7 = i - 1;
            boolean z3 = (i4 & 458752) == 131072;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new ftu0(wh50Var, 0);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            int i8 = i6 & 896;
            int i9 = (i5 << 18) & 3670016;
            int i10 = 100663344 | i8 | i9;
            int i11 = (i5 << 3) & 896;
            int i12 = (i4 >> 12) & 7168;
            yqv0.d(e, f, j, i2, null, 1, false, i7, izsVar2, map, frv0Var, M, i10, i11 | i12, 696);
            us2 e2 = ws2.e(drm0.t0(str2).toString());
            q630 e3 = bu00.e(rdu.a(txj0.f(aVar4, 1.0f), new awm0(9)), new izs() { // from class: xsna.htu0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    final wh50 wh50Var3 = wh50.this;
                    final boolean z4 = z2;
                    final LayoutDirection layoutDirection2 = layoutDirection;
                    final boolean z5 = z;
                    final azl azlVar2 = azlVar;
                    final pco pcoVar2 = pcoVar;
                    return ((kw8) obj).e(new izs() { // from class: xsna.etu0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            ggj ggjVar = (ggj) obj2;
                            ggjVar.s1();
                            ljo0 ljo0Var2 = (ljo0) wh50.this.getValue();
                            if (ljo0Var2 == null) {
                                return s3q0.a;
                            }
                            int e4 = ntu0.e(ljo0Var2, 1);
                            if (e4 < 0) {
                                return s3q0.a;
                            }
                            if (z4) {
                                LayoutDirection layoutDirection3 = layoutDirection2;
                                if (ntu0.g(ljo0Var2, e4, 1, layoutDirection3, z5)) {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (ggjVar.d() >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L));
                                    er9.b a0 = ggjVar.a0();
                                    long d = a0.d();
                                    a0.a().e();
                                    try {
                                        a0.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2, 1);
                                        ggjVar.s1();
                                        a0.a().a();
                                        a0.h(d);
                                        ntu0.d(ggjVar, ljo0Var2, e4, layoutDirection3, ntu0.f(Float.intBitsToFloat((int) (ggjVar.d() >> 32)), azlVar2, pcoVar2), Float.valueOf(Float.intBitsToFloat((int) (ggjVar.d() >> 32))));
                                    } catch (Throwable th) {
                                        nq.b(a0, d);
                                        throw th;
                                    }
                                }
                            }
                            return s3q0.a;
                        }
                    });
                }
            });
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new m2l0(wh50Var2, 22);
                M.R(x3);
            }
            aVar2 = M;
            yqv0.d(e2, e3, j, i2, null, 1, false, 1, (izs) x3, map, frv0Var, aVar2, i8 | 905969664 | i9, i11 | 54 | i12, 184);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(ljo0Var, i, z, z2, wh50Var, q630Var, frv0Var, j, pcoVar, i2, map, izsVar, i3) { // from class: xsna.gtu0
                public final /* synthetic */ ljo0 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ wh50 g;
                public final /* synthetic */ q630 h;
                public final /* synthetic */ frv0 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ pco k;
                public final /* synthetic */ int l;
                public final /* synthetic */ Map m;
                public final /* synthetic */ izs n;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1572929);
                    ntu0.b(us2.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final us2 us2Var, q630 q630Var, frv0 frv0Var, long j, int i, boolean z, boolean z2, boolean z3, pco pcoVar, int i2, Map<String, r0x> map, int i3, izs<? super ljo0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i4, final int i5, final int i6) {
        int i7;
        q630 q630Var2;
        frv0 frv0Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        boolean z5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        androidx.compose.runtime.a aVar2;
        final long j2;
        final boolean z6;
        final int i24;
        final q630 q630Var3;
        final frv0 frv0Var3;
        final boolean z7;
        final boolean z8;
        final pco pcoVar2;
        final int i25;
        final Map<String, r0x> map2;
        final int i26;
        final izs<? super ljo0, s3q0> izsVar2;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        frv0 frv0Var4;
        long j3;
        int i27;
        int i28;
        izs<? super ljo0, s3q0> izsVar3;
        int i29;
        long j4;
        boolean z9;
        boolean z10;
        pco pcoVar3;
        Map<String, r0x> map3;
        int i30;
        int i31;
        frv0 frv0Var5;
        q630 q630Var5;
        int i32;
        izs<? super ljo0, s3q0> izsVar4;
        wh50 wh50Var;
        int i33;
        boolean z11;
        boolean z12;
        pco pcoVar4;
        long j5;
        int i34;
        int i35;
        androidx.compose.runtime.a M = aVar.M(642943383);
        if ((i4 & 6) == 0) {
            i7 = (M.J(us2Var) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i36 = i6 & 2;
        if (i36 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            q630Var2 = q630Var;
            i7 |= M.J(q630Var2) ? 32 : 16;
            if ((i4 & 384) != 0) {
                if ((i6 & 4) == 0) {
                    frv0Var2 = frv0Var;
                    if (M.J(frv0Var2)) {
                        i35 = 256;
                        i7 |= i35;
                    }
                } else {
                    frv0Var2 = frv0Var;
                }
                i35 = 128;
                i7 |= i35;
            } else {
                frv0Var2 = frv0Var;
            }
            if ((i4 & 3072) != 0) {
                i8 = i7 | (((i6 & 8) == 0 && M.p(j)) ? 2048 : 1024);
            } else {
                i8 = i7;
            }
            i9 = i8;
            i10 = i6 & 16;
            if (i10 == 0) {
                i9 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i11 = i;
                i9 |= M.o(i11) ? 16384 : 8192;
                i12 = i6 & 32;
                if (i12 != 0) {
                    i9 |= 196608;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i4 & 196608) == 0) {
                        i9 |= M.l(z4) ? 131072 : 65536;
                    }
                }
                i13 = i6 & 64;
                if (i13 != 0) {
                    i9 |= 1572864;
                    z5 = z2;
                } else {
                    z5 = z2;
                    if ((i4 & 1572864) == 0) {
                        i9 |= M.l(z5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                }
                i14 = i6 & 128;
                if (i14 != 0) {
                    i9 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i9 |= M.l(z3) ? 8388608 : 4194304;
                }
                i15 = i6 & 256;
                if (i15 != 0) {
                    i9 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i9 |= M.J(pcoVar) ? 67108864 : 33554432;
                }
                if ((i4 & 805306368) == 0) {
                    if ((i6 & 512) == 0 && M.o(i2)) {
                        i34 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                        i9 |= i34;
                    }
                    i34 = 268435456;
                    i9 |= i34;
                }
                i16 = i6 & 1024;
                if (i16 != 0) {
                    i18 = i5 | 6;
                    i17 = i16;
                } else {
                    i17 = i16;
                    i18 = i5 | (M.y(map) ? 4 : 2);
                }
                i19 = i6 & 2048;
                if (i19 != 0) {
                    i21 = i18 | 48;
                    i20 = i19;
                } else {
                    i20 = i19;
                    i21 = i18 | (M.o(i3) ? 32 : 16);
                }
                int i37 = i21;
                i22 = i6 & 4096;
                if (i22 != 0) {
                    i23 = i37 | 384;
                } else {
                    int i38 = i37;
                    if ((i5 & 384) == 0) {
                        i38 |= M.y(izsVar) ? 256 : 128;
                    }
                    i23 = i38;
                }
                if (M.t(i9 & 1, (i9 & 306783379) == 306783378 || (i23 & 147) != 146)) {
                    M.V();
                    int i39 = i4 & 1;
                    Object obj = a.C0011a.a;
                    if (i39 == 0 || M.i()) {
                        q630Var4 = i36 != 0 ? q630.a.a : q630Var2;
                        if ((i6 & 4) != 0) {
                            frv0Var4 = (frv0) M.r(grv0.a);
                            i9 &= -897;
                        } else {
                            frv0Var4 = frv0Var2;
                        }
                        if ((i6 & 8) != 0) {
                            j3 = ((l5g) M.r(yfj.a)).a;
                            i9 &= -7169;
                        } else {
                            j3 = j;
                        }
                        if (i10 != 0) {
                            i11 = Integer.MAX_VALUE;
                        }
                        if (i12 != 0) {
                            z4 = false;
                        }
                        if (i13 != 0) {
                            z5 = true;
                        }
                        z6 = i14 != 0 ? false : z3;
                        pco pcoVar5 = i15 != 0 ? null : pcoVar;
                        if ((i6 & 512) != 0) {
                            i27 = i9 & (-1879048193);
                            i28 = 0;
                        } else {
                            i27 = i9;
                            i28 = i2;
                        }
                        Map<String, r0x> map4 = i17 != 0 ? jgp.b : map;
                        int i40 = i20 != 0 ? 2 : i3;
                        if (i22 != 0) {
                            Object x = M.x();
                            if (x == obj) {
                                x = new n0m0(15);
                                M.R(x);
                            }
                            izsVar3 = (izs) x;
                        } else {
                            izsVar3 = izsVar;
                        }
                        i29 = i28;
                        i9 = i27;
                        j4 = j3;
                        z9 = z5;
                        z10 = z4;
                        pcoVar3 = pcoVar5;
                        map3 = map4;
                        i30 = i40;
                        i31 = 642943383;
                        frv0Var5 = frv0Var4;
                    } else {
                        M.h();
                        if ((i6 & 4) != 0) {
                            i9 &= -897;
                        }
                        if ((i6 & 8) != 0) {
                            i9 &= -7169;
                        }
                        if ((i6 & 512) != 0) {
                            i9 &= -1879048193;
                        }
                        j4 = j;
                        z6 = z3;
                        pcoVar3 = pcoVar;
                        i29 = i2;
                        map3 = map;
                        i30 = i3;
                        izsVar3 = izsVar;
                        q630Var4 = q630Var2;
                        frv0Var5 = frv0Var2;
                        z9 = z5;
                        z10 = z4;
                        i31 = 642943383;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(i31, i9, i23, "com.vk.core.compose.component.VkFadeText (VkFadeText.kt:60)");
                    }
                    final LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
                    Object x2 = M.x();
                    if (x2 == obj) {
                        x2 = androidx.compose.runtime.k.b(null);
                        M.R(x2);
                    }
                    final wh50 wh50Var2 = (wh50) x2;
                    final azl azlVar = (azl) M.r(uvi.h);
                    long j6 = j4;
                    int i41 = z9 ? 1 : i30;
                    if (!z6 || i11 <= 1) {
                        q630Var5 = q630Var4;
                        i32 = i29;
                        izsVar4 = izsVar3;
                        M.K(-1625961173);
                        Object x3 = M.x();
                        if (x3 == obj) {
                            x3 = new p6e0(22);
                            M.R(x3);
                        }
                        q630 a2 = rdu.a(q630Var5, (izs) x3);
                        boolean o = ((i9 & 57344) == 16384) | ((i9 & 3670016) == 1048576) | M.o(layoutDirection.ordinal()) | ((i9 & 458752) == 131072) | ((i9 & 29360128) == 8388608) | M.J(azlVar) | ((i9 & 234881024) == 67108864);
                        Object x4 = M.x();
                        if (o || x4 == obj) {
                            final boolean z13 = z6;
                            final int i42 = i11;
                            final boolean z14 = z10;
                            final boolean z15 = z9;
                            final pco pcoVar6 = pcoVar3;
                            x4 = new izs() { // from class: xsna.itu0
                                @Override // xsna.izs
                                public final Object invoke(Object obj2) {
                                    final wh50 wh50Var3 = wh50.this;
                                    final int i43 = i42;
                                    final boolean z16 = z15;
                                    final LayoutDirection layoutDirection2 = layoutDirection;
                                    final boolean z17 = z14;
                                    final boolean z18 = z13;
                                    final azl azlVar2 = azlVar;
                                    final pco pcoVar7 = pcoVar6;
                                    return ((kw8) obj2).e(new izs() { // from class: xsna.ktu0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.izs
                                        public final Object invoke(Object obj3) {
                                            long j7;
                                            ggj ggjVar = (ggj) obj3;
                                            ggjVar.s1();
                                            ljo0 ljo0Var = (ljo0) wh50.this.getValue();
                                            if (ljo0Var == null) {
                                                return s3q0.a;
                                            }
                                            int i44 = i43;
                                            int e = ntu0.e(ljo0Var, i44);
                                            if (e < 0) {
                                                return s3q0.a;
                                            }
                                            boolean z19 = z16;
                                            LayoutDirection layoutDirection3 = layoutDirection2;
                                            boolean z20 = z19 && ntu0.g(ljo0Var, e, i44, layoutDirection3, z17);
                                            boolean z21 = z18;
                                            azl azlVar3 = azlVar2;
                                            pco pcoVar8 = pcoVar7;
                                            if (z21 && z20) {
                                                float intBitsToFloat = Float.intBitsToFloat((int) (ggjVar.d() >> 32));
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L));
                                                er9.b a0 = ggjVar.a0();
                                                long d = a0.d();
                                                a0.a().e();
                                                try {
                                                    j7 = d;
                                                    try {
                                                        a0.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2, 1);
                                                        ggjVar.s1();
                                                        a0.a().a();
                                                        a0.h(j7);
                                                        ntu0.d(ggjVar, ljo0Var, e, layoutDirection3, ntu0.f(Float.intBitsToFloat((int) (ggjVar.d() >> 32)), azlVar3, pcoVar8), Float.valueOf(Float.intBitsToFloat((int) (ggjVar.d() >> 32))));
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        nq.b(a0, j7);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    j7 = d;
                                                }
                                            } else if (z20) {
                                                ntu0.d(ggjVar, ljo0Var, e, layoutDirection3, ntu0.f(Float.intBitsToFloat((int) (ggjVar.d() >> 32)), azlVar3, pcoVar8), null);
                                            }
                                            return s3q0.a;
                                        }
                                    });
                                }
                            };
                            wh50Var = wh50Var2;
                            i33 = i42;
                            z11 = z15;
                            z12 = z14;
                            pcoVar4 = pcoVar6;
                            M.R(x4);
                        } else {
                            i33 = i11;
                            wh50Var = wh50Var2;
                            z12 = z10;
                            z11 = z9;
                            pcoVar4 = pcoVar3;
                        }
                        q630 e = bu00.e(a2, (izs) x4);
                        boolean z16 = !z6;
                        boolean z17 = (i23 & 896) == 256;
                        Object x5 = M.x();
                        if (z17 || x5 == obj) {
                            x5 = new ab(24, izsVar4, wh50Var);
                            M.R(x5);
                        }
                        frv0 frv0Var6 = frv0Var5;
                        Map<String, r0x> map5 = map3;
                        yqv0.d(us2Var, e, j6, i32, null, i41, z16, i33, (izs) x5, map5, frv0Var6, M, (i9 & 14) | ((i9 >> 3) & 896) | ((i9 >> 9) & 3670016), ((i23 << 6) & 896) | ((i9 >> 12) & 14) | ((i9 << 3) & 7168), 184);
                        j5 = j6;
                        map3 = map5;
                        frv0Var5 = frv0Var6;
                        aVar2 = M;
                        aVar2.j();
                    } else {
                        M.K(-1626622155);
                        int i43 = i9 << 9;
                        q630 q630Var6 = q630Var4;
                        aVar2 = M;
                        i33 = i11;
                        a(us2Var, xjo0.a(0, 1, M), azlVar, wh50Var2, q630Var6, frv0Var5, j6, i33, z10, z9, pcoVar3, i29, map3, izsVar3, aVar2, (i9 & 14) | 3072 | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128) | (i43 & 234881024) | (i43 & 1879048192), ((i9 >> 24) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i23 << 6) & 896) | ((i23 << 3) & 7168));
                        q630Var5 = q630Var6;
                        j5 = j6;
                        i32 = i29;
                        aVar2.j();
                        z12 = z10;
                        z11 = z9;
                        pcoVar4 = pcoVar3;
                        izsVar4 = izsVar3;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var5;
                    pcoVar2 = pcoVar4;
                    z7 = z11;
                    z8 = z12;
                    j2 = j5;
                    i25 = i32;
                    frv0Var3 = frv0Var5;
                    map2 = map3;
                    i26 = i30;
                    izsVar2 = izsVar4;
                    i24 = i33;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    j2 = j;
                    z6 = z3;
                    i24 = i11;
                    q630Var3 = q630Var2;
                    frv0Var3 = frv0Var2;
                    z7 = z5;
                    z8 = z4;
                    pcoVar2 = pcoVar;
                    i25 = i2;
                    map2 = map;
                    i26 = i3;
                    izsVar2 = izsVar;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.jtu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int I = ne7.I(i4 | 1);
                            int I2 = ne7.I(i5);
                            ntu0.c(us2.this, q630Var3, frv0Var3, j2, i24, z8, z7, z6, pcoVar2, i25, map2, i26, izsVar2, (androidx.compose.runtime.a) obj2, I, I2, i6);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i11 = i;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            if (i13 != 0) {
            }
            i14 = i6 & 128;
            if (i14 != 0) {
            }
            i15 = i6 & 256;
            if (i15 != 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            i16 = i6 & 1024;
            if (i16 != 0) {
            }
            i19 = i6 & 2048;
            if (i19 != 0) {
            }
            int i372 = i21;
            i22 = i6 & 4096;
            if (i22 != 0) {
            }
            if (M.t(i9 & 1, (i9 & 306783379) == 306783378 || (i23 & 147) != 146)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i4 & 384) != 0) {
        }
        if ((i4 & 3072) != 0) {
        }
        i9 = i8;
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        if (i13 != 0) {
        }
        i14 = i6 & 128;
        if (i14 != 0) {
        }
        i15 = i6 & 256;
        if (i15 != 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        i16 = i6 & 1024;
        if (i16 != 0) {
        }
        i19 = i6 & 2048;
        if (i19 != 0) {
        }
        int i3722 = i21;
        i22 = i6 & 4096;
        if (i22 != 0) {
        }
        if (M.t(i9 & 1, (i9 & 306783379) == 306783378 || (i23 & 147) != 146)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if (r1 < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(ggj ggjVar, ljo0 ljo0Var, int i, LayoutDirection layoutDirection, Float f, Float f2) {
        char c;
        float f3;
        float f4;
        float f5;
        y7z b;
        float f6;
        float f7;
        m540 m540Var = ljo0Var.b;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.85f);
        Float valueOf3 = Float.valueOf(0.7f);
        Float valueOf4 = Float.valueOf(0.297f);
        Float valueOf5 = Float.valueOf(0.152f);
        Float valueOf6 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i < 0 || i >= m540Var.f) {
            return;
        }
        float g = m540Var.g(i);
        float b2 = m540Var.b(i) - g;
        float floatValue = f != null ? f.floatValue() : 1.5f * b2;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            float i2 = ljo0Var.i(i);
            if (f2 != null) {
                f7 = f2.floatValue();
                c = ' ';
            } else {
                c = ' ';
                f7 = (int) (ljo0Var.c >> 32);
            }
            if (i2 > f7) {
                i2 = f7;
            }
            f3 = i2 - floatValue;
        } else {
            c = ' ';
            float h = ljo0Var.h(i);
            if (h < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                h = 0.0f;
            }
            try {
                if (h >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = h;
                    if (layoutDirection != layoutDirection2) {
                        long j = l5g.b;
                        f4 = f3;
                        f5 = b2;
                        b = yk8.a.b(new Pair[]{new Pair(valueOf6, new l5g(j)), new Pair(valueOf5, new l5g(l5g.c(14, j, 0.95f))), new Pair(valueOf4, new l5g(l5g.c(14, j, 0.8f))), new Pair(valueOf3, new l5g(l5g.c(14, j, 0.2f))), new Pair(valueOf2, new l5g(l5g.c(14, j, 0.05f))), new Pair(valueOf, new l5g(l5g.j))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue, 8);
                    } else {
                        f4 = f3;
                        f5 = b2;
                        Pair pair = new Pair(valueOf6, new l5g(l5g.j));
                        long j2 = l5g.b;
                        b = yk8.a.b(new Pair[]{pair, new Pair(valueOf5, new l5g(l5g.c(14, j2, 0.05f))), new Pair(valueOf4, new l5g(l5g.c(14, j2, 0.2f))), new Pair(valueOf3, new l5g(l5g.c(14, j2, 0.8f))), new Pair(valueOf2, new l5g(l5g.c(14, j2, 0.95f))), new Pair(valueOf, new l5g(j2))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue, 8);
                    }
                    y7z y7zVar = b;
                    f6 = f4;
                    ggjVar.a0().a.l(f6, g);
                    oio.x1(ggjVar, y7zVar, 0L, (Float.floatToRawIntBits(floatValue) << c) | (Float.floatToRawIntBits(f5) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 6, 58);
                    return;
                }
                oio.x1(ggjVar, y7zVar, 0L, (Float.floatToRawIntBits(floatValue) << c) | (Float.floatToRawIntBits(f5) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 6, 58);
                return;
            } finally {
                ggjVar.a0().a.l(-f6, -g);
            }
            f3 = 0.0f;
            if (layoutDirection != layoutDirection2) {
            }
            y7z y7zVar2 = b;
            f6 = f4;
            ggjVar.a0().a.l(f6, g);
        }
    }

    public static final int e(ljo0 ljo0Var, int i) {
        m540 m540Var = ljo0Var.b;
        int min = Math.min(i, m540Var.f) - 1;
        if (min < 0) {
            min = 0;
        }
        while (-1 < min) {
            if (min >= 0 && min < m540Var.f) {
                us2 us2Var = ljo0Var.a.a;
                int f = m540Var.f(min);
                int c = m540Var.c(min, false);
                if (c < f) {
                    c = f;
                }
                while (f < c) {
                    char charAt = us2Var.c.charAt(f);
                    if (charAt != 10240 && !ro.j(charAt) && charAt != 8230 && charAt != 8229) {
                        return min;
                    }
                    f++;
                }
            }
            min--;
        }
        return -1;
    }

    public static final Float f(float f, azl azlVar, pco pcoVar) {
        if (pcoVar == null) {
            return null;
        }
        float I0 = azlVar.I0(pcoVar.b);
        return f < I0 ? Float.valueOf(f) : Float.valueOf(I0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r5.h(r6) < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r5.i(r6) > ((int) (r5.c >> 32))) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean g(ljo0 ljo0Var, int i, int i2, LayoutDirection layoutDirection, boolean z) {
        boolean z2;
        m540 m540Var = ljo0Var.b;
        if (m540Var.f != 0 && i >= 0) {
            boolean z3 = i < i2 && ljo0Var.d();
            if (i >= 0 && i < m540Var.f) {
                int i3 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (!z || z2 || z3) {
                    return true;
                }
            }
            z2 = false;
            if (!z) {
            }
            return true;
        }
        return false;
    }
}
