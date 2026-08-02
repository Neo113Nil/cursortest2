package com.yandex.go.summary.ui.compose.common.tooltip;

import androidx.compose.runtime.f;
import defpackage.gr5;
import defpackage.l8x;
import defpackage.m3u0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.ypv0;
import defpackage.yw8;
import defpackage.zgz0;
import defpackage.zpv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1", f = "TooltipControllerBox.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TooltipControllerBoxKt$TooltipControllerBox$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ ypv0 $controller;
    final /* synthetic */ zpv0 $summaryTooltipState;
    final /* synthetic */ oz40 $tooltipAlignmentState;
    final /* synthetic */ m3u0 $tooltipContentState;
    final /* synthetic */ oz40 $tooltipJobState;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1$1", f = "TooltipControllerBox.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ypv0 $controller;
        final /* synthetic */ zpv0 $summaryTooltipState;
        final /* synthetic */ oz40 $tooltipAlignmentState;
        final /* synthetic */ m3u0 $tooltipContentState;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1$1$1", f = "TooltipControllerBox.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00741 extends SuspendLambda implements wls {
            final /* synthetic */ oz40 $tooltipAlignmentState;
            final /* synthetic */ m3u0 $tooltipContentState;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00741(m3u0 m3u0Var, oz40 oz40Var, Continuation continuation) {
                super(2, continuation);
                this.$tooltipContentState = m3u0Var;
                this.$tooltipAlignmentState = oz40Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00741(this.$tooltipContentState, this.$tooltipAlignmentState, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00741) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    b.b(obj);
                    mth mthVar = new mth(f.o(new gr5(this.$tooltipContentState, 22)), 6);
                    oz40 oz40Var = this.$tooltipAlignmentState;
                    o oVar = new o(mthVar, new TooltipControllerBoxKt$TooltipControllerBox$2$1$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                    yw8 yw8Var = new yw8(4, oz40Var);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    if (oVar.collect(yw8Var, this) == coroutineSingletons) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1$1$2", f = "TooltipControllerBox.kt", l = {81}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements wls {
            final /* synthetic */ ypv0 $controller;
            final /* synthetic */ zpv0 $summaryTooltipState;
            int label;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
            @mvg(c = "com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1$1$2$2", f = "TooltipControllerBox.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.yandex.go.summary.ui.compose.common.tooltip.TooltipControllerBoxKt$TooltipControllerBox$2$1$1$2$2, reason: invalid class name and collision with other inner class name */
            final class C00752 extends SuspendLambda implements wls {
                /* synthetic */ int I$0;
                int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C00752 c00752 = new C00752(2, continuation);
                    c00752.I$0 = ((Number) obj).intValue();
                    return c00752;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00752) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int i = this.I$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        b.b(obj);
                        return Boolean.valueOf(i != 0);
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ypv0 ypv0Var, zpv0 zpv0Var, Continuation continuation) {
                super(2, continuation);
                this.$controller = ypv0Var;
                this.$summaryTooltipState = zpv0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.$controller, this.$summaryTooltipState, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    b.b(obj);
                    rol0 o = f.o(new zgz0(6, this.$summaryTooltipState));
                    C00752 c00752 = new C00752(2, null);
                    this.label = 1;
                    if (e.x(o, c00752, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ypv0 ypv0Var = this.$controller;
                if (ypv0Var != null) {
                    zpv0 zpv0Var = this.$summaryTooltipState;
                    ypv0Var.a.put(zpv0Var.a, zpv0Var);
                }
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m3u0 m3u0Var, oz40 oz40Var, ypv0 ypv0Var, zpv0 zpv0Var, Continuation continuation) {
            super(2, continuation);
            this.$tooltipContentState = m3u0Var;
            this.$tooltipAlignmentState = oz40Var;
            this.$controller = ypv0Var;
            this.$summaryTooltipState = zpv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$tooltipContentState, this.$tooltipAlignmentState, this.$controller, this.$summaryTooltipState, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            tje.N(tseVar, null, null, new C00741(this.$tooltipContentState, this.$tooltipAlignmentState, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass2(this.$controller, this.$summaryTooltipState, null), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipControllerBoxKt$TooltipControllerBox$2$1(oz40 oz40Var, m3u0 m3u0Var, oz40 oz40Var2, ypv0 ypv0Var, zpv0 zpv0Var, Continuation continuation) {
        super(2, continuation);
        this.$tooltipJobState = oz40Var;
        this.$tooltipContentState = m3u0Var;
        this.$tooltipAlignmentState = oz40Var2;
        this.$controller = ypv0Var;
        this.$summaryTooltipState = zpv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TooltipControllerBoxKt$TooltipControllerBox$2$1 tooltipControllerBoxKt$TooltipControllerBox$2$1 = new TooltipControllerBoxKt$TooltipControllerBox$2$1(this.$tooltipJobState, this.$tooltipContentState, this.$tooltipAlignmentState, this.$controller, this.$summaryTooltipState, continuation);
        tooltipControllerBoxKt$TooltipControllerBox$2$1.L$0 = obj;
        return tooltipControllerBoxKt$TooltipControllerBox$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TooltipControllerBoxKt$TooltipControllerBox$2$1 tooltipControllerBoxKt$TooltipControllerBox$2$1 = (TooltipControllerBoxKt$TooltipControllerBox$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tooltipControllerBoxKt$TooltipControllerBox$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        l8x l8xVar = (l8x) this.$tooltipJobState.getValue();
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.$tooltipJobState.setValue(tje.N(tseVar, null, null, new AnonymousClass1(this.$tooltipContentState, this.$tooltipAlignmentState, this.$controller, this.$summaryTooltipState, null), 3));
        return zy11.a;
    }
}
