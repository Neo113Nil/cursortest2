package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.List;
import xsna.ds60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class che implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ che(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((fhe) this.c).b = (List) this.d;
                break;
            default:
                NewsEntry newsEntry = (NewsEntry) this.c;
                rq60 rq60Var = (rq60) this.d;
                newsEntry.d = true;
                rq60Var.a(new ds60.b(new NewsfeedExternalAction.c.f0(newsEntry)));
                break;
        }
    }
}
