package ru.ok.android.externcalls.sdk.settings;

import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.single.a;
import io.reactivex.rxjava3.internal.operators.single.d0;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.o;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.webrtc.RTCLog;
import xsna.bpn0;
import xsna.ck70;
import xsna.jgp;
import xsna.jw30;
import xsna.y57;
import xsna.zcl;

/* compiled from: RemoteSettingsImplV2.kt */
/* loaded from: classes9.dex */
public final class RemoteSettingsImplV2 implements RemoteSettings {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "RemoteSettingsImplV2";
    private final Set<String> keys;
    private final RTCLog log;
    private final OkApiServiceInternal okApiService;
    private final Lazy settingsSource$delegate = new bpn0(new jw30(this, 23));

    /* compiled from: RemoteSettingsImplV2.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public RemoteSettingsImplV2(OkApiServiceInternal okApiServiceInternal, RTCLog rTCLog, Set<String> set) {
        this.okApiService = okApiServiceInternal;
        this.log = rTCLog;
        this.keys = set;
    }

    private final x<Map<String, String>> getSettingsSource() {
        return (x) this.settingsSource$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x settingsSource_delegate$lambda$0(final RemoteSettingsImplV2 remoteSettingsImplV2) {
        return new a(new d0(new o(new n(remoteSettingsImplV2.okApiService.getSettings(remoteSettingsImplV2.keys).q(io.reactivex.rxjava3.schedulers.a.b()), new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$settingsSource$2$1
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(c cVar) {
                RTCLog rTCLog;
                Set set;
                rTCLog = RemoteSettingsImplV2.this.log;
                set = RemoteSettingsImplV2.this.keys;
                rTCLog.log(RemoteSettingsImplV2.LOG_TAG, "Will now read settings by keys " + set);
            }
        }), new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$settingsSource$2$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Map<String, String> map) {
                RTCLog rTCLog;
                rTCLog = RemoteSettingsImplV2.this.log;
                rTCLog.log(RemoteSettingsImplV2.LOG_TAG, map.size() + " keys were loaded: " + map);
            }
        }).h(new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$settingsSource$2$3
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Throwable th) {
                RTCLog rTCLog;
                rTCLog = RemoteSettingsImplV2.this.log;
                rTCLog.logException(RemoteSettingsImplV2.LOG_TAG, "Error reading remote SDK settings", th);
            }
        }), new ck70(8), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map settingsSource_delegate$lambda$0$0(Throwable th) {
        return jgp.b;
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public x<String> get(final String str) {
        return new o(getSettingsSource().l(new l() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$get$1
            @Override // io.reactivex.rxjava3.functions.l
            public final String apply(Map<String, String> map) {
                String str2 = map.get(str);
                return str2 == null ? "" : str2;
            }
        }), new f() { // from class: ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2$get$2
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(String str2) {
                RTCLog rTCLog;
                rTCLog = RemoteSettingsImplV2.this.log;
                rTCLog.log(RemoteSettingsImplV2.LOG_TAG, y57.a("got value for key ", str, ": ", str2));
            }
        }).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // ru.ok.android.externcalls.sdk.api.RemoteSettings
    public void release() {
    }
}
