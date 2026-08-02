package xsna;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import xsna.hr30;

/* compiled from: MsgPartViewsAndTimeHolder.kt */
/* loaded from: classes2.dex */
public final class iu30 extends hr30<Attach, ju30> {
    public View d;
    public ImageView e;
    public TextView f;
    public TimeAndStatusView g;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.h;
        TimeAndStatusView timeAndStatusView = this.g;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(i);
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        ImageView imageView = this.e;
        (imageView != null ? imageView : null).setImageTintList(ColorStateList.valueOf(i));
    }

    @Override // xsna.hr30
    public final void p(ju30 ju30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ju30 ju30Var2 = ju30Var;
        jr30 jr30Var = ju30Var2.b;
        String str = ju30Var2.c;
        boolean f = myc0.f(str);
        ImageView imageView = this.e;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setVisibility(f ? 0 : 8);
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(f ? 0 : 8);
        TextView textView2 = this.f;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(str);
        TimeAndStatusView timeAndStatusView = this.g;
        TimeAndStatusView timeAndStatusView2 = timeAndStatusView != null ? timeAndStatusView : null;
        timeAndStatusView2.setGradientBubble(jr30Var.g);
        hr30.a.b(timeAndStatusView2, jr30Var, false);
        if (myc0.f(str) && jr30Var.q) {
            View view = this.d;
            if (view != null) {
                f4m.v(cn70.b(8), view);
                return;
            }
            return;
        }
        View view2 = this.d;
        if (view2 != null) {
            f4m.v(cn70.b(2), view2);
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_part_views_and_time, viewGroup, false);
        this.e = (ImageView) inflate.findViewById(R.id.vkim_views_count_icon);
        this.f = (TextView) inflate.findViewById(R.id.vkim_views_count);
        TimeAndStatusView timeAndStatusView = (TimeAndStatusView) inflate.findViewById(R.id.vkim_time_and_status);
        timeAndStatusView.setTimeTextAppearance(R.style.VkUiTypography_Caption3);
        timeAndStatusView.setTimeTextColor(R.attr.vk_ui_text_secondary);
        this.g = timeAndStatusView;
        this.d = inflate;
        return inflate;
    }
}
