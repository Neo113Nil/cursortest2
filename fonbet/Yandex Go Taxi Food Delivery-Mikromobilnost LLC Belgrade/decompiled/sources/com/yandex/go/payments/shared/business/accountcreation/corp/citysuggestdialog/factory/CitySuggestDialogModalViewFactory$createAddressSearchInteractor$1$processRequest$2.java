package com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory;

import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggest;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggestRequest;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggestResponse;
import defpackage.c4f;
import defpackage.cmt;
import defpackage.g050;
import defpackage.itj0;
import defpackage.iwb;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pnt0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w9v0;
import defpackage.wls;
import defpackage.x9v0;
import defpackage.xby;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ljtj0;", "Lx9v0;", "<anonymous>", "(Ltse;)Ljtj0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequest$2", f = "CitySuggestDialogModalViewFactory.kt", l = {128, 179}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ c4f $pageInfo;
    final /* synthetic */ String $query;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ iwb this$0;
    final /* synthetic */ a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequest$2(iwb iwbVar, String str, c4f c4fVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iwbVar;
        this.$query = str;
        this.$pageInfo = c4fVar;
        this.this$1 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequest$2(this.this$0, this.$query, this.$pageInfo, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CitySuggestDialogModalViewFactory$createAddressSearchInteractor$1$processRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5 A[Catch: all -> 0x00db, LOOP:0: B:11:0x00af->B:13:0x00b5, LOOP_END, TryCatch #1 {all -> 0x00db, blocks: (B:10:0x0097, B:11:0x00af, B:13:0x00b5, B:15:0x00dd), top: B:9:0x0097, outer: #3 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        iwb iwbVar;
        String str;
        c4f c4fVar;
        a aVar;
        Object a;
        iwb iwbVar2;
        CitySuggestResponse citySuggestResponse;
        c4f c4fVar2;
        a aVar2;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                iwbVar = this.this$0;
                str = this.$query;
                c4fVar = this.$pageInfo;
                aVar = this.this$1;
                cmt<CitySuggestResponse> a2 = iwbVar.b.a(new CitySuggestRequest(str, c4fVar.c));
                this.L$0 = iwbVar;
                this.L$1 = str;
                this.L$2 = c4fVar;
                this.L$3 = aVar;
                this.label = 1;
                a = ru.yandex.taxi.network.api.a.a(a2, null, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) this.L$5;
                    citySuggestResponse = (CitySuggestResponse) this.L$4;
                    aVar2 = (a) this.L$3;
                    c4fVar2 = (c4f) this.L$2;
                    str = (String) this.L$1;
                    iwbVar2 = (iwb) this.L$0;
                    b.b(obj);
                    String str2 = str;
                    try {
                        pnt0 pnt0Var = aVar2.b;
                        pnt0Var.clear();
                        List<CitySuggest> list = citySuggestResponse.a;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        for (CitySuggest citySuggest : list) {
                            int e = pnt0Var.e();
                            w9v0 w9v0Var = new w9v0(e);
                            w9v0Var.b = citySuggest.a;
                            w9v0Var.f = citySuggest.b;
                            w9v0Var.t = false;
                            x9v0 x9v0Var = new x9v0(w9v0Var);
                            pnt0Var.d(e, citySuggest);
                            arrayList.add(x9v0Var);
                        }
                        List J0 = kotlin.collections.a.J0(arrayList);
                        g050Var.d(null);
                        iwbVar2.c.a(c4fVar2.a, iwbVar2.d.b(), J0.size(), str2);
                        return new itj0("corp_account_city_request", RoutePointType.CITY_SUGGEST, System.nanoTime(), J0, str2, null);
                    } catch (Throwable th) {
                        g050Var.d(null);
                        throw th;
                    }
                }
                a aVar3 = (a) this.L$3;
                c4f c4fVar3 = (c4f) this.L$2;
                str = (String) this.L$1;
                iwb iwbVar3 = (iwb) this.L$0;
                b.b(obj);
                aVar = aVar3;
                iwbVar = iwbVar3;
                c4fVar = c4fVar3;
                a = obj;
            }
            CitySuggestResponse citySuggestResponse2 = (CitySuggestResponse) a;
            kotlinx.coroutines.sync.a aVar4 = aVar.a;
            this.L$0 = iwbVar;
            this.L$1 = str;
            this.L$2 = c4fVar;
            this.L$3 = aVar;
            this.L$4 = citySuggestResponse2;
            this.L$5 = aVar4;
            this.L$6 = null;
            this.label = 2;
            if (aVar4.a(this) != coroutineSingletons) {
                iwbVar2 = iwbVar;
                citySuggestResponse = citySuggestResponse2;
                c4fVar2 = c4fVar;
                aVar2 = aVar;
                g050Var = aVar4;
                String str22 = str;
                pnt0 pnt0Var2 = aVar2.b;
                pnt0Var2.clear();
                List<CitySuggest> list2 = citySuggestResponse.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                while (r2.hasNext()) {
                }
                List J02 = kotlin.collections.a.J0(arrayList2);
                g050Var.d(null);
                iwbVar2.c.a(c4fVar2.a, iwbVar2.d.b(), J02.size(), str22);
                return new itj0("corp_account_city_request", RoutePointType.CITY_SUGGEST, System.nanoTime(), J02, str22, null);
            }
            return coroutineSingletons;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            xby.l(jst.e, "B2B.TOKEN_ERROR:PROCESS_CITY_SUGGEST_RESPONSE", null, th2, "process city suggest response error", 2);
            throw th2;
        }
    }
}
