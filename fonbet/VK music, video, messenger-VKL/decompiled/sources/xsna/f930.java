package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: ClipMoreMenuParams.kt */
/* loaded from: classes17.dex */
public final class f930 implements z830 {
    public final SdkVideoFile a;
    public final gzs<s3q0> b;

    public f930(SdkVideoFile sdkVideoFile, gzs<s3q0> gzsVar) {
        this.a = sdkVideoFile;
        this.b = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f930)) {
            return false;
        }
        f930 f930Var = (f930) obj;
        return epx.f(this.a, f930Var.a) && epx.f(this.b, f930Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gzs<s3q0> gzsVar = this.b;
        return hashCode + (gzsVar == null ? 0 : gzsVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoNotShowSimilarClips(clip=");
        sb.append(this.a);
        sb.append(", analyticsCancelEventCallBack=");
        return uf3.d(sb, this.b, ')');
    }
}
