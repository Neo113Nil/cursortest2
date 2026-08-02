package ru.ok.android.webrtc.signaling.api;

/* loaded from: classes9.dex */
public final class f implements Runnable {
    public final c a;
    public final /* synthetic */ Signaling b;

    public f(Signaling signaling, c cVar) {
        this.b = signaling;
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.log(Signaling.TAG, "<!> send retry -> " + this.a);
        this.b.f.send(this.a.a);
    }
}
