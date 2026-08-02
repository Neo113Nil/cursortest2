package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vkontakte.android.R;

/* compiled from: InputPlaceholderView.kt */
/* loaded from: classes2.dex */
public final class q2x extends FluidHorizontalLayout {
    public final TextView g;
    public final TextView h;

    public q2x(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.vkim_write_bar_placeholder, (ViewGroup) this, true);
        this.g = (TextView) findViewById(R.id.text);
        this.h = (TextView) findViewById(R.id.button);
        setPadding(cn70.b(16), cn70.b(12), cn70.b(16), cn70.b(12));
    }

    public final void setButtonText(CharSequence charSequence) {
        TextView textView = this.h;
        textView.setText(charSequence);
        bwt0.p0(textView, !(charSequence == null || charSequence.length() == 0));
    }

    public final void setOnButtonClickListener(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = this.g;
        textView.setText(charSequence);
        bwt0.p0(textView, !(charSequence == null || charSequence.length() == 0));
    }
}
