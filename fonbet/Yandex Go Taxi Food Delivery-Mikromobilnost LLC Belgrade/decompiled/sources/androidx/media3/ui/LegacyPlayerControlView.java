package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.PlaybackException;
import androidx.media3.ui.LegacyPlayerControlView;
import defpackage.a9z0;
import defpackage.aay;
import defpackage.bka1;
import defpackage.cuh0;
import defpackage.d6z;
import defpackage.do31;
import defpackage.fe10;
import defpackage.ge10;
import defpackage.hfr;
import defpackage.i0i0;
import defpackage.i9h0;
import defpackage.j2i0;
import defpackage.lxc0;
import defpackage.ny61;
import defpackage.pjh0;
import defpackage.r001;
import defpackage.r60;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.s60;
import defpackage.tw21;
import defpackage.ue3;
import defpackage.vxc0;
import defpackage.w3h0;
import defpackage.w820;
import defpackage.wxc0;
import defpackage.x5z0;
import defpackage.xaj;
import defpackage.xxc0;
import defpackage.y5z0;
import defpackage.y8z0;
import defpackage.yxc0;
import defpackage.z8z0;
import defpackage.z9y;
import defpackage.zxc0;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private long currentBufferedPosition;
    private long currentPosition;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    private final View nextButton;
    private final View pauseButton;
    private final y8z0 period;
    private final View playButton;
    private boolean[] playedAdGroups;
    private zxc0 player;
    private final TextView positionView;
    private final View previousButton;
    private z9y progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPlayButtonIfSuppressed;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final y5z0 timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<aay> visibilityListeners;
    private final View vrButton;
    private final z8z0 window;

    public final class ComponentListener implements xxc0, x5z0, View.OnClickListener {
        private ComponentListener() {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(ue3 ue3Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(vxc0 vxc0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zxc0 zxc0Var = LegacyPlayerControlView.this.player;
            if (zxc0Var == null) {
                return;
            }
            if (LegacyPlayerControlView.this.nextButton == view) {
                zxc0Var.seekToNext();
                return;
            }
            if (LegacyPlayerControlView.this.previousButton == view) {
                zxc0Var.seekToPrevious();
                return;
            }
            if (LegacyPlayerControlView.this.fastForwardButton == view) {
                if (zxc0Var.getPlaybackState() != 4) {
                    zxc0Var.seekForward();
                    return;
                }
                return;
            }
            if (LegacyPlayerControlView.this.rewindButton == view) {
                zxc0Var.seekBack();
                return;
            }
            if (LegacyPlayerControlView.this.playButton == view) {
                tw21.M(zxc0Var);
                return;
            }
            if (LegacyPlayerControlView.this.pauseButton == view) {
                tw21.L(zxc0Var);
            } else if (LegacyPlayerControlView.this.repeatToggleButton == view) {
                zxc0Var.setRepeatMode(bka1.d(zxc0Var.getRepeatMode(), LegacyPlayerControlView.this.repeatToggleModes));
            } else if (LegacyPlayerControlView.this.shuffleButton == view) {
                zxc0Var.setShuffleModeEnabled(!zxc0Var.getShuffleModeEnabled());
            }
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onCues(rdf rdfVar) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(xaj xajVar) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        }

        @Override // defpackage.xxc0
        public void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
            boolean a = wxc0Var.a(4, 5);
            hfr hfrVar = wxc0Var.a;
            if (a) {
                LegacyPlayerControlView.this.updatePlayPauseButton();
            }
            if (wxc0Var.a(4, 5, 7)) {
                LegacyPlayerControlView.this.updateProgress();
            }
            if (hfrVar.a.get(8)) {
                LegacyPlayerControlView.this.updateRepeatModeButton();
            }
            if (hfrVar.a.get(9)) {
                LegacyPlayerControlView.this.updateShuffleButton();
            }
            if (wxc0Var.a(8, 9, 11, 0, 13)) {
                LegacyPlayerControlView.this.updateNavigation();
            }
            if (wxc0Var.a(11, 0)) {
                LegacyPlayerControlView.this.updateTimeline();
            }
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
        }

        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMediaItemTransition(fe10 fe10Var, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(re10 re10Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onMetadata(w820 w820Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(lxc0 lxc0Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(re10 re10Var) {
        }

        @Override // defpackage.xxc0
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // defpackage.x5z0
        public void onScrubMove(y5z0 y5z0Var, long j) {
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(tw21.I(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j));
            }
        }

        @Override // defpackage.x5z0
        public void onScrubStart(y5z0 y5z0Var, long j) {
            LegacyPlayerControlView.this.scrubbing = true;
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(tw21.I(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j));
            }
        }

        @Override // defpackage.x5z0
        public void onScrubStop(y5z0 y5z0Var, long j, boolean z) {
            LegacyPlayerControlView.this.scrubbing = false;
            if (z || LegacyPlayerControlView.this.player == null) {
                return;
            }
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.seekToTimeBarPosition(legacyPlayerControlView.player, j);
        }

        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onTimelineChanged(a9z0 a9z0Var, int i) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(r001 r001Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onTracksChanged(r801 r801Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(do31 do31Var) {
        }

        @Override // defpackage.xxc0
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
        }
    }

    static {
        ge10.a("media3.ui");
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = cuh0.exo_legacy_player_control_view;
        final int i3 = 1;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        final int i4 = 0;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = -9223372036854775807L;
        this.showRewindButton = true;
        this.showFastForwardButton = true;
        this.showPreviousButton = true;
        this.showNextButton = true;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, j2i0.LegacyPlayerControlView, i, 0);
            try {
                this.showTimeoutMs = obtainStyledAttributes.getInt(j2i0.LegacyPlayerControlView_show_timeout, this.showTimeoutMs);
                i2 = obtainStyledAttributes.getResourceId(j2i0.LegacyPlayerControlView_controller_layout_id, i2);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                this.showRewindButton = obtainStyledAttributes.getBoolean(j2i0.LegacyPlayerControlView_show_rewind_button, this.showRewindButton);
                this.showFastForwardButton = obtainStyledAttributes.getBoolean(j2i0.LegacyPlayerControlView_show_fastforward_button, this.showFastForwardButton);
                this.showPreviousButton = obtainStyledAttributes.getBoolean(j2i0.LegacyPlayerControlView_show_previous_button, this.showPreviousButton);
                this.showNextButton = obtainStyledAttributes.getBoolean(j2i0.LegacyPlayerControlView_show_next_button, this.showNextButton);
                this.showShuffleButton = obtainStyledAttributes.getBoolean(j2i0.LegacyPlayerControlView_show_shuffle_button, this.showShuffleButton);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(j2i0.LegacyPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.visibilityListeners = new CopyOnWriteArrayList<>();
        this.period = new y8z0();
        this.window = new z8z0();
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.updateProgressAction = new Runnable(this) { // from class: x9y
            public final /* synthetic */ LegacyPlayerControlView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i4;
                LegacyPlayerControlView legacyPlayerControlView = this.b;
                switch (i5) {
                    case 0:
                        legacyPlayerControlView.updateProgress();
                        break;
                    default:
                        legacyPlayerControlView.hide();
                        break;
                }
            }
        };
        this.hideAction = new Runnable(this) { // from class: x9y
            public final /* synthetic */ LegacyPlayerControlView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i3;
                LegacyPlayerControlView legacyPlayerControlView = this.b;
                switch (i5) {
                    case 0:
                        legacyPlayerControlView.updateProgress();
                        break;
                    default:
                        legacyPlayerControlView.hide();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        y5z0 y5z0Var = (y5z0) findViewById(i9h0.exo_progress);
        View findViewById = findViewById(i9h0.exo_progress_placeholder);
        if (y5z0Var != null) {
            this.timeBar = y5z0Var;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i9h0.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            this.timeBar = null;
        }
        this.durationView = (TextView) findViewById(i9h0.exo_duration);
        this.positionView = (TextView) findViewById(i9h0.exo_position);
        y5z0 y5z0Var2 = this.timeBar;
        if (y5z0Var2 != null) {
            y5z0Var2.addListener(componentListener);
        }
        View findViewById2 = findViewById(i9h0.exo_play);
        this.playButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener);
        }
        View findViewById3 = findViewById(i9h0.exo_pause);
        this.pauseButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener);
        }
        View findViewById4 = findViewById(i9h0.exo_prev);
        this.previousButton = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(componentListener);
        }
        View findViewById5 = findViewById(i9h0.exo_next);
        this.nextButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(componentListener);
        }
        View findViewById6 = findViewById(i9h0.exo_rew);
        this.rewindButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(componentListener);
        }
        View findViewById7 = findViewById(i9h0.exo_ffwd);
        this.fastForwardButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(componentListener);
        }
        ImageView imageView = (ImageView) findViewById(i9h0.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(i9h0.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        View findViewById8 = findViewById(i9h0.exo_vr);
        this.vrButton = findViewById8;
        setShowVrButton(false);
        updateButton(false, false, findViewById8);
        Resources resources = context.getResources();
        this.buttonAlphaEnabled = resources.getInteger(pjh0.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(pjh0.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.repeatOffButtonDrawable = resources.getDrawable(w3h0.exo_legacy_controls_repeat_off, context.getTheme());
        this.repeatOneButtonDrawable = resources.getDrawable(w3h0.exo_legacy_controls_repeat_one, context.getTheme());
        this.repeatAllButtonDrawable = resources.getDrawable(w3h0.exo_legacy_controls_repeat_all, context.getTheme());
        this.shuffleOnButtonDrawable = resources.getDrawable(w3h0.exo_legacy_controls_shuffle_on, context.getTheme());
        this.shuffleOffButtonDrawable = resources.getDrawable(w3h0.exo_legacy_controls_shuffle_off, context.getTheme());
        this.repeatOffButtonContentDescription = resources.getString(i0i0.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(i0i0.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(i0i0.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(i0i0.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(i0i0.exo_controls_shuffle_off_description);
        this.currentPosition = -9223372036854775807L;
        this.currentBufferedPosition = -9223372036854775807L;
    }

    private static boolean canShowMultiWindowTimeBar(a9z0 a9z0Var, z8z0 z8z0Var) {
        if (a9z0Var.p() > 100) {
            return false;
        }
        int p = a9z0Var.p();
        for (int i = 0; i < p; i++) {
            if (a9z0Var.n(i, z8z0Var, 0L).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(j2i0.LegacyPlayerControlView_repeat_toggle_modes, i);
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs <= 0) {
            this.hideAtMs = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = this.showTimeoutMs;
        this.hideAtMs = uptimeMillis + i;
        if (this.isAttachedToWindow) {
            postDelayed(this.hideAction, i);
        }
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    private void requestPlayPauseAccessibilityFocus() {
        View view;
        View view2;
        boolean g0 = tw21.g0(this.player, this.showPlayButtonIfSuppressed);
        if (g0 && (view2 = this.playButton) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (g0 || (view = this.pauseButton) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean g0 = tw21.g0(this.player, this.showPlayButtonIfSuppressed);
        if (g0 && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else {
            if (g0 || (view = this.pauseButton) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void seekTo(zxc0 zxc0Var, int i, long j) {
        zxc0Var.seekTo(i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(zxc0 zxc0Var, long j) {
        int currentMediaItemIndex;
        a9z0 currentTimeline = zxc0Var.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.q()) {
            int p = currentTimeline.p();
            currentMediaItemIndex = 0;
            while (true) {
                long l0 = tw21.l0(currentTimeline.n(currentMediaItemIndex, this.window, 0L).l);
                if (j < l0) {
                    break;
                }
                if (currentMediaItemIndex == p - 1) {
                    j = l0;
                    break;
                } else {
                    j -= l0;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = zxc0Var.getCurrentMediaItemIndex();
        }
        seekTo(zxc0Var, currentMediaItemIndex, j);
        updateProgress();
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    private void updateButton(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (isVisible() && this.isAttachedToWindow) {
            zxc0 zxc0Var = this.player;
            if (zxc0Var != null) {
                z = zxc0Var.isCommandAvailable(5);
                z3 = zxc0Var.isCommandAvailable(7);
                z4 = zxc0Var.isCommandAvailable(11);
                z5 = zxc0Var.isCommandAvailable(12);
                z2 = zxc0Var.isCommandAvailable(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            updateButton(this.showPreviousButton, z3, this.previousButton);
            updateButton(this.showRewindButton, z4, this.rewindButton);
            updateButton(this.showFastForwardButton, z5, this.fastForwardButton);
            updateButton(this.showNextButton, z2, this.nextButton);
            y5z0 y5z0Var = this.timeBar;
            if (y5z0Var != null) {
                y5z0Var.setEnabled(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        boolean z2;
        if (isVisible() && this.isAttachedToWindow) {
            boolean g0 = tw21.g0(this.player, this.showPlayButtonIfSuppressed);
            View view = this.playButton;
            if (view != null) {
                z = !g0 && view.isFocused();
                z2 = !g0 && this.playButton.isAccessibilityFocused();
                this.playButton.setVisibility(g0 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                z |= g0 && view2.isFocused();
                z2 |= g0 && this.pauseButton.isAccessibilityFocused();
                this.pauseButton.setVisibility(g0 ? 8 : 0);
            }
            if (z) {
                requestPlayPauseFocus();
            }
            if (z2) {
                requestPlayPauseAccessibilityFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long j;
        long j2;
        if (isVisible() && this.isAttachedToWindow) {
            zxc0 zxc0Var = this.player;
            if (zxc0Var != null) {
                j = zxc0Var.getContentPosition() + this.currentWindowOffset;
                j2 = zxc0Var.getContentBufferedPosition() + this.currentWindowOffset;
            } else {
                j = 0;
                j2 = 0;
            }
            boolean z = j != this.currentPosition;
            this.currentPosition = j;
            this.currentBufferedPosition = j2;
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing && z) {
                textView.setText(tw21.I(this.formatBuilder, this.formatter, j));
            }
            y5z0 y5z0Var = this.timeBar;
            if (y5z0Var != null) {
                y5z0Var.setPosition(j);
                this.timeBar.setBufferedPosition(j2);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = zxc0Var == null ? 1 : zxc0Var.getPlaybackState();
            if (zxc0Var == null || !zxc0Var.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            y5z0 y5z0Var2 = this.timeBar;
            long min = Math.min(y5z0Var2 != null ? y5z0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
            float f = zxc0Var.getPlaybackParameters().a;
            postDelayed(this.updateProgressAction, tw21.j(f > 0.0f ? (long) (min / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            zxc0 zxc0Var = this.player;
            if (zxc0Var == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = zxc0Var.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            zxc0 zxc0Var = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
                return;
            }
            if (zxc0Var == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, true, imageView);
                this.shuffleButton.setImageDrawable(zxc0Var.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(zxc0Var.getShuffleModeEnabled() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v1, types: [y8z0] */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r5v13, types: [s60] */
    public void updateTimeline() {
        int i;
        z8z0 z8z0Var;
        int i2;
        boolean z;
        zxc0 zxc0Var = this.player;
        if (zxc0Var == null) {
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(zxc0Var.getCurrentTimeline(), this.window);
        long j = 0;
        this.currentWindowOffset = 0L;
        a9z0 currentTimeline = zxc0Var.getCurrentTimeline();
        if (currentTimeline.q()) {
            i = 0;
        } else {
            int currentMediaItemIndex = zxc0Var.getCurrentMediaItemIndex();
            boolean z4 = this.multiWindowTimeBar;
            int i3 = z4 ? 0 : currentMediaItemIndex;
            int p = z4 ? currentTimeline.p() - 1 : currentMediaItemIndex;
            i = 0;
            long j2 = 0;
            while (true) {
                if (i3 > p) {
                    break;
                }
                if (i3 == currentMediaItemIndex) {
                    this.currentWindowOffset = tw21.l0(j2);
                }
                currentTimeline.o(this.window, i3);
                z8z0 z8z0Var2 = this.window;
                if (z8z0Var2.l == -9223372036854775807L) {
                    d6z.x(this.multiWindowTimeBar ^ z3);
                    break;
                }
                int i4 = z8z0Var2.m;
                while (true) {
                    z8z0Var = this.window;
                    if (i4 <= z8z0Var.n) {
                        currentTimeline.g(i4, this.period, z2);
                        s60 s60Var = this.period.g;
                        s60Var.getClass();
                        int i5 = s60Var.a;
                        for (?? r14 = z2; r14 < i5; r14++) {
                            this.period.d(r14);
                            long j3 = j;
                            long j4 = this.period.e;
                            if (j4 >= j3) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i == jArr.length) {
                                    ?? length = jArr.length == 0 ? z3 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, (int) length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, (int) length);
                                }
                                this.adGroupTimesMs[i] = tw21.l0(j4 + j2);
                                boolean[] zArr = this.playedAdGroups;
                                r60 a = this.period.g.a(r14);
                                int i6 = a.a;
                                if (i6 == -1) {
                                    i2 = currentMediaItemIndex;
                                    z = z3;
                                } else {
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        int i8 = a.e[i7];
                                        i2 = currentMediaItemIndex;
                                        z = true;
                                        if (i8 == 0 || i8 == 1) {
                                            z3 = true;
                                            break;
                                        } else {
                                            i7++;
                                            z3 = true;
                                            currentMediaItemIndex = i2;
                                        }
                                    }
                                    i2 = currentMediaItemIndex;
                                    z = z3;
                                    z3 = false;
                                }
                                zArr[i] = z3 ^ z;
                                i++;
                            } else {
                                i2 = currentMediaItemIndex;
                                z = z3;
                            }
                            z3 = z;
                            j = j3;
                            currentMediaItemIndex = i2;
                        }
                        i4++;
                        currentMediaItemIndex = currentMediaItemIndex;
                        z2 = false;
                    }
                }
                j2 += z8z0Var.l;
                i3++;
                z3 = z3;
                currentMediaItemIndex = currentMediaItemIndex;
                z2 = false;
            }
            j = j2;
        }
        long l0 = tw21.l0(j);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(tw21.I(this.formatBuilder, this.formatter, l0));
        }
        y5z0 y5z0Var = this.timeBar;
        if (y5z0Var != null) {
            y5z0Var.setDuration(l0);
            int length2 = this.extraAdGroupTimesMs.length;
            int i9 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i9 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i9);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i9);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i9);
        }
        updateProgress();
    }

    public void addVisibilityListener(aay aayVar) {
        aayVar.getClass();
        this.visibilityListeners.add(aayVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        zxc0 zxc0Var = this.player;
        if (zxc0Var == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (zxc0Var.getPlaybackState() == 4) {
                return true;
            }
            zxc0Var.seekForward();
            return true;
        }
        if (keyCode == 89) {
            zxc0Var.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (tw21.g0(zxc0Var, this.showPlayButtonIfSuppressed)) {
                tw21.M(zxc0Var);
                return true;
            }
            tw21.L(zxc0Var);
            return true;
        }
        if (keyCode == 87) {
            zxc0Var.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            zxc0Var.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            tw21.M(zxc0Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        tw21.L(zxc0Var);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public zxc0 getPlayer() {
        return this.player;
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<aay> it = this.visibilityListeners.iterator();
            if (!it.hasNext()) {
                removeCallbacks(this.updateProgressAction);
                removeCallbacks(this.hideAction);
                this.hideAtMs = -9223372036854775807L;
            } else if (it.next() != null) {
                ny61.u();
            } else {
                getVisibility();
                throw null;
            }
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, uptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    public void removeVisibilityListener(aay aayVar) {
        this.visibilityListeners.remove(aayVar);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            zArr.getClass();
            d6z.l(jArr.length == zArr.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr;
        }
        updateTimeline();
    }

    public void setPlayer(zxc0 zxc0Var) {
        d6z.x(Looper.myLooper() == Looper.getMainLooper());
        d6z.l(zxc0Var == null || zxc0Var.getApplicationLooper() == Looper.getMainLooper());
        zxc0 zxc0Var2 = this.player;
        if (zxc0Var2 == zxc0Var) {
            return;
        }
        if (zxc0Var2 != null) {
            zxc0Var2.removeListener(this.componentListener);
        }
        this.player = zxc0Var;
        if (zxc0Var != null) {
            zxc0Var.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setProgressUpdateListener(z9y z9yVar) {
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        zxc0 zxc0Var = this.player;
        if (zxc0Var != null) {
            int repeatMode = zxc0Var.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z) {
        this.showFastForwardButton = z;
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.showPlayButtonIfSuppressed = z;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z) {
        this.showPreviousButton = z;
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.showRewindButton = z;
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = tw21.i(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<aay> it = this.visibilityListeners.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    ny61.u();
                    return;
                } else {
                    getVisibility();
                    throw null;
                }
            }
            updateAll();
            requestPlayPauseFocus();
            requestPlayPauseAccessibilityFocus();
        }
        hideAfterTimeout();
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }
}
