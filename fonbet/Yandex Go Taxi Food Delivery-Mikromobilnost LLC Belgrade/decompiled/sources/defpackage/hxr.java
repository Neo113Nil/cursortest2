package defpackage;

import com.yandex.messaging.domain.poll.e;
import com.yandex.messaging.internal.storage.folders.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class hxr implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long w;

    public /* synthetic */ hxr(long j, String str, Object obj, int i) {
        this.a = i;
        this.b = (tpr) obj;
        this.c = str;
        this.w = j;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.w;
        String str = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new a(vprVar, str, j), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            default:
                Object collect2 = tprVar.collect(new e(vprVar, str, j), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
        }
    }
}
