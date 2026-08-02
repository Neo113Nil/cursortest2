package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: FixedDividerView.kt */
/* loaded from: classes17.dex */
public final class tmr extends FrameLayout implements too0 {
    public final View b;

    public tmr(Context context) {
        super(context, null, 0);
        View view = new View(context);
        this.b = view;
        addView(view);
        f4m.z(hbh0.b(1, context), hbh0.b(24, context), view);
        getContext();
        view.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_primary, getContext()));
    }

    @Override // xsna.too0
    public final void Ng() {
        getContext();
        this.b.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_primary, getContext()));
    }
}
