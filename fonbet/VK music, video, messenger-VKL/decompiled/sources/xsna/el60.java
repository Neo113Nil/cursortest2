package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: NewsfeedHintFocusTabViewHolder.kt */
/* loaded from: classes4.dex */
public final class el60 extends s770 {
    public final View c;
    public final View d;
    public final TextView e;

    public el60(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.smart_tab_focus, (ViewGroup) null, false);
        this.c = inflate;
        this.d = inflate.findViewById(R.id.tab_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.tab_name);
        this.e = textView;
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(8.0f), 4);
        inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(cn70.b(54), cn70.b(54)));
    }

    @Override // xsna.s770
    public final void g(int i, int i2, int i3) {
        boolean z;
        xo9.A(this.e, i2 != 0 ? this.c.getContext().getString(i2) : "");
        View view = this.d;
        if (i3 != 0) {
            view.setBackgroundResource(i3);
            z = true;
        } else {
            z = false;
        }
        bwt0.p0(view, z);
    }

    @Override // xsna.s770
    public final View l() {
        return this.c;
    }
}
