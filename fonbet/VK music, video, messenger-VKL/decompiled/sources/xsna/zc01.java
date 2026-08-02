package xsna;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class zc01 implements Callable {
    public final /* synthetic */ String b;
    public final /* synthetic */ cd01 c;

    public zc01(cd01 cd01Var, String str) {
        this.c = cd01Var;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        cd01 cd01Var = this.c;
        cd01Var.a.a();
        ayz0 ayz0Var = cd01Var.a.d;
        qj01.I(ayz0Var);
        return ayz0Var.M(this.b);
    }
}
