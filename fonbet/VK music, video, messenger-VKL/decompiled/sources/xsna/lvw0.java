package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;

/* compiled from: VoipPlaylistToWatch.kt */
/* loaded from: classes7.dex */
public final class lvw0 {
    public final int a;
    public final UserId b;
    public final String c;
    public final int d;
    public final int e;
    public final Image f;
    public final boolean g;

    public lvw0(int i, UserId userId, String str, int i2, int i3, Image image, boolean z) {
        this.a = i;
        this.b = userId;
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = image;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvw0)) {
            return false;
        }
        lvw0 lvw0Var = (lvw0) obj;
        return this.a == lvw0Var.a && epx.f(this.b, lvw0Var.b) && epx.f(this.c, lvw0Var.c) && this.d == lvw0Var.d && this.e == lvw0Var.e && epx.f(this.f, lvw0Var.f) && this.g == lvw0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + fq.b(this.f, shy.a(this.e, shy.a(this.d, urd0.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipPlaylistToWatch(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", updatedTime=");
        sb.append(this.d);
        sb.append(", count=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", imageBlur=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
