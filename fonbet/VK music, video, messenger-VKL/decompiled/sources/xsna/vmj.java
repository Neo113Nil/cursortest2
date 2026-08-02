package xsna;

import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;
import com.vk.music.player.api.BottomPlayerAppearance;
import kotlin.NoWhenBranchMatchedException;
import xsna.b78;
import xsna.gfp0;
import xsna.q630;
import xsna.vmj;

/* compiled from: ContentWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class vmj {

    /* compiled from: ContentWithBottomPlayer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomPlayerAppearance.values().length];
            try {
                iArr[BottomPlayerAppearance.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomPlayerAppearance.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(b78 b78Var, final BottomPlayerAppearance bottomPlayerAppearance, boolean z, boolean z2, boolean z3, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        b78 b78Var2;
        q630 q630Var2;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        androidx.compose.runtime.a M = aVar.M(-73601436);
        int i2 = (M.J(b78Var) ? 4 : 2) | i | (M.o(bottomPlayerAppearance.ordinal()) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= M.l(z3) ? 16384 : 8192;
        }
        int i3 = i2 | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-73601436, i3, -1, "com.vk.music.stickyplayer.presentation.BottomPlayer (ContentWithBottomPlayer.kt:179)");
            }
            int i4 = a.$EnumSwitchMapping$0[bottomPlayerAppearance.ordinal()];
            if (i4 == 1) {
                b78Var2 = b78Var;
                q630Var2 = q630Var;
                z4 = z3;
                z5 = z2;
                z6 = z;
                M.K(2068232487);
                x8u0.p(b78Var2, z4, ahn.E(q630Var2, "smallPlayer"), M, ((i3 >> 9) & 112) | (i3 & 14));
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(-2011494834, M);
                }
                M.K(2068455780);
                b78Var2 = b78Var;
                n750.l(b78Var2, z2, z, ahn.E(q630Var, "smallPlayer"), M, (i3 & 14) | ((i3 >> 6) & 112) | (i3 & 896));
                q630Var2 = q630Var;
                z6 = z;
                z4 = z3;
                z5 = z2;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            b78Var2 = b78Var;
            q630Var2 = q630Var;
            z4 = z3;
            z5 = z2;
            z6 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            final b78 b78Var3 = b78Var2;
            s.d = new wzs() { // from class: xsna.mmj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vmj.a(b78.this, bottomPlayerAppearance, z6, z5, z4, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final zpx0 zpx0Var, final float f, final BottomPlayerAppearance bottomPlayerAppearance, final jai jaiVar, final jai jaiVar2, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final jai jaiVar3;
        jai jaiVar4;
        androidx.compose.runtime.a aVar2;
        q630 b;
        androidx.compose.runtime.a M = aVar.M(-1953364495);
        if ((i & 6) == 0) {
            i2 = (M.J(zpx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(bottomPlayerAppearance.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            jaiVar3 = jaiVar;
            i2 |= M.y(jaiVar3) ? 2048 : 1024;
        } else {
            jaiVar3 = jaiVar;
        }
        if ((i & 24576) == 0) {
            jaiVar4 = jaiVar2;
            i2 |= M.y(jaiVar4) ? 16384 : 8192;
        } else {
            jaiVar4 = jaiVar2;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1953364495, i2, -1, "com.vk.music.stickyplayer.presentation.ContentWithBottomPlayer (ContentWithBottomPlayer.kt:51)");
            }
            Orientation orientation = Orientation.Vertical;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1709200604, 0, -1, "com.vk.music.stickyplayer.presentation.components.rememberMusicPlayerScrollInteropConnection (MusicPlayerScrollInteropConnection.kt:193)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            view.setTag("AndroidComposeView");
            boolean J = M.J(view) | M.o(orientation.ordinal());
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new oy40(view, orientation);
                view.requestLayout();
                M.R(x);
            }
            oy40 oy40Var = (oy40) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = a.$EnumSwitchMapping$0[bottomPlayerAppearance.ordinal()];
            if (i3 != 1 && i3 != 2) {
                throw alb0.c(-282556618, M);
            }
            M.K(-282552222);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            M.j();
            q630.a aVar3 = q630.a.a;
            if (z) {
                M.K(-169095597);
                boolean y = M.y(oy40Var);
                Object x2 = M.x();
                if (y || x2 == obj) {
                    x2 = new gmj(oy40Var, 0);
                    M.R(x2);
                }
                gho b2 = fho.b((izs) x2, M, 0);
                boolean y2 = M.y(oy40Var);
                Object x3 = M.x();
                if (y2 || x3 == obj) {
                    x3 = new tmj(oy40Var, null);
                    M.R(x3);
                }
                b = n34.t(fho.a(aVar3, b2, orientation, false, null, false, (yzs) x3, false, 188), oy40Var, null);
                M.j();
            } else {
                M.K(-168619096);
                s3q0 s3q0Var = s3q0.a;
                Object x4 = M.x();
                if (x4 == obj) {
                    x4 = umj.a;
                    M.R(x4);
                }
                b = skn0.b(aVar3, s3q0Var, (PointerInputEventHandler) x4);
                M.j();
            }
            final jai jaiVar5 = jaiVar4;
            aVar2 = M;
            uov0.a(b, null, l5g.c(14, j, f), 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-2061507592, new wzs() { // from class: xsna.kmj
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2061507592, intValue, -1, "com.vk.music.stickyplayer.presentation.ContentWithBottomPlayer.<anonymous> (ContentWithBottomPlayer.kt:84)");
                        }
                        q630 d = txj0.d(q630.a.a, 1.0f);
                        final float f2 = f;
                        final BottomPlayerAppearance bottomPlayerAppearance2 = bottomPlayerAppearance;
                        final jai jaiVar6 = jaiVar5;
                        final jai jaiVar7 = jaiVar3;
                        final zpx0 zpx0Var2 = zpx0Var;
                        ua8.a(d, null, false, kai.c(1186599906, new yzs() { // from class: xsna.nmj
                            @Override // xsna.yzs
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a.C0011a.C0012a c0012a;
                                int i4;
                                int i5;
                                final float f3;
                                final va8 va8Var = (va8) obj4;
                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= aVar5.J(va8Var) ? 4 : 2;
                                }
                                if (aVar5.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1186599906, intValue2, -1, "com.vk.music.stickyplayer.presentation.ContentWithBottomPlayer.<anonymous>.<anonymous> (ContentWithBottomPlayer.kt:85)");
                                    }
                                    final float f4 = f2;
                                    boolean n = aVar5.n(f4);
                                    Object x5 = aVar5.x();
                                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                    if (n || x5 == c0012a2) {
                                        x5 = bbk0.b(new gzs() { // from class: xsna.omj
                                            @Override // xsna.gzs
                                            public final Object invoke() {
                                                return Boolean.valueOf(f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                            }
                                        });
                                        aVar5.R(x5);
                                    }
                                    if (((Boolean) ((mtk0) x5).getValue()).booleanValue()) {
                                        aVar5.K(-1877851164);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                        }
                                        wuv0 wuv0Var = (wuv0) aVar5.r(rrv0.c);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        final jai jaiVar8 = jaiVar7;
                                        i4 = 0;
                                        i5 = -1881800192;
                                        c0012a = c0012a2;
                                        rrv0.e(true, null, null, wuv0Var, null, null, kai.c(-994393308, new wzs() { // from class: xsna.pmj
                                            @Override // xsna.wzs
                                            public final Object invoke(Object obj7, Object obj8) {
                                                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj7;
                                                int intValue3 = ((Integer) obj8).intValue();
                                                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-994393308, intValue3, -1, "com.vk.music.stickyplayer.presentation.ContentWithBottomPlayer.<anonymous>.<anonymous>.<anonymous> (ContentWithBottomPlayer.kt:92)");
                                                    }
                                                    c9e0 b3 = c490.a.b(null);
                                                    final float f5 = f4;
                                                    final jai jaiVar9 = jaiVar8;
                                                    rvi.a(b3, kai.c(2044372964, new wzs() { // from class: xsna.imj
                                                        @Override // xsna.wzs
                                                        public final Object invoke(Object obj9, Object obj10) {
                                                            androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj9;
                                                            int intValue4 = ((Integer) obj10).intValue();
                                                            if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(2044372964, intValue4, -1, "com.vk.music.stickyplayer.presentation.ContentWithBottomPlayer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContentWithBottomPlayer.kt:93)");
                                                                }
                                                                q630 d2 = txj0.d(q630.a.a, 1.0f);
                                                                final float f6 = f5;
                                                                boolean n2 = aVar7.n(f6);
                                                                Object x6 = aVar7.x();
                                                                if (n2 || x6 == a.C0011a.a) {
                                                                    x6 = new izs() { // from class: xsna.jmj
                                                                        @Override // xsna.izs
                                                                        public final Object invoke(Object obj11) {
                                                                            ((tdu) obj11).b(f6);
                                                                            return s3q0.a;
                                                                        }
                                                                    };
                                                                    aVar7.R(x6);
                                                                }
                                                                jaiVar9.invoke(rdu.a(d2, (izs) x6), aVar7, 0);
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                            } else {
                                                                aVar7.h();
                                                            }
                                                            return s3q0.a;
                                                        }
                                                    }, aVar6), aVar6, 56);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar6.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, aVar5), aVar5, 1572870, 54);
                                    } else {
                                        c0012a = c0012a2;
                                        i4 = 0;
                                        i5 = -1881800192;
                                        aVar5.K(-1881800192);
                                    }
                                    aVar5.j();
                                    int[] iArr = vmj.a.$EnumSwitchMapping$0;
                                    final BottomPlayerAppearance bottomPlayerAppearance3 = bottomPlayerAppearance2;
                                    int i6 = iArr[bottomPlayerAppearance3.ordinal()];
                                    if (i6 == 1) {
                                        f3 = bw40.c;
                                    } else {
                                        if (i6 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        f3 = bw40.d + bw40.e;
                                    }
                                    aVar5.K(-2138753980);
                                    iyk0 iyk0Var = uvi.h;
                                    final int c = zpx0Var2.c((azl) aVar5.r(iyk0Var));
                                    aVar5.j();
                                    boolean n2 = aVar5.n(va8Var.g()) | aVar5.n(f4);
                                    Object x6 = aVar5.x();
                                    a.C0011a.C0012a c0012a3 = c0012a;
                                    if (n2 || x6 == c0012a3) {
                                        x6 = bbk0.b(new gzs() { // from class: xsna.qmj
                                            @Override // xsna.gzs
                                            public final Object invoke() {
                                                int i7 = vmj.a.$EnumSwitchMapping$0[BottomPlayerAppearance.this.ordinal()];
                                                float f5 = f3;
                                                if (i7 == 1) {
                                                    f5 += (va8Var.g() - f5) * f4;
                                                } else if (i7 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                return new pco(f5);
                                            }
                                        });
                                        aVar5.R(x6);
                                    }
                                    mtk0 mtk0Var = (mtk0) x6;
                                    boolean n3 = aVar5.n(f4);
                                    Object x7 = aVar5.x();
                                    if (n3 || x7 == c0012a3) {
                                        x7 = bbk0.b(new gzs() { // from class: xsna.rmj
                                            @Override // xsna.gzs
                                            public final Object invoke() {
                                                int i7;
                                                int i8 = vmj.a.$EnumSwitchMapping$0[BottomPlayerAppearance.this.ordinal()];
                                                if (i8 == 1) {
                                                    i7 = 0;
                                                } else {
                                                    if (i8 != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    i7 = an10.b(c * f4);
                                                }
                                                return Integer.valueOf(i7);
                                            }
                                        });
                                        aVar5.R(x7);
                                    }
                                    mtk0 mtk0Var2 = (mtk0) x7;
                                    boolean n4 = aVar5.n(f4);
                                    Object x8 = aVar5.x();
                                    if (n4 || x8 == c0012a3) {
                                        x8 = bbk0.b(new gzs() { // from class: xsna.smj
                                            @Override // xsna.gzs
                                            public final Object invoke() {
                                                return Boolean.valueOf(f4 < 1.0f);
                                            }
                                        });
                                        aVar5.R(x8);
                                    }
                                    if (((Boolean) ((mtk0) x8).getValue()).booleanValue()) {
                                        aVar5.K(-1875832599);
                                        q630 h = txj0.h(txj0.f(q630.a.a, 1.0f), ((pco) mtk0Var.getValue()).b);
                                        boolean J2 = aVar5.J(mtk0Var2);
                                        Object x9 = aVar5.x();
                                        if (J2 || x9 == c0012a3) {
                                            x9 = new s6(mtk0Var2, 28);
                                            aVar5.R(x9);
                                        }
                                        q630 k = kci.k(h, (izs) x9);
                                        boolean n5 = aVar5.n(f4);
                                        Object x10 = aVar5.x();
                                        if (n5 || x10 == c0012a3) {
                                            x10 = new izs() { // from class: xsna.hmj
                                                @Override // xsna.izs
                                                public final Object invoke(Object obj7) {
                                                    ((tdu) obj7).b(1.0f - f4);
                                                    return s3q0.a;
                                                }
                                            };
                                            aVar5.R(x10);
                                        }
                                        jaiVar6.invoke(rdu.a(k, (izs) x10), aVar5, Integer.valueOf(i4));
                                    } else {
                                        aVar5.K(i5);
                                    }
                                    aVar5.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar5.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar4), aVar4, 3078, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 1572864, 58);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lmj
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    vmj.b(zpx0.this, f, bottomPlayerAppearance, jaiVar, jaiVar2, z, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b78 c(gfp0.b bVar, c78 c78Var, izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        b78.f fVar;
        boolean z;
        Object obj;
        boolean z2;
        Thumb thumb;
        String str;
        float f = c78Var.a;
        boolean z3 = c78Var.b;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1223068868, i, -1, "com.vk.music.stickyplayer.presentation.rememberBottomPlayerState (ContentWithBottomPlayer.kt:146)");
        }
        boolean z4 = bVar instanceof gfp0.b.c;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (z4) {
            aVar.K(1451866083);
            gfp0.b.c cVar = (gfp0.b.c) bVar;
            String str2 = cVar.c;
            boolean z5 = cVar.e;
            String str3 = cVar.d;
            boolean z6 = c78Var.b;
            boolean z7 = c78Var.c;
            Thumb thumb2 = cVar.b;
            float f2 = c78Var.a;
            boolean z8 = c78Var.d;
            int i2 = ((i << 18) & 234881024) | 805306368;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1357062034, i2, -1, "com.vk.music.stickyplayer.presentation.components.BottomPlayerState.Music.Companion.invoke (BottomPlayerState.kt:68)");
            }
            Object x = aVar.x();
            if (x == c0012a) {
                z2 = z7;
                z = z8;
                thumb = thumb2;
                obj = new b78.g(str2, z5, str3, z6, z2, thumb, f2, z, izsVar);
                str = str2;
                aVar.R(obj);
            } else {
                z = z8;
                obj = x;
                z2 = z7;
                thumb = thumb2;
                str = str2;
            }
            b78.g gVar = (b78.g) obj;
            ((zak0) gVar.a).setValue(str);
            ((zak0) gVar.b).setValue(Boolean.valueOf(z5));
            ((zak0) gVar.c).setValue(str3);
            ((zak0) gVar.e).setValue(Boolean.valueOf(z6));
            ((zak0) gVar.f).setValue(Boolean.valueOf(z2));
            ((zak0) gVar.g).setValue(thumb);
            ((vak0) gVar.h).g(f2);
            ((zak0) gVar.d).setValue(Boolean.valueOf(z));
            ((zak0) gVar.i).setValue(izsVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            fVar = gVar;
        } else if (bVar instanceof gfp0.b.a) {
            aVar.K(1451882273);
            Thumb thumb3 = ((gfp0.b.a) bVar).a;
            int i3 = ((i << 3) & 7168) | 24576;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2087885170, i3, -1, "com.vk.music.stickyplayer.presentation.components.BottomPlayerState.Advertisement.Companion.invoke (BottomPlayerState.kt:105)");
            }
            Object x2 = aVar.x();
            if (x2 == c0012a) {
                x2 = new b78.a(z3, thumb3, f, izsVar);
                aVar.R(x2);
            }
            b78.a aVar2 = (b78.a) x2;
            ((zak0) aVar2.a).setValue(Boolean.valueOf(z3));
            ((zak0) aVar2.b).setValue(thumb3);
            ((vak0) aVar2.c).g(f);
            ((zak0) aVar2.d).setValue(izsVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            fVar = aVar2;
        } else {
            if (!(bVar instanceof gfp0.b.C2940b)) {
                throw alb0.c(1451864187, aVar);
            }
            aVar.K(1451890163);
            b78.f a2 = b78.f.a.a(z3, f, izsVar, aVar, (i & 896) | 3072);
            aVar.j();
            fVar = a2;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return fVar;
    }
}
