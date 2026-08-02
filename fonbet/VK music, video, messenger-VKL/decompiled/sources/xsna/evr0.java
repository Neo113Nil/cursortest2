package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.search.RoundedSearchView;
import com.vkontakte.android.R;

/* compiled from: VhSearch.kt */
/* loaded from: classes2.dex */
public final class evr0 extends RecyclerView.e0 {
    public static final /* synthetic */ int m = 0;
    public final RoundedSearchView l;

    /* compiled from: VhSearch.kt */
    public interface a {
        void a();
    }

    public evr0(View view) {
        super(view);
        RoundedSearchView roundedSearchView = (RoundedSearchView) view.findViewById(R.id.im_dialog_search_view);
        roundedSearchView.setVoiceIsAvailable(false);
        this.l = roundedSearchView;
    }
}
