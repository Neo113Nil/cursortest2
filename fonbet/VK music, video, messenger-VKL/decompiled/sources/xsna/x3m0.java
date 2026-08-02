package xsna;

import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.search.RoundedSearchView;
import com.vkontakte.android.R;

/* compiled from: StoryGeoSearchHolder.kt */
/* loaded from: classes6.dex */
public final class x3m0 extends hf6<y3m0> {
    public final a m;
    public final RoundedSearchView n;
    public io.reactivex.rxjava3.disposables.c o;

    /* compiled from: StoryGeoSearchHolder.kt */
    public interface a {
        void b();

        void d(String str);

        void h(String str);
    }

    public x3m0(View view, t3m0 t3m0Var) {
        super(view);
        this.m = t3m0Var;
        RoundedSearchView roundedSearchView = (RoundedSearchView) view.findViewById(R.id.search_view);
        this.n = roundedSearchView;
        roundedSearchView.setVoiceIsAvailable(true);
        roundedSearchView.setEditMode(new acw0(new rzl0(this, 1)));
        ImageView imageView = roundedSearchView.b;
        if (imageView != null) {
            d3m.b(imageView, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        }
        if (imageView != null) {
            imageView.setImageResource(R.drawable.vk_icon_search_outline_16);
        }
        roundedSearchView.setOnActionSearchListener(new b8e0(this, 9));
        roundedSearchView.setOnActionSearchQueryClick(new uzb(this, 10));
        roundedSearchView.setHintTextColor(dhr0.Y(R.attr.vk_ui_text_secondary, view.getContext()));
        view.addOnAttachStateChangeListener(new w3m0(this));
    }

    @Override // xsna.hf6
    public final /* bridge */ /* synthetic */ void W5(y3m0 y3m0Var) {
    }
}
