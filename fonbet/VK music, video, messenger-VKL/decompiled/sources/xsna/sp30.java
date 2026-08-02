package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MsgPartDonateButtonHolder.kt */
/* loaded from: classes2.dex */
public final class sp30 extends hr30<Attach, tp30> {
    public VkButton d;
    public TimeAndStatusView e;
    public pk30 f;
    public tp30 g;
    public final v5t h = new v5t(R.layout.vkim_msg_part_donate_button);
    public final Object i = msy.a(LazyThreadSafetyMode.NONE, new xyh(this, 29));

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TimeAndStatusView timeAndStatusView = this.e;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(tp30 tp30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        tp30 tp30Var2 = tp30Var;
        this.f = pk30Var;
        this.g = tp30Var2;
        VkButton vkButton = this.d;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setText(tp30Var2.c);
        jr30 jr30Var = tp30Var2.b;
        TimeAndStatusView timeAndStatusView = this.e;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        viewGroup.getContext();
        View c = this.h.c(layoutInflater, viewGroup);
        this.d = (VkButton) c.findViewById(R.id.donate_button);
        this.e = (TimeAndStatusView) c.findViewById(R.id.timeAndStatus);
        VkButton vkButton = this.d;
        if (vkButton == null) {
            vkButton = null;
        }
        jjc.f((View.OnClickListener) this.i.getValue(), vkButton);
        VkButton vkButton2 = this.d;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        vkButton2.a5(false, Integer.valueOf(R.drawable.vk_icon_donut_color_16));
        VkButton vkButton3 = this.d;
        (vkButton3 != null ? vkButton3 : null).setIconSize(Integer.valueOf(iah0.a(20)));
        return c;
    }

    @Override // xsna.hr30
    public final void r() {
        this.f = null;
        this.g = null;
    }
}
