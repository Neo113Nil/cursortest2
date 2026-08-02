package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.d;
import com.yandex.go.payments.shared.y;

/* loaded from: classes13.dex */
public final /* synthetic */ class a4f implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ d c;

    public /* synthetic */ a4f(Runnable runnable, d dVar, int i) {
        this.a = i;
        this.b = runnable;
        this.c = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.c;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                runnable.run();
                ((y) dVar.e.get()).c();
                break;
            default:
                runnable.run();
                ((y) dVar.e.get()).c();
                break;
        }
        return zy11Var;
    }
}
