package com.yandex.go.coroutines;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tfi0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.DelayKt$sampleIntermediates$2", f = "Delay.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DelayKt$sampleIntermediates$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $durationMs;
    final /* synthetic */ tpr $this_sampleIntermediates;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.coroutines.DelayKt$sampleIntermediates$2$1", f = "Delay.kt", l = {169, 145, 150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.coroutines.DelayKt$sampleIntermediates$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ long $durationMs;
        final /* synthetic */ tpr $this_sampleIntermediates;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tpr tprVar, long j, vpr vprVar, Continuation continuation) {
            super(2, continuation);
            this.$this_sampleIntermediates = tprVar;
            this.$durationMs = j;
            this.$$this$flow = vprVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_sampleIntermediates, this.$durationMs, this.$$this$flow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
        
            if (r12.emit(null, r17) == r2) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00e9, code lost:
        
            if (r5 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0110, code lost:
        
            if (r3.emit(r1, r17) == r2) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
        /* JADX WARN: Type inference failed for: r9v10, types: [tfi0] */
        /* JADX WARN: Type inference failed for: r9v8, types: [tfi0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00c6 -> B:14:0x00e9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e4 -> B:13:0x00e7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef z;
            Ref$BooleanRef ref$BooleanRef;
            x6f0 b;
            Ref$BooleanRef ref$BooleanRef2;
            Ref$ObjectRef ref$ObjectRef;
            Ref$BooleanRef ref$BooleanRef3;
            x6f0 x6f0Var;
            Ref$BooleanRef ref$BooleanRef4;
            Object obj2;
            Object obj3;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                z = qv10.z(obj);
                ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef.element = true;
                b = kotlinx.coroutines.channels.b.b(tseVar, 0, new DelayKt$sampleIntermediates$2$1$upstreamChannel$1(this.$this_sampleIntermediates, null), 3);
                ref$BooleanRef2 = new Ref$BooleanRef();
                ref$BooleanRef2.element = true;
                if (bvf0.D(tseVar)) {
                }
                obj3 = z.element;
                if (obj3 != null) {
                }
                return zy11.a;
            }
            if (i == 1) {
                ref$BooleanRef4 = (Ref$BooleanRef) this.L$4;
                ?? r9 = (tfi0) this.L$3;
                ref$BooleanRef3 = (Ref$BooleanRef) this.L$2;
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                x6f0Var = r9;
                obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                }
                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                ref$BooleanRef2 = ref$BooleanRef4;
                z = ref$ObjectRef2;
                Ref$BooleanRef ref$BooleanRef5 = ref$BooleanRef3;
                b = x6f0Var;
                ref$BooleanRef = ref$BooleanRef5;
                ref$BooleanRef.element = false;
                if (bvf0.D(tseVar)) {
                }
                obj3 = z.element;
                if (obj3 != null) {
                }
                return zy11.a;
            }
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            ref$BooleanRef4 = (Ref$BooleanRef) this.L$4;
            ?? r92 = (tfi0) this.L$3;
            ref$BooleanRef3 = (Ref$BooleanRef) this.L$2;
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            kotlin.b.b(obj);
            x6f0Var = r92;
            ref$ObjectRef.element = null;
            Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef;
            ref$BooleanRef2 = ref$BooleanRef4;
            z = ref$ObjectRef22;
            Ref$BooleanRef ref$BooleanRef52 = ref$BooleanRef3;
            b = x6f0Var;
            ref$BooleanRef = ref$BooleanRef52;
            ref$BooleanRef.element = false;
            if (bvf0.D(tseVar) || !ref$BooleanRef2.element) {
                obj3 = z.element;
                if (obj3 != null) {
                    vpr vprVar = this.$$this$flow;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 3;
                }
                return zy11.a;
            }
            long j = this.$durationMs;
            kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(get_context());
            bVar.h(b.f(), new DelayKt$sampleIntermediates$2$1$1$1(z, ref$BooleanRef2, null));
            kotlinx.coroutines.selects.a.a(bVar, j, new DelayKt$sampleIntermediates$2$1$1$2(ref$BooleanRef, null));
            this.L$0 = tseVar;
            this.L$1 = z;
            this.L$2 = ref$BooleanRef;
            this.L$3 = b;
            this.L$4 = ref$BooleanRef2;
            this.L$5 = null;
            this.label = 1;
            if (bVar.e(this) != coroutineSingletons) {
                Ref$BooleanRef ref$BooleanRef6 = ref$BooleanRef2;
                ref$ObjectRef = z;
                ref$BooleanRef4 = ref$BooleanRef6;
                x6f0 x6f0Var2 = b;
                ref$BooleanRef3 = ref$BooleanRef;
                x6f0Var = x6f0Var2;
                obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    if (!ref$BooleanRef3.element) {
                    }
                    if (0 != 0) {
                        vpr vprVar2 = this.$$this$flow;
                        this.L$0 = tseVar;
                        this.L$1 = ref$ObjectRef;
                        this.L$2 = ref$BooleanRef3;
                        this.L$3 = x6f0Var;
                        this.L$4 = ref$BooleanRef4;
                        this.L$5 = null;
                        this.label = 2;
                        x6f0Var = x6f0Var;
                    }
                }
                Ref$ObjectRef ref$ObjectRef222 = ref$ObjectRef;
                ref$BooleanRef2 = ref$BooleanRef4;
                z = ref$ObjectRef222;
                Ref$BooleanRef ref$BooleanRef522 = ref$BooleanRef3;
                b = x6f0Var;
                ref$BooleanRef = ref$BooleanRef522;
                ref$BooleanRef.element = false;
                if (bvf0.D(tseVar)) {
                }
                obj3 = z.element;
                if (obj3 != null) {
                }
                return zy11.a;
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelayKt$sampleIntermediates$2(tpr tprVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$this_sampleIntermediates = tprVar;
        this.$durationMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DelayKt$sampleIntermediates$2 delayKt$sampleIntermediates$2 = new DelayKt$sampleIntermediates$2(this.$this_sampleIntermediates, this.$durationMs, continuation);
        delayKt$sampleIntermediates$2.L$0 = obj;
        return delayKt$sampleIntermediates$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DelayKt$sampleIntermediates$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_sampleIntermediates, this.$durationMs, vprVar, null);
            this.L$0 = null;
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
