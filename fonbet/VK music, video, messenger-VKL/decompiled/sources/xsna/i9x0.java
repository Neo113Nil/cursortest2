package xsna;

import com.vk.onetimedonut.api.events.OneTimeDonutEventStatus;

/* compiled from: WallDonutEvent.kt */
/* loaded from: classes4.dex */
public final class i9x0 extends czi {
    public final OneTimeDonutEventStatus c;
    public final int d;
    public final String e;

    public i9x0(OneTimeDonutEventStatus oneTimeDonutEventStatus, int i, String str) {
        super(oneTimeDonutEventStatus);
        this.c = oneTimeDonutEventStatus;
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9x0)) {
            return false;
        }
        i9x0 i9x0Var = (i9x0) obj;
        return this.c == i9x0Var.c && this.d == i9x0Var.d && epx.f(this.e, i9x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, this.c.hashCode() * 31, 31);
    }

    public final OneTimeDonutEventStatus r() {
        return this.c;
    }

    @Override // xsna.czi
    public final String toString() {
        StringBuilder sb = new StringBuilder("WallDonutEvent(status=");
        sb.append(this.c);
        sb.append(", badgeId=");
        sb.append(this.d);
        sb.append(", animationUrl=");
        return ho8.a(sb, this.e, ')');
    }
}
