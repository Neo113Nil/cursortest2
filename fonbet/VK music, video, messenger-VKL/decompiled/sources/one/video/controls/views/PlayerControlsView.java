package one.video.controls.views;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.slider.Slider;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import one.video.controls.models.PlayerState;
import one.video.controls.models.UIPlayerSeek;
import one.video.controls.views.LiveSeekView;
import one.video.controls.views.PlayButton;
import one.video.controls.views.seek.VideoSeekViewOld;
import xsna.akw;
import xsna.avt0;
import xsna.bpn0;
import xsna.dp2;
import xsna.ep6;
import xsna.epx;
import xsna.fft0;
import xsna.gzs;
import xsna.i1f;
import xsna.kk1;
import xsna.o19;
import xsna.ozl;
import xsna.pg7;
import xsna.rg0;
import xsna.rl3;
import xsna.s3q0;
import xsna.sqj;
import xsna.u0b0;
import xsna.wn80;
import xsna.wwp0;
import xsna.xwp0;
import xsna.ywp0;
import xsna.zwo0;

/* compiled from: PlayerControlsView.kt */
@ozl
/* loaded from: classes8.dex */
public final class PlayerControlsView extends ConstraintLayout {
    public static final b O = new b();
    public static final a P = new a();
    public SkipForwardButton A;
    public View B;
    public VideoShortActions C;
    public gzs<s3q0> D;
    public gzs<s3q0> E;
    public final c F;
    public final g G;
    public final d H;
    public final ep6 I;
    public final f J;
    public u0b0 K;
    public ywp0 L;
    public PlayerState M;
    public final bpn0 N;
    public VideoSeekViewOld t;
    public fft0 u;
    public LiveSeekView v;
    public VideoButtonsView w;
    public PlayButton x;
    public PlayButton y;
    public SkipBackButton z;

    /* compiled from: PlayerControlsView.kt */
    public final class c implements sqj {
        public c() {
        }

        @Override // xsna.sqj
        public final PlayerControlsView a() {
            return PlayerControlsView.this;
        }

