package com.yandex.go.payments.shared.business.accountcreation.corp.factory;

import com.yandex.go.payments.shared.business.accountcreation.corp.CreateCorpAccountAccountAlreadyExists;
import com.yandex.go.payments.shared.business.accountcreation.corp.CreateCorpAccountDraftException;
import com.yandex.go.payments.shared.business.accountcreation.corp.CreateCorpAccountFailedValidation;
import com.yandex.go.payments.shared.business.accountcreation.corp.CreateCorpAccountLimitExceededException;
import com.yandex.go.payments.shared.business.accountcreation.corp.d;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.aue;
import defpackage.avj0;
import defpackage.bc;
import defpackage.cma1;
import defpackage.d4f;
import defpackage.d6z;
import defpackage.dve;
import defpackage.ej6;
import defpackage.evu0;
import defpackage.i3v0;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o61;
import defpackage.qcx;
import defpackage.s8o;
import defpackage.sbx;
import defpackage.tse;
import defpackage.tue;
import defpackage.uza;
import defpackage.vbb;
import defpackage.vue;
import defpackage.wls;
import defpackage.xby;
import defpackage.xve;
import defpackage.zte;
import defpackage.zue;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView$createCorpDraft$1", f = "CorpCreatingDraftModalView.kt", l = {428}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class CorpCreatingDraftModalView$createCorpDraft$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $city;
    final /* synthetic */ String $companyName;
    final /* synthetic */ String $contact;
    final /* synthetic */ String $email;
    final /* synthetic */ SharedPaymentsOpenReason $openReason;
    final /* synthetic */ String $phone;
    Object L$0;
    int label;
    final /* synthetic */ CorpCreatingDraftModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpCreatingDraftModalView$createCorpDraft$1(CorpCreatingDraftModalView corpCreatingDraftModalView, SharedPaymentsOpenReason sharedPaymentsOpenReason, String str, String str2, String str3, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.this$0 = corpCreatingDraftModalView;
        this.$openReason = sharedPaymentsOpenReason;
        this.$email = str;
        this.$companyName = str2;
        this.$city = str3;
        this.$contact = str4;
        this.$phone = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorpCreatingDraftModalView$createCorpDraft$1(this.this$0, this.$openReason, this.$email, this.$companyName, this.$city, this.$contact, this.$phone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CorpCreatingDraftModalView$createCorpDraft$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x017e, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0255 A[Catch: Exception -> 0x025a, TryCatch #4 {Exception -> 0x025a, blocks: (B:53:0x0123, B:110:0x024f, B:112:0x0255, B:113:0x0263, B:116:0x0294, B:119:0x02b7, B:122:0x02be, B:124:0x02c6, B:126:0x029b, B:128:0x02a3, B:130:0x02ab, B:132:0x02b1, B:133:0x026d, B:135:0x0275, B:137:0x027d, B:139:0x0285, B:141:0x028b, B:147:0x0240), top: B:52:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02e0  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        dve binding;
        dve binding2;
        aue aueVar;
        d dVar;
        aue aueVar2;
        aue aueVar3;
        Object a;
        dve binding3;
        dve binding4;
        ej6 ej6Var;
        d4f d4fVar;
        dve binding5;
        dve binding6;
        zte zteVar;
        d4f d4fVar2;
        d4f d4fVar3;
        String str;
        tue tueVar;
        ej6 ej6Var2;
        Object obj2;
        Exception exc;
        Throwable illegalArgumentException;
        BufferedInputStream N;
        LinkedHashMap linkedHashMap;
        Throwable th;
        String str2;
        String str3;
        String str4;
        Integer M;
        Integer M2;
        Integer M3;
        BufferedReader bufferedReader;
        b bVar;
        String g;
        String str5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            binding = this.this$0.getBinding();
            binding.h.setEnabled(false);
            binding2 = this.this$0.getBinding();
            binding2.i.setShimmering(true);
            aueVar = this.this$0.dataInteractor;
            SharedPaymentsOpenReason sharedPaymentsOpenReason = this.$openReason;
            List<CorpAccountFlowExperiment.AndroidCreateAccountUtmRecord> list = aueVar.a.d.o.a;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("utm_medium", sharedPaymentsOpenReason.getAnalyticsName());
            for (CorpAccountFlowExperiment.AndroidCreateAccountUtmRecord androidCreateAccountUtmRecord : list) {
                String str6 = androidCreateAccountUtmRecord.a;
                String str7 = androidCreateAccountUtmRecord.b;
                if (str6 != null && str6.length() != 0 && str7 != null && str7.length() != 0) {
                    linkedHashMap2.put(androidCreateAccountUtmRecord.a, str7);
                }
            }
            dVar = this.this$0.createCorpAccountRequestInteractor;
            String str8 = this.$email;
            String str9 = this.$companyName;
            String str10 = this.$city;
            String str11 = this.$contact;
            String str12 = this.$phone;
            aueVar2 = this.this$0.dataInteractor;
            String str13 = aueVar2.a.d.n;
            aueVar3 = this.this$0.dataInteractor;
            String str14 = aueVar3.a.d.m;
            this.L$0 = null;
            this.label = 1;
            a = dVar.a(str8, str9, str10, str11, str12, str13, str14, linkedHashMap2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        Object obj3 = a;
        CorpCreatingDraftModalView corpCreatingDraftModalView = this.this$0;
        Throwable a2 = Result.a(obj3);
        if (a2 != null) {
            binding5 = corpCreatingDraftModalView.getBinding();
            binding5.h.setEnabled(true);
            binding6 = corpCreatingDraftModalView.getBinding();
            binding6.i.setShimmering(false);
            zteVar = corpCreatingDraftModalView.corpAccountErrorInterceptor;
            d4fVar2 = corpCreatingDraftModalView.pageInfo;
            SharedPaymentsOpenReason sharedPaymentsOpenReason2 = d4fVar2.h;
            vue vueVar = new vue(corpCreatingDraftModalView, 1);
            d4fVar3 = corpCreatingDraftModalView.pageInfo;
            CorpAccountFlowExperiment corpAccountFlowExperiment = d4fVar3.i.a;
            String Y = d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.l.a);
            tue tueVar2 = zteVar.c;
            ej6 ej6Var3 = zteVar.b;
            String str15 = "";
            try {
                str = Y;
                ej6Var2 = ej6Var3;
                obj2 = "fields";
                try {
                    xby.l(jst.e, "B2B.TOKEN_ERROR:PROCESS_CITY_SUGGEST_RESPONSE", null, a2, "process city suggest response error", 2);
                    N = s8o.N(a2);
                } catch (Exception e) {
                    e = e;
                    tueVar = tueVar2;
                }
            } catch (Exception e2) {
                e = e2;
                str = Y;
                tueVar = tueVar2;
                ej6Var2 = ej6Var3;
                obj2 = "fields";
            }
            if (N != null) {
                try {
                    linkedHashMap = new LinkedHashMap();
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(N, uza.a), 8192);
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = "";
                        str3 = str2;
                    }
                } catch (Exception e3) {
                    exc = e3;
                    tueVar = tueVar2;
                    xby.l(jst.e, "B2B.TOKEN_ERROR:PROCESS_CITY_SUGGEST_RESPONSE", null, exc, "convert retrofit error", 2);
                    illegalArgumentException = new IllegalArgumentException();
                    if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                    }
                    CorpCreatingDraftModalView corpCreatingDraftModalView2 = this.this$0;
                    SharedPaymentsOpenReason sharedPaymentsOpenReason3 = this.$openReason;
                    String str16 = this.$email;
                    if (!(obj3 instanceof Result.Failure)) {
                    }
                    return zy11.a;
                }
                try {
                    String x0 = cma1.x0(bufferedReader);
                    bufferedReader.close();
                    c cVar = (c) sbx.d.b(c.Companion.serializer(), x0);
                    b bVar2 = (b) cVar.get(AuthSdkActivity.RESPONSE_TYPE_CODE);
                    if (bVar2 == null || (str4 = qcx.g(qcx.n(bVar2))) == null) {
                        str4 = "";
                    }
                    try {
                        b bVar3 = (b) cVar.get(Constants.KEY_MESSAGE);
                        if (bVar3 != null) {
                            str3 = qcx.g(qcx.n(bVar3));
                        }
                        str3 = "";
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = "";
                        str3 = str2;
                    }
                    try {
                        b bVar4 = (b) cVar.get("details");
                        c m = bVar4 != null ? qcx.m(bVar4) : new c(kotlin.collections.b.f());
                        b bVar5 = (b) m.get(CRLReasonCodeExtension.REASON);
                        if (bVar5 != null && (g = qcx.g(qcx.n(bVar5))) != null) {
                            str15 = g;
                        }
                        b bVar6 = (b) m.get(obj2);
                        if (bVar6 != null) {
                            Iterator it = qcx.l(bVar6).a.iterator();
                            while (it.hasNext()) {
                                b bVar7 = (b) it.next();
                                Iterator it2 = it;
                                b bVar8 = (b) qcx.m(bVar7).get("field");
                                String g2 = bVar8 != null ? qcx.g(qcx.n(bVar8)) : null;
                                b bVar9 = (b) qcx.m(bVar7).get("messages");
                                String g3 = (bVar9 == null || (bVar = qcx.l(bVar9).get(0)) == null) ? null : qcx.g(qcx.n(bVar));
                                if (g2 != null && !evu0.J(g2) && g3 != null && !evu0.J(g3)) {
                                    linkedHashMap.put(g2, g3);
                                }
                                it = it2;
                            }
                        }
                        str2 = str15;
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = str15;
                        str15 = str4;
                        xby.l(jst.e, "B2B.TOKEN_ERROR:PROCESS_CITY_SUGGEST_RESPONSE", null, th, "process city suggest response error parse error", 2);
                        str4 = str15;
                        Integer M4 = s8o.M(a2);
                        ej6Var2.c(sharedPaymentsOpenReason2, M4 == null ? M4.intValue() : 100);
                        M = s8o.M(a2);
                        if (M != null) {
                            illegalArgumentException = new CreateCorpAccountFailedValidation(linkedHashMap);
                            tueVar = tueVar2;
                            if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                            }
                            CorpCreatingDraftModalView corpCreatingDraftModalView22 = this.this$0;
                            SharedPaymentsOpenReason sharedPaymentsOpenReason32 = this.$openReason;
                            String str162 = this.$email;
                            if (!(obj3 instanceof Result.Failure)) {
                            }
                            return zy11.a;
                        }
                        M2 = s8o.M(a2);
                        if (M2 != null) {
                            illegalArgumentException = new CreateCorpAccountAccountAlreadyExists(str3);
                            tueVar = tueVar2;
                            if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                            }
                            CorpCreatingDraftModalView corpCreatingDraftModalView222 = this.this$0;
                            SharedPaymentsOpenReason sharedPaymentsOpenReason322 = this.$openReason;
                            String str1622 = this.$email;
                            if (!(obj3 instanceof Result.Failure)) {
                            }
                            return zy11.a;
                        }
                        M3 = s8o.M(a2);
                        if (M3 != null) {
                            illegalArgumentException = new CreateCorpAccountLimitExceededException(str3);
                            tueVar = tueVar2;
                            if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                            }
                            CorpCreatingDraftModalView corpCreatingDraftModalView2222 = this.this$0;
                            SharedPaymentsOpenReason sharedPaymentsOpenReason3222 = this.$openReason;
                            String str16222 = this.$email;
                            if (!(obj3 instanceof Result.Failure)) {
                            }
                            return zy11.a;
                        }
                        tueVar2.getClass();
                        if (a2 instanceof IOException) {
                        }
                        if (str5 != null) {
                        }
                        str5 = ((avj0) tueVar.a).h(kyh0.common_unknown_error);
                        illegalArgumentException = new CreateCorpAccountDraftException(str5);
                        if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                        }
                        CorpCreatingDraftModalView corpCreatingDraftModalView22222 = this.this$0;
                        SharedPaymentsOpenReason sharedPaymentsOpenReason32222 = this.$openReason;
                        String str162222 = this.$email;
                        if (!(obj3 instanceof Result.Failure)) {
                        }
                        return zy11.a;
                    }
                    Integer M42 = s8o.M(a2);
                    ej6Var2.c(sharedPaymentsOpenReason2, M42 == null ? M42.intValue() : 100);
                    M = s8o.M(a2);
                    if (M != null && M.intValue() == 400 && str4.equals("VALIDATION_ERROR") && str2.equals("validation error") && !linkedHashMap.isEmpty()) {
                        illegalArgumentException = new CreateCorpAccountFailedValidation(linkedHashMap);
                        tueVar = tueVar2;
                        if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                            zteVar.a(corpCreatingDraftModalView, ((CreateCorpAccountDraftException) illegalArgumentException).getErrorMessage(), str);
                        } else if (illegalArgumentException instanceof CreateCorpAccountLimitExceededException) {
                            vueVar.invoke();
                        } else if (illegalArgumentException instanceof CreateCorpAccountFailedValidation) {
                            Map fieldMap = ((CreateCorpAccountFailedValidation) illegalArgumentException).getFieldMap();
                            Set keySet = fieldMap.keySet();
                            o61 o61Var = ej6Var2.a;
                            String analyticsName = sharedPaymentsOpenReason2.getAnalyticsName();
                            List J0 = a.J0(keySet);
                            o61Var.getClass();
                            HashMap hashMap = new HashMap();
                            if (analyticsName != null) {
                                hashMap.put("open_reason", analyticsName);
                            }
                            hashMap.put(obj2, J0);
                            o61Var.a.a("CreateCorpScreen.CreateCorpTrialValidationError", hashMap, 1, new HashMap());
                            corpCreatingDraftModalView.setAlertText(fieldMap);
                        } else if (illegalArgumentException instanceof CreateCorpAccountAccountAlreadyExists) {
                            zteVar.a(corpCreatingDraftModalView, ((CreateCorpAccountAccountAlreadyExists) illegalArgumentException).getErrorMessage(), str);
                        } else {
                            zteVar.a(corpCreatingDraftModalView, ((avj0) tueVar.a).h(kyh0.common_unknown_error), str);
                        }
                    }
                    M2 = s8o.M(a2);
                    if (M2 != null && M2.intValue() == 409 && str4.equals("CLIENT_ALREADY_EXISTS") && str3.length() > 0) {
                        illegalArgumentException = new CreateCorpAccountAccountAlreadyExists(str3);
                        tueVar = tueVar2;
                        if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                        }
                    }
                    M3 = s8o.M(a2);
                    if (M3 != null && M3.intValue() == 429) {
                        illegalArgumentException = new CreateCorpAccountLimitExceededException(str3);
                        tueVar = tueVar2;
                        if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                        }
                    }
                } finally {
                }
            }
            tueVar2.getClass();
            if (a2 instanceof IOException) {
                tueVar = tueVar2;
                str5 = null;
            } else {
                tueVar = tueVar2;
                try {
                    str5 = ((avj0) tueVar.a).h(kyh0.network_error);
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    xby.l(jst.e, "B2B.TOKEN_ERROR:PROCESS_CITY_SUGGEST_RESPONSE", null, exc, "convert retrofit error", 2);
                    illegalArgumentException = new IllegalArgumentException();
                    if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
                    }
                    CorpCreatingDraftModalView corpCreatingDraftModalView222222 = this.this$0;
                    SharedPaymentsOpenReason sharedPaymentsOpenReason322222 = this.$openReason;
                    String str1622222 = this.$email;
                    if (!(obj3 instanceof Result.Failure)) {
                    }
                    return zy11.a;
                }
            }
            if (str5 != null || str5.length() == 0) {
                str5 = ((avj0) tueVar.a).h(kyh0.common_unknown_error);
            }
            illegalArgumentException = new CreateCorpAccountDraftException(str5);
            if (!(illegalArgumentException instanceof CreateCorpAccountDraftException)) {
            }
        }
        CorpCreatingDraftModalView corpCreatingDraftModalView2222222 = this.this$0;
        SharedPaymentsOpenReason sharedPaymentsOpenReason3222222 = this.$openReason;
        String str16222222 = this.$email;
        if (!(obj3 instanceof Result.Failure)) {
            binding3 = corpCreatingDraftModalView2222222.getBinding();
            binding3.h.setEnabled(true);
            binding4 = corpCreatingDraftModalView2222222.getBinding();
            binding4.i.setShimmering(false);
            ej6Var = corpCreatingDraftModalView2222222.branchedAnalytics;
            o61 o61Var2 = ej6Var.a;
            String analyticsName2 = sharedPaymentsOpenReason3222222.getAnalyticsName();
            o61Var2.getClass();
            HashMap hashMap2 = new HashMap();
            if (analyticsName2 != null) {
                hashMap2.put("open_reason", analyticsName2);
            }
            o61Var2.a.a("CreateCorpScreen.SuccessCreateCorpTrial", hashMap2, 1, new HashMap());
            d4fVar = corpCreatingDraftModalView2222222.pageInfo;
            bc bcVar = d4fVar.a;
            y yVar = (y) bcVar.b;
            Runnable runnable = (Runnable) bcVar.w;
            aue aueVar4 = (aue) bcVar.c;
            CorpAccountFlowExperiment corpAccountFlowExperiment2 = aueVar4.a;
            CorpAccountFlowExperiment.SuccessRegistrationScreen successRegistrationScreen = corpAccountFlowExperiment2.e;
            CorpAccountFlowExperiment.SuccessRegistrationScreen.Companion.getClass();
            boolean z = successRegistrationScreen != CorpAccountFlowExperiment.SuccessRegistrationScreen.e;
            xve xveVar = new xve(z, d6z.Y(corpAccountFlowExperiment2, successRegistrationScreen.a), d6z.Y(corpAccountFlowExperiment2, successRegistrationScreen.c), d6z.Y(corpAccountFlowExperiment2, successRegistrationScreen.d), aueVar4.a.e.b);
            if (z) {
                yVar.c.a().d(new i3v0(new vbb(runnable, (y) ((zue) bcVar.a).b.b.get()), str16222222, xveVar));
            } else {
                runnable.run();
                yVar.c();
            }
        }
        return zy11.a;
    }
}
