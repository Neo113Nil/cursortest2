package xsna;

/* compiled from: GroupsMultiInviteResponse.kt */
/* loaded from: classes14.dex */
public final class lqu {
    public final int a;

    public lqu(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqu) && this.a == ((lqu) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("GroupsMultiInviteResponse(invitesSentCount="), this.a, ')');
    }
}
