package io.appmetrica.analytics.coreapi.internal.identifiers;

import xsna.epx;
import xsna.ho8;

/* loaded from: classes8.dex */
public final class SdkIdentifiers {
    private final String a;
    private final String b;
    private final String c;

    public SdkIdentifiers(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkIdentifiers.a;
        }
        if ((i & 2) != 0) {
            str2 = sdkIdentifiers.b;
        }
        if ((i & 4) != 0) {
            str3 = sdkIdentifiers.c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final SdkIdentifiers copy(String str, String str2, String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return epx.f(this.a, sdkIdentifiers.a) && epx.f(this.b, sdkIdentifiers.b) && epx.f(this.c, sdkIdentifiers.c);
    }

    public final String getDeviceId() {
        return this.b;
    }

    public final String getDeviceIdHash() {
        return this.c;
    }

    public final String getUuid() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkIdentifiers(uuid=");
        sb.append(this.a);
        sb.append(", deviceId=");
        sb.append(this.b);
        sb.append(", deviceIdHash=");
        return ho8.a(sb, this.c, ')');
    }
}
