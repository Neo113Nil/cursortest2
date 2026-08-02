package com.ybsdk.feature.pinstorage.internal.data;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a {
    public final Map a;
    public final PinStorageImpl$GetPinErrorReason b;

    public a(Map map, PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason) {
        this.a = map;
        this.b = pinStorageImpl$GetPinErrorReason;
    }

    public final PinStorageImpl$GetPinErrorReason a() {
        return this.b;
    }

    public final Map b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PinStorageImpl$GetPinErrorReason pinStorageImpl$GetPinErrorReason = this.b;
        return hashCode + (pinStorageImpl$GetPinErrorReason == null ? 0 : pinStorageImpl$GetPinErrorReason.hashCode());
    }

    public final String toString() {
        return "TokensData(tokensMap=" + this.a + ", errorReason=" + this.b + Extension.C_BRAKE;
    }
}
