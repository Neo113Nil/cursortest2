package xsna;

import android.content.Context;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import xsna.j8h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class l8h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l8h(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                j8h j8hVar = (j8h) this.c;
                j8h.b bVar = (j8h.b) this.d;
                r8h r8hVar = (r8h) this.e;
                c8h c8hVar = (c8h) this.f;
                if (j8hVar.n.b.p) {
                    bVar.w.o();
                } else {
                    bVar.q6(j8hVar, bVar.x, r8hVar, c8hVar);
                }
                break;
            default:
                hu60 hu60Var = (hu60) this.c;
                Context context = (Context) this.d;
                NewsEntry newsEntry = (NewsEntry) this.e;
                NewsfeedExternalAction.Navigation.u uVar = (NewsfeedExternalAction.Navigation.u) this.f;
                p960.d((p960) hu60Var.g.getValue(), context, newsEntry, uVar.d, uVar.e, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME, null, 96);
                break;
        }
        return s3q0.a;
    }
}
