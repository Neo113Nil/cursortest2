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
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.gl.tf.Tensorflow;
import xsna.ci40;
import xsna.cri;
import xsna.dt1;
import xsna.dt70;
import xsna.q630;
import xsna.us2;
import xsna.voa;

/* compiled from: OfflineAudioBookChaptersMviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class zs70 {
    public static final bpn0 a = new bpn0(new t970(2));

    /* compiled from: LazyDsl.kt */
    public static final class a implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public a(ow60 ow60Var, List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((dt70.a) this.b.get(num.intValue())).a;
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
        public final /* synthetic */ lf4 c;
        public final /* synthetic */ izs d;

        public c(List list, lf4 lf4Var, izs izsVar) {
            this.b = list;
            this.c = lf4Var;
            this.d = izsVar;
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
                dt70.a aVar3 = (dt70.a) this.b.get(intValue);
                aVar2.K(-504070850);
                zs70.a(aVar3, this.c, this.d, null, aVar2, 0);
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

    public static final void a(dt70.a aVar, lf4 lf4Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar2.M(-1789339398);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(lf4Var) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1789339398, i2, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.ChapterItem (OfflineAudioBookChaptersMviComposeComponent.kt:256)");
            }
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(txj0.f(aVar3, 1.0f), "audiobookChapterItem");
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z = (i3 == 256) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new nh3(20, izsVar2, aVar);
                M.R(x);
            }
            q630 c2 = ojc.c(E, false, null, null, (gzs) x, 15);
            com.vk.core.compose.component.cell.content.z a2 = com.vk.core.compose.component.cell.content.g.a(lf4Var, Cell$Left.Main.Size.Large, null, PictureRadius.Medium, null, M, ((i2 >> 3) & 14) | 12607536, 108);
            String str = aVar.b;
            Object obj = aVar.d;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new bws(7);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(str, null, null, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, M, 12610560, 70);
            AudioBooksChapterProgressStatus audioBooksChapterProgressStatus = (AudioBooksChapterProgressStatus) obj;
            String c3 = ie4.c((Context) M.r(AndroidCompositionLocals_androidKt.b), audioBooksChapterProgressStatus, aVar.c, aVar.e);
            us2.b bVar = new us2.b();
            bVar.g(c3);
            if (audioBooksChapterProgressStatus == AudioBooksChapterProgressStatus.DONE) {
                s0x.a(bVar, "(✓)", " ✓");
            }
            us2 n = bVar.n();
            Map d = ie4.d(M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new q520(7);
                M.R(x3);
            }
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(a3, Cell$Middle.c.b.a(n, d, 0, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, M, 805306368, 444), null, null, M, 196608, 28);
            bi40 bi40Var = aVar.f;
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
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = ys70.b;
                M.R(x4);
            }
            izs izsVar3 = (izs) ((fcy) x4);
            boolean z2 = (i3 == 256) | (i4 == 4);
            Object x5 = M.x();
            if (z2 || x5 == c0012a) {
                izsVar2 = izsVar;
                x5 = new xy0(16, izsVar2, aVar);
                M.R(x5);
            } else {
                izsVar2 = izsVar;
            }
            wiu0.b(c2, false, a2, a4, ci40.a.a(bi40Var, a5, izsVar3, K, (gzs) x5, booleanValue, M), null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ws70(aVar, lf4Var, izsVar2, q630Var2, i);
        }
    }

    public static final void b(dt70.b bVar, izs<? super us70, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1413764836);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1413764836, i2, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.DeleteAllAlert (OfflineAudioBookChaptersMviComposeComponent.kt:307)");
            }
            dt70.c cVar = bVar.e;
            String N = d370.N(cVar.b, 0, M);
            String N2 = d370.N(cVar.c, 0, M);
            String N3 = d370.N(cVar.e, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new zc4(izsVar, 5);
                M.R(x);
            }
            Alert$Button alert$Button = new Alert$Button(N3, (gzs) x, Alert$Button.Style.Negative, null);
            Alert$Button alert$Button2 = new Alert$Button(d370.N(cVar.d, 0, M), gzsVar, Alert$Button.Style.Neutral, null);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new cdw(1, gzsVar);
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
            s.d = new em(bVar, izsVar, gzsVar, i, 4);
        }
    }

    public static final void c(dt70.b bVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1654856567);
        int i2 = (M.J(bVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1654856567, i2, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.HeaderItem (OfflineAudioBookChaptersMviComposeComponent.kt:201)");
            }
            List<dt70.a> list = bVar.d;
            int size = list.size();
            Integer valueOf = Integer.valueOf(list.size());
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Iterator<T> it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                i3 += ((dt70.a) it.next()).e;
            }
            bpn0 bpn0Var = ie4.a;
            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.F(R.plurals.music_title_audio_book_chapters, size, new Object[]{valueOf, pq3.a(i3, context).toString()}, M, 0), null, null, null, null, null, null, null, false, M, 805306368, 510), ahn.E(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7), "offlineChaptersListHeader"), b.d.a, null, null, GroupHeader$Right.c.a(GroupHeader$Right.a.C0743a.C0744a.a(d370.N(bVar.e.a, 0, M), gzsVar, null, null, null, null, null, M, 48, 32764), null, null, null, M, 14), false, M, Tensorflow.FRAME_WIDTH, 88);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vue(bVar, gzsVar, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(dt70.b bVar, izs<? super us70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        wh50 wh50Var;
        androidx.compose.runtime.a M = aVar.M(482600625);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(482600625, i2, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersContentScreen (OfflineAudioBookChaptersMviComposeComponent.kt:177)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            float f = lf4.b;
            Thumb thumb = bVar.c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(391524036, 48, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.AudioBookCover.Companion.invoke (OfflineAudioBookChaptersMviComposeComponent.kt:390)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new lf4(thumb);
                M.R(x2);
            }
            lf4 lf4Var = (lf4) x2;
            ((zak0) lf4Var.a).setValue(thumb);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = ahn.E(q630.a.a, "offlineAudioBookChapterList");
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean J = (i3 == 4) | M.J(lf4Var) | (i4 == 32);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                wh50Var = wh50Var2;
                xs70 xs70Var = new xs70(bVar, wh50Var, lf4Var, izsVar, 0);
                M.R(xs70Var);
                x3 = xs70Var;
            } else {
                wh50Var = wh50Var2;
            }
            lqy.a(E, null, null, null, null, null, false, null, (izs) x3, M, 6, 510);
            M = M;
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(1900377878);
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new n26(2, wh50Var);
                    M.R(x4);
                }
                b(bVar, izsVar, (gzs) x4, M, i4 | i3 | 384);
            } else {
                M.K(1892320017);
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
            s.d = new zd0(bVar, izsVar, i, 5);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1069863982);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1069863982, i, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersLoadingScreen (OfflineAudioBookChaptersMviComposeComponent.kt:142)");
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
            ckv0.a(null, null, xii.b, aVar2, 384, 3);
            aVar2.K(-300974657);
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
            s.d = new mw0(i);
        }
    }

    public static final void f(dt70 dt70Var, izs<? super us70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-456031703);
        if ((i & 6) == 0) {
            i2 = (M.J(dt70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-456031703, i2, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersScreen (OfflineAudioBookChaptersMviComposeComponent.kt:127)");
            }
            jai c2 = kai.c(368219888, new og4(5, dt70Var, izsVar), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(null, c2, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-1486971003, new i3c(3, dt70Var, izsVar), M), M, 805306416, 381);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sy9(dt70Var, izsVar, i, 3);
        }
    }

    public static final void g(dt70 dt70Var, izs<? super us70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-669305735);
        int i2 = (M.J(dt70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-669305735, i2, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.TopBar (OfflineAudioBookChaptersMviComposeComponent.kt:228)");
            }
            String N = d370.N(R.string.vk_back, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new mv7(izsVar, 3);
                M.R(x);
            }
            TopBar$Before.e a2 = e.a.a((gzs) x, N, null, null, null, M, 196608, 28);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new p2u(12);
                M.R(x2);
            }
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(dt70Var.d(), null, null, null, null, M, 196608, 30), TopBar$Middle.Text.d.a.a(d370.N(R.string.audio_book_chapters_screen_subtitle, 0, M), 0, 0, null, null, M, 196608, 30), null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 4), null, null, null, a2, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8174);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fdc(dt70Var, izsVar, i, 6);
        }
    }
}
