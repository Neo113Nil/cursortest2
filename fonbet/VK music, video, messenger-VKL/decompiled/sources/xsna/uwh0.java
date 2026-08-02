package xsna;

import android.os.Bundle;
import kotlin.Pair;

/* compiled from: SearchParamModalBottomSheetBuilder.kt */
/* loaded from: classes5.dex */
public abstract class uwh0 extends kmu0 {
    public String h;

    public abstract void V0(Bundle bundle);

    public abstract dw20 W0();

    @Override // xsna.dw20.b, xsna.dw20.a
    public final dw20 f() {
        dw20 W0 = W0();
        Bundle b = yfb.b(new Pair("request_key", this.h));
        V0(b);
        W0.setArguments(b);
        return W0;
    }
}
