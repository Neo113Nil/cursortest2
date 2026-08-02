package ru.ok.android.externcalls.sdk.ml;

import android.content.Context;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.functions.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.functions.m;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.ml.config.ns.NSFeatureConfigProvider;
import ru.ok.android.externcalls.sdk.ml.delegate.NSFeatureDelegate;
import ru.ok.android.externcalls.sdk.ml.model.MLModelCheckResult;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import ru.ok.android.webrtc.sharedprefs.MLFeaturesInfoDataSource;
import ru.ok.android.webrtc.stat.audio.AudioErrorEvent;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.bp7;
import xsna.bpn0;
import xsna.e43;
import xsna.fcy;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.sd;
import xsna.ww;
import xsna.zcl;

/* compiled from: MLFeaturesManagerImpl.kt */
/* loaded from: classes9.dex */
public final class MLFeaturesManagerImpl implements MLFeaturesManager {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "MLFeaturesManagerImpl";
    private final Context context;
    private final ConversationStats conversationStats;
    private final List<Pair<NSFeatureDelegate, fcy<s3q0>>> delegates;
    private final DownloadService downloadService;
    private final ExperimentsInterface experiments;
    private final gzs<Boolean> isCallDestroyed;
    private final gzs<Boolean> isMeInWaitingHall;
    private final RTCLog logger;
    private final MLFeaturesInfoDataSource mlFeaturesInfoDataSource;
    private final NoiseSuppressionManager noiseSuppressionManager;
    private final Lazy nsFeatureDelegate$delegate;
    private final b disposables = new b();
    private final x<s3q0> awaitLeftWaitingHall = new i0(q.P(0, 1, TimeUnit.SECONDS), new m() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$awaitLeftWaitingHall$1
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Long l) {
            gzs gzsVar;
            gzs gzsVar2;
            gzsVar = MLFeaturesManagerImpl.this.isMeInWaitingHall;
            if (((Boolean) gzsVar.invoke()).booleanValue()) {
                return false;
            }
            gzsVar2 = MLFeaturesManagerImpl.this.isCallDestroyed;
            return !((Boolean) gzsVar2.invoke()).booleanValue();
        }
    }).K().l(new l() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$awaitLeftWaitingHall$2
        public final void apply(Long l) {
        }

        @Override // io.reactivex.rxjava3.functions.l
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            apply((Long) obj);
            return s3q0.a;
        }
    });

    /* compiled from: MLFeaturesManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MLFeaturesManagerImpl(MLFeaturesInfoDataSource mLFeaturesInfoDataSource, DownloadService downloadService, Context context, RTCLog rTCLog, RemoteSettings remoteSettings, ConversationStats conversationStats, NoiseSuppressionManager noiseSuppressionManager, ExperimentsInterface experimentsInterface, gzs<Boolean> gzsVar, gzs<Boolean> gzsVar2) {
        this.mlFeaturesInfoDataSource = mLFeaturesInfoDataSource;
        this.downloadService = downloadService;
        this.context = context;
        this.logger = rTCLog;
        this.conversationStats = conversationStats;
        this.noiseSuppressionManager = noiseSuppressionManager;
        this.experiments = experimentsInterface;
        this.isMeInWaitingHall = gzsVar;
        this.isCallDestroyed = gzsVar2;
        this.nsFeatureDelegate$delegate = new bpn0(new ww(13, this, remoteSettings));
        ListBuilder e = e43.e();
        experimentsInterface.y().getClass();
        this.delegates = e.g();
    }

    private final NSFeatureDelegate getNsFeatureDelegate() {
        return (NSFeatureDelegate) this.nsFeatureDelegate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NSFeatureDelegate nsFeatureDelegate_delegate$lambda$0(MLFeaturesManagerImpl mLFeaturesManagerImpl, RemoteSettings remoteSettings) {
        return new NSFeatureDelegate(mLFeaturesManagerImpl.mlFeaturesInfoDataSource, new NSFeatureConfigProvider(remoteSettings, mLFeaturesManagerImpl.experiments.y().a, mLFeaturesManagerImpl.logger), mLFeaturesManagerImpl.downloadService, mLFeaturesManagerImpl.conversationStats.mlDownloadStat, mLFeaturesManagerImpl.context, mLFeaturesManagerImpl.experiments.y().a, mLFeaturesManagerImpl.logger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNsParams(File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        this.noiseSuppressionManager.setNoiseSuppressionParams(new bp7(18, new sd(this, 7), path));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNsParams$lambda$0(MLFeaturesManagerImpl mLFeaturesManagerImpl) {
        mLFeaturesManagerImpl.conversationStats.audioErrorStat.report(new AudioErrorEvent(UcumUtils.UCUM_NANOSECONDS, "run", "disabled due to stutter", null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NoiseSuppressorActiveState setNsParams$lambda$1(Runnable runnable, String str, NoiseSuppressorActiveState.Builder builder) {
        return builder.setLogTimings(false).setNoiseSuppressorStuttering(false).setServersideAnn(false).setClientsidePlatform(true).setClientsideAnn(true).setInputSampleRate(48000).setOutputSampleRate(48000).setEnhancerKind(NoiseSuppressorActiveState.EnhancerKind.BASELINE).setFallbackTimeLimitMillis(13).setFallbackStutterCountMillis(25).setFallbackTimeframeMillis(600).setonNoiseSuppressorDisabledDueToStutter(runnable).setFilePath(str).build();
    }

    @Override // ru.ok.android.externcalls.sdk.ml.MLFeaturesManager
    public void dispose() {
        this.disposables.dispose();
    }

    @Override // ru.ok.android.externcalls.sdk.ml.MLFeaturesManager
    public void start() {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            final NSFeatureDelegate nSFeatureDelegate = (NSFeatureDelegate) pair.d();
            final fcy fcyVar = (fcy) pair.g();
            this.disposables.b(q.I0(nSFeatureDelegate.checkModel().w(), this.awaitLeftWaitingHall.w(), new c() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$start$1$1
                @Override // io.reactivex.rxjava3.functions.c
                public final MLModelCheckResult apply(MLModelCheckResult mLModelCheckResult, s3q0 s3q0Var) {
                    return mLModelCheckResult;
                }
            }).subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$start$1$2
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(MLModelCheckResult mLModelCheckResult) {
                    RTCLog rTCLog;
                    rTCLog = MLFeaturesManagerImpl.this.logger;
                    rTCLog.log("MLFeaturesManagerImpl", "delegate " + nSFeatureDelegate + ", on success. Model check result " + mLModelCheckResult);
                    izs izsVar = (izs) fcyVar;
                    MLModelCheckResult.Enabled enabled = mLModelCheckResult instanceof MLModelCheckResult.Enabled ? (MLModelCheckResult.Enabled) mLModelCheckResult : null;
                    izsVar.invoke(enabled != null ? enabled.getFile() : null);
                }
            }, new f() { // from class: ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl$start$1$3
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Throwable th) {
                    RTCLog rTCLog;
                    rTCLog = MLFeaturesManagerImpl.this.logger;
                    rTCLog.log("MLFeaturesManagerImpl", "delegate " + nSFeatureDelegate + ", on error " + th);
                    ((izs) fcyVar).invoke(null);
                }
            }));
        }
    }
}
