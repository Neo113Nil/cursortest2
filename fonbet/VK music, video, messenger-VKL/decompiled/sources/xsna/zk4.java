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
import xsna.zk4;

/* compiled from: AudioBookWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class zk4 {

    /* compiled from: AudioBookWithBottomPlayer.kt */
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

    public static final void a(final dz40.b bVar, final int i, final int i2, final gfp0.a aVar, final dz40.c cVar, final boolean z, final f3b0 f3b0Var, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i3) {
        int i4;
        q630 q630Var2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-2072660374);
        if ((i3 & 6) == 0) {
            i4 = (M.J(bVar) ? 4 : 2) | i3;
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
            i4 |= M.J(aVar) ? 2048 : 1024;
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
                androidx.compose.runtime.b.f(-2072660374, i4, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent (AudioBookWithBottomPlayer.kt:139)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            final dlv0 dlv0Var = (dlv0) x;
            final wh50 c = jk50.c(bVar.i, M);
            final h17 g = f17.g(f17.f(BigPlayerBottomSheetValue.Collapsed, M), M, 2);
            int i5 = i4;
            if (f3b0Var.b().a instanceof qy40.b) {
                M.K(2113461368);
            } else {
                M.K(2120476482);
                s7k0 b = f3b0Var.b();
                boolean z2 = (i5 & 3670016) == 1048576;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new uk4(dlv0Var, f3b0Var, null);
                    M.R(x2);
                }
                bap.g(b, (wzs) x2, M, 0);
            }
            M.j();
            Float valueOf = Float.valueOf(g.a.b());
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new vk4(dlv0Var, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            ParentBottomSheetState a2 = f3b0Var.a();
            yzt0<dz40.h> yzt0Var = bVar.c;
            boolean J = ((i5 & 3670016) == 1048576) | M.J(g) | ((i5 & 29360128) == 8388608);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new wk4(f3b0Var, g, izsVar, null);
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
            jai c2 = kai.c(43934258, new zzs() { // from class: xsna.pk4
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i6;
                    final mtk0 mtk0Var = (mtk0) obj;
                    final pfl0 pfl0Var = (pfl0) obj2;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i6 = (aVar4.J(mtk0Var) ? 4 : 2) | intValue;
                    } else {
                        i6 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i6 |= aVar4.J(pfl0Var) ? 32 : 16;
                    }
                    if (aVar4.t(i6 & 1, (i6 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(43934258, i6, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous> (AudioBookWithBottomPlayer.kt:169)");
                        }
                        q630 d = txj0.d(q630.this, 1.0f);
                        final f3b0 f3b0Var2 = f3b0Var;
                        final dz40.b bVar2 = bVar;
                        final gfp0.a aVar5 = aVar;
                        final int i7 = i2;
                        final int i8 = i;
                        final h17 h17Var = g;
                        final wh50 wh50Var2 = wh50Var;
                        final izs izsVar2 = izsVar;
                        final boolean z3 = z;
                        final mtk0 mtk0Var2 = c;
                        final dlv0 dlv0Var2 = dlv0Var;
                        ua8.a(d, null, false, kai.c(-378187492, new yzs() { // from class: xsna.rk4
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
                                wh50 wh50Var6;
                                boolean z6;
                                jai c3;
                                va8 va8Var = (va8) obj5;
                                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= aVar6.J(va8Var) ? 4 : 2;
                                }
                                if (aVar6.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-378187492, intValue2, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:174)");
                                    }
                                    final f3b0 f3b0Var3 = f3b0.this;
                                    zpx0 c4 = f3b0Var3.c();
                                    iyk0 iyk0Var = uvi.h;
                                    azl azlVar = (azl) aVar6.r(iyk0Var);
                                    final float j1 = azlVar.j1(c4.c(azlVar));
                                    azl azlVar2 = (azl) aVar6.r(iyk0Var);
                                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                    final float j12 = azlVar2.j1(c4.d(azlVar2, layoutDirection));
                                    azl azlVar3 = (azl) aVar6.r(iyk0Var);
                                    final float j13 = azlVar3.j1(c4.b(azlVar3, layoutDirection));
                                    final float g2 = (va8Var.g() - j1) - bw40.a;
                                    dz40.b bVar3 = bVar2;
                                    dz40.f fVar = bVar3.a;
                                    dz40.m mVar = bVar3.g;
                                    wh50 c5 = jk50.c(fVar.c, aVar6);
                                    wh50 c6 = jk50.c(fVar.g, aVar6);
                                    final wh50 c7 = jk50.c(bVar3.h, aVar6);
                                    boolean l = aVar6.l(((Boolean) c6.getValue()).booleanValue());
                                    Object x6 = aVar6.x();
                                    Object obj9 = a.C0011a.a;
                                    if (l || x6 == obj9) {
                                        x6 = bbk0.b(new yk4(c6));
                                        aVar6.R(x6);
                                    }
                                    final mtk0 mtk0Var4 = (mtk0) x6;
                                    final wh50 c8 = jk50.c(bVar3.c, aVar6);
                                    wh50 c9 = jk50.c(bVar3.b, aVar6);
                                    pfl0 pfl0Var3 = pfl0Var;
                                    wh50 wh50Var7 = wh50Var2;
                                    if (pfl0Var3 == null) {
                                        aVar6.K(-883156784);
                                        aVar6.j();
                                        wh50Var4 = c6;
                                        pfl0Var2 = pfl0Var3;
                                        wh50Var3 = wh50Var7;
                                        obj8 = obj9;
                                        wh50Var5 = c9;
                                        z4 = true;
                                    } else {
                                        aVar6.K(-883156783);
                                        wh50Var3 = wh50Var7;
                                        obj8 = obj9;
                                        z4 = true;
                                        wh50Var4 = c6;
                                        tza0.a(((Boolean) wh50Var7.getValue()).booleanValue(), ((dz40.g) c9.getValue()).a(), pfl0Var3, 0L, aVar6, 0);
                                        pfl0Var2 = pfl0Var3;
                                        wow wowVar = new wow(((dz40.g) c9.getValue()).a);
                                        wh50Var5 = c9;
                                        boolean J2 = aVar6.J(pfl0Var2) | aVar6.J(wh50Var5);
                                        Object x7 = aVar6.x();
                                        if (J2 || x7 == obj8) {
                                            x7 = new xk4(pfl0Var2, wh50Var5, null);
                                            aVar6.R(x7);
                                        }
                                        bap.g(wowVar, (wzs) x7, aVar6, 0);
                                        s3q0 s3q0Var = s3q0.a;
                                        aVar6.j();
                                        mVar = mVar;
                                    }
                                    final wh50 c10 = jk50.c(mVar.a, aVar6);
                                    final wh50 c11 = jk50.c(mVar.b, aVar6);
                                    final wh50 c12 = jk50.c(bVar3.j, aVar6);
                                    final wh50 c13 = jk50.c(bVar3.f, aVar6);
                                    Object x8 = aVar6.x();
                                    final gfp0.a aVar7 = aVar5;
                                    if (x8 == obj8) {
                                        x8 = androidx.compose.runtime.k.b(aVar7.a);
                                        aVar6.R(x8);
                                    }
                                    wh50 wh50Var8 = (wh50) x8;
                                    if (epx.f(aVar7.a, (String) wh50Var8.getValue())) {
                                        z5 = false;
                                    } else {
                                        wh50Var8.setValue(aVar7.a);
                                        z5 = z4;
                                    }
                                    wh50 wh50Var9 = wh50Var5;
                                    final x17 q = sd9.q(!aVar7.a(), aVar7.f, i7, ((Number) c5.getValue()).intValue(), i8, aVar6);
                                    Object x9 = aVar6.x();
                                    final h17 h17Var3 = h17Var;
                                    if (x9 == obj8) {
                                        x9 = bbk0.b(new w40(h17Var3, 7));
                                        aVar6.R(x9);
                                    }
                                    final mtk0 mtk0Var5 = (mtk0) x9;
                                    boolean J3 = aVar6.J(((wow) mtk0Var4.getValue()).b);
                                    Object x10 = aVar6.x();
                                    if (J3 || x10 == obj8) {
                                        x10 = androidx.compose.runtime.i.a(0);
                                        aVar6.R(x10);
                                    }
                                    final rg50 rg50Var = (rg50) x10;
                                    Object x11 = aVar6.x();
                                    if (x11 == obj8) {
                                        x11 = androidx.compose.runtime.k.b(Boolean.FALSE);
                                        aVar6.R(x11);
                                    }
                                    final wh50 wh50Var10 = (wh50) x11;
                                    final wh50 c14 = jk50.c(fVar.h, aVar6);
                                    q630 E = ahn.E(q630.a.a, "player");
                                    float f = bw40.b;
                                    boolean z7 = !aVar7.a();
                                    float f2 = 16;
                                    uog0 d2 = vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                                    boolean booleanValue = ((Boolean) c14.getValue()).booleanValue();
                                    mtk0 mtk0Var6 = mtk0Var;
                                    final izs izsVar3 = izsVar2;
                                    final boolean z8 = z3;
                                    if (booleanValue) {
                                        aVar6.K(-877733055);
                                        aVar6.j();
                                        z6 = z8;
                                        h17Var2 = h17Var3;
                                        mtk0Var3 = mtk0Var6;
                                        wh50Var6 = c12;
                                        c3 = null;
                                    } else {
                                        aVar6.K(1634256491);
                                        mtk0Var3 = mtk0Var6;
                                        zzs zzsVar = new zzs() { // from class: xsna.tk4
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // xsna.zzs
                                            public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                                                float floatValue = ((Float) obj11).floatValue();
                                                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj12;
                                                int intValue3 = ((Integer) obj13).intValue();
                                                if ((intValue3 & 48) == 0) {
                                                    intValue3 |= aVar8.n(floatValue) ? 32 : 16;
                                                }
                                                boolean z9 = false;
                                                if (aVar8.t(intValue3 & 1, (intValue3 & 145) != 144)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-83819186, intValue3, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:315)");
                                                    }
                                                    q630 H = s200.H(txj0.h(q630.a.a, g2), j12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                                                    List<T> list = ((wow) mtk0Var4.getValue()).b;
                                                    final mtk0 mtk0Var7 = c7;
                                                    dz40.w wVar = new dz40.w(((dz40.n.a) mtk0Var7.getValue()).a.size(), ((dz40.n.a) mtk0Var7.getValue()).b.size());
                                                    ParentBottomSheetState a3 = f3b0Var3.a();
                                                    if (((OnboardingStrategy) c12.getValue()) == OnboardingStrategy.SheetAnimation && ((Boolean) wh50Var4.getValue()).booleanValue()) {
                                                        z9 = true;
                                                    }
                                                    dz40.u uVar = new dz40.u(list, new dz40.v(a3, floatValue, z9), wVar);
                                                    final gfp0.a aVar9 = aVar7;
                                                    final boolean z10 = z8;
                                                    final h17 h17Var4 = h17Var3;
                                                    final mtk0 mtk0Var8 = mtk0Var3;
                                                    final izs izsVar4 = izsVar3;
                                                    qzn0.d(h17Var4, rg50Var, uVar, izsVar4, H, kai.c(1966168790, new yzs() { // from class: xsna.mk4
                                                        @Override // xsna.yzs
                                                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                                                            PlayerSheetTab playerSheetTab = (PlayerSheetTab) obj14;
                                                            androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj15;
                                                            int intValue4 = ((Integer) obj16).intValue();
                                                            if ((intValue4 & 6) == 0) {
                                                                intValue4 |= aVar10.o(playerSheetTab.ordinal()) ? 4 : 2;
                                                            }
                                                            if (aVar10.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(1966168790, intValue4, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:336)");
                                                                }
                                                                int i9 = zk4.a.$EnumSwitchMapping$0[playerSheetTab.ordinal()];
                                                                if (i9 != 1) {
                                                                    if (i9 != 2) {
                                                                        throw alb0.c(-297401209, aVar10);
                                                                    }
                                                                    if (oq.h(-628789668, aVar10)) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    return s3q0.a;
                                                                }
                                                                aVar10.K(-297381249);
                                                                dz40.n.a aVar11 = (dz40.n.a) mtk0Var7.getValue();
                                                                gfp0.a aVar12 = gfp0.a.this;
                                                                String str = aVar12.a;
                                                                boolean z11 = z10 && !aVar12.a();
                                                                boolean c15 = h17Var4.a.c();
                                                                boolean z12 = !aVar12.a();
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(-1174703978, 1572864, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookPlaybackQueue.Companion.invoke (AudioBookPlaybackQueue.kt:56)");
                                                                }
                                                                Object x12 = aVar10.x();
                                                                if (x12 == a.C0011a.a) {
                                                                    xi4 xi4Var = new xi4(aVar11, str, z11, c15, z12, mtk0Var8, null);
                                                                    aVar10.R(xi4Var);
                                                                    x12 = xi4Var;
                                                                }
                                                                xi4 xi4Var2 = (xi4) x12;
                                                                ((zak0) xi4Var2.c).setValue(aVar11);
                                                                ((zak0) xi4Var2.d).setValue(str);
                                                                ((zak0) xi4Var2.e).setValue(Boolean.valueOf(z11));
                                                                ((zak0) xi4Var2.f).setValue(Boolean.valueOf(c15));
                                                                ((zak0) xi4Var2.g).setValue(Boolean.valueOf(z12));
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                                xi4Var2.j(48, aVar10, izsVar4, txj0.d(q630.a.a, 1.0f));
                                                                aVar10.j();
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.e();
                                                                }
                                                            } else {
                                                                aVar10.h();
                                                            }
                                                            return s3q0.a;
                                                        }
                                                    }, aVar8), aVar8, 196608);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar8.h();
                                                }
                                                return s3q0.a;
                                            }
                                        };
                                        f3b0Var3 = f3b0Var3;
                                        h17Var2 = h17Var3;
                                        wh50Var6 = c12;
                                        z6 = z8;
                                        c3 = kai.c(-83819186, zzsVar, aVar6);
                                        aVar6.j();
                                    }
                                    final mtk0 mtk0Var7 = mtk0Var2;
                                    final boolean z9 = z6;
                                    jai c15 = kai.c(629792178, new wzs() { // from class: xsna.ak4
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj10, Object obj11) {
                                            androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar8.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(629792178, intValue3, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:252)");
                                                }
                                                float floatValue = ((Number) mtk0Var5.getValue()).floatValue();
                                                boolean booleanValue2 = ((Boolean) mtk0Var7.getValue()).booleanValue();
                                                final izs izsVar4 = izsVar3;
                                                final mtk0 mtk0Var8 = c8;
                                                final wh50 wh50Var11 = c14;
                                                jai c16 = kai.c(-958343205, new yzs() { // from class: xsna.hk4
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                        q630 q630Var4 = (q630) obj12;
                                                        androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj13;
                                                        int intValue4 = ((Integer) obj14).intValue();
                                                        if ((intValue4 & 6) == 0) {
                                                            intValue4 |= aVar9.J(q630Var4) ? 4 : 2;
                                                        }
                                                        if (aVar9.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(-958343205, intValue4, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:257)");
                                                            }
                                                            s1b0.a((dz40.h) mtk0Var8.getValue(), izs.this, ((Boolean) wh50Var11.getValue()).booleanValue(), q630Var4, aVar9, (intValue4 << 9) & 7168);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar9.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar8);
                                                final gfp0.a aVar9 = aVar7;
                                                final boolean z10 = z9;
                                                s8p0.b(j1, floatValue, aVar9, izsVar4, booleanValue2, c16, kai.c(1382720058, new yzs() { // from class: xsna.ik4
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                        q630 q630Var4 = (q630) obj12;
                                                        androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj13;
                                                        int intValue4 = ((Integer) obj14).intValue();
                                                        if ((intValue4 & 6) == 0) {
                                                            intValue4 |= aVar10.J(q630Var4) ? 4 : 2;
                                                        }
                                                        if (aVar10.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(1382720058, intValue4, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:266)");
                                                            }
                                                            zk4.e(gfp0.a.this, z10, izsVar4, q630Var4, aVar10, (intValue4 << 9) & 7168);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar10.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar8), aVar8, 1769472);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar8.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar6);
                                    jai c16 = kai.c(1715150003, new bk4(z6, aVar7, wh50Var10, pfl0Var2, izsVar3, wh50Var9), aVar6);
                                    final wh50 wh50Var11 = wh50Var6;
                                    final h17 h17Var4 = h17Var2;
                                    final boolean z10 = z5;
                                    jai c17 = kai.c(-1494459468, new wzs() { // from class: xsna.ck4
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj10, Object obj11) {
                                            androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar8.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-1494459468, intValue3, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:287)");
                                                }
                                                bd4.a(gfp0.a.this, new dz40.a(((ipw) c13.getValue()).b, new dz40.e(f3b0Var3.a(), (BigPlayerBottomSheetValue) ((zak0) h17Var4.a.c.g).getValue(), ((OnboardingStrategy) wh50Var11.getValue()) == OnboardingStrategy.ChipsAnimation), z10, ((Boolean) c14.getValue()).booleanValue(), ((Boolean) c11.getValue()).booleanValue()), izsVar3, aVar8, 0);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar8.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar6);
                                    final boolean z11 = z6;
                                    jai c18 = kai.c(-409101643, new wzs() { // from class: xsna.dk4
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj10, Object obj11) {
                                            androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj10;
                                            int intValue3 = ((Integer) obj11).intValue();
                                            if (aVar8.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-409101643, intValue3, -1, "com.vk.music.stickyplayer.presentation.AudioBookContent.<anonymous>.<anonymous>.<anonymous> (AudioBookWithBottomPlayer.kt:304)");
                                                }
                                                zk4.c(izs.this, q, z11, wh50Var10, ((Number) c10.getValue()).floatValue(), ((Boolean) c11.getValue()).booleanValue(), ((Boolean) c14.getValue()).booleanValue(), aVar8, 3072);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar8.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar6);
                                    jai c19 = kai.c(1442811560, new ek4(dlv0Var2, f3b0Var3, izsVar3), aVar6);
                                    Object x12 = aVar6.x();
                                    if (x12 == obj8) {
                                        x12 = new fk4(0, wh50Var3);
                                        aVar6.R(x12);
                                    }
                                    f17.a(E, c3, c15, c16, c17, c18, c19, h17Var2, z7, d2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mtk0Var3, f, (izs) x12, aVar6, 1797510, 3456, 1024);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar6.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar4), aVar4, 3072, 6);
                        if (((Boolean) mtk0Var2.getValue()).booleanValue()) {
                            aVar4.K(-1110439911);
                            q630 m = hr80.m(txj0.d(q630.a.a, 1.0f), l5g.j, androidx.compose.ui.graphics.e.a);
                            Object x6 = aVar4.x();
                            if (x6 == a.C0011a.a) {
                                x6 = new sk4(0);
                                aVar4.R(x6);
                            }
                            ja8.a(ojc.c(m, false, null, null, (gzs) x6, 14), aVar4, 0);
                        } else {
                            aVar4.K(-1127305616);
                        }
                        aVar4.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M);
            aVar3 = M;
            rfl0.a(384, 3, aVar3, c2, null, false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qk4
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zk4.a(dz40.b.this, i, i2, aVar, cVar, z, f3b0Var, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final dz40.b bVar, final f3b0 f3b0Var, final BottomPlayerAppearance bottomPlayerAppearance, final izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        wh50 wh50Var;
        Thumb thumb;
        wh50 wh50Var2;
        boolean z;
        Boolean bool;
        Thumb thumb2;
        wh50 wh50Var3;
        b78 b78Var;
        dz40.f fVar = bVar.a;
        androidx.compose.runtime.a M = aVar.M(-49673579);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-49673579, i3, -1, "com.vk.music.stickyplayer.presentation.AudioBookWithBottomPlayer (AudioBookWithBottomPlayer.kt:71)");
            }
            final wh50 c = jk50.c(bVar.d, M);
            final wh50 c2 = jk50.c(bVar.e, M);
            final wh50 c3 = jk50.c(fVar.d, M);
            wh50 c4 = jk50.c(fVar.b, M);
            wh50 c5 = jk50.c(fVar.a, M);
            final wh50 c6 = jk50.c(fVar.e, M);
            final wh50 c7 = jk50.c(fVar.f, M);
            final wh50 c8 = jk50.c(fVar.i, M);
            boolean o = M.o(((Number) c4.getValue()).intValue()) | M.o(((Number) c5.getValue()).intValue());
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = bbk0.b(new com.vk.movika.sdk.base.presenter.c(5, c5, c4));
                M.R(x);
            }
            gfp0.a aVar3 = (gfp0.a) c.getValue();
            float floatValue = ((Number) ((mtk0) x).getValue()).floatValue();
            Boolean bool2 = (Boolean) c3.getValue();
            boolean booleanValue = bool2.booleanValue();
            int i4 = i3 & 7168;
            if (androidx.compose.runtime.b.d()) {
                wh50Var = c4;
                androidx.compose.runtime.b.f(1004330859, i4, -1, "com.vk.music.stickyplayer.presentation.rememberBottomPlayerState (AudioBookWithBottomPlayer.kt:373)");
            } else {
                wh50Var = c4;
            }
            if (aVar3.a()) {
                M.K(1278688286);
                b78 a2 = b78.f.a.a(booleanValue, floatValue, izsVar, M, ((i4 >> 3) & 896) | 3072);
                M.j();
                wh50Var3 = c5;
                b78Var = a2;
            } else {
                M.K(1278852276);
                String str = aVar3.c;
                boolean z2 = aVar3.e;
                String str2 = aVar3.d;
                Thumb thumb3 = aVar3.b;
                int i5 = 12582912 | ((i4 << 9) & 3670016);
                if (androidx.compose.runtime.b.d()) {
                    thumb = thumb3;
                    wh50Var2 = c5;
                    androidx.compose.runtime.b.f(-1801970006, i5, -1, "com.vk.music.stickyplayer.presentation.components.BottomPlayerState.AudioBook.Companion.invoke (BottomPlayerState.kt:221)");
                } else {
                    thumb = thumb3;
                    wh50Var2 = c5;
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    z = z2;
                    bool = bool2;
                    thumb2 = thumb;
                    wh50Var3 = wh50Var2;
                    b78.b bVar2 = new b78.b(str, z, str2, booleanValue, thumb2, floatValue, izsVar);
                    M.R(bVar2);
                    x2 = bVar2;
                } else {
                    z = z2;
                    bool = bool2;
                    thumb2 = thumb;
                    wh50Var3 = wh50Var2;
                }
                b78.b bVar3 = (b78.b) x2;
                ((zak0) bVar3.a).setValue(str);
                ((zak0) bVar3.b).setValue(Boolean.valueOf(z));
                ((zak0) bVar3.c).setValue(str2);
                ((zak0) bVar3.d).setValue(bool);
                ((zak0) bVar3.e).setValue(thumb2);
                ((vak0) bVar3.f).g(floatValue);
                ((zak0) bVar3.g).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                b78Var = bVar3;
            }
            final b78 b78Var2 = b78Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final wh50 wh50Var4 = wh50Var3;
            final wh50 wh50Var5 = wh50Var;
            aVar2 = M;
            vmj.b(f3b0Var.c(), ((vak0) f3b0Var.b).getFloatValue(), bottomPlayerAppearance, kai.c(-1789517311, new yzs() { // from class: xsna.kk4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var = (q630) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(q630Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1789517311, intValue, -1, "com.vk.music.stickyplayer.presentation.AudioBookWithBottomPlayer.<anonymous> (AudioBookWithBottomPlayer.kt:99)");
                        }
                        zk4.a(dz40.b.this, ((Number) wh50Var5.getValue()).intValue(), ((Number) wh50Var4.getValue()).intValue(), (gfp0.a) c.getValue(), (dz40.c) c2.getValue(), ((Boolean) c3.getValue()).booleanValue(), f3b0Var, izsVar, q630Var, aVar4, (intValue << 24) & 234881024);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(-298948606, new yzs() { // from class: xsna.ok4
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var = (q630) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(q630Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-298948606, intValue, -1, "com.vk.music.stickyplayer.presentation.AudioBookWithBottomPlayer.<anonymous> (AudioBookWithBottomPlayer.kt:112)");
                        }
                        vmj.a(b78.this, bottomPlayerAppearance, ((Boolean) c6.getValue()).booleanValue(), ((Boolean) c7.getValue()).booleanValue(), ((Boolean) c8.getValue()).booleanValue(), ahn.E(q630.a.a, "smallPlayer").g(q630Var), aVar4, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), !((gfp0.a) c.getValue()).a(), aVar2, (i3 & 896) | 27648);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new z64(bVar, f3b0Var, bottomPlayerAppearance, izsVar, i, 1);
        }
    }

    public static final void c(final izs<? super sx40, s3q0> izsVar, final x17 x17Var, final boolean z, wh50<Boolean> wh50Var, float f, final boolean z2, final boolean z3, androidx.compose.runtime.a aVar, final int i) {
        final wh50<Boolean> wh50Var2;
        float f2;
        wh50<Boolean> wh50Var3;
        float f3 = f;
        androidx.compose.runtime.a M = aVar.M(-1711717125);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(x17Var) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.n(f3) ? 16384 : 8192) | (M.l(z2) ? 131072 : 65536) | (M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1711717125, i2, -1, "com.vk.music.stickyplayer.presentation.ControlsPanel (AudioBookWithBottomPlayer.kt:426)");
            }
            w17.a(x17Var, 16, izsVar, txj0.f(q630.a.a, 1.0f), M, ((i2 >> 3) & 14) | 3120 | ((i2 << 6) & 896));
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3) {
                M.K(382385901);
                int i3 = i2 >> 9;
                int i4 = ((i2 << 9) & 7168) | 196608 | ((i2 >> 6) & 14) | (i3 & 112) | (i3 & 896) | 24576;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-612758295, i4, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.KidsAudioBookBigPlayerControls.Companion.invoke (KidsAudioBookBigPlayerControls.kt:86)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    giy giyVar = new giy(z, f3, z2, wh50Var, izsVar);
                    f2 = f3;
                    wh50Var3 = wh50Var;
                    M.R(giyVar);
                    x = giyVar;
                } else {
                    f2 = f3;
                    wh50Var3 = wh50Var;
                }
                giy giyVar2 = (giy) x;
                ((zak0) giyVar2.b).setValue(Boolean.valueOf(z));
                ((vak0) giyVar2.c).g(f2);
                ((zak0) giyVar2.d).setValue(Boolean.valueOf(z2));
                ((zak0) giyVar2.e).setValue(wh50Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                giyVar2.a(null, M, 0);
                M.j();
                wh50Var2 = wh50Var3;
                f3 = f2;
            } else {
                M.K(382671473);
                int i5 = i2 >> 9;
                int i6 = ((i2 << 9) & 7168) | ((i2 >> 6) & 14) | 196608 | (i5 & 112) | (i5 & 896) | 24576;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1546247946, i6, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.Companion.invoke (AudioBookBigPlayerControls.kt:102)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    wh50Var2 = wh50Var;
                    f3 = f3;
                    kd4 kd4Var = new kd4(z, f3, z2, wh50Var2, izsVar);
                    M.R(kd4Var);
                    x2 = kd4Var;
                } else {
                    wh50Var2 = wh50Var;
                    f3 = f3;
                }
                kd4 kd4Var2 = (kd4) x2;
                ((zak0) kd4Var2.b).setValue(Boolean.valueOf(z));
                ((vak0) kd4Var2.c).g(f3);
                ((zak0) kd4Var2.d).setValue(Boolean.valueOf(z2));
                ((zak0) kd4Var2.e).setValue(wh50Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                kd4Var2.a(null, M, 0);
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
            final float f4 = f3;
            s.d = new wzs(x17Var, z, wh50Var2, f4, z2, z3, i) { // from class: xsna.gk4
                public final /* synthetic */ x17 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ wh50 e;
                public final /* synthetic */ float f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    zk4.c(izs.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final boolean z, final gfp0.a aVar, final dz40.g gVar, final wh50<Boolean> wh50Var, final pfl0 pfl0Var, final izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.a M = aVar2.M(-2069888590);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.J(aVar) ? 32 : 16) | (M.J(gVar) ? 256 : 128) | (M.J(pfl0Var) ? 16384 : 8192) | (M.y(izsVar) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2069888590, i2, -1, "com.vk.music.stickyplayer.presentation.Image (AudioBookWithBottomPlayer.kt:402)");
            }
            if (aVar.a()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new wzs(z, aVar, gVar, wh50Var, pfl0Var, izsVar, i) { // from class: xsna.jk4
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ gfp0.a c;
                        public final /* synthetic */ dz40.g d;
                        public final /* synthetic */ wh50 e;
                        public final /* synthetic */ pfl0 f;
                        public final /* synthetic */ izs g;

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(3073);
                            zk4.d(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                    s.d = wzsVar;
                }
                return;
            }
            w3k.b(z, gVar, wh50Var, izsVar, pfl0Var, txj0.d(q630.a.a, 1.0f), null, false, 0L, M, (i2 & 14) | 196608 | ((i2 >> 3) & 112) | 384 | ((i2 >> 6) & 7168) | (i2 & 57344), 448);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs(z, aVar, gVar, wh50Var, pfl0Var, izsVar, i) { // from class: xsna.lk4
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gfp0.a c;
                public final /* synthetic */ dz40.g d;
                public final /* synthetic */ wh50 e;
                public final /* synthetic */ pfl0 f;
                public final /* synthetic */ izs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    zk4.d(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public static final void e(final gfp0.a aVar, final boolean z, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        final q630 q630Var2;
        b9p0 b9p0Var;
        c9p0.b bVar;
        androidx.compose.runtime.a M = aVar2.M(-1224855078);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(-1224855078, i2, -1, "com.vk.music.stickyplayer.presentation.TopControls (AudioBookWithBottomPlayer.kt:460)");
            }
            boolean a2 = aVar.a();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (a2) {
                M.K(384739770);
                M.j();
                b9p0Var = b9p0.c.a;
            } else {
                M.K(384796004);
                String str = aVar.c;
                boolean z2 = aVar.e;
                String str2 = aVar.d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(420670066, 3072, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Middle.AudioBook.Companion.invoke (TopPlayerControls.kt:333)");
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new b9p0.b(str, z2, str2);
                    M.R(x);
                }
                b9p0.b bVar2 = (b9p0.b) x;
                ((zak0) bVar2.a).setValue(str);
                ((zak0) bVar2.b).setValue(Boolean.valueOf(z2));
                ((zak0) bVar2.c).setValue(str2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                b9p0Var = bVar2;
            }
            if (aVar.a()) {
                M.K(385029093);
                int i3 = ((i2 >> 3) & 112) | 390;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(923129086, i3, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.AudioBookButtons.Companion.invoke (TopPlayerControls.kt:709)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new c9p0.b(izsVar, false);
                    M.R(x2);
                }
                bVar = (c9p0.b) x2;
                ((zak0) bVar.a).setValue(Boolean.FALSE);
                ((zak0) bVar.b).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(385165121);
                int i4 = i2 >> 3;
                int i5 = (i4 & 112) | (i4 & 14) | 384;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(923129086, i5, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.AudioBookButtons.Companion.invoke (TopPlayerControls.kt:709)");
                }
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new c9p0.b(izsVar, z);
                    M.R(x3);
                }
                bVar = (c9p0.b) x3;
                ((zak0) bVar.a).setValue(Boolean.valueOf(z));
                ((zak0) bVar.b).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            f9p0.b(aVar.b, b9p0Var, bVar, q630Var, null, M, i2 & 7168, 16);
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
            s.d = new wzs() { // from class: xsna.nk4
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zk4.e(gfp0.a.this, z, izsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
