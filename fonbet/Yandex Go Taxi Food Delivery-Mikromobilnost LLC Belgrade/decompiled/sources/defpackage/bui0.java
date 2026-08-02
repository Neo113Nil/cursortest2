package defpackage;

import com.yandex.go.requirements.comment.summary.ui.v3.ui.utils.DragDirection;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class bui0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5t0 b;

    public /* synthetic */ bui0(u5t0 u5t0Var, int i) {
        this.a = i;
        this.b = u5t0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        u5t0 u5t0Var = this.b;
        switch (i) {
            case 0:
                if ((((uz20) obj) instanceof sz20) && u5t0Var != null) {
                    ((wqh) u5t0Var).a();
                    break;
                }
                break;
            default:
                if (((DragDirection) obj) == DragDirection.DOWN && u5t0Var != null) {
                    ((wqh) u5t0Var).a();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
