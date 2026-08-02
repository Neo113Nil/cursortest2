package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.bvf0;
import defpackage.cms;
import defpackage.jl40;
import defpackage.jms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1", f = "FlowExtensions.kt", l = {193}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$takeUntil$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $other;
    final /* synthetic */ tpr $this_takeUntil;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1", f = "FlowExtensions.kt", l = {199}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ tpr $other;
        final /* synthetic */ tpr $this_takeUntil;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
        @mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1$1", f = "FlowExtensions.kt", l = {195}, m = "invokeSuspend", v = 1)
        /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00841 extends SuspendLambda implements wls {
            final /* synthetic */ tse $$this$coroutineScope;
            final /* synthetic */ tpr $other;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00841(tpr tprVar, tse tseVar, Continuation<? super C00841> continuation) {
                super(2, continuation);
                this.$other = tprVar;
                this.$$this$coroutineScope = tseVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
                return new C00841(this.$other, this.$$this$coroutineScope, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
                return ((C00841) create(tseVar, continuation)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    b.b(obj);
                    final t T = e.T(this.$other, 1);
                    tpr tprVar = new tpr() { // from class: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1$1$invokeSuspend$$inlined$map$1

                        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                        /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements vpr {
                            final /* synthetic */ vpr $this_unsafeFlow;

                            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                            @mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1$1$invokeSuspend$$inlined$map$1$2", f = "FlowExtensions.kt", l = {50}, m = "emit", v = 1)
                            /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
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
                                            vpr vprVar = this.$this_unsafeFlow;
                                            TakeUntilCancellationToken takeUntilCancellationToken = TakeUntilCancellationToken.INSTANCE;
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            if (vprVar.emit(takeUntilCancellationToken, anonymousClass1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            if (i != 1) {
                                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                                return null;
                                            }
                                            b.b(obj2);
                                        }
                                        return zy11.a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return zy11.a;
                            }
                        }

                        @Override // defpackage.tpr
                        public Object collect(vpr vprVar, Continuation continuation) {
                            Object collect = tpr.this.collect(new AnonymousClass2(vprVar), continuation);
                            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
                        }
                    };
                    this.label = 1;
                    obj = e.A(tprVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (jl40.l(obj, TakeUntilCancellationToken.INSTANCE)) {
                    bvf0.j(this.$$this$coroutineScope, null);
                }
                return zy11.a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$takeUntil$1$1$2, reason: invalid class name */
        public static final /* synthetic */ class AnonymousClass2 implements vpr, jms {
            final /* synthetic */ vpr $tmp0;

            public AnonymousClass2(vpr vprVar) {
                this.$tmp0 = vprVar;
            }

            @Override // defpackage.vpr
            public final Object emit(T t, Continuation<? super zy11> continuation) {
                Object emit = this.$tmp0.emit(t, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // defpackage.jms
            public final cms getFunctionDelegate() {
                return new FunctionReferenceImpl(2, this.$tmp0, vpr.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(tpr tprVar, vpr vprVar, tpr tprVar2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_takeUntil = tprVar;
            this.$$this$flow = vprVar;
            this.$other = tprVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_takeUntil, this.$$this$flow, this.$other, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new C00841(this.$other, tseVar, null), 1);
                tpr tprVar = this.$this_takeUntil;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$flow);
                this.L$0 = null;
                this.label = 1;
                if (tprVar.collect(anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$takeUntil$1(tpr tprVar, tpr tprVar2, Continuation<? super FlowExtensionsKt$takeUntil$1> continuation) {
        super(2, continuation);
        this.$this_takeUntil = tprVar;
        this.$other = tprVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$takeUntil$1 flowExtensionsKt$takeUntil$1 = new FlowExtensionsKt$takeUntil$1(this.$this_takeUntil, this.$other, continuation);
        flowExtensionsKt$takeUntil$1.L$0 = obj;
        return flowExtensionsKt$takeUntil$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$takeUntil$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_takeUntil, vprVar, this.$other, null);
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
                b.b(obj);
            }
        } catch (CancellationException unused) {
        }
        return zy11.a;
    }
}
