package androidx.datastore.core;

import defpackage.f8w;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qng;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lqng;", "<anonymous>", "()Lqng;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {456, 478, 568, 486}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class DataStoreImpl$InitDataStore$doRun$initData$1 extends SuspendLambda implements tls {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ f this$0;
    final /* synthetic */ d this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(f fVar, d dVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.this$1 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Type inference failed for: r12v5, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 a;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef2;
        g050 g050Var;
        Iterator it;
        g050 g050Var2;
        Ref$BooleanRef ref$BooleanRef3;
        Ref$ObjectRef ref$ObjectRef3;
        c cVar;
        Ref$ObjectRef ref$ObjectRef4;
        Object b;
        Object obj2;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            a = gtq0.a();
            ref$BooleanRef = new Ref$BooleanRef();
            ref$ObjectRef = new Ref$ObjectRef();
            f fVar = this.this$0;
            this.L$0 = a;
            this.L$1 = ref$BooleanRef;
            this.L$2 = ref$ObjectRef;
            this.L$3 = ref$ObjectRef;
            this.label = 1;
            obj = f.g(fVar, true, this);
            if (obj != coroutineSingletons) {
                ref$ObjectRef2 = ref$ObjectRef;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$0;
                    obj2 = this.L$0;
                    kotlin.b.b(obj);
                    return new qng(obj2, i, ((Number) obj).intValue());
                }
                g050Var = (g050) this.L$2;
                ref$ObjectRef4 = (Ref$ObjectRef) this.L$1;
                ref$BooleanRef2 = (Ref$BooleanRef) this.L$0;
                kotlin.b.b(obj);
                try {
                    ref$BooleanRef2.element = true;
                    g050Var.d(null);
                    Object obj3 = ref$ObjectRef4.element;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    f8w h = this.this$0.h();
                    this.L$0 = obj3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = hashCode;
                    this.label = 4;
                    b = h.b(this);
                    if (b != coroutineSingletons) {
                        obj = b;
                        obj2 = obj3;
                        i = hashCode;
                        return new qng(obj2, i, ((Number) obj).intValue());
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    g050Var.d(null);
                    throw th;
                }
            }
            it = (Iterator) this.L$4;
            cVar = (c) this.L$3;
            ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
            ref$BooleanRef3 = (Ref$BooleanRef) this.L$1;
            g050Var2 = (g050) this.L$0;
            kotlin.b.b(obj);
            while (it.hasNext()) {
                wls wlsVar = (wls) it.next();
                this.L$0 = g050Var2;
                this.L$1 = ref$BooleanRef3;
                this.L$2 = ref$ObjectRef3;
                this.L$3 = cVar;
                this.L$4 = it;
                this.label = 2;
                if (wlsVar.invoke(cVar, this) == coroutineSingletons) {
                    break;
                }
            }
            ref$ObjectRef2 = ref$ObjectRef3;
            ref$BooleanRef2 = ref$BooleanRef3;
            g050Var = g050Var2;
            this.this$1.c = null;
            this.L$0 = ref$BooleanRef2;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = g050Var;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (g050Var.a(this) != coroutineSingletons) {
                ref$ObjectRef4 = ref$ObjectRef2;
                ref$BooleanRef2.element = true;
                g050Var.d(null);
                Object obj32 = ref$ObjectRef4.element;
                if (obj32 == null) {
                }
                f8w h2 = this.this$0.h();
                this.L$0 = obj32;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = hashCode;
                this.label = 4;
                b = h2.b(this);
                if (b != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$3;
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
        ref$BooleanRef = (Ref$BooleanRef) this.L$1;
        a = (g050) this.L$0;
        kotlin.b.b(obj);
        ref$ObjectRef.element = ((qng) obj).b;
        c cVar2 = new c(a, ref$BooleanRef, ref$ObjectRef2, this.this$0);
        List list = this.this$1.c;
        if (list == null) {
            ref$BooleanRef2 = ref$BooleanRef;
            g050Var = a;
            this.this$1.c = null;
            this.L$0 = ref$BooleanRef2;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = g050Var;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (g050Var.a(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        it = list.iterator();
        g050Var2 = a;
        ref$BooleanRef3 = ref$BooleanRef;
        ref$ObjectRef3 = ref$ObjectRef2;
        cVar = cVar2;
        while (it.hasNext()) {
        }
        ref$ObjectRef2 = ref$ObjectRef3;
        ref$BooleanRef2 = ref$BooleanRef3;
        g050Var = g050Var2;
        this.this$1.c = null;
        this.L$0 = ref$BooleanRef2;
        this.L$1 = ref$ObjectRef2;
        this.L$2 = g050Var;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (g050Var.a(this) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
