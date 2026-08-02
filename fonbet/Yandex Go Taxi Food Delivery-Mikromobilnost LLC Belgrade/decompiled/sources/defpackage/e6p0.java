package defpackage;

import com.yandex.go.scooters.domain.g0;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class e6p0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ e6p0(g0 g0Var, int i) {
        this.a = i;
        this.b = g0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qy11 qy11Var = qy11.a;
        g0 g0Var = this.b;
        switch (i) {
            case 0:
                g0Var.c.e(((zuo0) obj).getSessionId(), qy11Var);
                break;
            default:
                g0Var.c.b(((zuo0) obj).getSessionId(), qy11Var);
                break;
        }
        return zy11Var;
    }
}
