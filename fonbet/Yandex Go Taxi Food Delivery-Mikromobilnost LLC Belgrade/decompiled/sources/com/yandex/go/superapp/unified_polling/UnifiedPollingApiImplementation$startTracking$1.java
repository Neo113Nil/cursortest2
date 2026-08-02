package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersMetaDto;
import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersResponseDto;
import defpackage.dy11;
import defpackage.e3n;
import defpackage.ey11;
import defpackage.fmt;
import defpackage.hst;
import defpackage.jst;
import defpackage.kp50;
import defpackage.m2e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.qv10;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lfmt;", "Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersResponseDto;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingApiImplementation$startTracking$1", f = "UnifiedPollingApiImplementation.kt", l = {67, 81, HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UnifiedPollingApiImplementation$startTracking$1 extends SuspendLambda implements wls {
    final /* synthetic */ m2e0 $config;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingApiImplementation$startTracking$1$2", f = "UnifiedPollingApiImplementation.kt", l = {MSException.ERROR_INVALID_PASSWORD, MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.superapp.unified_polling.UnifiedPollingApiImplementation$startTracking$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$ObjectRef<e3n> $lastCheckAfter;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
            super(2, continuation);
            this.$lastCheckAfter = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.$lastCheckAfter);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            if (kotlinx.coroutines.a.j(r7, r9) == r1) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vpr vprVar = (vpr) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                e3n e3nVar = this.$lastCheckAfter.element;
                long j = e3nVar != null ? e3nVar.a : ey11.a;
                this.L$0 = vprVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.L$0 = null;
            this.label = 2;
            return vprVar.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingApiImplementation$startTracking$1(g gVar, m2e0 m2e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$config = m2e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UnifiedPollingApiImplementation$startTracking$1 unifiedPollingApiImplementation$startTracking$1 = new UnifiedPollingApiImplementation$startTracking$1(this.this$0, this.$config, continuation);
        unifiedPollingApiImplementation$startTracking$1.L$0 = obj;
        return unifiedPollingApiImplementation$startTracking$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnifiedPollingApiImplementation$startTracking$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, e3n] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0133 -> B:7:0x005d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef z;
        dy11 dy11Var;
        Ref$ObjectRef ref$ObjectRef;
        dy11 dy11Var2;
        dy11 dy11Var3;
        kotlinx.coroutines.flow.internal.h K;
        fmt fmtVar;
        ?? r11;
        Integer num;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            z = qv10.z(obj);
            dy11Var = null;
        } else {
            if (i == 1) {
                dy11Var3 = (dy11) this.L$3;
                dy11Var2 = (dy11) this.L$2;
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                fmtVar = (fmt) obj;
                if (fmtVar != null) {
                    jst.e.getClass();
                    SuperAppOrdersMetaDto superAppOrdersMetaDto = ((SuperAppOrdersResponseDto) fmtVar.a).b;
                    if (superAppOrdersMetaDto == null || (num = superAppOrdersMetaDto.a) == null) {
                        r11 = 0;
                    } else {
                        o430 o430Var = e3n.b;
                        r11 = new e3n(kp50.U(num.intValue(), DurationUnit.SECONDS));
                    }
                    if (r11 != 0) {
                        T t = ref$ObjectRef.element;
                        e3n.p(r11.a);
                        Objects.toString(t);
                        ref$ObjectRef.element = r11;
                    }
                    this.L$0 = vprVar;
                    this.L$1 = ref$ObjectRef;
                    this.L$2 = dy11Var2;
                    this.L$3 = dy11Var3;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                }
                K = kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new f(this.this$0.d, dy11Var3), new rol0(new AnonymousClass2(null, ref$ObjectRef))}, 2));
                this.L$0 = vprVar;
                this.L$1 = ref$ObjectRef;
                this.L$2 = dy11Var2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
                if (kotlinx.coroutines.flow.e.y(K, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 2) {
                dy11Var3 = (dy11) this.L$3;
                dy11Var2 = (dy11) this.L$2;
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                K = kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new f(this.this$0.d, dy11Var3), new rol0(new AnonymousClass2(null, ref$ObjectRef))}, 2));
                this.L$0 = vprVar;
                this.L$1 = ref$ObjectRef;
                this.L$2 = dy11Var2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
                if (kotlinx.coroutines.flow.e.y(K, this) != coroutineSingletons) {
                    dy11Var = dy11Var2;
                    z = ref$ObjectRef;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dy11Var = (dy11) this.L$2;
            Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
            kotlin.b.b(obj);
            z = ref$ObjectRef2;
        }
        if (!kotlinx.coroutines.a.p(get_context())) {
            return zy11.a;
        }
        dy11Var2 = (dy11) this.this$0.d.getValue();
        if (dy11Var != null && !dy11Var.b.containsAll(dy11Var2.b)) {
            z.element = null;
            jst.e.getClass();
        }
        hst hstVar = jst.e;
        Objects.toString(dy11Var2);
        hstVar.getClass();
        g gVar = this.this$0;
        m2e0 m2e0Var = this.$config;
        Set set = dy11Var2.b;
        e3n e3nVar = (e3n) z.element;
        this.L$0 = vprVar;
        this.L$1 = z;
        this.L$2 = dy11Var2;
        this.L$3 = dy11Var2;
        this.L$4 = null;
        this.label = 1;
        Object a = g.a(gVar, m2e0Var, set, e3nVar, this);
        if (a != coroutineSingletons) {
            ref$ObjectRef = z;
            obj = a;
            dy11Var3 = dy11Var2;
            fmtVar = (fmt) obj;
            if (fmtVar != null) {
            }
            K = kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new f(this.this$0.d, dy11Var3), new rol0(new AnonymousClass2(null, ref$ObjectRef))}, 2));
            this.L$0 = vprVar;
            this.L$1 = ref$ObjectRef;
            this.L$2 = dy11Var2;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
            if (kotlinx.coroutines.flow.e.y(K, this) != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
