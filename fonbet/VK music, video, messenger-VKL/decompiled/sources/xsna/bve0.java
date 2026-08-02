package xsna;

/* compiled from: RadioEvents.kt */
/* loaded from: classes3.dex */
public final class bve0 implements yj40 {
    public final int a;
    public final String b;

    public bve0(int i) {
        this.a = i;
        this.b = lhg.a(i, "stationId=");
    }

    @Override // xsna.yj40
    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "RadioStationUnfollowed";
    }
}
