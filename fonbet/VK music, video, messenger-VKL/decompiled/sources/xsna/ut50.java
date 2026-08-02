package xsna;

import com.vk.lists.DefaultErrorView;
import com.vkontakte.android.R;

/* compiled from: NameHistoryErrorView.kt */
/* loaded from: classes5.dex */
public final class ut50 extends DefaultErrorView {
    @Override // com.vk.lists.DefaultErrorView, xsna.ee
    public final void b() {
        getErrorText().setText(R.string.community_name_history_loading_error);
        getErrorButton().setText(R.string.community_name_history_try_again);
    }
}
