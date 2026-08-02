package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: NewsfeedHintTabViewHolder.kt */
/* loaded from: classes4.dex */
public final class ml60 extends s770 {
    public final View c;
    public final TextView d;
    public final View e;

    public ml60(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.smart_tab_item, (ViewGroup) null, false);
        this.c = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.tab_name);
        this.d = textView;
        this.e = inflate.findViewById(R.id.tab_icon);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(4.0f), 4);
        inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(cn70.b(32), cn70.b(23)));
    }

    @Override // xsna.s770
    public final void g(int i, int i2, int i3) {
        boolean z;
        View view = this.c;
        xo9.A(this.d, i2 != 0 ? view.getContext().getString(i2) : "");
        View view2 = this.e;
        if (i3 != 0) {
            view2.setBackgroundResource(i3);
            z = true;
        } else {
            z = false;
        }
        bwt0.p0(view2, z);
        if (i == 0) {
            f4m.s(cn70.b(10), view);
        }
    }

    @Override // xsna.s770
    public final View l() {
        return this.c;
    }
}
