package defpackage;

/* loaded from: classes2.dex */
public final class ak21 {
    public final String a;

    public ak21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak21) && this.a.equals(((ak21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("UserAvatarInfo(avatarUrl="), this.a, ')');
    }
}
