package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.PlaybackException;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import defpackage.a9z0;
import defpackage.bka1;
import defpackage.cuh0;
import defpackage.cyc0;
import defpackage.d06;
import defpackage.d2i0;
import defpackage.d5b0;
import defpackage.d6z;
import defpackage.do31;
import defpackage.dyc0;
import defpackage.e001;
import defpackage.eyc0;
import defpackage.fe10;
import defpackage.fyc0;
import defpackage.ge10;
import defpackage.hwh0;
import defpackage.hyc0;
import defpackage.i0i0;
import defpackage.i9h0;
import defpackage.j2i0;
import defpackage.jvg0;
import defpackage.jyc0;
import defpackage.kyc0;
import defpackage.lxc0;
import defpackage.myc0;
import defpackage.pjh0;
import defpackage.q801;
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
import defpackage.w5h0;
import defpackage.w820;
import defpackage.wmg0;
import defpackage.wnb0;
import defpackage.wuj0;
import defpackage.wxc0;
import defpackage.x5z0;
import defpackage.xaj;
import defpackage.xxc0;
import defpackage.y5z0;
import defpackage.y8z0;
import defpackage.yln;
import defpackage.yxc0;
import defpackage.z8z0;
import defpackage.zxc0;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;
    private final View audioTrackButton;
    private final cyc0 audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private final a controlViewLayoutManager;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final ImageView fullscreenButton;
    private final String fullscreenEnterContentDescription;
    private final Drawable fullscreenEnterDrawable;
    private final String fullscreenExitContentDescription;
    private final Drawable fullscreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullscreen;
    private final ImageView minimalFullscreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    private final ImageView nextButton;
    private dyc0 onFullScreenModeChangedListener;
    private final Drawable pauseButtonDrawable;
    private final y8z0 period;
    private final Drawable playButtonDrawable;
    private final ImageView playPauseButton;
    private final eyc0 playbackSpeedAdapter;
    private final View playbackSpeedButton;
    private boolean[] playedAdGroups;
    private zxc0 player;
    private final TextView positionView;
    private final ImageView previousButton;
    private fyc0 progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final Resources resources;
    private final View rewindButton;
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private final hyc0 settingsAdapter;
    private final View settingsButton;
    private final RecyclerView settingsView;
    private final PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private boolean showPlayButtonIfSuppressed;
    private int showTimeoutMs;
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private final jyc0 textTrackSelectionAdapter;
    private final y5z0 timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final e001 trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<myc0> visibilityListeners;
    private final ImageView vrButton;
    private final z8z0 window;

    /* loaded from: classes10.dex */
    public final class ComponentListener implements xxc0, x5z0, View.OnClickListener, PopupWindow.OnDismissListener {
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
            zxc0 zxc0Var = PlayerControlView.this.player;
            if (zxc0Var == null) {
                return;
            }
            PlayerControlView.this.controlViewLayoutManager.n();
            if (PlayerControlView.this.nextButton == view) {
                if (zxc0Var.isCommandAvailable(9)) {
                    zxc0Var.seekToNext();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.previousButton == view) {
                if (zxc0Var.isCommandAvailable(7)) {
                    zxc0Var.seekToPrevious();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.fastForwardButton == view) {
                if (zxc0Var.getPlaybackState() == 4 || !zxc0Var.isCommandAvailable(12)) {
                    return;
                }
                zxc0Var.seekForward();
                return;
            }
            if (PlayerControlView.this.rewindButton == view) {
                if (zxc0Var.isCommandAvailable(11)) {
                    zxc0Var.seekBack();
                    return;
                }
                return;
            }
            ImageView imageView = PlayerControlView.this.playPauseButton;
            PlayerControlView playerControlView = PlayerControlView.this;
            if (imageView == view) {
                if (tw21.g0(zxc0Var, playerControlView.showPlayButtonIfSuppressed)) {
                    tw21.M(zxc0Var);
                    return;
                } else {
                    tw21.L(zxc0Var);
                    return;
                }
            }
            if (playerControlView.repeatToggleButton == view) {
                if (zxc0Var.isCommandAvailable(15)) {
                    zxc0Var.setRepeatMode(bka1.d(zxc0Var.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                    return;
                }
                return;
            }
            if (PlayerControlView.this.shuffleButton == view) {
                if (zxc0Var.isCommandAvailable(14)) {
                    zxc0Var.setShuffleModeEnabled(!zxc0Var.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            View view2 = PlayerControlView.this.settingsButton;
            PlayerControlView playerControlView2 = PlayerControlView.this;
            if (view2 == view) {
                playerControlView2.controlViewLayoutManager.m();
                PlayerControlView playerControlView3 = PlayerControlView.this;
                playerControlView3.displaySettingsWindow(playerControlView3.settingsAdapter, PlayerControlView.this.settingsButton);
                return;
            }
            View view3 = playerControlView2.playbackSpeedButton;
            PlayerControlView playerControlView4 = PlayerControlView.this;
            if (view3 == view) {
                playerControlView4.controlViewLayoutManager.m();
                PlayerControlView playerControlView5 = PlayerControlView.this;
                playerControlView5.displaySettingsWindow(playerControlView5.playbackSpeedAdapter, PlayerControlView.this.playbackSpeedButton);
                return;
            }
            View view4 = playerControlView4.audioTrackButton;
            PlayerControlView playerControlView6 = PlayerControlView.this;
            if (view4 == view) {
                playerControlView6.controlViewLayoutManager.m();
                PlayerControlView playerControlView7 = PlayerControlView.this;
                playerControlView7.displaySettingsWindow(playerControlView7.audioTrackSelectionAdapter, PlayerControlView.this.audioTrackButton);
            } else if (playerControlView6.subtitleButton == view) {
                PlayerControlView.this.controlViewLayoutManager.m();
                PlayerControlView playerControlView8 = PlayerControlView.this;
                playerControlView8.displaySettingsWindow(playerControlView8.textTrackSelectionAdapter, PlayerControlView.this.subtitleButton);
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

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PlayerControlView.this.needToHideBars) {
                PlayerControlView.this.controlViewLayoutManager.n();
            }
        }

        @Override // defpackage.xxc0
        public void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
            if (wxc0Var.a(4, 5, 13)) {
                PlayerControlView.this.updatePlayPauseButton();
            }
            if (wxc0Var.a(4, 5, 7, 13)) {
                PlayerControlView.this.updateProgress();
            }
            if (wxc0Var.a(8, 13)) {
                PlayerControlView.this.updateRepeatModeButton();
            }
            if (wxc0Var.a(9, 13)) {
                PlayerControlView.this.updateShuffleButton();
            }
            if (wxc0Var.a(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.updateNavigation();
            }
            if (wxc0Var.a(11, 0, 13)) {
                PlayerControlView.this.updateTimeline();
            }
            if (wxc0Var.a(12, 13)) {
                PlayerControlView.this.updatePlaybackSpeedList();
            }
            if (wxc0Var.a(2, 13)) {
                PlayerControlView.this.updateTrackLists();
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
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(tw21.I(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        @Override // defpackage.x5z0
        public void onScrubStart(y5z0 y5z0Var, long j) {
            PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(tw21.I(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
            PlayerControlView.this.controlViewLayoutManager.m();
        }

        @Override // defpackage.x5z0
        public void onScrubStop(y5z0 y5z0Var, long j, boolean z) {
            PlayerControlView.this.scrubbing = false;
            if (!z && PlayerControlView.this.player != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.seekToTimeBarPosition(playerControlView.player, j);
            }
            PlayerControlView.this.controlViewLayoutManager.n();
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
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        PlayerControlView playerControlView;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z7;
        boolean z8;
        boolean z9;
        int i15;
        boolean z10;
        boolean z11;
        int i16;
        TextView textView;
        ComponentListener componentListener;
        PlayerControlView playerControlView2;
        boolean z12;
        int i17;
        boolean z13;
        int i18 = cuh0.exo_player_control_view;
        int i19 = w3h0.exo_styled_controls_play;
        int i20 = w3h0.exo_styled_controls_pause;
        int i21 = w3h0.exo_styled_controls_next;
        int i22 = w3h0.exo_styled_controls_simple_fastforward;
        int i23 = w3h0.exo_styled_controls_previous;
        int i24 = w3h0.exo_styled_controls_simple_rewind;
        int i25 = w3h0.exo_styled_controls_fullscreen_exit;
        int i26 = w3h0.exo_styled_controls_fullscreen_enter;
        int i27 = w3h0.exo_styled_controls_repeat_off;
        int i28 = w3h0.exo_styled_controls_repeat_one;
        int i29 = w3h0.exo_styled_controls_repeat_all;
        int i30 = w3h0.exo_styled_controls_shuffle_on;
        int i31 = w3h0.exo_styled_controls_shuffle_off;
        int i32 = w3h0.exo_styled_controls_subtitle_on;
        int i33 = w3h0.exo_styled_controls_subtitle_off;
        int i34 = w3h0.exo_styled_controls_vr;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, j2i0.PlayerControlView, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_controller_layout_id, i18);
                i19 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_play_icon, i19);
                int resourceId2 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_pause_icon, i20);
                i21 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_next_icon, i21);
                int resourceId3 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_fastforward_icon, i22);
                int resourceId4 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_previous_icon, i23);
                int resourceId5 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_rewind_icon, i24);
                int resourceId6 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_fullscreen_exit_icon, i25);
                i26 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_fullscreen_enter_icon, i26);
                int resourceId7 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_repeat_off_icon, i27);
                i28 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_repeat_one_icon, i28);
                int resourceId8 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_repeat_all_icon, i29);
                int resourceId9 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_shuffle_on_icon, i30);
                int resourceId10 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_shuffle_off_icon, i31);
                int resourceId11 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_subtitle_on_icon, i32);
                int resourceId12 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_subtitle_off_icon, i33);
                int resourceId13 = obtainStyledAttributes.getResourceId(j2i0.PlayerControlView_vr_icon, i34);
                playerControlView = this;
                playerControlView.showTimeoutMs = obtainStyledAttributes.getInt(j2i0.PlayerControlView_show_timeout, playerControlView.showTimeoutMs);
                playerControlView.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, playerControlView.repeatToggleModes);
                boolean z14 = obtainStyledAttributes.getBoolean(j2i0.PlayerControlView_show_rewind_button, true);
                boolean z15 = obtainStyledAttributes.getBoolean(j2i0.PlayerControlView_show_fastforward_button, true);
                boolean z16 = obtainStyledAttributes.getBoolean(j2i0.PlayerControlView_show_previous_button, true);
                boolean z17 = obtainStyledAttributes.getBoolean(j2i0.PlayerControlView_show_next_button, true);
                boolean z18 = obtainStyledAttributes.getBoolean(j2i0.PlayerControlView_show_shuffle_button, false);
                boolean z19 = obtainStyledAttributes.getBoolean(j2i0.PlayerControlView_show_subtitle_button, false);
                boolean z20 = obtainStyledAttributes.getBoolean(j2i0.PlayerControlView_show_vr_button, false);
                playerControlView.setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(j2i0.PlayerControlView_time_bar_min_update_interval, playerControlView.timeBarMinUpdateIntervalMs));
                boolean z21 = obtainStyledAttributes.getBoolean(j2i0.PlayerControlView_animation_enabled, true);
                obtainStyledAttributes.recycle();
                i6 = resourceId;
                i7 = resourceId9;
                z6 = z21;
                i11 = resourceId4;
                i4 = resourceId6;
                i5 = resourceId8;
                i8 = resourceId10;
                i3 = resourceId11;
                i9 = resourceId12;
                i2 = resourceId13;
                z = z14;
                z7 = z15;
                z2 = z17;
                z3 = z18;
                z4 = z19;
                z5 = z20;
                i10 = resourceId3;
                i12 = resourceId5;
                i13 = resourceId7;
                i14 = resourceId2;
                z8 = z16;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            playerControlView = this;
            i2 = i34;
            i3 = i32;
            i4 = i25;
            i5 = i29;
            i6 = i18;
            i7 = i30;
            i8 = i31;
            i9 = i33;
            z = true;
            z2 = true;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = true;
            i10 = i22;
            i11 = i23;
            i12 = i24;
            i13 = i27;
            i14 = i20;
            z7 = true;
            z8 = true;
        }
        int i35 = i28;
        int i36 = i21;
        int i37 = i26;
        int i38 = i19;
        LayoutInflater.from(context).inflate(i6, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        ComponentListener componentListener2 = new ComponentListener();
        playerControlView.componentListener = componentListener2;
        playerControlView.visibilityListeners = new CopyOnWriteArrayList<>();
        playerControlView.period = new y8z0();
        playerControlView.window = new z8z0();
        StringBuilder sb = new StringBuilder();
        playerControlView.formatBuilder = sb;
        playerControlView.formatter = new Formatter(sb, Locale.getDefault());
        playerControlView.adGroupTimesMs = new long[0];
        playerControlView.playedAdGroups = new boolean[0];
        playerControlView.extraAdGroupTimesMs = new long[0];
        playerControlView.extraPlayedAdGroups = new boolean[0];
        playerControlView.updateProgressAction = new wnb0(8, playerControlView);
        playerControlView.durationView = (TextView) playerControlView.findViewById(i9h0.exo_duration);
        playerControlView.positionView = (TextView) playerControlView.findViewById(i9h0.exo_position);
        ImageView imageView = (ImageView) playerControlView.findViewById(i9h0.exo_subtitle);
        playerControlView.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener2);
        }
        ImageView imageView2 = (ImageView) playerControlView.findViewById(i9h0.exo_fullscreen);
        playerControlView.fullscreenButton = imageView2;
        int i39 = 3;
        initializeFullscreenButton(imageView2, new d5b0(i39, playerControlView));
        ImageView imageView3 = (ImageView) playerControlView.findViewById(i9h0.exo_minimal_fullscreen);
        playerControlView.minimalFullscreenButton = imageView3;
        initializeFullscreenButton(imageView3, new d5b0(i39, playerControlView));
        View findViewById = playerControlView.findViewById(i9h0.exo_settings);
        playerControlView.settingsButton = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(componentListener2);
        }
        View findViewById2 = playerControlView.findViewById(i9h0.exo_playback_speed);
        playerControlView.playbackSpeedButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(componentListener2);
        }
        View findViewById3 = playerControlView.findViewById(i9h0.exo_audio_track);
        playerControlView.audioTrackButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(componentListener2);
        }
        y5z0 y5z0Var = (y5z0) playerControlView.findViewById(i9h0.exo_progress);
        View findViewById4 = playerControlView.findViewById(i9h0.exo_progress_placeholder);
        if (y5z0Var != null) {
            playerControlView.timeBar = y5z0Var;
            z9 = z;
            i15 = i13;
            z10 = z7;
            z11 = z2;
            i16 = i37;
            textView = null;
            componentListener = componentListener2;
            playerControlView2 = playerControlView;
            z12 = z8;
            i17 = i4;
        } else if (findViewById4 != null) {
            z10 = z7;
            z11 = z2;
            i16 = i37;
            i15 = i13;
            playerControlView2 = this;
            z9 = z;
            componentListener = componentListener2;
            z12 = z8;
            textView = null;
            i17 = i4;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, d2i0.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i9h0.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            playerControlView2.timeBar = defaultTimeBar;
        } else {
            z9 = z;
            i15 = i13;
            z10 = z7;
            z11 = z2;
            i16 = i37;
            textView = null;
            componentListener = componentListener2;
            playerControlView2 = playerControlView;
            z12 = z8;
            i17 = i4;
            playerControlView2.timeBar = null;
        }
        y5z0 y5z0Var2 = playerControlView2.timeBar;
        if (y5z0Var2 != null) {
            y5z0Var2.addListener(componentListener);
        }
        Resources resources = context.getResources();
        playerControlView2.resources = resources;
        ImageView imageView4 = (ImageView) playerControlView2.findViewById(i9h0.exo_play_pause);
        playerControlView2.playPauseButton = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener);
        }
        ImageView imageView5 = (ImageView) playerControlView2.findViewById(i9h0.exo_prev);
        playerControlView2.previousButton = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i11, context.getTheme()));
            imageView5.setOnClickListener(componentListener);
        }
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(i9h0.exo_next);
        playerControlView2.nextButton = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i36, context.getTheme()));
            imageView6.setOnClickListener(componentListener);
        }
        Typeface b = wuj0.b(w5h0.roboto_medium_numbers, context);
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(i9h0.exo_rew);
        TextView textView2 = (TextView) playerControlView2.findViewById(i9h0.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i12, context.getTheme()));
            playerControlView2.rewindButton = imageView7;
            playerControlView2.rewindButtonTextView = textView;
        } else if (textView2 != null) {
            textView2.setTypeface(b);
            playerControlView2.rewindButtonTextView = textView2;
            playerControlView2.rewindButton = textView2;
        } else {
            playerControlView2.rewindButtonTextView = textView;
            playerControlView2.rewindButton = textView;
        }
        View view = playerControlView2.rewindButton;
        if (view != null) {
            view.setOnClickListener(componentListener);
        }
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(i9h0.exo_ffwd);
        TextView textView3 = (TextView) playerControlView2.findViewById(i9h0.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i10, context.getTheme()));
            playerControlView2.fastForwardButton = imageView8;
            playerControlView2.fastForwardButtonTextView = textView;
        } else if (textView3 != null) {
            textView3.setTypeface(b);
            playerControlView2.fastForwardButtonTextView = textView3;
            playerControlView2.fastForwardButton = textView3;
        } else {
            playerControlView2.fastForwardButtonTextView = textView;
            playerControlView2.fastForwardButton = textView;
        }
        View view2 = playerControlView2.fastForwardButton;
        if (view2 != null) {
            view2.setOnClickListener(componentListener);
        }
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(i9h0.exo_repeat_toggle);
        playerControlView2.repeatToggleButton = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(componentListener);
        }
        ImageView imageView10 = (ImageView) playerControlView2.findViewById(i9h0.exo_shuffle);
        playerControlView2.shuffleButton = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(componentListener);
        }
        playerControlView2.buttonAlphaEnabled = resources.getInteger(pjh0.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.buttonAlphaDisabled = resources.getInteger(pjh0.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(i9h0.exo_vr);
        playerControlView2.vrButton = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i2, context.getTheme()));
            playerControlView2.updateButton(false, imageView11);
        }
        a aVar = new a(playerControlView2);
        playerControlView2.controlViewLayoutManager = aVar;
        aVar.o(z6);
        hyc0 hyc0Var = new hyc0(playerControlView2, new String[]{resources.getString(i0i0.exo_controls_playback_speed), resources.getString(i0i0.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(w3h0.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(w3h0.exo_styled_controls_audiotrack, context.getTheme())});
        playerControlView2.settingsAdapter = hyc0Var;
        playerControlView2.settingsWindowMargin = resources.getDimensionPixelSize(jvg0.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(cuh0.exo_styled_settings_list, (ViewGroup) null);
        playerControlView2.settingsView = recyclerView;
        recyclerView.setAdapter(hyc0Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(playerControlView2.getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        playerControlView2.settingsWindow = popupWindow;
        if (tw21.a < 23) {
            z13 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z13 = false;
        }
        popupWindow.setOnDismissListener(componentListener);
        playerControlView2.needToHideBars = true;
        playerControlView2.trackNameProvider = new d06(playerControlView2.getResources(), 1);
        playerControlView2.subtitleOnButtonDrawable = resources.getDrawable(i3, context.getTheme());
        playerControlView2.subtitleOffButtonDrawable = resources.getDrawable(i9, context.getTheme());
        playerControlView2.subtitleOnContentDescription = resources.getString(i0i0.exo_controls_cc_enabled_description);
        playerControlView2.subtitleOffContentDescription = resources.getString(i0i0.exo_controls_cc_disabled_description);
        playerControlView2.textTrackSelectionAdapter = new jyc0(playerControlView2);
        playerControlView2.audioTrackSelectionAdapter = new cyc0(playerControlView2);
        playerControlView2.playbackSpeedAdapter = new eyc0(playerControlView2, resources.getStringArray(wmg0.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        playerControlView2.playButtonDrawable = resources.getDrawable(i38, context.getTheme());
        playerControlView2.pauseButtonDrawable = resources.getDrawable(i14, context.getTheme());
        playerControlView2.fullscreenExitDrawable = resources.getDrawable(i17, context.getTheme());
        playerControlView2.fullscreenEnterDrawable = resources.getDrawable(i16, context.getTheme());
        playerControlView2.repeatOffButtonDrawable = resources.getDrawable(i15, context.getTheme());
        playerControlView2.repeatOneButtonDrawable = resources.getDrawable(i35, context.getTheme());
        playerControlView2.repeatAllButtonDrawable = resources.getDrawable(i5, context.getTheme());
        playerControlView2.shuffleOnButtonDrawable = resources.getDrawable(i7, context.getTheme());
        playerControlView2.shuffleOffButtonDrawable = resources.getDrawable(i8, context.getTheme());
        playerControlView2.fullscreenExitContentDescription = resources.getString(i0i0.exo_controls_fullscreen_exit_description);
        playerControlView2.fullscreenEnterContentDescription = resources.getString(i0i0.exo_controls_fullscreen_enter_description);
        playerControlView2.repeatOffButtonContentDescription = resources.getString(i0i0.exo_controls_repeat_off_description);
        playerControlView2.repeatOneButtonContentDescription = resources.getString(i0i0.exo_controls_repeat_one_description);
        playerControlView2.repeatAllButtonContentDescription = resources.getString(i0i0.exo_controls_repeat_all_description);
        playerControlView2.shuffleOnContentDescription = resources.getString(i0i0.exo_controls_shuffle_on_description);
        playerControlView2.shuffleOffContentDescription = resources.getString(i0i0.exo_controls_shuffle_off_description);
        aVar.p((ViewGroup) playerControlView2.findViewById(i9h0.exo_bottom_bar), true);
        aVar.p(playerControlView2.fastForwardButton, z10);
        aVar.p(playerControlView2.rewindButton, z9);
        aVar.p(imageView5, z12);
        aVar.p(imageView6, z11);
        aVar.p(imageView10, z3);
        aVar.p(playerControlView2.subtitleButton, z4);
        aVar.p(imageView11, z5);
        aVar.p(imageView9, playerControlView2.repeatToggleModes != 0 ? true : z13);
        playerControlView2.addOnLayoutChangeListener(new yln(11, playerControlView2));
    }

    private static boolean canShowMultiWindowTimeBar(zxc0 zxc0Var, z8z0 z8z0Var) {
        a9z0 currentTimeline;
        int p;
        if (!zxc0Var.isCommandAvailable(17) || (p = (currentTimeline = zxc0Var.getCurrentTimeline()).p()) <= 1 || p > 100) {
            return false;
        }
        for (int i = 0; i < p; i++) {
            if (currentTimeline.o(z8z0Var, i).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.Adapter adapter, View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableList<kyc0> gatherSupportedTrackInfosOfType(r801 r801Var, int i) {
        ImmutableList.a aVar = new ImmutableList.a();
        ImmutableList a = r801Var.a();
        for (int i2 = 0; i2 < a.size(); i2++) {
            q801 q801Var = (q801) a.get(i2);
            if (q801Var.b() == i) {
                for (int i3 = 0; i3 < q801Var.a; i3++) {
                    if (q801Var.c(i3)) {
                        androidx.media3.common.a a2 = q801Var.a(i3);
                        if ((a2.e & 2) == 0) {
                            aVar.a(new kyc0(r801Var, i2, i3, ((d06) this.trackNameProvider).d(a2)));
                        }
                    }
                }
            }
        }
        return aVar.g();
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(j2i0.PlayerControlView_repeat_toggle_modes, i);
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.f();
        this.audioTrackSelectionAdapter.f();
        zxc0 zxc0Var = this.player;
        if (zxc0Var != null && zxc0Var.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            r801 currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.k(gatherSupportedTrackInfosOfType(currentTracks, 1));
            boolean b = this.controlViewLayoutManager.b(this.subtitleButton);
            jyc0 jyc0Var = this.textTrackSelectionAdapter;
            if (b) {
                jyc0Var.j(gatherSupportedTrackInfosOfType(currentTracks, 3));
            } else {
                jyc0Var.j(ImmutableList.p());
            }
        }
    }

    private static void initializeFullscreenButton(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullscreenButtonClicked(View view) {
        updateIsFullscreen(!this.isFullscreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i) {
        if (i == 0) {
            eyc0 eyc0Var = this.playbackSpeedAdapter;
            View view = this.settingsButton;
            view.getClass();
            displaySettingsWindow(eyc0Var, view);
            return;
        }
        if (i != 1) {
            this.settingsWindow.dismiss();
            return;
        }
        cyc0 cyc0Var = this.audioTrackSelectionAdapter;
        View view2 = this.settingsButton;
        view2.getClass();
        displaySettingsWindow(cyc0Var, view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(zxc0 zxc0Var, long j) {
        if (this.multiWindowTimeBar) {
            if (zxc0Var.isCommandAvailable(17) && zxc0Var.isCommandAvailable(10)) {
                a9z0 currentTimeline = zxc0Var.getCurrentTimeline();
                int p = currentTimeline.p();
                int i = 0;
                while (true) {
                    long a = currentTimeline.o(this.window, i).a();
                    if (j < a) {
                        break;
                    }
                    if (i == p - 1) {
                        j = a;
                        break;
                    } else {
                        j -= a;
                        i++;
                    }
                }
                zxc0Var.seekTo(i, j);
            }
        } else if (zxc0Var.isCommandAvailable(5)) {
            zxc0Var.seekTo(j);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        zxc0 zxc0Var = this.player;
        if (zxc0Var == null || !zxc0Var.isCommandAvailable(13)) {
            return;
        }
        zxc0 zxc0Var2 = this.player;
        zxc0Var2.setPlaybackParameters(zxc0Var2.getPlaybackParameters().a(f));
    }

    private void updateButton(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    private void updateFastForwardButton() {
        zxc0 zxc0Var = this.player;
        int seekForwardIncrement = (int) ((zxc0Var != null ? zxc0Var.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(hwh0.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void updateFullscreenButtonForState(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.fullscreenExitDrawable);
            imageView.setContentDescription(this.fullscreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullscreenEnterDrawable);
            imageView.setContentDescription(this.fullscreenEnterContentDescription);
        }
    }

    private static void updateFullscreenButtonVisibility(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
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
                z = (this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(zxc0Var, this.window)) ? zxc0Var.isCommandAvailable(10) : zxc0Var.isCommandAvailable(5);
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
            if (z4) {
                updateRewindButton();
            }
            if (z5) {
                updateFastForwardButton();
            }
            updateButton(z3, this.previousButton);
            updateButton(z4, this.rewindButton);
            updateButton(z5, this.fastForwardButton);
            updateButton(z2, this.nextButton);
            y5z0 y5z0Var = this.timeBar;
            if (y5z0Var != null) {
                y5z0Var.setEnabled(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r0.getCurrentTimeline().q() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updatePlayPauseButton() {
        boolean z;
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean g0 = tw21.g0(this.player, this.showPlayButtonIfSuppressed);
            Drawable drawable = g0 ? this.playButtonDrawable : this.pauseButtonDrawable;
            int i = g0 ? i0i0.exo_controls_play_description : i0i0.exo_controls_pause_description;
            this.playPauseButton.setImageDrawable(drawable);
            this.playPauseButton.setContentDescription(this.resources.getString(i));
            zxc0 zxc0Var = this.player;
            if (zxc0Var != null) {
                z = true;
                if (zxc0Var.isCommandAvailable(1)) {
                    if (zxc0Var.isCommandAvailable(17)) {
                    }
                    updateButton(z, this.playPauseButton);
                }
            }
            z = false;
            updateButton(z, this.playPauseButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        zxc0 zxc0Var = this.player;
        if (zxc0Var == null) {
            return;
        }
        this.playbackSpeedAdapter.g(zxc0Var.getPlaybackParameters().a);
        this.settingsAdapter.g(this.playbackSpeedAdapter.f());
        updateSettingsButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long j;
        long j2;
        if (isVisible() && this.isAttachedToWindow) {
            zxc0 zxc0Var = this.player;
            if (zxc0Var == null || !zxc0Var.isCommandAvailable(16)) {
                j = 0;
                j2 = 0;
            } else {
                j = zxc0Var.getContentPosition() + this.currentWindowOffset;
                j2 = zxc0Var.getContentBufferedPosition() + this.currentWindowOffset;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
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
                updateButton(false, imageView);
                return;
            }
            zxc0 zxc0Var = this.player;
            if (zxc0Var == null || !zxc0Var.isCommandAvailable(15)) {
                updateButton(false, this.repeatToggleButton);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, this.repeatToggleButton);
            int repeatMode = zxc0Var.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
        }
    }

    private void updateRewindButton() {
        zxc0 zxc0Var = this.player;
        int seekBackIncrement = (int) ((zxc0Var != null ? zxc0Var.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(hwh0.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateSettingsButton() {
        updateButton(this.settingsAdapter.f(), this.settingsButton);
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            zxc0 zxc0Var = this.player;
            if (!this.controlViewLayoutManager.b(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (zxc0Var == null || !zxc0Var.isCommandAvailable(14)) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, this.shuffleButton);
                this.shuffleButton.setImageDrawable(zxc0Var.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(zxc0Var.getShuffleModeEnabled() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    public void updateTimeline() {
        long j;
        int i;
        z8z0 z8z0Var;
        int i2;
        boolean z;
        zxc0 zxc0Var = this.player;
        if (zxc0Var == null) {
            return;
        }
        boolean z2 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(zxc0Var, this.window);
        long j2 = 0;
        this.currentWindowOffset = 0L;
        a9z0 currentTimeline = zxc0Var.isCommandAvailable(17) ? zxc0Var.getCurrentTimeline() : a9z0.a;
        long j3 = -9223372036854775807L;
        if (currentTimeline.q()) {
            if (zxc0Var.isCommandAvailable(16)) {
                long contentDuration = zxc0Var.getContentDuration();
                if (contentDuration != -9223372036854775807L) {
                    j = tw21.W(contentDuration);
                    i = 0;
                }
            }
            j = 0;
            i = 0;
        } else {
            int currentMediaItemIndex = zxc0Var.getCurrentMediaItemIndex();
            boolean z3 = this.multiWindowTimeBar;
            int i3 = z3 ? 0 : currentMediaItemIndex;
            int p = z3 ? currentTimeline.p() - 1 : currentMediaItemIndex;
            long j4 = 0;
            i = 0;
            while (true) {
                if (i3 > p) {
                    break;
                }
                if (i3 == currentMediaItemIndex) {
                    this.currentWindowOffset = tw21.l0(j4);
                }
                currentTimeline.o(this.window, i3);
                z8z0 z8z0Var2 = this.window;
                long j5 = j2;
                if (z8z0Var2.l == j3) {
                    d6z.x(this.multiWindowTimeBar ^ z2);
                    break;
                }
                int i4 = z8z0Var2.m;
                while (true) {
                    z8z0Var = this.window;
                    if (i4 <= z8z0Var.n) {
                        currentTimeline.f(i4, this.period);
                        s60 s60Var = this.period.g;
                        s60Var.getClass();
                        int i5 = s60Var.a;
                        int i6 = 0;
                        while (i6 < i5) {
                            long j6 = j3;
                            this.period.d(i6);
                            long j7 = this.period.e;
                            if (j7 >= j5) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i == jArr.length) {
                                    ?? length = jArr.length == 0 ? z2 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, (int) length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, (int) length);
                                }
                                this.adGroupTimesMs[i] = tw21.l0(j7 + j4);
                                boolean[] zArr = this.playedAdGroups;
                                r60 a = this.period.g.a(i6);
                                int i7 = a.a;
                                if (i7 == -1) {
                                    i2 = currentMediaItemIndex;
                                    z = z2;
                                } else {
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        int i9 = a.e[i8];
                                        i2 = currentMediaItemIndex;
                                        z = true;
                                        if (i9 == 0 || i9 == 1) {
                                            z2 = true;
                                            break;
                                        } else {
                                            i8++;
                                            z2 = true;
                                            currentMediaItemIndex = i2;
                                        }
                                    }
                                    i2 = currentMediaItemIndex;
                                    z = z2;
                                    z2 = false;
                                }
                                zArr[i] = z2 ^ z;
                                i++;
                            } else {
                                i2 = currentMediaItemIndex;
                                z = z2;
                            }
                            i6++;
                            z2 = z;
                            j3 = j6;
                            currentMediaItemIndex = i2;
                            j5 = 0;
                        }
                        i4++;
                        currentMediaItemIndex = currentMediaItemIndex;
                        j5 = 0;
                    }
                }
                j4 += z8z0Var.l;
                i3++;
                z2 = z2;
                currentMediaItemIndex = currentMediaItemIndex;
                j2 = 0;
            }
            j = j4;
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
            int i10 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i10 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i10);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i10);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i10);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
        updateSettingsButton();
    }

    @Deprecated
    public void addVisibilityListener(myc0 myc0Var) {
        myc0Var.getClass();
        this.visibilityListeners.add(myc0Var);
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
            if (zxc0Var.getPlaybackState() == 4 || !zxc0Var.isCommandAvailable(12)) {
                return true;
            }
            zxc0Var.seekForward();
            return true;
        }
        if (keyCode == 89 && zxc0Var.isCommandAvailable(11)) {
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
            if (!zxc0Var.isCommandAvailable(9)) {
                return true;
            }
            zxc0Var.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!zxc0Var.isCommandAvailable(7)) {
                return true;
            }
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

    public zxc0 getPlayer() {
        return this.player;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.b(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.b(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.b(this.vrButton);
    }

    public void hide() {
        this.controlViewLayoutManager.d();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.e();
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.f();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.g();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void notifyOnVisibilityChange() {
        Iterator<myc0> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.i();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.n();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.j();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.m();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.controlViewLayoutManager.k(i, i2, i3, i4);
    }

    @Deprecated
    public void removeVisibilityListener(myc0 myc0Var) {
        this.visibilityListeners.remove(myc0Var);
    }

    public void requestPlayPauseFocus() {
        ImageView imageView = this.playPauseButton;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.controlViewLayoutManager.o(z);
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

    @Deprecated
    public void setOnFullScreenModeChangedListener(dyc0 dyc0Var) {
        this.onFullScreenModeChangedListener = dyc0Var;
        updateFullscreenButtonVisibility(this.fullscreenButton, dyc0Var != null);
        updateFullscreenButtonVisibility(this.minimalFullscreenButton, dyc0Var != null);
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

    public void setProgressUpdateListener(fyc0 fyc0Var) {
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        zxc0 zxc0Var = this.player;
        if (zxc0Var != null && zxc0Var.isCommandAvailable(15)) {
            int repeatMode = this.player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.p(this.repeatToggleButton, i != 0);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z) {
        this.controlViewLayoutManager.p(this.fastForwardButton, z);
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.controlViewLayoutManager.p(this.nextButton, z);
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.showPlayButtonIfSuppressed = z;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z) {
        this.controlViewLayoutManager.p(this.previousButton, z);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.controlViewLayoutManager.p(this.rewindButton, z);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.controlViewLayoutManager.p(this.shuffleButton, z);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z) {
        this.controlViewLayoutManager.p(this.subtitleButton, z);
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.n();
        }
    }

    public void setShowVrButton(boolean z) {
        this.controlViewLayoutManager.p(this.vrButton, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = tw21.i(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.vrButton;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        this.controlViewLayoutManager.s();
    }

    public void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public void updateIsFullscreen(boolean z) {
        if (this.isFullscreen == z) {
            return;
        }
        this.isFullscreen = z;
        updateFullscreenButtonForState(this.fullscreenButton, z);
        updateFullscreenButtonForState(this.minimalFullscreenButton, z);
        dyc0 dyc0Var = this.onFullScreenModeChangedListener;
        if (dyc0Var != null) {
            dyc0Var.onFullScreenModeChanged(z);
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }
}
