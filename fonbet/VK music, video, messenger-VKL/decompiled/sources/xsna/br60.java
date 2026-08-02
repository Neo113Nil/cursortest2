package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.jm50;
import xsna.xqu;
import xsna.yo60;

/* compiled from: NewsfeedListNavigationTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class br60 extends evg0<ur60, on50, ds60.d, ds60, qr60, yo60> {
    public final Lazy f;
    public final Lazy g;

    public br60(Lazy lazy, Lazy lazy2, eht ehtVar) {
        super(jm50.a.a, ehtVar);
        this.f = lazy;
        this.g = lazy2;
    }

    @Override // xsna.mn50
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final zvg0 d(ds60.d dVar) {
        ajx c;
        VideoAttachment i;
        Post post;
        io.reactivex.rxjava3.internal.operators.observable.f0 w0;
        if (dVar instanceof ds60.d.g) {
            ds60.d.g gVar = (ds60.d.g) dVar;
            Post post2 = gVar.b;
            PostingCreationEntryPoint postingCreationEntryPoint = gVar.c;
            UserId e = fkq0.e(post2.m);
            int i2 = 1;
            io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new iq40(e, 1));
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.internal.operators.single.f0 q = vVar.q(asu0Var.c());
            ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
            comFeatures.getClass();
            int i3 = 7;
            if (com.vk.toggle.b.A.a(comFeatures)) {
                List singletonList = Collections.singletonList(fkq0.a(e));
                List<GroupsFieldsDto> list = fkg.a;
                if ((4 & 2) != 0) {
                    list = null;
                }
                fz2 y = yfb.y(xqu.a.a(null, singletonList, list), new y510(i3));
                ahn.D(y);
                w0 = rsg0.w0(y);
            } else {
                w0 = rsg0.w0(new rpu(e));
            }
            return g(q.n(w0).m(asu0Var.d()), new pmu(this, i3), new fn6(i2, post2, this, postingCreationEntryPoint));
        }
        if (dVar instanceof ds60.d.c) {
            ds60.d.c cVar = (ds60.d.c) dVar;
            NewsEntry newsEntry = cVar.b;
            c(new fp60(newsEntry, Integer.valueOf(cVar.c)));
            Post post3 = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post3 != null && (post = post3.D) != null) {
                c(new yo60.f.l(post));
                return null;
            }
        } else {
            if (dVar instanceof ds60.d.C2750d) {
                ds60.d.C2750d c2750d = (ds60.d.C2750d) dVar;
                c(new yo60.f.j(c2750d.b, c2750d.c, c2750d.d, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.MENU_OPTION));
                return null;
            }
            if (dVar instanceof ds60.d.a) {
                String str = m3n.a().b;
                if (str != null && str.length() != 0) {
                    c(new yo60.f.t(str));
                    return null;
                }
            } else {
                if (dVar instanceof ds60.d.b) {
                    Object obj = m3n.a;
                    c(new yo60.f.t("discover_category_trends/trends"));
                    return null;
                }
                if (dVar instanceof ds60.d.f) {
                    ds60.d.f fVar = (ds60.d.f) dVar;
                    NewsEntry newsEntry2 = fVar.b;
                    c(new kp60(newsEntry2, Integer.valueOf(fVar.c)));
                    Post post4 = newsEntry2 instanceof Post ? (Post) newsEntry2 : null;
                    if (post4 != null) {
                        if (!((AuthBridgeComponent) this.g.getValue()).s().a(post4.m)) {
                            c(new yo60.f.k(post4));
                            return null;
                        }
                        if (post4.gc()) {
                            Post R = di60.R(post4);
                            if ((R != null ? di60.i(R) : null) != null) {
                                Post R2 = di60.R(post4);
                                if (R2 != null && (i = di60.i(R2)) != null) {
                                    c(new yo60.f.h(i));
                                    return null;
                                }
                            }
                        }
                        c(new yo60.f.m(post4));
                        return null;
                    }
                } else {
                    if (!(dVar instanceof ds60.d.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NewsEntry newsEntry3 = ((ds60.d.e) dVar).b;
                    if (newsEntry3 instanceof MyTargetNativeAdEntry) {
                        gjx gjxVar = ((MyTargetNativeAdEntry) newsEntry3).B;
                        if (gjxVar != null && (c = up50.c(gjxVar, "ads_recommendations_info")) != null) {
                            ((NewsFeedComponent) this.f.getValue()).ib().b(gjxVar).b(c);
                            return null;
                        }
                    } else {
                        String t = di60.t(newsEntry3);
                        if (t != null) {
                            c(new yo60.f.r(t));
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }
}
