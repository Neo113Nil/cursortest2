package xsna;

import com.vk.clips.sdk.models.SdkVideoRestriction;

/* compiled from: RestrictionOverlayMappingData.kt */
/* loaded from: classes17.dex */
public final class bdg0 {
    public final boolean a;
    public final String b;
    public final SdkVideoRestriction c;

    public bdg0(boolean z, String str, SdkVideoRestriction sdkVideoRestriction) {
        this.a = z;
        this.b = str;
        this.c = sdkVideoRestriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdg0)) {
            return false;
        }
        bdg0 bdg0Var = (bdg0) obj;
        return this.a == bdg0Var.a && epx.f(this.b, bdg0Var.b) && epx.f(this.c, bdg0Var.c);
    }

    public final int hashCode() {
        int a = urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        SdkVideoRestriction sdkVideoRestriction = this.c;
        return a + (sdkVideoRestriction == null ? 0 : sdkVideoRestriction.hashCode());
    }

    public final String toString() {
        return "RestrictionOverlayMappingData(visible=" + this.a + ", uniqueKey=" + this.b + ", restriction=" + this.c + ')';
    }
}
