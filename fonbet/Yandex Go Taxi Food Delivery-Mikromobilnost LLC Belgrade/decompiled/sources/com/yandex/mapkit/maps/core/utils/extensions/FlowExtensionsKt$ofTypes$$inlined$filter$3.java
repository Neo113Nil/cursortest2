package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltpr;", "Lvpr;", "collector", "Lzy11;", "collect", "(Lvpr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 176)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$ofTypes$$inlined$filter$3 implements tpr {
    final /* synthetic */ tpr $this_unsafeTransform$inlined;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$ofTypes$$inlined$filter$3$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements vpr {
        final /* synthetic */ vpr $this_unsafeFlow;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
        @mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$ofTypes$$inlined$filter$3$2", f = "FlowExtensions.kt", l = {50}, m = "emit", v = 1)
        /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$ofTypes$$inlined$filter$3$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(vpr vprVar) {
            this.$this_unsafeFlow = vprVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // defpackage.vpr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i2 = anonymousClass1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                        b.b(obj2);
                        jl40.P();
                        throw null;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                    return zy11.a;
                }
            }
            anonymousClass1 = new AnonymousClass1(continuation);
            Object obj22 = anonymousClass1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = anonymousClass1.label;
            if (i != 0) {
            }
        }

        public final Object emit$$forInline(Object obj, Continuation continuation) {
            new AnonymousClass1(continuation);
            jl40.P();
            throw null;
        }
    }

    public FlowExtensionsKt$ofTypes$$inlined$filter$3(tpr tprVar) {
        this.$this_unsafeTransform$inlined = tprVar;
    }

    @Override // defpackage.tpr
    public Object collect(vpr vprVar, Continuation continuation) {
        jl40.P();
        throw null;
    }

    public Object collect$$forInline(vpr vprVar, Continuation continuation) {
        new ContinuationImpl(continuation) { // from class: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$ofTypes$$inlined$filter$3.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowExtensionsKt$ofTypes$$inlined$filter$3.this.collect(null, this);
            }
        };
        jl40.P();
        throw null;
    }
}
