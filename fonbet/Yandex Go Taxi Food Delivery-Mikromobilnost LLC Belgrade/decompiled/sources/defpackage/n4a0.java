package defpackage;

import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserView;

/* loaded from: classes8.dex */
public final /* synthetic */ class n4a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4a0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((PaymentMethodChooserView) obj).setMargins(i2);
                break;
            default:
                ((vuj0) obj).b(i2);
                break;
        }
    }
}
