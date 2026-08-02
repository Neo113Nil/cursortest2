package defpackage;

import com.ybsdk.core.mvp.widgets.MviFrameLayout;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class k050 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ MviFrameLayout b;

    public /* synthetic */ k050(MviFrameLayout mviFrameLayout, int i) {
        this.a = i;
        this.b = mviFrameLayout;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        MviFrameLayout mviFrameLayout = this.b;
        switch (i) {
            case 0:
                mviFrameLayout.render(obj);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                break;
            default:
                mviFrameLayout.consumeSideEffect(obj);
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
                return new AdaptedFunctionReference(2, this.b, MviFrameLayout.class, "render", "render(Ljava/lang/Object;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, MviFrameLayout.class, "consumeSideEffect", "consumeSideEffect(Ljava/lang/Object;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
