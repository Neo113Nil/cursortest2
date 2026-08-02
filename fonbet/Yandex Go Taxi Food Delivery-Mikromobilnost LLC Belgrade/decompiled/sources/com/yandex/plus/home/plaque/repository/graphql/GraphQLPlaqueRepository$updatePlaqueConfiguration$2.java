package com.yandex.plus.home.plaque.repository.graphql;

import com.yandex.plus.log.api.LogPriority;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.plc0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.graphql.GraphQLPlaqueRepository$updatePlaqueConfiguration$2", f = "GraphQLPlaqueRepository.kt", l = {HProv.PP_PASSWD_TERM, HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_ENUM_CONTAINER_EXTENSION, HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class GraphQLPlaqueRepository$updatePlaqueConfiguration$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $retryAttempt;
    final /* synthetic */ int $retryMaxAttempts;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLPlaqueRepository$updatePlaqueConfiguration$2(a aVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$retryAttempt = i;
        this.$retryMaxAttempts = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GraphQLPlaqueRepository$updatePlaqueConfiguration$2(this.this$0, this.$retryAttempt, this.$retryMaxAttempts, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GraphQLPlaqueRepository$updatePlaqueConfiguration$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        if (r4.c((defpackage.llc0) r15, r7, r14) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        if (r15 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object j;
        int i;
        Object obj2;
        com.yandex.plus.home.plaque.plugin.internal.defaults.b bVar;
        plc0 plc0Var;
        n0 n0Var;
        Object obj3;
        Object obj4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            pgz pgzVar = this.this$0.n;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "GraphQLPlaqueRepository", "updatePlaqueConfiguration()");
            }
            a aVar = this.this$0;
            com.yandex.plus.home.benchmark.a aVar2 = (com.yandex.plus.home.benchmark.a) aVar.i.invoke();
            int i3 = this.$retryAttempt;
            int i4 = this.$retryMaxAttempts;
            this.label = 1;
            j = a.j(aVar, aVar2, i3, i4, this);
        } else if (i2 == 1) {
            kotlin.b.b(obj);
            j = ((Result) obj).getValue();
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj4 = this.L$0;
                    kotlin.b.b(obj);
                    r0 r0Var = this.this$0.r;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    return Boolean.valueOf(!(obj4 instanceof Result.Failure));
                }
                obj2 = this.L$0;
                kotlin.b.b(obj);
                j = obj2;
                n0Var = this.this$0.p;
                obj3 = !(j instanceof Result.Failure) ? null : j;
                this.L$0 = j;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (n0Var.emit(obj3, this) != coroutineSingletons) {
                    obj4 = j;
                    r0 r0Var2 = this.this$0.r;
                    Boolean bool2 = Boolean.TRUE;
                    r0Var2.getClass();
                    r0Var2.m(null, bool2);
                    return Boolean.valueOf(!(obj4 instanceof Result.Failure));
                }
                return coroutineSingletons;
            }
            int i5 = this.I$0;
            bVar = (com.yandex.plus.home.plaque.plugin.internal.defaults.b) this.L$3;
            plc0Var = (plc0) this.L$2;
            Object obj5 = this.L$0;
            kotlin.b.b(obj);
            i = i5;
            obj2 = obj5;
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.I$0 = i;
            this.label = 3;
        }
        a aVar3 = this.this$0;
        if (!(j instanceof Result.Failure)) {
            plc0 plc0Var2 = (plc0) j;
            List list = plc0Var2.a;
            List list2 = plc0Var2.c;
            List list3 = plc0Var2.e;
            EmptyList emptyList = EmptyList.a;
            plc0 plc0Var3 = new plc0(list, emptyList, list2, emptyList, list3);
            com.yandex.plus.home.plaque.plugin.internal.defaults.b bVar2 = aVar3.d;
            this.L$0 = j;
            this.L$1 = null;
            this.L$2 = plc0Var3;
            this.L$3 = bVar2;
            i = 0;
            this.I$0 = 0;
            this.label = 2;
            Object g = a.g(aVar3, this);
            if (g != coroutineSingletons) {
                obj2 = j;
                obj = g;
                bVar = bVar2;
                plc0Var = plc0Var3;
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.label = 3;
            }
            return coroutineSingletons;
        }
        n0Var = this.this$0.p;
        if (!(j instanceof Result.Failure)) {
        }
        this.L$0 = j;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 4;
        if (n0Var.emit(obj3, this) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
