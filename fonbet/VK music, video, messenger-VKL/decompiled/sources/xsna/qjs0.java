package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.d;
import com.vk.core.compose.component.group.header.f;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VideoEpisodesDelegate.kt */
/* loaded from: classes2.dex */
public final class qjs0 {
    public static final void a(btp btpVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        List<atp> list = btpVar.a;
        androidx.compose.runtime.a M = aVar.M(-205434421);
        int i2 = (M.J(btpVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-205434421, i2, -1, "com.vk.libvideo.bottomsheet.about.delegate.EpisodeSection (VideoEpisodesDelegate.kt:105)");
            }
            xvy a = zvy.a(0, 3, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            int i3 = i2 & 14;
            boolean J = (i3 == 4) | M.J(a);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new ojs0(btpVar, a, wh50Var, null);
                M.R(x2);
            }
            bap.g(list, (wzs) x2, M, 0);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, c, cri.a.d);
            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.video_episode_title, 0, M), null, d.a.a(list.size(), CounterAppearance.Priority.Low, CounterMode.Tertiary, null, null, M, 197040, 24), null, null, null, null, null, false, M, 805306368, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE), aVar2, b.c.a, null, null, GroupHeader$Right.c.a(GroupHeader$Right.a.C0743a.C0744a.a(d370.N(R.string.video_show_all, 0, M), btpVar.c, null, null, null, null, null, M, 0, 32764), null, null, null, M, 14), btpVar.e, M, Tensorflow.FRAME_WIDTH, 24);
            M = M;
            float f = kqu0.b;
            float f2 = kqu0.c;
            u890 u890Var = new u890(f, f2, f, f2);
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            boolean z = i3 == 4;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new vyq0(btpVar, 3);
                M.R(x3);
            }
            lqy.b(aVar2, a, u890Var, g, null, null, false, null, (izs) x3, M, 6, 488);
            M.G();
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
            s.d = new zw5(btpVar, q630Var2, i, 8);
        }
    }
}