        @Override // xsna.sqj
        public final View b() {
            PlayerControlsView playerControlsView = PlayerControlsView.this;
            ep6 ep6Var = playerControlsView.I;
            View inflate = LayoutInflater.from(playerControlsView.getContext()).inflate(R.layout.one_video_player_controls_view, (ViewGroup) playerControlsView, true);
            VideoSeekViewOld videoSeekViewOld = playerControlsView.t;
            long currentVideoPosition = videoSeekViewOld != null ? videoSeekViewOld.getCurrentVideoPosition() : 0L;
            VideoSeekViewOld videoSeekViewOld2 = playerControlsView.t;
            long currentVideoDurationSeconds = videoSeekViewOld2 != null ? videoSeekViewOld2.getCurrentVideoDurationSeconds() : -1L;
            VideoSeekViewOld videoSeekViewOld3 = (VideoSeekViewOld) playerControlsView.findViewById(R.id.video_seek_view);
            playerControlsView.t = videoSeekViewOld3;
            if (videoSeekViewOld3 == null || !wn80.r) {
                playerControlsView.u = null;
            } else {
                playerControlsView.removeView(videoSeekViewOld3);
                playerControlsView.t = null;
                fft0 fft0Var = new fft0(playerControlsView.getContext());
                playerControlsView.u = fft0Var;
                fft0Var.setId(R.id.video_seek_view);
                fft0 fft0Var2 = playerControlsView.u;
                if (fft0Var2 != null) {
                    fft0Var2.setButtonsClickListener(ep6Var);
                }
                fft0 fft0Var3 = playerControlsView.u;
                if (fft0Var3 != null) {
                    fft0Var3.setControlsListener(playerControlsView.getControlsListener());
                }
                playerControlsView.addView(playerControlsView.u, -1, -1);
            }
            playerControlsView.v = (LiveSeekView) playerControlsView.findViewById(R.id.live_seek_view);
            playerControlsView.w = (VideoButtonsView) playerControlsView.findViewById(R.id.video_buttons_view);
            playerControlsView.x = (PlayButton) playerControlsView.findViewById(R.id.video_play_button);
            playerControlsView.y = (PlayButton) playerControlsView.findViewById(R.id.video_end_replay);
            playerControlsView.C = (VideoShortActions) playerControlsView.findViewById(R.id.video_short_actions);
            playerControlsView.z = (SkipBackButton) playerControlsView.findViewById(R.id.button_skip_back);
            playerControlsView.A = (SkipForwardButton) playerControlsView.findViewById(R.id.button_skip_forward);
            playerControlsView.B = playerControlsView.findViewById(R.id.progress);
            playerControlsView.findViewById(R.id.video_play_button_space);
            int i = wn80.a;
            VideoSeekViewOld videoSeekViewOld4 = playerControlsView.t;
            if (videoSeekViewOld4 != null) {
                videoSeekViewOld4.P4(currentVideoPosition, currentVideoDurationSeconds);
            }
            VideoSeekViewOld videoSeekViewOld5 = playerControlsView.t;
            if (videoSeekViewOld5 != null) {
                videoSeekViewOld5.setDuration((int) currentVideoDurationSeconds);
            }
            VideoSeekViewOld videoSeekViewOld6 = playerControlsView.t;
            if (videoSeekViewOld6 != null) {
                videoSeekViewOld6.u.b.add(playerControlsView.G);
            }
            VideoSeekViewOld videoSeekViewOld7 = playerControlsView.t;
            if (videoSeekViewOld7 != null) {
                videoSeekViewOld7.setButtonsClickListener(ep6Var);
            }
            LiveSeekView liveSeekView = playerControlsView.v;
            if (liveSeekView != null) {
                liveSeekView.setListener(playerControlsView.H);
            }
            VideoButtonsView videoButtonsView = playerControlsView.w;
            if (videoButtonsView != null) {
                videoButtonsView.setButtonsClickListener(ep6Var);
            }
            PlayButton playButton = playerControlsView.x;
            if (playButton != null) {
                playButton.setOnClickListener(ep6Var);
            }
            PlayButton playButton2 = playerControlsView.x;
            if (playButton2 != null) {
                playButton2.setTag("play");
            }
            PlayButton playButton3 = playerControlsView.y;
            if (playButton3 != null) {
                playButton3.setOnClickListener(ep6Var);
            }
            PlayButton playButton4 = playerControlsView.y;
            if (playButton4 != null) {
                playButton4.setTag("replay");
            }
            VideoShortActions videoShortActions = playerControlsView.C;
            if (videoShortActions != null) {
                videoShortActions.setListener(new one.video.controls.views.a(playerControlsView));
            }
            SkipBackButton skipBackButton = playerControlsView.z;
            if (skipBackButton != null) {
                skipBackButton.setOnClickListener(new i1f(playerControlsView, 6));
            }
            SkipForwardButton skipForwardButton = playerControlsView.A;
            if (skipForwardButton != null) {
                skipForwardButton.setOnClickListener(new rg0(playerControlsView, 7));
            }
            return inflate;
        }
    }

    /* compiled from: PlayerControlsView.kt */
    public final class d implements LiveSeekView.b {
        public d() {
        }

        @Override // one.video.controls.views.LiveSeekView.b
        public final void b(long j) {
            ywp0 controlsListener = PlayerControlsView.this.getControlsListener();
            if (controlsListener != null) {
                controlsListener.b();
            }
        }
    }

