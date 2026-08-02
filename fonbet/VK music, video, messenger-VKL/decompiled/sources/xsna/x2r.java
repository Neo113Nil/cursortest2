package xsna;

import android.view.View;
import com.vk.core.view.components.text.VkText;
import com.vk.ecomm.design.view.feed.FeedProductPinView;
import com.vkontakte.android.R;

/* compiled from: View.kt */
/* loaded from: classes18.dex */
public final class x2r implements View.OnLayoutChangeListener {
    public final /* synthetic */ FeedProductPinView b;
    public final /* synthetic */ CharSequence c;

    public x2r(FeedProductPinView feedProductPinView, CharSequence charSequence) {
        this.b = feedProductPinView;
        this.c = charSequence;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        FeedProductPinView feedProductPinView = this.b;
        VkText vkText = feedProductPinView.b;
        String valueOf = String.valueOf(this.c);
        int i9 = v2r.a;
        FeedProductPinView.a(feedProductPinView, vkText, valueOf, v2r.f, krv0.m(R.attr.vk_ui_text_contrast, feedProductPinView.getContext()));
    }
}
