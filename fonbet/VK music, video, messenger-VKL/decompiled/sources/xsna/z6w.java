package xsna;

import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.video.profile.presentation.f;
import com.vk.video.profile.presentation.models.StateProfileSubscribe;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;
import xsna.v6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z6w implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z6w(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((d7w) this.c).l.a().a(((v6w.b.a) ((v6w.b) this.d)).b);
                break;
            case 1:
                xzb0 xzb0Var = (xzb0) this.c;
                ((p870) xzb0Var.l.getValue()).e(158, (NewsEntry) this.d);
                break;
            case 2:
                NewsFeedComponent newsFeedComponent = (NewsFeedComponent) this.c;
                newsFeedComponent.w().e(158, (NewsEntry) this.d);
                break;
            default:
                u490 u490Var = (u490) this.c;
                h9t0 h9t0Var = (h9t0) this.d;
                xd8 xd8Var = h9t0Var.e;
                Owner owner = u490Var.a;
                if (fkq0.d(owner.b)) {
                    xd8Var.invoke(f.h.i.b);
                } else {
                    h9t0Var.h.invoke(StateSubscribeNotification.UNSUBSCRIBE, owner.b, Boolean.FALSE);
                    xd8Var.invoke(f.h.C1962h.b);
                    h9t0Var.f.a(StateProfileSubscribe.UNSUBSCRIBE, owner.b);
                }
                h9t0Var.c.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT);
                break;
        }
    }
}
