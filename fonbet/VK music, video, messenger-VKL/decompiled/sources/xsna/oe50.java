package xsna;

/* compiled from: MusicUpdateSubscriptionEvent.kt */
/* loaded from: classes.dex */
public final class oe50 implements yj40 {
    public final String a;

    public oe50(boolean z, long j) {
        this.a = "hasSubscription=" + z + ", expiresDate=" + j;
    }

    @Override // xsna.yj40
    public final String a() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicUpdateSubscriptionEvent";
    }
}
