package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.vk.core.preference.Preference;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import xsna.dvc0;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ovc0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ovc0(com.vk.lists.c cVar, zwq0 zwq0Var, boolean z) {
        this.d = cVar;
        this.e = zwq0Var;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                pvc0 pvc0Var = (pvc0) this.d;
                String str = (String) this.e;
                mwc0 mwc0Var = (mwc0) obj;
                pvc0Var.c(new dvc0.a(zp60.a));
                return new qvc0(new qr60.a.g(mwc0Var.a, mwc0Var.b, mwc0Var.d, this.c, false, (str == null || str.length() == 0) ? null : Integer.valueOf(odq.a(str, mwc0Var.a)), null, 64));
            default:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                zwq0 zwq0Var = (zwq0) this.e;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                boolean f = epx.f(cVar.j(), "0");
                cVar.s(wallWithCounters.s1());
                sa30 sa30Var = zwq0Var.f0;
                pxq0 pxq0Var = zwq0Var.d0;
                boolean z = this.c;
                if ((f || z) && wallWithCounters.size() > 0) {
                    zwq0Var.k0 = null;
                    NewsEntry newsEntry = wallWithCounters.get(0);
                    if (newsEntry instanceof Post) {
                        Post post = (Post) newsEntry;
                        if (post.l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
                            zwq0Var.k0 = Integer.valueOf(post.n);
                        }
                    }
                }
                Integer num = zwq0Var.k0;
                sa30Var.getClass();
                sa30.h(wallWithCounters, num);
                zwq0Var.l0 = wallWithCounters.m();
                zwq0Var.m0 = true;
                zwq0Var.g0();
                if ((zwq0Var.g0.b == 0 || zwq0Var.e0()) && zwq0Var.c.d.isEmpty()) {
                    Preference.l().edit().putInt("postponed_count", wallWithCounters.k()).apply();
                    zwq0Var.h0(wallWithCounters.k());
                    zwq0Var.n0 = wallWithCounters.k();
                }
                zwq0Var.o0 = wallWithCounters.j();
                pxq0Var.a8(wallWithCounters.j());
                if (f || z) {
                    pxq0Var.C3(wallWithCounters.k(), wallWithCounters.l());
                }
                if (!z) {
                    sa30.N(wallWithCounters, zwq0Var.d);
                }
                pxq0Var.v0(wallWithCounters.m());
                if (!wallWithCounters.isEmpty()) {
                    zwq0Var.o(wallWithCounters, null);
                }
                if (f) {
                    pxq0Var.Jk();
                }
                if (TextUtils.isEmpty(wallWithCounters.s1()) || wallWithCounters.isEmpty()) {
                    cVar.r(false);
                }
                if (z && zwq0Var.j0 != null) {
                    pxq0Var.Ne();
                    zwq0Var.j0 = null;
                }
                pxq0Var.g3();
                return s3q0.a;
        }
    }

    public /* synthetic */ ovc0(pvc0 pvc0Var, boolean z, String str) {
        this.d = pvc0Var;
        this.c = z;
        this.e = str;
    }
}
