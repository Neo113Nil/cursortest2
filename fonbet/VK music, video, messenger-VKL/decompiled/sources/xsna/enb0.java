package xsna;

import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;

/* compiled from: PollChipItemView.kt */
/* loaded from: classes6.dex */
public final class enb0 extends AppCompatTextView {
    public int b;

    public int getItemId() {
        return this.b;
    }

    public void setActive(boolean z) {
        int f;
        int i;
        if (z) {
            f = e3m.f(R.attr.vk_ui_text_contrast_themed, getContext());
            i = R.drawable.poll_active_label;
        } else {
            f = e3m.f(R.attr.vk_ui_text_primary, getContext());
            i = R.drawable.poll_inactive_label;
        }
        setBackgroundResource(i);
        setTextColor(f);
    }

    public void setItemId(int i) {
        this.b = i;
    }
}
