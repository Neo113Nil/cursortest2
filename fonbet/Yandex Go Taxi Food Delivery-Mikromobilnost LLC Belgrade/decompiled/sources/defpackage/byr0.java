package defpackage;

import com.adjust.sdk.Constants;

/* loaded from: classes13.dex */
public final class byr0 implements ryr0 {
    public static final byr0 a = new byr0();

    @Override // defpackage.b52
    public final String a() {
        return Constants.DEEPLINK;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof byr0);
    }

    public final int hashCode() {
        return -1019991851;
    }

    public final String toString() {
        return "Deeplink";
    }
}
