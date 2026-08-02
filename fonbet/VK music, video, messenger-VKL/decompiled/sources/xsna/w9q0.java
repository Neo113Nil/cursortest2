package xsna;

import com.vk.clips.design.view.component.video.preview.UploadBadgeDesignIconType;

/* compiled from: UploadBadgeState.kt */
/* loaded from: classes16.dex */
public final class w9q0 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final UploadBadgeDesignIconType e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public w9q0(String str, int i, int i2, String str2, UploadBadgeDesignIconType uploadBadgeDesignIconType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = uploadBadgeDesignIconType;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9q0)) {
            return false;
        }
        w9q0 w9q0Var = (w9q0) obj;
        return epx.f(this.a, w9q0Var.a) && this.b == w9q0Var.b && this.c == w9q0Var.c && epx.f(this.d, w9q0Var.d) && this.e == w9q0Var.e && this.f == w9q0Var.f && this.g == w9q0Var.g && this.h == w9q0Var.h && this.i == w9q0Var.i && this.j == w9q0Var.j;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.j) + qoy.b(qoy.b(qoy.b(qoy.b((this.e.hashCode() + urd0.a(shy.a(this.c, shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadBadgeState(previewUrl=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", uploadId=");
        sb.append(this.c);
        sb.append(", statusText=");
        sb.append(this.d);
        sb.append(", iconType=");
        sb.append(this.e);
        sb.append(", isVisible=");
        sb.append(this.f);
        sb.append(", isDone=");
        sb.append(this.g);
        sb.append(", isCancelled=");
        sb.append(this.h);
        sb.append(", isFailed=");
        sb.append(this.i);
        sb.append(", wasHiddenByUserAction=");
        return defpackage.q0.a(sb, this.j, ')');
    }

    public w9q0() {
        this(null, 0, 0, "", UploadBadgeDesignIconType.PROGRESS, false, false, false, false, false);
    }
}
