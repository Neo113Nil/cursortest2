package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;

/* compiled from: PollStarItemView.kt */
/* loaded from: classes6.dex */
public final class srb0 extends AppCompatTextView {
    public final Drawable b;
    public final Drawable c;
    public int d;

    public srb0(Context context) {
        super(context, null, 0);
        this.b = enj.c(R.drawable.vk_icon_favorite_36, krv0.m(R.attr.vk_ui_icon_warning, context), context);
        this.c = enj.c(R.drawable.vk_icon_favorite_outline_36, krv0.m(R.attr.vk_ui_text_tertiary, context), context);
        setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
        setTextAlignment(4);
        setTextAppearance(R.style.VkUiTypography_Caption1);
        float f = 4;
        f4m.l(iah0.a(f), iah0.a(f), this);
        btb0.a(this);
        setActive(false);
    }

    public int getItemId() {
        return this.d;
    }

    public void setActive(boolean z) {
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, z ? this.b : this.c, (Drawable) null, (Drawable) null);
    }

    public void setItemId(int i) {
        this.d = i;
    }
}
