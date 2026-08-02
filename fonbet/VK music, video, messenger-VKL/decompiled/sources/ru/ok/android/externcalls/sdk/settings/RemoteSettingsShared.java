package ru.ok.android.externcalls.sdk.settings;

import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.single.d0;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.schedulers.a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.api.request.GetSettings;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.epx;
import xsna.gzs;
import xsna.jgp;
import xsna.po4;
import xsna.rr;
import xsna.s3q0;
import xsna.sc2;
import xsna.y57;
import xsna.zcl;

/* compiled from: RemoteSettingsShared.kt */
/* loaded from: classes9.dex */
public final class RemoteSettingsShared implements RemoteSettings {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "RemoteSettingsShared";

    @Deprecated
    public static final long SETTINGS_REREAD_DELAY_MS = 5000;
    private volatile x<Map<String, String>> cachedSettingsSource;
    private final Long keepSharedSettingsMs;
    private final Set<String> keys;
    private final gzs<RTCLog> log;
    private x<Map<String, String>> newSettings;
    private c readSettingsDisposable;
    private final RxApiClient rxApiClient;
    private long settingsLastUpdateTime;
    private final ReentrantLock settingsLock;
    private final TimeProvider timeProvider;

    /* compiled from: RemoteSettingsShared.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteSettingsShared(RxApiClient rxApiClient, TimeProvider timeProvider, gzs<? extends RTCLog> gzsVar, Set<String> set, Long l) {
        this.rxApiClient = rxApiClient;
        this.timeProvider = timeProvider;
        this.log = gzsVar;
        this.keys = set;
        this.keepSharedSettingsMs = l;
        this.settingsLock = new ReentrantLock();
        this.cachedSettingsSource = createSettingsSource();
        this.readSettingsDisposable = EmptyDisposable.INSTANCE;
        if (l != null) {
            ((RTCLog) gzsVar.invoke()).log(LOG_TAG, "Schedule settings update");
            a.b().c(new po4(this, 6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RemoteSettingsShared remoteSettingsShared) {
        remoteSettingsShared.m348readSettingsIoAF18A(remoteSettingsShared.cachedSettingsSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySettings(x<Map<String, String>> xVar) {
        if (this.keepSharedSettingsMs != null) {
            ReentrantLock reentrantLock = this.settingsLock;
            reentrantLock.lock();
            try {
                if (epx.f(xVar, this.newSettings)) {
                    this.log.invoke().log(LOG_TAG, "Apply new settings source");
                    this.newSettings = null;
                    this.cachedSettingsSource = xVar;
                } else {
                    this.log.invoke().log(LOG_TAG, "Received settings update doesn't match expected one. Ignore");
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    private final x<Map<String, String>> createSettingsSource() {
        return new io.reactivex.rxjava3.internal.operators.single.a(new d0(new o(new n(getSettings(this.keys).q(a.b()), new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$createSettingsSource$1
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(c cVar) {
                gzs gzsVar;
                Set set;
                gzsVar = RemoteSettingsShared.this.log;
                RTCLog rTCLog = (RTCLog) gzsVar.invoke();
                set = RemoteSettingsShared.this.keys;
                rTCLog.log(RemoteSettingsShared.LOG_TAG, "Will now read settings by keys " + set);
            }
        }), new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$createSettingsSource$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Map<String, String> map) {
                gzs gzsVar;
                gzsVar = RemoteSettingsShared.this.log;
                ((RTCLog) gzsVar.invoke()).log(RemoteSettingsShared.LOG_TAG, map.size() + " keys were loaded: " + map);
                RemoteSettingsShared.this.rememberLastUpdateTime();
            }
        }).h(new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$createSettingsSource$3
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                gzs gzsVar;
                gzsVar = RemoteSettingsShared.this.log;
                ((RTCLog) gzsVar.invoke()).logException(RemoteSettingsShared.LOG_TAG, "Error reading remote SDK settings", th);
                RemoteSettingsShared.this.scheduleCreateNewSettings();
            }
        }), new rr(29), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map createSettingsSource$lambda$0(Throwable th) {
        return jgp.b;
    }

    private final x<Map<String, String>> getSettings(Set<String> set) {
        return this.rxApiClient.execute((ApiExecutableRequest) new GetSettings.Request(set));
    }

    private final x<Map<String, String>> getSettingsSource() {
        if (this.keepSharedSettingsMs != null) {
            ReentrantLock reentrantLock = this.settingsLock;
            reentrantLock.lock();
            try {
                if (this.settingsLastUpdateTime > 0 && this.timeProvider.getMsSinceBoot() - this.settingsLastUpdateTime >= this.keepSharedSettingsMs.longValue() && this.newSettings == null) {
                    scheduleCreateNewSettings();
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        return this.cachedSettingsSource;
    }

    /* renamed from: readSettings-IoAF18A, reason: not valid java name */
    private final Object m348readSettingsIoAF18A(final x<Map<String, String>> xVar) {
        try {
            this.log.invoke().log(LOG_TAG, "Recreate remote settings cache (scheduled action)");
            ReentrantLock reentrantLock = this.settingsLock;
            reentrantLock.lock();
            try {
                this.readSettingsDisposable.dispose();
                this.readSettingsDisposable = xVar.subscribe(new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$readSettings$1$1$1
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Map<String, String> map) {
                        gzs gzsVar;
                        gzsVar = RemoteSettingsShared.this.log;
                        ((RTCLog) gzsVar.invoke()).log(RemoteSettingsShared.LOG_TAG, "Got updated settings, apply");
                        RemoteSettingsShared.this.applySettings(xVar);
                    }
                }, new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$readSettings$1$1$2
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Throwable th) {
                        gzs gzsVar;
                        gzsVar = RemoteSettingsShared.this.log;
                        ((RTCLog) gzsVar.invoke()).log(RemoteSettingsShared.LOG_TAG, "Error on settings update. Try again later");
                        RemoteSettingsShared.this.scheduleCreateNewSettings();
                    }
                });
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
                return s3q0.a;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rememberLastUpdateTime() {
        if (this.keepSharedSettingsMs != null) {
            ReentrantLock reentrantLock = this.settingsLock;
            reentrantLock.lock();
            try {
                this.settingsLastUpdateTime = this.timeProvider.getMsSinceBoot();
                s3q0 s3q0Var = s3q0.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleCreateNewSettings() {
        ReentrantLock reentrantLock = this.settingsLock;
        reentrantLock.lock();
        try {
            this.newSettings = createSettingsSource();
            this.log.invoke().log(LOG_TAG, "Expired cached settings found. Schedule reread in 5000ms");
            a.b().d(new sc2(this, 7), 5000L, TimeUnit.MILLISECONDS);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleCreateNewSettings$lambda$0$0(RemoteSettingsShared remoteSettingsShared) {
        ReentrantLock reentrantLock = remoteSettingsShared.settingsLock;
        reentrantLock.lock();
        try {
            x<Map<String, String>> xVar = remoteSettingsShared.newSettings;
            if (xVar != null) {
                remoteSettingsShared.m348readSettingsIoAF18A(xVar);
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public x<String> get(final String str) {
        return new o(getSettingsSource().l(new l() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$get$1
            @Override // io.reactivex.rxjava3.functions.l
            public final String apply(Map<String, String> map) {
                String str2 = map.get(str);
                return str2 == null ? "" : str2;
            }
        }), new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared$get$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(String str2) {
                gzs gzsVar;
                gzsVar = RemoteSettingsShared.this.log;
                ((RTCLog) gzsVar.invoke()).log(RemoteSettingsShared.LOG_TAG, y57.a("got value for key ", str, ": ", str2));
            }
        }).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public /* synthetic */ RemoteSettingsShared(RxApiClient rxApiClient, TimeProvider timeProvider, gzs gzsVar, Set set, Long l, int i, zcl zclVar) {
        this(rxApiClient, timeProvider, gzsVar, set, (i & 16) != 0 ? null : l);
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public void release() {
    }
}
