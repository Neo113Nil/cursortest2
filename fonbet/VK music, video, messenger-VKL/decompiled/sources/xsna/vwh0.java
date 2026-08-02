package xsna;

import android.os.Bundle;
import kotlin.Pair;
import xsna.dw20;

/* compiled from: SearchParamModalBottomSheetBuilder.kt */
/* loaded from: classes5.dex */
public abstract class vwh0 extends dw20.b {
    public String e;

    public abstract void S0(Bundle bundle);

    public abstract dw20 T0();

    @Override // xsna.dw20.b, xsna.dw20.a
    public final dw20 f() {
        dw20 T0 = T0();
        Bundle b = yfb.b(new Pair("request_key", this.e));
        S0(b);
        T0.setArguments(b);
        return T0;
    }
}
