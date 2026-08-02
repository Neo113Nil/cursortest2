package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class oq21 implements lxx {
    public final r0 a = bvf0.c(Boolean.TRUE);
    public final r0 b = bvf0.c(null);

    @Override // defpackage.lxx
    public final Object e(owx owxVar, Continuation continuation) {
        jq21 jq21Var = owxVar.y.c;
        zy11 zy11Var = zy11.a;
        if (jq21Var != null) {
            this.b.emit(new zp21(jq21Var.a, jq21Var.c), continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return zy11Var;
    }

    @Override // defpackage.j35
    public final String getName() {
        return "UserPhotoNotificationStateRepository";
    }
}
