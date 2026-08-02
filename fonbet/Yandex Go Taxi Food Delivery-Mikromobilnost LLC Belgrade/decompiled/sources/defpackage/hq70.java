package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import kotlinx.coroutines.channels.a;

/* loaded from: classes14.dex */
public final class hq70 {
    public final a a;
    public final di9 b;
    public final a3y0 c;

    public hq70() {
        a a = sb2.a(-2, null, null, 6);
        this.a = a;
        this.b = new di9(a);
        this.c = new a3y0(TaxiOrderLogGroup.NAVIGATION.getTag(), "ControllerEventRepository");
    }

    public final void a(final fq70 fq70Var) {
        Object d = this.a.d(fq70Var);
        boolean z = d instanceof ni9;
        a3y0 a3y0Var = this.c;
        if (z) {
            final Throwable a = oi9.a(d);
            final int i = 0;
            a3y0.d(a3y0Var, "onFailure", null, new sls() { // from class: gq70
                @Override // defpackage.sls
                public final Object invoke() {
                    int i2 = i;
                    Throwable th = a;
                    fq70 fq70Var2 = fq70Var;
                    switch (i2) {
                        case 0:
                            return "Failed to send event=" + fq70Var2 + ", error=" + th;
                        default:
                            return "Channel is closed, cannot send event=" + fq70Var2 + ", error=" + th;
                    }
                }
            }, 2);
        }
        if (d instanceof mi9) {
            final Throwable a2 = oi9.a(d);
            final int i2 = 1;
            a3y0.d(a3y0Var, "onClosed", null, new sls() { // from class: gq70
                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i2;
                    Throwable th = a2;
                    fq70 fq70Var2 = fq70Var;
                    switch (i22) {
                        case 0:
                            return "Failed to send event=" + fq70Var2 + ", error=" + th;
                        default:
                            return "Channel is closed, cannot send event=" + fq70Var2 + ", error=" + th;
                    }
                }
            }, 2);
        }
    }
}
