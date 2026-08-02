package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.soloader.MinElf;
import com.vk.clips.design.view.timer.TimerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.view.recommended.RecommendedView;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.h7u0;
import xsna.o0r0;

/* compiled from: UpcomingViewNew.kt */
/* loaded from: classes2.dex */
public final class j7q0 extends ConstraintLayout implements a7q0, b7q0 {
    public final TextView t;
    public final TimerView u;
    public final VkButton v;
    public final TimerView w;
    public z6q0 x;

    public j7q0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.view_live_upcoming, (ViewGroup) this, true);
        this.t = (TextView) findViewById(R.id.live_description);
        TimerView timerView = (TimerView) findViewById(R.id.live_timer);
        this.u = timerView;
        VkButton vkButton = (VkButton) findViewById(R.id.notification_button);
        this.v = vkButton;
        jjc.g(vkButton, new xka0(this, 19));
        this.w = timerView;
    }

    @Override // xsna.a7q0
    public final void C0(UserId userId) {
        xwk.e().m(getContext(), userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }

    @Override // xsna.a7q0
    public final boolean L3() {
        return true;
    }

    @Override // xsna.i7q0
    public final void R(boolean z) {
        View subscribeButton = getSubscribeButton();
        if (subscribeButton != null) {
            subscribeButton.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.a7q0
    public final void S3() {
        this.t.setText(R.string.video_err_live_not_ready);
    }

    @Override // xsna.a7q0
    public final void T3(int i, int i2) {
        VkButton vkButton = this.v;
        vkButton.setText(i);
        vkButton.a5(true, Integer.valueOf(i2));
    }

    @Override // xsna.a7q0
    public final void Z(boolean z) {
        this.t.setText(R.string.video_live_before_run_title);
        this.u.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.b7q0
    public View getNotificationButton() {
        return null;
    }

    @Override // xsna.b7q0
    public View getNotificationLoader() {
        return null;
    }

    @Override // xsna.b7q0
    public View getSubscribeButton() {
        return null;
    }

    @Override // xsna.b7q0
    public View getSubscribeLoader() {
        return null;
    }

    @Override // xsna.b7q0
    public TimerView getTimerView() {
        return this.w;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.a7q0
    public final void i1(int i, Object... objArr) {
        cvk.v(i, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // xsna.a7q0
    public final void j0() {
        b25 a = o25.a();
        getViewContext();
        a.getClass();
    }

    @Override // xsna.i7q0
    public final void o1(int i, int i2, int i3, int i4) {
        getTimerView().P4(i4, i3, i2, i);
    }

    @Override // xsna.a7q0
    public final void q1(String str) {
        String string = getContext().getString(R.string.video_unsibscribe_confirm_message, str);
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(getContext());
        c.g0(R.string.profile_unsubscribe);
        c.a.f = string;
        c.c0(R.string.yes, new z1z(this, 2));
        c.W(R.string.cancel, null);
        c.m();
    }

    @Override // xsna.rr6
    public z6q0 getPresenter() {
        return this.x;
    }

    @Override // xsna.a7q0
    public RecommendedView getRecommended() {
        return null;
    }

    @Override // xsna.rr6
    public void setPresenter(z6q0 z6q0Var) {
        this.x = z6q0Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.a7q0
    public final void s4() {
    }

    @Override // xsna.a7q0
    public final void t0() {
    }

    @Override // xsna.a7q0
    public void setTopBlockTopMargin(int i) {
    }

    @Override // xsna.a7q0
    public final void e4(int i, int i2) {
    }

    @Override // xsna.a7q0
    public final void b2(String str, String str2, boolean z) {
    }
}
