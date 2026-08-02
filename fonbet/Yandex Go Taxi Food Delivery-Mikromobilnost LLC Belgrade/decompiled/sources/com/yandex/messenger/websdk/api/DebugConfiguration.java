package com.yandex.messenger.websdk.api;

import defpackage.nnm;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messenger/websdk/api/DebugConfiguration;", "", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DebugConfiguration {
    public final boolean a = true;
    public final boolean b = true;
    public final boolean c = true;
    public final boolean d = true;
    public final boolean e = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugConfiguration)) {
            return false;
        }
        DebugConfiguration debugConfiguration = (DebugConfiguration) obj;
        return this.a == debugConfiguration.a && this.b == debugConfiguration.b && this.c == debugConfiguration.c && this.d == debugConfiguration.d && this.e == debugConfiguration.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = qv10.u("DebugConfiguration(customYandexHost=null, pingTimeout=null, enableAsserts=", ", logHttp=", ", enableWebLogs=", this.a, this.b);
        nnm.v(", enableWebDebugging=", ", enableDebugLogs=", u, this.c, this.d);
        return x4e.i(u, this.e, Extension.C_BRAKE);
    }
}
