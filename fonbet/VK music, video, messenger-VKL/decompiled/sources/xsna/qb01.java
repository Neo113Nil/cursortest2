package xsna;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class qb01 implements Callable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ cd01 e;

    public qb01(cd01 cd01Var, String str, String str2, String str3) {
        this.e = cd01Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        qj01 qj01Var = this.e.a;
        qj01Var.a();
        ayz0 ayz0Var = qj01Var.d;
        qj01.I(ayz0Var);
        return ayz0Var.N(this.b, this.c, this.d);
    }
}
