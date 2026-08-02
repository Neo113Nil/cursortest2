package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.clips.design.view.timer.TimerView;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: InlineUpcomingView.kt */
/* loaded from: classes16.dex */
public final class t0x extends FrameLayout implements a7q0, b7q0 {
    public final TimerView b;
    public final TextView c;
    public final Object d;
    public z6q0 e;

    public t0x(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.item_time_before_translation, (ViewGroup) this, true);
        setBackgroundColor(context.getColor(R.color.live_pending_background));
        this.b = (TimerView) findViewById(R.id.live_timer);
        TextView textView = (TextView) findViewById(R.id.subscribe_button);
        jjc.g(textView, new wje(this, 28));
        this.c = textView;
        this.d = msy.a(LazyThreadSafetyMode.NONE, new v3n(this, 12));
    }

    @Override // xsna.a7q0
    public final boolean L3() {
        return false;
    }

    @Override // xsna.i7q0
    public final void R(boolean z) {
        View subscribeButton = getSubscribeButton();
        if (subscribeButton != null) {
            subscribeButton.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.a7q0
    public final void T3(int i, int i2) {
        TextView notificationButton = getNotificationButton();
        notificationButton.setText(i);
        notificationButton.setCompoundDrawablesWithIntrinsicBounds(m33.a(i2, notificationButton.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // xsna.a7q0
    public final void Z(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.b7q0
    public View getNotificationLoader() {
        return (View) this.d.getValue();
    }

    @Override // xsna.a7q0
    public wcf0 getRecommended() {
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
        return this.b;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
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

    @Override // xsna.b7q0
    public TextView getNotificationButton() {
        return this.c;
    }

    @Override // xsna.rr6
    public z6q0 getPresenter() {
        return this.e;
    }

    @Override // xsna.rr6
    public void setPresenter(z6q0 z6q0Var) {
        this.e = z6q0Var;
    }

    @Override // xsna.a7q0
    public final void S3() {
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
    public final void C0(UserId userId) {
    }

    @Override // xsna.a7q0
    public final void q1(String str) {
    }

    @Override // xsna.a7q0
    public void setTopBlockTopMargin(int i) {
    }

    @Override // xsna.a7q0
    public final void e4(int i, int i2) {
    }

    @Override // xsna.a7q0
    public final void i1(int i, Object... objArr) {
    }

    @Override // xsna.a7q0
    public final void b2(String str, String str2, boolean z) {
    }
}
