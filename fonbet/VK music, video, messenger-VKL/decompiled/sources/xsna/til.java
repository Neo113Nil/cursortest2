package xsna;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vkontakte.android.R;

/* compiled from: DefaultMiniWidgetsHolder.kt */
/* loaded from: classes6.dex */
public final class til extends ViewOutlineProvider {
    public final /* synthetic */ Context a;

    public til(Context context) {
        this.a = context;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), iah0.a(20.0f));
        view.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, this.a));
    }
}
