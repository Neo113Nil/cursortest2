package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferInitiatedPrerequisites;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.ButtonTransferType;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesHcsTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
import defpackage.af6;
import defpackage.ajq0;
import defpackage.ak1;
import defpackage.bf6;
import defpackage.bjq0;
import defpackage.bqg;
import defpackage.cjq0;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.djq0;
import defpackage.dqg;
import defpackage.dsg;
import defpackage.dzh0;
import defpackage.eh01;
import defpackage.ejq0;
import defpackage.em3;
import defpackage.fjq0;
import defpackage.gjq0;
import defpackage.hg6;
import defpackage.hjq0;
import defpackage.hwo0;
import defpackage.ijq0;
import defpackage.jjq0;
import defpackage.jl40;
import defpackage.jqp0;
import defpackage.kjq0;
import defpackage.ljq0;
import defpackage.mfq0;
import defpackage.mvg;
import defpackage.njq0;
import defpackage.noh;
import defpackage.ny61;
import defpackage.orp0;
import defpackage.pz40;
import defpackage.qj01;
import defpackage.qu01;
import defpackage.r501;
import defpackage.r6q0;
import defpackage.rl01;
import defpackage.sjq0;
import defpackage.ssa1;
import defpackage.tjq0;
import defpackage.tm01;
import defpackage.trp0;
import defpackage.tse;
import defpackage.ujq0;
import defpackage.uk01;
import defpackage.unq;
import defpackage.unr0;
import defpackage.vjq0;
import defpackage.vm01;
import defpackage.w511;
import defpackage.wjq0;
import defpackage.wk01;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xk01;
import defpackage.xk1;
import defpackage.xmq0;
import defpackage.yk01;
import defpackage.ymq0;
import defpackage.z94;
import defpackage.zk01;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainViewModel$requestData$2", f = "TransferMainViewModel.kt", l = {245, 247}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMainViewModel$requestData$2 extends SuspendLambda implements wls {
    final /* synthetic */ noh $phoneNumberDeferred;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMainViewModel$requestData$2(a aVar, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$phoneNumberDeferred = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferMainViewModel$requestData$2(this.this$0, this.$phoneNumberDeferred, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferMainViewModel$requestData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x025d  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [T] */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [phq0] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [jjq0] */
    /* JADX WARN: Type inference failed for: r3v44, types: [xk01] */
    /* JADX WARN: Type inference failed for: r3v45, types: [T] */
    /* JADX WARN: Type inference failed for: r3v70, types: [wk01] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        Object obj2;
        Ref$ObjectRef ref$ObjectRef2;
        Object k;
        TransferMainScreenArguments transferMainScreenArguments;
        Throwable a;
        orp0 orp0Var;
        int i;
        boolean z;
        ?? uk01Var;
        TransferScenario scenario;
        TransferScenario transferScenario;
        pz40 Y;
        r0 r0Var;
        Object value;
        wk01 b;
        String str;
        eh01 eh01Var;
        eh01 eh01Var2;
        SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
        EmptyList emptyList;
        Object obj3;
        eh01 eh01Var3;
        eh01 eh01Var4;
        eh01 eh01Var5;
        eh01 eh01Var6;
        wjq0 wjq0Var;
        String str2;
        String str3;
        TransferScenario scenario2;
        TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario;
        wjq0 wjq0Var2;
        boolean z2;
        ActionButtonEntity actionButtonEntity;
        TransferScenario transferScenario2;
        ActionButtonEntity actionButtonEntity2;
        String str4;
        Object wk01Var;
        int i2;
        bjq0 bjq0Var;
        String str5;
        eh01 eh01Var7;
        eh01 eh01Var8;
        String X;
        orp0 orp0Var2 = orp0.e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            b.b(obj);
            a aVar = this.this$0;
            qj01 qj01Var = aVar.V;
            TransferMainScreenArguments transferMainScreenArguments2 = aVar.O;
            AppAnalyticsReporter appAnalyticsReporter = qj01Var.a;
            qj01Var.k = System.currentTimeMillis();
            TransferPrerequisites prerequisites = transferMainScreenArguments2.getPrerequisites();
            if (prerequisites instanceof TransferPrerequisites.Phone) {
                em3 em3Var = appAnalyticsReporter.q0;
                String agreementId = transferMainScreenArguments2.getAgreementId();
                em3.z(em3Var, agreementId != null ? ssa1.b(agreementId) : null, null, true, ssa1.b(((TransferPrerequisites.Phone) prerequisites).getPartnerId()), qj01Var.b, qj01Var.c, qj01Var.d, TransferEvents$TransferInitiatedPrerequisites.PHONE_TRANSFER, 128);
            } else if (prerequisites instanceof TransferPrerequisites.Self) {
                em3 em3Var2 = appAnalyticsReporter.q0;
                String agreementId2 = transferMainScreenArguments2.getAgreementId();
                em3.z(em3Var2, agreementId2 != null ? ssa1.b(agreementId2) : null, ssa1.b(((TransferPrerequisites.Self) prerequisites).getAgreementId()), false, null, qj01Var.b, qj01Var.c, qj01Var.d, TransferEvents$TransferInitiatedPrerequisites.SELF_TRANSFER, 128);
            } else if (prerequisites instanceof TransferPrerequisites.Requisites) {
                em3 em3Var3 = appAnalyticsReporter.q0;
                String agreementId3 = transferMainScreenArguments2.getAgreementId();
                em3.z(em3Var3, agreementId3 != null ? ssa1.b(agreementId3) : null, null, false, null, qj01Var.b, qj01Var.c, qj01Var.d, TransferEvents$TransferInitiatedPrerequisites.REQUISITES_LEGAL, 128);
            } else if (prerequisites instanceof TransferPrerequisites.MobilePayment) {
                appAnalyticsReporter.L.a.a("payment.mobile_services.payment_initiated", null);
            } else if (prerequisites instanceof TransferPrerequisites.InternetPayment) {
                appAnalyticsReporter.E.a.a("payment.internet_tv.payment_initiated", null);
            } else if (prerequisites instanceof TransferPrerequisites.CommonTopup) {
                em3 em3Var4 = appAnalyticsReporter.q0;
                String agreementId4 = transferMainScreenArguments2.getAgreementId();
                em3.z(em3Var4, null, agreementId4 != null ? ssa1.b(agreementId4) : null, false, null, qj01Var.b, qj01Var.c, qj01Var.d, TransferEvents$TransferInitiatedPrerequisites.SELF_TOPUP, 128);
            } else if (prerequisites instanceof TransferPrerequisites.Hcs) {
                em3 em3Var5 = appAnalyticsReporter.q0;
                String agreementId5 = transferMainScreenArguments2.getAgreementId();
                em3.z(em3Var5, agreementId5 != null ? ssa1.b(agreementId5) : null, null, false, null, qj01Var.b, qj01Var.c, qj01Var.d, TransferEvents$TransferInitiatedPrerequisites.REQUISITES_HCS, 128);
            } else if (prerequisites instanceof TransferPrerequisites.C2g) {
                appAnalyticsReporter.B.a.a("payment.gov.payment_screen.initiated", null);
            } else if (prerequisites == null) {
                em3 em3Var6 = appAnalyticsReporter.q0;
                String agreementId6 = transferMainScreenArguments2.getAgreementId();
                em3.z(em3Var6, agreementId6 != null ? ssa1.b(agreementId6) : null, null, false, null, qj01Var.b, qj01Var.c, qj01Var.d, null, 384);
            } else if (!(prerequisites instanceof TransferPrerequisites.InvoiceHcs)) {
                if (prerequisites instanceof TransferPrerequisites.CrossBorder) {
                    em3 em3Var7 = appAnalyticsReporter.q0;
                    String agreementId7 = transferMainScreenArguments2.getAgreementId();
                    em3.z(em3Var7, agreementId7 != null ? ssa1.b(agreementId7) : null, null, true, ssa1.b(((TransferPrerequisites.CrossBorder) prerequisites).getPartnerId()), qj01Var.b, qj01Var.c, qj01Var.d, TransferEvents$TransferInitiatedPrerequisites.CROSS_BORDER, 128);
                } else {
                    if (!(prerequisites instanceof TransferPrerequisites.Template)) {
                        w511.b();
                        return null;
                    }
                    hwo0 hwo0Var = qj01Var.f;
                    if (hwo0Var != null) {
                        z94 z94Var = ((AppAnalyticsReporter) hwo0Var.c).n0;
                        TemplatePaymentTypeTransfers templatePaymentTypeTransfers = (TemplatePaymentTypeTransfers) hwo0Var.w;
                        String str6 = (String) hwo0Var.x;
                        if (str6 == null) {
                            str6 = "";
                        }
                        String str7 = (String) hwo0Var.b;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                        linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
                        linkedHashMap.put("item_type", str6);
                        linkedHashMap.put("scenario_hash", str7);
                        z94Var.a.a("template_transfer.initiated", linkedHashMap);
                    }
                }
            }
            Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            a aVar2 = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.domain.b bVar = aVar2.W;
            TransferMainScreenArguments transferMainScreenArguments3 = aVar2.O;
            this.L$0 = ref$ObjectRef3;
            this.L$1 = ref$ObjectRef3;
            this.label = 1;
            Object l = bVar.l(transferMainScreenArguments3, aVar2, this);
            if (l != coroutineSingletons) {
                ref$ObjectRef = ref$ObjectRef3;
                obj2 = l;
                ref$ObjectRef2 = ref$ObjectRef;
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            transferMainScreenArguments = (TransferMainScreenArguments) this.L$3;
            obj2 = this.L$2;
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            b.b(obj);
            k = obj;
            String str8 = (String) k;
            Set a2 = ((xk01) this.this$0.X()).a();
            a = Result.a(obj2);
            if (a != null) {
                Object obj4 = (dqg) obj2;
                if (obj4 instanceof cqg) {
                    tm01 tm01Var = (tm01) ((cqg) obj4).a;
                    String str9 = tm01Var.d;
                    List list = tm01Var.a;
                    MoneyEntity moneyEntity = tm01Var.b;
                    ak1 ak1Var = (ak1) kotlin.collections.a.R(list);
                    EmptyList emptyList2 = EmptyList.a;
                    if (ak1Var != null) {
                        emptyList = emptyList2;
                        List list2 = ak1Var.f;
                        xk1 xk1Var = ak1Var.h;
                        TransferScenario scenario3 = transferMainScreenArguments.getScenario();
                        switch (scenario3 == null ? -1 : yk01.b[scenario3.ordinal()]) {
                            case -1:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                orp0Var = orp0Var2;
                                eh01Var3 = null;
                                if (eh01Var3 == null) {
                                    Iterator it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            eh01Var7 = it.next();
                                            if (jl40.l(((eh01) eh01Var7).a, xk1Var != null ? xk1Var.a.a : null)) {
                                            }
                                        } else {
                                            eh01Var7 = 0;
                                        }
                                    }
                                    eh01Var3 = eh01Var7;
                                }
                                eh01 eh01Var9 = eh01Var3;
                                TransferScenario scenario4 = transferMainScreenArguments.getScenario();
                                TransferDirection direction = transferMainScreenArguments.getDirection();
                                if (moneyEntity != null || (r4 = moneyEntity.getCurrency()) == null) {
                                    String iso = NumberFormatUtils$Currencies.RUB.getIso();
                                }
                                if (moneyEntity != null || (r5 = moneyEntity.getAmount()) == null) {
                                    BigDecimal bigDecimal = BigDecimal.ZERO;
                                }
                                BigDecimal bigDecimal2 = bigDecimal;
                                wjq0Var = xk1Var != null ? xk1Var.b : null;
                                if (!(wjq0Var instanceof tjq0)) {
                                    if (!(wjq0Var instanceof hjq0)) {
                                        if (!(wjq0Var instanceof kjq0) && !(wjq0Var instanceof ajq0) && !(wjq0Var instanceof djq0) && !(wjq0Var instanceof cjq0) && !(wjq0Var instanceof ijq0) && !(wjq0Var instanceof jjq0) && !(wjq0Var instanceof ljq0) && !(wjq0Var instanceof njq0) && !(wjq0Var instanceof sjq0) && !(wjq0Var instanceof ujq0) && !(wjq0Var instanceof vjq0) && !(wjq0Var instanceof gjq0) && wjq0Var != null) {
                                            w511.b();
                                            break;
                                        } else {
                                            str2 = null;
                                            wjq0 wjq0Var3 = xk1Var == null ? xk1Var.b : null;
                                            unq unqVar = ak1Var.n;
                                            String str10 = tm01Var.c;
                                            boolean z3 = list.size() <= 1;
                                            String title = transferMainScreenArguments.getTitle();
                                            String str11 = title != null ? str9 : title;
                                            scenario2 = transferMainScreenArguments.getScenario();
                                            switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                                case -1:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                    transferMainState$Success$OpenScenario = TransferMainState$Success$OpenScenario.NONE;
                                                    break;
                                                case 0:
                                                default:
                                                    w511.b();
                                                    break;
                                                case 1:
                                                    transferMainState$Success$OpenScenario = TransferMainState$Success$OpenScenario.REQUISITES;
                                                    break;
                                                case 2:
                                                    transferMainState$Success$OpenScenario = TransferMainState$Success$OpenScenario.CROSS_BORDER;
                                                    break;
                                                case 3:
                                                    transferMainState$Success$OpenScenario = TransferMainState$Success$OpenScenario.SELF;
                                                    break;
                                                case 4:
                                                    if (!(transferMainScreenArguments.getPrerequisites() instanceof TransferPrerequisites.Phone) && !(transferMainScreenArguments.getPrerequisites() instanceof TransferPrerequisites.Template)) {
                                                        transferMainState$Success$OpenScenario = TransferMainState$Success$OpenScenario.PHONE;
                                                        break;
                                                    } else {
                                                        transferMainState$Success$OpenScenario = TransferMainState$Success$OpenScenario.NONE;
                                                        break;
                                                    }
                                                case 9:
                                                    transferMainState$Success$OpenScenario = TransferMainState$Success$OpenScenario.PHONE;
                                                    break;
                                            }
                                            TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario2 = transferMainState$Success$OpenScenario;
                                            wjq0 wjq0Var4 = xk1Var == null ? xk1Var.b : null;
                                            cjq0 cjq0Var = !(wjq0Var4 instanceof cjq0) ? (cjq0) wjq0Var4 : null;
                                            String str12 = (cjq0Var != null || (bjq0Var = cjq0Var.e) == null || (str5 = bjq0Var.b) == null) ? str8 : str5;
                                            boolean z4 = tm01Var.f;
                                            wjq0Var2 = xk1Var == null ? xk1Var.b : null;
                                            if ((wjq0Var2 instanceof tjq0) && !(wjq0Var2 instanceof hjq0) && !(wjq0Var2 instanceof gjq0) && !(wjq0Var2 instanceof kjq0)) {
                                                if (!(wjq0Var2 instanceof ajq0) && !(wjq0Var2 instanceof djq0) && !(wjq0Var2 instanceof cjq0) && !(wjq0Var2 instanceof ijq0) && !(wjq0Var2 instanceof jjq0) && !(wjq0Var2 instanceof ljq0) && !(wjq0Var2 instanceof njq0) && !(wjq0Var2 instanceof sjq0) && !(wjq0Var2 instanceof ujq0) && !(wjq0Var2 instanceof vjq0) && wjq0Var2 != null) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    z2 = true;
                                                }
                                            } else {
                                                z2 = false;
                                            }
                                            vm01 vm01Var = tm01Var.g;
                                            actionButtonEntity = tm01Var.e;
                                            if (actionButtonEntity != null) {
                                                com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
                                                TransferScenario scenario5 = transferMainScreenArguments.getScenario();
                                                switch (scenario5 == null ? -1 : yk01.b[scenario5.ordinal()]) {
                                                    case -1:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 7:
                                                    case 9:
                                                    case 12:
                                                        int i4 = yk01.a[transferMainScreenArguments.getDirection().ordinal()];
                                                        transferScenario2 = scenario4;
                                                        if (i4 == 1) {
                                                            i2 = dzh0.ybsdk_transfer_button_confirm_transfer;
                                                            break;
                                                        } else if (i4 != 2) {
                                                            w511.b();
                                                            break;
                                                        } else {
                                                            i2 = dzh0.ybsdk_transfer_button_confirm_topup;
                                                            break;
                                                        }
                                                    case 0:
                                                    default:
                                                        w511.b();
                                                        break;
                                                    case 5:
                                                    case 6:
                                                    case 8:
                                                    case 10:
                                                    case 11:
                                                        i2 = dzh0.ybsdk_transfer_button_confirm_payment;
                                                        transferScenario2 = scenario4;
                                                        break;
                                                    case 13:
                                                        ny61.f("TODO CREDITPRODUCT-384");
                                                        break;
                                                }
                                                actionButtonEntity2 = new ActionButtonEntity(unr0.h(bVar2, i2), null, false, null, 12, null);
                                            } else {
                                                transferScenario2 = scenario4;
                                                actionButtonEntity2 = actionButtonEntity;
                                            }
                                            List list3 = tm01Var.h;
                                            if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                                String countryCode = transferMainScreenArguments.getCountryCode();
                                                str4 = countryCode != null ? countryCode.toUpperCase(Locale.ROOT) : "UZ";
                                            } else {
                                                str4 = null;
                                            }
                                            wjq0 wjq0Var5 = xk1Var == null ? xk1Var.b : null;
                                            cjq0 cjq0Var2 = !(wjq0Var5 instanceof cjq0) ? (cjq0) wjq0Var5 : null;
                                            z = false;
                                            i = 6;
                                            wk01Var = new wk01(transferScenario2, direction, iso, bigDecimal2, str2, null, ak1Var, null, wjq0Var3, unqVar, null, Boolean.FALSE, list, str10, z3, eh01Var9, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario2, str12, false, "", false, z4, z2, vm01Var, actionButtonEntity2, list3, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                            break;
                                        }
                                    } else {
                                        str3 = ((hjq0) wjq0Var).c;
                                    }
                                } else {
                                    str3 = ((tjq0) wjq0Var).c;
                                }
                                str2 = str3;
                                if (xk1Var == null) {
                                }
                                unq unqVar2 = ak1Var.n;
                                String str102 = tm01Var.c;
                                if (list.size() <= 1) {
                                }
                                String title2 = transferMainScreenArguments.getTitle();
                                if (title2 != null) {
                                }
                                scenario2 = transferMainScreenArguments.getScenario();
                                switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                }
                                TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario22 = transferMainState$Success$OpenScenario;
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var4 instanceof cjq0)) {
                                }
                                if (cjq0Var != null) {
                                }
                                boolean z42 = tm01Var.f;
                                if (xk1Var == null) {
                                }
                                if (wjq0Var2 instanceof tjq0) {
                                }
                                z2 = false;
                                vm01 vm01Var2 = tm01Var.g;
                                actionButtonEntity = tm01Var.e;
                                if (actionButtonEntity != null) {
                                }
                                List list32 = tm01Var.h;
                                if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                }
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var5 instanceof cjq0)) {
                                }
                                z = false;
                                i = 6;
                                wk01Var = new wk01(transferScenario2, direction, iso, bigDecimal2, str2, null, ak1Var, null, wjq0Var3, unqVar2, null, Boolean.FALSE, list, str102, z3, eh01Var9, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario22, str12, false, "", false, z42, z2, vm01Var2, actionButtonEntity2, list32, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                break;
                            case 0:
                            default:
                                w511.b();
                                break;
                            case 1:
                                orp0Var = orp0Var2;
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        if (jl40.l(((eh01) obj3).f, TransferDeeplink.RequisitesTransfer.INSTANCE)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                eh01Var3 = (eh01) obj3;
                                if (eh01Var3 == null) {
                                    x4c.g("Couldn't find button with action RequisitesTransfer for requisites scenario", null, null, Collections.singletonList(orp0Var), 6);
                                    eh01Var3 = null;
                                    if (eh01Var3 == null) {
                                    }
                                    eh01 eh01Var92 = eh01Var3;
                                    TransferScenario scenario42 = transferMainScreenArguments.getScenario();
                                    TransferDirection direction2 = transferMainScreenArguments.getDirection();
                                    if (moneyEntity != null) {
                                        break;
                                    }
                                    String iso2 = NumberFormatUtils$Currencies.RUB.getIso();
                                    if (moneyEntity != null) {
                                        break;
                                    }
                                    BigDecimal bigDecimal3 = BigDecimal.ZERO;
                                    BigDecimal bigDecimal22 = bigDecimal3;
                                    if (xk1Var != null) {
                                    }
                                    if (!(wjq0Var instanceof tjq0)) {
                                    }
                                    str2 = str3;
                                    if (xk1Var == null) {
                                    }
                                    unq unqVar22 = ak1Var.n;
                                    String str1022 = tm01Var.c;
                                    if (list.size() <= 1) {
                                    }
                                    String title22 = transferMainScreenArguments.getTitle();
                                    if (title22 != null) {
                                    }
                                    scenario2 = transferMainScreenArguments.getScenario();
                                    switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                    }
                                    TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario222 = transferMainState$Success$OpenScenario;
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var4 instanceof cjq0)) {
                                    }
                                    if (cjq0Var != null) {
                                    }
                                    boolean z422 = tm01Var.f;
                                    if (xk1Var == null) {
                                    }
                                    if (wjq0Var2 instanceof tjq0) {
                                    }
                                    z2 = false;
                                    vm01 vm01Var22 = tm01Var.g;
                                    actionButtonEntity = tm01Var.e;
                                    if (actionButtonEntity != null) {
                                    }
                                    List list322 = tm01Var.h;
                                    if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                    }
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var5 instanceof cjq0)) {
                                    }
                                    z = false;
                                    i = 6;
                                    wk01Var = new wk01(transferScenario2, direction2, iso2, bigDecimal22, str2, null, ak1Var, null, wjq0Var3, unqVar22, null, Boolean.FALSE, list, str1022, z3, eh01Var92, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario222, str12, false, "", false, z422, z2, vm01Var22, actionButtonEntity2, list322, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                    break;
                                }
                                if (eh01Var3 == null) {
                                }
                                eh01 eh01Var922 = eh01Var3;
                                TransferScenario scenario422 = transferMainScreenArguments.getScenario();
                                TransferDirection direction22 = transferMainScreenArguments.getDirection();
                                if (moneyEntity != null) {
                                }
                                String iso22 = NumberFormatUtils$Currencies.RUB.getIso();
                                if (moneyEntity != null) {
                                }
                                BigDecimal bigDecimal32 = BigDecimal.ZERO;
                                BigDecimal bigDecimal222 = bigDecimal32;
                                if (xk1Var != null) {
                                }
                                if (!(wjq0Var instanceof tjq0)) {
                                }
                                str2 = str3;
                                if (xk1Var == null) {
                                }
                                unq unqVar222 = ak1Var.n;
                                String str10222 = tm01Var.c;
                                if (list.size() <= 1) {
                                }
                                String title222 = transferMainScreenArguments.getTitle();
                                if (title222 != null) {
                                }
                                scenario2 = transferMainScreenArguments.getScenario();
                                switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                }
                                TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario2222 = transferMainState$Success$OpenScenario;
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var4 instanceof cjq0)) {
                                }
                                if (cjq0Var != null) {
                                }
                                boolean z4222 = tm01Var.f;
                                if (xk1Var == null) {
                                }
                                if (wjq0Var2 instanceof tjq0) {
                                }
                                z2 = false;
                                vm01 vm01Var222 = tm01Var.g;
                                actionButtonEntity = tm01Var.e;
                                if (actionButtonEntity != null) {
                                }
                                List list3222 = tm01Var.h;
                                if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                }
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var5 instanceof cjq0)) {
                                }
                                z = false;
                                i = 6;
                                wk01Var = new wk01(transferScenario2, direction22, iso22, bigDecimal222, str2, null, ak1Var, null, wjq0Var3, unqVar222, null, Boolean.FALSE, list, str10222, z3, eh01Var922, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario2222, str12, false, "", false, z4222, z2, vm01Var222, actionButtonEntity2, list3222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                break;
                            case 2:
                                orp0Var = orp0Var2;
                                Iterator it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        eh01Var4 = it3.next();
                                        if (jl40.l(((eh01) eh01Var4).f, TransferDeeplink.CrossBorderTransfer.INSTANCE)) {
                                        }
                                    } else {
                                        eh01Var4 = 0;
                                    }
                                }
                                eh01Var3 = eh01Var4;
                                if (eh01Var3 == null) {
                                    x4c.g("Couldn't find button with action CrossBorderTransfer for cross_border scenario", null, null, Collections.singletonList(orp0Var), 6);
                                    eh01Var3 = null;
                                    if (eh01Var3 == null) {
                                    }
                                    eh01 eh01Var9222 = eh01Var3;
                                    TransferScenario scenario4222 = transferMainScreenArguments.getScenario();
                                    TransferDirection direction222 = transferMainScreenArguments.getDirection();
                                    if (moneyEntity != null) {
                                    }
                                    String iso222 = NumberFormatUtils$Currencies.RUB.getIso();
                                    if (moneyEntity != null) {
                                    }
                                    BigDecimal bigDecimal322 = BigDecimal.ZERO;
                                    BigDecimal bigDecimal2222 = bigDecimal322;
                                    if (xk1Var != null) {
                                    }
                                    if (!(wjq0Var instanceof tjq0)) {
                                    }
                                    str2 = str3;
                                    if (xk1Var == null) {
                                    }
                                    unq unqVar2222 = ak1Var.n;
                                    String str102222 = tm01Var.c;
                                    if (list.size() <= 1) {
                                    }
                                    String title2222 = transferMainScreenArguments.getTitle();
                                    if (title2222 != null) {
                                    }
                                    scenario2 = transferMainScreenArguments.getScenario();
                                    switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                    }
                                    TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario22222 = transferMainState$Success$OpenScenario;
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var4 instanceof cjq0)) {
                                    }
                                    if (cjq0Var != null) {
                                    }
                                    boolean z42222 = tm01Var.f;
                                    if (xk1Var == null) {
                                    }
                                    if (wjq0Var2 instanceof tjq0) {
                                    }
                                    z2 = false;
                                    vm01 vm01Var2222 = tm01Var.g;
                                    actionButtonEntity = tm01Var.e;
                                    if (actionButtonEntity != null) {
                                    }
                                    List list32222 = tm01Var.h;
                                    if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                    }
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var5 instanceof cjq0)) {
                                    }
                                    z = false;
                                    i = 6;
                                    wk01Var = new wk01(transferScenario2, direction222, iso222, bigDecimal2222, str2, null, ak1Var, null, wjq0Var3, unqVar2222, null, Boolean.FALSE, list, str102222, z3, eh01Var9222, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario22222, str12, false, "", false, z42222, z2, vm01Var2222, actionButtonEntity2, list32222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                    break;
                                }
                                if (eh01Var3 == null) {
                                }
                                eh01 eh01Var92222 = eh01Var3;
                                TransferScenario scenario42222 = transferMainScreenArguments.getScenario();
                                TransferDirection direction2222 = transferMainScreenArguments.getDirection();
                                if (moneyEntity != null) {
                                }
                                String iso2222 = NumberFormatUtils$Currencies.RUB.getIso();
                                if (moneyEntity != null) {
                                }
                                BigDecimal bigDecimal3222 = BigDecimal.ZERO;
                                BigDecimal bigDecimal22222 = bigDecimal3222;
                                if (xk1Var != null) {
                                }
                                if (!(wjq0Var instanceof tjq0)) {
                                }
                                str2 = str3;
                                if (xk1Var == null) {
                                }
                                unq unqVar22222 = ak1Var.n;
                                String str1022222 = tm01Var.c;
                                if (list.size() <= 1) {
                                }
                                String title22222 = transferMainScreenArguments.getTitle();
                                if (title22222 != null) {
                                }
                                scenario2 = transferMainScreenArguments.getScenario();
                                switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                }
                                TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario222222 = transferMainState$Success$OpenScenario;
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var4 instanceof cjq0)) {
                                }
                                if (cjq0Var != null) {
                                }
                                boolean z422222 = tm01Var.f;
                                if (xk1Var == null) {
                                }
                                if (wjq0Var2 instanceof tjq0) {
                                }
                                z2 = false;
                                vm01 vm01Var22222 = tm01Var.g;
                                actionButtonEntity = tm01Var.e;
                                if (actionButtonEntity != null) {
                                }
                                List list322222 = tm01Var.h;
                                if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                }
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var5 instanceof cjq0)) {
                                }
                                z = false;
                                i = 6;
                                wk01Var = new wk01(transferScenario2, direction2222, iso2222, bigDecimal22222, str2, null, ak1Var, null, wjq0Var3, unqVar22222, null, Boolean.FALSE, list, str1022222, z3, eh01Var92222, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario222222, str12, false, "", false, z422222, z2, vm01Var22222, actionButtonEntity2, list322222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                break;
                            case 3:
                                orp0Var = orp0Var2;
                                Iterator it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        eh01Var5 = it4.next();
                                        if (((eh01) eh01Var5).f instanceof TransferDeeplink.Self) {
                                        }
                                    } else {
                                        eh01Var5 = 0;
                                    }
                                }
                                eh01Var3 = eh01Var5;
                                if (eh01Var3 == null) {
                                    x4c.g("Couldn't find button for self scenario", null, null, Collections.singletonList(orp0Var), 6);
                                    eh01Var3 = null;
                                    if (eh01Var3 == null) {
                                    }
                                    eh01 eh01Var922222 = eh01Var3;
                                    TransferScenario scenario422222 = transferMainScreenArguments.getScenario();
                                    TransferDirection direction22222 = transferMainScreenArguments.getDirection();
                                    if (moneyEntity != null) {
                                    }
                                    String iso22222 = NumberFormatUtils$Currencies.RUB.getIso();
                                    if (moneyEntity != null) {
                                    }
                                    BigDecimal bigDecimal32222 = BigDecimal.ZERO;
                                    BigDecimal bigDecimal222222 = bigDecimal32222;
                                    if (xk1Var != null) {
                                    }
                                    if (!(wjq0Var instanceof tjq0)) {
                                    }
                                    str2 = str3;
                                    if (xk1Var == null) {
                                    }
                                    unq unqVar222222 = ak1Var.n;
                                    String str10222222 = tm01Var.c;
                                    if (list.size() <= 1) {
                                    }
                                    String title222222 = transferMainScreenArguments.getTitle();
                                    if (title222222 != null) {
                                    }
                                    scenario2 = transferMainScreenArguments.getScenario();
                                    switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                    }
                                    TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario2222222 = transferMainState$Success$OpenScenario;
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var4 instanceof cjq0)) {
                                    }
                                    if (cjq0Var != null) {
                                    }
                                    boolean z4222222 = tm01Var.f;
                                    if (xk1Var == null) {
                                    }
                                    if (wjq0Var2 instanceof tjq0) {
                                    }
                                    z2 = false;
                                    vm01 vm01Var222222 = tm01Var.g;
                                    actionButtonEntity = tm01Var.e;
                                    if (actionButtonEntity != null) {
                                    }
                                    List list3222222 = tm01Var.h;
                                    if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                    }
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var5 instanceof cjq0)) {
                                    }
                                    z = false;
                                    i = 6;
                                    wk01Var = new wk01(transferScenario2, direction22222, iso22222, bigDecimal222222, str2, null, ak1Var, null, wjq0Var3, unqVar222222, null, Boolean.FALSE, list, str10222222, z3, eh01Var922222, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario2222222, str12, false, "", false, z4222222, z2, vm01Var222222, actionButtonEntity2, list3222222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                    break;
                                }
                                if (eh01Var3 == null) {
                                }
                                eh01 eh01Var9222222 = eh01Var3;
                                TransferScenario scenario4222222 = transferMainScreenArguments.getScenario();
                                TransferDirection direction222222 = transferMainScreenArguments.getDirection();
                                if (moneyEntity != null) {
                                }
                                String iso222222 = NumberFormatUtils$Currencies.RUB.getIso();
                                if (moneyEntity != null) {
                                }
                                BigDecimal bigDecimal322222 = BigDecimal.ZERO;
                                BigDecimal bigDecimal2222222 = bigDecimal322222;
                                if (xk1Var != null) {
                                }
                                if (!(wjq0Var instanceof tjq0)) {
                                }
                                str2 = str3;
                                if (xk1Var == null) {
                                }
                                unq unqVar2222222 = ak1Var.n;
                                String str102222222 = tm01Var.c;
                                if (list.size() <= 1) {
                                }
                                String title2222222 = transferMainScreenArguments.getTitle();
                                if (title2222222 != null) {
                                }
                                scenario2 = transferMainScreenArguments.getScenario();
                                switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                }
                                TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario22222222 = transferMainState$Success$OpenScenario;
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var4 instanceof cjq0)) {
                                }
                                if (cjq0Var != null) {
                                }
                                boolean z42222222 = tm01Var.f;
                                if (xk1Var == null) {
                                }
                                if (wjq0Var2 instanceof tjq0) {
                                }
                                z2 = false;
                                vm01 vm01Var2222222 = tm01Var.g;
                                actionButtonEntity = tm01Var.e;
                                if (actionButtonEntity != null) {
                                }
                                List list32222222 = tm01Var.h;
                                if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                }
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var5 instanceof cjq0)) {
                                }
                                z = false;
                                i = 6;
                                wk01Var = new wk01(transferScenario2, direction222222, iso222222, bigDecimal2222222, str2, null, ak1Var, null, wjq0Var3, unqVar2222222, null, Boolean.FALSE, list, str102222222, z3, eh01Var9222222, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario22222222, str12, false, "", false, z42222222, z2, vm01Var2222222, actionButtonEntity2, list32222222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                break;
                            case 4:
                                orp0Var = orp0Var2;
                                Iterator it5 = list2.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        eh01Var6 = it5.next();
                                        if (jl40.l(((eh01) eh01Var6).f, TransferDeeplink.PhoneTransfer.INSTANCE)) {
                                        }
                                    } else {
                                        eh01Var6 = 0;
                                    }
                                }
                                eh01Var3 = eh01Var6;
                                if (eh01Var3 == null) {
                                    x4c.g("Couldn't find button with action PhoneTransfer for phone scenario", null, null, Collections.singletonList(orp0Var), 6);
                                    eh01Var3 = null;
                                    if (eh01Var3 == null) {
                                    }
                                    eh01 eh01Var92222222 = eh01Var3;
                                    TransferScenario scenario42222222 = transferMainScreenArguments.getScenario();
                                    TransferDirection direction2222222 = transferMainScreenArguments.getDirection();
                                    if (moneyEntity != null) {
                                    }
                                    String iso2222222 = NumberFormatUtils$Currencies.RUB.getIso();
                                    if (moneyEntity != null) {
                                    }
                                    BigDecimal bigDecimal3222222 = BigDecimal.ZERO;
                                    BigDecimal bigDecimal22222222 = bigDecimal3222222;
                                    if (xk1Var != null) {
                                    }
                                    if (!(wjq0Var instanceof tjq0)) {
                                    }
                                    str2 = str3;
                                    if (xk1Var == null) {
                                    }
                                    unq unqVar22222222 = ak1Var.n;
                                    String str1022222222 = tm01Var.c;
                                    if (list.size() <= 1) {
                                    }
                                    String title22222222 = transferMainScreenArguments.getTitle();
                                    if (title22222222 != null) {
                                    }
                                    scenario2 = transferMainScreenArguments.getScenario();
                                    switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                    }
                                    TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario222222222 = transferMainState$Success$OpenScenario;
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var4 instanceof cjq0)) {
                                    }
                                    if (cjq0Var != null) {
                                    }
                                    boolean z422222222 = tm01Var.f;
                                    if (xk1Var == null) {
                                    }
                                    if (wjq0Var2 instanceof tjq0) {
                                    }
                                    z2 = false;
                                    vm01 vm01Var22222222 = tm01Var.g;
                                    actionButtonEntity = tm01Var.e;
                                    if (actionButtonEntity != null) {
                                    }
                                    List list322222222 = tm01Var.h;
                                    if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                    }
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var5 instanceof cjq0)) {
                                    }
                                    z = false;
                                    i = 6;
                                    wk01Var = new wk01(transferScenario2, direction2222222, iso2222222, bigDecimal22222222, str2, null, ak1Var, null, wjq0Var3, unqVar22222222, null, Boolean.FALSE, list, str1022222222, z3, eh01Var92222222, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario222222222, str12, false, "", false, z422222222, z2, vm01Var22222222, actionButtonEntity2, list322222222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                    break;
                                }
                                if (eh01Var3 == null) {
                                }
                                eh01 eh01Var922222222 = eh01Var3;
                                TransferScenario scenario422222222 = transferMainScreenArguments.getScenario();
                                TransferDirection direction22222222 = transferMainScreenArguments.getDirection();
                                if (moneyEntity != null) {
                                }
                                String iso22222222 = NumberFormatUtils$Currencies.RUB.getIso();
                                if (moneyEntity != null) {
                                }
                                BigDecimal bigDecimal32222222 = BigDecimal.ZERO;
                                BigDecimal bigDecimal222222222 = bigDecimal32222222;
                                if (xk1Var != null) {
                                }
                                if (!(wjq0Var instanceof tjq0)) {
                                }
                                str2 = str3;
                                if (xk1Var == null) {
                                }
                                unq unqVar222222222 = ak1Var.n;
                                String str10222222222 = tm01Var.c;
                                if (list.size() <= 1) {
                                }
                                String title222222222 = transferMainScreenArguments.getTitle();
                                if (title222222222 != null) {
                                }
                                scenario2 = transferMainScreenArguments.getScenario();
                                switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                }
                                TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario2222222222 = transferMainState$Success$OpenScenario;
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var4 instanceof cjq0)) {
                                }
                                if (cjq0Var != null) {
                                }
                                boolean z4222222222 = tm01Var.f;
                                if (xk1Var == null) {
                                }
                                if (wjq0Var2 instanceof tjq0) {
                                }
                                z2 = false;
                                vm01 vm01Var222222222 = tm01Var.g;
                                actionButtonEntity = tm01Var.e;
                                if (actionButtonEntity != null) {
                                }
                                List list3222222222 = tm01Var.h;
                                if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                }
                                if (xk1Var == null) {
                                }
                                if (!(wjq0Var5 instanceof cjq0)) {
                                }
                                z = false;
                                i = 6;
                                wk01Var = new wk01(transferScenario2, direction22222222, iso22222222, bigDecimal222222222, str2, null, ak1Var, null, wjq0Var3, unqVar222222222, null, Boolean.FALSE, list, str10222222222, z3, eh01Var922222222, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario2222222222, str12, false, "", false, z4222222222, z2, vm01Var222222222, actionButtonEntity2, list3222222222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                break;
                            case 9:
                                Iterator it6 = list2.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        eh01Var8 = it6.next();
                                        if (jl40.l(((eh01) eh01Var8).f, TransferDeeplink.PhoneTransfer.INSTANCE)) {
                                        }
                                    } else {
                                        eh01Var8 = 0;
                                    }
                                }
                                eh01 eh01Var10 = eh01Var8;
                                if (eh01Var10 == null) {
                                    orp0Var = orp0Var2;
                                    x4c.g("Couldn't find PhoneTransfer button for tips scenario, which only supports transfer via SBP", null, null, Collections.singletonList(orp0Var2), 6);
                                    eh01Var3 = null;
                                    if (eh01Var3 == null) {
                                    }
                                    eh01 eh01Var9222222222 = eh01Var3;
                                    TransferScenario scenario4222222222 = transferMainScreenArguments.getScenario();
                                    TransferDirection direction222222222 = transferMainScreenArguments.getDirection();
                                    if (moneyEntity != null) {
                                    }
                                    String iso222222222 = NumberFormatUtils$Currencies.RUB.getIso();
                                    if (moneyEntity != null) {
                                    }
                                    BigDecimal bigDecimal322222222 = BigDecimal.ZERO;
                                    BigDecimal bigDecimal2222222222 = bigDecimal322222222;
                                    if (xk1Var != null) {
                                    }
                                    if (!(wjq0Var instanceof tjq0)) {
                                    }
                                    str2 = str3;
                                    if (xk1Var == null) {
                                    }
                                    unq unqVar2222222222 = ak1Var.n;
                                    String str102222222222 = tm01Var.c;
                                    if (list.size() <= 1) {
                                    }
                                    String title2222222222 = transferMainScreenArguments.getTitle();
                                    if (title2222222222 != null) {
                                    }
                                    scenario2 = transferMainScreenArguments.getScenario();
                                    switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                    }
                                    TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario22222222222 = transferMainState$Success$OpenScenario;
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var4 instanceof cjq0)) {
                                    }
                                    if (cjq0Var != null) {
                                    }
                                    boolean z42222222222 = tm01Var.f;
                                    if (xk1Var == null) {
                                    }
                                    if (wjq0Var2 instanceof tjq0) {
                                    }
                                    z2 = false;
                                    vm01 vm01Var2222222222 = tm01Var.g;
                                    actionButtonEntity = tm01Var.e;
                                    if (actionButtonEntity != null) {
                                    }
                                    List list32222222222 = tm01Var.h;
                                    if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                    }
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var5 instanceof cjq0)) {
                                    }
                                    z = false;
                                    i = 6;
                                    wk01Var = new wk01(transferScenario2, direction222222222, iso222222222, bigDecimal2222222222, str2, null, ak1Var, null, wjq0Var3, unqVar2222222222, null, Boolean.FALSE, list, str102222222222, z3, eh01Var9222222222, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario22222222222, str12, false, "", false, z42222222222, z2, vm01Var2222222222, actionButtonEntity2, list32222222222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                    break;
                                } else {
                                    orp0Var = orp0Var2;
                                    eh01Var3 = eh01Var10;
                                    if (eh01Var3 == null) {
                                    }
                                    eh01 eh01Var92222222222 = eh01Var3;
                                    TransferScenario scenario42222222222 = transferMainScreenArguments.getScenario();
                                    TransferDirection direction2222222222 = transferMainScreenArguments.getDirection();
                                    if (moneyEntity != null) {
                                    }
                                    String iso2222222222 = NumberFormatUtils$Currencies.RUB.getIso();
                                    if (moneyEntity != null) {
                                    }
                                    BigDecimal bigDecimal3222222222 = BigDecimal.ZERO;
                                    BigDecimal bigDecimal22222222222 = bigDecimal3222222222;
                                    if (xk1Var != null) {
                                    }
                                    if (!(wjq0Var instanceof tjq0)) {
                                    }
                                    str2 = str3;
                                    if (xk1Var == null) {
                                    }
                                    unq unqVar22222222222 = ak1Var.n;
                                    String str1022222222222 = tm01Var.c;
                                    if (list.size() <= 1) {
                                    }
                                    String title22222222222 = transferMainScreenArguments.getTitle();
                                    if (title22222222222 != null) {
                                    }
                                    scenario2 = transferMainScreenArguments.getScenario();
                                    switch (scenario2 != null ? -1 : yk01.b[scenario2.ordinal()]) {
                                    }
                                    TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario222222222222 = transferMainState$Success$OpenScenario;
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var4 instanceof cjq0)) {
                                    }
                                    if (cjq0Var != null) {
                                    }
                                    boolean z422222222222 = tm01Var.f;
                                    if (xk1Var == null) {
                                    }
                                    if (wjq0Var2 instanceof tjq0) {
                                    }
                                    z2 = false;
                                    vm01 vm01Var22222222222 = tm01Var.g;
                                    actionButtonEntity = tm01Var.e;
                                    if (actionButtonEntity != null) {
                                    }
                                    List list322222222222 = tm01Var.h;
                                    if (transferMainScreenArguments.getScenario() != TransferScenario.CROSS_BORDER) {
                                    }
                                    if (xk1Var == null) {
                                    }
                                    if (!(wjq0Var5 instanceof cjq0)) {
                                    }
                                    z = false;
                                    i = 6;
                                    wk01Var = new wk01(transferScenario2, direction2222222222, iso2222222222, bigDecimal22222222222, str2, null, ak1Var, null, wjq0Var3, unqVar22222222222, null, Boolean.FALSE, list, str1022222222222, z3, eh01Var92222222222, r501.c, str11, false, false, null, transferMainState$Success$OpenScenario222222222222, str12, false, "", false, z422222222222, z2, vm01Var22222222222, actionButtonEntity2, list322222222222, a2, null, cjq0Var2 == null ? cjq0Var2.g : null, null, str4);
                                }
                                break;
                        }
                        return null;
                    }
                    emptyList = emptyList2;
                    x4c.g("There is no agreements", null, new tm01(emptyList2, null, ssa1.b(tm01Var.c), str9 != null ? ssa1.b(str9) : null, tm01Var.e, tm01Var.f, tm01Var.g, tm01Var.h), Collections.singletonList(orp0Var2), 2);
                    wk01Var = new Result.Failure(new Exception("Get agreement error"));
                    orp0Var = orp0Var2;
                    i = 6;
                    z = false;
                    Throwable a3 = Result.a(wk01Var);
                    if (a3 == null) {
                        uk01Var = (wk01) wk01Var;
                    } else {
                        String b2 = ssa1.b(tm01Var.c);
                        String str13 = tm01Var.d;
                        tm01 tm01Var2 = new tm01(emptyList, null, b2, str13 != null ? ssa1.b(str13) : null, tm01Var.e, tm01Var.f, tm01Var.g, tm01Var.h);
                        List singletonList = Collections.singletonList(orp0Var);
                        boolean isEmpty = singletonList.isEmpty();
                        if (isEmpty) {
                            X = null;
                        } else {
                            if (isEmpty) {
                                w511.b();
                                return null;
                            }
                            X = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
                        }
                        trp0 trp0Var = trp0.a;
                        trp0.e(new jqp0(a3, "Can't map entity to state", tm01Var2, X));
                        uk01Var = new uk01(a2, a3);
                    }
                } else {
                    orp0Var = orp0Var2;
                    i = 6;
                    z = false;
                    if (!(obj4 instanceof bqg)) {
                        w511.b();
                        return null;
                    }
                    uk01Var = new uk01(a2, new FailDataException((ct11) obj4));
                }
            } else {
                orp0Var = orp0Var2;
                i = 6;
                z = false;
                uk01Var = new uk01(a2, a);
            }
            ref$ObjectRef2.element = uk01Var;
            a aVar3 = this.this$0;
            ?? r3 = (xk01) ref$ObjectRef.element;
            TransferMainScreenArguments transferMainScreenArguments4 = aVar3.O;
            scenario = transferMainScreenArguments4.getScenario();
            transferScenario = TransferScenario.CROSS_BORDER;
            if (scenario == transferScenario) {
                TransferPrerequisites prerequisites2 = transferMainScreenArguments4.getPrerequisites();
                TransferPrerequisites.CrossBorder crossBorder = prerequisites2 instanceof TransferPrerequisites.CrossBorder ? (TransferPrerequisites.CrossBorder) prerequisites2 : null;
                if (crossBorder != null) {
                    wk01 wk01Var2 = r3 instanceof wk01 ? (wk01) r3 : null;
                    if (wk01Var2 != null && ((eh01Var2 = wk01Var2.p) != null || (eh01Var2 = (eh01) kotlin.collections.a.R(wk01Var2.g.f)) != null)) {
                        eh01 eh01Var11 = eh01Var2;
                        String currencyRate = crossBorder.getCurrencyRate();
                        String fee = crossBorder.getFee();
                        String convertationTemplate = crossBorder.getConvertationTemplate();
                        BigDecimal c0 = a.c0(crossBorder.getDebitAmount(), fee, currencyRate, crossBorder.getCreditCurrency(), crossBorder.getDebitCurrency());
                        fjq0 fjq0Var = new fjq0(crossBorder.getPhone(), crossBorder.getPartnerId(), crossBorder.getReceiverFullName());
                        BigDecimal debitAmount = crossBorder.getDebitAmount();
                        String debitCurrency = crossBorder.getDebitCurrency();
                        if (c0 == null) {
                            c0 = crossBorder.getCreditAmount();
                        }
                        BigDecimal bigDecimal4 = c0;
                        String creditCurrency = crossBorder.getCreditCurrency();
                        int i5 = rl01.a[crossBorder.getPriorityMoneyType().ordinal()];
                        if (i5 == 1) {
                            selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT;
                        } else {
                            if (i5 != 2) {
                                w511.b();
                                return null;
                            }
                            selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType = SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.CREDIT;
                        }
                        r3 = wk01.b(wk01Var2, crossBorder.getDebitCurrency(), crossBorder.getDebitAmount(), null, null, null, null, new gjq0(eh01Var11, fjq0Var, debitAmount, debitCurrency, bigDecimal4, creditCurrency, selectedTransferSubject$CrossBorderByPhone$PriorityMoneyType, currencyRate != null ? new ejq0(currencyRate, "RUB") : null, convertationTemplate, (PhoneInputSource) null, fee, (ThemedImageUrlEntity) null, 5376), null, null, null, null, eh01Var11, null, false, false, null, TransferMainState$Success$OpenScenario.NONE, false, null, false, null, null, null, null, null, null, null, -2130189, 15);
                    }
                }
            }
            ref$ObjectRef.element = r3;
            Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, (xk01) ref$ObjectRef.element));
            a.b0(this.this$0, (xk01) ref$ObjectRef.element);
            a aVar4 = this.this$0;
            TransferMainScreenArguments transferMainScreenArguments5 = aVar4.O;
            b = zk01.b((xk01) aVar4.X());
            if (b != null) {
                int i6 = rl01.i[b.v.ordinal()];
                if (i6 == 1) {
                    str = null;
                    if (transferMainScreenArguments5.getPrerequisites() == null) {
                        a.b1(aVar4, b, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD);
                    }
                } else if (i6 == 2) {
                    wk01 b3 = zk01.b((xk01) aVar4.X());
                    if (b3 != null && (eh01Var = b3.p) != null) {
                        ButtonTransferType buttonTransferType = eh01Var.q;
                        TransferDeeplink transferDeeplink = eh01Var.f;
                        if (jl40.l(transferDeeplink, TransferDeeplink.Self.Transfer.INSTANCE)) {
                            ymq0 ymq0Var = eh01Var.j;
                            if (ymq0Var != null) {
                                str = null;
                                aVar4.W0(new vjq0(new mfq0(ymq0Var.a, null, ymq0Var.b, ymq0Var.c, ymq0Var.d, com.ybsdk.feature.transfer.version2.api.mappers.a.j(ymq0Var.e)), null, eh01Var));
                            } else {
                                str = null;
                                x4c.g("Null selfTransferPayload for SelfTransfer in self scenario", null, null, Collections.singletonList(orp0Var), i);
                            }
                        } else if (jl40.l(transferDeeplink, TransferDeeplink.Self.Topup.INSTANCE)) {
                            xmq0 xmq0Var = eh01Var.k;
                            if (xmq0Var != null) {
                                str = null;
                                aVar4.W0(new ujq0(new mfq0(xmq0Var.a, xmq0Var.f, xmq0Var.b, xmq0Var.c, xmq0Var.d, com.ybsdk.feature.transfer.version2.api.mappers.a.j(xmq0Var.e)), null, eh01Var));
                            } else {
                                str = null;
                                x4c.g("Null selfTransferPayload for SelfTopup in self scenario", null, null, Collections.singletonList(orp0Var), i);
                            }
                        } else {
                            str = null;
                            if (jl40.l(transferDeeplink, TransferDeeplink.Self.ItemsSheet.INSTANCE)) {
                                hg6 hg6Var = eh01Var.h;
                                aVar4.Z0(hg6Var != null ? new af6(hg6Var) : null, buttonTransferType);
                            } else if (jl40.l(transferDeeplink, TransferDeeplink.Self.SectionsSheet.INSTANCE)) {
                                r6q0 r6q0Var = eh01Var.i;
                                aVar4.Z0(r6q0Var != null ? new bf6(r6q0Var) : null, buttonTransferType);
                            }
                        }
                    }
                } else if (i6 == 3) {
                    eh01 eh01Var12 = b.p;
                    RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity = eh01Var12 != null ? eh01Var12.l : null;
                    RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity = eh01Var12 != null ? eh01Var12.m : null;
                    RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity = eh01Var12 != null ? eh01Var12.n : null;
                    wjq0 wjq0Var6 = b.i;
                    aVar4.c1(requisitesPersonTransferPayloadEntity, requisitesLegalTransferPayloadEntity, requisitesHcsTransferPayloadEntity, wjq0Var6 instanceof sjq0 ? (sjq0) wjq0Var6 : null);
                } else if (i6 != 4) {
                    if (i6 != 5) {
                        w511.b();
                        return null;
                    }
                    if (transferMainScreenArguments5.getShouldSelectMainAccountOnEnter()) {
                        aVar4.Y0();
                    }
                } else if (((qu01) aVar4.F).e() && transferMainScreenArguments5.getCountryCode() == null) {
                    aVar4.R0();
                } else {
                    a.b1(aVar4, b, null, transferScenario, null, null, 122);
                }
                a.d0(this.this$0, z, z, 3);
                a aVar5 = this.this$0;
                xk01 xk01Var = (xk01) ref$ObjectRef.element;
                aVar5.getClass();
                wk01 b4 = zk01.b(xk01Var);
                Object obj5 = b4 != null ? b4.i : str;
                ?? r1 = obj5 instanceof jjq0 ? (jjq0) obj5 : str;
                ?? r12 = r1 != 0 ? r1.c : str;
                aVar5.U0(r12 != 0 ? r12.g : str, r12 != 0 ? r12.a : str);
                return zy11.a;
            }
            str = null;
            a.d0(this.this$0, z, z, 3);
            a aVar52 = this.this$0;
            xk01 xk01Var2 = (xk01) ref$ObjectRef.element;
            aVar52.getClass();
            wk01 b42 = zk01.b(xk01Var2);
            if (b42 != null) {
            }
            if (obj5 instanceof jjq0) {
            }
            if (r1 != 0) {
            }
            aVar52.U0(r12 != 0 ? r12.g : str, r12 != 0 ? r12.a : str);
            return zy11.a;
        }
        Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.L$1;
        Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) this.L$0;
        b.b(obj);
        ref$ObjectRef2 = ref$ObjectRef4;
        obj2 = ((Result) obj).getValue();
        ref$ObjectRef = ref$ObjectRef5;
        TransferMainScreenArguments transferMainScreenArguments6 = this.this$0.O;
        noh nohVar = this.$phoneNumberDeferred;
        this.L$0 = ref$ObjectRef;
        this.L$1 = ref$ObjectRef2;
        this.L$2 = obj2;
        this.L$3 = transferMainScreenArguments6;
        this.label = 2;
        k = nohVar.k(this);
        if (k != coroutineSingletons) {
            transferMainScreenArguments = transferMainScreenArguments6;
            String str82 = (String) k;
            Set a22 = ((xk01) this.this$0.X()).a();
            a = Result.a(obj2);
            if (a != null) {
            }
            ref$ObjectRef2.element = uk01Var;
            a aVar32 = this.this$0;
            ?? r32 = (xk01) ref$ObjectRef.element;
            TransferMainScreenArguments transferMainScreenArguments42 = aVar32.O;
            scenario = transferMainScreenArguments42.getScenario();
            transferScenario = TransferScenario.CROSS_BORDER;
            if (scenario == transferScenario) {
            }
            ref$ObjectRef.element = r32;
            Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, (xk01) ref$ObjectRef.element));
            a.b0(this.this$0, (xk01) ref$ObjectRef.element);
            a aVar42 = this.this$0;
            TransferMainScreenArguments transferMainScreenArguments52 = aVar42.O;
            b = zk01.b((xk01) aVar42.X());
            if (b != null) {
            }
            str = null;
            a.d0(this.this$0, z, z, 3);
            a aVar522 = this.this$0;
            xk01 xk01Var22 = (xk01) ref$ObjectRef.element;
            aVar522.getClass();
            wk01 b422 = zk01.b(xk01Var22);
            if (b422 != null) {
            }
            if (obj5 instanceof jjq0) {
            }
            if (r1 != 0) {
            }
            aVar522.U0(r12 != 0 ? r12.g : str, r12 != 0 ? r12.a : str);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
