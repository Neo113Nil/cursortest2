package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import defpackage.a3x0;
import defpackage.a9z0;
import defpackage.af10;
import defpackage.au1;
import defpackage.b32;
import defpackage.boo;
import defpackage.cj01;
import defpackage.coo;
import defpackage.d6z;
import defpackage.doo;
import defpackage.eh20;
import defpackage.eoo;
import defpackage.ewy;
import defpackage.fe10;
import defpackage.fg10;
import defpackage.foo;
import defpackage.fyi0;
import defpackage.g7q0;
import defpackage.gg10;
import defpackage.goo;
import defpackage.h42;
import defpackage.hg10;
import defpackage.hoo;
import defpackage.hyi0;
import defpackage.ig10;
import defpackage.ip4;
import defpackage.iyi0;
import defpackage.j5h;
import defpackage.jg10;
import defpackage.jxc0;
import defpackage.jzc0;
import defpackage.kas0;
import defpackage.kb10;
import defpackage.kxc0;
import defpackage.kzc0;
import defpackage.las0;
import defpackage.lk91;
import defpackage.loo;
import defpackage.lxc0;
import defpackage.lyi0;
import defpackage.m6u;
import defpackage.meh;
import defpackage.myi0;
import defpackage.neh;
import defpackage.nwy;
import defpackage.ny61;
import defpackage.o2x0;
import defpackage.owy;
import defpackage.pno;
import defpackage.qzt0;
import defpackage.rhw0;
import defpackage.ruy;
import defpackage.s820;
import defpackage.seh;
import defpackage.sf10;
import defpackage.tw21;
import defpackage.ue3;
import defpackage.uf10;
import defpackage.uf3;
import defpackage.vf3;
import defpackage.vyc0;
import defpackage.w001;
import defpackage.w820;
import defpackage.we10;
import defpackage.wno;
import defpackage.wqj;
import defpackage.wyc0;
import defpackage.wzy;
import defpackage.x001;
import defpackage.xe10;
import defpackage.xyl0;
import defpackage.xzy;
import defpackage.y001;
import defpackage.y3c;
import defpackage.y8z0;
import defpackage.ye10;
import defpackage.yyc0;
import defpackage.yzz0;
import defpackage.z2x0;
import defpackage.z8z0;
import defpackage.ze10;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
final class ExoPlayerImplInternal implements Handler.Callback, we10, w001, ig10, meh, wyc0, uf3 {
    private static final long BUFFERING_MAXIMUM_INTERVAL_MS = tw21.l0(10000);
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_AUDIO_FOCUS_PLAYER_COMMAND = 33;
    private static final int MSG_AUDIO_FOCUS_VOLUME_MULTIPLIER = 34;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 29;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_RENDERER_CAPABILITIES_CHANGED = 26;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_AUDIO_ATTRIBUTES = 31;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_PRELOAD_CONFIGURATION = 28;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SET_VIDEO_OUTPUT = 30;
    private static final int MSG_SET_VOLUME = 32;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final int MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS = 27;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final long READY_MAXIMUM_INTERVAL_MS = 1000;
    private static final String TAG = "ExoPlayerImplInternal";
    private final b32 analyticsCollector;
    private final m6u applicationLooperHandler;
    private final vf3 audioFocusManager;
    private final long backBufferDurationUs;
    private final ip4 bandwidthMeter;
    private final y3c clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final boolean dynamicSchedulingEnabled;
    private final y001 emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final m6u handler;
    private final boolean hasSecondaryRenderers;
    private boolean isPrewarmingDisabledUntilNextTransition;
    private boolean isRebuffering;
    private final ewy livePlaybackSpeedControl;
    private final owy loadControl;
    private final neh mediaClock;
    private final jg10 mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private hoo pendingInitialSeekPosition;
    private final ArrayList<doo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private ExoPlaybackException pendingRecoverableRendererError;
    private final y8z0 period;
    private jxc0 playbackInfo;
    private eoo playbackInfoUpdate;
    private final foo playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final kxc0 playbackLooperProvider;
    private final vyc0 playerId;
    private pno preloadConfiguration;
    private final af10 queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final iyi0[] rendererCapabilities;
    private long rendererPositionElapsedRealtimeUs;
    private long rendererPositionUs;
    private final boolean[] rendererReportedReady;
    private final myi0[] renderers;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private g7q0 seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final x001 trackSelector;
    private final z8z0 window;
    private long prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
    private float volume = 1.0f;
    private long playbackMaybeBecameStuckAtMs = -9223372036854775807L;
    private long lastRebufferRealtimeMs = -9223372036854775807L;
    private a9z0 lastPreloadPoolInvalidationTimeline = a9z0.a;

