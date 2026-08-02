package com.yandex.payment.divkit.usecases;

import android.content.Context;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.a5j0;
import defpackage.cvu0;
import defpackage.fq4;
import defpackage.jwq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tmk;
import defpackage.tse;
import defpackage.tyh0;
import defpackage.u2l;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lomk;", "<anonymous>", "(Ltse;)Lomk;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchSbpScreenUseCaseImpl$fetchJson$2", f = "FetchSbpScreenUseCase.kt", l = {41}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchSbpScreenUseCaseImpl$fetchJson$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<fq4> $banks;
    final /* synthetic */ u2l $parsingEnvironment;
    final /* synthetic */ boolean $showLegal;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltmk;", "<anonymous>", "()Ltmk;"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.payment.divkit.usecases.FetchSbpScreenUseCaseImpl$fetchJson$2$2", f = "FetchSbpScreenUseCase.kt", l = {42}, m = "invokeSuspend", v = 1)
    /* renamed from: com.yandex.payment.divkit.usecases.FetchSbpScreenUseCaseImpl$fetchJson$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements tls {
        final /* synthetic */ List<fq4> $banks;
        final /* synthetic */ u2l $parsingEnvironment;
        final /* synthetic */ boolean $showLegal;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(u2l u2lVar, k kVar, List list, Continuation continuation, boolean z) {
            super(1, continuation);
            this.this$0 = kVar;
            this.$banks = list;
            this.$showLegal = z;
            this.$parsingEnvironment = u2lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.$parsingEnvironment, this.this$0, this.$banks, continuation, this.$showLegal);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            k kVar = this.this$0;
            List<fq4> list = this.$banks;
            boolean z = this.$showLegal;
            this.label = 1;
            kVar.getClass();
            String jSONObject = kVar.a.a("select_bank_screen.json").toString();
            Context context = kVar.b.a;
            JSONObject jSONObject2 = new JSONObject(cvu0.v(cvu0.v(cvu0.v(cvu0.v(jSONObject, "SBP_SCREEN_TITLE", context.getString(tyh0.paymentsdk_prebuild_sbp_title), false), "SBP_SCREEN_SUBTITLE", context.getString(tyh0.paymentsdk_prebuild_sbp_subtitle), false), "BANK_NOT_FOUND", context.getString(tyh0.paymentsdk_prebuild_sbp_bank_not_found), false), "SBP_LEGAL_VISIBILITY", z ? "visible" : "gone", false));
            JSONArray jSONArray = jSONObject2.getJSONObject("card").getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items").getJSONObject(1).getJSONArray("items").getJSONObject(1).getJSONArray("items");
            for (fq4 fq4Var : kotlin.collections.a.x0(list, new jwq())) {
                JSONObject put = new JSONObject().put("type", "bank_cell");
                String str = fq4Var.a;
                jSONArray.put(put.put("bankName", str).put("logoURL", fq4Var.b).put("visibilityExpression", "@{contains('" + str.toLowerCase(Locale.ROOT) + "', toLowerCase(trim(select_bank_screen_bank_name_filter))) ? 'visible' : 'gone' }").put("selectBankURL", "payment-sdk://select_bank?scheme=".concat(fq4Var.c)).put("delimeterVisibility", "@{select_bank_screen_last_bank_name == '" + str + "' ? 'gone' : 'visible' }"));
            }
            tmk tmkVar = new tmk(jSONObject2.getJSONObject("templates"), jSONObject2.getJSONObject("card"));
            return tmkVar == coroutineSingletons ? coroutineSingletons : tmkVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchSbpScreenUseCaseImpl$fetchJson$2(u2l u2lVar, k kVar, List list, Continuation continuation, boolean z) {
        super(2, continuation);
        this.$banks = list;
        this.$showLegal = z;
        this.this$0 = kVar;
        this.$parsingEnvironment = u2lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        List<fq4> list = this.$banks;
        boolean z = this.$showLegal;
        return new FetchSbpScreenUseCaseImpl$fetchJson$2(this.$parsingEnvironment, this.this$0, list, continuation, z);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchSbpScreenUseCaseImpl$fetchJson$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        JSONArray jSONArray = new JSONArray();
        for (fq4 fq4Var : this.$banks) {
            jSONArray.put(new JSONObject().put("bankName", fq4Var.a).put("logoURL", fq4Var.b).put("scheme", fq4Var.c).put("isFavorite", fq4Var.d).put("isInstalled", fq4Var.e));
        }
        a5j0 a5j0Var = new a5j0(DivCardForAnalytics.BANK_SELECT, new JSONObject(kotlin.collections.b.i(new Pair("banks", jSONArray), new Pair("shouldShowLegal", Boolean.valueOf(this.$showLegal)))), 2);
        k kVar = this.this$0;
        com.yandex.payment.divkit.common.a aVar = kVar.c;
        u2l u2lVar = this.$parsingEnvironment;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(u2lVar, kVar, this.$banks, null, this.$showLegal);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        Object a = aVar.a(u2lVar, a5j0Var, anonymousClass2, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
