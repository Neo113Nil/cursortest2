package xsna;

/* compiled from: VideoRouterClickTracker.kt */
/* loaded from: classes2.dex */
public final class zdt0 {
    public final lt0 a;
    public long b;

    public zdt0(lt0 lt0Var) {
        this.a = lt0Var;
    }

    public final void a(String str) {
        if (str == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b < 500) {
            return;
        }
        this.b = currentTimeMillis;
        this.a.invoke(str);
    }
}