    public ExoPlayerImplInternal(Context context, fyi0[] fyi0VarArr, fyi0[] fyi0VarArr2, x001 x001Var, y001 y001Var, owy owyVar, ip4 ip4Var, int i, boolean z, b32 b32Var, g7q0 g7q0Var, ewy ewyVar, long j, boolean z2, boolean z3, Looper looper, y3c y3cVar, foo fooVar, vyc0 vyc0Var, kxc0 kxc0Var, pno pnoVar) {
        Looper looper2;
        this.playbackInfoUpdateListener = fooVar;
        this.trackSelector = x001Var;
        this.emptyTrackSelectorResult = y001Var;
        this.loadControl = owyVar;
        this.bandwidthMeter = ip4Var;
        this.repeatMode = i;
        this.shuffleModeEnabled = z;
        this.seekParameters = g7q0Var;
        this.livePlaybackSpeedControl = ewyVar;
        this.releaseTimeoutMs = j;
        this.setForegroundModeTimeoutMs = j;
        this.pauseAtEndOfWindow = z2;
        this.dynamicSchedulingEnabled = z3;
        this.clock = y3cVar;
        this.playerId = vyc0Var;
        this.preloadConfiguration = pnoVar;
        this.analyticsCollector = b32Var;
        this.backBufferDurationUs = owyVar.getBackBufferDurationUs(vyc0Var);
        this.retainBackBufferFromKeyframe = owyVar.retainBackBufferFromKeyframe(vyc0Var);
        jxc0 j2 = jxc0.j(y001Var);
        this.playbackInfo = j2;
        this.playbackInfoUpdate = new eoo(j2);
        this.rendererCapabilities = new iyi0[fyi0VarArr.length];
        this.rendererReportedReady = new boolean[fyi0VarArr.length];
        hyi0 rendererCapabilitiesListener = x001Var.getRendererCapabilitiesListener();
        this.renderers = new myi0[fyi0VarArr.length];
        boolean z4 = false;
        boolean z5 = false;
        for (int i2 = 0; i2 < fyi0VarArr.length; i2++) {
            fyi0VarArr[i2].init(i2, vyc0Var, y3cVar);
            this.rendererCapabilities[i2] = fyi0VarArr[i2].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i2].setListener(rendererCapabilitiesListener);
            }
            fyi0 fyi0Var = fyi0VarArr2[i2];
            if (fyi0Var != null) {
                fyi0Var.init(fyi0VarArr.length + i2, vyc0Var, y3cVar);
                z5 = true;
            }
            this.renderers[i2] = new myi0(fyi0VarArr[i2], fyi0VarArr2[i2], i2);
        }
        this.hasSecondaryRenderers = z5;
        this.mediaClock = new neh(this, y3cVar);
        this.pendingMessages = new ArrayList<>();
        this.window = new z8z0();
        this.period = new y8z0();
        x001Var.init(this, ip4Var);
        this.deliverPendingMessageAtStartPositionRequired = true;
        o2x0 o2x0Var = (o2x0) y3cVar;
        a3x0 a = o2x0Var.a(looper, null);
        this.applicationLooperHandler = a;
        this.queue = new af10(b32Var, a, new c(6, this), pnoVar);
        this.mediaSourceList = new jg10(this, b32Var, a, vyc0Var);
        kxc0 kxc0Var2 = kxc0Var == null ? new kxc0() : kxc0Var;
        this.playbackLooperProvider = kxc0Var2;
        synchronized (kxc0Var2.a) {
            try {
                if (kxc0Var2.b == null) {
                    if (kxc0Var2.d == 0 && kxc0Var2.c == null) {
                        z4 = true;
                    }
                    d6z.x(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    kxc0Var2.c = handlerThread;
                    handlerThread.start();
                    kxc0Var2.b = kxc0Var2.c.getLooper();
                }
                kxc0Var2.d++;
                looper2 = kxc0Var2.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.playbackLooper = looper2;
        this.handler = o2x0Var.a(looper2, this);
        this.audioFocusManager = new vf3(context, looper2, this);
    }

    private void addMediaItemsInternal(boo booVar, int i) throws ExoPlaybackException {
        this.playbackInfoUpdate.a(1);
        jg10 jg10Var = this.mediaSourceList;
        if (i == -1) {
            i = jg10Var.b.size();
        }
        handleMediaSourceListInfoRefreshed(jg10Var.a(i, booVar.a, booVar.b), false);
    }

    private void allowRenderersToRenderStartOfStreams() {
        y001 y001Var = this.queue.i.o;
        for (int i = 0; i < this.renderers.length; i++) {
            if (y001Var.b(i)) {
                myi0 myi0Var = this.renderers[i];
                fyi0 fyi0Var = myi0Var.c;
                fyi0 fyi0Var2 = myi0Var.a;
                if (myi0.g(fyi0Var2)) {
                    fyi0Var2.enableMayRenderStartOfStream();
                } else if (fyi0Var != null && myi0.g(fyi0Var)) {
                    fyi0Var.enableMayRenderStartOfStream();
                }
            }
        }
    }

    private boolean areRenderersPrewarming() {
        if (!this.hasSecondaryRenderers) {
            return false;
        }
        for (myi0 myi0Var : this.renderers) {
            if (myi0Var.e()) {
                return true;
            }
        }
        return false;
    }

    private void attemptRendererErrorRecovery() throws ExoPlaybackException {
        reselectTracksInternalAndSeek();
    }

    private ye10 createMediaPeriodHolder(ze10 ze10Var, long j) {
        iyi0[] iyi0VarArr = this.rendererCapabilities;
        x001 x001Var = this.trackSelector;
        au1 allocator = this.loadControl.getAllocator();
        jg10 jg10Var = this.mediaSourceList;
        y001 y001Var = this.emptyTrackSelectorResult;
        this.preloadConfiguration.getClass();
        return new ye10(iyi0VarArr, j, x001Var, allocator, jg10Var, ze10Var, y001Var);
    }

    private void deliverMessage(yyc0 yyc0Var) throws ExoPlaybackException {
        synchronized (yyc0Var) {
        }
        try {
            yyc0Var.a.handleMessage(yyc0Var.c, yyc0Var.d);
        } finally {
            yyc0Var.a(true);
        }
    }

    private void disableAndResetPrewarmingRenderers() {
        fyi0 fyi0Var;
        if (this.hasSecondaryRenderers && areRenderersPrewarming()) {
            for (myi0 myi0Var : this.renderers) {
                int b = myi0Var.b();
                neh nehVar = this.mediaClock;
                if (myi0Var.e()) {
                    int i = myi0Var.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        fyi0Var = myi0Var.a;
                    } else {
                        fyi0Var = myi0Var.c;
                        fyi0Var.getClass();
                    }
                    myi0Var.a(fyi0Var, nehVar);
                    myi0Var.i(z);
                    myi0Var.d = i2;
                }
                this.enabledRendererCount -= b - myi0Var.b();
            }
            this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
        }
    }

    private void disableRenderer(int i) throws ExoPlaybackException {
        int b = this.renderers[i].b();
        myi0 myi0Var = this.renderers[i];
        neh nehVar = this.mediaClock;
        myi0Var.a(myi0Var.a, nehVar);
        fyi0 fyi0Var = myi0Var.c;
        if (fyi0Var != null) {
            boolean z = (fyi0Var.getState() == 0 || myi0Var.d == 3) ? false : true;
            myi0Var.a(fyi0Var, nehVar);
            myi0Var.i(false);
            if (z) {
                fyi0 fyi0Var2 = myi0Var.a;
                fyi0Var.getClass();
                fyi0Var.handleMessage(17, fyi0Var2);
            }
        }
        myi0Var.d = 0;
        maybeTriggerOnRendererReadyChanged(i, false);
        this.enabledRendererCount -= b;
    }

    private void disableRenderers() throws ExoPlaybackException {
        for (int i = 0; i < this.renderers.length; i++) {
            disableRenderer(i);
        }
        this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doSomeWork() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        jxc0 jxc0Var;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        boolean z7;
        ((o2x0) this.clock).getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        ((a3x0) this.handler).f(2);
        updatePeriods();
        int i2 = this.playbackInfo.e;
        if (i2 == 1 || i2 == 4) {
            return;
        }
        ye10 ye10Var = this.queue.i;
        if (ye10Var == null) {
            scheduleNextWork(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (ye10Var.e) {
            ((o2x0) this.clock).getClass();
            this.rendererPositionElapsedRealtimeUs = tw21.W(SystemClock.elapsedRealtime());
            ye10Var.a.s(this.playbackInfo.s - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            z = true;
            z2 = true;
            int i3 = 0;
            while (true) {
                myi0[] myi0VarArr = this.renderers;
                if (i3 >= myi0VarArr.length) {
                    break;
                }
                myi0 myi0Var = myi0VarArr[i3];
                if (myi0Var.b() == 0) {
                    maybeTriggerOnRendererReadyChanged(i3, false);
                } else {
                    long j = this.rendererPositionUs;
                    long j2 = this.rendererPositionElapsedRealtimeUs;
                    fyi0 fyi0Var = myi0Var.c;
                    fyi0 fyi0Var2 = myi0Var.a;
                    if (myi0.g(fyi0Var2)) {
                        fyi0Var2.render(j, j2);
                    }
                    if (fyi0Var != null && fyi0Var.getState() != 0) {
                        fyi0Var.render(j, j2);
                    }
                    if (z) {
                        fyi0 fyi0Var3 = myi0Var.c;
                        fyi0 fyi0Var4 = myi0Var.a;
                        boolean isEnded = myi0.g(fyi0Var4) ? fyi0Var4.isEnded() : true;
                        if (fyi0Var3 != null && fyi0Var3.getState() != 0) {
                            isEnded &= fyi0Var3.isEnded();
                        }
                        if (isEnded) {
                            z = true;
                            fyi0 c = myi0Var.c(ye10Var);
                            z7 = c != null || c.hasReadStreamToEnd() || c.isReady() || c.isEnded();
                            maybeTriggerOnRendererReadyChanged(i3, z7);
                            z2 = !z2 && z7;
                            if (z7) {
                                maybeThrowRendererStreamError(i3);
                            }
                        }
                    }
                    z = false;
                    fyi0 c2 = myi0Var.c(ye10Var);
                    if (c2 != null) {
                    }
                    maybeTriggerOnRendererReadyChanged(i3, z7);
                    if (z2) {
                    }
                    if (z7) {
                    }
                }
                i3++;
            }
        } else {
            ye10Var.a.j();
            z = true;
            z2 = true;
        }
        long j3 = ye10Var.g.e;
        boolean z8 = z && ye10Var.e && (j3 == -9223372036854775807L || j3 <= this.playbackInfo.s);
        if (z8 && this.pendingPauseAtEndOfPeriod) {
            this.pendingPauseAtEndOfPeriod = false;
            setPlayWhenReadyInternal(false, this.playbackInfo.n, false, 5);
        }
        if (!z8 || !ye10Var.g.j) {
            if (this.playbackInfo.e == 2 && shouldTransitionToReadyState(z2)) {
                setState(3);
                this.pendingRecoverableRendererError = null;
                if (shouldPlayWhenReady()) {
                    updateRebufferingState(false, false);
                    neh nehVar = this.mediaClock;
                    z3 = true;
                    nehVar.y = true;
                    nehVar.a.f();
                    startRenderers();
                }
            } else {
                z3 = true;
                if (this.playbackInfo.e == 3 && (this.enabledRendererCount != 0 ? !z2 : !isTimelineReady())) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.d();
                    }
                    stopRenderers();
                }
            }
            if (this.playbackInfo.e == 2) {
                int i4 = 0;
                while (true) {
                    myi0[] myi0VarArr2 = this.renderers;
                    if (i4 >= myi0VarArr2.length) {
                        break;
                    }
                    if (myi0VarArr2[i4].c(ye10Var) != null) {
                        maybeThrowRendererStreamError(i4);
                    }
                    i4++;
                }
                jxc0 jxc0Var2 = this.playbackInfo;
                if (!jxc0Var2.g && jxc0Var2.r < PLAYBACK_BUFFER_EMPTY_THRESHOLD_US && isLoadingPossible(this.queue.l) && shouldPlayWhenReady()) {
                    long j4 = this.playbackMaybeBecameStuckAtMs;
                    y3c y3cVar = this.clock;
                    if (j4 == -9223372036854775807L) {
                        ((o2x0) y3cVar).getClass();
                        this.playbackMaybeBecameStuckAtMs = SystemClock.elapsedRealtime();
                    } else {
                        ((o2x0) y3cVar).getClass();
                        if (SystemClock.elapsedRealtime() - this.playbackMaybeBecameStuckAtMs >= 4000) {
                            ny61.r("Playback stuck buffering and not loading");
                            return;
                        }
                    }
                    boolean z9 = (shouldPlayWhenReady() || this.playbackInfo.e != 3) ? false : z3;
                    if (this.offloadSchedulingEnabled || !this.requestForRendererSleep || !z9) {
                        z3 = false;
                    }
                    jxc0Var = this.playbackInfo;
                    if (jxc0Var.p != z3) {
                        z4 = z9;
                        z5 = z3;
                        this.playbackInfo = new jxc0(jxc0Var.a, jxc0Var.b, jxc0Var.c, jxc0Var.d, jxc0Var.e, jxc0Var.f, jxc0Var.g, jxc0Var.h, jxc0Var.i, jxc0Var.j, jxc0Var.k, jxc0Var.l, jxc0Var.m, jxc0Var.n, jxc0Var.o, jxc0Var.q, jxc0Var.r, jxc0Var.s, jxc0Var.t, z5);
                        z6 = false;
                    } else {
                        z4 = z9;
                        z5 = z3;
                        z6 = false;
                    }
                    this.requestForRendererSleep = z6;
                    if (!z5 && (i = this.playbackInfo.e) != 4 && (z4 || i == 2 || (i == 3 && this.enabledRendererCount != 0))) {
                        scheduleNextWork(uptimeMillis);
                    }
                    Trace.endSection();
                }
            }
            this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
            if (shouldPlayWhenReady()) {
            }
            if (this.offloadSchedulingEnabled) {
            }
            z3 = false;
            jxc0Var = this.playbackInfo;
            if (jxc0Var.p != z3) {
            }
            this.requestForRendererSleep = z6;
            if (!z5) {
                scheduleNextWork(uptimeMillis);
            }
            Trace.endSection();
        }
        setState(4);
        stopRenderers();
        z3 = true;
        if (this.playbackInfo.e == 2) {
        }
        this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
        if (shouldPlayWhenReady()) {
        }
        if (this.offloadSchedulingEnabled) {
        }
        z3 = false;
        jxc0Var = this.playbackInfo;
        if (jxc0Var.p != z3) {
        }
        this.requestForRendererSleep = z6;
        if (!z5) {
        }
        Trace.endSection();
    }

    private void enableRenderer(ye10 ye10Var, int i, boolean z, long j) throws ExoPlaybackException {
        myi0 myi0Var = this.renderers[i];
        if (myi0Var.f()) {
            return;
        }
        boolean z2 = ye10Var == this.queue.i;
        y001 y001Var = ye10Var.o;
        lyi0 lyi0Var = y001Var.b[i];
        loo looVar = y001Var.c[i];
        boolean z3 = shouldPlayWhenReady() && this.playbackInfo.e == 3;
        boolean z4 = !z && z3;
        this.enabledRendererCount++;
        xyl0 xyl0Var = ye10Var.c[i];
        long j2 = this.rendererPositionUs;
        long j3 = ye10Var.p;
        sf10 sf10Var = ye10Var.g.a;
        neh nehVar = this.mediaClock;
        fyi0 fyi0Var = myi0Var.c;
        int length = looVar != null ? looVar.length() : 0;
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[length];
        for (int i2 = 0; i2 < length; i2++) {
            looVar.getClass();
            aVarArr[i2] = looVar.getFormat(i2);
        }
        int i3 = myi0Var.d;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            myi0Var.e = true;
            myi0Var.a.enable(lyi0Var, aVarArr, xyl0Var, j2, z4, z2, j, j3, sf10Var);
            nehVar.a(myi0Var.a);
        } else {
            myi0Var.f = true;
            fyi0Var.getClass();
            fyi0Var.enable(lyi0Var, aVarArr, xyl0Var, j2, z4, z2, j, j3, sf10Var);
            nehVar.a(fyi0Var);
        }
        j jVar = new j(this);
        fyi0 c = myi0Var.c(ye10Var);
        c.getClass();
        c.handleMessage(11, jVar);
        if (z3 && z2) {
            myi0Var.m();
        }
    }

    private void enableRenderers(boolean[] zArr, long j) throws ExoPlaybackException {
        ExoPlayerImplInternal exoPlayerImplInternal;
        long j2;
        ye10 ye10Var = this.queue.j;
        y001 y001Var = ye10Var.o;
        for (int i = 0; i < this.renderers.length; i++) {
            if (!y001Var.b(i)) {
                this.renderers[i].k();
            }
        }
        int i2 = 0;
        while (i2 < this.renderers.length) {
            if (y001Var.b(i2) && this.renderers[i2].c(ye10Var) == null) {
                exoPlayerImplInternal = this;
                j2 = j;
                exoPlayerImplInternal.enableRenderer(ye10Var, i2, zArr[i2], j2);
            } else {
                exoPlayerImplInternal = this;
                j2 = j;
            }
            i2++;
            this = exoPlayerImplInternal;
            j = j2;
        }
    }

    private ImmutableList<w820> extractMetadataFromTrackSelectionArray(loo[] looVarArr) {
        ImmutableList.a aVar = new ImmutableList.a();
        boolean z = false;
        for (loo looVar : looVarArr) {
            if (looVar != null) {
                w820 w820Var = looVar.getFormat(0).l;
                if (w820Var == null) {
                    aVar.a(new w820(new s820[0]));
                } else {
                    aVar.a(w820Var);
                    z = true;
                }
            }
        }
        return z ? aVar.g() : ImmutableList.p();
    }

    private long getCurrentLiveOffsetUs() {
        jxc0 jxc0Var = this.playbackInfo;
        return getLiveOffsetUs(jxc0Var.a, jxc0Var.b.a, jxc0Var.s);
    }

    private long getLiveOffsetUs(a9z0 a9z0Var, Object obj, long j) {
        a9z0Var.o(this.window, a9z0Var.h(obj, this.period).c);
        z8z0 z8z0Var = this.window;
        if (z8z0Var.e != -9223372036854775807L && z8z0Var.b()) {
            z8z0 z8z0Var2 = this.window;
            if (z8z0Var2.h) {
                return tw21.W(tw21.E(z8z0Var2.f) - this.window.e) - (j + this.period.e);
            }
        }
        return -9223372036854775807L;
    }

    private long getMaxRendererReadPositionUs(ye10 ye10Var) {
        if (ye10Var == null) {
            return 0L;
        }
        long j = ye10Var.p;
        if (!ye10Var.e) {
            return j;
        }
        int i = 0;
        while (true) {
            myi0[] myi0VarArr = this.renderers;
            if (i >= myi0VarArr.length) {
                return j;
            }
            if (myi0VarArr[i].c(ye10Var) != null) {
                fyi0 c = this.renderers[i].c(ye10Var);
                Objects.requireNonNull(c);
                long readingPositionUs = c.getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(readingPositionUs, j);
            }
            i++;
        }
    }

    private Pair<sf10, Long> getPlaceholderFirstMediaPeriodPositionUs(a9z0 a9z0Var) {
        long j = 0;
        if (a9z0Var.q()) {
            return Pair.create(jxc0.u, 0L);
        }
        Pair j2 = a9z0Var.j(this.window, this.period, a9z0Var.a(this.shuffleModeEnabled), -9223372036854775807L);
        sf10 p = this.queue.p(a9z0Var, j2.first, 0L);
        long longValue = ((Long) j2.second).longValue();
        if (p.b()) {
            a9z0Var.h(p.a, this.period);
            if (p.c == this.period.e(p.b)) {
                this.period.g.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(p, Long.valueOf(j));
    }

    private long getTotalBufferedDurationUs(long j) {
        ye10 ye10Var = this.queue.l;
        if (ye10Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.rendererPositionUs - ye10Var.p));
    }

    private void handleAudioFocusPlayerCommandInternal(int i) throws ExoPlaybackException {
        jxc0 jxc0Var = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(jxc0Var.l, i, jxc0Var.n, jxc0Var.m);
    }

    private void handleAudioFocusVolumeMultiplierChange() throws ExoPlaybackException {
        setVolumeInternal(this.volume);
    }

    private void handleContinueLoadingRequested(xe10 xe10Var) {
        af10 af10Var = this.queue;
        ye10 ye10Var = af10Var.l;
        if (ye10Var != null && ye10Var.a == xe10Var) {
            af10Var.m(this.rendererPositionUs);
            maybeContinueLoading();
            return;
        }
        ye10 ye10Var2 = af10Var.m;
        if (ye10Var2 == null || ye10Var2.a != xe10Var) {
            return;
        }
        maybeContinuePreloading();
    }

    private void handleIoException(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        ye10 ye10Var = this.queue.i;
        if (ye10Var != null) {
            exoPlaybackException = exoPlaybackException.b(ye10Var.g.a);
        }
        lk91.f(TAG, "Playback error", exoPlaybackException);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.f(exoPlaybackException);
    }

    private void handleLoadingMediaPeriodChanged(boolean z) {
        ye10 ye10Var = this.queue.l;
        sf10 sf10Var = ye10Var == null ? this.playbackInfo.b : ye10Var.g.a;
        boolean equals = this.playbackInfo.k.equals(sf10Var);
        if (!equals) {
            this.playbackInfo = this.playbackInfo.c(sf10Var);
        }
        jxc0 jxc0Var = this.playbackInfo;
        jxc0Var.q = ye10Var == null ? jxc0Var.s : ye10Var.d();
        this.playbackInfo.r = getTotalBufferedDurationUs();
        if ((!equals || z) && ye10Var != null && ye10Var.e) {
            updateLoadControlTrackSelection(ye10Var.g.a, ye10Var.n, ye10Var.o);
        }
    }

    private void handleLoadingPeriodPrepared(ye10 ye10Var) throws ExoPlaybackException {
        ExoPlayerImplInternal exoPlayerImplInternal;
        if (!ye10Var.e) {
            float f = this.mediaClock.mo496getPlaybackParameters().a;
            jxc0 jxc0Var = this.playbackInfo;
            ye10Var.f(f, jxc0Var.a, jxc0Var.l);
        }
        updateLoadControlTrackSelection(ye10Var.g.a, ye10Var.n, ye10Var.o);
        if (ye10Var == this.queue.i) {
            resetRendererPosition(ye10Var.g.b);
            enableRenderers();
            ye10Var.h = true;
            jxc0 jxc0Var2 = this.playbackInfo;
            sf10 sf10Var = jxc0Var2.b;
            long j = ye10Var.g.b;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var, j, jxc0Var2.c, j, false, 5);
        } else {
            exoPlayerImplInternal = this;
        }
        exoPlayerImplInternal.maybeContinueLoading();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void handleMediaSourceListInfoRefreshed(a9z0 a9z0Var, boolean z) throws ExoPlaybackException {
        a9z0 a9z0Var2;
        sf10 sf10Var;
        boolean z2;
        int i;
        long j;
        int i2;
        boolean z3;
        long j2;
        long maxRendererReadPositionUs;
        int i3;
        ye10 ye10Var;
        boolean z4;
        a9z0 a9z0Var3 = a9z0Var;
        goo resolvePositionForPlaylistChange = resolvePositionForPlaylistChange(a9z0Var3, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        sf10 sf10Var2 = resolvePositionForPlaylistChange.a;
        ?? r12 = resolvePositionForPlaylistChange.c;
        boolean z5 = resolvePositionForPlaylistChange.d;
        long j3 = resolvePositionForPlaylistChange.b;
        boolean z6 = (this.playbackInfo.b.equals(sf10Var2) && j3 == this.playbackInfo.s) ? false : true;
        try {
            if (resolvePositionForPlaylistChange.e) {
                if (this.playbackInfo.e != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
            for (myi0 myi0Var : this.renderers) {
                try {
                    myi0Var.a.setTimeline(a9z0Var3);
                    fyi0 fyi0Var = myi0Var.c;
                    if (fyi0Var != null) {
                        fyi0Var.setTimeline(a9z0Var3);
                    }
                } catch (Throwable th) {
                    th = th;
                    a9z0Var2 = a9z0Var3;
                    sf10Var = sf10Var2;
                    i = 4;
                    j = r12;
                    z3 = false;
                    i2 = -1;
                    z2 = true;
                    jxc0 jxc0Var = this.playbackInfo;
                    a9z0 a9z0Var4 = jxc0Var.a;
                    sf10 sf10Var3 = jxc0Var.b;
                    sf10 sf10Var4 = sf10Var;
                    updatePlaybackSpeedSettingsForNewPeriod(a9z0Var2, sf10Var4, a9z0Var4, sf10Var3, !resolvePositionForPlaylistChange.f ? j3 : -9223372036854775807L, false);
                    if (!z6) {
                    }
                    jxc0 jxc0Var2 = this.playbackInfo;
                    Object obj = jxc0Var2.b.a;
                    a9z0 a9z0Var5 = jxc0Var2.a;
                    if (z6) {
                    }
                    this.playbackInfo = handlePositionDiscontinuity(sf10Var4, j3, j, this.playbackInfo.d, (z6 || !z || a9z0Var5.q() || a9z0Var5.h(obj, this.period).f) ? z3 : z2, a9z0Var2.b(obj) != i2 ? i : 3);
                    resetPendingPauseAtEndOfPeriod();
                    resolvePendingMessagePositions(a9z0Var2, this.playbackInfo.a);
                    this.playbackInfo = this.playbackInfo.i(a9z0Var2);
                    if (!a9z0Var2.q()) {
                    }
                    handleLoadingMediaPeriodChanged(z3);
                    ((a3x0) this.handler).g(2);
                    throw th;
                }
            }
            try {
                if (z6) {
                    i3 = 2;
                    i = 4;
                    j = r12;
                    z4 = false;
                    z4 = false;
                    i2 = -1;
                    z2 = true;
                    if (!a9z0Var3.q()) {
                        for (ye10 ye10Var2 = this.queue.i; ye10Var2 != null; ye10Var2 = ye10Var2.m) {
                            if (ye10Var2.g.a.equals(sf10Var2)) {
                                ye10Var2.g = this.queue.h(a9z0Var3, ye10Var2.g);
                                ye10Var2.k();
                            }
                        }
                        j3 = seekToPeriodPosition(sf10Var2, j3, z5);
                    }
                } else {
                    try {
                        ye10 ye10Var3 = this.queue.j;
                        j2 = 0;
                        maxRendererReadPositionUs = ye10Var3 == null ? 0L : getMaxRendererReadPositionUs(ye10Var3);
                        if (areRenderersPrewarming() && (ye10Var = this.queue.k) != null) {
                            j2 = getMaxRendererReadPositionUs(ye10Var);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        i = 4;
                        try {
                            i3 = 2;
                            j = r12;
                            r12 = 0;
                            z4 = false;
                            z4 = false;
                            z4 = false;
                            i2 = -1;
                            z2 = true;
                        } catch (Throwable th3) {
                            th = th3;
                            a9z0Var3 = a9z0Var;
                            j = r12;
                            r12 = 0;
                            i2 = -1;
                            z2 = true;
                            a9z0Var2 = a9z0Var3;
                            sf10Var = sf10Var2;
                            z3 = r12;
                            jxc0 jxc0Var3 = this.playbackInfo;
                            a9z0 a9z0Var42 = jxc0Var3.a;
                            sf10 sf10Var32 = jxc0Var3.b;
                            sf10 sf10Var42 = sf10Var;
                            updatePlaybackSpeedSettingsForNewPeriod(a9z0Var2, sf10Var42, a9z0Var42, sf10Var32, !resolvePositionForPlaylistChange.f ? j3 : -9223372036854775807L, false);
                            if (!z6 || j != this.playbackInfo.c) {
                                jxc0 jxc0Var22 = this.playbackInfo;
                                Object obj2 = jxc0Var22.b.a;
                                a9z0 a9z0Var52 = jxc0Var22.a;
                                this.playbackInfo = handlePositionDiscontinuity(sf10Var42, j3, j, this.playbackInfo.d, (z6 || !z || a9z0Var52.q() || a9z0Var52.h(obj2, this.period).f) ? z3 : z2, a9z0Var2.b(obj2) != i2 ? i : 3);
                            }
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(a9z0Var2, this.playbackInfo.a);
                            this.playbackInfo = this.playbackInfo.i(a9z0Var2);
                            if (!a9z0Var2.q()) {
                                this.pendingInitialSeekPosition = null;
                            }
                            handleLoadingMediaPeriodChanged(z3);
                            ((a3x0) this.handler).g(2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        a9z0Var3 = a9z0Var;
                        i = 4;
                        j = r12;
                        r12 = 0;
                        i2 = -1;
                        z2 = true;
                        a9z0Var2 = a9z0Var3;
                        sf10Var = sf10Var2;
                        z3 = r12;
                        jxc0 jxc0Var32 = this.playbackInfo;
                        a9z0 a9z0Var422 = jxc0Var32.a;
                        sf10 sf10Var322 = jxc0Var32.b;
                        sf10 sf10Var422 = sf10Var;
                        updatePlaybackSpeedSettingsForNewPeriod(a9z0Var2, sf10Var422, a9z0Var422, sf10Var322, !resolvePositionForPlaylistChange.f ? j3 : -9223372036854775807L, false);
                        if (!z6) {
                        }
                        jxc0 jxc0Var222 = this.playbackInfo;
                        Object obj22 = jxc0Var222.b.a;
                        a9z0 a9z0Var522 = jxc0Var222.a;
                        if (z6) {
                        }
                        this.playbackInfo = handlePositionDiscontinuity(sf10Var422, j3, j, this.playbackInfo.d, (z6 || !z || a9z0Var522.q() || a9z0Var522.h(obj22, this.period).f) ? z3 : z2, a9z0Var2.b(obj22) != i2 ? i : 3);
                        resetPendingPauseAtEndOfPeriod();
                        resolvePendingMessagePositions(a9z0Var2, this.playbackInfo.a);
                        this.playbackInfo = this.playbackInfo.i(a9z0Var2);
                        if (!a9z0Var2.q()) {
                        }
                        handleLoadingMediaPeriodChanged(z3);
                        ((a3x0) this.handler).g(2);
                        throw th;
                    }
                    try {
                        int s = this.queue.s(a9z0Var, this.rendererPositionUs, maxRendererReadPositionUs, j2);
                        a9z0Var3 = a9z0Var;
                        if ((s & 1) != 0) {
                            seekToCurrentPosition(false);
                        } else if ((s & 2) != 0) {
                            disableAndResetPrewarmingRenderers();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        a9z0Var3 = a9z0Var;
                        a9z0Var2 = a9z0Var3;
                        sf10Var = sf10Var2;
                        z3 = r12;
                        jxc0 jxc0Var322 = this.playbackInfo;
                        a9z0 a9z0Var4222 = jxc0Var322.a;
                        sf10 sf10Var3222 = jxc0Var322.b;
                        sf10 sf10Var4222 = sf10Var;
                        updatePlaybackSpeedSettingsForNewPeriod(a9z0Var2, sf10Var4222, a9z0Var4222, sf10Var3222, !resolvePositionForPlaylistChange.f ? j3 : -9223372036854775807L, false);
                        if (!z6) {
                        }
                        jxc0 jxc0Var2222 = this.playbackInfo;
                        Object obj222 = jxc0Var2222.b.a;
                        a9z0 a9z0Var5222 = jxc0Var2222.a;
                        if (z6) {
                        }
                        this.playbackInfo = handlePositionDiscontinuity(sf10Var4222, j3, j, this.playbackInfo.d, (z6 || !z || a9z0Var5222.q() || a9z0Var5222.h(obj222, this.period).f) ? z3 : z2, a9z0Var2.b(obj222) != i2 ? i : 3);
                        resetPendingPauseAtEndOfPeriod();
                        resolvePendingMessagePositions(a9z0Var2, this.playbackInfo.a);
                        this.playbackInfo = this.playbackInfo.i(a9z0Var2);
                        if (!a9z0Var2.q()) {
                        }
                        handleLoadingMediaPeriodChanged(z3);
                        ((a3x0) this.handler).g(2);
                        throw th;
                    }
                }
                jxc0 jxc0Var4 = this.playbackInfo;
                updatePlaybackSpeedSettingsForNewPeriod(a9z0Var3, sf10Var2, jxc0Var4.a, jxc0Var4.b, resolvePositionForPlaylistChange.f ? j3 : -9223372036854775807L, false);
                a9z0 a9z0Var6 = a9z0Var3;
                if (z6 || j != this.playbackInfo.c) {
                    jxc0 jxc0Var5 = this.playbackInfo;
                    Object obj3 = jxc0Var5.b.a;
                    a9z0 a9z0Var7 = jxc0Var5.a;
                    this.playbackInfo = handlePositionDiscontinuity(sf10Var2, j3, j, this.playbackInfo.d, (!z6 || !z || a9z0Var7.q() || a9z0Var7.h(obj3, this.period).f) ? z4 : z2, a9z0Var6.b(obj3) == i2 ? i : 3);
                }
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(a9z0Var6, this.playbackInfo.a);
                this.playbackInfo = this.playbackInfo.i(a9z0Var6);
                if (!a9z0Var6.q()) {
                    this.pendingInitialSeekPosition = null;
                }
                handleLoadingMediaPeriodChanged(z4);
                ((a3x0) this.handler).g(i3);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            a9z0Var2 = a9z0Var3;
            sf10Var = sf10Var2;
            z2 = true;
            i = 4;
            j = r12;
            i2 = -1;
            z3 = false;
        }
    }

    private void handlePeriodPrepared(xe10 xe10Var) throws ExoPlaybackException {
        ye10 ye10Var;
        af10 af10Var = this.queue;
        ye10 ye10Var2 = af10Var.l;
        int i = 0;
        if (ye10Var2 != null && ye10Var2.a == xe10Var) {
            ye10Var2.getClass();
            handleLoadingPeriodPrepared(ye10Var2);
            return;
        }
        while (true) {
            if (i >= af10Var.q.size()) {
                ye10Var = null;
                break;
            }
            ye10Var = (ye10) af10Var.q.get(i);
            if (ye10Var.a == xe10Var) {
                break;
            } else {
                i++;
            }
        }
        if (ye10Var != null) {
            d6z.x(!ye10Var.e);
            float f = this.mediaClock.mo496getPlaybackParameters().a;
            jxc0 jxc0Var = this.playbackInfo;
            ye10Var.f(f, jxc0Var.a, jxc0Var.l);
            ye10 ye10Var3 = this.queue.m;
            if (ye10Var3 == null || ye10Var3.a != xe10Var) {
                return;
            }
            maybeContinuePreloading();
        }
    }

    private void handlePlaybackParameters(lxc0 lxc0Var, float f, boolean z, boolean z2) throws ExoPlaybackException {
        if (z) {
            if (z2) {
                this.playbackInfoUpdate.a(1);
            }
            this.playbackInfo = this.playbackInfo.g(lxc0Var);
        }
        updateTrackSelectionPlaybackSpeed(lxc0Var.a);
        for (myi0 myi0Var : this.renderers) {
            float f2 = lxc0Var.a;
            myi0Var.a.setPlaybackSpeed(f, f2);
            fyi0 fyi0Var = myi0Var.c;
            if (fyi0Var != null) {
                fyi0Var.setPlaybackSpeed(f, f2);
            }
        }
    }

    private jxc0 handlePositionDiscontinuity(sf10 sf10Var, long j, long j2, long j3, boolean z, int i) {
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.s && sf10Var.equals(this.playbackInfo.b)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        jxc0 jxc0Var = this.playbackInfo;
        yzz0 yzz0Var = jxc0Var.h;
        y001 y001Var = jxc0Var.i;
        List list = jxc0Var.j;
        if (this.mediaSourceList.k) {
            ye10 ye10Var = this.queue.i;
            yzz0Var = ye10Var == null ? yzz0.d : ye10Var.n;
            y001Var = ye10Var == null ? this.emptyTrackSelectorResult : ye10Var.o;
            list = extractMetadataFromTrackSelectionArray(y001Var.c);
            if (ye10Var != null) {
                ze10 ze10Var = ye10Var.g;
                if (ze10Var.c != j2) {
                    ye10Var.g = ze10Var.a(j2);
                }
            }
            maybeUpdateOffloadScheduling();
        } else if (!sf10Var.equals(jxc0Var.b)) {
            yzz0Var = yzz0.d;
            y001Var = this.emptyTrackSelectorResult;
            list = ImmutableList.p();
        }
        yzz0 yzz0Var2 = yzz0Var;
        y001 y001Var2 = y001Var;
        List list2 = list;
        if (z) {
            eoo eooVar = this.playbackInfoUpdate;
            if (!eooVar.d || eooVar.e == 5) {
                eooVar.a = true;
                eooVar.d = true;
                eooVar.e = i;
            } else {
                d6z.l(i == 5);
            }
        }
        return this.playbackInfo.d(sf10Var, j, j2, j3, getTotalBufferedDurationUs(), yzz0Var2, y001Var2, list2);
    }

    private boolean hasReadingPeriodFinishedReading() {
        ye10 ye10Var = this.queue.j;
        if (ye10Var.e) {
            int i = 0;
            while (true) {
                myi0[] myi0VarArr = this.renderers;
                if (i >= myi0VarArr.length) {
                    return true;
                }
                myi0 myi0Var = myi0VarArr[i];
                if (!myi0Var.d(ye10Var, myi0Var.a) || !myi0Var.d(ye10Var, myi0Var.c)) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z, sf10 sf10Var, long j, sf10 sf10Var2, y8z0 y8z0Var, long j2) {
        if (!z && j == j2) {
            Object obj = sf10Var.a;
            int i = sf10Var.b;
            if (obj.equals(sf10Var2.a)) {
                if (sf10Var.b()) {
                    y8z0Var.g(i);
                }
                if (sf10Var2.b()) {
                    y8z0Var.g(sf10Var2.b);
                }
            }
        }
        return false;
    }

    private boolean isLoadingPossible(ye10 ye10Var) {
        if (ye10Var == null) {
            return false;
        }
        try {
            xe10 xe10Var = ye10Var.a;
            if (ye10Var.e) {
                for (xyl0 xyl0Var : ye10Var.c) {
                    if (xyl0Var != null) {
                        xyl0Var.b();
                    }
                }
            } else {
                xe10Var.j();
            }
            return (!ye10Var.e ? 0L : xe10Var.i()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    private boolean isTimelineReady() {
        ye10 ye10Var = this.queue.i;
        long j = ye10Var.g.e;
        if (ye10Var.e) {
            return j == -9223372036854775807L || this.playbackInfo.s < j || !shouldPlayWhenReady();
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(jxc0 jxc0Var, y8z0 y8z0Var) {
        sf10 sf10Var = jxc0Var.b;
        a9z0 a9z0Var = jxc0Var.a;
        return a9z0Var.q() || a9z0Var.h(sf10Var.a, y8z0Var).f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$maybeTriggerOnRendererReadyChanged$1(final int i, final boolean z) {
        b32 b32Var = this.analyticsCollector;
        final int trackType = this.renderers[i].a.getTrackType();
        j5h j5hVar = (j5h) b32Var;
        final h42 e = j5hVar.e();
        j5hVar.f(e, 1033, new ruy() { // from class: s4h
            @Override // defpackage.ruy
            public final void invoke(Object obj) {
                ((j42) obj).onRendererReadyChanged(h42.this, i, trackType, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$release$0() {
        return Boolean.valueOf(this.released);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$2(yyc0 yyc0Var) {
        try {
            deliverMessage(yyc0Var);
        } catch (ExoPlaybackException e) {
            lk91.f(TAG, "Unexpected error delivering message on external thread.", e);
            ny61.j(e);
        }
    }

    private void maybeContinueLoading() {
        boolean shouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = shouldContinueLoading;
        if (shouldContinueLoading) {
            ye10 ye10Var = this.queue.l;
            ye10Var.getClass();
            wzy wzyVar = new wzy();
            wzyVar.a = this.rendererPositionUs - ye10Var.p;
            float f = this.mediaClock.mo496getPlaybackParameters().a;
            d6z.l(f > 0.0f || f == -3.4028235E38f);
            wzyVar.b = f;
            long j = this.lastRebufferRealtimeMs;
            d6z.l(j >= 0 || j == -9223372036854775807L);
            wzyVar.c = j;
            xzy xzyVar = new xzy(wzyVar);
            d6z.x(ye10Var.m == null);
            ye10Var.a.n(xzyVar);
        }
        updateIsLoading();
    }

    private void maybeContinuePreloading() {
        this.queue.k();
        ye10 ye10Var = this.queue.m;
        if (ye10Var != null) {
            xe10 xe10Var = ye10Var.a;
            if ((!ye10Var.d || ye10Var.e) && !xe10Var.isLoading()) {
                if (this.loadControl.shouldContinuePreloading(this.playbackInfo.a, ye10Var.g.a, ye10Var.e ? xe10Var.g() : 0L)) {
                    if (!ye10Var.d) {
                        long j = ye10Var.g.b;
                        ye10Var.d = true;
                        xe10Var.l(this, j);
                        return;
                    }
                    wzy wzyVar = new wzy();
                    wzyVar.a = this.rendererPositionUs - ye10Var.p;
                    float f = this.mediaClock.mo496getPlaybackParameters().a;
                    d6z.l(f > 0.0f || f == -3.4028235E38f);
                    wzyVar.b = f;
                    long j2 = this.lastRebufferRealtimeMs;
                    d6z.l(j2 >= 0 || j2 == -9223372036854775807L);
                    wzyVar.c = j2;
                    xzy xzyVar = new xzy(wzyVar);
                    d6z.x(ye10Var.m == null);
                    xe10Var.n(xzyVar);
                }
            }
        }
    }

    private void maybeHandlePrewarmingTransition() throws ExoPlaybackException {
        for (myi0 myi0Var : this.renderers) {
            int i = myi0Var.d;
            if (i == 3 || i == 4) {
                boolean z = i == 4;
                fyi0 fyi0Var = myi0Var.a;
                fyi0 fyi0Var2 = myi0Var.c;
                if (z) {
                    fyi0Var2.getClass();
                    fyi0Var2.handleMessage(17, fyi0Var);
                } else {
                    fyi0Var2.getClass();
                    fyi0Var.handleMessage(17, fyi0Var2);
                }
                myi0Var.d = myi0Var.d == 4 ? 0 : 1;
            } else if (i == 2) {
                myi0Var.d = 0;
            }
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        eoo eooVar = this.playbackInfoUpdate;
        jxc0 jxc0Var = this.playbackInfo;
        boolean z = eooVar.a | (eooVar.b != jxc0Var);
        eooVar.a = z;
        eooVar.b = jxc0Var;
        if (z) {
            f fVar = ((wno) this.playbackInfoUpdateListener).b;
            fVar.j.e(new wqj(29, fVar, eooVar));
            this.playbackInfoUpdate = new eoo(this.playbackInfo);
        }
    }

    private void maybePrewarmRenderers() throws ExoPlaybackException {
        ExoPlayerImplInternal exoPlayerImplInternal;
        int i;
        ye10 ye10Var = this.queue.k;
        if (ye10Var == null) {
            return;
        }
        y001 y001Var = ye10Var.o;
        int i2 = 0;
        while (i2 < this.renderers.length) {
            if (y001Var.b(i2)) {
                myi0 myi0Var = this.renderers[i2];
                if (myi0Var.c != null && !myi0Var.e()) {
                    myi0 myi0Var2 = this.renderers[i2];
                    d6z.x(!myi0Var2.e());
                    if (myi0.g(myi0Var2.a)) {
                        i = 3;
                    } else {
                        fyi0 fyi0Var = myi0Var2.c;
                        i = (fyi0Var == null || !myi0.g(fyi0Var)) ? 2 : 4;
                    }
                    myi0Var2.d = i;
                    exoPlayerImplInternal = this;
                    exoPlayerImplInternal.enableRenderer(ye10Var, i2, false, ye10Var.e());
                    i2++;
                    this = exoPlayerImplInternal;
                }
            }
            exoPlayerImplInternal = this;
            i2++;
            this = exoPlayerImplInternal;
        }
        ExoPlayerImplInternal exoPlayerImplInternal2 = this;
        if (exoPlayerImplInternal2.areRenderersPrewarming()) {
            exoPlayerImplInternal2.prewarmingMediaPeriodDiscontinuity = ye10Var.a.f();
            if (ye10Var.g()) {
                return;
            }
            exoPlayerImplInternal2.queue.n(ye10Var);
            exoPlayerImplInternal2.handleLoadingMediaPeriodChanged(false);
            exoPlayerImplInternal2.maybeContinueLoading();
        }
    }

    private void maybeThrowRendererStreamError(int i) throws IOException, ExoPlaybackException {
        myi0 myi0Var = this.renderers[i];
        try {
            ye10 ye10Var = this.queue.i;
            ye10Var.getClass();
            fyi0 c = myi0Var.c(ye10Var);
            c.getClass();
            c.maybeThrowStreamError();
        } catch (IOException | RuntimeException e) {
            int trackType = myi0Var.a.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e;
            }
            y001 y001Var = this.queue.i.o;
            lk91.f(TAG, "Disabling track due to error: ".concat(androidx.media3.common.a.c(y001Var.c[i].getSelectedFormat())), e);
            y001 y001Var2 = new y001((lyi0[]) y001Var.b.clone(), (loo[]) y001Var.c.clone(), y001Var.d, y001Var.e);
            y001Var2.b[i] = null;
            y001Var2.c[i] = null;
            disableRenderer(i);
            ye10 ye10Var2 = this.queue.i;
            ye10Var2.a(y001Var2, this.playbackInfo.s, false, new boolean[ye10Var2.j.length]);
        }
    }

    private void maybeTriggerOnRendererReadyChanged(final int i, final boolean z) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i] != z) {
            zArr[i] = z;
            ((a3x0) this.applicationLooperHandler).e(new Runnable() { // from class: androidx.media3.exoplayer.h
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal.this.lambda$maybeTriggerOnRendererReadyChanged$1(i, z);
                }
            });
        }
    }

    private void maybeTriggerPendingMessages(long j, long j2) throws ExoPlaybackException {
        if (this.pendingMessages.isEmpty() || this.playbackInfo.b.b()) {
            return;
        }
        if (this.deliverPendingMessageAtStartPositionRequired) {
            this.deliverPendingMessageAtStartPositionRequired = false;
        }
        jxc0 jxc0Var = this.playbackInfo;
        jxc0Var.a.b(jxc0Var.b.a);
        int min = Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        if (min > 0 && this.pendingMessages.get(min - 1) != null) {
            ny61.u();
        } else if (min >= this.pendingMessages.size() || this.pendingMessages.get(min) == null) {
            this.nextPendingMessageIndexHint = min;
        } else {
            ny61.u();
        }
    }

    private boolean maybeUpdateLoadingPeriod() throws ExoPlaybackException {
        ye10 ye10Var;
        this.queue.m(this.rendererPositionUs);
        af10 af10Var = this.queue;
        ye10 ye10Var2 = af10Var.l;
        boolean z = false;
        if (ye10Var2 == null || (!ye10Var2.g.j && ye10Var2.g() && af10Var.l.g.e != -9223372036854775807L && af10Var.n < 100)) {
            af10 af10Var2 = this.queue;
            long j = this.rendererPositionUs;
            jxc0 jxc0Var = this.playbackInfo;
            ye10 ye10Var3 = af10Var2.l;
            ze10 d = ye10Var3 == null ? af10Var2.d(jxc0Var.a, jxc0Var.b, jxc0Var.c, jxc0Var.s) : af10Var2.c(jxc0Var.a, ye10Var3, j);
            if (d != null) {
                af10 af10Var3 = this.queue;
                ye10 ye10Var4 = af10Var3.l;
                long j2 = ye10Var4 == null ? 1000000000000L : (ye10Var4.p + ye10Var4.g.e) - d.b;
                int i = 0;
                while (true) {
                    if (i >= af10Var3.q.size()) {
                        ye10Var = null;
                        break;
                    }
                    ze10 ze10Var = ((ye10) af10Var3.q.get(i)).g;
                    long j3 = ze10Var.e;
                    long j4 = d.e;
                    if ((j3 == -9223372036854775807L || j3 == j4) && ze10Var.b == d.b && ze10Var.a.equals(d.a)) {
                        ye10Var = (ye10) af10Var3.q.remove(i);
                        break;
                    }
                    i++;
                }
                if (ye10Var == null) {
                    ye10Var = ((ExoPlayerImplInternal) af10Var3.e.b).createMediaPeriodHolder(d, j2);
                } else {
                    ye10Var.g = d;
                    ye10Var.p = j2;
                }
                ye10 ye10Var5 = af10Var3.l;
                if (ye10Var5 == null) {
                    af10Var3.i = ye10Var;
                    af10Var3.j = ye10Var;
                    af10Var3.k = ye10Var;
                } else if (ye10Var != ye10Var5.m) {
                    ye10Var5.b();
                    ye10Var5.m = ye10Var;
                    ye10Var5.c();
                }
                af10Var3.o = null;
                af10Var3.l = ye10Var;
                af10Var3.n++;
                af10Var3.l();
                if (!ye10Var.d) {
                    long j5 = d.b;
                    ye10Var.d = true;
                    ye10Var.a.l(this, j5);
                } else if (ye10Var.e) {
                    ((a3x0) this.handler).b(8, ye10Var.a).b();
                }
                if (this.queue.i == ye10Var) {
                    resetRendererPosition(d.b);
                }
                handleLoadingMediaPeriodChanged(false);
                z = true;
            }
        }
        if (!this.shouldContinueLoading) {
            maybeContinueLoading();
            return z;
        }
        this.shouldContinueLoading = isLoadingPossible(this.queue.l);
        updateIsLoading();
        return z;
    }

    private void maybeUpdateOffloadScheduling() {
        boolean z;
        af10 af10Var = this.queue;
        ye10 ye10Var = af10Var.i;
        if (ye10Var == af10Var.j && ye10Var != null) {
            y001 y001Var = ye10Var.o;
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.renderers.length) {
                    z = true;
                    break;
                }
                if (y001Var.b(i)) {
                    if (this.renderers[i].a.getTrackType() != 1) {
                        z = false;
                        break;
                    } else if (y001Var.b[i].a != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            setOffloadSchedulingEnabled(z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeUpdatePlayingPeriod() throws ExoPlaybackException {
        boolean z;
        ExoPlayerImplInternal exoPlayerImplInternal;
        boolean z2 = false;
        while (this.shouldAdvancePlayingPeriod()) {
            if (z2) {
                this.maybeNotifyPlaybackInfoChanged();
            }
            this.isPrewarmingDisabledUntilNextTransition = false;
            ye10 a = this.queue.a();
            a.getClass();
            if (this.playbackInfo.b.a.equals(a.g.a.a)) {
                sf10 sf10Var = this.playbackInfo.b;
                if (sf10Var.b == -1) {
                    sf10 sf10Var2 = a.g.a;
                    if (sf10Var2.b == -1 && sf10Var.e != sf10Var2.e) {
                        z = true;
                        ze10 ze10Var = a.g;
                        sf10 sf10Var3 = ze10Var.a;
                        long j = ze10Var.b;
                        exoPlayerImplInternal = this;
                        exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var3, j, ze10Var.c, j, !z, 0);
                        exoPlayerImplInternal.resetPendingPauseAtEndOfPeriod();
                        exoPlayerImplInternal.updatePlaybackPositions();
                        if (exoPlayerImplInternal.areRenderersPrewarming() && a == exoPlayerImplInternal.queue.k) {
                            exoPlayerImplInternal.maybeHandlePrewarmingTransition();
                        }
                        if (exoPlayerImplInternal.playbackInfo.e != 3) {
                            exoPlayerImplInternal.startRenderers();
                        }
                        exoPlayerImplInternal.allowRenderersToRenderStartOfStreams();
                        z2 = true;
                        this = exoPlayerImplInternal;
                    }
                }
            }
            z = false;
            ze10 ze10Var2 = a.g;
            sf10 sf10Var32 = ze10Var2.a;
            long j2 = ze10Var2.b;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var32, j2, ze10Var2.c, j2, !z, 0);
            exoPlayerImplInternal.resetPendingPauseAtEndOfPeriod();
            exoPlayerImplInternal.updatePlaybackPositions();
            if (exoPlayerImplInternal.areRenderersPrewarming()) {
                exoPlayerImplInternal.maybeHandlePrewarmingTransition();
            }
            if (exoPlayerImplInternal.playbackInfo.e != 3) {
            }
            exoPlayerImplInternal.allowRenderersToRenderStartOfStreams();
            z2 = true;
            this = exoPlayerImplInternal;
        }
    }

    private void maybeUpdatePreloadPeriods(boolean z) {
        this.preloadConfiguration.getClass();
    }

    private void maybeUpdatePrewarmingPeriod() throws ExoPlaybackException {
        af10 af10Var;
        ye10 ye10Var;
        ye10 ye10Var2;
        if (this.pendingPauseAtEndOfPeriod || !this.hasSecondaryRenderers || this.isPrewarmingDisabledUntilNextTransition || areRenderersPrewarming() || (ye10Var = (af10Var = this.queue).k) == null || ye10Var != af10Var.j || (ye10Var2 = ye10Var.m) == null || !ye10Var2.e) {
            return;
        }
        af10Var.k = ye10Var2;
        af10Var.l();
        d6z.z(af10Var.k);
        maybePrewarmRenderers();
    }

    private void maybeUpdateReadingPeriod() throws ExoPlaybackException {
        int i;
        ye10 ye10Var = this.queue.j;
        if (ye10Var == null) {
            return;
        }
        if (ye10Var.m == null || this.pendingPauseAtEndOfPeriod) {
            if (ye10Var.g.j || this.pendingPauseAtEndOfPeriod) {
                for (myi0 myi0Var : this.renderers) {
                    if (myi0Var.c(ye10Var) != null) {
                        fyi0 c = myi0Var.c(ye10Var);
                        c.getClass();
                        if (c.hasReadStreamToEnd()) {
                            long j = ye10Var.g.e;
                            long j2 = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : ye10Var.p + j;
                            fyi0 c2 = myi0Var.c(ye10Var);
                            c2.getClass();
                            myi0.l(c2, j2);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (hasReadingPeriodFinishedReading()) {
            if (areRenderersPrewarming()) {
                af10 af10Var = this.queue;
                if (af10Var.k == af10Var.j) {
                    return;
                }
            }
            ye10 ye10Var2 = ye10Var.m;
            if (ye10Var2.e || this.rendererPositionUs >= ye10Var2.e()) {
                y001 y001Var = ye10Var.o;
                af10 af10Var2 = this.queue;
                ye10 ye10Var3 = af10Var2.k;
                ye10 ye10Var4 = af10Var2.j;
                if (ye10Var3 == ye10Var4) {
                    d6z.z(ye10Var4);
                    af10Var2.k = ye10Var4.m;
                }
                ye10 ye10Var5 = af10Var2.j;
                d6z.z(ye10Var5);
                af10Var2.j = ye10Var5.m;
                af10Var2.l();
                ye10 ye10Var6 = af10Var2.j;
                d6z.z(ye10Var6);
                y001 y001Var2 = ye10Var6.o;
                a9z0 a9z0Var = this.playbackInfo.a;
                updatePlaybackSpeedSettingsForNewPeriod(a9z0Var, ye10Var6.g.a, a9z0Var, ye10Var.g.a, -9223372036854775807L, false);
                if (ye10Var6.e && ((this.hasSecondaryRenderers && this.prewarmingMediaPeriodDiscontinuity != -9223372036854775807L) || ye10Var6.a.f() != -9223372036854775807L)) {
                    this.prewarmingMediaPeriodDiscontinuity = -9223372036854775807L;
                    boolean z = this.hasSecondaryRenderers && !this.isPrewarmingDisabledUntilNextTransition;
                    if (z) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= this.renderers.length) {
                                break;
                            }
                            boolean b = y001Var2.b(i2);
                            loo[] looVarArr = y001Var2.c;
                            if (b && !eh20.a(looVarArr[i2].getSelectedFormat().n, looVarArr[i2].getSelectedFormat().k) && !this.renderers[i2].e()) {
                                z = false;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (!z) {
                        setAllNonPrewarmingRendererStreamsFinal(ye10Var6.e());
                        if (ye10Var6.g()) {
                            return;
                        }
                        this.queue.n(ye10Var6);
                        handleLoadingMediaPeriodChanged(false);
                        maybeContinueLoading();
                        return;
                    }
                }
                for (myi0 myi0Var2 : this.renderers) {
                    long e = ye10Var6.e();
                    fyi0 fyi0Var = myi0Var2.a;
                    int i3 = myi0Var2.b;
                    boolean b2 = y001Var.b(i3);
                    boolean b3 = y001Var2.b(i3);
                    fyi0 fyi0Var2 = myi0Var2.c;
                    if (fyi0Var2 == null || (i = myi0Var2.d) == 3 || (i == 0 && myi0.g(fyi0Var))) {
                        fyi0Var2 = fyi0Var;
                    }
                    if (b2 && !fyi0Var2.isCurrentStreamFinal()) {
                        boolean z2 = fyi0Var.getTrackType() == -2;
                        lyi0 lyi0Var = y001Var.b[i3];
                        lyi0 lyi0Var2 = y001Var2.b[i3];
                        if (!b3 || !Objects.equals(lyi0Var2, lyi0Var) || z2 || myi0Var2.e()) {
                            myi0.l(fyi0Var2, e);
                        }
                    }
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() throws ExoPlaybackException {
        af10 af10Var = this.queue;
        ye10 ye10Var = af10Var.j;
        if (ye10Var == null || af10Var.i == ye10Var || ye10Var.h || !updateRenderersForTransition()) {
            return;
        }
        this.queue.j.h = true;
    }

    private void mediaSourceListUpdateRequestedInternal() throws ExoPlaybackException {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.b(), true);
    }

    private void moveMediaItemsInternal(coo cooVar) throws ExoPlaybackException {
        a9z0 b;
        this.playbackInfoUpdate.a(1);
        jg10 jg10Var = this.mediaSourceList;
        int i = cooVar.a;
        int i2 = cooVar.b;
        int i3 = cooVar.c;
        las0 las0Var = cooVar.d;
        ArrayList arrayList = jg10Var.b;
        d6z.l(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        jg10Var.j = las0Var;
        if (i == i2 || i == i3) {
            b = jg10Var.b();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((hg10) arrayList.get(min)).d;
            tw21.V(arrayList, i, i2, i3);
            while (min <= max) {
                hg10 hg10Var = (hg10) arrayList.get(min);
                hg10Var.d = i4;
                i4 += hg10Var.a.H.b.p();
                min++;
            }
            b = jg10Var.b();
        }
        handleMediaSourceListInfoRefreshed(b, false);
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (ye10 ye10Var = this.queue.i; ye10Var != null; ye10Var = ye10Var.m) {
            for (loo looVar : ye10Var.o.c) {
                if (looVar != null) {
                    looVar.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z) {
        for (ye10 ye10Var = this.queue.i; ye10Var != null; ye10Var = ye10Var.m) {
            for (loo looVar : ye10Var.o.c) {
                if (looVar != null) {
                    looVar.onPlayWhenReadyChanged(z);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (ye10 ye10Var = this.queue.i; ye10Var != null; ye10Var = ye10Var.m) {
            for (loo looVar : ye10Var.o.c) {
                if (looVar != null) {
                    looVar.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() throws ExoPlaybackException {
        this.playbackInfoUpdate.a(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared(this.playerId);
        setState(this.playbackInfo.a.q() ? 4 : 2);
        updatePlayWhenReadyWithAudioFocus();
        jg10 jg10Var = this.mediaSourceList;
        cj01 proxyTransferListener = this.bandwidthMeter.getProxyTransferListener();
        ArrayList arrayList = jg10Var.b;
        d6z.x(!jg10Var.k);
        jg10Var.l = proxyTransferListener;
        for (int i = 0; i < arrayList.size(); i++) {
            hg10 hg10Var = (hg10) arrayList.get(i);
            jg10Var.e(hg10Var);
            jg10Var.g.add(hg10Var);
        }
        jg10Var.k = true;
        ((a3x0) this.handler).g(2);
    }

    private void releaseInternal() {
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            this.loadControl.onReleased(this.playerId);
            vf3 vf3Var = this.audioFocusManager;
            vf3Var.c = null;
            vf3Var.a();
            vf3Var.b(0);
            this.trackSelector.release();
            setState(1);
            this.playbackLooperProvider.a();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.playbackLooperProvider.a();
            synchronized (this) {
                this.released = true;
                notifyAll();
                throw th;
            }
        }
    }

    private void releaseRenderers() {
        for (int i = 0; i < this.renderers.length; i++) {
            this.rendererCapabilities[i].clearListener();
            myi0 myi0Var = this.renderers[i];
            myi0Var.a.release();
            myi0Var.e = false;
            fyi0 fyi0Var = myi0Var.c;
            if (fyi0Var != null) {
                fyi0Var.release();
                myi0Var.f = false;
            }
        }
    }

    private void removeMediaItemsInternal(int i, int i2, las0 las0Var) throws ExoPlaybackException {
        this.playbackInfoUpdate.a(1);
        jg10 jg10Var = this.mediaSourceList;
        jg10Var.getClass();
        d6z.l(i >= 0 && i <= i2 && i2 <= jg10Var.b.size());
        jg10Var.j = las0Var;
        jg10Var.g(i, i2);
        handleMediaSourceListInfoRefreshed(jg10Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void reselectTracksInternal() throws ExoPlaybackException {
        int i;
        int i2;
        float f = this.mediaClock.mo496getPlaybackParameters().a;
        af10 af10Var = this.queue;
        ye10 ye10Var = af10Var.i;
        ye10 ye10Var2 = af10Var.j;
        y001 y001Var = null;
        ye10 ye10Var3 = ye10Var;
        boolean z = true;
        while (ye10Var3 != null && ye10Var3.e) {
            jxc0 jxc0Var = this.playbackInfo;
            y001 j = ye10Var3.j(f, jxc0Var.a, jxc0Var.l);
            y001 y001Var2 = ye10Var3 == this.queue.i ? j : y001Var;
            y001 y001Var3 = ye10Var3.o;
            loo[] looVarArr = j.c;
            if (y001Var3 != null && y001Var3.c.length == looVarArr.length) {
                for (int i3 = 0; i3 < looVarArr.length; i3++) {
                    if (j.a(y001Var3, i3)) {
                    }
                }
                if (ye10Var3 == ye10Var2) {
                    z = false;
                }
                ye10Var3 = ye10Var3.m;
                y001Var = y001Var2;
            }
            af10 af10Var2 = this.queue;
            if (z) {
                ye10 ye10Var4 = af10Var2.i;
                boolean z2 = (af10Var2.n(ye10Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.renderers.length];
                y001Var2.getClass();
                long a = ye10Var4.a(y001Var2, this.playbackInfo.s, z2, zArr);
                jxc0 jxc0Var2 = this.playbackInfo;
                boolean z3 = (jxc0Var2.e == 4 || a == jxc0Var2.s) ? false : true;
                jxc0 jxc0Var3 = this.playbackInfo;
                i = 4;
                this.playbackInfo = handlePositionDiscontinuity(jxc0Var3.b, a, jxc0Var3.c, jxc0Var3.d, z3, 5);
                if (z3) {
                    resetRendererPosition(a);
                }
                disableAndResetPrewarmingRenderers();
                boolean[] zArr2 = new boolean[this.renderers.length];
                int i4 = 0;
                while (true) {
                    myi0[] myi0VarArr = this.renderers;
                    if (i4 >= myi0VarArr.length) {
                        break;
                    }
                    int b = myi0VarArr[i4].b();
                    zArr2[i4] = this.renderers[i4].f();
                    myi0 myi0Var = this.renderers[i4];
                    xyl0 xyl0Var = ye10Var4.c[i4];
                    neh nehVar = this.mediaClock;
                    long j2 = this.rendererPositionUs;
                    boolean z4 = zArr[i4];
                    fyi0 fyi0Var = myi0Var.a;
                    if (myi0.g(fyi0Var)) {
                        if (xyl0Var != fyi0Var.getStream()) {
                            myi0Var.a(fyi0Var, nehVar);
                        } else if (z4) {
                            fyi0Var.resetPosition(j2);
                        }
                    }
                    fyi0 fyi0Var2 = myi0Var.c;
                    if (fyi0Var2 != null && myi0.g(fyi0Var2)) {
                        if (xyl0Var != fyi0Var2.getStream()) {
                            myi0Var.a(fyi0Var2, nehVar);
                        } else if (z4) {
                            fyi0Var2.resetPosition(j2);
                        }
                    }
                    if (b - this.renderers[i4].b() > 0) {
                        maybeTriggerOnRendererReadyChanged(i4, false);
                    }
                    this.enabledRendererCount -= b - this.renderers[i4].b();
                    i4++;
                }
                enableRenderers(zArr2, this.rendererPositionUs);
                ye10Var4.h = true;
            } else {
                i = 4;
                af10Var2.n(ye10Var3);
                if (ye10Var3.e) {
                    long max = Math.max(ye10Var3.g.b, this.rendererPositionUs - ye10Var3.p);
                    if (this.hasSecondaryRenderers && areRenderersPrewarming() && this.queue.k == ye10Var3) {
                        disableAndResetPrewarmingRenderers();
                    }
                    i2 = 4;
                    ye10Var3.a(j, max, false, new boolean[ye10Var3.j.length]);
                    handleLoadingMediaPeriodChanged(true);
                    if (this.playbackInfo.e == i2) {
                        maybeContinueLoading();
                        updatePlaybackPositions();
                        ((a3x0) this.handler).g(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            handleLoadingMediaPeriodChanged(true);
            if (this.playbackInfo.e == i2) {
            }
        }
    }

    private void reselectTracksInternalAndSeek() throws ExoPlaybackException {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r2.equals(r33.playbackInfo.b) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void resetInternal(boolean z, boolean z2, boolean z3, boolean z4) {
        a9z0 a9z0Var;
        sf10 sf10Var;
        ((a3x0) this.handler).f(2);
        this.pendingRecoverableRendererError = null;
        boolean z5 = true;
        updateRebufferingState(false, true);
        neh nehVar = this.mediaClock;
        nehVar.y = false;
        qzt0 qzt0Var = nehVar.a;
        if (qzt0Var.c) {
            qzt0Var.d(qzt0Var.g());
            qzt0Var.c = false;
        }
        this.rendererPositionUs = 1000000000000L;
        try {
            disableRenderers();
        } catch (ExoPlaybackException | RuntimeException e) {
            lk91.f(TAG, "Disable failed.", e);
        }
        if (z) {
            for (myi0 myi0Var : this.renderers) {
                try {
                    myi0Var.k();
                } catch (RuntimeException e2) {
                    lk91.f(TAG, "Reset failed.", e2);
                }
            }
        }
        this.enabledRendererCount = 0;
        jxc0 jxc0Var = this.playbackInfo;
        sf10 sf10Var2 = jxc0Var.b;
        long j = jxc0Var.s;
        long j2 = (this.playbackInfo.b.b() || isUsingPlaceholderPeriod(this.playbackInfo, this.period)) ? this.playbackInfo.c : this.playbackInfo.s;
        if (z2) {
            this.pendingInitialSeekPosition = null;
            Pair<sf10, Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.a);
            sf10Var2 = (sf10) placeholderFirstMediaPeriodPositionUs.first;
            j = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            j2 = -9223372036854775807L;
        }
        z5 = false;
        long j3 = j;
        long j4 = j2;
        this.queue.b();
        this.shouldContinueLoading = false;
        a9z0 a9z0Var2 = this.playbackInfo.a;
        if (z3 && (a9z0Var2 instanceof kzc0)) {
            kzc0 kzc0Var = (kzc0) a9z0Var2;
            las0 las0Var = this.mediaSourceList.j;
            a9z0[] a9z0VarArr = kzc0Var.h;
            a9z0[] a9z0VarArr2 = new a9z0[a9z0VarArr.length];
            for (int i = 0; i < a9z0VarArr.length; i++) {
                a9z0VarArr2[i] = new jzc0(a9z0VarArr[i]);
            }
            a9z0Var = new kzc0(a9z0VarArr2, kzc0Var.i, las0Var);
            if (sf10Var2.b != -1) {
                a9z0Var.h(sf10Var2.a, this.period);
                int i2 = this.period.c;
                z8z0 z8z0Var = this.window;
                a9z0Var.n(i2, z8z0Var, 0L);
                if (z8z0Var.b()) {
                    sf10Var = new sf10(sf10Var2.d, sf10Var2.a);
                    jxc0 jxc0Var2 = this.playbackInfo;
                    int i3 = jxc0Var2.e;
                    ExoPlaybackException exoPlaybackException = !z4 ? null : jxc0Var2.f;
                    yzz0 yzz0Var = !z5 ? yzz0.d : jxc0Var2.h;
                    y001 y001Var = !z5 ? this.emptyTrackSelectorResult : jxc0Var2.i;
                    List p = !z5 ? ImmutableList.p() : jxc0Var2.j;
                    jxc0 jxc0Var3 = this.playbackInfo;
                    this.playbackInfo = new jxc0(a9z0Var, sf10Var, j4, j3, i3, exoPlaybackException, false, yzz0Var, y001Var, p, sf10Var, jxc0Var3.l, jxc0Var3.m, jxc0Var3.n, jxc0Var3.o, j3, 0L, j3, 0L, false);
                    if (z3) {
                        return;
                    }
                    af10 af10Var = this.queue;
                    if (!af10Var.q.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < af10Var.q.size(); i4++) {
                            ((ye10) af10Var.q.get(i4)).i();
                        }
                        af10Var.q = arrayList;
                        af10Var.m = null;
                        af10Var.k();
                    }
                    jg10 jg10Var = this.mediaSourceList;
                    HashMap hashMap = jg10Var.f;
                    for (gg10 gg10Var : hashMap.values()) {
                        try {
                            gg10Var.a.releaseSource(gg10Var.b);
                        } catch (RuntimeException e3) {
                            lk91.f("MediaSourceList", "Failed to release child source.", e3);
                        }
                        uf10 uf10Var = gg10Var.a;
                        fg10 fg10Var = gg10Var.c;
                        uf10Var.removeEventListener(fg10Var);
                        gg10Var.a.removeDrmEventListener(fg10Var);
                    }
                    hashMap.clear();
                    jg10Var.g.clear();
                    jg10Var.k = false;
                    return;
                }
            }
        } else {
            a9z0Var = a9z0Var2;
        }
        sf10Var = sf10Var2;
        jxc0 jxc0Var22 = this.playbackInfo;
        int i32 = jxc0Var22.e;
        if (!z4) {
        }
        yzz0 yzz0Var2 = !z5 ? yzz0.d : jxc0Var22.h;
        y001 y001Var2 = !z5 ? this.emptyTrackSelectorResult : jxc0Var22.i;
        List p2 = !z5 ? ImmutableList.p() : jxc0Var22.j;
        jxc0 jxc0Var32 = this.playbackInfo;
        this.playbackInfo = new jxc0(a9z0Var, sf10Var, j4, j3, i32, exoPlaybackException, false, yzz0Var2, y001Var2, p2, sf10Var, jxc0Var32.l, jxc0Var32.m, jxc0Var32.n, jxc0Var32.o, j3, 0L, j3, 0L, false);
        if (z3) {
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        ye10 ye10Var = this.queue.i;
        this.pendingPauseAtEndOfPeriod = ye10Var != null && ye10Var.g.i && this.pauseAtEndOfWindow;
    }

    private void resetRendererPosition(long j) throws ExoPlaybackException {
        ye10 ye10Var = this.queue.i;
        long j2 = j + (ye10Var == null ? 1000000000000L : ye10Var.p);
        this.rendererPositionUs = j2;
        this.mediaClock.a.d(j2);
        for (myi0 myi0Var : this.renderers) {
            long j3 = this.rendererPositionUs;
            fyi0 c = myi0Var.c(ye10Var);
            if (c != null) {
                c.resetPosition(j3);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(a9z0 a9z0Var, doo dooVar, z8z0 z8z0Var, y8z0 y8z0Var) {
        throw null;
    }

    private static boolean resolvePendingMessagePosition(doo dooVar, a9z0 a9z0Var, a9z0 a9z0Var2, int i, boolean z, z8z0 z8z0Var, y8z0 y8z0Var) {
        throw null;
    }

    private void resolvePendingMessagePositions(a9z0 a9z0Var, a9z0 a9z0Var2) {
        if (a9z0Var.q() && a9z0Var2.q()) {
            return;
        }
        int size = this.pendingMessages.size() - 1;
        while (true) {
            ArrayList<doo> arrayList = this.pendingMessages;
            if (size < 0) {
                Collections.sort(arrayList);
                return;
            }
            a9z0 a9z0Var3 = a9z0Var;
            a9z0 a9z0Var4 = a9z0Var2;
            if (!resolvePendingMessagePosition(arrayList.get(size), a9z0Var3, a9z0Var4, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size);
                throw null;
            }
            size--;
            a9z0Var = a9z0Var3;
            a9z0Var2 = a9z0Var4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static goo resolvePositionForPlaylistChange(a9z0 a9z0Var, jxc0 jxc0Var, hoo hooVar, af10 af10Var, int i, boolean z, z8z0 z8z0Var, y8z0 y8z0Var) {
        int i2;
        long j;
        long j2;
        long j3;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        long j4;
        int i4;
        boolean z5;
        a9z0 a9z0Var2;
        y8z0 y8z0Var2;
        long j5;
        sf10 sf10Var;
        long j6;
        int i5;
        boolean z6;
        long longValue;
        int i6;
        boolean z7;
        boolean z8;
        if (a9z0Var.q()) {
            return new goo(jxc0.u, 0L, -9223372036854775807L, false, true, false);
        }
        sf10 sf10Var2 = jxc0Var.b;
        Object obj = sf10Var2.a;
        boolean isUsingPlaceholderPeriod = isUsingPlaceholderPeriod(jxc0Var, y8z0Var);
        long j7 = (jxc0Var.b.b() || isUsingPlaceholderPeriod) ? jxc0Var.c : jxc0Var.s;
        boolean z9 = false;
        if (hooVar != null) {
            i2 = -1;
            j = -9223372036854775807L;
            Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(a9z0Var, hooVar, true, i, z, z8z0Var, y8z0Var);
            if (resolveSeekPositionUs == null) {
                i6 = a9z0Var.a(z);
                longValue = j7;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                long j8 = hooVar.c;
                Object obj2 = resolveSeekPositionUs.first;
                if (j8 == -9223372036854775807L) {
                    i6 = a9z0Var.h(obj2, y8z0Var).c;
                    longValue = j7;
                    z6 = false;
                } else {
                    obj = obj2;
                    z6 = true;
                    longValue = ((Long) resolveSeekPositionUs.second).longValue();
                    i6 = -1;
                }
                z7 = jxc0Var.e == 4;
                z8 = false;
            }
            i3 = i6;
            j3 = longValue;
            z4 = z6;
            z2 = z7;
            z3 = z8;
        } else {
            i2 = -1;
            j = -9223372036854775807L;
            if (jxc0Var.a.q()) {
                i3 = a9z0Var.a(z);
            } else if (a9z0Var.b(obj) == -1) {
                int resolveSubsequentPeriod = resolveSubsequentPeriod(z8z0Var, y8z0Var, i, z, obj, jxc0Var.a, a9z0Var);
                if (resolveSubsequentPeriod == -1) {
                    i4 = a9z0Var.a(z);
                    z5 = true;
                } else {
                    i4 = resolveSubsequentPeriod;
                    z5 = false;
                }
                i3 = i4;
                obj = obj;
                j3 = j7;
                z3 = z5;
                z2 = false;
                z4 = false;
            } else {
                if (j7 != -9223372036854775807L) {
                    if (isUsingPlaceholderPeriod) {
                        jxc0Var.a.h(sf10Var2.a, y8z0Var);
                        j2 = 0;
                        if (jxc0Var.a.n(y8z0Var.c, z8z0Var, 0L).m == jxc0Var.a.b(sf10Var2.a)) {
                            Pair j9 = a9z0Var.j(z8z0Var, y8z0Var, a9z0Var.h(obj, y8z0Var).c, y8z0Var.e + j7);
                            obj = j9.first;
                            j4 = ((Long) j9.second).longValue();
                        } else {
                            obj = obj;
                            j4 = j7;
                        }
                        j3 = j4;
                        i3 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        j2 = 0;
                        obj = obj;
                        j3 = j7;
                        i3 = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                    if (i3 == i2) {
                        y8z0Var2 = y8z0Var;
                        Pair j10 = a9z0Var.j(z8z0Var, y8z0Var2, i3, -9223372036854775807L);
                        a9z0Var2 = a9z0Var;
                        obj = j10.first;
                        j3 = ((Long) j10.second).longValue();
                        j5 = j;
                    } else {
                        a9z0Var2 = a9z0Var;
                        y8z0Var2 = y8z0Var;
                        j5 = j3;
                    }
                    sf10 p = af10Var.p(a9z0Var2, obj, j3);
                    int i7 = p.e;
                    boolean z10 = i7 != i2 || ((i5 = sf10Var2.e) != i2 && i7 >= i5);
                    if (sf10Var2.a.equals(obj) && !sf10Var2.b() && !p.b() && z10) {
                        z9 = true;
                    }
                    long j11 = j2;
                    sf10Var = p;
                    boolean isIgnorableServerSideAdInsertionPeriodChange = isIgnorableServerSideAdInsertionPeriodChange(isUsingPlaceholderPeriod, sf10Var2, j7, sf10Var, a9z0Var2.h(obj, y8z0Var2), j5);
                    if (!z9 || isIgnorableServerSideAdInsertionPeriodChange) {
                        sf10Var = sf10Var2;
                    }
                    if (sf10Var.b()) {
                        j6 = j3;
                    } else if (sf10Var.equals(sf10Var2)) {
                        j6 = jxc0Var.s;
                    } else {
                        a9z0Var2.h(sf10Var.a, y8z0Var2);
                        if (sf10Var.c == y8z0Var2.e(sf10Var.b)) {
                            y8z0Var2.g.getClass();
                        }
                        j6 = j11;
                    }
                    return new goo(sf10Var, j6, j5, z2, z3, z4);
                }
                i3 = a9z0Var.h(obj, y8z0Var).c;
                obj = obj;
            }
            j3 = j7;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        j2 = 0;
        if (i3 == i2) {
        }
        sf10 p2 = af10Var.p(a9z0Var2, obj, j3);
        int i72 = p2.e;
        if (i72 != i2) {
        }
        if (sf10Var2.a.equals(obj)) {
            z9 = true;
        }
        long j112 = j2;
        sf10Var = p2;
        boolean isIgnorableServerSideAdInsertionPeriodChange2 = isIgnorableServerSideAdInsertionPeriodChange(isUsingPlaceholderPeriod, sf10Var2, j7, sf10Var, a9z0Var2.h(obj, y8z0Var2), j5);
        if (!z9) {
        }
        sf10Var = sf10Var2;
        if (sf10Var.b()) {
        }
        return new goo(sf10Var, j6, j5, z2, z3, z4);
    }

    private static Pair<Object, Long> resolveSeekPositionUs(a9z0 a9z0Var, hoo hooVar, boolean z, int i, boolean z2, z8z0 z8z0Var, y8z0 y8z0Var) {
        int resolveSubsequentPeriod;
        a9z0 a9z0Var2 = hooVar.a;
        if (a9z0Var.q()) {
            return null;
        }
        a9z0 a9z0Var3 = a9z0Var2.q() ? a9z0Var : a9z0Var2;
        try {
            Pair j = a9z0Var3.j(z8z0Var, y8z0Var, hooVar.b, hooVar.c);
            if (!a9z0Var.equals(a9z0Var3)) {
                if (a9z0Var.b(j.first) == -1) {
                    if (!z || (resolveSubsequentPeriod = resolveSubsequentPeriod(z8z0Var, y8z0Var, i, z2, j.first, a9z0Var3, a9z0Var)) == -1) {
                        return null;
                    }
                    return a9z0Var.j(z8z0Var, y8z0Var, resolveSubsequentPeriod, -9223372036854775807L);
                }
                if (a9z0Var3.h(j.first, y8z0Var).f && a9z0Var3.n(y8z0Var.c, z8z0Var, 0L).m == a9z0Var3.b(j.first)) {
                    return a9z0Var.j(z8z0Var, y8z0Var, a9z0Var.h(j.first, y8z0Var).c, hooVar.c);
                }
            }
            return j;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int resolveSubsequentPeriod(z8z0 z8z0Var, y8z0 y8z0Var, int i, boolean z, Object obj, a9z0 a9z0Var, a9z0 a9z0Var2) {
        z8z0 z8z0Var2 = z8z0Var;
        a9z0 a9z0Var3 = a9z0Var;
        Object obj2 = a9z0Var3.n(a9z0Var3.h(obj, y8z0Var).c, z8z0Var, 0L).a;
        for (int i2 = 0; i2 < a9z0Var2.p(); i2++) {
            if (a9z0Var2.n(i2, z8z0Var, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = a9z0Var3.b(obj);
        int i3 = a9z0Var3.i();
        int i4 = -1;
        int i5 = 0;
        while (i5 < i3 && i4 == -1) {
            a9z0 a9z0Var4 = a9z0Var3;
            int d = a9z0Var4.d(b, y8z0Var, z8z0Var2, i, z);
            if (d == -1) {
                break;
            }
            i4 = a9z0Var2.b(a9z0Var4.m(d));
            i5++;
            a9z0Var3 = a9z0Var4;
            b = d;
            z8z0Var2 = z8z0Var;
        }
        if (i4 == -1) {
            return -1;
        }
        return a9z0Var2.g(i4, y8z0Var, false).c;
    }

    private void scheduleNextWork(long j) {
        long j2 = (this.playbackInfo.e != 3 || (!this.dynamicSchedulingEnabled && shouldPlayWhenReady())) ? BUFFERING_MAXIMUM_INTERVAL_MS : 1000L;
        if (this.dynamicSchedulingEnabled && shouldPlayWhenReady()) {
            for (myi0 myi0Var : this.renderers) {
                long j3 = this.rendererPositionUs;
                long j4 = this.rendererPositionElapsedRealtimeUs;
                fyi0 fyi0Var = myi0Var.c;
                fyi0 fyi0Var2 = myi0Var.a;
                long durationToProgressUs = myi0.g(fyi0Var2) ? fyi0Var2.getDurationToProgressUs(j3, j4) : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                if (fyi0Var != null && fyi0Var.getState() != 0) {
                    durationToProgressUs = Math.min(durationToProgressUs, fyi0Var.getDurationToProgressUs(j3, j4));
                }
                j2 = Math.min(j2, tw21.l0(durationToProgressUs));
            }
            ye10 ye10Var = this.queue.i;
            if ((ye10Var != null ? ye10Var.m : null) != null) {
                if ((tw21.W(j2) * this.playbackInfo.o.a) + this.rendererPositionUs >= r2.e()) {
                    j2 = Math.min(j2, BUFFERING_MAXIMUM_INTERVAL_MS);
                }
            }
        }
        ((a3x0) this.handler).a.sendEmptyMessageAtTime(2, j + j2);
    }

    private void seekToCurrentPosition(boolean z) throws ExoPlaybackException {
        sf10 sf10Var = this.queue.i.g.a;
        long seekToPeriodPosition = seekToPeriodPosition(sf10Var, this.playbackInfo.s, true, false);
        if (seekToPeriodPosition != this.playbackInfo.s) {
            jxc0 jxc0Var = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(sf10Var, seekToPeriodPosition, jxc0Var.c, jxc0Var.d, z, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0 A[Catch: all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:9:0x00a0, B:17:0x00ae, B:19:0x00b2, B:20:0x00b5, B:25:0x00cb, B:29:0x00d3), top: B:7:0x009e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void seekToInternal(hoo hooVar) throws ExoPlaybackException {
        long longValue;
        sf10 p;
        long j;
        boolean z;
        long j2;
        sf10 sf10Var;
        boolean z2;
        long j3;
        long j4;
        long seekToPeriodPosition;
        jxc0 jxc0Var;
        sf10 sf10Var2;
        a9z0 a9z0Var;
        long j5;
        sf10 sf10Var3;
        long j6;
        jxc0 jxc0Var2;
        int i;
        int i2;
        long j7;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        exoPlayerImplInternal.playbackInfoUpdate.a(1);
        Pair<Object, Long> resolveSeekPositionUs = resolveSeekPositionUs(exoPlayerImplInternal.playbackInfo.a, hooVar, true, exoPlayerImplInternal.repeatMode, exoPlayerImplInternal.shuffleModeEnabled, exoPlayerImplInternal.window, exoPlayerImplInternal.period);
        try {
            try {
                if (resolveSeekPositionUs == null) {
                    Pair<sf10, Long> placeholderFirstMediaPeriodPositionUs = exoPlayerImplInternal.getPlaceholderFirstMediaPeriodPositionUs(exoPlayerImplInternal.playbackInfo.a);
                    p = (sf10) placeholderFirstMediaPeriodPositionUs.first;
                    longValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
                    z = !exoPlayerImplInternal.playbackInfo.a.q();
                    j2 = -9223372036854775807L;
                } else {
                    Object obj = resolveSeekPositionUs.first;
                    longValue = ((Long) resolveSeekPositionUs.second).longValue();
                    long j8 = hooVar.c == -9223372036854775807L ? -9223372036854775807L : longValue;
                    p = exoPlayerImplInternal.queue.p(exoPlayerImplInternal.playbackInfo.a, obj, longValue);
                    if (!p.b()) {
                        j = 0;
                        z = hooVar.c == -9223372036854775807L;
                        j2 = j8;
                        if (exoPlayerImplInternal.playbackInfo.a.q()) {
                            jxc0 jxc0Var3 = exoPlayerImplInternal.playbackInfo;
                            if (resolveSeekPositionUs == null) {
                                if (jxc0Var3.e != 1) {
                                    exoPlayerImplInternal.setState(4);
                                }
                                exoPlayerImplInternal.resetInternal(false, true, false, true);
                            } else {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (p.equals(jxc0Var3.b)) {
                                                    ye10 ye10Var = exoPlayerImplInternal.queue.i;
                                                    j4 = (ye10Var == null || !ye10Var.e || longValue == j) ? longValue : ye10Var.a.c(longValue, exoPlayerImplInternal.seekParameters);
                                                    if (tw21.l0(j4) != tw21.l0(exoPlayerImplInternal.playbackInfo.s) || ((i = (jxc0Var2 = exoPlayerImplInternal.playbackInfo).e) != 2 && i != 3)) {
                                                        sf10Var = p;
                                                    }
                                                    j6 = jxc0Var2.s;
                                                    sf10Var3 = p;
                                                    i2 = 2;
                                                    z2 = z;
                                                    j7 = j6;
                                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var3, j6, j2, j7, z2, i2);
                                                    return;
                                                }
                                                sf10Var = p;
                                                j4 = longValue;
                                                exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(a9z0Var, sf10Var2, a9z0Var, jxc0Var.b, j5, true);
                                                sf10Var3 = sf10Var2;
                                                j2 = j5;
                                                j6 = seekToPeriodPosition;
                                                i2 = 2;
                                                j7 = j6;
                                                exoPlayerImplInternal = this;
                                                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var3, j6, j2, j7, z2, i2);
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                sf10Var = sf10Var2;
                                                j2 = j5;
                                                j3 = seekToPeriodPosition;
                                                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var, j3, j2, j3, z2, 2);
                                                throw th;
                                            }
                                            a9z0Var = jxc0Var.a;
                                            j5 = j2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sf10Var = sf10Var2;
                                        }
                                        jxc0Var = exoPlayerImplInternal.playbackInfo;
                                        sf10Var2 = sf10Var;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    seekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(sf10Var, j4, exoPlayerImplInternal.playbackInfo.e == 4);
                                    z2 = (longValue != seekToPeriodPosition) | z;
                                } catch (Throwable th4) {
                                    th = th4;
                                    z2 = z;
                                    j3 = longValue;
                                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var, j3, j2, j3, z2, 2);
                                    throw th;
                                }
                            }
                        } else {
                            exoPlayerImplInternal.pendingInitialSeekPosition = hooVar;
                        }
                        z2 = z;
                        sf10Var3 = p;
                        j6 = longValue;
                        i2 = 2;
                        j7 = j6;
                        exoPlayerImplInternal = this;
                        exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var3, j6, j2, j7, z2, i2);
                        return;
                    }
                    exoPlayerImplInternal.playbackInfo.a.h(p.a, exoPlayerImplInternal.period);
                    if (exoPlayerImplInternal.period.e(p.b) == p.c) {
                        exoPlayerImplInternal.period.g.getClass();
                    }
                    z = true;
                    j2 = j8;
                    longValue = 0;
                }
                if (exoPlayerImplInternal.playbackInfo.a.q()) {
                }
                z2 = z;
                sf10Var3 = p;
                j6 = longValue;
                i2 = 2;
                j7 = j6;
                exoPlayerImplInternal = this;
                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var3, j6, j2, j7, z2, i2);
                return;
            } catch (Throwable th5) {
                th = th5;
                z2 = z;
                sf10Var = p;
                j3 = longValue;
                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(sf10Var, j3, j2, j3, z2, 2);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            sf10Var = p;
        }
        j = 0;
    }

    private long seekToPeriodPosition(sf10 sf10Var, long j, boolean z, boolean z2) throws ExoPlaybackException {
        af10 af10Var;
        stopRenderers();
        updateRebufferingState(false, true);
        if (z2 || this.playbackInfo.e == 3) {
            setState(2);
        }
        ye10 ye10Var = this.queue.i;
        ye10 ye10Var2 = ye10Var;
        while (ye10Var2 != null && !sf10Var.equals(ye10Var2.g.a)) {
            ye10Var2 = ye10Var2.m;
        }
        if (z || ye10Var != ye10Var2 || (ye10Var2 != null && ye10Var2.p + j < 0)) {
            disableRenderers();
            if (ye10Var2 != null) {
                while (true) {
                    af10Var = this.queue;
                    if (af10Var.i == ye10Var2) {
                        break;
                    }
                    af10Var.a();
                }
                af10Var.n(ye10Var2);
                ye10Var2.p = 1000000000000L;
                enableRenderers();
                ye10Var2.h = true;
            }
        }
        disableAndResetPrewarmingRenderers();
        af10 af10Var2 = this.queue;
        if (ye10Var2 != null) {
            xe10 xe10Var = ye10Var2.a;
            af10Var2.n(ye10Var2);
            if (!ye10Var2.e) {
                ye10Var2.g = ye10Var2.g.b(j);
            } else if (ye10Var2.f) {
                j = xe10Var.e(j);
                xe10Var.s(j - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            }
            resetRendererPosition(j);
            maybeContinueLoading();
        } else {
            af10Var2.b();
            resetRendererPosition(j);
        }
        handleLoadingMediaPeriodChanged(false);
        ((a3x0) this.handler).g(2);
        return j;
    }

    private void sendMessageInternal(yyc0 yyc0Var) throws ExoPlaybackException {
        yyc0Var.getClass();
        sendMessageToTarget(yyc0Var);
    }

    private void sendMessageToTarget(yyc0 yyc0Var) throws ExoPlaybackException {
        if (yyc0Var.e != this.playbackLooper) {
            ((a3x0) this.handler).b(15, yyc0Var).b();
            return;
        }
        deliverMessage(yyc0Var);
        int i = this.playbackInfo.e;
        if (i == 3 || i == 2) {
            ((a3x0) this.handler).g(2);
        }
    }

    private void sendMessageToTargetThread(final yyc0 yyc0Var) {
        Looper looper = yyc0Var.e;
        if (looper.getThread().isAlive()) {
            ((o2x0) this.clock).a(looper, null).e(new Runnable() { // from class: androidx.media3.exoplayer.i
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal.this.lambda$sendMessageToTargetThread$2(yyc0Var);
                }
            });
        } else {
            lk91.j("Trying to send message on a dead thread.");
            yyc0Var.a(false);
        }
    }

    private void setAllNonPrewarmingRendererStreamsFinal(long j) {
        int i;
        for (myi0 myi0Var : this.renderers) {
            fyi0 fyi0Var = myi0Var.c;
            fyi0 fyi0Var2 = myi0Var.a;
            if (myi0.g(fyi0Var2) && (i = myi0Var.d) != 4 && i != 2) {
                myi0.l(fyi0Var2, j);
            }
            if (fyi0Var != null && fyi0Var.getState() != 0 && myi0Var.d != 3) {
                myi0.l(fyi0Var, j);
            }
        }
    }

    private void setAudioAttributesInternal(ue3 ue3Var, boolean z) throws ExoPlaybackException {
        this.trackSelector.setAudioAttributes(ue3Var);
        vf3 vf3Var = this.audioFocusManager;
        if (!z) {
            ue3Var = null;
        }
        if (!Objects.equals(vf3Var.d, ue3Var)) {
            vf3Var.d = ue3Var;
            int i = ue3Var == null ? 0 : 1;
            vf3Var.f = i;
            d6z.k("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        updatePlayWhenReadyWithAudioFocus();
    }

    private void setForegroundModeInternal(boolean z, AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z) {
            this.foregroundMode = z;
            if (!z) {
                for (myi0 myi0Var : this.renderers) {
                    myi0Var.k();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setMediaClockPlaybackParameters(lxc0 lxc0Var) {
        ((a3x0) this.handler).f(16);
        this.mediaClock.setPlaybackParameters(lxc0Var);
    }

    private void setMediaItemsInternal(boo booVar) throws ExoPlaybackException {
        this.playbackInfoUpdate.a(1);
        int i = booVar.c;
        las0 las0Var = booVar.b;
        List list = booVar.a;
        if (i != -1) {
            this.pendingInitialSeekPosition = new hoo(new kzc0(list, las0Var), booVar.c, booVar.d);
        }
        jg10 jg10Var = this.mediaSourceList;
        ArrayList arrayList = jg10Var.b;
        jg10Var.g(0, arrayList.size());
        handleMediaSourceListInfoRefreshed(jg10Var.a(arrayList.size(), list, las0Var), false);
    }

    private void setOffloadSchedulingEnabled(boolean z) {
        if (z == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z;
        if (z || !this.playbackInfo.p) {
            return;
        }
        ((a3x0) this.handler).g(2);
    }

    private void setPauseAtEndOfWindowInternal(boolean z) throws ExoPlaybackException {
        this.pauseAtEndOfWindow = z;
        resetPendingPauseAtEndOfPeriod();
        if (this.pendingPauseAtEndOfPeriod) {
            af10 af10Var = this.queue;
            if (af10Var.j != af10Var.i) {
                seekToCurrentPosition(true);
                handleLoadingMediaPeriodChanged(false);
            }
        }
    }

    private void setPlayWhenReadyInternal(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.playbackInfoUpdate.a(z2 ? 1 : 0);
        updatePlayWhenReadyWithAudioFocus(z, i, i2);
    }

    private void setPlaybackParametersInternal(lxc0 lxc0Var) throws ExoPlaybackException {
        setMediaClockPlaybackParameters(lxc0Var);
        handlePlaybackParameters(this.mediaClock.mo496getPlaybackParameters(), true);
    }

    private void setPreloadConfigurationInternal(pno pnoVar) {
        this.preloadConfiguration = pnoVar;
        af10 af10Var = this.queue;
        a9z0 a9z0Var = this.playbackInfo.a;
        af10Var.getClass();
        pnoVar.getClass();
        if (af10Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < af10Var.q.size(); i++) {
            ((ye10) af10Var.q.get(i)).i();
        }
        af10Var.q = arrayList;
        af10Var.m = null;
        af10Var.k();
    }

    private void setRepeatModeInternal(int i) throws ExoPlaybackException {
        this.repeatMode = i;
        af10 af10Var = this.queue;
        a9z0 a9z0Var = this.playbackInfo.a;
        af10Var.g = i;
        int r = af10Var.r(a9z0Var);
        if ((r & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((r & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setSeekParametersInternal(g7q0 g7q0Var) {
        this.seekParameters = g7q0Var;
    }

    private void setShuffleModeEnabledInternal(boolean z) throws ExoPlaybackException {
        this.shuffleModeEnabled = z;
        af10 af10Var = this.queue;
        a9z0 a9z0Var = this.playbackInfo.a;
        af10Var.h = z;
        int r = af10Var.r(a9z0Var);
        if ((r & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((r & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(las0 las0Var) throws ExoPlaybackException {
        this.playbackInfoUpdate.a(1);
        jg10 jg10Var = this.mediaSourceList;
        int size = jg10Var.b.size();
        if (((kas0) las0Var).b.length != size) {
            las0Var = new kas0(new Random(((kas0) las0Var).a.nextLong())).a(0, size);
        }
        jg10Var.j = las0Var;
        handleMediaSourceListInfoRefreshed(jg10Var.b(), false);
    }

    private void setState(int i) {
        jxc0 jxc0Var = this.playbackInfo;
        if (jxc0Var.e != i) {
            if (i != 2) {
                this.playbackMaybeBecameStuckAtMs = -9223372036854775807L;
            }
            this.playbackInfo = jxc0Var.h(i);
        }
    }

    private void setVideoOutputInternal(Object obj, AtomicBoolean atomicBoolean) throws ExoPlaybackException {
        for (myi0 myi0Var : this.renderers) {
            fyi0 fyi0Var = myi0Var.a;
            if (fyi0Var.getTrackType() == 2) {
                int i = myi0Var.d;
                if (i == 4 || i == 1) {
                    fyi0 fyi0Var2 = myi0Var.c;
                    fyi0Var2.getClass();
                    fyi0Var2.handleMessage(1, obj);
                } else {
                    fyi0Var.handleMessage(1, obj);
                }
            }
        }
        int i2 = this.playbackInfo.e;
        if (i2 == 3 || i2 == 2) {
            ((a3x0) this.handler).g(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setVolumeInternal(float f) throws ExoPlaybackException {
        this.volume = f;
        float f2 = f * this.audioFocusManager.g;
        for (myi0 myi0Var : this.renderers) {
            fyi0 fyi0Var = myi0Var.a;
            if (fyi0Var.getTrackType() == 1) {
                fyi0Var.handleMessage(2, Float.valueOf(f2));
                fyi0 fyi0Var2 = myi0Var.c;
                if (fyi0Var2 != null) {
                    fyi0Var2.handleMessage(2, Float.valueOf(f2));
                }
            }
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        ye10 ye10Var;
        ye10 ye10Var2;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (ye10Var = this.queue.i) != null && (ye10Var2 = ye10Var.m) != null && this.rendererPositionUs >= ye10Var2.e() && ye10Var2.h;
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible(this.queue.l)) {
            return false;
        }
        ye10 ye10Var = this.queue.l;
        long totalBufferedDurationUs = getTotalBufferedDurationUs(!ye10Var.e ? 0L : ye10Var.a.i());
        ye10 ye10Var2 = this.queue.i;
        long j = this.rendererPositionUs;
        long j2 = ye10Var.p;
        if (ye10Var != ye10Var2) {
            j -= j2;
            j2 = ye10Var.g.b;
        }
        long j3 = j - j2;
        long b = shouldUseLivePlaybackSpeedControl(this.playbackInfo.a, ye10Var.g.a) ? this.livePlaybackSpeedControl.b() : -9223372036854775807L;
        vyc0 vyc0Var = this.playerId;
        a9z0 a9z0Var = this.playbackInfo.a;
        sf10 sf10Var = ye10Var.g.a;
        float f = this.mediaClock.mo496getPlaybackParameters().a;
        boolean z = this.playbackInfo.l;
        nwy nwyVar = new nwy(vyc0Var, a9z0Var, sf10Var, j3, totalBufferedDurationUs, f, this.isRebuffering, b);
        boolean shouldContinueLoading = this.loadControl.shouldContinueLoading(nwyVar);
        ye10 ye10Var3 = this.queue.i;
        if (shouldContinueLoading || !ye10Var3.e || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US || (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe)) {
            return shouldContinueLoading;
        }
        ye10Var3.a.s(this.playbackInfo.s, false);
        return this.loadControl.shouldContinueLoading(nwyVar);
    }

    private boolean shouldPlayWhenReady() {
        jxc0 jxc0Var = this.playbackInfo;
        return jxc0Var.l && jxc0Var.n == 0;
    }

    private boolean shouldTransitionToReadyState(boolean z) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        jxc0 jxc0Var = this.playbackInfo;
        if (jxc0Var.g) {
            ye10 ye10Var = this.queue.i;
            long b = shouldUseLivePlaybackSpeedControl(jxc0Var.a, ye10Var.g.a) ? this.livePlaybackSpeedControl.b() : -9223372036854775807L;
            ye10 ye10Var2 = this.queue.l;
            boolean z3 = ye10Var2.g() && ye10Var2.g.j;
            if (ye10Var2.g.a.b() && !ye10Var2.e) {
                z2 = true;
            }
            if (!z3 && !z2) {
                long totalBufferedDurationUs = getTotalBufferedDurationUs(ye10Var2.d());
                owy owyVar = this.loadControl;
                vyc0 vyc0Var = this.playerId;
                a9z0 a9z0Var = this.playbackInfo.a;
                sf10 sf10Var = ye10Var.g.a;
                long j = this.rendererPositionUs - ye10Var.p;
                float f = this.mediaClock.mo496getPlaybackParameters().a;
                boolean z4 = this.playbackInfo.l;
                return owyVar.shouldStartPlayback(new nwy(vyc0Var, a9z0Var, sf10Var, j, totalBufferedDurationUs, f, this.isRebuffering, b));
            }
        }
        return true;
    }

    private boolean shouldUseLivePlaybackSpeedControl(a9z0 a9z0Var, sf10 sf10Var) {
        if (!sf10Var.b() && !a9z0Var.q()) {
            a9z0Var.o(this.window, a9z0Var.h(sf10Var.a, this.period).c);
            if (this.window.b()) {
                z8z0 z8z0Var = this.window;
                if (z8z0Var.h && z8z0Var.e != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private void startRenderers() throws ExoPlaybackException {
        ye10 ye10Var = this.queue.i;
        if (ye10Var == null) {
            return;
        }
        y001 y001Var = ye10Var.o;
        for (int i = 0; i < this.renderers.length; i++) {
            if (y001Var.b(i)) {
                this.renderers[i].m();
            }
        }
    }

    private void stopInternal(boolean z, boolean z2) {
        resetInternal(z || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.a(z2 ? 1 : 0);
        this.loadControl.onStopped(this.playerId);
        this.audioFocusManager.c(1, this.playbackInfo.l);
        setState(1);
    }

    private void stopRenderers() throws ExoPlaybackException {
        neh nehVar = this.mediaClock;
        nehVar.y = false;
        qzt0 qzt0Var = nehVar.a;
        if (qzt0Var.c) {
            qzt0Var.d(qzt0Var.g());
            qzt0Var.c = false;
        }
        for (myi0 myi0Var : this.renderers) {
            fyi0 fyi0Var = myi0Var.c;
            fyi0 fyi0Var2 = myi0Var.a;
            if (myi0.g(fyi0Var2) && fyi0Var2.getState() == 2) {
                fyi0Var2.stop();
            }
            if (fyi0Var != null && fyi0Var.getState() != 0 && fyi0Var.getState() == 2) {
                fyi0Var.stop();
            }
        }
    }

    private void updateIsLoading() {
        ye10 ye10Var = this.queue.l;
        boolean z = this.shouldContinueLoading || (ye10Var != null && ye10Var.a.isLoading());
        jxc0 jxc0Var = this.playbackInfo;
        if (z != jxc0Var.g) {
            this.playbackInfo = jxc0Var.b(z);
        }
    }

    private void updateLoadControlTrackSelection(sf10 sf10Var, yzz0 yzz0Var, y001 y001Var) {
        ye10 ye10Var = this.queue.l;
        ye10Var.getClass();
        ye10 ye10Var2 = this.queue.i;
        long j = this.rendererPositionUs;
        long j2 = ye10Var.p;
        if (ye10Var != ye10Var2) {
            j -= j2;
            j2 = ye10Var.g.b;
        }
        long j3 = j - j2;
        long totalBufferedDurationUs = getTotalBufferedDurationUs(ye10Var.d());
        long b = shouldUseLivePlaybackSpeedControl(this.playbackInfo.a, ye10Var.g.a) ? this.livePlaybackSpeedControl.b() : -9223372036854775807L;
        owy owyVar = this.loadControl;
        vyc0 vyc0Var = this.playerId;
        a9z0 a9z0Var = this.playbackInfo.a;
        float f = this.mediaClock.mo496getPlaybackParameters().a;
        boolean z = this.playbackInfo.l;
        owyVar.onTracksSelected(new nwy(vyc0Var, a9z0Var, sf10Var, j3, totalBufferedDurationUs, f, this.isRebuffering, b), yzz0Var, y001Var.c);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i, int i2, List<fe10> list) throws ExoPlaybackException {
        this.playbackInfoUpdate.a(1);
        jg10 jg10Var = this.mediaSourceList;
        jg10Var.getClass();
        ArrayList arrayList = jg10Var.b;
        d6z.l(i >= 0 && i <= i2 && i2 <= arrayList.size());
        d6z.l(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((hg10) arrayList.get(i3)).a.updateMediaItem(list.get(i3 - i));
        }
        handleMediaSourceListInfoRefreshed(jg10Var.b(), false);
    }

    private void updatePeriods() throws ExoPlaybackException {
        if (this.playbackInfo.a.q() || !this.mediaSourceList.k) {
            return;
        }
        boolean maybeUpdateLoadingPeriod = maybeUpdateLoadingPeriod();
        maybeUpdatePrewarmingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
        maybeUpdatePreloadPeriods(maybeUpdateLoadingPeriod);
    }

    private static int updatePlayWhenReadyChangeReason(int i, int i2) {
        if (i == -1) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        return i2;
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z, int i, int i2, int i3) throws ExoPlaybackException {
        boolean z2 = z && i != -1;
        int updatePlayWhenReadyChangeReason = updatePlayWhenReadyChangeReason(i, i3);
        int updatePlaybackSuppressionReason = updatePlaybackSuppressionReason(i, i2);
        jxc0 jxc0Var = this.playbackInfo;
        if (jxc0Var.l == z2 && jxc0Var.n == updatePlaybackSuppressionReason && jxc0Var.m == updatePlayWhenReadyChangeReason) {
            return;
        }
        this.playbackInfo = jxc0Var.e(updatePlayWhenReadyChangeReason, updatePlaybackSuppressionReason, z2);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z2);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            this.queue.m(this.rendererPositionUs);
            return;
        }
        int i4 = this.playbackInfo.e;
        if (i4 != 3) {
            if (i4 == 2) {
                ((a3x0) this.handler).g(2);
            }
        } else {
            neh nehVar = this.mediaClock;
            nehVar.y = true;
            nehVar.a.f();
            startRenderers();
            ((a3x0) this.handler).g(2);
        }
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
        ye10 ye10Var = this.queue.i;
        if (ye10Var == null) {
            return;
        }
        long f = ye10Var.e ? ye10Var.a.f() : -9223372036854775807L;
        if (f != -9223372036854775807L) {
            if (!ye10Var.g()) {
                this.queue.n(ye10Var);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(f);
            if (f != this.playbackInfo.s) {
                jxc0 jxc0Var = this.playbackInfo;
                long j = f;
                this.playbackInfo = handlePositionDiscontinuity(jxc0Var.b, j, jxc0Var.c, j, true, 5);
            }
        } else {
            neh nehVar = this.mediaClock;
            boolean z = ye10Var != this.queue.j;
            qzt0 qzt0Var = nehVar.a;
            fyi0 fyi0Var = nehVar.c;
            if (fyi0Var == null || fyi0Var.isEnded() || ((z && nehVar.c.getState() != 2) || (!nehVar.c.isReady() && (z || nehVar.c.hasReadStreamToEnd())))) {
                nehVar.x = true;
                if (nehVar.y) {
                    qzt0Var.f();
                }
            } else {
                kb10 kb10Var = nehVar.w;
                kb10Var.getClass();
                long g = kb10Var.g();
                if (nehVar.x) {
                    if (g >= qzt0Var.g()) {
                        nehVar.x = false;
                        if (nehVar.y) {
                            qzt0Var.f();
                        }
                    } else if (qzt0Var.c) {
                        qzt0Var.d(qzt0Var.g());
                        qzt0Var.c = false;
                    }
                }
                qzt0Var.d(g);
                lxc0 mo496getPlaybackParameters = kb10Var.mo496getPlaybackParameters();
                if (!mo496getPlaybackParameters.equals((lxc0) qzt0Var.x)) {
                    qzt0Var.setPlaybackParameters(mo496getPlaybackParameters);
                    nehVar.b.onPlaybackParametersChanged(mo496getPlaybackParameters);
                }
            }
            long g2 = nehVar.g();
            this.rendererPositionUs = g2;
            long j2 = g2 - ye10Var.p;
            maybeTriggerPendingMessages(this.playbackInfo.s, j2);
            if (this.mediaClock.b()) {
                boolean z2 = !this.playbackInfoUpdate.d;
                jxc0 jxc0Var2 = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(jxc0Var2.b, j2, jxc0Var2.c, j2, z2, 6);
            } else {
                jxc0 jxc0Var3 = this.playbackInfo;
                jxc0Var3.s = j2;
                jxc0Var3.t = SystemClock.elapsedRealtime();
            }
        }
        this.playbackInfo.q = this.queue.l.d();
        this.playbackInfo.r = getTotalBufferedDurationUs();
        jxc0 jxc0Var4 = this.playbackInfo;
        if (jxc0Var4.l && jxc0Var4.e == 3 && shouldUseLivePlaybackSpeedControl(jxc0Var4.a, jxc0Var4.b) && this.playbackInfo.o.a == 1.0f) {
            float a = this.livePlaybackSpeedControl.a(getCurrentLiveOffsetUs(), this.playbackInfo.r);
            if (this.mediaClock.mo496getPlaybackParameters().a != a) {
                setMediaClockPlaybackParameters(this.playbackInfo.o.a(a));
                handlePlaybackParameters(this.playbackInfo.o, this.mediaClock.mo496getPlaybackParameters().a, false, false);
            }
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(a9z0 a9z0Var, sf10 sf10Var, a9z0 a9z0Var2, sf10 sf10Var2, long j, boolean z) throws ExoPlaybackException {
        if (!shouldUseLivePlaybackSpeedControl(a9z0Var, sf10Var)) {
            lxc0 lxc0Var = sf10Var.b() ? lxc0.d : this.playbackInfo.o;
            if (this.mediaClock.mo496getPlaybackParameters().equals(lxc0Var)) {
                return;
            }
            setMediaClockPlaybackParameters(lxc0Var);
            handlePlaybackParameters(this.playbackInfo.o, lxc0Var.a, false, false);
            return;
        }
        a9z0Var.o(this.window, a9z0Var.h(sf10Var.a, this.period).c);
        this.livePlaybackSpeedControl.c(this.window.i);
        if (j != -9223372036854775807L) {
            this.livePlaybackSpeedControl.e(getLiveOffsetUs(a9z0Var, sf10Var.a, j));
            return;
        }
        if (!Objects.equals(!a9z0Var2.q() ? a9z0Var2.n(a9z0Var2.h(sf10Var2.a, this.period).c, this.window, 0L).a : null, this.window.a) || z) {
            this.livePlaybackSpeedControl.e(-9223372036854775807L);
        }
    }

    private static int updatePlaybackSuppressionReason(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        return i2;
    }

    private void updateRebufferingState(boolean z, boolean z2) {
        long j;
        this.isRebuffering = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            ((o2x0) this.clock).getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.lastRebufferRealtimeMs = j;
    }

    private boolean updateRenderersForTransition() throws ExoPlaybackException {
        ExoPlayerImplInternal exoPlayerImplInternal;
        ye10 ye10Var = this.queue.j;
        y001 y001Var = ye10Var.o;
        int i = 0;
        boolean z = true;
        int i2 = 0;
        while (true) {
            myi0[] myi0VarArr = this.renderers;
            if (i2 >= myi0VarArr.length) {
                break;
            }
            int b = myi0VarArr[i2].b();
            myi0 myi0Var = this.renderers[i2];
            neh nehVar = this.mediaClock;
            int j = myi0Var.j(myi0Var.a, ye10Var, y001Var, nehVar);
            int j2 = myi0Var.j(myi0Var.c, ye10Var, y001Var, nehVar);
            if (j == 1) {
                j = j2;
            }
            if ((j & 2) != 0 && this.offloadSchedulingEnabled) {
                setOffloadSchedulingEnabled(false);
            }
            this.enabledRendererCount -= b - this.renderers[i2].b();
            z &= (j & 1) != 0;
            i2++;
        }
        if (z) {
            while (i < this.renderers.length) {
                if (y001Var.b(i) && this.renderers[i].c(ye10Var) == null) {
                    exoPlayerImplInternal = this;
                    exoPlayerImplInternal.enableRenderer(ye10Var, i, false, ye10Var.e());
                } else {
                    exoPlayerImplInternal = this;
                }
                i++;
                this = exoPlayerImplInternal;
            }
        }
        return z;
    }

    private void updateTrackSelectionPlaybackSpeed(float f) {
        for (ye10 ye10Var = this.queue.i; ye10Var != null; ye10Var = ye10Var.m) {
            for (loo looVar : ye10Var.o.c) {
                if (looVar != null) {
                    looVar.onPlaybackSpeed(f);
                }
            }
        }
    }

    private synchronized void waitUninterruptibly(rhw0 rhw0Var, long j) {
        ((o2x0) this.clock).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) rhw0Var.get()).booleanValue() && j > 0) {
            try {
                this.clock.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            ((o2x0) this.clock).getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public void addMediaSources(int i, List<hg10> list, las0 las0Var) {
        ((a3x0) this.handler).c(18, new boo(list, -1, -9223372036854775807L, las0Var), i, 0).b();
    }

    @Override // defpackage.uf3
    public void executePlayerCommand(int i) {
        ((a3x0) this.handler).a(33, i, 0).b();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i;
        ye10 ye10Var;
        ye10 ye10Var2;
        ye10 ye10Var3;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    setPlayWhenReadyInternal(z, i3 >> 4, true, i3 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((hoo) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((lxc0) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((g7q0) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((xe10) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((xe10) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((yyc0) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((yyc0) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((lxc0) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((boo) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((boo) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((coo) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (las0) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((las0) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((pno) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    setVideoOutputInternal(pair.first, (AtomicBoolean) pair.second);
                    break;
                case 31:
                    setAudioAttributesInternal((ue3) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    setVolumeInternal(((Float) message.obj).floatValue());
                    break;
                case 33:
                    handleAudioFocusPlayerCommandInternal(message.arg1);
                    break;
                case 34:
                    handleAudioFocusVolumeMultiplierChange();
                    break;
            }
        } catch (ParserException e) {
            int i4 = e.dataType;
            if (i4 == 1) {
                i2 = e.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i2 = e.contentIsMalformed ? 3002 : 3004;
                }
                handleIoException(e, r3);
            }
            r3 = i2;
            handleIoException(e, r3);
        } catch (DataSourceException e2) {
            handleIoException(e2, e2.reason);
        } catch (ExoPlaybackException e3) {
            e = e3;
            if (e.type == 1 && (ye10Var2 = this.queue.j) != null) {
                myi0[] myi0VarArr = this.renderers;
                int i5 = e.rendererIndex;
                e = e.b((!myi0VarArr[i5 % myi0VarArr.length].h(i5) || (ye10Var3 = ye10Var2.m) == null) ? ye10Var2.g.a : ye10Var3.g.a);
            }
            if (e.type == 1) {
                myi0[] myi0VarArr2 = this.renderers;
                int i6 = e.rendererIndex;
                if (myi0VarArr2[i6 % myi0VarArr2.length].h(i6)) {
                    this.isPrewarmingDisabledUntilNextTransition = true;
                    disableAndResetPrewarmingRenderers();
                    ye10 g = this.queue.g();
                    ye10 ye10Var4 = this.queue.i;
                    if (ye10Var4 != g) {
                        while (ye10Var4 != null) {
                            ye10 ye10Var5 = ye10Var4.m;
                            if (ye10Var5 == g) {
                                break;
                            }
                            ye10Var4 = ye10Var5;
                        }
                    }
                    this.queue.n(ye10Var4);
                    if (this.playbackInfo.e != 4) {
                        maybeContinueLoading();
                        ((a3x0) this.handler).g(2);
                    }
                }
            }
            ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
            if (exoPlaybackException != null) {
                exoPlaybackException.addSuppressed(e);
                e = this.pendingRecoverableRendererError;
            }
            if (e.type == 1) {
                af10 af10Var = this.queue;
                if (af10Var.i != af10Var.j) {
                    while (true) {
                        af10 af10Var2 = this.queue;
                        ye10Var = af10Var2.i;
                        if (ye10Var == af10Var2.j) {
                            break;
                        }
                        af10Var2.a();
                    }
                    d6z.t(ye10Var);
                    maybeNotifyPlaybackInfoChanged();
                    ze10 ze10Var = ye10Var.g;
                    sf10 sf10Var = ze10Var.a;
                    long j = ze10Var.b;
                    this.playbackInfo = handlePositionDiscontinuity(sf10Var, j, ze10Var.c, j, true, 0);
                }
            }
            if (e.isRecoverable && (this.pendingRecoverableRendererError == null || (i = e.errorCode) == 5004 || i == 5003)) {
                lk91.k("Recoverable renderer error", e);
                if (this.pendingRecoverableRendererError == null) {
                    this.pendingRecoverableRendererError = e;
                }
                a3x0 a3x0Var = (a3x0) this.handler;
                z2x0 b = a3x0Var.b(25, e);
                Handler handler = a3x0Var.a;
                Message message2 = b.a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                b.a();
            } else {
                lk91.f(TAG, "Playback error", e);
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.f(e);
            }
        } catch (DrmSession$DrmSessionException e4) {
            handleIoException(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            handleIoException(e5, 1002);
        } catch (IOException e6) {
            handleIoException(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            lk91.f(TAG, "Playback error", exoPlaybackException2);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.f(exoPlaybackException2);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    public void moveMediaSources(int i, int i2, int i3, las0 las0Var) {
        ((a3x0) this.handler).b(19, new coo(i, i2, i3, las0Var)).b();
    }

    @Override // defpackage.trq0
    public void onContinueLoadingRequested(xe10 xe10Var) {
        ((a3x0) this.handler).b(9, xe10Var).b();
    }

    @Override // defpackage.meh
    public void onPlaybackParametersChanged(lxc0 lxc0Var) {
        ((a3x0) this.handler).b(16, lxc0Var).b();
    }

    @Override // defpackage.ig10
    public void onPlaylistUpdateRequested() {
        ((a3x0) this.handler).f(2);
        ((a3x0) this.handler).g(22);
    }

    @Override // defpackage.we10
    public void onPrepared(xe10 xe10Var) {
        ((a3x0) this.handler).b(8, xe10Var).b();
    }

    @Override // defpackage.w001
    public void onRendererCapabilitiesChanged(fyi0 fyi0Var) {
        ((a3x0) this.handler).g(26);
    }

    @Override // defpackage.w001
    public void onTrackSelectionsInvalidated() {
        ((a3x0) this.handler).g(10);
    }

    public void prepare() {
        a3x0 a3x0Var = (a3x0) this.handler;
        a3x0Var.getClass();
        z2x0 d = a3x0.d();
        d.a = a3x0Var.a.obtainMessage(29);
        d.b();
    }

    public synchronized boolean release() {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            ((a3x0) this.handler).g(7);
            waitUninterruptibly(new rhw0() { // from class: androidx.media3.exoplayer.g
                @Override // defpackage.rhw0
                public final Object get() {
                    Boolean lambda$release$0;
                    lambda$release$0 = ExoPlayerImplInternal.this.lambda$release$0();
                    return lambda$release$0;
                }
            }, this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    public void removeMediaSources(int i, int i2, las0 las0Var) {
        ((a3x0) this.handler).c(20, las0Var, i, i2).b();
    }

    public void seekTo(a9z0 a9z0Var, int i, long j) {
        ((a3x0) this.handler).b(3, new hoo(a9z0Var, i, j)).b();
    }

    @Override // defpackage.wyc0
    public synchronized void sendMessage(yyc0 yyc0Var) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            ((a3x0) this.handler).b(14, yyc0Var).b();
            return;
        }
        lk91.j("Ignoring messages sent after release.");
        yyc0Var.a(false);
    }

    public void setAudioAttributes(ue3 ue3Var, boolean z) {
        ((a3x0) this.handler).c(31, ue3Var, z ? 1 : 0, 0).b();
    }

    public synchronized boolean setForegroundMode(boolean z) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            if (z) {
                ((a3x0) this.handler).a(13, 1, 0).b();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ((a3x0) this.handler).c(13, atomicBoolean, 0, 0).b();
            waitUninterruptibly(new seh(10, atomicBoolean), this.setForegroundModeTimeoutMs);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<hg10> list, int i, long j, las0 las0Var) {
        ((a3x0) this.handler).b(17, new boo(list, i, j, las0Var)).b();
    }

    public void setPauseAtEndOfWindow(boolean z) {
        ((a3x0) this.handler).a(23, z ? 1 : 0, 0).b();
    }

    public void setPlayWhenReady(boolean z, int i, int i2) {
        ((a3x0) this.handler).a(1, z ? 1 : 0, i | (i2 << 4)).b();
    }

    public void setPlaybackParameters(lxc0 lxc0Var) {
        ((a3x0) this.handler).b(4, lxc0Var).b();
    }

    public void setPreloadConfiguration(pno pnoVar) {
        ((a3x0) this.handler).b(28, pnoVar).b();
    }

    public void setRepeatMode(int i) {
        ((a3x0) this.handler).a(11, i, 0).b();
    }

    public void setSeekParameters(g7q0 g7q0Var) {
        ((a3x0) this.handler).b(5, g7q0Var).b();
    }

    public void setShuffleModeEnabled(boolean z) {
        ((a3x0) this.handler).a(12, z ? 1 : 0, 0).b();
    }

    public void setShuffleOrder(las0 las0Var) {
        ((a3x0) this.handler).b(21, las0Var).b();
    }

    public synchronized boolean setVideoOutput(Object obj, long j) {
        if (!this.released && this.playbackLooper.getThread().isAlive()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ((a3x0) this.handler).b(30, new Pair(obj, atomicBoolean)).b();
            if (j == -9223372036854775807L) {
                return true;
            }
            waitUninterruptibly(new seh(10, atomicBoolean), j);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setVolume(float f) {
        ((a3x0) this.handler).b(32, Float.valueOf(f)).b();
    }

    @Override // defpackage.uf3
    public void setVolumeMultiplier(float f) {
        ((a3x0) this.handler).g(34);
    }

    public void stop() {
        a3x0 a3x0Var = (a3x0) this.handler;
        a3x0Var.getClass();
        z2x0 d = a3x0.d();
        d.a = a3x0Var.a.obtainMessage(6);
        d.b();
    }

    public void updateMediaSourcesWithMediaItems(int i, int i2, List<fe10> list) {
        ((a3x0) this.handler).c(27, list, i, i2).b();
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.q);
    }

    private void handlePlaybackParameters(lxc0 lxc0Var, boolean z) throws ExoPlaybackException {
        handlePlaybackParameters(lxc0Var, lxc0Var.a, true, z);
    }

    private void enableRenderers() throws ExoPlaybackException {
        enableRenderers(new boolean[this.renderers.length], this.queue.j.e());
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z, int i, int i2) throws ExoPlaybackException {
        updatePlayWhenReadyWithAudioFocus(z, this.audioFocusManager.c(this.playbackInfo.e, z), i, i2);
    }

    private void updatePlayWhenReadyWithAudioFocus() throws ExoPlaybackException {
        jxc0 jxc0Var = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(jxc0Var.l, jxc0Var.n, jxc0Var.m);
    }

    private long seekToPeriodPosition(sf10 sf10Var, long j, boolean z) throws ExoPlaybackException {
        af10 af10Var = this.queue;
        return seekToPeriodPosition(sf10Var, j, af10Var.i != af10Var.j, z);
    }
}
