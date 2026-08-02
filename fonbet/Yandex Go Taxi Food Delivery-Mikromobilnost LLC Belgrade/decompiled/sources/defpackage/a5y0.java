package defpackage;

import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a5y0 implements d5y0 {
    public final String a;
    public final o2y0 b;
    public final TaxiCardNavigationAction c;
    public final boolean d;
    public final boolean e;

    public a5y0(String str, o2y0 o2y0Var, TaxiCardNavigationAction taxiCardNavigationAction, int i) {
        o2y0Var = (i & 2) != 0 ? null : o2y0Var;
        taxiCardNavigationAction = (i & 4) != 0 ? TaxiCardNavigationAction.EMPTY : taxiCardNavigationAction;
        boolean z = (i & 8) == 0;
        boolean z2 = (i & 16) != 0;
        this.a = str;
        this.b = o2y0Var;
        this.c = taxiCardNavigationAction;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.d5y0
    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerCompat(reason=");
        sb.append(this.a);
        sb.append(", navigationAction=");
        sb.append(this.c);
        sb.append(", launchedFromOtherScreen=");
        return x4e.i(sb, this.d, Extension.C_BRAKE);
    }
}
