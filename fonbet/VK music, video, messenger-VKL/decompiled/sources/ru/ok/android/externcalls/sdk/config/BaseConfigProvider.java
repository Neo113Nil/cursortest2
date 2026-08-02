package ru.ok.android.externcalls.sdk.config;

import io.reactivex.rxjava3.core.k;
import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.maybe.i;
import io.reactivex.rxjava3.internal.operators.maybe.j;
import io.reactivex.rxjava3.internal.operators.single.t;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.webrtc.RTCLog;

/* compiled from: BaseConfigProvider.kt */
/* loaded from: classes9.dex */
public abstract class BaseConfigProvider<T> implements ConfigProvider<T> {
    private final String configKey;
    private final RTCLog log;
    private final String logTag;
    private final RemoteSettings settings;

    public BaseConfigProvider(RemoteSettings remoteSettings, RTCLog rTCLog, String str, String str2) {
        this.settings = remoteSettings;
        this.log = rTCLog;
        this.configKey = str;
        this.logTag = str2;
    }

    @Override // ru.ok.android.externcalls.sdk.config.ConfigProvider
    public k<T> getConfig() {
        x<String> xVar = this.settings.get(this.configKey);
        l lVar = new l(this) { // from class: ru.ok.android.externcalls.sdk.config.BaseConfigProvider$getConfig$1
            final /* synthetic */ BaseConfigProvider<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.rxjava3.functions.l
            public final o<? extends T> apply(String str) {
                String str2;
                if (str.length() == 0) {
                    return i.b;
                }
                try {
                    return k.i(this.this$0.parseConfig(str));
                } catch (Throwable th) {
                    RTCLog log = this.this$0.getLog();
                    str2 = ((BaseConfigProvider) this.this$0).logTag;
                    log.reportException(str2, "Can't parse JSON configuration from ".concat(str), th);
                    return new j(th);
                }
            }
        };
        xVar.getClass();
        return new t(xVar, lVar);
    }

    public final RTCLog getLog() {
        return this.log;
    }

    public abstract T parseConfig(String str);
}
