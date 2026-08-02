package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.util.a;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class ayx0 implements jms {
    public final /* synthetic */ Context a;

    public ayx0(Context context) {
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ayx0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, a.class, "isTouchExplorationEnabledFlow", "isTouchExplorationEnabledFlow(Landroid/content/Context;)Lkotlinx/coroutines/flow/Flow;", 1);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
