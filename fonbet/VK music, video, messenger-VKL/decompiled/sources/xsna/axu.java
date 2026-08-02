package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: HeaderHolder.java */
/* loaded from: classes7.dex */
public class axu extends vif0<CharSequence> {
    public axu(ViewGroup viewGroup) {
        super(new TextView(viewGroup.getContext()));
        TextView textView = (TextView) this.itemView;
        textView.setTextColor(-7697782);
        int dimensionPixelSize = b6().getDimensionPixelSize(R.dimen.notifications_padding);
        textView.setPadding(dimensionPixelSize, b6().getDimensionPixelSize(R.dimen.notification_header_top_padding), dimensionPixelSize, b6().getDimensionPixelSize(R.dimen.notification_header_bottom_padding));
        textView.setText(R.string.viewed_replies);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // xsna.vif0
    public final void i6(CharSequence charSequence) {
        ((TextView) this.itemView).setText(charSequence);
    }
}
