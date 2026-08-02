package xsna;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.TintTextView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartIconTwoRowView;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;

/* compiled from: MsgPartNestedStoryHolder.kt */
/* loaded from: classes2.dex */
public final class ns30 extends ho30 {
    public View f;
    public View g;
    public TextView h;
    public TintTextView i;
    public TimeAndStatusView j;
    public MsgPartIconTwoRowView k;
    public pk30 m;
    public yt30 n;
    public final int l = R.string.story;
    public final v5t o = new v5t(R.layout.vkim_msg_part_nested_story);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            ns30 ns30Var = ns30.this;
            pk30 pk30Var = ns30Var.m;
            yt30 yt30Var = ns30Var.n;
            Msg msg = yt30Var != null ? yt30Var.E : null;
            Attach attach = yt30Var != null ? yt30Var.G : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, yt30Var != null ? yt30Var.F : null);
            }
            return s3q0.a;
        }
    }

    @Override // xsna.hr30
    public final View n(int i) {
        yt30 yt30Var = this.n;
        if (yt30Var == null || yt30Var.m != i || yt30Var == null) {
            return null;
        }
        if (s(yt30Var)) {
            View view = this.g;
            if (view == null) {
                return null;
            }
            return view;
        }
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.k;
        if (msgPartIconTwoRowView == null) {
            return null;
        }
        return msgPartIconTwoRowView;
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.c;
        int i2 = bubbleColors.d;
        View view = this.g;
        if (view == null) {
            view = null;
        }
        if (bwt0.K(view)) {
            TextView textView = this.h;
            if (textView == null) {
                textView = null;
            }
            textView.setTextColor(i2);
            TintTextView tintTextView = this.i;
            if (tintTextView == null) {
                tintTextView = null;
            }
            tintTextView.setBackgroundTint(i);
            tintTextView.setTextColor(i);
        }
        MsgPartIconTwoRowView msgPartIconTwoRowView = this.k;
        if (msgPartIconTwoRowView == null) {
            msgPartIconTwoRowView = null;
        }
        if (bwt0.K(msgPartIconTwoRowView)) {
            MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.k;
            if (msgPartIconTwoRowView2 == null) {
                msgPartIconTwoRowView2 = null;
            }
            msgPartIconTwoRowView2.setTitleTextColor(i2);
            msgPartIconTwoRowView2.setSubtitleTextColor(bubbleColors.i);
            int i3 = bubbleColors.r;
            Integer N = rl3.N(bubbleColors.D);
            int intValue = N != null ? N.intValue() : bubbleColors.p;
            Resources resources = msgPartIconTwoRowView2.getResources();
            ThreadLocal<TypedValue> threadLocal = dbg0.a;
            LayerDrawable layerDrawable = (LayerDrawable) resources.getDrawable(R.drawable.ic_story, null);
            layerDrawable.findDrawableByLayerId(R.id.ic_story_bg).setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
            layerDrawable.findDrawableByLayerId(R.id.ic_story_photo).setTint(intValue);
            msgPartIconTwoRowView2.b.setImageDrawable(layerDrawable);
        }
        TimeAndStatusView timeAndStatusView = this.j;
        (timeAndStatusView != null ? timeAndStatusView : null).setTimeTextColor(bubbleColors.h);
    }

    @Override // xsna.hr30
    public final void p(yt30 yt30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        yt30 yt30Var2 = yt30Var;
        Attach attach = yt30Var2.G;
        this.e = attach instanceof AttachStory ? (AttachStory) attach : null;
        this.m = pk30Var;
        this.n = yt30Var2;
        jr30 jr30Var = yt30Var2.b;
        TimeAndStatusView timeAndStatusView = this.j;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, false);
        boolean s = s(yt30Var2);
        int i = this.l;
        if (s) {
            TextView textView = this.h;
            if (textView == null) {
                textView = null;
            }
            View view = this.f;
            if (view == null) {
                view = null;
            }
            at.d(view, i, textView);
        } else {
            MsgPartIconTwoRowView msgPartIconTwoRowView = this.k;
            if (msgPartIconTwoRowView == null) {
                msgPartIconTwoRowView = null;
            }
            View view2 = this.f;
            if (view2 == null) {
                view2 = null;
            }
            msgPartIconTwoRowView.setTitleText(view2.getContext().getString(i));
            MsgPartIconTwoRowView msgPartIconTwoRowView2 = this.k;
            if (msgPartIconTwoRowView2 == null) {
                msgPartIconTwoRowView2 = null;
            }
            View view3 = this.f;
            if (view3 == null) {
                view3 = null;
            }
            msgPartIconTwoRowView2.setSubtitleText(view3.getContext().getString(R.string.vkim_unavailable));
        }
        MsgPartIconTwoRowView msgPartIconTwoRowView3 = this.k;
        if (msgPartIconTwoRowView3 == null) {
            msgPartIconTwoRowView3 = null;
        }
        bwt0.p0(msgPartIconTwoRowView3, !s);
        View view4 = this.g;
        bwt0.p0(view4 != null ? view4 : null, s);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.o.c(layoutInflater, viewGroup);
        this.f = c;
        if (c == null) {
            c = null;
        }
        this.k = (MsgPartIconTwoRowView) c.findViewById(R.id.expired_story_view);
        View view = this.f;
        if (view == null) {
            view = null;
        }
        this.g = view.findViewById(R.id.available_story_group);
        View view2 = this.f;
        if (view2 == null) {
            view2 = null;
        }
        this.h = (TextView) view2.findViewById(R.id.available_story_title);
        View view3 = this.f;
        if (view3 == null) {
            view3 = null;
        }
        View view4 = this.f;
        if (view4 == null) {
            view4 = null;
        }
        this.j = (TimeAndStatusView) view4.findViewById(R.id.time_and_status);
        View view5 = this.f;
        if (view5 == null) {
            view5 = null;
        }
        TintTextView tintTextView = (TintTextView) view5.findViewById(R.id.available_story_btn);
        this.i = tintTextView;
        jjc.g(tintTextView, new a());
        View view6 = this.f;
        if (view6 == null) {
            view6 = null;
        }
        bwt0.k0(view6, new e810(this, 7));
        View view7 = this.f;
        if (view7 == null) {
            return null;
        }
        return view7;
    }

    @Override // xsna.hr30
    public final void r() {
        this.m = null;
        this.n = null;
    }
}
