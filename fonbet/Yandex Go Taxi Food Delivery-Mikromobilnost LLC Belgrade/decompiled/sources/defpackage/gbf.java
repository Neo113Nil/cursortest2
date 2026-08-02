package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class gbf implements vpr {
    public final /* synthetic */ a a;

    public gbf(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        r0 r0Var;
        Object value;
        ab0 ab0Var = (ab0) obj;
        if (!jl40.l(ab0Var, xa0.a)) {
            boolean l = jl40.l(ab0Var, ya0.a);
            a aVar = this.a;
            if (l) {
                n0t0 n0t0Var = new n0t0(new Text.Resource(dzh0.ybsdk_deposit_card_bind_failed), Text.Empty.INSTANCE);
                aVar.getClass();
                aVar.Z(new bbf(n0t0Var));
            } else {
                if (!(ab0Var instanceof za0)) {
                    w511.b();
                    return null;
                }
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, null, null, null, null, ((za0) ab0Var).a, null, false, null, 253951)));
                aVar.y0();
            }
        }
        return zy11.a;
    }
}
