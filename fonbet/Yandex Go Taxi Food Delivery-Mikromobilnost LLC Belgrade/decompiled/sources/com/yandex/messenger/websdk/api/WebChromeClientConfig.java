package com.yandex.messenger.websdk.api;

import defpackage.jl40;
import defpackage.tls;
import defpackage.weu;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messenger/websdk/api/WebChromeClientConfig;", "", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class WebChromeClientConfig {
    public final tls a;

    public WebChromeClientConfig(weu weuVar) {
        this.a = weuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebChromeClientConfig) && jl40.l(this.a, ((WebChromeClientConfig) obj).a);
    }

    public final int hashCode() {
        tls tlsVar = this.a;
        if (tlsVar == null) {
            return 0;
        }
        return tlsVar.hashCode();
    }

    public final String toString() {
        return "WebChromeClientConfig(showFileChooserDelegateProvider=" + this.a + Extension.C_BRAKE;
    }

    public WebChromeClientConfig() {
        this(null);
    }
}
