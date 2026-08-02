package defpackage;

import com.yandex.go.taxi.order.navigation.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class f5y0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ f5y0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                return "[" + aVar.getLifecycle().w + "](" + aVar.hashCode() + ") cannot be executed since the user is blocked";
            default:
                return "[" + aVar.getLifecycle().w + "](" + aVar.hashCode() + ") cannot be executed since there are no active orders found";
        }
    }
}
