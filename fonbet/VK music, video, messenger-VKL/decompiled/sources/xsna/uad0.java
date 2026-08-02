package xsna;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.attach.PrimaryAttachmentLayout;
import com.vk.feed.tool.view.newsfeed.attach.PrimaryVideoWrapperView;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.VideoAttachment;
import one.video.view.subtitles.BaseSubtitleView;
import xsna.e3m;

/* compiled from: PrimaryVideoAutoPlayNoFooterHolder.kt */
/* loaded from: classes4.dex */
public final class uad0 extends rp6<h4s0, NewsEntry> implements i7o, ent0, a1n, t0n {
    public static final /* synthetic */ int M = 0;
    public final u3s0 E;
    public final VideoAutoPlayHolderView F;
    public final PrimaryVideoWrapperView G;
    public final ViewGroup H;
    public final View I;
    public final View J;
    public final View K;
    public boolean L;

    /* compiled from: PrimaryVideoAutoPlayNoFooterHolder.kt */
    public static final class a {
        public static hny a(int i, int i2, Context context) {
            int f;
            int i3 = uad0.M;
            boolean z = (i2 & 4) == 0;
            boolean z2 = (i2 & 8) != 0;
            int i4 = (i2 & 16) != 0 ? 12 : 16;
            int i5 = (i2 & 32) != 0 ? 0 : -4;
            int i6 = (i2 & 64) == 0 ? -4 : 0;
            hny hnyVar = new hny(context);
            int i7 = (48 - i4) / 2;
            if (z2) {
                float a = cn70.a() * 12.0f;
                if (z) {
                    e3m.a aVar = e3m.a;
                    f = context.getColor(R.color.vk_white);
                } else {
                    e3m.a aVar2 = e3m.a;
                    f = l8g.f(0.7f, context.getColor(R.color.vk_gray_800));
                }
                hnyVar.b(new InsetDrawable((Drawable) new qog0(a, f), cn70.b(12), cn70.b(i6 + 12), cn70.b(12), cn70.b(i5 + 12)));
            }
            hnyVar.b(new baf0(new InsetDrawable(m33.a(i, e43.a), cn70.b(i7), cn70.b(i6 + i7), cn70.b(i7), cn70.b(i7 + i5)), z ? dhr0.t.c(R.attr.vk_ui_icon_primary_invariably) : -1));
            return hnyVar;
        }
    }

