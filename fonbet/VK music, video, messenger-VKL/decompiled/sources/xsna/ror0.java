package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: VerticalFeedEndView.kt */
/* loaded from: classes3.dex */
public final class ror0 extends FrameLayout implements por0 {
    public final VKCircleImageView b;
    public final TextView c;
    public final VKImageView d;
    public oor0 e;

    public ror0(Context context) {
        super(context, null, 0);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_end_vertical_feed, (ViewGroup) this, true);
        this.d = (VKImageView) inflate.findViewById(R.id.liveEndViewBack);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) inflate.findViewById(R.id.liveEndUserImage);
        this.b = vKCircleImageView;
        this.c = (TextView) inflate.findViewById(R.id.liveEndUserName);
        Button button = (Button) inflate.findViewById(R.id.liveEndStartSteamingButton);
        Button button2 = (Button) inflate.findViewById(R.id.liveEndShareButton);
        TextView textView = (TextView) inflate.findViewById(R.id.liveEndWatchNext);
        setBackgroundColor(-1459617792);
        jjc.g(vKCircleImageView, new mcj0(this, 18));
        jjc.g(button, new bjm0(this, 5));
        jjc.g(button2, new ksg0(this, 16));
        jjc.g(textView, new j5b0(this, 27));
        if (g620.f().getExperiments().m()) {
            return;
        }
        f4m.j(button);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.por0
    public final void p(String str, String str2, String str3, boolean z, boolean z2) {
        this.b.o0(str2, null);
        String string = getContext().getString(z ? R.string.live_video_ended_female : R.string.live_video_ended_male);
        StringBuilder sb = new StringBuilder();
        ucp ucpVar = ucp.a;
        sb.append((Object) ucp.i(str));
        sb.append(' ');
        sb.append(string);
        this.c.setText(sb.toString());
        this.d.load(str3);
    }

    @Override // xsna.rr6
    public final void pause() {
        oor0 oor0Var = this.e;
        if (oor0Var != null) {
            oor0Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        oor0 oor0Var = this.e;
        if (oor0Var != null) {
            oor0Var.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        oor0 oor0Var = this.e;
        if (oor0Var != null) {
            oor0Var.resume();
        }
    }

    @Override // xsna.rr6
    public oor0 getPresenter() {
        return this.e;
    }

    @Override // xsna.rr6
    public void setPresenter(oor0 oor0Var) {
        this.e = oor0Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
