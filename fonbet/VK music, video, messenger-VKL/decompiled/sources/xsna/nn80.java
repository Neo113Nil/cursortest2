package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.video.controls.view.ButtonsLayout;
import one.video.controls.view.CastTextView;
import one.video.controls.view.CurrentIntervalTitleView;
import one.video.controls.view.EndViewLayout;
import one.video.controls.view.ErrorView;
import one.video.controls.view.FastSpeedHintView;
import one.video.controls.view.FooterLayout;
import one.video.controls.view.GradientView;
import one.video.controls.view.HeaderLayout;
import one.video.controls.view.NextVideoButtonView;
import one.video.controls.view.PlayPauseButtonView;
import one.video.controls.view.PositionDurationView;
import one.video.controls.view.PrevVideoButtonView;
import one.video.controls.view.ProgressView;
import one.video.controls.view.ReverseLayout;
import one.video.controls.view.SoundOnlyView;
import one.video.controls.view.ZoomRateView;
import one.video.controls.view.buttons.CastButton;
import one.video.controls.view.buttons.FeedbackButton;
import one.video.controls.view.buttons.FullscreenButton;
import one.video.controls.view.buttons.PipButton;
import one.video.controls.view.buttons.ScaleButton;
import one.video.controls.view.buttons.SettingsButton;
import one.video.controls.view.buttons.TechBugReportButton;
import one.video.controls.view.buttons.VKLogoButton;
import one.video.controls.view.faskseek.FastSeekView;
import one.video.controls.view.seekbar.OneVideoSeekBarView;
import one.video.controls.view.seekpreview.FullSeekPreviewLayout;
import one.video.controls.view.seekpreview.SeekPreviewLayout;
import one.video.controls20.SimpleControlsView;

/* compiled from: OneVideoSimpleControlsViewBinding.java */
/* loaded from: classes8.dex */
public final class nn80 implements xtt0 {

    @NonNull
    public final SettingsButton A;

    @NonNull
    public final SoundOnlyView B;

    @NonNull
    public final TechBugReportButton C;

    @NonNull
    public final VKLogoButton D;

    @NonNull
    public final ZoomRateView E;

    @NonNull
    public final SimpleControlsView a;

    @NonNull
    public final ButtonsLayout b;

    @NonNull
    public final CastButton c;

    @NonNull
    public final CastTextView d;

    @NonNull
    public final ConstraintLayout e;

    @NonNull
    public final CurrentIntervalTitleView f;

    @NonNull
    public final EndViewLayout g;

    @NonNull
    public final ErrorView h;

    @NonNull
    public final FastSeekView i;

    @NonNull
    public final FastSpeedHintView j;

    @NonNull
    public final FeedbackButton k;

    @NonNull
    public final FooterLayout l;

    @NonNull
    public final FullSeekPreviewLayout m;

    @NonNull
    public final FullscreenButton n;

    @NonNull
    public final GradientView o;

    @NonNull
    public final HeaderLayout p;

    @NonNull
    public final NextVideoButtonView q;

    @NonNull
    public final PipButton r;

    @NonNull
    public final PlayPauseButtonView s;

    @NonNull
    public final PositionDurationView t;

    @NonNull
    public final PrevVideoButtonView u;

    @NonNull
    public final ProgressView v;

    @NonNull
    public final ReverseLayout w;

    @NonNull
    public final ScaleButton x;

    @NonNull
    public final OneVideoSeekBarView y;

    @NonNull
    public final SeekPreviewLayout z;

    public nn80(@NonNull SimpleControlsView simpleControlsView, @NonNull ButtonsLayout buttonsLayout, @NonNull CastButton castButton, @NonNull CastTextView castTextView, @NonNull ConstraintLayout constraintLayout, @NonNull CurrentIntervalTitleView currentIntervalTitleView, @NonNull EndViewLayout endViewLayout, @NonNull ErrorView errorView, @NonNull FastSeekView fastSeekView, @NonNull FastSpeedHintView fastSpeedHintView, @NonNull FeedbackButton feedbackButton, @NonNull FooterLayout footerLayout, @NonNull FullSeekPreviewLayout fullSeekPreviewLayout, @NonNull FullscreenButton fullscreenButton, @NonNull GradientView gradientView, @NonNull HeaderLayout headerLayout, @NonNull NextVideoButtonView nextVideoButtonView, @NonNull PipButton pipButton, @NonNull PlayPauseButtonView playPauseButtonView, @NonNull PositionDurationView positionDurationView, @NonNull PrevVideoButtonView prevVideoButtonView, @NonNull ProgressView progressView, @NonNull ReverseLayout reverseLayout, @NonNull ScaleButton scaleButton, @NonNull OneVideoSeekBarView oneVideoSeekBarView, @NonNull SeekPreviewLayout seekPreviewLayout, @NonNull SettingsButton settingsButton, @NonNull SoundOnlyView soundOnlyView, @NonNull TechBugReportButton techBugReportButton, @NonNull VKLogoButton vKLogoButton, @NonNull ZoomRateView zoomRateView) {
        this.a = simpleControlsView;
        this.b = buttonsLayout;
        this.c = castButton;
        this.d = castTextView;
        this.e = constraintLayout;
        this.f = currentIntervalTitleView;
        this.g = endViewLayout;
        this.h = errorView;
        this.i = fastSeekView;
        this.j = fastSpeedHintView;
        this.k = feedbackButton;
        this.l = footerLayout;
        this.m = fullSeekPreviewLayout;
        this.n = fullscreenButton;
        this.o = gradientView;
        this.p = headerLayout;
        this.q = nextVideoButtonView;
        this.r = pipButton;
        this.s = playPauseButtonView;
        this.t = positionDurationView;
        this.u = prevVideoButtonView;
        this.v = progressView;
        this.w = reverseLayout;
        this.x = scaleButton;
        this.y = oneVideoSeekBarView;
        this.z = seekPreviewLayout;
        this.A = settingsButton;
        this.B = soundOnlyView;
        this.C = techBugReportButton;
        this.D = vKLogoButton;
        this.E = zoomRateView;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
