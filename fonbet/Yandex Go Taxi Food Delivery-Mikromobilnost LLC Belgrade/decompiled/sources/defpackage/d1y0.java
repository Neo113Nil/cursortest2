package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class d1y0 {
    public final int a;
    public final DriveState b;
    public final boolean c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public d1y0(int i, DriveState driveState, boolean z, long j, boolean z2, boolean z3) {
        this.a = i;
        this.b = driveState;
        this.c = z;
        this.d = j;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1y0)) {
            return false;
        }
        d1y0 d1y0Var = (d1y0) obj;
        return this.a == d1y0Var.a && this.b == d1y0Var.b && this.c == d1y0Var.c && this.d == d1y0Var.d && this.e == d1y0Var.e && this.f == d1y0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(qv10.c(unr0.e((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedState(feedState=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", needHaptic=");
        sb.append(this.c);
        sb.append(", openDelayInMilliseconds=");
        sb.append(this.d);
        n.z(", isScrollEnabled=", ", isMultipleHeightChangeEnabled=", sb, this.e, this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
