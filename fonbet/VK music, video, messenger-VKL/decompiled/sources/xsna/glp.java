package xsna;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.live.impl.views.addbutton.AddButtonView;
import com.vk.libvideo.ui.VideoNextView;
import com.vkontakte.android.R;

/* compiled from: EndViewStory.java */
/* loaded from: classes3.dex */
public final class glp extends FrameLayout implements kkp {
    public final VKCircleImageView b;
    public final TextView c;
    public final Button d;
    public final AddButtonView e;
    public final VKImageView f;
    public final ViewGroup g;
    public final VideoNextView h;
    public boolean i;
    public boolean j;
    public jkp k;

    public glp(Context context) {
        super(context, null, 0);
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_end_story, (ViewGroup) this, true);
        this.e = (AddButtonView) inflate.findViewById(R.id.liveEndStoryAddButton);
        this.f = (VKImageView) inflate.findViewById(R.id.liveEndStoryViewBack);
        VKCircleImageView vKCircleImageView = (VKCircleImageView) inflate.findViewById(R.id.liveEndStoryUserImage);
        this.b = vKCircleImageView;
        this.c = (TextView) inflate.findViewById(R.id.liveEndStoryUserName);
        Button button = (Button) inflate.findViewById(R.id.liveEndStoryGotoProfileButton);
        this.d = button;
        Button button2 = (Button) inflate.findViewById(R.id.liveEndStoryShareButton);
        Button button3 = (Button) inflate.findViewById(R.id.liveEndStoryStartSteamingButton);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.liveEndStoryViewTimeBarHolder);
        this.g = viewGroup;
        VideoNextView videoNextView = (VideoNextView) inflate.findViewById(R.id.liveEndStoryViewTimeBarNew);
        this.h = videoNextView;
        videoNextView.getIcon().setImageDrawable(m33.a(R.drawable.vk_icon_chevron_16, getContext()));
        videoNextView.getLabel().setText(context.getText(R.string.live_story_end_next));
        button.setOnClickListener(new blp(this));
        viewGroup.setOnClickListener(new clp(this));
        button2.setOnClickListener(new dlp(this));
        button3.setOnClickListener(new elp(this));
        vKCircleImageView.setOnClickListener(new flp(this));
        ObjectAnimator objectAnimator = videoNextView.d;
        objectAnimator.cancel();
        pdc pdcVar = videoNextView.e;
        pdcVar.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pdcVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pdcVar.l = 0L;
        pdcVar.invalidateSelf();
        objectAnimator.setDuration(8000L);
        objectAnimator.start();
        videoNextView.getProgressAnim().addListener(new f96(this, 1));
    }

    @Override // xsna.kkp
    public mk0 getAddButton() {
        if (this.i) {
            return this.e;
        }
        return null;
    }

    @Override // xsna.kkp
    public mk0 getImgAddButton() {
        return null;
    }

    @Override // xsna.kkp
    public wcf0 getRecommendedView() {
        return null;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.kkp
    public final void p(String str, String str2, String str3, boolean z, boolean z2) {
        this.b.o0(str2, null);
        TextView textView = this.c;
        if (z2) {
            Context context = getContext();
            ucp ucpVar = ucp.a;
            textView.setText(context.getString(R.string.live_story_end_name_group, ucp.i(str)));
        } else if (z) {
            Context context2 = getContext();
            ucp ucpVar2 = ucp.a;
            textView.setText(context2.getString(R.string.live_story_end_name_female, ucp.i(str)));
        } else {
            Context context3 = getContext();
            ucp ucpVar3 = ucp.a;
            textView.setText(context3.getString(R.string.live_story_end_name_male, ucp.i(str)));
        }
        Button button = this.d;
        if (z2) {
            button.setVisibility(0);
        } else {
            button.setVisibility(8);
        }
        VKImageView vKImageView = this.f;
        vKImageView.load(str3);
        vKImageView.animate().alpha(1.0f).setDuration(800L).start();
    }

    @Override // xsna.rr6
    public final void pause() {
        jkp jkpVar = this.k;
        if (jkpVar != null) {
            jkpVar.pause();
        }
        if (this.j) {
            return;
        }
        this.h.d.pause();
    }

    @Override // xsna.rr6
    public final void release() {
        jkp jkpVar = this.k;
        if (jkpVar != null) {
            jkpVar.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        jkp jkpVar = this.k;
        if (jkpVar != null) {
            jkpVar.resume();
        }
        if (this.j) {
            return;
        }
        this.h.d.resume();
    }

    public void setAllowAddButton(boolean z) {
        this.i = z;
        AddButtonView addButtonView = this.e;
        if (addButtonView != null) {
            if (z) {
                addButtonView.setVisibility(0);
            } else {
                addButtonView.setVisibility(8);
            }
        }
    }

    @Override // xsna.rr6
    public jkp getPresenter() {
        return this.k;
    }

    @Override // xsna.rr6
    public void setPresenter(jkp jkpVar) {
        this.k = jkpVar;
    }

    @Override // xsna.kkp
    public final void F1() {
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
