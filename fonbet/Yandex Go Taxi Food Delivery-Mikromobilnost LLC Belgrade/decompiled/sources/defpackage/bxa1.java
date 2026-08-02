package defpackage;

/* loaded from: classes.dex */
public final class bxa1 implements Runnable {
    public final /* synthetic */ qwa1 a;
    public final /* synthetic */ qwa1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ jya1 x;

    public bxa1(jya1 jya1Var, qwa1 qwa1Var, qwa1 qwa1Var2, long j, boolean z) {
        this.a = qwa1Var;
        this.b = qwa1Var2;
        this.c = j;
        this.w = z;
        this.x = jya1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.Qg(this.a, this.b, this.c, this.w, null);
    }
}
