package xsna;

import android.view.View;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;

/* compiled from: VideoClickActionCallbackAdapter.kt */
/* loaded from: classes3.dex */
public final class fbs0 implements View.OnClickListener {
    public final ebs0 b;

    public fbs0(ebs0 ebs0Var) {
        this.b = ebs0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean K1 = fxc0.B().J().K1();
        ebs0 ebs0Var = this.b;
        if (K1 && (epx.f(view.getTag(), "bottom_title") || epx.f(view.getTag(), "bottom_subtitle"))) {
            ebs0Var.bk(u0t0.a);
        }
        Object tag = view.getTag();
        if (epx.f(tag, Integer.valueOf(R.id.subscribe))) {
            ebs0Var.bk(uit0.a);
            return;
        }
        if (epx.f(tag, Integer.valueOf(R.id.profile))) {
            ebs0Var.bk(t6t0.a);
            return;
        }
        if (epx.f(tag, Integer.valueOf(R.id.more))) {
            ebs0Var.bk(new qws0(15, null, false));
            return;
        }
        if (epx.f(tag, "bottom_like") || epx.f(tag, "end_like")) {
            ebs0Var.bk(dss0.a);
            return;
        }
        if (epx.f(tag, "download_video")) {
            ebs0Var.bk(mhs0.a);
            return;
        }
        if (epx.f(tag, "bottom_share")) {
            ebs0Var.bk(kgt0.a);
            return;
        }
        if (epx.f(tag, "bottom_comment")) {
            ebs0Var.bk(r0t0.a);
            return;
        }
        if (epx.f(tag, "bottom_add") || epx.f(tag, "end_add")) {
            ebs0Var.bk(yzr0.a);
            return;
        }
        if (epx.f(tag, "bottom_watch_later")) {
            ebs0Var.bk(kst0.a);
            return;
        }
        if (epx.f(tag, "bottom_about_video")) {
            ebs0Var.bk(u0t0.a);
            return;
        }
        if (epx.f(tag, "episode_button")) {
            ebs0Var.bk(t0t0.a);
            return;
        }
        if (epx.f(tag, "archival_content")) {
            ebs0Var.bk(b2s0.a);
            return;
        }
        if (epx.f(tag, "add_as_clip")) {
            ebs0Var.bk(hkt0.a);
            return;
        }
        if (epx.f(tag, "end_reply") || epx.f(tag, "keep_watching")) {
            ebs0Var.bk(yct0.a);
            return;
        }
        if (epx.f(tag, SignalingTransport.URL_TYPE_RETRY)) {
            ebs0Var.bk(sdt0.a);
            return;
        }
        if (epx.f(tag, "end_previous")) {
            ebs0Var.bk(ygt0.a);
            return;
        }
        if (epx.f(tag, "end_next")) {
            ebs0Var.bk(zgt0.a);
            return;
        }
        if (epx.f(tag, "action_link_tag")) {
            ebs0Var.bk(jxr0.a);
            return;
        }
        if (epx.f(tag, "playlist_tag")) {
            ebs0Var.bk(ngt0.a);
        } else if (epx.f(tag, "more_tag")) {
            ebs0Var.bk(new qws0(15, null, false));
        } else if (epx.f(tag, "donut_badge_tag")) {
            ebs0Var.bk(ghs0.a);
        }
    }
}
