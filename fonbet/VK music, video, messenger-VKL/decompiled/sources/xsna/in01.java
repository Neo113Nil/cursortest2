package xsna;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class in01 {
    public final int a;

    public in01(int i) {
        this.a = i;
    }

    public final boolean a(int i) {
        return (this.a & i) == i;
    }

    public final boolean b() {
        return !(!a(32) || a(64) || a(128)) || a(64);
    }

    public final boolean c() {
        return b() || a(128);
    }
}
