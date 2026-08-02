package xsna;

import com.ironsource.X3;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.requests.SearchGetHintsWithAttachments;
import com.vk.toggle.features.FeedFeatures;
import java.util.List;
import kotlin.Pair;

/* compiled from: FeedBridgeImpl.kt */
/* loaded from: classes4.dex */
public final class gxq implements fxq {
    public static final gxq a = new gxq();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [xsna.i860, xsna.j960, xsna.rsg0] */
    @Override // xsna.fxq
    public final io.reactivex.rxjava3.disposables.c a(cn cnVar, String str) {
        v9x0 v9x0Var;
        iuc0 iuc0Var = iuc0.b;
        FeedFeatures feedFeatures = FeedFeatures.WALL_POST_ROLLBACK;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
            Owner l0 = cnVar.b().l0();
            ?? j960Var = new j960(pn00.m(new Pair(l0.b, l0)));
            UiTracker uiTracker = UiTracker.a;
            j960Var.K0(UiTracker.d());
            UserId userId = cnVar.a;
            if (fkq0.c(userId)) {
                j960Var.F(userId, "owner_id");
            }
            j960Var.K("message", "#vkfest5");
            j960Var.K("attachments", str);
            v9x0Var = j960Var;
        } else {
            UserId userId2 = cnVar.a;
            List N = nr2.N(str);
            UiTracker uiTracker2 = UiTracker.a;
            v9x0Var = new v9x0(new bax0(userId2, "#vkfest5", N, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, UiTracker.d(), null, null, null, null, null, null, null, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, -134217736, 524287));
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.D0(v9x0Var), new b0y(new tuq(25), 18)).subscribe(new uu60(new d0k(23), 11), new auc0(juc0.b, 0));
    }

    @Override // xsna.fxq
    public final io.reactivex.rxjava3.core.q<List<NewsEntry>> b(String str) {
        iuc0 iuc0Var = iuc0.b;
        return rsg0.y0(new i730(str), null, null, 3);
    }

    @Override // xsna.fxq
    public final io.reactivex.rxjava3.core.q c(String str) {
        return rsg0.y0(new SearchGetHintsWithAttachments(str, 50, e43.l(X3.j.D, "verified", "trending", "photo_base")), null, null, 3).U(new nb(new k60(28), 16));
    }
}
