package com.yandex.go.payments_widgets.section.payments.loyalty;

import android.view.View;
import com.yandex.go.flex.common.descriptors.section.payments.loyalty.LoyaltyProgressViewProperties;
import com.yandex.go.flex.common.descriptors.section.payments.loyalty.LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient;
import com.yandex.go.flex.common.descriptors.section.payments.loyalty.LoyaltyProgressViewProperties$ProgressArcColor$Solid;
import defpackage.clk;
import defpackage.kdc;
import defpackage.kjz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tvz;
import defpackage.ufu;
import defpackage.uvz;
import defpackage.uyj;
import defpackage.vvz;
import defpackage.w511;
import defpackage.wls;
import defpackage.wnt;
import defpackage.wvz;
import defpackage.xnt;
import defpackage.yvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.section.payments.loyalty.LoyaltyProgressViewAdapter$bindView$1", f = "LoyaltyProgressViewAdapter.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LoyaltyProgressViewAdapter$bindView$1 extends SuspendLambda implements wls {
    final /* synthetic */ clk $div;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwvz;", "<anonymous>", "(Ltse;)Lwvz;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.payments_widgets.section.payments.loyalty.LoyaltyProgressViewAdapter$bindView$1$1", f = "LoyaltyProgressViewAdapter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.payments_widgets.section.payments.loyalty.LoyaltyProgressViewAdapter$bindView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ clk $div;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(clk clkVar, a aVar, Continuation continuation) {
            super(2, continuation);
            this.$div = clkVar;
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$div, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            vvz tvzVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            JSONObject jSONObject = this.$div.i;
            if (jSONObject != null) {
                kjz kjzVar = this.this$0.d;
                LoyaltyProgressViewProperties loyaltyProgressViewProperties = (LoyaltyProgressViewProperties) ((xnt) ((wnt) kjzVar.b)).c(jSONObject.toString(), LoyaltyProgressViewProperties.Companion.serializer());
                ufu ufuVar = (ufu) ((pdc) kjzVar.c);
                kdc b = ufuVar.b(loyaltyProgressViewProperties.b);
                yvz yvzVar = loyaltyProgressViewProperties.c;
                if (yvzVar instanceof LoyaltyProgressViewProperties$ProgressArcColor$Solid) {
                    tvzVar = new uvz(ufuVar.b(((LoyaltyProgressViewProperties$ProgressArcColor$Solid) yvzVar).a));
                } else if (yvzVar instanceof LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient) {
                    LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient loyaltyProgressViewProperties$ProgressArcColor$LinearGradient = (LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient) yvzVar;
                    List list = loyaltyProgressViewProperties$ProgressArcColor$LinearGradient.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        kdc b2 = ufuVar.b((String) it.next());
                        if (b2 != null) {
                            arrayList.add(b2);
                        }
                    }
                    tvzVar = new tvz(arrayList, loyaltyProgressViewProperties$ProgressArcColor$LinearGradient.b);
                } else {
                    w511.b();
                }
                return new wvz(loyaltyProgressViewProperties.a, b, tvzVar, loyaltyProgressViewProperties.d, loyaltyProgressViewProperties.e);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyProgressViewAdapter$bindView$1(a aVar, View view, clk clkVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$view = view;
        this.$div = clkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoyaltyProgressViewAdapter$bindView$1(this.this$0, this.$view, this.$div, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoyaltyProgressViewAdapter$bindView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$div, this.this$0, null);
            this.label = 1;
            obj = tje.k0(sjhVar, anonymousClass1, this);
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
        wvz wvzVar = (wvz) obj;
        if (wvzVar != null) {
            ((LoyaltyProgressView) this.$view).bindData(wvzVar);
        }
        return zy11.a;
    }
}
