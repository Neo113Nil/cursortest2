package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public final /* synthetic */ class jq50 implements kq50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jq50(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kq50
    public final void a(hsb1 hsb1Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e100 e100Var = (e100) obj;
                ((Handler) e100Var.c).post(new sf30(e100Var, hsb1Var));
                break;
            default:
                hsb1Var.getClass();
                AtomicBoolean atomicBoolean = (AtomicBoolean) ((xv10) obj).w;
                if (atomicBoolean.get()) {
                    atomicBoolean.set(false);
                    break;
                }
                break;
        }
    }
}
