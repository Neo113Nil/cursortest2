package androidx.datastore.core;

import defpackage.f3u0;
import defpackage.g6r;
import defpackage.nbi0;
import defpackage.ny61;
import defpackage.pd60;
import defpackage.qng;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zv11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1) {
            dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f3u0 f3u0Var = (f3u0) obj;
                    if (f3u0Var instanceof nbi0) {
                        throw ((nbi0) f3u0Var).b;
                    }
                    if (!(f3u0Var instanceof qng)) {
                        if ((f3u0Var instanceof g6r) || (f3u0Var instanceof zv11) || (f3u0Var instanceof pd60)) {
                            ny61.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    Object obj3 = ((qng) f3u0Var).b;
                    dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
