package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vkontakte.android.R;

/* compiled from: ExchangeMiniWidgetHolder.kt */
/* loaded from: classes6.dex */
public final class f2q extends ViewOutlineProvider {
    public final /* synthetic */ g2q a;

    public f2q(g2q g2qVar) {
        this.a = g2qVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), iah0.a(20.0f));
        view.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, this.a.itemView.getContext()));
    }
}
