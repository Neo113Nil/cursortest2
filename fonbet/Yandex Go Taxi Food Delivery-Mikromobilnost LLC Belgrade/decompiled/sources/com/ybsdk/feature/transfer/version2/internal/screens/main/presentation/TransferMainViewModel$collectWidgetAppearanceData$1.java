package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferToggleShownState;
import com.ybsdk.feature.transfer.version2.internal.entities.ControlState;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.Toggles;
import defpackage.ajq0;
import defpackage.cjq0;
import defpackage.djq0;
import defpackage.em3;
import defpackage.g8e;
import defpackage.gjq0;
import defpackage.hjq0;
import defpackage.ijq0;
import defpackage.jjq0;
import defpackage.kjq0;
import defpackage.ljq0;
import defpackage.mj01;
import defpackage.mvg;
import defpackage.njq0;
import defpackage.ny61;
import defpackage.ojq0;
import defpackage.pjq0;
import defpackage.pz40;
import defpackage.qj01;
import defpackage.rjq0;
import defpackage.tjq0;
import defpackage.tse;
import defpackage.ujq0;
import defpackage.vjq0;
import defpackage.vm01;
import defpackage.w511;
import defpackage.wjq0;
import defpackage.wk01;
import defpackage.wls;
import defpackage.xk01;
import defpackage.zk01;
import defpackage.zls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainViewModel$collectWidgetAppearanceData$1", f = "TransferMainViewModel.kt", l = {521}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMainViewModel$collectWidgetAppearanceData$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxk01;", "accumulator", "value", "<anonymous>", "(Lxk01;Lxk01;)Lxk01;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainViewModel$collectWidgetAppearanceData$1$1", f = "TransferMainViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainViewModel$collectWidgetAppearanceData$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = aVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (Continuation) obj3);
            anonymousClass1.L$0 = (xk01) obj;
            anonymousClass1.L$1 = (xk01) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ControlState controlState;
            TransferEvents$TransferToggleShownState transferEvents$TransferToggleShownState;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            xk01 xk01Var = (xk01) this.L$0;
            xk01 xk01Var2 = (xk01) this.L$1;
            qj01 qj01Var = this.this$0.V;
            qj01Var.getClass();
            wk01 b = zk01.b(xk01Var2);
            wjq0 wjq0Var = b != null ? b.i : null;
            if (wjq0Var instanceof jjq0) {
                vm01 vm01Var = b.C;
                if (vm01Var != null) {
                    controlState = vm01Var.d;
                }
                controlState = null;
            } else {
                if (wjq0Var instanceof ujq0) {
                    vm01 vm01Var2 = b.C;
                    if (vm01Var2 != null) {
                        controlState = vm01Var2.d;
                    }
                } else if (!(wjq0Var instanceof ajq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof njq0) && !(wjq0Var instanceof pjq0) && !(wjq0Var instanceof rjq0) && !(wjq0Var instanceof tjq0) && !(wjq0Var instanceof vjq0) && !(wjq0Var instanceof ojq0) && !(wjq0Var instanceof hjq0) && !(wjq0Var instanceof gjq0) && !(wjq0Var instanceof kjq0) && wjq0Var != null) {
                    w511.b();
                    return null;
                }
                controlState = null;
            }
            int i = controlState == null ? -1 : mj01.a[controlState.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    transferEvents$TransferToggleShownState = TransferEvents$TransferToggleShownState.ON;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    transferEvents$TransferToggleShownState = TransferEvents$TransferToggleShownState.OFF;
                }
                boolean a = qj01.a(xk01Var);
                boolean a2 = qj01.a(xk01Var2);
                if (!a && a2) {
                    em3 em3Var = qj01Var.a.q0;
                    LinkedHashMap w = g8e.w(2, "toggle", Toggles.AUTO_TOPUP.getTitle());
                    w.put(ClidProvider.STATE, transferEvents$TransferToggleShownState.getOriginalValue());
                    em3Var.a.a("transfer.toggle.shown", w);
                }
            }
            return xk01Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMainViewModel$collectWidgetAppearanceData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferMainViewModel$collectWidgetAppearanceData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferMainViewModel$collectWidgetAppearanceData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (e.L(Y, anonymousClass1, this) == coroutineSingletons) {
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
