package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.ui.tooltip.types.TooltipType;
import com.vkontakte.android.R;
import one.video.player.OneVideoPlayer;
import xsna.m8v0;

/* compiled from: MultiTrackOnboardingTooltip.kt */
/* loaded from: classes3.dex */
public final class q640 implements zkt0 {
    public final Context a;
    public final h7v b;
    public final jch c;
    public final VideoView.h d;
    public final TooltipType e = TooltipType.MULTITRACK_ONBOARDING;
    public etv0 f;

    /* compiled from: MultiTrackOnboardingTooltip.kt */
    public static final class a {
        public final View a;
        public final gzs<Rect> b;

        public a(View view, p5y p5yVar) {
            this.a = view;
            this.b = p5yVar;
        }
    }

    public q640(Context context, h7v h7vVar, jch jchVar, VideoView.h hVar) {
        this.a = context;
        this.b = h7vVar;
        this.c = jchVar;
        this.d = hVar;
    }

    @Override // xsna.zkt0
    public final boolean a(yg5 yg5Var) {
        d3b0 v0;
        OneVideoPlayer a2;
        return this.b.m(HintId.INFO_VIDEO_SELECT_TOOLTIP_AUDIO_TRACK) && ((SharedPreferences) p640.a.getValue()).getInt("shown_count", 0) < 3 && (yg5Var != null && (v0 = yg5Var.v0()) != null && (a2 = v0.a()) != null && s3t0.a(this.a, a2.F()).size() > 1);
    }

    @Override // xsna.zkt0
    public final void b(prq0 prq0Var, wmd0 wmd0Var) {
        a aVar = (a) this.c.invoke();
        if (aVar == null) {
            return;
        }
        View view = aVar.a;
        gzs<Rect> gzsVar = aVar.b;
        if (gzsVar == null) {
            bwt0.n(view, new zkk(this, aVar, prq0Var, wmd0Var, 2));
        } else if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new r640(this, aVar, prq0Var, wmd0Var));
        } else {
            c(view, gzsVar, prq0Var, wmd0Var);
        }
    }

    public final void c(View view, gzs gzsVar, prq0 prq0Var, wmd0 wmd0Var) {
        int i = m8v0.M;
        m8v0.a.a(view, this.a.getString(R.string.video_multitrack_onboarding_tooltip), gzsVar, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size56, VkOnboarding$TintColor.Azure, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new px30(this, 1), null, null, null, new lh(19, this, prq0Var), new defpackage.c(22, this, wmd0Var), null, 171, false, null, null, false, null, false, 8343040);
    }

    @Override // xsna.zkt0
    public final TooltipType getType() {
        return this.e;
    }
}
