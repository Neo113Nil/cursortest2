package xsna;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.VKAvatarView;
import com.vkontakte.android.R;
import xsna.kr5;
import xsna.wjk0;

/* compiled from: SpectatorsView.java */
/* loaded from: classes3.dex */
public final class akk0 extends FrameLayout implements wjk0 {
    public final VKAvatarView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final TextView g;
    public final ImageView h;
    public final ImageView i;
    public final View j;
    public vjk0 k;

    /* compiled from: SpectatorsView.java */
    public class a implements pjw {
        public final /* synthetic */ wjk0.a b;

        public a(wjk0.a aVar) {
            this.b = aVar;
        }

        @Override // xsna.pjw
        @Nullable
        public final String f(int i) {
            return this.b.d;
        }
    }

    public akk0(Context context) {
        super(context, null, 0);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_spectators, (ViewGroup) this, true);
        VKAvatarView vKAvatarView = (VKAvatarView) inflate.findViewById(R.id.liveSpectatorsImage);
        this.b = vKAvatarView;
        this.c = (TextView) inflate.findViewById(R.id.liveSpectatorsName);
        this.d = (TextView) inflate.findViewById(R.id.liveSpectatorsBalance);
        TextView textView = (TextView) inflate.findViewById(R.id.liveSpectatorsViewers);
        this.e = textView;
        this.f = (ImageView) inflate.findViewById(R.id.liveSpectatorsViewersIcon);
        TextView textView2 = (TextView) inflate.findViewById(R.id.liveSpectatorsTime);
        this.g = textView2;
        this.h = (ImageView) inflate.findViewById(R.id.liveSpectatorsBalanceIcon);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.liveSpectatorsTimeIcon);
        this.i = imageView;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.liveSpectatorsLiveBadgeNew);
        this.j = inflate.findViewById(R.id.liveSpectatorsVerified);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.liveSpectatorsContainer1);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.liveSpectatorsContainer2);
        frameLayout.setBackground(gpt0.f(getContext(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, getContext().getColor(R.color.vk_white)));
        int a2 = iah0.a(12.0f);
        setPadding(a2, a2, iah0.a(6.0f), a2);
        textView2.setVisibility(8);
        imageView.setVisibility(8);
        x16 x16Var = new x16(this, 15);
        vKAvatarView.setOnClickListener(x16Var);
        linearLayout.setOnClickListener(x16Var);
        linearLayout2.setOnClickListener(x16Var);
        iut0.q(textView, new dgj(0));
    }

    @Override // xsna.wjk0
    public final void Q3() {
        this.e.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // xsna.wjk0
    public final void X() {
        this.d.setVisibility(8);
        this.h.setVisibility(8);
    }

    @Override // xsna.wjk0
    public final void Y2() {
        this.g.setVisibility(0);
        this.i.setVisibility(0);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        vjk0 vjk0Var = this.k;
        if (vjk0Var != null) {
            vjk0Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        vjk0 vjk0Var = this.k;
        if (vjk0Var != null) {
            vjk0Var.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        vjk0 vjk0Var = this.k;
        if (vjk0Var != null) {
            vjk0Var.resume();
        }
    }

    @Override // xsna.wjk0
    public void setCurrentViewers(int i) {
        String replace = crx0.l(i).replace(" ", " ");
        TextView textView = this.e;
        textView.setText(replace);
        textView.setContentDescription(getContext().getResources().getQuantityString(R.plurals.video_spectators_count, i, Integer.valueOf(i)));
    }

    @Override // xsna.wjk0
    public void setTimeText(int i) {
        this.g.setText(DateUtils.formatElapsedTime(i));
    }

    @Override // xsna.wjk0
    public void setUser(wjk0.a aVar) {
        kr5 a2 = new kr5.a(new a(aVar)).a();
        VKAvatarView vKAvatarView = this.b;
        vKAvatarView.Y0(a2);
        String str = aVar.a;
        if (str != null) {
            ucp ucpVar = ucp.a;
            this.c.setText(ucp.i(str.replace(" ", " ")));
            vKAvatarView.setContentDescription(y8g0.f(R.string.accessibility_video_avatar_with_name, aVar.a));
            post(new i0(10, this, aVar));
        }
    }

    @Override // xsna.wjk0
    public final void v2(int i, boolean z) {
        if (!z) {
            X();
            return;
        }
        TextView textView = this.d;
        textView.setVisibility(0);
        this.h.setVisibility(0);
        textView.setText(crx0.l(i).replace(" ", " "));
    }

    @Override // xsna.rr6
    public vjk0 getPresenter() {
        return this.k;
    }

    @Override // xsna.rr6
    public void setPresenter(vjk0 vjk0Var) {
        this.k = vjk0Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.wjk0
    public final void T1(boolean z) {
    }

    @Override // xsna.wjk0
    public final void Y(boolean z, boolean z2) {
    }
}
