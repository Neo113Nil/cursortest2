package xsna;

import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class z2t implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z2t(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                context.getContentResolver().unregisterContentObserver((b3t) this.d);
                break;
            case 1:
                NewsEntry newsEntry = (NewsEntry) this.c;
                kr60 kr60Var = (kr60) this.d;
                if (newsEntry instanceof Post) {
                    ((Post) newsEntry).l.Ab(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, true);
                }
                kr60Var.c(new yo60.h(new NewsfeedExternalAction.d.c(newsEntry)));
                kr60Var.c(new yo60.g.c(R.string.subscribed_to_posts));
                break;
            case 2:
                ((ParticipantStatesManager) this.c).removeAssistanceRequestListener((al90) this.d);
                break;
            default:
                Post post = (Post) this.c;
                com.vk.newsfeed.impl.presenters.b bVar = (com.vk.newsfeed.impl.presenters.b) this.d;
                UserId userId = post.m;
                Intent intent = new Intent("com.vkontakte.android.RELOAD_PROFILE");
                intent.putExtra("id", userId);
                intent.putExtra("post_pinned", true);
                hf8.a(intent);
                bVar.N3();
                bVar.i0().invalidateOptionsMenu();
                ce60.b.getClass();
                p870.f().e(141, post);
                break;
        }
    }
}
