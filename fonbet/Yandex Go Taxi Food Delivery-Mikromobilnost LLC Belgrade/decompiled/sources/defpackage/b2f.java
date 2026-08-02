package defpackage;

import com.yandex.go.superapp.order_tracking.eats.presentation.ui.overlay.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class b2f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ b2f(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.F.post(new b2f(aVar, 1));
                break;
            default:
                aVar.Ig(aVar.G);
                break;
        }
    }
}
