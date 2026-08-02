package com.yandex.go.payments_widgets.mini.widgets.presentation;

import android.view.ViewGroup;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.b3k;
import defpackage.cea0;
import defpackage.gci0;
import defpackage.mds0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t9a0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xvl;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.mini.widgets.presentation.PaymentsMiniWidgetsViewHolder$attach$1", f = "PaymentsMiniWidgetsViewHolder.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentsMiniWidgetsViewHolder$attach$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcea0;", Constants.KEY_DATA, "Lb3k;", "div2ContextProvider", "Lzy11;", "<anonymous>", "(Lcea0;Lb3k;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments_widgets.mini.widgets.presentation.PaymentsMiniWidgetsViewHolder$attach$1$1", f = "PaymentsMiniWidgetsViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments_widgets.mini.widgets.presentation.PaymentsMiniWidgetsViewHolder$attach$1$1, reason: invalid class name */
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
            anonymousClass1.L$0 = (cea0) obj;
            anonymousClass1.L$1 = (b3k) obj2;
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            cea0 cea0Var = (cea0) this.L$0;
            b3k b3kVar = (b3k) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a aVar = this.this$0;
            Div2Context a = b3kVar.a(aVar.d, aVar.e);
            ViewGroup viewGroup = aVar.b;
            if (cea0Var == null) {
                viewGroup.removeAllViews();
            } else {
                mds0 mds0Var = cea0Var.a;
                viewGroup.removeAllViews();
                Div2View div2View = new Div2View(a, null, 0, 6, null);
                viewGroup.addView(new PaymentMiniWidgetsContainer(div2View, cea0Var.b ? new t9a0(5, aVar) : null));
                xvl xvlVar = mds0Var.a;
                div2View.setData(xvlVar.b.a, xvlVar.c);
                div2View.setActionHandler(mds0Var.b);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsMiniWidgetsViewHolder$attach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsMiniWidgetsViewHolder$attach$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsMiniWidgetsViewHolder$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            gci0 d = e.d(this.this$0.h.a);
            a aVar = this.this$0;
            m0 m0Var = new m0(d, new mth(aVar.i.a, 6), new AnonymousClass1(aVar, null));
            this.label = 1;
            if (e.j(m0Var, this) == coroutineSingletons) {
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
