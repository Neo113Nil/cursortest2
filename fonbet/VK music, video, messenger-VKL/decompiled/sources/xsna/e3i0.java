package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: SeekBarBindingModel.kt */
/* loaded from: classes17.dex */
public final class e3i0 {
    public final SdkVideoFile a;
    public final kih0 b;
    public final boolean c;

    public e3i0(SdkVideoFile sdkVideoFile, kih0 kih0Var, boolean z) {
        this.a = sdkVideoFile;
        this.b = kih0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3i0)) {
            return false;
        }
        e3i0 e3i0Var = (e3i0) obj;
        return epx.f(this.a, e3i0Var.a) && epx.f(this.b, e3i0Var.b) && this.c == e3i0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeekBarBindingModel(video=");
        sb.append(this.a);
        sb.append(", autoPlay=");
        sb.append(this.b);
        sb.append(", isSeekingEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
