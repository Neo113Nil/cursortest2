package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.music.stickyplayer.presentation.components.PlayerSheetTab;
import java.util.List;
import xsna.b78;
import xsna.b9p0;
import xsna.c9p0;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;
import xsna.qy40;
import xsna.vkb0;

/* compiled from: PodcastWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class vkb0 {

    /* compiled from: PodcastWithBottomPlayer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerSheetTab.values().length];
            try {
                iArr[PlayerSheetTab.QUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerSheetTab.LYRICS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(izs<? super sx40, s3q0> izsVar, x17 x17Var, boolean z, wh50<Boolean> wh50Var, float f, boolean z2, boolean z3, androidx.compose.runtime.a aVar, int i) {
        wh50<Boolean> wh50Var2;
        float f2;
        wh50<Boolean> wh50Var3;
        float f3 = f;
        androidx.compose.runtime.a M = aVar.M(957619958);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(x17Var) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.n(f3) ? 16384 : 8192) | (M.l(z2) ? 131072 : 65536) | (M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(957619958, i2, -1, "com.vk.music.stickyplayer.presentation.ControlsPanel (PodcastWithBottomPlayer.kt:432)");
            }
            w17.a(x17Var, 16, izsVar, txj0.f(q630.a.a, 1.0f), M, ((i2 >> 3) & 14) | 3120 | ((i2 << 6) & 896));
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3) {
                M.K(1283941044);
                int i3 = i2 >> 9;
                int i4 = ((i2 << 9) & 7168) | 196608 | ((i2 >> 6) & 14) | (i3 & 112) | (i3 & 896) | 24576;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1662012791, i4, -1, "com.vk.music.stickyplayer.presentation.components.podcast.KidsPodcastBigPlayerControls.Companion.invoke (KidsPodcastBigPlayerControls.kt:86)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    uiy uiyVar = new uiy(z, f3, z2, wh50Var, izsVar);
                    f2 = f3;
                    wh50Var3 = wh50Var;
                    M.R(uiyVar);
                    x = uiyVar;
                } else {
                    f2 = f3;
                    wh50Var3 = wh50Var;
                }
                uiy uiyVar2 = (uiy) x;
                ((zak0) uiyVar2.b).setValue(Boolean.valueOf(z));
                ((vak0) uiyVar2.c).g(f2);
                ((zak0) uiyVar2.d).setValue(Boolean.valueOf(z2));
                ((zak0) uiyVar2.e).setValue(wh50Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                uiyVar2.a(null, M, 0);
                M.j();
                wh50Var2 = wh50Var3;
                f3 = f2;
            } else {
                M.K(1284224632);
                int i5 = i2 >> 9;
                int i6 = ((i2 << 9) & 7168) | ((i2 >> 6) & 14) | 196608 | (i5 & 112) | (i5 & 896) | 24576;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1931927958, i6, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.Companion.invoke (PodcastBigPlayerControls.kt:102)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    wh50Var2 = wh50Var;
                    f3 = f3;
                    fgb0 fgb0Var = new fgb0(z, f3, z2, wh50Var2, izsVar);
                    M.R(fgb0Var);
                    x2 = fgb0Var;
                } else {
                    wh50Var2 = wh50Var;
                    f3 = f3;
                }
                fgb0 fgb0Var2 = (fgb0) x2;
                ((zak0) fgb0Var2.b).setValue(Boolean.valueOf(z));
                ((vak0) fgb0Var2.c).g(f3);
                ((zak0) fgb0Var2.d).setValue(Boolean.valueOf(z2));
                ((zak0) fgb0Var2.e).setValue(wh50Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fgb0Var2.a(null, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            wh50Var2 = wh50Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fkb0(izsVar, x17Var, z, wh50Var2, f3, z2, z3, i);
        }
    }

    public static final void b(final boolean z, final gfp0.c cVar, final dz40.g gVar, final wh50<Boolean> wh50Var, final mtk0<Boolean> mtk0Var, final pfl0 pfl0Var, final izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.a M = aVar.M(1171105667);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.J(cVar) ? 32 : 16) | (M.J(gVar) ? 256 : 128) | (M.J(pfl0Var) ? 131072 : 65536) | (M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1171105667, i2, -1, "com.vk.music.stickyplayer.presentation.Image (PodcastWithBottomPlayer.kt:407)");
            }
            if (cVar.a()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new wzs(z, cVar, gVar, wh50Var, mtk0Var, pfl0Var, izsVar, i) { // from class: xsna.gkb0
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ gfp0.c c;
                        public final /* synthetic */ dz40.g d;
                        public final /* synthetic */ wh50 e;
                        public final /* synthetic */ mtk0 f;
                        public final /* synthetic */ pfl0 g;
                        public final /* synthetic */ izs h;

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(27649);
                            vkb0.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                    s.d = wzsVar;
                }
                return;
            }
            int i3 = i2 >> 3;
            w3k.b(z, gVar, wh50Var, izsVar, pfl0Var, txj0.d(q630.a.a, 1.0f), mtk0Var, false, 0L, M, (i2 & 14) | 196608 | (i3 & 112) | 384 | ((i2 >> 9) & 7168) | (57344 & i3) | 1572864, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs(z, cVar, gVar, wh50Var, mtk0Var, pfl0Var, izsVar, i) { // from class: xsna.ikb0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gfp0.c c;
                public final /* synthetic */ dz40.g d;
                public final /* synthetic */ wh50 e;
                public final /* synthetic */ mtk0 f;
                public final /* synthetic */ pfl0 g;
                public final /* synthetic */ izs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(27649);
                    vkb0.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public static final void c(final dz40.p pVar, final int i, final int i2, final gfp0.c cVar, final dz40.c cVar2, final boolean z, final f3b0 f3b0Var, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2064489258);
        if ((i3 & 6) == 0) {
            i4 = (M.J(pVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.o(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.J(cVar) ? 2048 : 1024;
        }
        if ((196608 & i3) == 0) {
            i4 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= M.J(f3b0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= M.y(izsVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 67108864 : 33554432;
        } else {
            q630Var2 = q630Var;
        }
        if (M.t(i4 & 1, (38339731 & i4) != 38339730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2064489258, i4, -1, "com.vk.music.stickyplayer.presentation.PodcastContent (PodcastWithBottomPlayer.kt:139)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            final dlv0 dlv0Var = (dlv0) x;
            final wh50 c = jk50.c(pVar.i, M);
            final h17 g = f17.g(f17.f(BigPlayerBottomSheetValue.Collapsed, M), M, 2);
            int i5 = i4;
            if (f3b0Var.b().a instanceof qy40.b) {
                M.K(-738274600);
            } else {
                M.K(-731335870);
                s7k0 b = f3b0Var.b();
                boolean z2 = (i5 & 3670016) == 1048576;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new qkb0(dlv0Var, f3b0Var, null);
                    M.R(x2);
                }
                bap.g(b, (wzs) x2, M, 0);
            }
            M.j();
            Float valueOf = Float.valueOf(g.a.b());
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new rkb0(dlv0Var, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            ParentBottomSheetState a2 = f3b0Var.a();
            yzt0<dz40.h> yzt0Var = pVar.c;
            boolean J = ((i5 & 3670016) == 1048576) | M.J(g) | ((i5 & 29360128) == 8388608);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new skb0(f3b0Var, g, izsVar, null);
                M.R(x4);
            }
            bap.f(a2, yzt0Var, (wzs) x4, M, 0);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x5);
            }
            final wh50 wh50Var = (wh50) x5;
            final q630 q630Var3 = q630Var2;
            jai c2 = kai.c(-1033728270, new zzs() { // from class: xsna.mkb0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i6;
                    final mtk0 mtk0Var = (mtk0) obj;
                    final pfl0 pfl0Var = (pfl0) obj2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i6 = (aVar3.J(mtk0Var) ? 4 : 2) | intValue;
                    } else {
                        i6 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i6 |= aVar3.J(pfl0Var) ? 32 : 16;
                    }
                    if (aVar3.t(i6 & 1, (i6 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1033728270, i6, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous> (PodcastWithBottomPlayer.kt:169)");
                        }
                        q630 d = txj0.d(q630.this, 1.0f);
                        final f3b0 f3b0Var2 = f3b0Var;
                        final dz40.p pVar2 = pVar;
                        final gfp0.c cVar3 = cVar;
                        final int i7 = i2;
                        final int i8 = i;
                        final h17 h17Var = g;
                        final wh50 wh50Var2 = wh50Var;
                        final izs izsVar2 = izsVar;
                        final boolean z3 = z;
                        final mtk0 mtk0Var2 = c;
                        final dlv0 dlv0Var2 = dlv0Var;
                        ua8.a(d, null, false, kai.c(-542898212, new yzs() { // from class: xsna.okb0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.yzs
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                wh50 wh50Var3;
                                Object obj8;
                                boolean z4;
                                final wh50 wh50Var4;
                                pfl0 pfl0Var2;
                                wh50 wh50Var5;
                                boolean z5;
                                final mtk0 mtk0Var3;
                                h17 h17Var2;
                                final izs izsVar3;
                                wh50 wh50Var6;
                                final gfp0.c cVar4;
                                final boolean z6;
                                jai c3;
                                va8 va8Var = (va8) obj5;
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= aVar4.J(va8Var) ? 4 : 2;
                                }
                                if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-542898212, intValue2, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:174)");
                                    }
                                    final f3b0 f3b0Var3 = f3b0.this;
                                    zpx0 c4 = f3b0Var3.c();
                                    iyk0 iyk0Var = uvi.h;
                                    azl azlVar = (azl) aVar4.r(iyk0Var);
                                    final float j1 = azlVar.j1(c4.c(azlVar));
                                    azl azlVar2 = (azl) aVar4.r(iyk0Var);
                                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                    final float j12 = azlVar2.j1(c4.d(azlVar2, layoutDirection));
                                    azl azlVar3 = (azl) aVar4.r(iyk0Var);
                                    final float j13 = azlVar3.j1(c4.b(azlVar3, layoutDirection));
                                    final float g2 = (va8Var.g() - j1) - bw40.a;
                                    dz40.p pVar3 = pVar2;
                                    dz40.f fVar = pVar3.a;
                                    dz40.m mVar = pVar3.g;
                                    wh50 c5 = jk50.c(fVar.c, aVar4);
                                    wh50 c6 = jk50.c(fVar.g, aVar4);
                                    final wh50 c7 = jk50.c(pVar3.h, aVar4);
                                    boolean l = aVar4.l(((Boolean) c6.getValue()).booleanValue());
                                    Object x6 = aVar4.x();
                                    Object obj9 = a.C0011a.a;
                                    if (l || x6 == obj9) {
                                        x6 = bbk0.b(new ukb0(c6));
                                        aVar4.R(x6);
                                    }
                                    final mtk0 mtk0Var4 = (mtk0) x6;
                                    final wh50 c8 = jk50.c(pVar3.c, aVar4);
                                    wh50 c9 = jk50.c(pVar3.b, aVar4);
                                    pfl0 pfl0Var3 = pfl0Var;
                                    wh50 wh50Var7 = wh50Var2;
                                    if (pfl0Var3 == null) {
                                        aVar4.K(1367403024);
                                        aVar4.j();
                                        wh50Var4 = c6;
                                        pfl0Var2 = pfl0Var3;
                                        wh50Var3 = wh50Var7;
                                        obj8 = obj9;
                                        wh50Var5 = c9;
                                        z4 = true;
                                    } else {
                                        aVar4.K(1367403025);
                                        wh50Var3 = wh50Var7;
                                        obj8 = obj9;
                                        z4 = true;
                                        wh50Var4 = c6;
                                        tza0.a(((Boolean) wh50Var7.getValue()).booleanValue(), ((dz40.g) c9.getValue()).a(), pfl0Var3, 0L, aVar4, 0);
                                        pfl0Var2 = pfl0Var3;
                                        wow wowVar = new wow(((dz40.g) c9.getValue()).a);
                                        wh50Var5 = c9;
                                        boolean J2 = aVar4.J(pfl0Var2) | aVar4.J(wh50Var5);
                                        Object x7 = aVar4.x();
                                        if (J2 || x7 == obj8) {
                                            x7 = new tkb0(pfl0Var2, wh50Var5, null);
                                            aVar4.R(x7);
                                        }
                                        bap.g(wowVar, (wzs) x7, aVar4, 0);
                                        s3q0 s3q0Var = s3q0.a;
                                        aVar4.j();
                                        mVar = mVar;
                                    }
                                    final wh50 c10 = jk50.c(mVar.a, aVar4);
                                    final wh50 c11 = jk50.c(mVar.b, aVar4);
                                    final wh50 c12 = jk50.c(pVar3.f, aVar4);
                                    final wh50 c13 = jk50.c(pVar3.j, aVar4);
                                    Object x8 = aVar4.x();
                                    final gfp0.c cVar5 = cVar3;
                                    if (x8 == obj8) {
                                        x8 = androidx.compose.runtime.k.b(cVar5.a);
                                        aVar4.R(x8);
                                    }
                                    wh50 wh50Var8 = (wh50) x8;
                                    if (epx.f(cVar5.a, (String) wh50Var8.getValue())) {
                                        z5 = false;
                                    } else {
                                        wh50Var8.setValue(cVar5.a);
                                        z5 = z4;
                                    }
                                    final wh50 wh50Var9 = wh50Var5;
                                    final x17 q = sd9.q(!cVar5.a(), cVar5.f, i7, ((Number) c5.getValue()).intValue(), i8, aVar4);
                                    Object x9 = aVar4.x();
                                    final h17 h17Var3 = h17Var;
                                    if (x9 == obj8) {
                                        x9 = bbk0.b(new ag20(h17Var3, 21));
                                        aVar4.R(x9);
                                    }
                                    final mtk0 mtk0Var5 = (mtk0) x9;
                                    boolean J3 = aVar4.J(((wow) mtk0Var4.getValue()).b);
                                    Object x10 = aVar4.x();
                                    if (J3 || x10 == obj8) {
                                        x10 = androidx.compose.runtime.i.a(0);
                                        aVar4.R(x10);
                                    }
                                    final rg50 rg50Var = (rg50) x10;
                                    Object x11 = aVar4.x();
                                    if (x11 == obj8) {
                                        x11 = androidx.compose.runtime.k.b(Boolean.FALSE);
                                        aVar4.R(x11);
                                    }
                                    final wh50 wh50Var10 = (wh50) x11;
                                    Object x12 = aVar4.x();
                                    if (x12 == obj8) {
                                        x12 = androidx.compose.runtime.k.b(Boolean.FALSE);
                                        aVar4.R(x12);
                                    }
                                    final wh50 wh50Var11 = (wh50) x12;
                                    final wh50 c14 = jk50.c(fVar.h, aVar4);
                                    q630 E = ahn.E(q630.a.a, "player");
                                    float f = bw40.b;
                                    boolean z7 = !cVar5.a();
                                    float f2 = 16;
                                    uog0 d2 = vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                                    boolean booleanValue = ((Boolean) c14.getValue()).booleanValue();
                                    mtk0 mtk0Var6 = mtk0Var;
                                    final izs izsVar4 = izsVar2;
                                    final boolean z8 = z3;
                                    if (booleanValue) {
                                        aVar4.K(1372967617);
                                        aVar4.j();
                                        z6 = z8;
                                        h17Var2 = h17Var3;
                                        mtk0Var3 = mtk0Var6;
                                        wh50Var6 = c13;
                                        izsVar3 = izsVar4;
                                        c3 = null;
                                        cVar4 = cVar5;
                                    } else {
                                        aVar4.K(-2033918148);
                                        mtk0Var3 = mtk0Var6;
                                        zzs zzsVar = new zzs() { // from class: xsna.pkb0
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // xsna.zzs
                                            public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                                                float floatValue = ((Float) obj11).floatValue();
                                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj12;
                                                int intValue3 = ((Integer) obj13).intValue();
                                                if ((intValue3 & 48) == 0) {
                                                    intValue3 |= aVar5.n(floatValue) ? 32 : 16;
                                                }
                                                boolean z9 = false;
                                                if (aVar5.t(intValue3 & 1, (intValue3 & 145) != 144)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(892866062, intValue3, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:317)");
                                                    }
                                                    q630 H = s200.H(txj0.h(q630.a.a, g2), j12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                                                    List<T> list = ((wow) mtk0Var4.getValue()).b;
                                                    final mtk0 mtk0Var7 = c7;
                                                    dz40.w wVar = new dz40.w(((dz40.n.c) mtk0Var7.getValue()).a.size(), ((dz40.n.c) mtk0Var7.getValue()).b.size());
                                                    ParentBottomSheetState a3 = f3b0Var3.a();
                                                    if (((OnboardingStrategy) c13.getValue()) == OnboardingStrategy.SheetAnimation && ((Boolean) wh50Var4.getValue()).booleanValue()) {
                                                        z9 = true;
                                                    }
                                                    dz40.u uVar = new dz40.u(list, new dz40.v(a3, floatValue, z9), wVar);
                                                    final gfp0.c cVar6 = cVar5;
                                                    final boolean z10 = z8;
                                                    final h17 h17Var4 = h17Var3;
                                                    final mtk0 mtk0Var8 = mtk0Var3;
                                                    final wh50 wh50Var12 = wh50Var11;
                                                    final izs izsVar5 = izsVar4;
                                                    qzn0.d(h17Var4, rg50Var, uVar, izsVar5, H, kai.c(-1329960042, new yzs() { // from class: xsna.jkb0
                                                        @Override // xsna.yzs
                                                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                                                            PlayerSheetTab playerSheetTab = (PlayerSheetTab) obj14;
                                                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj15;
                                                            int intValue4 = ((Integer) obj16).intValue();
                                                            if ((intValue4 & 6) == 0) {
                                                                intValue4 |= aVar6.o(playerSheetTab.ordinal()) ? 4 : 2;
                                                            }
                                                            if (aVar6.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(-1329960042, intValue4, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:338)");
                                                                }
                                                                int i9 = vkb0.a.$EnumSwitchMapping$0[playerSheetTab.ordinal()];
                                                                if (i9 != 1) {
                                                                    if (i9 != 2) {
                                                                        throw alb0.c(1808655768, aVar6);
                                                                    }
                                                                    if (oq.h(234545020, aVar6)) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    return s3q0.a;
                                                                }
                                                                aVar6.K(1808678239);
                                                                dz40.n.c cVar7 = (dz40.n.c) mtk0Var7.getValue();
                                                                gfp0.c cVar8 = gfp0.c.this;
                                                                String str = cVar8.a;
                                                                boolean z11 = z10 && !cVar8.a();
                                                                boolean c15 = h17Var4.a.c();
                                                                boolean z12 = !cVar8.a();
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(886353956, 12585984, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastPlaybackQueue.Companion.invoke (PodcastPlaybackQueue.kt:59)");
                                                                }
                                                                Object x13 = aVar6.x();
                                                                if (x13 == a.C0011a.a) {
                                                                    jib0 jib0Var = new jib0(cVar7, str, z11, c15, z12, mtk0Var8, wh50Var12);
                                                                    aVar6.R(jib0Var);
                                                                    x13 = jib0Var;
                                                                }
                                                                jib0 jib0Var2 = (jib0) x13;
                                                                ((zak0) jib0Var2.c).setValue(cVar7);
                                                                ((zak0) jib0Var2.d).setValue(str);
                                                                ((zak0) jib0Var2.e).setValue(Boolean.valueOf(z11));
                                                                ((zak0) jib0Var2.f).setValue(Boolean.valueOf(c15));
                                                                ((zak0) jib0Var2.g).setValue(Boolean.valueOf(z12));
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                                jib0Var2.j(48, aVar6, izsVar5, txj0.d(q630.a.a, 1.0f));
                                                                aVar6.j();
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                            } else {
                                                                aVar6.h();
                                                            }
                                                            return s3q0.a;
                                                        }
                                                    }, aVar5), aVar5, 196608);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar5.h();
                                                }
                                                return s3q0.a;
                                            }
                                        };
                                        f3b0Var3 = f3b0Var3;
                                        h17Var2 = h17Var3;
                                        izsVar3 = izsVar4;
                                        wh50Var6 = c13;
                                        cVar4 = cVar5;
                                        z6 = z8;
                                        c3 = kai.c(892866062, zzsVar, aVar4);
                                        aVar4.j();
                                    }
                                    final mtk0 mtk0Var7 = mtk0Var2;
                                    final boolean z9 = z6;
                                    jai c15 = kai.c(1749125746, new wzs() { // from class: xsna.xjb0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj10, Object obj11) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1749125746, intValue3, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:253)");
                                                }
                                                float floatValue = ((Number) mtk0Var5.getValue()).floatValue();
                                                boolean booleanValue2 = ((Boolean) mtk0Var7.getValue()).booleanValue();
                                                final izs izsVar5 = izsVar3;
                                                final mtk0 mtk0Var8 = c8;
                                                final wh50 wh50Var12 = c14;
                                                jai c16 = kai.c(746962331, new yzs() { // from class: xsna.dkb0
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                        q630 q630Var4 = (q630) obj12;
                                                        androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj13;
                                                        int intValue4 = ((Integer) obj14).intValue();
                                                        if ((intValue4 & 6) == 0) {
                                                            intValue4 |= aVar6.J(q630Var4) ? 4 : 2;
                                                        }
                                                        if (aVar6.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(746962331, intValue4, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:258)");
                                                            }
                                                            s1b0.a((dz40.h) mtk0Var8.getValue(), izs.this, ((Boolean) wh50Var12.getValue()).booleanValue(), q630Var4, aVar6, (intValue4 << 9) & 7168);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar6.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar5);
                                                final gfp0.c cVar6 = cVar4;
                                                final boolean z10 = z9;
                                                s8p0.b(j1, floatValue, cVar6, izsVar5, booleanValue2, c16, kai.c(-380414214, new yzs() { // from class: xsna.ekb0
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                        q630 q630Var4 = (q630) obj12;
                                                        androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj13;
                                                        int intValue4 = ((Integer) obj14).intValue();
                                                        if ((intValue4 & 6) == 0) {
                                                            intValue4 |= aVar6.J(q630Var4) ? 4 : 2;
                                                        }
                                                        if (aVar6.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(-380414214, intValue4, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:267)");
                                                            }
                                                            vkb0.e(gfp0.c.this, z10, izsVar5, q630Var4, aVar6, (intValue4 << 9) & 7168);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar6.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar5), aVar5, 1769472);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    final pfl0 pfl0Var4 = pfl0Var2;
                                    final gfp0.c cVar6 = cVar4;
                                    final izs izsVar5 = izsVar3;
                                    jai c16 = kai.c(1987992179, new wzs() { // from class: xsna.yjb0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj10, Object obj11) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1987992179, intValue3, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:278)");
                                                }
                                                vkb0.b(z6, cVar6, (dz40.g) wh50Var9.getValue(), wh50Var10, wh50Var11, pfl0Var4, izsVar5, aVar5, 27648);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    final wh50 wh50Var12 = wh50Var6;
                                    final h17 h17Var4 = h17Var2;
                                    final boolean z10 = z5;
                                    jai c17 = kai.c(-2068108684, new wzs() { // from class: xsna.zjb0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj10, Object obj11) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-2068108684, intValue3, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:289)");
                                                }
                                                cgb0.b(cVar4, new dz40.a(((ipw) c12.getValue()).b, new dz40.e(f3b0.this.a(), (BigPlayerBottomSheetValue) ((zak0) h17Var4.a.c.g).getValue(), ((OnboardingStrategy) wh50Var12.getValue()) == OnboardingStrategy.ChipsAnimation), z10, ((Boolean) c14.getValue()).booleanValue(), ((Boolean) c11.getValue()).booleanValue()), izsVar3, aVar5, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    final boolean z11 = z6;
                                    final izs izsVar6 = izsVar3;
                                    jai c18 = kai.c(-1829242251, new wzs() { // from class: xsna.akb0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj10, Object obj11) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-1829242251, intValue3, -1, "com.vk.music.stickyplayer.presentation.PodcastContent.<anonymous>.<anonymous>.<anonymous> (PodcastWithBottomPlayer.kt:306)");
                                                }
                                                vkb0.a(izs.this, q, z11, wh50Var10, ((Number) c10.getValue()).floatValue(), ((Boolean) c11.getValue()).booleanValue(), ((Boolean) c14.getValue()).booleanValue(), aVar5, 3072);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    jai c19 = kai.c(-1386573464, new bkb0(dlv0Var2, f3b0Var3, izsVar6, 0), aVar4);
                                    Object x13 = aVar4.x();
                                    if (x13 == obj8) {
                                        x13 = new ckb0(0, wh50Var3);
                                        aVar4.R(x13);
                                    }
                                    f17.a(E, c3, c15, c16, c17, c18, c19, h17Var2, z7, d2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mtk0Var3, f, (izs) x13, aVar4, 1797510, 3456, 1024);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar3), aVar3, 3072, 6);
                        if (((Boolean) mtk0Var2.getValue()).booleanValue()) {
                            aVar3.K(-874052743);
                            q630 m = hr80.m(txj0.d(q630.a.a, 1.0f), l5g.j, androidx.compose.ui.graphics.e.a);
                            Object x6 = aVar3.x();
                            if (x6 == a.C0011a.a) {
                                x6 = new tj2(18);
                                aVar3.R(x6);
                            }
                            ja8.a(ojc.c(m, false, null, null, (gzs) x6, 14), aVar3, 0);
                        } else {
                            aVar3.K(-891063280);
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M);
            aVar2 = M;
            rfl0.a(384, 3, aVar2, c2, null, false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nkb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vkb0.c(dz40.p.this, i, i2, cVar, cVar2, z, f3b0Var, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final dz40.p pVar, final f3b0 f3b0Var, final BottomPlayerAppearance bottomPlayerAppearance, final izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        wh50 wh50Var;
        wh50 wh50Var2;
        wh50 wh50Var3;
        wh50 wh50Var4;
        String str;
        float f;
        Thumb thumb;
        Boolean bool;
        final wh50 wh50Var5;
        String str2;
        b78 b78Var;
        dz40.f fVar = pVar.a;
        androidx.compose.runtime.a M = aVar.M(1630044102);
        if ((i & 6) == 0) {
            i2 = (M.J(pVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(1630044102, i3, -1, "com.vk.music.stickyplayer.presentation.PodcastWithBottomPlayer (PodcastWithBottomPlayer.kt:72)");
            }
            final wh50 c = jk50.c(pVar.d, M);
            final wh50 c2 = jk50.c(pVar.e, M);
            final wh50 c3 = jk50.c(fVar.d, M);
            wh50 c4 = jk50.c(fVar.b, M);
            wh50 c5 = jk50.c(fVar.a, M);
            wh50 c6 = jk50.c(fVar.e, M);
            wh50 c7 = jk50.c(fVar.f, M);
            boolean o = M.o(((Number) c4.getValue()).intValue()) | M.o(((Number) c5.getValue()).intValue());
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = bbk0.b(new dy0(23, c5, c4));
                M.R(x);
            }
            Boolean bool2 = (Boolean) c3.getValue();
            boolean booleanValue = bool2.booleanValue();
            float floatValue = ((Number) ((mtk0) x).getValue()).floatValue();
            gfp0.c cVar = (gfp0.c) c.getValue();
            int i4 = i3 & 7168;
            if (androidx.compose.runtime.b.d()) {
                wh50Var = c7;
                wh50Var2 = c4;
                androidx.compose.runtime.b.f(-1235110175, i4, -1, "com.vk.music.stickyplayer.presentation.rememberBottomPlayerState (PodcastWithBottomPlayer.kt:377)");
            } else {
                wh50Var = c7;
                wh50Var2 = c4;
            }
            if (cVar.a()) {
                M.K(-182148824);
                b78 a2 = b78.f.a.a(booleanValue, floatValue, izsVar, M, ((i4 >> 3) & 896) | 3072);
                M.j();
                wh50Var3 = c5;
                wh50Var5 = c6;
                b78Var = a2;
            } else {
                M.K(-181984834);
                String str3 = cVar.c;
                boolean z = cVar.e;
                String str4 = cVar.d;
                Thumb thumb2 = cVar.b;
                int i5 = 12582912 | ((i4 << 9) & 3670016);
                if (androidx.compose.runtime.b.d()) {
                    wh50Var3 = c5;
                    wh50Var4 = c6;
                    str = str3;
                    androidx.compose.runtime.b.f(1105978612, i5, -1, "com.vk.music.stickyplayer.presentation.components.BottomPlayerState.Podcast.Companion.invoke (BottomPlayerState.kt:176)");
                } else {
                    wh50Var3 = c5;
                    wh50Var4 = c6;
                    str = str3;
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    f = floatValue;
                    thumb = thumb2;
                    bool = bool2;
                    wh50Var5 = wh50Var4;
                    str2 = str;
                    b78.h hVar = new b78.h(str2, z, str4, booleanValue, thumb, f, izsVar);
                    M.R(hVar);
                    x2 = hVar;
                } else {
                    f = floatValue;
                    thumb = thumb2;
                    bool = bool2;
                    wh50Var5 = wh50Var4;
                    str2 = str;
                }
                b78.h hVar2 = (b78.h) x2;
                ((zak0) hVar2.a).setValue(str2);
                ((zak0) hVar2.b).setValue(Boolean.valueOf(z));
                ((zak0) hVar2.c).setValue(str4);
                ((zak0) hVar2.d).setValue(bool);
                ((zak0) hVar2.e).setValue(thumb);
                ((vak0) hVar2.f).g(f);
                ((zak0) hVar2.g).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                b78Var = hVar2;
            }
            final b78 b78Var2 = b78Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final wh50 wh50Var6 = wh50Var;
            final wh50 wh50Var7 = wh50Var2;
            final wh50 wh50Var8 = wh50Var3;
            aVar2 = M;
            vmj.b(f3b0Var.c(), ((vak0) f3b0Var.b).getFloatValue(), bottomPlayerAppearance, kai.c(-863659982, new yzs() { // from class: xsna.hkb0
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
                            androidx.compose.runtime.b.f(-863659982, intValue, -1, "com.vk.music.stickyplayer.presentation.PodcastWithBottomPlayer.<anonymous> (PodcastWithBottomPlayer.kt:99)");
                        }
                        vkb0.c(dz40.p.this, ((Number) wh50Var7.getValue()).intValue(), ((Number) wh50Var8.getValue()).intValue(), (gfp0.c) c.getValue(), (dz40.c) c2.getValue(), ((Boolean) c3.getValue()).booleanValue(), f3b0Var, izsVar, q630Var, aVar3, (intValue << 24) & 234881024);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(646361843, new yzs() { // from class: xsna.lkb0
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
                            androidx.compose.runtime.b.f(646361843, intValue, -1, "com.vk.music.stickyplayer.presentation.PodcastWithBottomPlayer.<anonymous> (PodcastWithBottomPlayer.kt:112)");
                        }
                        vmj.a(b78.this, bottomPlayerAppearance, ((Boolean) wh50Var5.getValue()).booleanValue(), ((Boolean) wh50Var6.getValue()).booleanValue(), false, ahn.E(q630.a.a, "smallPlayer").g(q630Var), aVar3, 24576);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), !((gfp0.c) c.getValue()).a(), aVar2, (i3 & 896) | 27648);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new foj(pVar, f3b0Var, bottomPlayerAppearance, izsVar, i);
        }
    }

    public static final void e(final gfp0.c cVar, final boolean z, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        b9p0 b9p0Var;
        c9p0.d dVar;
        androidx.compose.runtime.a M = aVar.M(1845745168);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1845745168, i2, -1, "com.vk.music.stickyplayer.presentation.TopControls (PodcastWithBottomPlayer.kt:466)");
            }
            boolean a2 = cVar.a();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (a2) {
                M.K(-1871771132);
                M.j();
                b9p0Var = b9p0.c.a;
            } else {
                M.K(-1871714898);
                String str = cVar.c;
                boolean z2 = cVar.e;
                String str2 = cVar.d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1137650200, 3072, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.Podcast.Companion.invoke (TopPlayerControls.kt:274)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new b9p0.e(str, z2, str2);
                    M.R(x);
                }
                b9p0.e eVar = (b9p0.e) x;
                ((zak0) eVar.a).setValue(str);
                ((zak0) eVar.b).setValue(Boolean.valueOf(z2));
                ((zak0) eVar.c).setValue(str2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                b9p0Var = eVar;
            }
            if (cVar.a()) {
                M.K(-1871481871);
                int i3 = ((i2 >> 3) & 112) | 390;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1303088802, i3, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.PodcastButtons.Companion.invoke (TopPlayerControls.kt:641)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new c9p0.d(izsVar, false);
                    M.R(x2);
                }
                dVar = (c9p0.d) x2;
                ((zak0) dVar.a).setValue(Boolean.FALSE);
                ((zak0) dVar.b).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1871347827);
                int i4 = i2 >> 3;
                int i5 = (i4 & 112) | (i4 & 14) | 384;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1303088802, i5, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.PodcastButtons.Companion.invoke (TopPlayerControls.kt:641)");
                }
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new c9p0.d(izsVar, z);
                    M.R(x3);
                }
                dVar = (c9p0.d) x3;
                ((zak0) dVar.a).setValue(Boolean.valueOf(z));
                ((zak0) dVar.b).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            f9p0.b(cVar.b, b9p0Var, dVar, q630Var, null, M, i2 & 7168, 16);
            q630Var2 = q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kkb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vkb0.e(gfp0.c.this, z, izsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
