package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.R;
import xsna.hfr;
import xsna.ikv0;
import xsna.kjw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class my10 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializer.StreamParcelableAdapter c;
    public final /* synthetic */ Object d;

    public /* synthetic */ my10(int i, Serializer.StreamParcelableAdapter streamParcelableAdapter, Object obj) {
        this.b = i;
        this.c = streamParcelableAdapter;
        this.d = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                StoryCameraParams storyCameraParams = (StoryCameraParams) this.c;
                am9 am9Var = new am9();
                am9Var.a.a = cqm0.m(storyCameraParams.c);
                WebStoryBox webStoryBox = storyCameraParams.u;
                am9Var.b = (webStoryBox == null || !webStoryBox.Db()) ? null : storyCameraParams.Y;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                Iterable iterable = (Iterable) this.d;
                hfr.a aVar = new hfr.a(rli0.t(new i5g(iterable), new b40(24)));
                boolean z = false;
                while (aVar.hasNext()) {
                    Uri uri = ((yaa0) aVar.next()).a;
                    if (uri != null) {
                        kjw.a g = kjw.g(context, uri, true);
                        am9Var.c(StoryPublishEvent.ADD_FROM_GALLERY, new ly10(g.a, g.b));
                    }
                    z = true;
                }
                hfr.a aVar2 = new hfr.a(rli0.t(new i5g(iterable), new com.vk.movika.sdk.base.observable.e0(26)));
                while (aVar2.hasNext()) {
                    mat0 mat0Var = (mat0) aVar2.next();
                    am9Var.c(StoryPublishEvent.ADD_FROM_GALLERY, new ly10(mat0Var.c(), mat0Var.b()));
                    z = true;
                }
                if (!z) {
                    am9Var.c(StoryPublishEvent.ADD_FROM_GALLERY, null);
                    break;
                }
                break;
            default:
                Post post = (Post) this.c;
                Context context2 = (Context) this.d;
                post.l.Ab(562949953421312L, true);
                ce60.b.getClass();
                p870.f().e(154, post);
                ikv0.a aVar3 = new ikv0.a(context2);
                aVar3.t = ikv0.c.f.a;
                aVar3.u = new ikv0.d(context2.getString(R.string.wall_added_to_main), (String) null, (ikv0.d.a) null, 6);
                aVar3.n();
                break;
        }
    }
}
