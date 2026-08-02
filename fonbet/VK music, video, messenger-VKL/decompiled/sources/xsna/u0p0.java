package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import xsna.qn60;
import xsna.soa0;

/* compiled from: TogglePinnedUserProfileWallEntryEditorAction.kt */
/* loaded from: classes4.dex */
public final class u0p0 implements qn60.b {
    public final NewsEntry a;
    public final pn60 b;

    public u0p0(NewsEntry newsEntry, pn60 pn60Var) {
        this.a = newsEntry;
        this.b = pn60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        Owner s;
        NewsEntry newsEntry = this.a;
        UserId userId = newsEntry instanceof Post ? ((Post) newsEntry).m : (!(newsEntry instanceof l490) || (s = ((l490) newsEntry).s()) == null) ? null : s.b;
        if (userId == null) {
            return;
        }
        HashSet c = aVar.c(new soa0.a(userId));
        NewsEntry newsEntry2 = c != null ? (NewsEntry) j5g.Z(c) : null;
        LinkedHashSet c2 = aVar.a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c2) {
            if (obj instanceof NewsEntry) {
                arrayList.add(obj);
            }
        }
        boolean f = na60.f(newsEntry);
        ArrayList H = (!f || newsEntry2 == null) ? f ? sa30.H(newsEntry, arrayList) : sa30.S(newsEntry, arrayList) : sa30.H(newsEntry, sa30.S(newsEntry2, arrayList));
        if (!epx.f(newsEntry2, newsEntry) && newsEntry2 != null) {
            na60.i(newsEntry2, false);
        }
        na60.i(newsEntry, f);
        aVar.a();
        aVar.f(H, new ujm0(this, 4));
    }
}
