package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.video.topshelf.state.TopshelfCardMetaCountState;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.mno0;
import xsna.q630;
import xsna.rmw;
import xsna.wkj;

/* compiled from: TopshelfCardTextContent.kt */
/* loaded from: classes2.dex */
public final class obp0 {

    /* compiled from: TopshelfCardTextContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TopshelfCardMetaCountState.Style.values().length];
            try {
                iArr[TopshelfCardMetaCountState.Style.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TopshelfCardMetaCountState.Style.Accent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TopshelfCardMetaCountState.Style.LiveUpcoming.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(TopshelfCardMetaCountState topshelfCardMetaCountState, jap0 jap0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        ContentBadgeMode contentBadgeMode;
        ContentBadgeAppearance contentBadgeAppearance;
        androidx.compose.runtime.a M = aVar.M(-1787471231);
        if ((i & 6) == 0) {
            i2 = (M.J(topshelfCardMetaCountState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(jap0Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1787471231, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.text.MetaCountBadge (TopshelfCardTextContent.kt:180)");
            }
            mno0.i iVar = topshelfCardMetaCountState.a;
            TopshelfCardMetaCountState.Style style = topshelfCardMetaCountState.b;
            String a2 = iVar.a(0, M);
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
            int[] iArr = a.$EnumSwitchMapping$0;
            int i3 = iArr[style.ordinal()];
            if (i3 == 1) {
                contentBadgeMode = ContentBadgeMode.Secondary;
            } else if (i3 == 2) {
                contentBadgeMode = ContentBadgeMode.Primary;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                contentBadgeMode = ContentBadgeMode.Primary;
            }
            int i4 = iArr[style.ordinal()];
            if (i4 == 1) {
                contentBadgeAppearance = ContentBadgeAppearance.Design.Overlay;
            } else if (i4 == 2) {
                contentBadgeAppearance = ContentBadgeAppearance.Design.Negative;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                contentBadgeAppearance = new ContentBadgeAppearance.b(VkColorToken.IconSecondary, VkColorToken.TextContrast, VkColorToken.Transparent);
            }
            ContentBadgeAppearance contentBadgeAppearance2 = contentBadgeAppearance;
            kbp0 kbp0Var = jap0Var.d;
            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Overlay;
            M.K(-1550144249);
            M.j();
            M.K(-1549888499);
            M.j();
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            M.K(91190491);
            M.j();
            M.K(99943247);
            M.j();
            M.K(100039440);
            M.j();
            aVar2 = M;
            rnu0.c(contentBadgeSize, contentBadgeMode, contentBadgeAppearance2, null, null, null, a2, null, null, null, false, null, false, null, aVar2, 32774, 0, 16168);
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
            s.d = new pvi(topshelfCardMetaCountState, jap0Var, i, 1);
        }
    }

    public static final void b(bbp0 bbp0Var, jap0 jap0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1983858522);
        if ((i & 6) == 0) {
            i2 = (M.J(bbp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(jap0Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1983858522, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.text.MetaInfo (TopshelfCardTextContent.kt:149)");
            }
            kbp0 kbp0Var = jap0Var.d;
            long c = l5g.c(14, kbp0Var.j.a(0, M), kbp0Var.l);
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kbp0Var.e);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            TopshelfCardMetaCountState topshelfCardMetaCountState = bbp0Var.a;
            if (topshelfCardMetaCountState == null) {
                M.K(1198029622);
            } else {
                M.K(1198029623);
                a(topshelfCardMetaCountState, jap0Var, M, i2 & 112);
            }
            M.j();
            mno0 mno0Var = bbp0Var.b;
            if (mno0Var == null) {
                M.K(1198195813);
                M.j();
                aVar2 = M;
            } else {
                M.K(1198195814);
                String a3 = mno0Var.a(0, M);
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                aVar2 = M;
                yqv0.c(a3, new xpy(1.0f, true), c, null, null, 0, 0, null, 2, false, 0, 1, null, kbp0Var.h, aVar2, 100663296, 48, 5880);
                aVar2.j();
            }
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
            s.d = new zf0(bbp0Var, jap0Var, i, 3);
        }
    }

    public static final void c(final sbp0 sbp0Var, final sbp0 sbp0Var2, final rbp0 rbp0Var, final bbp0 bbp0Var, final jap0 jap0Var, final float f, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        kbp0 kbp0Var = jap0Var.d;
        androidx.compose.runtime.a M = aVar.M(-738119669);
        if ((i & 6) == 0) {
            i2 = (M.J(sbp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(sbp0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(rbp0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(bbp0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(jap0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.n(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-738119669, i4, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.text.TextContent (TopshelfCardTextContent.kt:56)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(1969077887);
            e(sbp0Var, jap0Var, M, (i4 >> 9) & 112);
            M.j();
            if (sbp0Var2 == null) {
                M.K(1969227988);
            } else {
                M.K(1969227989);
                e(sbp0Var2, jap0Var, M, (i4 >> 9) & 112);
            }
            M.j();
            if (rbp0Var == null) {
                M.K(1969392815);
                M.j();
                i3 = 0;
            } else {
                M.K(1969392816);
                d(kbp0Var.c, M, 0);
                i3 = 0;
                f(rbp0Var, kbp0Var.g, kbp0Var.i.a(0, M), kbp0Var.k, M, 0);
                M.j();
            }
            bbp0 bbp0Var2 = (bbp0Var == null || (bbp0Var.a == null && bbp0Var.b == null)) ? null : bbp0Var;
            if (bbp0Var2 == null) {
                M.K(1969806262);
            } else {
                M.K(1969806263);
                d(kbp0Var.d, M, i3);
                b(bbp0Var2, jap0Var, M, (i4 >> 9) & 112);
            }
            M.j();
            d(f, M, (i4 >> 15) & 14);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lbp0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    obp0.c(sbp0.this, sbp0Var2, rbp0Var, bbp0Var, jap0Var, f, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1209620707);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1209620707, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.text.TextContentSpacer (TopshelfCardTextContent.kt:91)");
            }
            if (pco.a(f, 0) > 0) {
                M.K(-1034788629);
                ck70.b(q630.a.a, f, M, 0);
            } else {
                M.K(-1038735611);
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
            s.d = new wzs() { // from class: xsna.mbp0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    obp0.d(f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(sbp0 sbp0Var, jap0 jap0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        int i3;
        kbp0 kbp0Var = jap0Var.d;
        androidx.compose.runtime.a M = aVar.M(-730669296);
        if ((i & 6) == 0) {
            i2 = (M.J(sbp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(jap0Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-730669296, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.text.Title (TopshelfCardTextContent.kt:101)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(aVar4, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            rmw rmwVar = sbp0Var.b;
            if (rmwVar == null) {
                M.K(134282458);
                M.j();
                i3 = 0;
                aVar3 = M;
            } else {
                M.K(134282459);
                lg90 a3 = rmw.b.a(null, rmwVar, M, 0, 3);
                q630 q = txj0.q(aVar4, kbp0Var.a);
                M.K(717395085);
                M.j();
                aVar3 = M;
                i3 = 0;
                r0v0.a(a3, q, null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar3, 3080, 116);
                mq.d(aVar4, kbp0Var.b, aVar3, 0);
            }
            us2 c2 = sbp0Var.a.c(aVar3);
            frv0 frv0Var = kbp0Var.f;
            long a4 = kbp0Var.i.a(i3, aVar3);
            int i4 = sbp0Var.c;
            boolean z = kbp0Var.k;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            androidx.compose.runtime.a aVar6 = aVar3;
            qbp0.a(c2, frv0Var, a4, i4, z, new xpy(1.0f, true), aVar6, 0);
            aVar2 = aVar6;
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
            s.d = new pyq(sbp0Var, jap0Var, i, 1);
        }
    }

    public static final void f(final rbp0 rbp0Var, final frv0 frv0Var, final long j, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1820689354);
        int i2 = i | (M.J(rbp0Var) ? 4 : 2) | (M.J(frv0Var) ? 32 : 16) | (M.p(j) ? 256 : 128) | (M.l(z) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1820689354, i2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.text.TopshelfText (TopshelfCardTextContent.kt:134)");
            }
            qbp0.a(rbp0Var.a.c(M), frv0Var, j, rbp0Var.b, z, txj0.f(q630.a.a, 1.0f), M, (i2 & 112) | 196608 | (i2 & 896) | ((i2 << 3) & 57344));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(frv0Var, j, z, i) { // from class: xsna.nbp0
                public final /* synthetic */ frv0 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ boolean e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    obp0.f(rbp0.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
