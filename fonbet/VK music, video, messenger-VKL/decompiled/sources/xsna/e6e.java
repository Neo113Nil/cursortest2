package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vkontakte.android.R;

/* compiled from: ClipsFeedDefaultClickListener.kt */
/* loaded from: classes17.dex */
public final class e6e implements View.OnClickListener {
    public final twc<? extends FeedItem.n> b;

    public e6e(twc<? extends FeedItem.n> twcVar) {
        this.b = twcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        FeedItem.n item = this.b.getItem();
        if (item != null && R.id.retry == id) {
            item.j().I();
            item.j().play();
        }
    }
}
