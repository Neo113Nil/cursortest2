package xsna;

/* compiled from: AudioBookEvents.kt */
/* loaded from: classes3.dex */
public final class wj4 extends gg4 {
    public final String b;

    public wj4(int i) {
        super(i);
        this.b = lhg.a(i, "audioBookId=");
    }

    @Override // xsna.yj40
    public final String a() {
        return this.b;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "AudioBookSubscribe";
    }
}
