package com.ybsdk.screens.registration.data;

import android.net.Uri;
import com.ybsdk.common.entities.ApplicationStatusEntity$Status;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationGetApplicationStatusApplicationResult;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationGetApplicationStatusRequestResult;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.network.dto.RegistrationApplicationButtons;
import com.ybsdk.network.dto.RegistrationApplicationStatusResponseV2;
import defpackage.b13;
import defpackage.dri0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.lao;
import defpackage.mvg;
import defpackage.n13;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w511;
import defpackage.w691;
import defpackage.wls;
import defpackage.z94;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2;", "success", "Ls2e0;", "Lb13;", "<anonymous>", "(Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;)Ls2e0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.data.RegistrationRepository$startPolling$2", f = "RegistrationRepository.kt", l = {HProv.PP_CIPHEROID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RegistrationRepository$startPolling$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2;", "registrationResponseV2", "Lb13;", "<anonymous>", "(Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2;)Lb13;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.screens.registration.data.RegistrationRepository$startPolling$2$1", f = "RegistrationRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.screens.registration.data.RegistrationRepository$startPolling$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $applicationId;
        final /* synthetic */ DataWithStatusResponse<RegistrationApplicationStatusResponseV2> $success;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, DataWithStatusResponse dataWithStatusResponse, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$success = dataWithStatusResponse;
            this.$applicationId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$success, this.$applicationId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((RegistrationApplicationStatusResponseV2) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object b13Var;
            Uri parse;
            RegistrationEvents$RegistrationGetApplicationStatusRequestResult registrationEvents$RegistrationGetApplicationStatusRequestResult;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            RegistrationEvents$RegistrationGetApplicationStatusApplicationResult registrationEvents$RegistrationGetApplicationStatusApplicationResult = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            RegistrationApplicationStatusResponseV2 registrationApplicationStatusResponseV2 = (RegistrationApplicationStatusResponseV2) this.L$0;
            c cVar = this.this$0;
            cVar.getClass();
            Iterator<E> it = ApplicationStatusEntity$Status.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((ApplicationStatusEntity$Status) obj2).getNetworkStatus(), registrationApplicationStatusResponseV2.getStatus().getValue())) {
                    break;
                }
            }
            ApplicationStatusEntity$Status applicationStatusEntity$Status = (ApplicationStatusEntity$Status) obj2;
            if (applicationStatusEntity$Status == null) {
                b13Var = new Result.Failure(new IllegalStateException("Unexpected status " + registrationApplicationStatusResponseV2.getStatus()));
            } else {
                String action = registrationApplicationStatusResponseV2.getAction();
                Deeplink e = (action == null || (parse = Uri.parse(action)) == null) ? null : w691.e(cVar.c, parse, true, null, false, 12);
                Text f = d.f(registrationApplicationStatusResponseV2.getTitle());
                Text f2 = d.f(registrationApplicationStatusResponseV2.getDescription());
                Themes<String> image = registrationApplicationStatusResponseV2.getImage();
                List<RegistrationApplicationButtons> buttons = registrationApplicationStatusResponseV2.getButtons();
                ArrayList arrayList = new ArrayList(tcc.n(buttons, 10));
                for (RegistrationApplicationButtons registrationApplicationButtons : buttons) {
                    arrayList.add(new lao(g8e.i(Text.Companion, registrationApplicationButtons.getText()), registrationApplicationButtons.getAction(), registrationApplicationButtons.getTextColor(), registrationApplicationButtons.getBackgroundColor()));
                }
                b13Var = new b13(applicationStatusEntity$Status, f, f2, null, e, image, arrayList);
            }
            kotlin.b.b(b13Var);
            b13 b13Var2 = (b13) b13Var;
            c cVar2 = this.this$0;
            DataWithStatusResponse.Status status = this.$success.getStatus();
            String str = this.$applicationId;
            cVar2.getClass();
            int i = status == null ? -1 : dri0.a[status.ordinal()];
            if (i == -1) {
                registrationEvents$RegistrationGetApplicationStatusRequestResult = null;
            } else if (i == 1) {
                registrationEvents$RegistrationGetApplicationStatusRequestResult = RegistrationEvents$RegistrationGetApplicationStatusRequestResult.SUCCESS;
            } else if (i == 2) {
                registrationEvents$RegistrationGetApplicationStatusRequestResult = RegistrationEvents$RegistrationGetApplicationStatusRequestResult.FAIL;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                registrationEvents$RegistrationGetApplicationStatusRequestResult = RegistrationEvents$RegistrationGetApplicationStatusRequestResult.UNKNOWN;
            }
            int i2 = dri0.b[b13Var2.a.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    registrationEvents$RegistrationGetApplicationStatusApplicationResult = RegistrationEvents$RegistrationGetApplicationStatusApplicationResult.UNKNOWN;
                } else if (i2 == 2) {
                    registrationEvents$RegistrationGetApplicationStatusApplicationResult = RegistrationEvents$RegistrationGetApplicationStatusApplicationResult.PROCESSING;
                } else if (i2 == 3) {
                    registrationEvents$RegistrationGetApplicationStatusApplicationResult = RegistrationEvents$RegistrationGetApplicationStatusApplicationResult.FAILED;
                } else {
                    if (i2 != 4) {
                        w511.b();
                        return null;
                    }
                    registrationEvents$RegistrationGetApplicationStatusApplicationResult = RegistrationEvents$RegistrationGetApplicationStatusApplicationResult.SUCCESS;
                }
            }
            z94 z94Var = cVar2.d.b0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            if (registrationEvents$RegistrationGetApplicationStatusRequestResult != null) {
                linkedHashMap.put("request_result", registrationEvents$RegistrationGetApplicationStatusRequestResult.getOriginalValue());
            }
            if (registrationEvents$RegistrationGetApplicationStatusApplicationResult != null) {
                linkedHashMap.put("application_result", registrationEvents$RegistrationGetApplicationStatusApplicationResult.getOriginalValue());
            }
            if (str != null) {
                linkedHashMap.put("application_id", str);
            }
            z94Var.a.a("registration.get.application.status", linkedHashMap);
            return b13Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationRepository$startPolling$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RegistrationRepository$startPolling$2 registrationRepository$startPolling$2 = new RegistrationRepository$startPolling$2(this.this$0, this.$applicationId, continuation);
        registrationRepository$startPolling$2.L$0 = obj;
        return registrationRepository$startPolling$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RegistrationRepository$startPolling$2) create((DataWithStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dataWithStatusResponse, this.$applicationId, null);
            this.label = 1;
            a = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, anonymousClass1, this);
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
        Throwable a2 = Result.a(a);
        return a2 == null ? n13.a((b13) a) : new n2e0(a2);
    }
}
