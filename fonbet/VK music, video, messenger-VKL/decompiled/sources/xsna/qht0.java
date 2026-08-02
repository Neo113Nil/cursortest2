package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.common.links.AwayLink;
import com.vk.core.view.AdsButton;
import com.vk.dto.newsfeed.ButtonAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vkontakte.android.data.PostInteract;

/* compiled from: VideoSnippetFooterHolder.kt */
/* loaded from: classes4.dex */
public final class qht0 extends m56<VideoSnippetAttachment> implements View.OnClickListener, AdsButton.b {
    public final TextView D;
    public final TextView E;
    public final AdsButton F;
    public final View G;
    public final ysm0 H;
    public e6o I;
    public final boolean J;

    public qht0(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.attach_video_snippet_footer, viewGroup);
        this.D = (TextView) this.itemView.findViewById(R.id.title);
        this.E = (TextView) this.itemView.findViewById(R.id.caption);
        AdsButton adsButton = (AdsButton) this.itemView.findViewById(R.id.button);
        this.F = adsButton;
        View findViewById = this.itemView.findViewById(R.id.shine_anim);
        this.G = findViewById;
        ysm0 ysm0Var = new ysm0(adsButton, h170Var, findViewById, 8);
        this.H = ysm0Var;
        this.J = h170Var.a() != null;
        View.OnClickListener onClickListener = this.I;
        onClickListener = onClickListener == null ? this : onClickListener;
        this.itemView.setOnClickListener(onClickListener);
        adsButton.setOnClickListener(onClickListener);
        adsButton.setStyleChangeListener(this);
        adsButton.setAnimationDelegate(ysm0Var);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.containerShine);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(hav0.c);
    }

    @Override // com.vk.core.view.AdsButton.b
    public final void O2(int i) {
        u1c0 J0 = J0();
        if (J0 != null) {
            J0.g = Integer.valueOf(i);
        }
        this.H.g();
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a = s6oVar.a(this, s6oVar.e);
        this.I = a;
        this.itemView.setOnClickListener(a);
        this.F.setOnClickListener(a);
    }

    @Override // xsna.m56
    public final void T6(VideoSnippetAttachment videoSnippetAttachment) {
        VideoSnippetAttachment videoSnippetAttachment2 = videoSnippetAttachment;
        String str = videoSnippetAttachment2.u;
        int i = this.J ? 1 : 2;
        TextView textView = this.D;
        textView.setMaxLines(i);
        textView.setText(videoSnippetAttachment2.q);
        this.E.setText(videoSnippetAttachment2.s);
        AdsButton adsButton = this.F;
        adsButton.setText(str);
        bwt0.p0(adsButton, myc0.f(str));
        this.G.setVisibility(4);
        int duration = videoSnippetAttachment2.k.getDuration() * 1000;
        if (duration < 5000) {
            adsButton.setAlphaAnimationDelay(duration);
        } else {
            adsButton.setAlphaAnimationDelay(5000);
        }
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.g : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 0;
        adsButton.setCalculatedColor(dhr0.t.c(R.attr.vk_ui_background_accent_themed));
        adsButton.b(intValue, true);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoSnippetAttachment videoSnippetAttachment;
        if (jjc.b() || (videoSnippetAttachment = (VideoSnippetAttachment) this.C) == null) {
            return;
        }
        AwayLink awayLink = videoSnippetAttachment.p;
        if (!epx.f(view, this.F)) {
            PostInteract postInteract = this.w;
            if (postInteract != null) {
                postInteract.f = awayLink != null ? awayLink.b : null;
                postInteract.Cb(PostInteract.Type.snippet_action);
            }
            gd60.Q0(hd60.a(), this.itemView.getContext(), awayLink != null ? awayLink.b : null, videoSnippetAttachment.t, awayLink != null ? awayLink.c : null, null, 16);
            return;
        }
        PostInteract postInteract2 = this.w;
        if (postInteract2 != null) {
            postInteract2.f = awayLink != null ? awayLink.b : null;
            postInteract2.Cb(PostInteract.Type.snippet_button_action);
        }
        if (videoSnippetAttachment.w == null) {
            if (TextUtils.isEmpty(videoSnippetAttachment.v)) {
                return;
            }
            gd60.Q0(hd60.a(), this.itemView.getContext(), videoSnippetAttachment.v, videoSnippetAttachment.t, awayLink != null ? awayLink.c : null, null, 16);
            return;
        }
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        gd60 a = hd60.a();
        Context context = this.itemView.getContext();
        ButtonAction buttonAction = videoSnippetAttachment.w;
        PostInteract postInteract3 = this.w;
        Integer.valueOf(i);
        a.C(context, buttonAction, postInteract3, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : null);
    }
}
