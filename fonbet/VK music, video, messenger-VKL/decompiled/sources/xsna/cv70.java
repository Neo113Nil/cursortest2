package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.dto.music.Thumb;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Locale;
import ru.ok.gl.tf.Tensorflow;
import xsna.ci40;
import xsna.cri;
import xsna.dt1;
import xsna.hv70;
import xsna.q630;
import xsna.voa;

/* compiled from: OfflinePodcastEpisodesMviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class cv70 {
    public static final bpn0 a = new bpn0(new de4(27));

    /* compiled from: LazyDsl.kt */
    public static final class a implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public a(zsw zswVar, List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((hv70.c) this.b.get(num.intValue())).a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public b(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ izs c;

        public c(List list, izs izsVar) {
            this.b = list;
            this.c = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                hv70.c cVar = (hv70.c) this.b.get(intValue);
                aVar2.K(-152036587);
                cv70.b(cVar, this.c, null, aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(hv70.a aVar, izs<? super com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-120813525);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-120813525, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.DeleteAllAlert (OfflinePodcastEpisodesMviComposeComponent.kt:382)");
            }
            hv70.b bVar = aVar.e;
            String N = d370.N(bVar.b, 0, M);
            String N2 = d370.N(bVar.c, 0, M);
            String N3 = d370.N(bVar.e, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new u77(izsVar, 4);
                M.R(x);
            }
            Alert$Button alert$Button = new Alert$Button(N3, (gzs) x, Alert$Button.Style.Negative, null);
            Alert$Button alert$Button2 = new Alert$Button(d370.N(bVar.d, 0, M), gzsVar, Alert$Button.Style.Neutral, null);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new bl30(gzsVar, 5);
                M.R(x2);
            }
            t7u0.d(0, 340, M, alert$Button, alert$Button2, null, null, N, N2, null, (izs) x2, null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yu70(aVar, izsVar, gzsVar, i, 0);
        }
    }

    public static final void b(hv70.c cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-227272615);
        int i2 = (M.J(cVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-227272615, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.EpisodeItem (OfflinePodcastEpisodesMviComposeComponent.kt:268)");
            }
            float f = tsp.b;
            Thumb thumb = cVar.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1134027139, 48, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.EpisodeCover.Companion.invoke (OfflinePodcastEpisodesMviComposeComponent.kt:467)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new tsp(thumb);
                M.R(x);
            }
            tsp tspVar = (tsp) x;
            ((zak0) tspVar.a).setValue(thumb);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(txj0.f(aVar2, 1.0f), "podcastEpisodeItem");
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            int i5 = 20;
            if (z || x2 == c0012a) {
                x2 = new com.vk.catalog2.common.ui.holders.b(i5, izsVar, cVar);
                M.R(x2);
            }
            q630 c2 = ojc.c(E, false, null, null, (gzs) x2, 15);
            com.vk.core.compose.component.cell.content.z a2 = com.vk.core.compose.component.cell.content.g.a(tspVar, Cell$Left.Main.Size.Large, null, PictureRadius.Medium, null, M, 12607536, 108);
            String str = cVar.b;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new tuq(20);
                M.R(x3);
            }
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(str, null, null, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, M, 12610560, 70);
            String obj = pq3.a(cVar.e, (Context) M.r(AndroidCompositionLocals_androidKt.b)).toString();
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new av70(0);
                M.R(x4);
            }
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(a3, Cell$Middle.c.b.b(obj, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 12582912, 94), null, null, M, 196608, 28);
            bi40 bi40Var = cVar.f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1899616736, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowDownCircle16> (VkSdkIcons.kt:96)");
            }
            lg90 a5 = pg90.a(R.drawable.vk_icon_arrow_down_circle_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            qzu0.a.getClass();
            lg90 K = qzu0.K(M);
            boolean booleanValue = ((Boolean) a.getValue()).booleanValue();
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = bv70.b;
                M.R(x5);
            }
            izs izsVar2 = (izs) ((fcy) x5);
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x6 = M.x();
            if (z2 || x6 == c0012a) {
                x6 = new hn9(23, izsVar, cVar);
                M.R(x6);
            }
            wiu0.b(c2, false, a2, a4, ci40.a.a(bi40Var, a5, izsVar2, K, (gzs) x6, booleanValue, M), null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nwo(cVar, izsVar, q630Var2, i);
        }
    }

    public static final void c(hv70.a aVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-80785890);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-80785890, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.HeaderItem (OfflinePodcastEpisodesMviComposeComponent.kt:202)");
            }
            int i3 = aVar.f;
            String F = d370.F(R.plurals.music_title_podcast_episodes, i3, new Object[]{Integer.valueOf(i3), pq3.a(aVar.g, (Context) M.r(AndroidCompositionLocals_androidKt.b))}, M, 0);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new gvs(17);
                M.R(x);
            }
            com.vk.core.compose.component.group.header.f a2 = f.a.a(F, null, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, false, M, 805306368, 446);
            b.d dVar = b.d.a;
            GroupHeader$Right.a.C0743a a3 = GroupHeader$Right.a.C0743a.C0744a.a(d370.N(aVar.e.a, 0, M), gzsVar, null, null, null, null, null, M, 48, 32764);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new nyq(19);
                M.R(x2);
            }
            com.vk.core.compose.component.group.header.g.b(a2, ahn.E(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7), "offlineEpisodesListHeader"), dVar, null, null, GroupHeader$Right.c.a(a3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 6), false, M, Tensorflow.FRAME_WIDTH, 88);
            aVar3 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new xx9(aVar, gzsVar, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(hv70.a aVar, izs<? super com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        hv70.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(612922093);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(612922093, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesContentScreen (OfflinePodcastEpisodesMviComposeComponent.kt:179)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630 E = ahn.E(q630.a.a, "offlineEpisodesList");
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i3 == 4) | (i4 == 32);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new q45(aVar, wh50Var, izsVar, 6);
                M.R(x2);
            }
            lqy.a(E, null, null, null, null, null, false, null, (izs) x2, M, 6, 510);
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(1656721082);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new h3(4, wh50Var);
                    M.R(x3);
                }
                aVar3 = aVar;
                a(aVar3, izsVar, (gzs) x3, M, i3 | 384 | i4);
            } else {
                aVar3 = aVar;
                M.K(1648822933);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = aVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn7(aVar3, izsVar, i, 8);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2049825790);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2049825790, i, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesLoadingScreen (OfflinePodcastEpisodesMviComposeComponent.kt:144)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            aVar2 = M;
            ckv0.a(null, null, aji.b, aVar2, 384, 3);
            aVar2.K(-1146136001);
            for (int i2 = 0; i2 < 10; i2++) {
                androidx.compose.runtime.a aVar4 = aVar2;
                yiu0.a(null, uoa.a(Cell$Left.Main.Size.Large, PictureRadius.Medium, aVar2, 3126, 4), voa.a.a(xoa.a(232, aVar2, 390, 2), xoa.a(170, aVar2, 390, 2), null, null, aVar4, 196608, 28), null, aVar4, 0, 9);
                aVar2 = aVar4;
            }
            if (gp.d(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new e69(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(hv70 hv70Var, izs<? super com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1861466974);
        if ((i & 6) == 0) {
            i2 = (M.J(hv70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1861466974, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.OfflinePodcastEpisodesScreen (OfflinePodcastEpisodesMviComposeComponent.kt:124)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            jai c2 = kai.c(-1821544649, new w2k(hv70Var, izsVar, wh50Var, 5), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            phv0.b(null, c2, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(152443010, new nxt(1, hv70Var, izsVar), M), M, 805306416, 381);
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(-1654398762);
                OfflinePodcastEpisodesMviState.SortType f = hv70Var.f();
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new vmi(3, wh50Var);
                    M.R(x2);
                }
                g(f, izsVar, (gzs) x2, M, (i3 & 112) | 384);
            } else {
                M.K(-1660560508);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tbo(hv70Var, izsVar, i, 1);
        }
    }

    public static final void g(OfflinePodcastEpisodesMviState.SortType sortType, izs<? super com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        OfflinePodcastEpisodesMviState.SortType sortType2;
        androidx.compose.runtime.a M = aVar.M(2114415928);
        int i2 = i | (M.o(sortType.ordinal()) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2114415928, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.SortBottomSheet (OfflinePodcastEpisodesMviComposeComponent.kt:323)");
            }
            sortType2 = sortType;
            b5v0.a(gzsVar, null, null, null, kai.c(-1613977035, new am3(sortType2, izsVar, gzsVar), M), null, false, false, null, M, 12607494, 366);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            sortType2 = sortType;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xs0(i, 2, sortType2, izsVar, gzsVar);
        }
    }

    public static final void h(final OfflinePodcastEpisodesMviState.SortType sortType, final boolean z, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        OfflinePodcastEpisodesMviState.SortType sortType2;
        com.vk.core.compose.component.cell.content.y0 a2;
        androidx.compose.runtime.a M = aVar.M(-1271992528);
        int i2 = i | (M.o(sortType.ordinal()) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1271992528, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.SortItem (OfflinePodcastEpisodesMviComposeComponent.kt:356)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            boolean z2 = !z;
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                sortType2 = sortType;
                x = new com.vk.movika.sdk.base.logic.interactor.c(17, izsVar, sortType2);
                M.R(x);
            } else {
                sortType2 = sortType;
            }
            q630 c2 = ojc.c(f, z2, null, null, (gzs) x, 14);
            String N = d370.N(sortType2.j(), 0, M);
            if (N.length() > 0) {
                N = ((Object) String.valueOf(N.charAt(0)).toUpperCase(Locale.ROOT)) + N.substring(1);
            }
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(N, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            androidx.compose.runtime.a aVar3 = M;
            if (z) {
                aVar3.K(1680877574);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_check_circle_on_24, 0, aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(a4, ylu0Var.getIcon().a, 0L, null, null, null, aVar3, 1572872, 60), null, null, null, aVar3, 61);
                aVar3 = aVar3;
                aVar3.j();
            } else {
                aVar3.K(567576845);
                aVar3.j();
                a2 = null;
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            wiu0.b(c2, false, null, a3, a2, null, null, aVar4, 0, 102);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, izsVar, q630Var2, i) { // from class: xsna.zu70
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    cv70.h(OfflinePodcastEpisodesMviState.SortType.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(hv70 hv70Var, izs<? super com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1923652583);
        int i2 = i | (M.J(hv70Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1923652583, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.TopBar (OfflinePodcastEpisodesMviComposeComponent.kt:236)");
            }
            String N = d370.N(R.string.vk_back, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new h74(izsVar, 5);
                M.R(x);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x, N, null, null, null, M, 196608, 28);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(hv70Var.n(), null, null, null, null, M, 196608, 30), TopBar$Middle.Text.d.a.a(d370.N(R.string.podcast_episodes_screen_subtitle, 0, M), 0, 0, null, null, M, 196608, 30), null, null, M, 12);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1724306650, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-SortOutline28> (VkIcons.kt:10156)");
            }
            lg90 b2 = or.b(M, 1010721484, R.drawable.vk_icon_sort_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N2 = d370.N(R.string.podcast_episodes_talkback_sort, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a3, null, null, null, a2, null, d.a.a(d.c.C0760d.a.a(b2, N2, gzsVar, null, new l5g(ylu0Var.getIcon().b), null, M, 1573256, 40), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8110);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g8k(i, 1, hv70Var, izsVar, gzsVar, false);
        }
    }
}
