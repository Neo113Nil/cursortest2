package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;

/* compiled from: NotificationSwipeButton.kt */
/* loaded from: classes4.dex */
public final class ai70 extends AppCompatTextView {
    public final ColorDrawable b;

    /* compiled from: NotificationSwipeButton.kt */
    public static final class a extends de {
        public final FragmentActivity b;

        public a(FragmentActivity fragmentActivity) {
            this.b = fragmentActivity;
        }
    }

    public ai70(FragmentActivity fragmentActivity) {
        super(fragmentActivity, null, 0);
        ColorDrawable colorDrawable = new ColorDrawable();
        this.b = colorDrawable;
        setGravity(17);
        setPadding(iah0.a(16.0f), 0, iah0.a(16.0f), 0);
        setTextSize(16.0f);
        setIncludeFontPadding(false);
        setTextColor(-1);
        setClickable(true);
        setBackground(new RippleDrawable(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_separator_primary_alpha)), colorDrawable, null));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.b.setColor(i);
    }
}
