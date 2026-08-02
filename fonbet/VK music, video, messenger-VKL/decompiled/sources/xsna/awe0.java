package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.music.stickyplayer.presentation.components.radio.RadioPlayerSheetTab;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.b78;
import xsna.b9p0;
import xsna.c9p0;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;
import xsna.qy40;

/* compiled from: RadioWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class awe0 {

    /* compiled from: RadioWithBottomPlayer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RadioPlayerSheetTab.values().length];
            try {
                iArr[RadioPlayerSheetTab.QUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final boolean z, final gfp0.d dVar, final dz40.g gVar, final wh50 wh50Var, final mtk0 mtk0Var, final long j, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.a M = aVar.M(-1438949204);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.J(dVar) ? 32 : 16) | (M.J(gVar) ? 256 : 128) | (M.p(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1438949204, i2, -1, "com.vk.music.stickyplayer.presentation.Image (RadioWithBottomPlayer.kt:301)");
            }
            if (dVar.a()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new wzs(z, dVar, gVar, wh50Var, mtk0Var, j, izsVar, i) { // from class: xsna.mve0
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ gfp0.d c;
                        public final /* synthetic */ dz40.g d;
                        public final /* synthetic */ wh50 e;
                        public final /* synthetic */ mtk0 f;
                        public final /* synthetic */ long g;
                        public final /* synthetic */ izs h;

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(224257);
                            awe0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                    s.d = wzsVar;
                }
                return;
            }
            w3k.b(z, gVar, wh50Var, izsVar, null, txj0.d(q630.a.a, 1.0f), mtk0Var, false, j, M, (i2 & 14) | 196608 | ((i2 >> 3) & 112) | 384 | ((i2 >> 12) & 7168) | 1597440 | ((i2 << 6) & 234881024), 128);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs(z, dVar, gVar, wh50Var, mtk0Var, j, izsVar, i) { // from class: xsna.nve0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gfp0.d c;
                public final /* synthetic */ dz40.g d;
                public final /* synthetic */ wh50 e;
                public final /* synthetic */ mtk0 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ izs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(224257);
                    awe0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public static final void b(final dz40.r rVar, final gfp0.d dVar, final dz40.c cVar, final f3b0 f3b0Var, final q630 q630Var, final boolean z, s7k0 s7k0Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z2;
        izs izsVar2;
        androidx.compose.runtime.a aVar2;
        final s7k0 s7k0Var2;
        androidx.compose.runtime.a M = aVar.M(319300892);
        if ((i & 6) == 0) {
            i2 = (M.J(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(f3b0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            izsVar2 = izsVar;
            i3 |= M.y(izsVar2) ? 8388608 : 4194304;
        } else {
            izsVar2 = izsVar;
        }
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            final s7k0 s7k0Var3 = new s7k0(0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(319300892, i3, -1, "com.vk.music.stickyplayer.presentation.RadioContent (RadioWithBottomPlayer.kt:119)");
            }
            final wh50 c = jk50.c(rVar.f, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            final dlv0 dlv0Var = (dlv0) x;
            final h17 g = f17.g(f17.f(BigPlayerBottomSheetValue.Collapsed, M), M, 2);
            if (s7k0Var3.a instanceof qy40.b) {
                M.K(-1064720474);
            } else {
                M.K(-1058864760);
                boolean z3 = (3670016 & i3) == 1048576;
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new xve0(dlv0Var, s7k0Var3, null);
                    M.R(x2);
                }
                bap.g(s7k0Var3, (wzs) x2, M, (i3 >> 18) & 14);
            }
            M.j();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            final wh50 wh50Var = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            final wh50 wh50Var2 = (wh50) x4;
            Float valueOf = Float.valueOf(g.a.b());
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new yve0(dlv0Var, null);
                M.R(x5);
            }
            bap.g(valueOf, (wzs) x5, M, 0);
            ParentBottomSheetState a2 = f3b0Var.a();
            yzt0<dz40.h> yzt0Var = rVar.c;
            boolean J = ((i3 & 7168) == 2048) | M.J(g);
            Object x6 = M.x();
            if (J || x6 == c0012a) {
                x6 = new zve0(f3b0Var, g, null);
                M.R(x6);
            }
            bap.f(a2, yzt0Var, (wzs) x6, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final long j = ylu0Var.getBackground().i;
            final boolean z4 = z2;
            final izs izsVar3 = izsVar2;
            zzs zzsVar = new zzs() { // from class: xsna.sve0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    final mtk0 mtk0Var = (mtk0) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(mtk0Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(168115284, intValue, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous> (RadioWithBottomPlayer.kt:144)");
                        }
                        q630 d = txj0.d(q630.this, 1.0f);
                        final dz40.r rVar2 = rVar;
                        final gfp0.d dVar2 = dVar;
                        final wh50 wh50Var3 = wh50Var;
                        final boolean z5 = z4;
                        final h17 h17Var = g;
                        final dlv0 dlv0Var2 = dlv0Var;
                        final s7k0 s7k0Var4 = s7k0Var3;
                        final izs izsVar4 = izsVar3;
                        final f3b0 f3b0Var2 = f3b0Var;
                        final dz40.c cVar2 = cVar;
                        final wh50 wh50Var4 = wh50Var2;
                        final long j2 = j;
                        final mtk0 mtk0Var2 = c;
                        ua8.a(d, null, false, kai.c(-1877269718, new yzs() { // from class: xsna.uve0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.yzs
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                float f;
                                boolean z6;
                                f3b0 f3b0Var3;
                                va8 va8Var = (va8) obj5;
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= aVar4.J(va8Var) ? 4 : 2;
                                }
                                boolean z7 = true;
                                if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1877269718, intValue2, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous>.<anonymous> (RadioWithBottomPlayer.kt:147)");
                                    }
                                    aVar4.K(-169932859);
                                    iyk0 iyk0Var = uvi.h;
                                    azl azlVar = (azl) aVar4.r(iyk0Var);
                                    f3b0 f3b0Var4 = f3b0Var2;
                                    final float j1 = azlVar.j1(f3b0Var4.c().c((azl) aVar4.r(iyk0Var)));
                                    aVar4.j();
                                    float g2 = (va8Var.g() - j1) - bw40.a;
                                    dz40.r rVar3 = dz40.r.this;
                                    yzt0<dz40.h> yzt0Var2 = rVar3.c;
                                    dz40.q qVar = rVar3.a;
                                    final wh50 c2 = jk50.c(yzt0Var2, aVar4);
                                    final wh50 c3 = jk50.c(rVar3.b, aVar4);
                                    wh50 c4 = jk50.c(qVar.b, aVar4);
                                    final wh50 c5 = jk50.c(qVar.c, aVar4);
                                    Object x7 = aVar4.x();
                                    final gfp0.d dVar3 = dVar2;
                                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                                    if (x7 == c0012a2) {
                                        x7 = androidx.compose.runtime.k.b(dVar3.a);
                                        aVar4.R(x7);
                                    }
                                    wh50 wh50Var5 = (wh50) x7;
                                    if (epx.f(dVar3.a, (String) wh50Var5.getValue())) {
                                        z7 = false;
                                    } else {
                                        wh50Var5.setValue(dVar3.a);
                                    }
                                    Object x8 = aVar4.x();
                                    final h17 h17Var2 = h17Var;
                                    if (x8 == c0012a2) {
                                        x8 = bbk0.b(new sy50(h17Var2, 23));
                                        aVar4.R(x8);
                                    }
                                    final mtk0 mtk0Var3 = (mtk0) x8;
                                    Boolean bool = (Boolean) c4.getValue();
                                    boolean booleanValue = bool.booleanValue();
                                    Boolean bool2 = (Boolean) c5.getValue();
                                    boolean booleanValue2 = bool2.booleanValue();
                                    if (androidx.compose.runtime.b.d()) {
                                        f = g2;
                                        z6 = z7;
                                        f3b0Var3 = f3b0Var4;
                                        androidx.compose.runtime.b.f(1759374981, 6, -1, "com.vk.music.stickyplayer.domain.rememberRadioState (RadioState.kt:28)");
                                    } else {
                                        f = g2;
                                        z6 = z7;
                                        f3b0Var3 = f3b0Var4;
                                    }
                                    Object x9 = aVar4.x();
                                    final wh50<Boolean> wh50Var6 = wh50Var3;
                                    final boolean z8 = z5;
                                    if (x9 == c0012a2) {
                                        x9 = new vue0(wh50Var6, z8, booleanValue, booleanValue2);
                                        aVar4.R(x9);
                                    }
                                    vue0 vue0Var = (vue0) x9;
                                    ((zak0) vue0Var.b).setValue(Boolean.valueOf(z8));
                                    ((zak0) vue0Var.c).setValue(bool);
                                    vue0Var.a = wh50Var6;
                                    ((zak0) vue0Var.d).setValue(bool2);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    final List singletonList = Collections.singletonList(RadioPlayerSheetTab.QUEUE);
                                    aVar4.K(-169894889);
                                    azl azlVar2 = (azl) aVar4.r(iyk0Var);
                                    zpx0 c6 = f3b0Var3.c();
                                    azl azlVar3 = (azl) aVar4.r(iyk0Var);
                                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                    final float j12 = azlVar2.j1(c6.d(azlVar3, layoutDirection));
                                    aVar4.j();
                                    aVar4.K(-169889416);
                                    final float j13 = ((azl) aVar4.r(iyk0Var)).j1(f3b0Var3.c().b((azl) aVar4.r(iyk0Var), layoutDirection));
                                    aVar4.j();
                                    Object x10 = aVar4.x();
                                    if (x10 == c0012a2) {
                                        x10 = androidx.compose.runtime.i.a(0);
                                        aVar4.R(x10);
                                    }
                                    final rg50 rg50Var = (rg50) x10;
                                    final wh50 c7 = jk50.c(rVar3.g, aVar4);
                                    final izs izsVar5 = izsVar4;
                                    final dz40.c cVar3 = cVar2;
                                    jai c8 = kai.c(1167449498, new wzs() { // from class: xsna.vve0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj8, Object obj9) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj8;
                                            int intValue3 = ((Integer) obj9).intValue();
                                            if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1167449498, intValue3, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous>.<anonymous>.<anonymous> (RadioWithBottomPlayer.kt:190)");
                                                }
                                                float floatValue = ((Number) mtk0Var3.getValue()).floatValue();
                                                final izs izsVar6 = izsVar5;
                                                jai c9 = kai.c(-420685885, new yqz(izsVar6, c2), aVar5);
                                                final dz40.c cVar4 = cVar3;
                                                final gfp0.d dVar4 = dVar3;
                                                final boolean z9 = z8;
                                                final wh50 wh50Var7 = c5;
                                                s8p0.b(j1, floatValue, dVar4, izsVar6, false, c9, kai.c(1920377378, new yzs() { // from class: xsna.ove0
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                                        q630 q630Var2 = (q630) obj10;
                                                        androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj11;
                                                        int intValue4 = ((Integer) obj12).intValue();
                                                        if ((intValue4 & 6) == 0) {
                                                            intValue4 |= aVar6.J(q630Var2) ? 4 : 2;
                                                        }
                                                        if (aVar6.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(1920377378, intValue4, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RadioWithBottomPlayer.kt:203)");
                                                            }
                                                            awe0.d(dz40.c.this, dVar4, z9, ((Boolean) wh50Var7.getValue()).booleanValue(), izsVar6, q630Var2, aVar6, (intValue4 << 15) & 458752);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar6.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar5), aVar5, 1794048);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    final wh50 wh50Var7 = wh50Var4;
                                    final long j3 = j2;
                                    jai c9 = kai.c(-2042159973, new wzs() { // from class: xsna.wve0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj8, Object obj9) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj8;
                                            int intValue3 = ((Integer) obj9).intValue();
                                            if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-2042159973, intValue3, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous>.<anonymous>.<anonymous> (RadioWithBottomPlayer.kt:226)");
                                                }
                                                awe0.a(z8, dVar3, (dz40.g) c3.getValue(), wh50Var6, wh50Var7, j3, izsVar5, aVar5, 224256);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    jai c10 = kai.c(-956802148, new bk4(dVar3, cVar3, z6, f3b0Var3, izsVar5, mtk0Var2), aVar4);
                                    final mtk0 mtk0Var4 = mtk0Var;
                                    final float f2 = f;
                                    qte0.a(vue0Var, h17Var2, dlv0Var2, mtk0Var4, null, s7k0Var4, izsVar5, c8, c9, c10, kai.c(-1009345440, new zzs() { // from class: xsna.lve0
                                        @Override // xsna.zzs
                                        public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                            ((Float) obj9).getClass();
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar5.t(intValue3 & 1, (intValue3 & 129) != 128)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-1009345440, intValue3, -1, "com.vk.music.stickyplayer.presentation.RadioContent.<anonymous>.<anonymous>.<anonymous> (RadioWithBottomPlayer.kt:238)");
                                                }
                                                q630 H = s200.H(txj0.h(q630.a.a, f2), j12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                                                dz40.s sVar = new dz40.s(singletonList);
                                                gfp0.d dVar4 = dVar3;
                                                boolean z9 = z8;
                                                h17 h17Var3 = h17Var2;
                                                ive0.b(h17Var3, rg50Var, sVar, H, kai.c(864684699, new ab00(dVar4, z9, h17Var3, mtk0Var4, wh50Var7, izsVar5, c7), aVar5), aVar5, 25008);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4), aVar4, 918552960);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar3), aVar3, 3072, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            };
            aVar2 = M;
            rfl0.a(Tensorflow.FRAME_WIDTH, 1, aVar2, kai.c(168115284, zzsVar, aVar2), null, true);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            s7k0Var2 = s7k0Var3;
        } else {
            aVar2 = M;
            aVar2.h();
            s7k0Var2 = s7k0Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.tve0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    awe0.b(dz40.r.this, dVar, cVar, f3b0Var, q630Var, z, s7k0Var2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final dz40.r rVar, final f3b0 f3b0Var, final BottomPlayerAppearance bottomPlayerAppearance, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        boolean z;
        String str;
        izs izsVar2;
        final b78 b78Var;
        dz40.q qVar = rVar.a;
        androidx.compose.runtime.a M = aVar.M(1986887617);
        if ((i & 6) == 0) {
            i2 = (M.J(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(f3b0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(bottomPlayerAppearance.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1986887617, i3, -1, "com.vk.music.stickyplayer.presentation.RadioWithBottomPlayer (RadioWithBottomPlayer.kt:61)");
            }
            final wh50 c = jk50.c(rVar.d, M);
            final wh50 c2 = jk50.c(rVar.e, M);
            final wh50 c3 = jk50.c(qVar.a, M);
            final wh50 c4 = jk50.c(qVar.b, M);
            final wh50 c5 = jk50.c(qVar.c, M);
            final wh50 c6 = jk50.c(qVar.d, M);
            Boolean bool = (Boolean) c3.getValue();
            boolean booleanValue = bool.booleanValue();
            boolean z2 = !((dz40.c) c2.getValue()).a;
            gfp0.d dVar = (gfp0.d) c.getValue();
            int i4 = i3 & 7168;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(148484007, i4, -1, "com.vk.music.stickyplayer.presentation.rememberBottomPlayerState (RadioWithBottomPlayer.kt:271)");
            }
            if (dVar.a()) {
                M.K(-329027640);
                b78 a2 = b78.f.a.a(booleanValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, izsVar, M, ((i4 >> 3) & 896) | 3120);
                M.j();
                b78Var = a2;
                izsVar2 = izsVar;
            } else {
                M.K(-328873136);
                String str2 = dVar.c;
                Thumb thumb = dVar.b;
                int i5 = ((i4 << 3) & 57344) | 196608;
                if (androidx.compose.runtime.b.d()) {
                    z = z2;
                    androidx.compose.runtime.b.f(-1449360397, i5, -1, "com.vk.music.stickyplayer.presentation.components.BottomPlayerState.Radio.Companion.invoke (BottomPlayerState.kt:260)");
                } else {
                    z = z2;
                }
                Object x = M.x();
                if (x == a.C0011a.a) {
                    b78.i iVar = new b78.i(str2, booleanValue, z, thumb, izsVar);
                    str = str2;
                    izsVar2 = izsVar;
                    M.R(iVar);
                    x = iVar;
                } else {
                    str = str2;
                    izsVar2 = izsVar;
                }
                b78.i iVar2 = (b78.i) x;
                ((zak0) iVar2.a).setValue(str);
                ((zak0) iVar2.b).setValue(bool);
                ((zak0) iVar2.c).setValue(Boolean.valueOf(z));
                ((zak0) iVar2.d).setValue(thumb);
                ((zak0) iVar2.e).setValue(izsVar2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                b78Var = iVar2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final izs izsVar3 = izsVar2;
            aVar2 = M;
            vmj.b(f3b0Var.c(), ((vak0) f3b0Var.b).getFloatValue(), bottomPlayerAppearance, kai.c(-1846519507, new yzs() { // from class: xsna.kve0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var = (q630) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(q630Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1846519507, intValue, -1, "com.vk.music.stickyplayer.presentation.RadioWithBottomPlayer.<anonymous> (RadioWithBottomPlayer.kt:81)");
                        }
                        awe0.b(dz40.r.this, (gfp0.d) c.getValue(), (dz40.c) c2.getValue(), f3b0Var, q630Var, ((Boolean) c3.getValue()).booleanValue(), null, izsVar3, aVar3, (intValue << 12) & 57344);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(-561456978, new yzs() { // from class: xsna.qve0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var = (q630) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(q630Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-561456978, intValue, -1, "com.vk.music.stickyplayer.presentation.RadioWithBottomPlayer.<anonymous> (RadioWithBottomPlayer.kt:92)");
                        }
                        vmj.a(b78.this, bottomPlayerAppearance, ((Boolean) c4.getValue()).booleanValue(), ((Boolean) c5.getValue()).booleanValue(), ((Boolean) c6.getValue()).booleanValue(), ahn.E(q630.a.a, "smallPlayer").g(q630Var), aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), !((gfp0.d) c.getValue()).a(), aVar2, (i3 & 896) | 27648);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new rve0(rVar, f3b0Var, bottomPlayerAppearance, izsVar, i, 0);
        }
    }

    public static final void d(dz40.c cVar, gfp0.d dVar, boolean z, boolean z2, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        b9p0 b9p0Var;
        c9p0 c9p0Var;
        androidx.compose.runtime.a M = aVar.M(-362140530);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(izsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-362140530, i3, -1, "com.vk.music.stickyplayer.presentation.TopControls (RadioWithBottomPlayer.kt:325)");
            }
            boolean a2 = dVar.a();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (a2) {
                M.K(429623302);
                M.j();
                b9p0Var = b9p0.c.a;
            } else {
                M.K(429677893);
                String str = dVar.c;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(102774802, 384, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.Radio.Companion.invoke (TopPlayerControls.kt:387)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new b9p0.f(str);
                    M.R(x);
                }
                b9p0.f fVar = (b9p0.f) x;
                ((zak0) fVar.a).setValue(str);
                ((wak0) fVar.b).C(R.string.music_player_radio_station);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                b9p0Var = fVar;
            }
            if (dVar.a()) {
                M.K(429861847);
                c9p0 a3 = c9p0.c.a.a(false, false, false, izsVar, M, ((i3 >> 3) & 7168) | 25014);
                M.j();
                c9p0Var = a3;
            } else {
                M.K(430056186);
                boolean z3 = cVar.a;
                int i4 = i3 >> 3;
                int i5 = ((i3 >> 6) & 14) | 24576 | (i4 & 896) | (i4 & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(158313526, i5, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.RadioButtons.Companion.invoke (TopPlayerControls.kt:819)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new c9p0.e(z, z3, z2, izsVar);
                    M.R(x2);
                }
                c9p0.e eVar = (c9p0.e) x2;
                ((zak0) eVar.a).setValue(Boolean.valueOf(z));
                ((zak0) eVar.b).setValue(Boolean.valueOf(z3));
                ((zak0) eVar.c).setValue(Boolean.valueOf(z2));
                ((zak0) eVar.d).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                c9p0Var = eVar;
            }
            Thumb thumb = dVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f9p0.b(thumb, b9p0Var, c9p0Var, q630Var, new l5g(ylu0Var.getBackground().i), M, (i3 >> 6) & 7168, 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pve0(cVar, dVar, z, z2, izsVar, q630Var, i);
        }
    }
}
