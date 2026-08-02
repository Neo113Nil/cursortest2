package xsna;

/* compiled from: LeaveSessionRoomEvent.kt */
/* loaded from: classes7.dex */
public final class izy implements gy50 {
    public final boolean a;

    public izy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof izy) && this.a == ((izy) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("LeaveSessionRoomEvent(didIStartVideo="), this.a, ')');
    }
}
