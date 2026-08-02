package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.libvideo.design.compose.video.topshelf.state.TopshelfCardMetaCountState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.jbp0;
import xsna.mno0;
import xsna.q630;
import xsna.rmw;

/* compiled from: VideoTopShelfScreenContent.kt */
/* loaded from: classes18.dex */
public final class elt0 implements yah0 {

    /* compiled from: VideoTopShelfScreenContent.kt */
    public static final class a {
        public final String a;
        public final jbp0.a b;
        public final boolean c;

        public a(String str, jbp0.a aVar, boolean z) {
            this.a = str;
            this.b = aVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopshelfCardPreset(title=");
            sb.append(this.a);
            sb.append(", state=");
            sb.append(this.b);
            sb.append(", isLive=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public static bbp0 c(String str, String str2, TopshelfCardMetaCountState.Style style) {
        return new bbp0(new TopshelfCardMetaCountState(new mno0.i(str), style), str2 != null ? new mno0.i(str2) : null);
    }

    public static iap0 d(String str) {
        return new iap0(new rmw.d(R.drawable.vk_icon_play_24), new mno0.i(str));
    }

    public static sbp0 e(elt0 elt0Var, String str, Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        return new sbp0(new mno0.i(str), num != null ? new rmw.d(num.intValue()) : null, (i & 4) != 0 ? 1 : 2);
    }

    public static xap0 f() {
        return new xap0(new rmw.d(R.drawable.vk_icon_volume_24), new mno0.i("Volume"));
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1146140329);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i4 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i4 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1146140329, i2, -1, "com.vk.design.demo.presentation.screens.VideoTopShelfScreenContent.Content (VideoTopShelfScreenContent.kt:37)");
            }
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            jjn0.a("Top Shelf", gzsVar3, x5Var, gzsVar2, null, null, M, ((i2 << 3) & 112) | 6 | (i2 & 896) | ((i2 << 6) & 7168), 48);
            djn0.a(true, false, M, 438, 0);
            gap0 gap0Var = new gap0(new rmw.d(R.drawable.vk_icon_illustration_dinosaur_1024h));
            sbp0 e = e(this, "Family movie night", null, 6);
            rbp0 rbp0Var = new rbp0(new mno0.i("A hand-picked row for family night: films, cartoons and stories that are easy to start watching together, with gentle adventures and familiar heroes for everyone."), 3);
            TopshelfCardMetaCountState.Style style = TopshelfCardMetaCountState.Style.Default;
            List l = e43.l(new a("Film & Baby", new jbp0.a(gap0Var, e, null, rbp0Var, c("7 videos", "Films / Cartoons / 6+", style), d("Watch now"), new xap0(new rmw.d(R.drawable.vk_icon_clock_outline_24), new mno0.i("Watch later")), f()), false), new a("Sport", new jbp0.a(new gap0(new rmw.d(R.drawable.vk_icon_illustration_finish_flag_120h)), e(this, "Atletico", Integer.valueOf(R.drawable.vk_icon_app_sport_24), 4), e(this, "Barcelona", Integer.valueOf(R.drawable.vk_icon_ball_outline_24), 4), null, c("LIVE", "Champions League / Live now", TopshelfCardMetaCountState.Style.Accent), d("Watch broadcast"), null, f()), true), new a("Music", new jbp0.a(new gap0(new rmw.d(R.drawable.vk_icon_illustration_music_glitch_blue)), e(this, "Music premieres", null, 6), null, new rbp0(new mno0.i("New releases, exclusive sessions and playlists for a fresh weekend sound."), 2), null, d("Listen"), null, f()), false), new a("Clips", new jbp0.a(new gap0(new rmw.d(R.drawable.vk_icon_illustration_clips_feed_150)), e(this, "Trending clips and creator picks", null, 2), null, new rbp0(new mno0.i("Short videos selected for you"), 1), c("Creators", null, style), d("Watch trending clips"), null, f()), false));
            List list = l;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).b);
            }
            Iterator it2 = l.iterator();
            int i5 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                } else {
                    if (((a) it2.next()).c) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
            }
            b(arrayList, i3, s200.D(aVar2, 16), M, ((i2 >> 6) & 7168) | 384);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vwq(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(final ArrayList arrayList, final int i, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(283204380);
        if ((i2 & 6) == 0) {
            i3 = (M.J(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(283204380, i3, -1, "com.vk.design.demo.presentation.screens.VideoTopShelfScreenContent.TopshelfPagerSample (VideoTopShelfScreenContent.kt:63)");
            }
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new clt0(arrayList, 0);
                M.R(x);
            }
            yjl b = rc90.b(0, (gzs) x, M, 0, 3);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new lir0(5);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new zlm0(10);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new k990(28);
                M.R(x4);
            }
            izs izsVar3 = (izs) x4;
            boolean J = M.J(b) | ((i3 & 112) == 32);
            Object x5 = M.x();
            if (J || x5 == c0012a) {
                x5 = new sue0(b, i, 1);
                M.R(x5);
            }
            mcp0.a(arrayList, b, izsVar, izsVar2, izsVar3, q630Var2, (gzs) x5, null, null, null, M, i4 | 28032 | ((i3 << 9) & 458752));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dlt0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    elt0.this.b(arrayList, i, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
