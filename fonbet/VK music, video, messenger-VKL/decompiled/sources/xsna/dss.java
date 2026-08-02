package xsna;

import android.content.Context;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vkontakte.android.R;

/* compiled from: FriendsRecommendationsRouterImpl.kt */
/* loaded from: classes16.dex */
public final class dss implements css {
    @Override // xsna.css
    public final void a(Context context, boolean z) {
        FriendsRecommendationsFragment.a aVar = new FriendsRecommendationsFragment.a();
        aVar.j.putBoolean("show_rec_only", z);
        aVar.k(context);
    }

    @Override // xsna.css
    public final void b(Context context, String str) {
        FriendsRecommendationsFragment.a aVar = new FriendsRecommendationsFragment.a();
        aVar.j.putString("type", str);
        aVar.k(context);
    }

    @Override // xsna.css
    public final void c(Context context) {
        new FriendsRecommendationsFragment.a().k(context);
    }

    @Override // xsna.css
    public final void d(Context context) {
        new FriendsImportFragment.b(R.string.friends_recommendations_contacts).k(context);
    }
}
