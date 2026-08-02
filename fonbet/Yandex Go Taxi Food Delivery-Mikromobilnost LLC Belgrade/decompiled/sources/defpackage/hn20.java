package defpackage;

import com.yandex.mob.data.a;
import com.yandex.mob.data.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.t0;

/* loaded from: classes8.dex */
public final class hn20 implements tpr {
    public final /* synthetic */ t0 a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ol20[] w;

    public hn20(t0 t0Var, c cVar, String str, ol20[] ol20VarArr) {
        this.a = t0Var;
        this.b = cVar;
        this.c = str;
        this.w = ol20VarArr;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        Object collect = this.a.collect(new a(vprVar, this.b, this.c, this.w), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }
}
