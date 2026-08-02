package xsna;

import android.widget.FrameLayout;
import com.vk.dto.common.VideoFile;
import one.video.transform.TransformController;

/* compiled from: DonutDelegate.kt */
/* loaded from: classes14.dex */
public final class dzn {
    public final VideoFile a;
    public final FrameLayout b;
    public final Integer c;
    public final Integer d;
    public final TransformController.ScaleType e;
    public final boolean f;

    public dzn(VideoFile videoFile, FrameLayout frameLayout, Integer num, Integer num2, TransformController.ScaleType scaleType, boolean z) {
        this.a = videoFile;
        this.b = frameLayout;
        this.c = num;
        this.d = num2;
        this.e = scaleType;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzn)) {
            return false;
        }
        dzn dznVar = (dzn) obj;
        return epx.f(this.a, dznVar.a) && epx.f(this.b, dznVar.b) && epx.f(this.c, dznVar.c) && epx.f(this.d, dznVar.d) && this.e == dznVar.e && this.f == dznVar.f;
    }

    public final int hashCode() {
        VideoFile videoFile = this.a;
        int hashCode = (videoFile == null ? 0 : videoFile.hashCode()) * 31;
        FrameLayout frameLayout = this.b;
        int hashCode2 = (hashCode + (frameLayout == null ? 0 : frameLayout.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutChipTranslationParams(videoFile=");
        sb.append(this.a);
        sb.append(", container=");
        sb.append(this.b);
        sb.append(", videoWidth=");
        sb.append(this.c);
        sb.append(", videoHeight=");
        sb.append(this.d);
        sb.append(", scaleType=");
        sb.append(this.e);
        sb.append(", isMinified=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
