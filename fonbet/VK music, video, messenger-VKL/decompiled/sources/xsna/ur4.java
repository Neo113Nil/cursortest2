package xsna;

import android.net.Uri;
import java.util.Collection;

/* compiled from: AudioMsgTrack.kt */
/* loaded from: classes15.dex */
public final class ur4 {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final String f;
    public final int g;
    public final Collection<Uri> h;

    /* JADX WARN: Multi-variable type inference failed */
    public ur4(int i, long j, long j2, long j3, int i2, String str, int i3, Collection<? extends Uri> collection) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = str;
        this.g = i3;
        this.h = collection;
    }

    public final int a() {
        return this.a;
    }

    public final Collection<Uri> b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur4)) {
            return false;
        }
        ur4 ur4Var = (ur4) obj;
        return this.a == ur4Var.a && this.b == ur4Var.b && this.c == ur4Var.c && this.d == ur4Var.d && this.e == ur4Var.e && epx.f(this.f, ur4Var.f) && this.g == ur4Var.g && epx.f(this.h, ur4Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + shy.a(this.g, urd0.a(shy.a(this.e, bh10.a(bh10.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioMsgTrack(localId=");
        sb.append(this.a);
        sb.append(", vkId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", dialogId=");
        sb.append(this.d);
        sb.append(", cnvMsgId=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", durationSeconds=");
        sb.append(this.g);
        sb.append(", source=");
        return l4.h(sb, this.h, ')');
    }
}
