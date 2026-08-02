package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.dto.attaches.AttachWidget;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;
import org.json.JSONObject;

/* compiled from: MsgPartWidgetHolder.kt */
/* loaded from: classes2.dex */
public final class zu30 extends hr30<AttachWidget, av30> {
    public Context d;
    public FrameLayout e;
    public av30 f;
    public pk30 g;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        View view;
        nmx0 nmx0Var;
        av30 av30Var = this.f;
        if (av30Var == null) {
            return;
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        try {
            av30 av30Var2 = this.f;
            if (av30Var2 == null || (nmx0Var = av30Var2.g) == null) {
                view = null;
            } else {
                FrameLayout frameLayout2 = this.e;
                if (frameLayout2 == null) {
                    frameLayout2 = null;
                }
                Context context = frameLayout2.getContext();
                JSONObject jSONObject = av30Var.h;
                Context context2 = this.d;
                if (context2 == null) {
                    context2 = null;
                }
                view = nmx0Var.a(context, jSONObject, av30Var.Y(context2) - iah0.a(16), bubbleColors.b, bubbleColors.g, bubbleColors.i, (dhr0.M() ? av30Var.d : av30Var.e).a, av30Var.f, this.g);
            }
            FrameLayout frameLayout3 = this.e;
            if (frameLayout3 == null) {
                frameLayout3 = null;
            }
            frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout4 = this.e;
            if (frameLayout4 == null) {
                frameLayout4 = null;
            }
            frameLayout4.addView(view);
        } catch (Exception e) {
            FrameLayout frameLayout5 = this.e;
            if (frameLayout5 == null) {
                frameLayout5 = null;
            }
            frameLayout5.removeAllViews();
            FrameLayout frameLayout6 = this.e;
            if (frameLayout6 == null) {
                frameLayout6 = null;
            }
            frameLayout6.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            FrameLayout frameLayout7 = this.e;
            bwt0.I(R.layout.vkim_msg_part_unsupported, frameLayout7 != null ? frameLayout7 : null, true);
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }

    @Override // xsna.hr30
    public final void p(av30 av30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        this.f = av30Var;
        this.g = pk30Var;
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.e = frameLayout;
        return frameLayout;
    }

    @Override // xsna.hr30
    public final void r() {
        this.g = null;
        this.f = null;
    }
}
