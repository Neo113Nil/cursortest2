package xsna;

import android.text.TextUtils;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.requests.WallWithCounters;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lvh implements izs {
    public final /* synthetic */ com.vk.lists.c b;
    public final /* synthetic */ mvh c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lvh(com.vk.lists.c cVar, mvh mvhVar, boolean z) {
        this.b = cVar;
        this.c = mvhVar;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WallWithCounters wallWithCounters = (WallWithCounters) obj;
        com.vk.lists.c cVar = this.b;
        boolean f = epx.f(cVar.j(), "0");
        cVar.s(wallWithCounters.s1());
        mvh mvhVar = this.c;
        sa30 sa30Var = mvhVar.h0;
        awh awhVar = mvhVar.d0;
        boolean z = this.d;
        boolean z2 = z || f;
        if (z2) {
            mvhVar.n0 = wallWithCounters.k();
            mvhVar.o0 = wallWithCounters.l();
            mvhVar.p0 = wallWithCounters.j();
            awhVar.W3(wallWithCounters.k(), wallWithCounters.l(), mvhVar.p0);
        }
        if (z2 && !wallWithCounters.isEmpty()) {
            mvhVar.s0 = null;
            NewsEntry newsEntry = wallWithCounters.get(0);
            if (newsEntry instanceof Post) {
                Post post = (Post) newsEntry;
                if (post.mc()) {
                    mvhVar.s0 = Integer.valueOf(post.n);
                }
            }
        }
        Integer num = mvhVar.s0;
        sa30Var.getClass();
        sa30.h(wallWithCounters, num);
        mvhVar.m0 = wallWithCounters.m();
        awhVar.g3();
        mvhVar.f0();
        if (!z) {
            sa30.N(wallWithCounters, mvhVar.d);
        }
        awhVar.v0(wallWithCounters.m());
        if (!wallWithCounters.isEmpty()) {
            mvhVar.o(wallWithCounters, null);
            com.vk.lists.c cVar2 = mvhVar.g;
            if (cVar2 != null) {
                cVar2.s(wallWithCounters.s1());
            }
        }
        if (TextUtils.isEmpty(wallWithCounters.s1()) || wallWithCounters.isEmpty()) {
            cVar.r(false);
        }
        return s3q0.a;
    }
}
