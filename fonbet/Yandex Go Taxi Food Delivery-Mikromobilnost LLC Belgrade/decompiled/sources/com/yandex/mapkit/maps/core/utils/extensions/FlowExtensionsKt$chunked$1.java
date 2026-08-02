package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$chunked$1", f = "FlowExtensions.kt", l = {64, 72}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$chunked$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $size;
    final /* synthetic */ tpr $this_chunked;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$chunked$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements vpr {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ List<T> $chunkedList;
        final /* synthetic */ int $size;

        public AnonymousClass1(List<T> list, int i, vpr vprVar) {
            this.$chunkedList = list;
            this.$size = i;
            this.$$this$flow = vprVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // defpackage.vpr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super zy11> continuation) {
            FlowExtensionsKt$chunked$1$1$emit$1 flowExtensionsKt$chunked$1$1$emit$1;
            int i;
            if (continuation instanceof FlowExtensionsKt$chunked$1$1$emit$1) {
                flowExtensionsKt$chunked$1$1$emit$1 = (FlowExtensionsKt$chunked$1$1$emit$1) continuation;
                int i2 = flowExtensionsKt$chunked$1$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowExtensionsKt$chunked$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = flowExtensionsKt$chunked$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowExtensionsKt$chunked$1$1$emit$1.label;
                    if (i != 0) {
                        b.b(obj);
                        this.$chunkedList.add(t);
                        if (this.$chunkedList.size() == this.$size) {
                            vpr vprVar = this.$$this$flow;
                            List J0 = a.J0(this.$chunkedList);
                            flowExtensionsKt$chunked$1$1$emit$1.L$0 = null;
                            flowExtensionsKt$chunked$1$1$emit$1.label = 1;
                            if (vprVar.emit(J0, flowExtensionsKt$chunked$1$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11.a;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    this.$chunkedList.clear();
                    return zy11.a;
                }
            }
            flowExtensionsKt$chunked$1$1$emit$1 = new FlowExtensionsKt$chunked$1$1$emit$1(this, continuation);
            Object obj2 = flowExtensionsKt$chunked$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = flowExtensionsKt$chunked$1$1$emit$1.label;
            if (i != 0) {
            }
            this.$chunkedList.clear();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$chunked$1(int i, tpr tprVar, Continuation<? super FlowExtensionsKt$chunked$1> continuation) {
        super(2, continuation);
        this.$size = i;
        this.$this_chunked = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$chunked$1 flowExtensionsKt$chunked$1 = new FlowExtensionsKt$chunked$1(this.$size, this.$this_chunked, continuation);
        flowExtensionsKt$chunked$1.L$0 = obj;
        return flowExtensionsKt$chunked$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$chunked$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r9.collect(r6, r8) == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (this.$size <= 0) {
                ny61.g("Failed requirement.");
                return null;
            }
            arrayList = new ArrayList();
            tpr tprVar = this.$this_chunked;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayList, this.$size, vprVar);
            this.L$0 = vprVar;
            this.L$1 = arrayList;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            arrayList = (List) this.L$1;
            b.b(obj);
        }
        if (!arrayList.isEmpty()) {
            List J0 = a.J0(arrayList);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
