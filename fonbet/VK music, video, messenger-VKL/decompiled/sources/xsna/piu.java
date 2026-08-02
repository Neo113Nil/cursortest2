package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GroupCallTipView.kt */
/* loaded from: classes7.dex */
public final class piu extends FrameLayout implements tmg0 {
    public final ihu b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;
    public final int g;
    public final int h;
    public boolean i;
    public final List<View> j;

    public piu(Context context) {
        super(context, null, 0);
        com.vk.voip.ui.c.b.getClass();
        this.b = com.vk.voip.ui.c.l0;
        this.c = new bpn0(new krh(this, 21));
        this.d = new bpn0(new ldl(this, 18));
        this.e = new bpn0(new xrj(this, 11));
        this.f = new bpn0(new rkt(this, 1));
        this.g = cn70.b(12);
        this.h = cn70.b(36);
        LayoutInflater.from(context).inflate(R.layout.voip_group_call_grid_tip, this);
        setBackgroundResource(R.drawable.bg_group_call_tip);
        bwt0.i0(getCloseButton(), new cvh(this, 13));
        bwt0.i0(getInviteOthersButton(), new bhh(this, 22));
        bwt0.i0(getOpenAccessMenuButton(), new qqe(this, 23));
        bwt0.d(this, cn70.c(8), (r4 & 2) != 0, (r4 & 4) != 0);
        this.j = this.i ? EmptyList.b : e43.l(getTextsContainer(), getCloseButton());
    }

    private final View getCloseButton() {
        return (View) this.d.getValue();
    }

    private final View getInviteOthersButton() {
        return (View) this.e.getValue();
    }

    private final TextView getOpenAccessMenuButton() {
        return (TextView) this.f.getValue();
    }

    private final View getTextsContainer() {
        return (View) this.c.getValue();
    }

    private final void set0or180RotationPadding(View view) {
        int i = this.h;
        int i2 = this.g;
        view.setPadding(i, i2, i, i2);
    }

    private final void set90or270RotationPadding(View view) {
        int i = this.g;
        view.setPadding(i, i, i, i);
    }

    private final void set9Oor270LayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int width = getTextsContainer().getWidth();
        int height = getHeight();
        if (width > height) {
            width = height;
        }
        layoutParams.width = width;
        layoutParams.height = -2;
        f4m.m(17, view);
        view.setLayoutParams(layoutParams);
    }

    private final void setOor180LayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        f4m.m(17, view);
        view.setLayoutParams(layoutParams);
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return this.i ? e43.l(getTextsContainer(), getCloseButton()) : EmptyList.b;
    }

    @Override // xsna.tmg0
    public List<View> getViewsToRotate() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setVideoOn(boolean z) {
        this.i = z;
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        if (f == 90.0f) {
            View textsContainer = getTextsContainer();
            set9Oor270LayoutParams(textsContainer);
            set90or270RotationPadding(textsContainer);
            getOpenAccessMenuButton().setText(R.string.voip_fast_call_create_tip_setup_access_short_text);
            f4m.m(8388693, getCloseButton());
            return;
        }
        if (f == 270.0f) {
            View textsContainer2 = getTextsContainer();
            set9Oor270LayoutParams(textsContainer2);
            set90or270RotationPadding(textsContainer2);
            getOpenAccessMenuButton().setText(R.string.voip_fast_call_create_tip_setup_access_short_text);
            f4m.m(8388659, getCloseButton());
            return;
        }
        if (f == 180.0f) {
            View textsContainer3 = getTextsContainer();
            setOor180LayoutParams(textsContainer3);
            set0or180RotationPadding(textsContainer3);
            getOpenAccessMenuButton().setText(R.string.voip_fast_call_create_tip_setup_access_text);
            f4m.m(8388691, getCloseButton());
            return;
        }
        View textsContainer4 = getTextsContainer();
        setOor180LayoutParams(textsContainer4);
        set0or180RotationPadding(textsContainer4);
        getOpenAccessMenuButton().setText(R.string.voip_fast_call_create_tip_setup_access_text);
        f4m.m(8388661, getCloseButton());
    }
}
