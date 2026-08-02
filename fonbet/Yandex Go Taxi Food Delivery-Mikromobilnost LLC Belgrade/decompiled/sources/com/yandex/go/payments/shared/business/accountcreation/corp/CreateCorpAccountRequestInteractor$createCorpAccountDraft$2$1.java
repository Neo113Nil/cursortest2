package com.yandex.go.payments.shared.business.accountcreation.corp;

import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.CreateCorpAccountRequestInteractor$createCorpAccountDraft$2$1", f = "CreateCorpAccountRequestInteractor.kt", l = {42, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CreateCorpAccountRequestInteractor$createCorpAccountDraft$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $city;
    final /* synthetic */ String $companyName;
    final /* synthetic */ String $contact;
    final /* synthetic */ String $contractType;
    final /* synthetic */ String $country;
    final /* synthetic */ Map<String, String> $createAccountUtm;
    final /* synthetic */ String $email;
    final /* synthetic */ String $phone;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCorpAccountRequestInteractor$createCorpAccountDraft$2$1(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$country = str;
        this.$contact = str2;
        this.$phone = str3;
        this.$companyName = str4;
        this.$city = str5;
        this.$email = str6;
        this.$contractType = str7;
        this.$createAccountUtm = map;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreateCorpAccountRequestInteractor$createCorpAccountDraft$2$1 createCorpAccountRequestInteractor$createCorpAccountDraft$2$1 = new CreateCorpAccountRequestInteractor$createCorpAccountDraft$2$1(this.$country, this.$contact, this.$phone, this.$companyName, this.$city, this.$email, this.$contractType, this.$createAccountUtm, this.this$0, continuation);
        createCorpAccountRequestInteractor$createCorpAccountDraft$2$1.L$0 = obj;
        return createCorpAccountRequestInteractor$createCorpAccountDraft$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateCorpAccountRequestInteractor$createCorpAccountDraft$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r3, null, r17) == r2) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            cmt<zy11> b = this.this$0.a.b(new ClientTrialBodyParam(this.$country, this.$contact, this.$phone, this.$companyName, this.$city, this.$email, this.$contractType, this.$createAccountUtm));
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        return vprVar.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
