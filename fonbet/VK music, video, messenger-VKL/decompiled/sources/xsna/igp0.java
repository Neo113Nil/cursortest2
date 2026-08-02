package xsna;

/* compiled from: MusicTrackEvents.kt */
/* loaded from: classes3.dex */
public final class igp0 implements yj40 {
    public final boolean a;
    public final String b;

    public igp0(String str, boolean z) {
        this.a = z;
        this.b = "trackMid=" + str + " isLoading=" + z;
    }

    @Override // xsna.yj40
    public final String a() {
        return this.b;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "TrackMixLoading";
    }
}
