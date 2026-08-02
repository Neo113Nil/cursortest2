package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;

/* compiled from: AdsBindingModel.kt */
/* loaded from: classes17.dex */
public final class qu0 {
    public final SdkClipVideoFile a;
    public final nlh0 b;
    public final kih0 c;
    public final wp50 d;

    public qu0(SdkClipVideoFile sdkClipVideoFile, nlh0 nlh0Var, kih0 kih0Var, wp50 wp50Var) {
        this.a = sdkClipVideoFile;
        this.b = nlh0Var;
        this.c = kih0Var;
        this.d = wp50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu0)) {
            return false;
        }
        qu0 qu0Var = (qu0) obj;
        return epx.f(this.a, qu0Var.a) && epx.f(this.b, qu0Var.b) && epx.f(this.c, qu0Var.c) && epx.f(this.d, qu0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        wp50 wp50Var = this.d;
        return hashCode + (wp50Var == null ? 0 : wp50Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsBindingModel(video=");
        sb.append(this.a);
        sb.append(", videoFileController=");
        sb.append(this.b);
        sb.append(", autoPlay=");
        sb.append(this.c);
        sb.append(", myTargetFacade=");
        return iq.c(sb, this.d, ')');
    }
}
