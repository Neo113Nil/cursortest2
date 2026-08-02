package defpackage;

import com.ybsdk.core.mvp.widgets.MviConstraintLayout;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class j050 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ MviConstraintLayout b;

    public /* synthetic */ j050(MviConstraintLayout mviConstraintLayout, int i) {
        this.a = i;
        this.b = mviConstraintLayout;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        MviConstraintLayout mviConstraintLayout = this.b;
        switch (i) {
            case 0:
                mviConstraintLayout.render(obj);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            default:
                mviConstraintLayout.consumeSideEffect(obj);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, MviConstraintLayout.class, "render", "render(Ljava/lang/Object;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, MviConstraintLayout.class, "consumeSideEffect", "consumeSideEffect(Ljava/lang/Object;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
