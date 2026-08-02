package com.yandex.messenger.websdk.api;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messenger/websdk/api/PushToken;", "", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PushToken {
    public final String a;
    public final PushTokenType b;

    public PushToken(String str, PushTokenType pushTokenType) {
        this.a = str;
        this.b = pushTokenType;
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final PushTokenType getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushToken)) {
            return false;
        }
        PushToken pushToken = (PushToken) obj;
        return this.a.equals(pushToken.a) && this.b == pushToken.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PushToken(token=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
