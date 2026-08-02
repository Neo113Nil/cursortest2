package xsna;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class bd01 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ cd01 f;

    public bd01(cd01 cd01Var, String str, String str2, String str3, long j) {
        this.f = cd01Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj01 qj01Var = this.f.a;
        String str = this.c;
        String str2 = this.b;
        if (str2 == null) {
            qj01Var.d().k();
            String str3 = qj01Var.E;
            if (str3 == null || str3.equals(str)) {
                qj01Var.E = str;
                qj01Var.D = null;
                return;
            }
            return;
        }
        dg01 dg01Var = new dg01(this.d, str2, this.e);
        qj01Var.d().k();
        String str4 = qj01Var.E;
        if (str4 != null) {
            str4.equals(str);
        }
        qj01Var.E = str;
        qj01Var.D = dg01Var;
    }
}
