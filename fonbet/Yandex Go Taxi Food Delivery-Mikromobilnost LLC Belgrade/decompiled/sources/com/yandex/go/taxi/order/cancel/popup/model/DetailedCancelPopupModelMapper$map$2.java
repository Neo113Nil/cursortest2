package com.yandex.go.taxi.order.cancel.popup.model;

import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton;
import com.yandex.go.taxi.order.models.api.cancel.CostInfo;
import com.yandex.go.taxi.order.models.api.cancel.DetailedCancelNotification;
import defpackage.bdc;
import defpackage.fef;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.j2j;
import defpackage.k2j;
import defpackage.l2j;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll2j;", "<anonymous>", "(Ltse;)Ll2j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.popup.model.DetailedCancelPopupModelMapper$map$2", f = "DetailedCancelPopupModelMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailedCancelPopupModelMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ ief $currencyRulesDto;
    final /* synthetic */ DetailedCancelNotification $notification;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedCancelPopupModelMapper$map$2(a aVar, DetailedCancelNotification detailedCancelNotification, ief iefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$notification = detailedCancelNotification;
        this.$currencyRulesDto = iefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailedCancelPopupModelMapper$map$2(this.this$0, this.$notification, this.$currencyRulesDto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailedCancelPopupModelMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k2j k2jVar;
        Iterator it;
        Object obj2;
        AfterCancelPopupButton afterCancelPopupButton;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        j2j j2jVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String a = ((m7x0) this.this$0.d).a(this.$notification.a);
        DetailedCancelNotification detailedCancelNotification = this.$notification;
        String str = detailedCancelNotification.b;
        String str2 = detailedCancelNotification.c;
        a aVar = this.this$0;
        ief iefVar = this.$currencyRulesDto;
        xdf xdfVar = aVar.b;
        CostInfo costInfo = detailedCancelNotification.d;
        if (costInfo != null) {
            String str3 = costInfo.b;
            if (str3.length() > 0) {
                fef h = iefVar != null ? gwk0.h(iefVar) : null;
                k2jVar = new k2j(((m7x0) aVar.d).a(costInfo.a), xdfVar.a(h, str3, false, false), xdfVar.a(h, costInfo.c, false, false));
                a aVar2 = this.this$0;
                DetailedCancelNotification detailedCancelNotification2 = this.$notification;
                pdc pdcVar = aVar2.c;
                it = detailedCancelNotification2.e.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = it.next();
                        AfterCancelPopupButton afterCancelPopupButton2 = (AfterCancelPopupButton) obj2;
                        if (afterCancelPopupButton2.a.length() > 0 && afterCancelPopupButton2.d.b()) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                afterCancelPopupButton = (AfterCancelPopupButton) obj2;
                if (afterCancelPopupButton != null) {
                    ufu ufuVar = (ufu) pdcVar;
                    j2jVar = new j2j(afterCancelPopupButton.a, ufuVar.h(new bdc(xng0.textOnControl), afterCancelPopupButton.c), ufuVar.d(new bdc(xng0.controlMain), afterCancelPopupButton.b), afterCancelPopupButton.d);
                }
                return new l2j(a, str, str2, k2jVar, j2jVar);
            }
        }
        k2jVar = null;
        a aVar22 = this.this$0;
        DetailedCancelNotification detailedCancelNotification22 = this.$notification;
        pdc pdcVar2 = aVar22.c;
        it = detailedCancelNotification22.e.b.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        afterCancelPopupButton = (AfterCancelPopupButton) obj2;
        if (afterCancelPopupButton != null) {
        }
        return new l2j(a, str, str2, k2jVar, j2jVar);
    }
}
