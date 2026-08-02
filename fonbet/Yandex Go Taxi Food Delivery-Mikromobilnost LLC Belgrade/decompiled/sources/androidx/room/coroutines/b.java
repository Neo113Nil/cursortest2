package androidx.room.coroutines;

import androidx.room.RoomDatabase;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ RoomDatabase b;
    public final /* synthetic */ tls c;

    public b(vpr vprVar, RoomDatabase roomDatabase, tls tlsVar) {
        this.a = vprVar;
        this.b = roomDatabase;
        this.c = tlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowUtil$createFlow$$inlined$map$1$2$1 flowUtil$createFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof FlowUtil$createFlow$$inlined$map$1$2$1) {
            flowUtil$createFlow$$inlined$map$1$2$1 = (FlowUtil$createFlow$$inlined$map$1$2$1) continuation;
            int i2 = flowUtil$createFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowUtil$createFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowUtil$createFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowUtil$createFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar2 = this.a;
                    flowUtil$createFlow$$inlined$map$1$2$1.L$0 = vprVar2;
                    flowUtil$createFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = androidx.room.util.a.c(this.c, this.b, flowUtil$createFlow$$inlined$map$1$2$1, true, false);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) flowUtil$createFlow$$inlined$map$1$2$1.L$0;
                kotlin.b.b(obj2);
                flowUtil$createFlow$$inlined$map$1$2$1.L$0 = null;
                flowUtil$createFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        flowUtil$createFlow$$inlined$map$1$2$1 = new FlowUtil$createFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = flowUtil$createFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowUtil$createFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        flowUtil$createFlow$$inlined$map$1$2$1.L$0 = null;
        flowUtil$createFlow$$inlined$map$1$2$1.label = 2;
    }
}
