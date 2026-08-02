package xsna;

/* compiled from: ErrorEvents.kt */
/* loaded from: classes3.dex */
public final class xs20 implements yj40 {
    public final String a;

    public xs20(String str) {
        this.a = str;
    }

    @Override // xsna.yj40
    public final String a() {
        return "";
    }

    public final String b() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MixNotFoundErrorEvent, mixId=" + this.a;
    }
}
