package xsna;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vyt implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vyt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ((k9f0) ((xyt) this.c).a).b();
                return s3q0.a;
            case 1:
                u440 u440Var = (u440) this.c;
                return u440Var.b8((tam0) u440Var.v.get(0));
            case 2:
                ((gzs) this.c).invoke();
                return s3q0.a;
            default:
                d2p0 d2p0Var = (d2p0) this.c;
                String string = ((SharedPreferences) d2p0Var.c.getValue()).getString("VK_PAY_CHECKOUT_VKPAY_TOKEN/" + d2p0Var.b.b, null);
                if (string != null) {
                    return string;
                }
                throw new IllegalStateException("No saved token found");
        }
    }
}
