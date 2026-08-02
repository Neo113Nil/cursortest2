package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.g05;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class c05 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c05(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                g05 g05Var = (g05) this.c;
                String str = (String) this.d;
                HashMap<String, g05.a> hashMap = g05Var.b;
                g05.a aVar = hashMap.get(str);
                g05.d dVar = aVar instanceof g05.d ? (g05.d) aVar : null;
                if (dVar != null) {
                    hashMap.put(str, new g05.b(dVar.b));
                    break;
                }
                break;
            default:
                NewsEntry newsEntry = (NewsEntry) this.c;
                kr60 kr60Var = (kr60) this.d;
                if (newsEntry instanceof Post) {
                    ((Post) newsEntry).l.Ab(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, false);
                }
                kr60Var.c(new yo60.h(new NewsfeedExternalAction.d.c(newsEntry)));
                kr60Var.c(new yo60.g.c(R.string.unsubscribed_from_posts));
                break;
        }
    }
}
