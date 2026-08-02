package com.yandex.mapkit.maps.core.utils.extensions;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$scanSeedless$1", f = "FlowExtensions.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$scanSeedless$1 extends SuspendLambda implements wls {
    final /* synthetic */ zls $operation;
    final /* synthetic */ tpr $this_scanSeedless;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$scanSeedless$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements vpr {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ Ref$ObjectRef<R> $accumulator;
        final /* synthetic */ zls $operation;

        public AnonymousClass1(zls zlsVar, Ref$ObjectRef<R> ref$ObjectRef, vpr vprVar) {
            this.$operation = zlsVar;
            this.$accumulator = ref$ObjectRef;
            this.$$this$flow = vprVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            if (r6.emit(r8, r0) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            if (r8 == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // defpackage.vpr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super zy11> continuation) {
            FlowExtensionsKt$scanSeedless$1$1$emit$1 flowExtensionsKt$scanSeedless$1$1$emit$1;
            int i;
            if (continuation instanceof FlowExtensionsKt$scanSeedless$1$1$emit$1) {
                flowExtensionsKt$scanSeedless$1$1$emit$1 = (FlowExtensionsKt$scanSeedless$1$1$emit$1) continuation;
                int i2 = flowExtensionsKt$scanSeedless$1$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowExtensionsKt$scanSeedless$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    T t2 = (T) flowExtensionsKt$scanSeedless$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowExtensionsKt$scanSeedless$1$1$emit$1.label;
                    if (i != 0) {
                        b.b(t2);
                        zls zlsVar = this.$operation;
                        T t3 = this.$accumulator.element;
                        flowExtensionsKt$scanSeedless$1$1$emit$1.L$0 = null;
                        flowExtensionsKt$scanSeedless$1$1$emit$1.label = 1;
                        t2 = (T) zlsVar.invoke(t3, t, flowExtensionsKt$scanSeedless$1$1$emit$1);
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                b.b(t2);
                                return zy11.a;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(t2);
                    }
                    Ref$ObjectRef<R> ref$ObjectRef = this.$accumulator;
                    vpr vprVar = this.$$this$flow;
                    ref$ObjectRef.element = t2;
                    flowExtensionsKt$scanSeedless$1$1$emit$1.L$0 = null;
                    flowExtensionsKt$scanSeedless$1$1$emit$1.L$1 = t2;
                    flowExtensionsKt$scanSeedless$1$1$emit$1.L$2 = null;
                    flowExtensionsKt$scanSeedless$1$1$emit$1.I$0 = 0;
                    flowExtensionsKt$scanSeedless$1$1$emit$1.label = 2;
                }
            }
            flowExtensionsKt$scanSeedless$1$1$emit$1 = new FlowExtensionsKt$scanSeedless$1$1$emit$1(this, continuation);
            T t22 = (T) flowExtensionsKt$scanSeedless$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = flowExtensionsKt$scanSeedless$1$1$emit$1.label;
            if (i != 0) {
            }
            Ref$ObjectRef<R> ref$ObjectRef2 = this.$accumulator;
            vpr vprVar2 = this.$$this$flow;
            ref$ObjectRef2.element = t22;
            flowExtensionsKt$scanSeedless$1$1$emit$1.L$0 = null;
            flowExtensionsKt$scanSeedless$1$1$emit$1.L$1 = t22;
            flowExtensionsKt$scanSeedless$1$1$emit$1.L$2 = null;
            flowExtensionsKt$scanSeedless$1$1$emit$1.I$0 = 0;
            flowExtensionsKt$scanSeedless$1$1$emit$1.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$scanSeedless$1(tpr tprVar, zls zlsVar, Continuation<? super FlowExtensionsKt$scanSeedless$1> continuation) {
        super(2, continuation);
        this.$this_scanSeedless = tprVar;
        this.$operation = zlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$scanSeedless$1 flowExtensionsKt$scanSeedless$1 = new FlowExtensionsKt$scanSeedless$1(this.$this_scanSeedless, this.$operation, continuation);
        flowExtensionsKt$scanSeedless$1.L$0 = obj;
        return flowExtensionsKt$scanSeedless$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$scanSeedless$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            tpr tprVar = this.$this_scanSeedless;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$operation, z, vprVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (tprVar.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
