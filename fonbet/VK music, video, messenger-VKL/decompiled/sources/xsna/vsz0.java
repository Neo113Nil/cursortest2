package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class vsz0 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ w601 d;

    public vsz0(w601 w601Var, String str, long j) {
        this.d = w601Var;
        this.b = str;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        w601 w601Var = this.d;
        w601Var.k();
        String str = this.b;
        exc0.f(str);
        zk3 zk3Var = w601Var.f;
        boolean isEmpty = zk3Var.isEmpty();
        long j = this.c;
        if (isEmpty) {
            w601Var.g = j;
        }
        Integer num = (Integer) zk3Var.get(str);
        if (num != null) {
            zk3Var.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        if (zk3Var.d < 100) {
            zk3Var.put(str, 1);
            w601Var.e.put(str, Long.valueOf(j));
        } else {
            k901 k901Var = ((mb01) w601Var.b).j;
            mb01.k(k901Var);
            k901Var.l.a("Too many ads visible");
        }
    }
}
