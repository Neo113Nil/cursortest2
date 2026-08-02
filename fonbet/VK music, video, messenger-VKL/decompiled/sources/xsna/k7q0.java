package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.soloader.MinElf;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.clips.design.view.timer.TimerView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.view.recommended.RecommendedView;
import com.vkontakte.android.R;
import java.util.Arrays;
import xsna.h7u0;
import xsna.o0r0;

/* compiled from: UpcomingViewOld.kt */
/* loaded from: classes2.dex */
public final class k7q0 extends ConstraintLayout implements a7q0, b7q0 {
    public final TimerView A;
    public final VkSimpleButton B;
    public final VkScreenSpinner C;
    public final VkSimpleButton D;
    public final VkScreenSpinner E;
    public final RecommendedView F;
    public z6q0 G;
    public final VKAvatarView t;
    public final TextView u;
    public final TextView v;
    public final View w;
    public final TimerView x;
    public final VkSimpleButton y;
    public final VkSimpleButton z;

    public k7q0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.live_upcoming, (ViewGroup) this, true);
        VKAvatarView vKAvatarView = (VKAvatarView) findViewById(R.id.author_image);
        this.t = vKAvatarView;
        this.u = (TextView) findViewById(R.id.live_title);
        this.v = (TextView) findViewById(R.id.live_description);
        this.w = findViewById(R.id.recommended_group);
        TimerView timerView = (TimerView) findViewById(R.id.live_timer);
        this.x = timerView;
        VkSimpleButton vkSimpleButton = (VkSimpleButton) findViewById(R.id.subscribe_button);
        this.y = vkSimpleButton;
        VkScreenSpinner vkScreenSpinner = (VkScreenSpinner) findViewById(R.id.subscribe_loader);
        VkSimpleButton vkSimpleButton2 = (VkSimpleButton) findViewById(R.id.notification_button);
        this.z = vkSimpleButton2;
        VkScreenSpinner vkScreenSpinner2 = (VkScreenSpinner) findViewById(R.id.notification_loader);
        RecommendedView recommendedView = (RecommendedView) findViewById(R.id.recommended);
        jjc.g(vKAvatarView, new whg0(this, 15));
        jjc.g(vkSimpleButton, new xim0(this, 4));
        jjc.g(vkSimpleButton2, new yka0(this, 17));
        setBackgroundColor(context.getColor(R.color.live_pending_fullscreen_background));
        this.A = timerView;
        this.B = vkSimpleButton2;
        this.C = vkScreenSpinner2;
        this.D = vkSimpleButton;
        this.E = vkScreenSpinner;
        this.F = recommendedView;
    }

    @Override // xsna.a7q0
    public final void C0(UserId userId) {
        xwk.e().m(getContext(), userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }

    @Override // xsna.a7q0
    public final boolean L3() {
        return true;
    }

    public final void P4(int i) {
        z6q0 z6q0Var;
        if (i == R.id.subscribe_button) {
            z6q0 z6q0Var2 = this.G;
            if (z6q0Var2 != null) {
                z6q0Var2.N0(getContext());
                return;
            }
            return;
        }
        if (i == R.id.notification_button) {
            z6q0 z6q0Var3 = this.G;
            if (z6q0Var3 != null) {
                z6q0Var3.I1();
                return;
            }
            return;
        }
        if (i != R.id.author_image || (z6q0Var = this.G) == null) {
            return;
        }
        z6q0Var.O();
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
        this.v.setText(R.string.video_err_live_not_ready);
    }

    @Override // xsna.a7q0
    public final void T3(int i, int i2) {
        jno0.a(this.z, i, i2);
    }

    @Override // xsna.a7q0
    public final void Z(boolean z) {
        this.x.setVisibility(z ? 0 : 8);
    }

    @Override // xsna.a7q0
    public final void b2(String str, String str2, boolean z) {
        ucp ucpVar = ucp.a;
        this.u.setText(ucp.i(str));
        VKAvatarView.Z0(this.t, str2, null, z ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, null, 10);
    }

    @Override // xsna.a7q0
    public final void e4(int i, int i2) {
        jno0.a(this.y, i, i2);
    }

    @Override // xsna.b7q0
    public View getNotificationButton() {
        return this.B;
    }

    @Override // xsna.b7q0
    public View getNotificationLoader() {
        return this.C;
    }

    @Override // xsna.b7q0
    public View getSubscribeButton() {
        return this.D;
    }

    @Override // xsna.b7q0
    public View getSubscribeLoader() {
        return this.E;
    }

    @Override // xsna.b7q0
    public TimerView getTimerView() {
        return this.A;
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
        c.c0(R.string.yes, new ka6(this, 1));
        c.W(R.string.cancel, null);
        c.m();
    }

    @Override // xsna.a7q0
    public final void s4() {
        this.w.setVisibility(0);
    }

    @Override // xsna.a7q0
    public void setTopBlockTopMargin(int i) {
        f4m.t(i, this.t);
    }

    @Override // xsna.a7q0
    public final void t0() {
        f4m.j(this.w);
    }

    @Override // xsna.rr6
    public z6q0 getPresenter() {
        return this.G;
    }

    @Override // xsna.a7q0
    public RecommendedView getRecommended() {
        return this.F;
    }

    @Override // xsna.rr6
    public void setPresenter(z6q0 z6q0Var) {
        this.G = z6q0Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
