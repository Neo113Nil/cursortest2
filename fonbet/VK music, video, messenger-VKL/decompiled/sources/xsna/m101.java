package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class m101 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ w601 d;

    public m101(w601 w601Var, String str, long j) {
        this.d = w601Var;
        this.b = str;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        w601 w601Var = this.d;
        w601Var.k();
        zk3 zk3Var = w601Var.e;
        mb01 mb01Var = (mb01) w601Var.b;
        String str = this.b;
        exc0.f(str);
        zk3 zk3Var2 = w601Var.f;
        Integer num = (Integer) zk3Var2.get(str);
        if (num == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.b(str, "Call to endAdUnitExposure for unknown ad unit id");
            return;
        }
        kg01 kg01Var = mb01Var.p;
        k901 k901Var2 = mb01Var.j;
        mb01.j(kg01Var);
        dg01 q = kg01Var.q(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            zk3Var2.put(str, Integer.valueOf(intValue));
            return;
        }
        zk3Var2.remove(str);
        Long l = (Long) zk3Var.get(str);
        long j = this.c;
        if (l == null) {
            mb01.k(k901Var2);
            k901Var2.i.a("First ad unit exposure time was never set");
        } else {
            long longValue = l.longValue();
            zk3Var.remove(str);
            w601Var.p(str, j - longValue, q);
        }
        if (zk3Var2.isEmpty()) {
            long j2 = w601Var.g;
            if (j2 == 0) {
                mb01.k(k901Var2);
                k901Var2.i.a("First ad exposure time was never set");
            } else {
                w601Var.o(j - j2, q);
                w601Var.g = 0L;
            }
        }
    }
}
