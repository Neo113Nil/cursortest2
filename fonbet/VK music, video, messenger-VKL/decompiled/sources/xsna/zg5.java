package xsna;

import com.vk.clips.sdk.models.SdkImages;

/* compiled from: ClipsGridBlockState.kt */
/* loaded from: classes17.dex */
public final class zg5 {
    public final SdkImages a;
    public final kih0 b;
    public final oi5 c;
    public final vae d;
    public final tlo0 e;

    public zg5(SdkImages sdkImages, kih0 kih0Var, oi5 oi5Var, vae vaeVar, tlo0 tlo0Var) {
        this.a = sdkImages;
        this.b = kih0Var;
        this.c = oi5Var;
        this.d = vaeVar;
        this.e = tlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg5)) {
            return false;
        }
        zg5 zg5Var = (zg5) obj;
        return epx.f(this.a, zg5Var.a) && epx.f(this.b, zg5Var.b) && epx.f(this.c, zg5Var.c) && epx.f(this.d, zg5Var.d) && epx.f(this.e, zg5Var.e);
    }

    public final int hashCode() {
        SdkImages sdkImages = this.a;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((sdkImages == null ? 0 : sdkImages.hashCode()) * 31)) * 31)) * 31;
        vae vaeVar = this.d;
        int hashCode2 = (hashCode + (vaeVar == null ? 0 : vaeVar.hashCode())) * 31;
        tlo0 tlo0Var = this.e;
        return hashCode2 + (tlo0Var != null ? tlo0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoPlayClipItem(previewImage=");
        sb.append(this.a);
        sb.append(", autoPlay=");
        sb.append(this.b);
        sb.append(", autoPlayTrackingData=");
        sb.append(this.c);
        sb.append(", badge=");
        sb.append(this.d);
        sb.append(", accessibilityDescription=");
        return bt.a(sb, this.e, ')');
    }
}
