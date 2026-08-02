package xsna;

/* compiled from: OnReturnToAppAfterEnableOnlyMessengerPushNotifications.kt */
/* loaded from: classes.dex */
public final class ya80 extends sxp {
    public final Throwable b;

    public ya80() {
        this(null);
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya80) && epx.f(this.b, ((ya80) obj).b);
    }

    public final int hashCode() {
        Throwable th = this.b;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("OnReturnToAppAfterEnableOnlyMessengerPushNotifications(error="), this.b, ')');
    }

    public ya80(Throwable th) {
        this.b = th;
    }
}
