package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.player.LoopMode;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.music.stickyplayer.presentation.components.PlayerSheetTab;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Set;
import xsna.b9p0;
import xsna.bg50;
import xsna.c9p0;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;
import xsna.qy40;

/* compiled from: MusicWithBottomPlayer.kt */
/* loaded from: classes3.dex */
public final class bg50 {

    /* compiled from: MusicWithBottomPlayer.kt */
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

    public static final void a(final gfp0 gfp0Var, final boolean z, izs izsVar, final x17 x17Var, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final LoopMode loopMode, wh50 wh50Var, final boolean z6, androidx.compose.runtime.a aVar, final int i) {
        wh50 wh50Var2;
        Boolean bool;
        LoopMode loopMode2;
        final izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-1268496545);
        int i2 = (M.o(loopMode.ordinal()) ? 67108864 : 33554432) | i | (M.J(gfp0Var) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | (M.J(x17Var) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192) | (M.l(z3) ? 131072 : 65536) | (M.l(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.l(z5) ? 8388608 : 4194304);
        int i3 = M.l(z6) ? 4 : 2;
        if (M.t(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1268496545, i2, i3, "com.vk.music.stickyplayer.presentation.ControlsPanel (MusicWithBottomPlayer.kt:546)");
            }
            boolean z7 = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z7 || x == c0012a) {
                x = bbk0.b(new u110(gfp0Var, 4));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            q630.a aVar2 = q630.a.a;
            int i4 = i2 & 896;
            w17.a(x17Var, 16, izsVar2, txj0.f(aVar2, 1.0f), M, ((i2 >> 9) & 14) | 3120 | i4);
            izsVar2 = izsVar2;
            boolean z8 = z3 && !((Boolean) mtk0Var.getValue()).booleanValue();
            boolean z9 = z4 && !((Boolean) mtk0Var.getValue()).booleanValue();
            Boolean valueOf = !z ? Boolean.valueOf(z5) : null;
            LoopMode loopMode3 = !z ? loopMode : null;
            Boolean bool2 = (Boolean) mtk0Var.getValue();
            boolean booleanValue = bool2.booleanValue();
            gfp0.b.c cVar = gfp0Var instanceof gfp0.b.c ? (gfp0.b.c) gfp0Var : null;
            boolean z10 = cVar != null ? cVar.h : false;
            int i5 = ((i2 >> 12) & 14) | ((i2 << 6) & 57344) | 196608 | ((i3 << 18) & 3670016);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1477793994, i5, 6, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.Companion.invoke (MusicBigPlayerControls.kt:154)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                bool = valueOf;
                loopMode2 = loopMode3;
                x2 = new lb40(new dz40.k(z2, bool, loopMode3, z8, z9, booleanValue, wh50Var, z6, z10), izsVar2);
                M.R(x2);
            } else {
                bool = valueOf;
                loopMode2 = loopMode3;
            }
            lb40 lb40Var = (lb40) x2;
            ((zak0) lb40Var.b).setValue(Boolean.valueOf(z2));
            ((zak0) lb40Var.c).setValue(bool);
            ((zak0) lb40Var.d).setValue(loopMode2);
            ((zak0) lb40Var.e).setValue(Boolean.valueOf(z8));
            ((zak0) lb40Var.f).setValue(Boolean.valueOf(z9));
            ((zak0) lb40Var.g).setValue(bool2);
            wh50Var2 = wh50Var;
            ((zak0) lb40Var.h).setValue(wh50Var2);
            ((zak0) lb40Var.i).setValue(Boolean.valueOf(z6));
            ((zak0) lb40Var.j).setValue(Boolean.valueOf(z10));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lb40Var.a(null, M, 0);
            if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                M.K(1638013756);
                q630 h = txj0.h(txj0.f(aVar2, 1.0f), 36);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, h);
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                String N = d370.N(R.string.music_player_ad_disable_title, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.H;
                boolean z11 = i4 == 256;
                Object x3 = M.x();
                if (z11 || x3 == c0012a) {
                    x3 = new f3(izsVar2, 7);
                    M.R(x3);
                }
                yqv0.c(N, ahn.E(ra8.a.b(qri.a(aVar2, a5x.a, new m0r((gzs) x3, 3)), dt1.a.f), "disableAdTitle"), j, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8120);
                M.G();
            } else {
                M.K(1611841603);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            wh50Var2 = wh50Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final wh50 wh50Var3 = wh50Var2;
            s.d = new wzs(z, izsVar2, x17Var, z2, z3, z4, z5, loopMode, wh50Var3, z6, i) { // from class: xsna.kf50
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ x17 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ LoopMode j;
                public final /* synthetic */ wh50 k;
                public final /* synthetic */ boolean l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(805306369);
                    bg50.a(gfp0.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final gfp0.b bVar, final dz40.g gVar, final wh50<Boolean> wh50Var, final mtk0<Boolean> mtk0Var, final pfl0 pfl0Var, final boolean z2, final izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(501674653);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.J(bVar) ? 32 : 16) | (M.J(gVar) ? 256 : 128) | (M.J(pfl0Var) ? 131072 : 65536) | (M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(501674653, i2, -1, "com.vk.music.stickyplayer.presentation.Image (MusicWithBottomPlayer.kt:460)");
            }
            boolean z3 = bVar instanceof gfp0.b.c;
            q630.a aVar2 = q630.a.a;
            if (z3) {
                M.K(-1096106772);
                int i3 = i2 >> 3;
                w3k.b(z, gVar, wh50Var, izsVar, pfl0Var, txj0.d(aVar2, 1.0f), mtk0Var, z2, 0L, M, (i2 & 14) | 196608 | (i3 & 112) | 384 | ((i2 >> 12) & 7168) | (i3 & 57344) | 1572864 | ((i2 << 3) & 29360128), 256);
                M = M;
                M.j();
            } else if (bVar instanceof gfp0.b.a) {
                M.K(-1095660744);
                pe0.a((gfp0.b.a) bVar, pfl0Var, izsVar, txj0.d(aVar2, 1.0f), M, ((i2 >> 12) & 112) | 3072 | ((i2 >> 15) & 896));
                M.j();
            } else {
                if (!(bVar instanceof gfp0.b.C2940b)) {
                    throw alb0.c(1073018811, M);
                }
                M.K(-1095365469);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, bVar, gVar, wh50Var, mtk0Var, pfl0Var, z2, izsVar, i) { // from class: xsna.jf50
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gfp0.b c;
                public final /* synthetic */ dz40.g d;
                public final /* synthetic */ wh50 e;
                public final /* synthetic */ mtk0 f;
                public final /* synthetic */ pfl0 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ izs i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(27649);
                    bg50.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final dz40.l lVar, final int i, final int i2, final gfp0.b bVar, final dz40.c cVar, final boolean z, final f3b0 f3b0Var, final boolean z2, final boolean z3, final Object obj, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        androidx.compose.runtime.a aVar2;
        wh50 wh50Var;
        androidx.compose.runtime.a M = aVar.M(108712048);
        int i6 = i3 | (M.J(lVar) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.o(i2) ? 256 : 128) | (M.J(bVar) ? 2048 : 1024) | (M.J(cVar) ? 16384 : 8192) | (M.l(z) ? 131072 : 65536) | (M.J(f3b0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.l(z2) ? 8388608 : 4194304) | (M.l(z3) ? 67108864 : 33554432) | (M.J(obj) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if ((i4 & 6) == 0) {
            i5 = i4 | (M.y(izsVar) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= M.J(q630Var) ? 32 : 16;
        }
        int i7 = i5;
        if (M.t(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(108712048, i6, i7, "com.vk.music.stickyplayer.presentation.MusicContent (MusicWithBottomPlayer.kt:165)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = yq.f(M);
            }
            final dlv0 dlv0Var = (dlv0) x;
            wh50 c = jk50.c(lVar.l, M);
            final h17 g = f17.g(f17.f(BigPlayerBottomSheetValue.Collapsed, M), M, 2);
            if (f3b0Var.b().a instanceof qy40.b) {
                wh50Var = c;
                M.K(227960818);
            } else {
                M.K(236276444);
                s7k0 b = f3b0Var.b();
                wh50Var = c;
                boolean z4 = (i6 & 3670016) == 1048576;
                Object x2 = M.x();
                if (z4 || x2 == c0012a) {
                    x2 = new vf50(dlv0Var, f3b0Var, null);
                    M.R(x2);
                }
                bap.g(b, (wzs) x2, M, 0);
            }
            M.j();
            Float valueOf = Float.valueOf(g.a.b());
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new wf50(dlv0Var, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            ParentBottomSheetState a2 = f3b0Var.a();
            yzt0<dz40.h> yzt0Var = lVar.c;
            boolean J = ((i6 & 3670016) == 1048576) | M.J(g) | ((i7 & 14) == 4);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new xf50(f3b0Var, g, izsVar, null);
                M.R(x4);
            }
            bap.f(a2, yzt0Var, (wzs) x4, M, 0);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x5);
            }
            final wh50 wh50Var2 = (wh50) x5;
            final wh50 wh50Var3 = wh50Var;
            zzs zzsVar = new zzs() { // from class: xsna.rf50
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i8;
                    final mtk0 mtk0Var = (mtk0) obj2;
                    final pfl0 pfl0Var = (pfl0) obj3;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i8 = (aVar3.J(mtk0Var) ? 4 : 2) | intValue;
                    } else {
                        i8 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i8 |= aVar3.J(pfl0Var) ? 32 : 16;
                    }
                    if (aVar3.t(i8 & 1, (i8 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1331499976, i8, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous> (MusicWithBottomPlayer.kt:194)");
                        }
                        q630 d = txj0.d(q630.this, 1.0f);
                        final dz40.l lVar2 = lVar;
                        final gfp0.b bVar2 = bVar;
                        final int i9 = i2;
                        final int i10 = i;
                        final h17 h17Var = g;
                        final izs izsVar2 = izsVar;
                        final f3b0 f3b0Var2 = f3b0Var;
                        final wh50 wh50Var4 = wh50Var2;
                        final boolean z5 = z;
                        final Object obj6 = obj;
                        final mtk0 mtk0Var2 = wh50Var3;
                        final dz40.c cVar2 = cVar;
                        final boolean z6 = z2;
                        final boolean z7 = z3;
                        final dlv0 dlv0Var2 = dlv0Var;
                        ua8.a(d, null, false, kai.c(-752695518, new yzs() { // from class: xsna.tf50
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.yzs
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                wh50 wh50Var5;
                                wh50 wh50Var6;
                                a.C0011a.C0012a c0012a2;
                                mtk0 mtk0Var3;
                                dz40.f fVar;
                                boolean z8;
                                gfp0.b.c cVar3;
                                pfl0 pfl0Var2;
                                wh50 wh50Var7;
                                boolean z9;
                                gfp0.b bVar3;
                                boolean z10;
                                rg50 rg50Var;
                                mtk0 mtk0Var4;
                                h17 h17Var2;
                                final mtk0 mtk0Var5;
                                final h17 h17Var3;
                                wh50 wh50Var8;
                                final gfp0.b bVar4;
                                final boolean z11;
                                jai c2;
                                va8 va8Var = (va8) obj7;
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj8;
                                int intValue2 = ((Integer) obj9).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= aVar4.J(va8Var) ? 4 : 2;
                                }
                                if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-752695518, intValue2, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:199)");
                                    }
                                    aVar4.K(-1785885731);
                                    iyk0 iyk0Var = uvi.h;
                                    azl azlVar = (azl) aVar4.r(iyk0Var);
                                    final f3b0 f3b0Var3 = f3b0Var2;
                                    final float j1 = azlVar.j1(f3b0Var3.c().c((azl) aVar4.r(iyk0Var)));
                                    aVar4.j();
                                    aVar4.K(-1785881504);
                                    final float j12 = ((azl) aVar4.r(iyk0Var)).j1(f3b0Var3.c().a((azl) aVar4.r(iyk0Var)));
                                    aVar4.j();
                                    aVar4.K(-1785877453);
                                    azl azlVar2 = (azl) aVar4.r(iyk0Var);
                                    zpx0 c3 = f3b0Var3.c();
                                    azl azlVar3 = (azl) aVar4.r(iyk0Var);
                                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                                    final float j13 = azlVar2.j1(c3.d(azlVar3, layoutDirection));
                                    aVar4.j();
                                    aVar4.K(-1785872876);
                                    final float j14 = ((azl) aVar4.r(iyk0Var)).j1(f3b0Var3.c().b((azl) aVar4.r(iyk0Var), layoutDirection));
                                    aVar4.j();
                                    final float g2 = (va8Var.g() - j1) - bw40.a;
                                    dz40.l lVar3 = dz40.l.this;
                                    dz40.f fVar2 = lVar3.a;
                                    wh50 c4 = jk50.c(fVar2.c, aVar4);
                                    wh50 c5 = jk50.c(fVar2.g, aVar4);
                                    final wh50 c6 = jk50.c(lVar3.h, aVar4);
                                    final wh50 c7 = jk50.c(lVar3.k, aVar4);
                                    boolean l = aVar4.l(((Boolean) c5.getValue()).booleanValue());
                                    Object x6 = aVar4.x();
                                    a.C0011a.C0012a c0012a3 = a.C0011a.a;
                                    Object obj10 = x6;
                                    if (l || x6 == c0012a3) {
                                        f1m b2 = bbk0.b(new ag50(c5));
                                        aVar4.R(b2);
                                        obj10 = b2;
                                    }
                                    mtk0 mtk0Var6 = (mtk0) obj10;
                                    final wh50 c8 = jk50.c(lVar3.c, aVar4);
                                    wh50 c9 = jk50.c(lVar3.b, aVar4);
                                    pfl0 pfl0Var3 = pfl0Var;
                                    wh50 wh50Var9 = wh50Var4;
                                    if (pfl0Var3 == null) {
                                        aVar4.K(473548458);
                                        aVar4.j();
                                        fVar = fVar2;
                                        wh50Var5 = c5;
                                        pfl0Var2 = pfl0Var3;
                                        wh50Var6 = wh50Var9;
                                        c0012a2 = c0012a3;
                                        mtk0Var3 = mtk0Var6;
                                        wh50Var7 = c9;
                                        z8 = true;
                                        cVar3 = null;
                                    } else {
                                        aVar4.K(473548459);
                                        wh50Var5 = c5;
                                        wh50Var6 = wh50Var9;
                                        c0012a2 = c0012a3;
                                        mtk0Var3 = mtk0Var6;
                                        fVar = fVar2;
                                        z8 = true;
                                        cVar3 = null;
                                        tza0.a(((Boolean) wh50Var9.getValue()).booleanValue(), ((dz40.g) c9.getValue()).a(), pfl0Var3, 0L, aVar4, 0);
                                        pfl0Var2 = pfl0Var3;
                                        wow wowVar = new wow(((dz40.g) c9.getValue()).a);
                                        wh50Var7 = c9;
                                        boolean J2 = aVar4.J(pfl0Var2) | aVar4.J(wh50Var7);
                                        Object x7 = aVar4.x();
                                        Object obj11 = x7;
                                        if (J2 || x7 == c0012a2) {
                                            yf50 yf50Var = new yf50(pfl0Var2, wh50Var7, null);
                                            aVar4.R(yf50Var);
                                            obj11 = yf50Var;
                                        }
                                        bap.g(wowVar, (wzs) obj11, aVar4, 0);
                                        s3q0 s3q0Var = s3q0.a;
                                        aVar4.j();
                                    }
                                    final wh50 c10 = jk50.c(fVar.e, aVar4);
                                    final wh50 c11 = jk50.c(fVar.f, aVar4);
                                    final wh50 c12 = jk50.c(lVar3.i, aVar4);
                                    final wh50 c13 = jk50.c(lVar3.f, aVar4);
                                    final wh50 c14 = jk50.c(lVar3.g, aVar4);
                                    final wh50 c15 = jk50.c(lVar3.j, aVar4);
                                    Object x8 = aVar4.x();
                                    gfp0.b bVar5 = bVar2;
                                    Object obj12 = x8;
                                    if (x8 == c0012a2) {
                                        wh50 b3 = androidx.compose.runtime.k.b(bVar5.m());
                                        aVar4.R(b3);
                                        obj12 = b3;
                                    }
                                    wh50 wh50Var10 = (wh50) obj12;
                                    if (epx.f(bVar5.m(), (String) wh50Var10.getValue())) {
                                        z9 = false;
                                    } else {
                                        wh50Var10.setValue(bVar5.m());
                                        z9 = z8;
                                    }
                                    final wh50 c16 = jk50.c(lVar3.m, aVar4);
                                    final wh50 c17 = jk50.c(fVar.h, aVar4);
                                    final wh50 c18 = jk50.c(lVar3.n, aVar4);
                                    boolean z12 = bVar5 instanceof gfp0.b.c;
                                    int intValue3 = ((Number) c4.getValue()).intValue();
                                    gfp0.b.c cVar4 = z12 ? (gfp0.b.c) bVar5 : cVar3;
                                    if (cVar4 != null) {
                                        bVar3 = bVar5;
                                        z10 = cVar4.h;
                                    } else {
                                        bVar3 = bVar5;
                                        z10 = false;
                                    }
                                    final wh50 wh50Var11 = wh50Var7;
                                    final gfp0.b bVar6 = bVar3;
                                    final x17 q = sd9.q(z12, z10, i9, intValue3, i10, aVar4);
                                    Object x9 = aVar4.x();
                                    h17 h17Var4 = h17Var;
                                    Object obj13 = x9;
                                    if (x9 == c0012a2) {
                                        f1m b4 = bbk0.b(new gd40(h17Var4, 4));
                                        aVar4.R(b4);
                                        obj13 = b4;
                                    }
                                    final mtk0 mtk0Var7 = (mtk0) obj13;
                                    boolean J3 = aVar4.J(bg50.d(mtk0Var3));
                                    Object x10 = aVar4.x();
                                    Object obj14 = x10;
                                    if (J3 || x10 == c0012a2) {
                                        rg50 a3 = androidx.compose.runtime.i.a(0);
                                        aVar4.R(a3);
                                        obj14 = a3;
                                    }
                                    rg50 rg50Var2 = (rg50) obj14;
                                    Boolean valueOf2 = Boolean.valueOf(((zak0) h17Var4.a.c.m).getValue() != null ? z8 : false);
                                    mtk0 mtk0Var8 = mtk0Var3;
                                    boolean J4 = aVar4.J(h17Var4) | aVar4.J(rg50Var2) | aVar4.J(mtk0Var8);
                                    izs izsVar3 = izsVar2;
                                    boolean J5 = J4 | aVar4.J(izsVar3);
                                    final izs izsVar4 = izsVar3;
                                    Object x11 = aVar4.x();
                                    if (J5 || x11 == c0012a2) {
                                        rg50Var = rg50Var2;
                                        mtk0Var4 = mtk0Var8;
                                        x11 = new zf50(h17Var4, rg50Var, izsVar4, mtk0Var4, null);
                                        h17Var2 = h17Var4;
                                        aVar4.R(x11);
                                    } else {
                                        h17Var2 = h17Var4;
                                        rg50Var = rg50Var2;
                                        mtk0Var4 = mtk0Var8;
                                    }
                                    bap.g(valueOf2, (wzs) x11, aVar4, 0);
                                    Object x12 = aVar4.x();
                                    Object obj15 = x12;
                                    if (x12 == c0012a2) {
                                        wh50 b5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                                        aVar4.R(b5);
                                        obj15 = b5;
                                    }
                                    final wh50 wh50Var12 = (wh50) obj15;
                                    Object x13 = aVar4.x();
                                    Object obj16 = x13;
                                    if (x13 == c0012a2) {
                                        wh50 b6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                                        aVar4.R(b6);
                                        obj16 = b6;
                                    }
                                    final wh50 wh50Var13 = (wh50) obj16;
                                    q630 E = ahn.E(q630.a.a, "player");
                                    float f = bw40.b;
                                    boolean z13 = !(bVar6 instanceof gfp0.b.C2940b);
                                    float f2 = 16;
                                    uog0 d2 = vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                                    boolean booleanValue = ((Boolean) c17.getValue()).booleanValue();
                                    mtk0 mtk0Var9 = mtk0Var;
                                    final boolean z14 = z5;
                                    if (booleanValue) {
                                        aVar4.K(481315291);
                                        aVar4.j();
                                        z11 = z14;
                                        mtk0Var5 = mtk0Var9;
                                        bVar4 = bVar6;
                                        wh50Var8 = c16;
                                        h17Var3 = h17Var2;
                                        c2 = null;
                                    } else {
                                        aVar4.K(-1785585435);
                                        final Object obj17 = obj6;
                                        final wh50 wh50Var14 = wh50Var5;
                                        final h17 h17Var5 = h17Var2;
                                        final rg50 rg50Var3 = rg50Var;
                                        final mtk0 mtk0Var10 = mtk0Var4;
                                        mtk0Var5 = mtk0Var9;
                                        zzs zzsVar2 = new zzs() { // from class: xsna.uf50
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // xsna.zzs
                                            public final Object invoke(Object obj18, Object obj19, Object obj20, Object obj21) {
                                                float floatValue = ((Float) obj19).floatValue();
                                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj20;
                                                int intValue4 = ((Integer) obj21).intValue();
                                                if ((intValue4 & 48) == 0) {
                                                    intValue4 |= aVar5.n(floatValue) ? 32 : 16;
                                                }
                                                boolean z15 = false;
                                                if (aVar5.t(intValue4 & 1, (intValue4 & 145) != 144)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-301507533, intValue4, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:382)");
                                                    }
                                                    q630 H = s200.H(txj0.h(q630.a.a, g2), j13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                                                    final mtk0 mtk0Var11 = mtk0Var10;
                                                    List<T> list = ((wow) mtk0Var11.getValue()).b;
                                                    final mtk0 mtk0Var12 = c6;
                                                    dz40.w wVar = new dz40.w(((dz40.n.b) mtk0Var12.getValue()).a.size(), ((dz40.n.b) mtk0Var12.getValue()).b.size());
                                                    ParentBottomSheetState a4 = f3b0Var3.a();
                                                    if (((OnboardingStrategy) c16.getValue()) == OnboardingStrategy.SheetAnimation && ((Boolean) wh50Var14.getValue()).booleanValue()) {
                                                        z15 = true;
                                                    }
                                                    dz40.u uVar = new dz40.u(list, new dz40.v(a4, floatValue, z15), wVar);
                                                    final gfp0.b bVar7 = bVar6;
                                                    final boolean z16 = z14;
                                                    final h17 h17Var6 = h17Var5;
                                                    final mtk0 mtk0Var13 = mtk0Var5;
                                                    final wh50 wh50Var15 = wh50Var13;
                                                    final izs izsVar5 = izsVar4;
                                                    final float f3 = j12;
                                                    final rg50 rg50Var4 = rg50Var3;
                                                    final x17 x17Var = q;
                                                    final Object obj22 = obj17;
                                                    final mtk0 mtk0Var14 = c7;
                                                    qzn0.d(h17Var6, rg50Var4, uVar, izsVar5, H, kai.c(-143931477, new yzs() { // from class: xsna.of50
                                                        @Override // xsna.yzs
                                                        public final Object invoke(Object obj23, Object obj24, Object obj25) {
                                                            boolean z17;
                                                            g07 g07Var = h17Var6.a;
                                                            PlayerSheetTab playerSheetTab = (PlayerSheetTab) obj23;
                                                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj24;
                                                            int intValue5 = ((Integer) obj25).intValue();
                                                            if ((intValue5 & 6) == 0) {
                                                                intValue5 |= aVar6.o(playerSheetTab.ordinal()) ? 4 : 2;
                                                            }
                                                            boolean z18 = false;
                                                            if (aVar6.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                                                                if (androidx.compose.runtime.b.d()) {
                                                                    androidx.compose.runtime.b.f(-143931477, intValue5, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:403)");
                                                                }
                                                                int i11 = bg50.a.$EnumSwitchMapping$0[playerSheetTab.ordinal()];
                                                                q630.a aVar7 = q630.a.a;
                                                                gfp0.b bVar8 = gfp0.b.this;
                                                                mtk0 mtk0Var15 = mtk0Var13;
                                                                izs izsVar6 = izsVar5;
                                                                if (i11 == 1) {
                                                                    aVar6.K(-879170572);
                                                                    dz40.n.b bVar9 = (dz40.n.b) mtk0Var12.getValue();
                                                                    String m = bVar8.m();
                                                                    boolean z19 = z16 && (bVar8 instanceof gfp0.b.c);
                                                                    boolean c19 = g07Var.c();
                                                                    boolean z20 = bVar8 instanceof gfp0.b.c;
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.f(1002048035, 12585984, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicPlaybackQueue.Companion.invoke (MusicPlaybackQueue.kt:59)");
                                                                    }
                                                                    Object x14 = aVar6.x();
                                                                    if (x14 == a.C0011a.a) {
                                                                        z17 = z20;
                                                                        hv40 hv40Var = new hv40(bVar9, m, z19, c19, z17, mtk0Var15, wh50Var15);
                                                                        aVar6.R(hv40Var);
                                                                        x14 = hv40Var;
                                                                    } else {
                                                                        z17 = z20;
                                                                    }
                                                                    hv40 hv40Var2 = (hv40) x14;
                                                                    ((zak0) hv40Var2.c).setValue(bVar9);
                                                                    ((zak0) hv40Var2.d).setValue(m);
                                                                    ((zak0) hv40Var2.e).setValue(Boolean.valueOf(z19));
                                                                    ((zak0) hv40Var2.f).setValue(Boolean.valueOf(c19));
                                                                    ((zak0) hv40Var2.g).setValue(Boolean.valueOf(z17));
                                                                    if (androidx.compose.runtime.b.d()) {
                                                                        androidx.compose.runtime.b.e();
                                                                    }
                                                                    hv40Var2.j(48, aVar6, izsVar6, txj0.d(aVar7, 1.0f));
                                                                    aVar6.j();
                                                                } else {
                                                                    if (i11 != 2) {
                                                                        throw alb0.c(-879192976, aVar6);
                                                                    }
                                                                    aVar6.K(-1484327838);
                                                                    q630 H2 = s200.H(txj0.d(aVar7, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 7);
                                                                    String m2 = bVar8.m();
                                                                    dz40.j jVar = (dz40.j) mtk0Var14.getValue();
                                                                    boolean z21 = bVar8 instanceof gfp0.b.a;
                                                                    if (g07Var.c() && rg50Var4.getIntValue() == ((wow) mtk0Var11.getValue()).b.indexOf(PlayerSheetTab.LYRICS)) {
                                                                        z18 = true;
                                                                    }
                                                                    kb00.k(x17Var, m2, jVar, z21, obj22, izsVar6, H2, mtk0Var15, z18, aVar6, 0);
                                                                    aVar6.j();
                                                                }
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
                                        h17Var3 = h17Var5;
                                        wh50Var8 = c16;
                                        bVar4 = bVar6;
                                        z11 = z14;
                                        izsVar4 = izsVar4;
                                        c2 = kai.c(-301507533, zzsVar2, aVar4);
                                        aVar4.j();
                                    }
                                    final mtk0 mtk0Var11 = mtk0Var2;
                                    final dz40.c cVar5 = cVar2;
                                    final izs izsVar5 = izsVar4;
                                    final boolean z15 = z11;
                                    jai c19 = kai.c(-1876465736, new wzs() { // from class: xsna.ff50
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj18, Object obj19) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj18;
                                            int intValue4 = ((Integer) obj19).intValue();
                                            if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(-1876465736, intValue4, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:296)");
                                                }
                                                float floatValue = ((Number) mtk0Var7.getValue()).floatValue();
                                                boolean booleanValue2 = ((Boolean) mtk0Var11.getValue()).booleanValue();
                                                final izs izsVar6 = izsVar5;
                                                final mtk0 mtk0Var12 = c8;
                                                final wh50 wh50Var15 = c17;
                                                jai c20 = kai.c(-1820397599, new yzs() { // from class: xsna.mf50
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj20, Object obj21, Object obj22) {
                                                        q630 q630Var2 = (q630) obj20;
                                                        androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj21;
                                                        int intValue5 = ((Integer) obj22).intValue();
                                                        if ((intValue5 & 6) == 0) {
                                                            intValue5 |= aVar6.J(q630Var2) ? 4 : 2;
                                                        }
                                                        if (aVar6.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(-1820397599, intValue5, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:301)");
                                                            }
                                                            s1b0.a((dz40.h) mtk0Var12.getValue(), izs.this, ((Boolean) wh50Var15.getValue()).booleanValue(), q630Var2, aVar6, (intValue5 << 9) & 7168);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar6.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, aVar5);
                                                final dz40.c cVar6 = cVar5;
                                                final gfp0.b bVar7 = bVar4;
                                                final boolean z16 = z15;
                                                final mtk0 mtk0Var13 = c11;
                                                s8p0.b(j1, floatValue, bVar7, izsVar6, booleanValue2, c20, kai.c(-448914368, new yzs() { // from class: xsna.nf50
                                                    @Override // xsna.yzs
                                                    public final Object invoke(Object obj20, Object obj21, Object obj22) {
                                                        q630 q630Var2 = (q630) obj20;
                                                        androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj21;
                                                        int intValue5 = ((Integer) obj22).intValue();
                                                        if ((intValue5 & 6) == 0) {
                                                            intValue5 |= aVar6.J(q630Var2) ? 4 : 2;
                                                        }
                                                        if (aVar6.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(-448914368, intValue5, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:310)");
                                                            }
                                                            bg50.f(dz40.c.this, bVar7, z16, ((Boolean) mtk0Var13.getValue()).booleanValue(), izsVar6, q630Var2, aVar6, (intValue5 << 15) & 458752);
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
                                    final gfp0.b bVar7 = bVar4;
                                    final izs izsVar6 = izsVar4;
                                    final boolean z16 = z11;
                                    final h17 h17Var6 = h17Var3;
                                    jai c20 = kai.c(1831109817, new wzs() { // from class: xsna.gf50
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj18, Object obj19) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj18;
                                            int intValue4 = ((Integer) obj19).intValue();
                                            if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1831109817, intValue4, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:323)");
                                                }
                                                bg50.b(z16, bVar7, (dz40.g) wh50Var11.getValue(), wh50Var12, wh50Var13, pfl0Var4, h17Var3.a.c(), izsVar6, aVar5, 27648);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    final boolean z17 = z6;
                                    final boolean z18 = z7;
                                    final wh50 wh50Var15 = wh50Var8;
                                    final gfp0.b bVar8 = bVar4;
                                    final boolean z19 = z9;
                                    jai c21 = kai.c(1243718074, new wzs() { // from class: xsna.hf50
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj18, Object obj19) {
                                            mtk0 mtk0Var12;
                                            boolean z20;
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj18;
                                            int intValue4 = ((Integer) obj19).intValue();
                                            if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1243718074, intValue4, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:335)");
                                                }
                                                boolean booleanValue2 = ((Boolean) c17.getValue()).booleanValue();
                                                f3b0 f3b0Var4 = f3b0.this;
                                                boolean z21 = z19;
                                                gfp0.b bVar9 = bVar8;
                                                dz40.c cVar6 = cVar5;
                                                izs izsVar7 = izsVar5;
                                                mtk0 mtk0Var13 = wh50Var15;
                                                if (booleanValue2) {
                                                    aVar5.K(-1077653499);
                                                    siy.b(bVar9, cVar6, new oiy(z21, f3b0Var4.a(), ((OnboardingStrategy) mtk0Var13.getValue()) == OnboardingStrategy.LikeAnimation, ((Boolean) c18.getValue()).booleanValue()), izsVar7, aVar5, 0);
                                                    aVar5.j();
                                                } else {
                                                    aVar5.K(-1076934051);
                                                    boolean z22 = z17 && ((OnboardingStrategy) mtk0Var13.getValue()) == OnboardingStrategy.CrossfadeAnimation;
                                                    Set<T> set = ((ipw) c15.getValue()).b;
                                                    ParentBottomSheetState a4 = f3b0Var4.a();
                                                    BigPlayerBottomSheetValue bigPlayerBottomSheetValue = (BigPlayerBottomSheetValue) ((zak0) h17Var6.a.c.g).getValue();
                                                    if (((OnboardingStrategy) mtk0Var13.getValue()) == OnboardingStrategy.ChipsAnimation) {
                                                        mtk0Var12 = mtk0Var13;
                                                        z20 = true;
                                                    } else {
                                                        mtk0Var12 = mtk0Var13;
                                                        z20 = false;
                                                    }
                                                    b940.d(bVar9, cVar6, set, z21, a4, bigPlayerBottomSheetValue, z20, ((OnboardingStrategy) mtk0Var12.getValue()) == OnboardingStrategy.LikeAnimation, z22, z18, izsVar7, aVar5, 0);
                                                    aVar5.j();
                                                }
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    final izs izsVar7 = izsVar4;
                                    jai c22 = kai.c(656326331, new wzs() { // from class: xsna.if50
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj18, Object obj19) {
                                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj18;
                                            int intValue4 = ((Integer) obj19).intValue();
                                            if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(656326331, intValue4, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:367)");
                                                }
                                                bg50.a(gfp0.b.this, ((Boolean) c12.getValue()).booleanValue(), izsVar7, q, z11, ((Boolean) c10.getValue()).booleanValue(), ((Boolean) c11.getValue()).booleanValue(), ((Boolean) c13.getValue()).booleanValue(), (LoopMode) c14.getValue(), wh50Var12, ((Boolean) c17.getValue()).booleanValue(), aVar5, 805306368);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar5.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, aVar4);
                                    jai c23 = kai.c(-2106037074, new myg(dlv0Var2, f3b0Var3, izsVar7), aVar4);
                                    Object x14 = aVar4.x();
                                    Object obj18 = x14;
                                    if (x14 == c0012a2) {
                                        c3x c3xVar = new c3x(z8 ? 1 : 0, wh50Var6);
                                        aVar4.R(c3xVar);
                                        obj18 = c3xVar;
                                    }
                                    f17.a(E, c2, c19, c20, c21, c22, c23, h17Var6, z13, d2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mtk0Var5, f, (izs) obj18, aVar4, 1797510, 3456, 1024);
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
                            aVar3.K(1614979187);
                            q630 m = hr80.m(txj0.d(q630.a.a, 1.0f), l5g.j, androidx.compose.ui.graphics.e.a);
                            Object x6 = aVar3.x();
                            if (x6 == a.C0011a.a) {
                                x6 = new cu1(24);
                                aVar3.R(x6);
                            }
                            ja8.a(ojc.c(m, false, null, null, (gzs) x6, 14), aVar3, 0);
                        } else {
                            aVar3.K(1593099914);
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
            };
            aVar2 = M;
            rfl0.a(384, 3, aVar2, kai.c(-1331499976, zzsVar, aVar2), null, false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, i2, bVar, cVar, z, f3b0Var, z2, z3, obj, izsVar, q630Var, i3, i4) { // from class: xsna.sf50
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ gfp0.b e;
                public final /* synthetic */ dz40.c f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ f3b0 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ Object k;
                public final /* synthetic */ izs l;
                public final /* synthetic */ q630 m;
                public final /* synthetic */ int n;

                {
                    this.n = i4;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    int I2 = ne7.I(this.n);
                    bg50.c(dz40.l.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (androidx.compose.runtime.a) obj2, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final List d(mtk0 mtk0Var) {
        return ((wow) mtk0Var.getValue()).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final dz40.l lVar, final f3b0 f3b0Var, final BottomPlayerAppearance bottomPlayerAppearance, final gzs gzsVar, final boolean z, final Object obj, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar2;
        boolean z2;
        Object obj2;
        androidx.compose.runtime.a aVar2;
        dz40.f fVar = lVar.a;
        androidx.compose.runtime.a M = aVar.M(-134331155);
        if ((i & 6) == 0) {
            i2 = (M.J(lVar) ? 4 : 2) | i;
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
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            obj2 = obj;
            i2 |= M.J(obj2) ? 131072 : 65536;
        } else {
            obj2 = obj;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-134331155, i3, -1, "com.vk.music.stickyplayer.presentation.MusicWithBottomPlayer (MusicWithBottomPlayer.kt:86)");
            }
            final wh50 c = jk50.c(lVar.d, M);
            final wh50 c2 = jk50.c(lVar.e, M);
            final wh50 c3 = jk50.c(fVar.d, M);
            final wh50 c4 = jk50.c(fVar.b, M);
            final wh50 c5 = jk50.c(fVar.a, M);
            wh50 c6 = jk50.c(fVar.h, M);
            final wh50 c7 = jk50.c(fVar.e, M);
            final wh50 c8 = jk50.c(fVar.f, M);
            final wh50 c9 = jk50.c(fVar.i, M);
            boolean o = M.o(((Number) c4.getValue()).intValue()) | M.o(((Number) c5.getValue()).intValue());
            Object x = M.x();
            if (o || x == a.C0011a.a) {
                x = bbk0.b(new hn9(19, c5, c4));
                M.R(x);
            }
            final b78 c10 = vmj.c((gfp0.b) c.getValue(), new c78(((Number) ((mtk0) x).getValue()).floatValue(), ((Boolean) c3.getValue()).booleanValue(), !((dz40.c) c2.getValue()).a, ((Boolean) c6.getValue()).booleanValue()), izsVar, M, (i3 >> 12) & 896);
            final gzs gzsVar3 = gzsVar2;
            final boolean z3 = z2;
            final Object obj3 = obj2;
            aVar2 = M;
            vmj.b(f3b0Var.c(), ((vak0) f3b0Var.b).getFloatValue(), bottomPlayerAppearance, kai.c(-788806823, new yzs() { // from class: xsna.lf50
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    q630 q630Var = (q630) obj4;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(q630Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-788806823, intValue, -1, "com.vk.music.stickyplayer.presentation.MusicWithBottomPlayer.<anonymous> (MusicWithBottomPlayer.kt:119)");
                        }
                        bg50.c(lVar, ((Number) c4.getValue()).intValue(), ((Number) c5.getValue()).intValue(), (gfp0.b) c.getValue(), (dz40.c) c2.getValue(), ((Boolean) c3.getValue()).booleanValue(), f3b0Var, ((Boolean) gzs.this.invoke()).booleanValue(), z3, obj3, izsVar, q630Var, aVar3, 0, (intValue << 3) & 112);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(1374495386, new yzs() { // from class: xsna.pf50
                @Override // xsna.yzs
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    q630 q630Var = (q630) obj4;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(q630Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1374495386, intValue, -1, "com.vk.music.stickyplayer.presentation.MusicWithBottomPlayer.<anonymous> (MusicWithBottomPlayer.kt:135)");
                        }
                        vmj.a(b78.this, bottomPlayerAppearance, ((Boolean) c7.getValue()).booleanValue(), ((Boolean) c8.getValue()).booleanValue(), ((Boolean) c9.getValue()).booleanValue(), ahn.E(q630.a.a, "smallPlayer").g(q630Var), aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), !(((gfp0.b) c.getValue()) instanceof gfp0.b.C2940b), aVar2, (i3 & 896) | 27648);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qf50
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    bg50.e(dz40.l.this, f3b0Var, bottomPlayerAppearance, gzsVar, z, obj, izsVar, (androidx.compose.runtime.a) obj4, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(dz40.c cVar, gfp0.b bVar, boolean z, boolean z2, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z3;
        b9p0 b9p0Var;
        c9p0.c cVar2;
        androidx.compose.runtime.a M = aVar.M(-2146945734);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= M.l(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
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
                androidx.compose.runtime.b.f(-2146945734, i3, -1, "com.vk.music.stickyplayer.presentation.TopControls (MusicWithBottomPlayer.kt:494)");
            }
            boolean z4 = bVar instanceof gfp0.b.c;
            if (z4) {
                M.K(-1630536495);
                gfp0.b.c cVar3 = (gfp0.b.c) bVar;
                b9p0Var = b9p0.d.a.a(cVar3.c, cVar3.e, cVar3.d, M);
                M.j();
            } else if (bVar instanceof gfp0.b.a) {
                M.K(-1630530336);
                M.j();
                b9p0Var = b9p0.a.a;
            } else {
                if (!(bVar instanceof gfp0.b.C2940b)) {
                    throw alb0.c(-1630538819, M);
                }
                M.K(-1630527944);
                M.j();
                b9p0Var = b9p0.c.a;
            }
            b9p0 b9p0Var2 = b9p0Var;
            if (z4) {
                M.K(-1630523540);
                int i4 = i3 >> 3;
                c9p0.c a2 = c9p0.c.a.a(z, cVar.a, z3, izsVar, M, (i4 & 7168) | ((i3 >> 6) & 14) | 24576 | (i4 & 896));
                M.j();
                cVar2 = a2;
            } else if (bVar instanceof gfp0.b.a) {
                M.K(-1630515715);
                int i5 = ((i3 >> 6) & 14) | 384 | ((i3 >> 9) & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1899429442, i5, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.AdvertisementButtons.Companion.invoke (TopPlayerControls.kt:572)");
                }
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new c9p0.a(izsVar, z);
                    M.R(x);
                }
                c9p0.a aVar2 = (c9p0.a) x;
                ((zak0) aVar2.a).setValue(Boolean.valueOf(z));
                ((zak0) aVar2.b).setValue(izsVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                cVar2 = aVar2;
            } else {
                if (!(bVar instanceof gfp0.b.C2940b)) {
                    throw alb0.c(-1630525605, M);
                }
                M.K(-1630510545);
                c9p0.c a3 = c9p0.c.a.a(false, false, false, izsVar, M, ((i3 >> 3) & 7168) | 25014);
                M.j();
                cVar2 = a3;
            }
            f9p0.b(bVar.getImage(), b9p0Var2, cVar2, q630Var, null, M, (i3 >> 6) & 7168, 16);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dkk(cVar, bVar, z, z2, izsVar, q630Var, i);
        }
    }
}
