package defpackage;

import com.yandex.go.settings.email.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class dsn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ dsn(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                boolean equals = aVar.y.a.c().equals(aVar.C);
                da0 da0Var = (da0) aVar.x.a;
                if (!equals) {
                    da0Var.r(new urm(25));
                    break;
                } else {
                    da0Var.r(new qu(9));
                    break;
                }
            default:
                ((xrn) aVar.Dg()).setProgressing(false);
                ((xrn) aVar.Dg()).dismiss();
                break;
        }
    }
}
