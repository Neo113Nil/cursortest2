package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes5.dex */
public final class axd implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ vpr b;
    public final /* synthetic */ Ref$LongRef c;
    public final /* synthetic */ long w;

    public /* synthetic */ axd(Ref$LongRef ref$LongRef, long j, vpr vprVar, int i) {
        this.a = i;
        this.c = ref$LongRef;
        this.w = j;
        this.b = vprVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.w;
        Ref$LongRef ref$LongRef = this.c;
        vpr vprVar = this.b;
        switch (i) {
            case 0:
                long I = vng.I();
                if (I - ref$LongRef.element <= j) {
                    return zy11Var;
                }
                ref$LongRef.element = I;
                Object emit = vprVar.emit(obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                if (((zs7) obj).c) {
                    ref$LongRef.element = currentTimeMillis;
                    return vprVar.emit(obj, continuation);
                }
                if (currentTimeMillis - ref$LongRef.element <= j) {
                    return zy11Var;
                }
                ref$LongRef.element = currentTimeMillis;
                return vprVar.emit(obj, continuation);
        }
    }
}
