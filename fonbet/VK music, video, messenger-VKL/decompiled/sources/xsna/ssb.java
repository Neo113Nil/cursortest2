package xsna;

/* compiled from: ChatMakeLinkConfig.kt */
/* loaded from: classes2.dex */
public final class ssb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public ssb() {
        this(false, 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssb)) {
            return false;
        }
        ssb ssbVar = (ssb) obj;
        return this.a == ssbVar.a && this.b == ssbVar.b && this.c == ssbVar.c && this.d == ssbVar.d && this.e == ssbVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMakeLinkConfig(isShareEnabled=");
        sb.append(this.a);
        sb.append(", isCopyEnabled=");
        sb.append(this.b);
        sb.append(", isQrEnabled=");
        sb.append(this.c);
        sb.append(", isInvalidateEnabled=");
        sb.append(this.d);
        sb.append(", visibleMessagesLimitForInvite=");
        return vu5.b(sb, this.e, ')');
    }

    public ssb(boolean z, int i, int i2) {
        z = (i2 & 8) != 0 ? true : z;
        i = (i2 & 16) != 0 ? 0 : i;
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = z;
        this.e = i;
    }
}
