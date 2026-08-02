package com.yandex.messaging.core.net.entities;

import defpackage.jl40;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/YaDiskErrorInfo;", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class YaDiskErrorInfo {
    public final int a;
    public final String b;

    public YaDiskErrorInfo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YaDiskErrorInfo)) {
            return false;
        }
        YaDiskErrorInfo yaDiskErrorInfo = (YaDiskErrorInfo) obj;
        return this.a == yaDiskErrorInfo.a && jl40.l(this.b, yaDiskErrorInfo.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.l(this.a, "YaDiskErrorInfo(httpCode=", ", code=", this.b, Extension.C_BRAKE);
    }
}