    public uad0(PrimaryAttachmentLayout primaryAttachmentLayout, ViewGroup viewGroup, u3s0 u3s0Var) {
        super(primaryAttachmentLayout, viewGroup);
        this.E = u3s0Var;
        VideoAutoPlayHolderView videoAutoPlayHolderView = (VideoAutoPlayHolderView) primaryAttachmentLayout.findViewById(R.id.video_wrap);
        this.F = videoAutoPlayHolderView;
        this.G = (PrimaryVideoWrapperView) primaryAttachmentLayout.findViewById(R.id.primary_video_wrap);
        this.H = (ViewGroup) primaryAttachmentLayout.findViewById(R.id.video_duration_holder);
        LinearLayout linearLayout = (LinearLayout) primaryAttachmentLayout.findViewById(R.id.video_controls_layout);
        View findViewById = primaryAttachmentLayout.findViewById(R.id.video_watch_later_control);
        this.I = findViewById;
        View findViewById2 = primaryAttachmentLayout.findViewById(R.id.video_sound_control);
        this.J = findViewById2;
        View findViewById3 = primaryAttachmentLayout.findViewById(R.id.video_subtitles_control);
        this.K = findViewById3;
        BaseSubtitleView baseSubtitleView = (BaseSubtitleView) primaryAttachmentLayout.findViewById(R.id.video_subtitles);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 85));
        linearLayout.setOrientation(1);
        f4m.m(5, findViewById);
        f4m.m(5, findViewById2);
        int b = cn70.b(44);
        bwt0.c0(b, findViewById);
        bwt0.c0(b, findViewById2);
        Context context = this.itemView.getContext();
        e3m.a aVar = e3m.a;
        findViewById.setBackground(new InsetDrawable((Drawable) new qog0(cn70.a() * 12.0f, l8g.f(0.7f, context.getColor(R.color.vk_gray_800))), cn70.b(12), cn70.b(12), cn70.b(12), cn70.b(8)));
        findViewById.setPadding(cn70.b(12), cn70.b(12), cn70.b(12), cn70.b(12));
        int f = l8g.f(0.7f, this.itemView.getContext().getColor(R.color.vk_gray_800));
        NoStyleSubtitleView noStyleSubtitleView = baseSubtitleView instanceof NoStyleSubtitleView ? (NoStyleSubtitleView) baseSubtitleView : null;
        if (noStyleSubtitleView != null) {
            int b2 = cn70.b(12);
            int b3 = cn70.b(48);
            noStyleSubtitleView.l = b2;
            noStyleSubtitleView.m = b3;
            noStyleSubtitleView.setBackgroundRoundRadius(8);
            noStyleSubtitleView.setHorizontalMarginPercentOverride(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            noStyleSubtitleView.setBottomMarginOverride(Integer.valueOf(cn70.b(48)));
            noStyleSubtitleView.a(noStyleSubtitleView.getContext().getColor(R.color.vk_white), f);
            noStyleSubtitleView.getTextView().setTextAppearance(R.style.VkUiTypography_FootnoteMedium);
        }
        ViewParent parent = findViewById3.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(findViewById3);
        }
        videoAutoPlayHolderView.addView(findViewById3, new FrameLayout.LayoutParams(cn70.b(48), cn70.b(48), 83));
    }

    @Override // xsna.a1n
    public final void E2(DisclaimerData disclaimerData) {
        bwt0.p0(this.H, false);
        StringBuilder sb = new StringBuilder();
        u3s0 u3s0Var = this.E;
        sb.append(u3s0Var.W.getContentDescription());
        sb.append(".");
        sb.append(di60.m(disclaimerData, this.itemView.getContext()));
        u3s0Var.W.setContentDescription(sb.toString());
    }

    @Override // xsna.qi6
    public final void O6(s980 s980Var) {
        this.y = s980Var;
        u3s0 u3s0Var = this.E;
        u3s0Var.y = s980Var;
        if (s980Var != null) {
            u3s0Var.D = s980Var;
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.E.Q6(s6oVar);
    }

    @Override // xsna.t0n
    public final View R0() {
        return this.G;
    }

    @Override // xsna.rp6
    public final void R6(h4s0 h4s0Var) {
        h4s0 h4s0Var2 = h4s0Var;
        this.L = false;
        VideoAutoPlayHolderView videoAutoPlayHolderView = this.F;
        videoAutoPlayHolderView.getVideoPreview().setScaleType(h4s0Var2.l);
        videoAutoPlayHolderView.getVideoDisplay().getTransformController().f(h4s0Var2.m, false);
        boolean z = h4s0Var2.n;
        PrimaryVideoWrapperView primaryVideoWrapperView = this.G;
        if (primaryVideoWrapperView.b != z) {
            primaryVideoWrapperView.b = z;
            primaryVideoWrapperView.requestLayout();
        }
        u3s0 u3s0Var = this.E;
        if (!z) {
            Context context = this.itemView.getContext();
            VideoFile videoFile = h4s0Var2.j.a.k;
            float height = (videoFile.getWidth() <= 0 || videoFile.getHeight() <= 0) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : videoFile.getHeight() / videoFile.getWidth();
            boolean s = iah0.s(context);
            Point j = iah0.j(context);
            float f = j.y;
            float f2 = j.x;
            u3s0Var.i7(Math.max(Math.min(height, (!s ? f2 / f : f / f2) > 2.0f ? 1.25f : 1.3333334f), 0.5625f));
        }
        u3s0Var.itemView.setPadding(0, 0, 0, 0);
    }

    @Override // xsna.a1n
    public final void U5() {
        this.L = true;
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.E.a6(u1c0Var);
        if (u1c0Var instanceof r74) {
            Attachment attachment = ((r74) u1c0Var).q;
            if (attachment instanceof VideoAttachment) {
            }
        }
        super.a6(u1c0Var);
        mnh0.v(this.itemView, t6());
    }

    @Override // xsna.qi6
    public final s980 l6() {
        return this.y;
    }

    @Override // xsna.a1n
    public final boolean o5() {
        return this.L;
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.E.L;
    }
}
