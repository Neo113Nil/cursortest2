package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.sdk.shared.upload.badge.UploadBadgeIconType;

/* compiled from: UploadBadgeState.kt */
/* loaded from: classes17.dex */
public final class v9q0 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final UploadBadgeIconType e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public v9q0() {
        this(null, 0, 0, false, false, false, false, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9q0)) {
            return false;
        }
        v9q0 v9q0Var = (v9q0) obj;
        return epx.f(this.a, v9q0Var.a) && this.b == v9q0Var.b && this.c == v9q0Var.c && epx.f(this.d, v9q0Var.d) && this.e == v9q0Var.e && this.f == v9q0Var.f && this.g == v9q0Var.g && this.h == v9q0Var.h && this.i == v9q0Var.i && this.j == v9q0Var.j;
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

    public v9q0(String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        str = (i3 & 1) != 0 ? null : str;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        UploadBadgeIconType uploadBadgeIconType = UploadBadgeIconType.PROGRESS;
        z = (i3 & 32) != 0 ? false : z;
        z2 = (i3 & 64) != 0 ? false : z2;
        z3 = (i3 & 128) != 0 ? false : z3;
        z4 = (i3 & 256) != 0 ? false : z4;
        z5 = (i3 & 512) != 0 ? false : z5;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = "";
        this.e = uploadBadgeIconType;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }
}
