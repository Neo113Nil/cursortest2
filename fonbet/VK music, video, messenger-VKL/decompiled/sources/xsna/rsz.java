package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.photo.editor.features.mlenhance.TextSwitcherView;
import com.vk.photo.editor.views.TinyProgressbarView;

/* compiled from: LoaderView.kt */
/* loaded from: classes4.dex */
public final class rsz extends FrameLayout {
    public FrameLayout b;
    public View c;
    public TinyProgressbarView d;
    public TextSwitcherView e;
    public wae0 f;

    public final void setCustomLoadingIndicator(View view) {
        FrameLayout frameLayout = this.b;
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }
}
