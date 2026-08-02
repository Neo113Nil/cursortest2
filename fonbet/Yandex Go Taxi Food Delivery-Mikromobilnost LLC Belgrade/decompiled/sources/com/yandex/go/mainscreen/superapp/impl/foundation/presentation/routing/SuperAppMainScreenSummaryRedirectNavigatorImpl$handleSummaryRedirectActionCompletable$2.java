package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.a7t0;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.yqv0;
import defpackage.yyr0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2", f = "SuperAppMainScreenSummaryRedirectNavigatorImpl.kt", l = {HProv.PP_INFO, HProv.PP_INFO, 119}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2 extends SuspendLambda implements wls {
    final /* synthetic */ SummaryRedirectActionModel $action;
    final /* synthetic */ tls $callbackToOpenSummary;
    final /* synthetic */ yyr0 $model;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2(c cVar, SummaryRedirectActionModel summaryRedirectActionModel, tls tlsVar, yyr0 yyr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = summaryRedirectActionModel;
        this.$callbackToOpenSummary = tlsVar;
        this.$model = yyr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2 superAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2 = new SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2(this.this$0, this.$action, this.$callbackToOpenSummary, this.$model, continuation);
        superAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2.L$0 = obj;
        return superAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0130, code lost:
    
        if (com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.c.a(r15, r14) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        c cVar;
        SummaryRedirectActionModel summaryRedirectActionModel;
        tls tlsVar;
        Address address;
        SummaryRedirectActionModel summaryRedirectActionModel2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$destinationAsync$1(this.this$0, this.$action, this.$model, null), 3);
            h = tje.h(tseVar, null, null, new SuperAppMainScreenSummaryRedirectNavigatorImpl$handleSummaryRedirectActionCompletable$2$sourceAsync$1(this.this$0, null), 3);
            c cVar2 = this.this$0;
            SummaryRedirectActionModel summaryRedirectActionModel3 = this.$action;
            tls tlsVar2 = this.$callbackToOpenSummary;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = cVar2;
            this.L$4 = summaryRedirectActionModel3;
            this.L$5 = tlsVar2;
            this.label = 1;
            obj = h2.s(this);
            if (obj != coroutineSingletons) {
                cVar = cVar2;
                summaryRedirectActionModel = summaryRedirectActionModel3;
                tlsVar = tlsVar2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            tls tlsVar3 = (tls) this.L$5;
            SummaryRedirectActionModel summaryRedirectActionModel4 = (SummaryRedirectActionModel) this.L$4;
            cVar = (c) this.L$3;
            h = (noh) this.L$2;
            kotlin.b.b(obj);
            tlsVar = tlsVar3;
            summaryRedirectActionModel = summaryRedirectActionModel4;
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c cVar3 = this.this$0;
                SummaryRedirectActionModel summaryRedirectActionModel5 = this.$action;
                cVar3.getClass();
                String str = summaryRedirectActionModel5.b;
                if (str == null || evu0.J(str)) {
                    str = null;
                }
                mi31 a = cVar3.n.a(summaryRedirectActionModel5.a, str != null ? str : "", null);
                if (a != null) {
                    cVar3.j.a(new gnx0(new fnx0(a, SelectionOrigin.ACTION), true));
                }
                return zy11.a;
            }
            address = (Address) this.L$6;
            tlsVar = (tls) this.L$5;
            summaryRedirectActionModel2 = (SummaryRedirectActionModel) this.L$4;
            cVar = (c) this.L$3;
            kotlin.b.b(obj);
            ZoneAddress zoneAddress = (ZoneAddress) obj;
            cVar.f.a(summaryRedirectActionModel2.f);
            String str2 = !summaryRedirectActionModel2.d ? summaryRedirectActionModel2.b : null;
            ((a7t0) cVar.e).b(str2 == null ? new yqv0(SummaryUiState$Type.TRAP, str2) : new yqv0(SummaryUiState$Type.NORMAL, ""));
            List list = summaryRedirectActionModel2.i;
            Preorder preorder = new Preorder(0);
            preorder.o(zoneAddress);
            preorder.x = list;
            if (address == null) {
                preorder.a(preorder.G.i(address));
            } else {
                preorder.p(cVar.b.b());
            }
            cVar.m.b();
            preorder.i(cVar.b.a.c());
            tlsVar.invoke(preorder);
            c cVar4 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 3;
        }
        Address address2 = (Address) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = cVar;
        this.L$4 = summaryRedirectActionModel;
        this.L$5 = tlsVar;
        this.L$6 = address2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            SummaryRedirectActionModel summaryRedirectActionModel6 = summaryRedirectActionModel;
            address = address2;
            obj = k;
            summaryRedirectActionModel2 = summaryRedirectActionModel6;
            ZoneAddress zoneAddress2 = (ZoneAddress) obj;
            cVar.f.a(summaryRedirectActionModel2.f);
            if (!summaryRedirectActionModel2.d) {
            }
            ((a7t0) cVar.e).b(str2 == null ? new yqv0(SummaryUiState$Type.TRAP, str2) : new yqv0(SummaryUiState$Type.NORMAL, ""));
            List list2 = summaryRedirectActionModel2.i;
            Preorder preorder2 = new Preorder(0);
            preorder2.o(zoneAddress2);
            preorder2.x = list2;
            if (address == null) {
            }
            cVar.m.b();
            preorder2.i(cVar.b.a.c());
            tlsVar.invoke(preorder2);
            c cVar42 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
