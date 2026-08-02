package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.timer.TimerView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: BroadcastUpcomingView.kt */
/* loaded from: classes16.dex */
public final class ck8 extends ConstraintLayout implements ak8 {
    public final VKImageView t;
    public final TextView u;
    public final TimerView v;
    public zj8 w;

    public ck8(Context context) {
        super(context, null, R.attr.popupWindowStyle);
        LayoutInflater.from(context).inflate(R.layout.live_broadcast_upcoming, (ViewGroup) this, true);
        this.t = (VKImageView) findViewById(R.id.live_broadcast_upcoming_author_image);
        this.u = (TextView) findViewById(R.id.live_broadcast_upcoming_title);
        this.v = (TimerView) findViewById(R.id.live_broadcast_upcoming_timer);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        zj8 zj8Var = this.w;
        if (zj8Var != null) {
            zj8Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        zj8 zj8Var = this.w;
        if (zj8Var != null) {
            zj8Var.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        zj8 zj8Var = this.w;
        if (zj8Var != null) {
            zj8Var.resume();
        }
    }

    @Override // xsna.ak8
    public void setLiveAuthorImage(String str) {
        this.t.load(str);
    }

    @Override // xsna.ak8
    public void setLiveAuthorPlaceholderImage(int i) {
        baf0 b = dhr0.t.b(i, R.attr.vk_ui_icon_secondary);
        VKImageView vKImageView = this.t;
        njt hierarchy = vKImageView.getHierarchy();
        f5h0.f fVar = f5h0.f.a;
        hierarchy.s(b, fVar);
        njt hierarchy2 = vKImageView.getHierarchy();
        hierarchy2.p(b, 5);
        hierarchy2.l(5).t(fVar);
    }

    @Override // xsna.ak8
    public void setLiveName(String str) {
        this.u.setText(str);
    }

    @Override // xsna.ak8
    public final void u3(int i, int i2, int i3, int i4) {
        this.v.P4(i, i2, i3, i4);
    }

    @Override // xsna.rr6
    public zj8 getPresenter() {
        zj8 zj8Var = this.w;
        if (zj8Var != null) {
            return zj8Var;
        }
        throw new IllegalStateException("presenter must be initialised");
    }

    @Override // xsna.rr6
    public void setPresenter(zj8 zj8Var) {
        this.w = zj8Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
