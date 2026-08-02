package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: DiscoverStoryView.kt */
/* loaded from: classes6.dex */
public final class ban extends x6s {
    public final /* synthetic */ LayoutInflater b;

    public ban(LayoutInflater layoutInflater) {
        this.b = layoutInflater;
    }

    @Override // xsna.x6s
    public final View a(Context context, ViewGroup viewGroup) {
        return this.b.inflate(R.layout.stories_discover_footer_loading, viewGroup, false);
    }
}
