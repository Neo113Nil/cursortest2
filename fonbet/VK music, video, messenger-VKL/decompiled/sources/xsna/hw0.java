package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdsItemClipState.kt */
/* loaded from: classes17.dex */
public final class hw0 {
    public final SdkClipVideoFile a;
    public final String b;
    public final CharSequence c;
    public final m2m d;
    public final String e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new j70(this, 1));

    public hw0(SdkClipVideoFile sdkClipVideoFile, String str, CharSequence charSequence, m2m m2mVar, String str2) {
        this.a = sdkClipVideoFile;
        this.b = str;
        this.c = charSequence;
        this.d = m2mVar;
        this.e = str2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SdkClipVideoFile a() {
        return (SdkClipVideoFile) this.f.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw0)) {
            return false;
        }
        hw0 hw0Var = (hw0) obj;
        return epx.f(this.a, hw0Var.a) && epx.f(this.b, hw0Var.b) && epx.f(this.c, hw0Var.c) && epx.f(this.d, hw0Var.d) && epx.f(this.e, hw0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + u11.c(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsItemClipState(clip=");
        sb.append(this.a);
        sb.append(", uniqueKey=");
        sb.append(this.b);
        sb.append(", formattedDescription=");
        sb.append((Object) this.c);
        sb.append(", descriptionState=");
        sb.append(this.d);
        sb.append(", coverUrl=");
        return ho8.a(sb, this.e, ')');
    }
}
