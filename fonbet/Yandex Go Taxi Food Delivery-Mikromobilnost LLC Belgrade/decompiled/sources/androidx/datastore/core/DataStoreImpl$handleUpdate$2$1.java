package androidx.datastore.core;

import defpackage.es10;
import defpackage.f3u0;
import defpackage.fse;
import defpackage.g6r;
import defpackage.mvg;
import defpackage.nbi0;
import defpackage.ny61;
import defpackage.pd60;
import defpackage.qng;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zv11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.DataStoreImpl$handleUpdate$2$1", f = "DataStoreImpl.kt", l = {256, 262, 265}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataStoreImpl$handleUpdate$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ f $this_runCatching;
    final /* synthetic */ es10 $update;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$handleUpdate$2$1(f fVar, es10 es10Var, Continuation continuation) {
        super(2, continuation);
        this.$this_runCatching = fVar;
        this.$update = es10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DataStoreImpl$handleUpdate$2$1(this.$this_runCatching, this.$update, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$handleUpdate$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        if (androidx.datastore.core.f.e(r7, r6) == r0) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f3u0 a = this.$this_runCatching.h.a();
            if (a instanceof qng) {
                f fVar = this.$this_runCatching;
                es10 es10Var = this.$update;
                wls wlsVar = es10Var.a;
                fse fseVar = es10Var.d;
                this.label = 1;
                Object c = fVar.h().c(new DataStoreImpl$transformAndWrite$2(fVar, fseVar, wlsVar, null), this);
                if (c != coroutineSingletons) {
                    return c;
                }
            } else {
                if (!(a instanceof nbi0) && !(a instanceof zv11)) {
                    if (a instanceof g6r) {
                        throw ((g6r) a).b;
                    }
                    if (a instanceof pd60) {
                        ny61.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    w511.b();
                    return null;
                }
                if (a != this.$update.c) {
                    throw ((nbi0) a).b;
                }
                f fVar2 = this.$this_runCatching;
                this.label = 2;
            }
        }
        if (i == 1) {
            kotlin.b.b(obj);
            return obj;
        }
        if (i != 2) {
            if (i == 3) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar3 = this.$this_runCatching;
        es10 es10Var2 = this.$update;
        wls wlsVar2 = es10Var2.a;
        fse fseVar2 = es10Var2.d;
        this.label = 3;
        Object c2 = fVar3.h().c(new DataStoreImpl$transformAndWrite$2(fVar3, fseVar2, wlsVar2, null), this);
        return c2 == coroutineSingletons ? coroutineSingletons : c2;
    }
}
