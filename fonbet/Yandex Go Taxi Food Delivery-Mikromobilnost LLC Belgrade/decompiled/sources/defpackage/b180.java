package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class b180 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ o380 b;

    public /* synthetic */ b180(o380 o380Var, int i) {
        this.a = i;
        this.b = o380Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o380 o380Var = this.b;
        switch (i) {
            case 0:
                n380 n380Var = (n380) obj;
                r0 r0Var = o380Var.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, j380.a((j380) value, null, new s380(n380Var, k380.a), null, 5)));
            case 1:
                n380 n380Var2 = (n380) obj;
                r0 r0Var2 = o380Var.a;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, j380.a((j380) value2, new s380(n380Var2, k380.b), null, null, 6)));
            default:
                s380 s380Var = (s380) obj;
                r0 r0Var3 = o380Var.a;
                do {
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, j380.a((j380) value3, null, null, s380Var, 3)));
        }
        return zy11Var;
    }
}
