package xsna;

/* compiled from: MusicPlayerEvents.kt */
/* loaded from: classes3.dex */
public final class dcg0 implements yj40 {
    public final String a;
    public final String b;
    public final String c;

    public dcg0() {
        this(null);
    }

    @Override // xsna.yj40
    public final String a() {
        return this.c;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return this.b;
    }

    public dcg0(String str) {
        this.a = str;
        this.b = "OnboardingShown";
        this.c = go9.b("requestId=", str);
    }
}