    /* compiled from: PlayerControlsView.kt */
    public final class e extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int min = Math.min(view.getWidth(), view.getHeight());
            int width = (view.getWidth() - min) / 2;
            int height = (view.getHeight() - min) / 2;
            outline.setOval(width, height, width + min, min + height);
        }
    }

    /* compiled from: PlayerControlsView.kt */
    public final class f implements wwp0 {
    }

    /* compiled from: PlayerControlsView.kt */
    public final class g implements SeekBar.OnSeekBarChangeListener {
        public g() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            ywp0 controlsListener = PlayerControlsView.this.getControlsListener();
            if (controlsListener != null) {
                controlsListener.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            PlayerControlsView playerControlsView = PlayerControlsView.this;
            ywp0 controlsListener = playerControlsView.getControlsListener();
            if (controlsListener != null) {
                controlsListener.onStartTrackingTouch(seekBar);
            }
            dp2.c(playerControlsView.w, null, false, 31);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            PlayerControlsView playerControlsView = PlayerControlsView.this;
            playerControlsView.P4(playerControlsView.getPlayerState() != PlayerState.PAUSE);
            ywp0 controlsListener = playerControlsView.getControlsListener();
            if (controlsListener != null) {
                controlsListener.onStopTrackingTouch(seekBar);
            }
            dp2.b(playerControlsView.w, null, 31);
        }
    }

    public PlayerControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c cVar = new c();
        this.F = cVar;
        this.G = new g();
        this.H = new d();
        this.I = new ep6(this, 6);
        this.J = new f();
        this.K = u0b0.a.a;
        this.M = PlayerState.IDLE;
        o19.l(context);
        getPlayerControlsViewConfiguration().a(cVar, null);
        if (isInEditMode()) {
            setBackgroundResource(R.color.one_video_gray_200);
        }
        this.N = new bpn0(new kk1(19));
    }

    private final e getOvalOutlineProvider() {
        return (e) this.N.getValue();
    }

    public final void P4(boolean z) {
        if (getPlayerState() == PlayerState.END) {
            return;
        }
        PlayButton playButton = this.x;
        if (playButton != null) {
            playButton.setIconType(z ? PlayButton.IconType.PAUSE : PlayButton.IconType.PLAY);
        }
        PlayButton playButton2 = this.x;
        if (playButton2 != null) {
            playButton2.setContentDescription(z ? getContext().getString(R.string.one_video_accessibility_pause) : getContext().getString(R.string.one_video_accessibility_play));
        }
    }

    public ywp0 getControlsListener() {
        return this.L;
    }

    public wwp0 getPlayerAd() {
        return this.J;
    }

    public xwp0 getPlayerButtons() {
        VideoButtonsView videoButtonsView = this.w;
        return videoButtonsView != null ? videoButtonsView : P;
    }

    public u0b0 getPlayerControlsViewConfiguration() {
        return this.K;
    }

    public UIPlayerSeek getPlayerSeek() {
        VideoSeekViewOld videoSeekViewOld = this.t;
        if (videoSeekViewOld != null) {
            return videoSeekViewOld;
        }
        fft0 fft0Var = this.u;
        if (fft0Var != null) {
            return fft0Var;
        }
        LiveSeekView liveSeekView = this.v;
        return liveSeekView != null ? liveSeekView : O;
    }

    public PlayerState getPlayerState() {
        return this.M;
    }

    public gzs<s3q0> getSkipBackListener() {
        return this.D;
    }

    public gzs<s3q0> getSkipForwardListener() {
        return this.E;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fft0 fft0Var = this.u;
        if (fft0Var == null || fft0Var.getVisibility() == 0) {
            return;
        }
        fft0Var.layout(i, i2, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        fft0 fft0Var = this.u;
        if (fft0Var == null || fft0Var.getVisibility() == 0) {
            return;
        }
        fft0Var.measure(i, i2);
    }

    public void setControlsListener(ywp0 ywp0Var) {
        this.L = ywp0Var;
        fft0 fft0Var = this.u;
        if (fft0Var == null || fft0Var == null) {
            return;
        }
        fft0Var.setControlsListener(ywp0Var);
    }

    public final void setPlaybackDuration(long j) {
        LiveSeekView liveSeekView = this.v;
        if (liveSeekView != null) {
            if (j == 0) {
                liveSeekView.setVisibility(8);
                return;
            }
            liveSeekView.setVisibility(0);
            Slider slider = liveSeekView.f;
            if (liveSeekView.h || j >= 0) {
                return;
            }
            float f2 = j;
            if (f2 == slider.getValueFrom()) {
                return;
            }
            if (f2 >= slider.getValue()) {
                slider.setValue(f2);
            }
            liveSeekView.c();
            liveSeekView.b();
            slider.setValueFrom(f2);
        }
    }

    public final void setPlaybackPosition(long j) {
        LiveSeekView liveSeekView = this.v;
        if (liveSeekView != null) {
            liveSeekView.a(j);
        }
    }

    public void setPlayerControlsViewConfiguration(u0b0 u0b0Var) {
        if (u0b0Var.equals(this.K)) {
            return;
        }
        u0b0 u0b0Var2 = this.K;
        this.K = u0b0Var;
        u0b0Var.a(this.F, u0b0Var2);
    }

    public void setPlayerState(PlayerState playerState) {
        this.M = playerState;
        P4(getPlayerState() != PlayerState.PAUSE);
    }

    public void setShortActionsAutoplayEnabled(boolean z) {
        VideoShortActions videoShortActions = this.C;
        if (videoShortActions != null) {
            videoShortActions.setAutoplayEnabled(z);
        }
    }

    public void setShortActionsAutoplayInactive(boolean z) {
        VideoShortActions videoShortActions = this.C;
        if (videoShortActions != null) {
            videoShortActions.setAutoplayInactive(z);
        }
    }

    public void setShortActionsAutoplayVisibility(boolean z) {
        VideoShortActions videoShortActions = this.C;
        if (videoShortActions != null) {
            videoShortActions.setAutoplayVisibility(z);
        }
    }

    public void setShortActionsButtonsVisibility(boolean z) {
        VideoShortActions videoShortActions = this.C;
        if (videoShortActions != null) {
            videoShortActions.setVisibility(z ? 0 : 8);
        }
    }

    public void setShortActionsEnterPipVisibility(boolean z) {
        VideoShortActions videoShortActions = this.C;
        if (videoShortActions != null) {
            videoShortActions.setEnterPipVisibility(z);
        }
    }

    public void setSkipBackListener(gzs<s3q0> gzsVar) {
        if (epx.f(this.D, gzsVar)) {
            return;
        }
        this.D = gzsVar;
        if (gzsVar == null) {
            SkipBackButton skipBackButton = this.z;
            if (skipBackButton != null) {
                skipBackButton.setVisibility(8);
                return;
            }
            return;
        }
        SkipBackButton skipBackButton2 = this.z;
        if (skipBackButton2 != null) {
            PlayButton playButton = this.x;
            skipBackButton2.setVisibility(playButton != null ? playButton.getVisibility() : 8);
        }
    }

    public void setSkipForwardListener(gzs<s3q0> gzsVar) {
        if (epx.f(this.E, gzsVar)) {
            return;
        }
        this.E = gzsVar;
        if (gzsVar == null) {
            SkipForwardButton skipForwardButton = this.A;
            if (skipForwardButton != null) {
                skipForwardButton.setVisibility(8);
                return;
            }
            return;
        }
        SkipForwardButton skipForwardButton2 = this.A;
        if (skipForwardButton2 != null) {
            PlayButton playButton = this.x;
            skipForwardButton2.setVisibility(playButton != null ? playButton.getVisibility() : 8);
        }
    }

    public final void setVideoViewCacher(avt0.a... aVarArr) {
        List u0 = rl3.u0(aVarArr);
        SkipForwardButton skipForwardButton = this.A;
        if (skipForwardButton != null) {
            skipForwardButton.setDrawer(new pg7(skipForwardButton, u0));
            skipForwardButton.setOutlineProvider(getOvalOutlineProvider());
            skipForwardButton.setClipToOutline(true);
        }
        SkipBackButton skipBackButton = this.z;
        if (skipBackButton != null) {
            skipBackButton.setDrawer(new pg7(skipBackButton, u0));
            skipBackButton.setOutlineProvider(getOvalOutlineProvider());
            skipBackButton.setClipToOutline(true);
        }
        PlayButton playButton = this.x;
        if (playButton != null) {
            playButton.setDrawer(new pg7(playButton, u0));
            playButton.setOutlineProvider(getOvalOutlineProvider());
            playButton.setClipToOutline(true);
        }
    }

    /* compiled from: PlayerControlsView.kt */
    public static final class a implements xwp0 {
        @Override // xsna.xwp0
        public final void setChromeCastActive(boolean z) {
        }

        @Override // xsna.xwp0
        public final void setFullScreenMode(boolean z) {
        }
    }

    /* compiled from: PlayerControlsView.kt */
    public static final class b implements UIPlayerSeek {
        public boolean b;

        @Override // one.video.controls.models.UIPlayerSeek
        public final boolean K3() {
            return this.b;
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final View W3(Context context) {
            return new View(context);
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final int getSeekBarHeight() {
            return 0;
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void setExtendSeekBarEnabled(boolean z) {
            this.b = z;
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void O3(int i) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void U1(UIPlayerSeek.c cVar) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void W1(UIPlayerSeek.a aVar) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void setCurrentVideoDurationSeconds(long j) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void setCurrentVideoPosition(long j) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void setImageLoader(akw akwVar) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void setIntervalsDisplayConfig(UIPlayerSeek.IntervalsDisplayConfig intervalsDisplayConfig) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void setSeekBarAlwaysVisible(boolean z) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void setTimelineThumbs(zwo0 zwo0Var) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void C3(long j, long j2) {
        }

        @Override // one.video.controls.models.UIPlayerSeek
        public final void H3(int i, ArrayList arrayList) {
        }
    }
}
