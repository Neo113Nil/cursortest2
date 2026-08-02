package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: CheckedTextView.kt */
/* loaded from: classes6.dex */
public final class j2c extends AppCompatTextView {
    public j2c(Context context) {
        super(context, null, 0);
        setSingleLine();
        setMaxLines(1);
        setLines(1);
        TypedValue typedValue = krv0.a;
        krv0.q(this, R.attr.vk_ui_text_primary);
        setBackgroundResource(R.drawable.vk_bottom_divider_bg);
        float f = 16;
        setPadding(iah0.a(f), 0, iah0.a(f), iah0.a(1));
        setTextSize(1, 16.0f);
        setCompoundDrawablePadding(iah0.a(16.0f));
        setGravity(16);
        setLayoutParams(new RecyclerView.p(-1, iah0.a(48)));
    }

    public final void setChecked(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, krv0.f(R.drawable.vk_icon_done_24, R.attr.vk_ui_text_accent, getContext()), (Drawable) null);
        }
    }
}
