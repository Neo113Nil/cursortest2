package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.data.SubscriptionInfoEntity;
import com.ybsdk.feature.qr.payments.api.data.TryToRefreshEntity;
import com.ybsdk.feature.qr.payments.internal.network.common.AgreementDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.GetPaymentInfoDtoV3;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.ProcessingInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.QrPaymentInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.QrSbpPaymentInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.QrcSystemType;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.RefreshPageInformationDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.SberPaymentInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.SubscriptionInfoDto;
import defpackage.bob1;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.m4m0;
import defpackage.m8g0;
import defpackage.mvg;
import defpackage.n8g0;
import defpackage.ns;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.s1a0;
import defpackage.t1a0;
import defpackage.tcc;
import defpackage.u1a0;
import defpackage.unr0;
import defpackage.vpa1;
import defpackage.w511;
import defpackage.wls;
import defpackage.x1a0;
import defpackage.y1a0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoDtoV3;", "dto", "Lkotlin/Result;", "Lw1a0;", "<anonymous>", "(Lcom/ybsdk/feature/qr/payments/internal/network/dto/info/GetPaymentInfoDtoV3;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.data.QrPaymentsInfoRepository$toEntity$4", f = "QrPaymentsInfoRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsInfoRepository$toEntity$4 extends SuspendLambda implements wls {
    final /* synthetic */ String $qrcLink;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsInfoRepository$toEntity$4(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$qrcLink = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentsInfoRepository$toEntity$4 qrPaymentsInfoRepository$toEntity$4 = new QrPaymentsInfoRepository$toEntity$4(this.this$0, this.$qrcLink, continuation);
        qrPaymentsInfoRepository$toEntity$4.L$0 = obj;
        return qrPaymentsInfoRepository$toEntity$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsInfoRepository$toEntity$4) create((GetPaymentInfoDtoV3) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [y1a0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QrPaymentInfoDto paymentInfo;
        Object u1a0Var;
        List list;
        Money money;
        String description;
        String title;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        x1a0 x1a0Var = null;
        r1 = null;
        Text.Constant constant = null;
        x1a0Var = null;
        r1 = null;
        MoneyEntity moneyEntity = null;
        x1a0Var = null;
        x1a0Var = null;
        x1a0Var = null;
        x1a0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        GetPaymentInfoDtoV3 getPaymentInfoDtoV3 = (GetPaymentInfoDtoV3) this.L$0;
        int i = n8g0.a[getPaymentInfoDtoV3.getStatus().ordinal()];
        if (i == 1) {
            a aVar = this.this$0;
            String str = this.$qrcLink;
            aVar.getClass();
            int i2 = m8g0.a[getPaymentInfoDtoV3.getQrcType().ordinal()];
            if (i2 == 1) {
                SberPaymentInfoDto sberPaymentInfo = getPaymentInfoDtoV3.getSberPaymentInfo();
                if (sberPaymentInfo != null && (paymentInfo = sberPaymentInfo.getPaymentInfo()) != null) {
                    x1a0Var = aVar.c(paymentInfo, str, getPaymentInfoDtoV3.getQrcType());
                }
            } else if (i2 == 2) {
                QrSbpPaymentInfoDto sbpPaymentInfo = getPaymentInfoDtoV3.getSbpPaymentInfo();
                if (sbpPaymentInfo != null) {
                    QrcSystemType qrcType = getPaymentInfoDtoV3.getQrcType();
                    int i3 = m8g0.b[sbpPaymentInfo.getQrcType().ordinal()];
                    if (i3 == 1) {
                        QrPaymentInfoDto payment = sbpPaymentInfo.getPayment();
                        if (payment != null) {
                            x1a0Var = aVar.c(payment, str, qrcType);
                        }
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        SubscriptionInfoDto subscriptionInfo = sbpPaymentInfo.getSubscriptionInfo();
                        if (subscriptionInfo != null) {
                            String title2 = subscriptionInfo.getTitle();
                            String description2 = subscriptionInfo.getDescription();
                            ThemedImageUrlEntity c = qxy0.c(subscriptionInfo.getThemedLogo(), subscriptionInfo.getLogo());
                            String agreementsSheetTitle = subscriptionInfo.getAgreementsSheetTitle();
                            Text.Constant i4 = agreementsSheetTitle != null ? g8e.i(Text.Companion, agreementsSheetTitle) : null;
                            List<AgreementDto> agreements = subscriptionInfo.getAgreements();
                            if (agreements != null) {
                                List<AgreementDto> list2 = agreements;
                                list = new ArrayList(tcc.n(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    list.add(vpa1.c((AgreementDto) it.next()));
                                }
                            } else {
                                list = 0;
                            }
                            if (list == 0) {
                                list = EmptyList.a;
                            }
                            SubscriptionInfoEntity subscriptionInfoEntity = new SubscriptionInfoEntity(title2, description2, c, i4, list);
                            QrPaymentInfoDto payment2 = sbpPaymentInfo.getPayment();
                            if (payment2 != null && (money = payment2.getMoney()) != null) {
                                moneyEntity = bob1.g(money, aVar.b);
                            }
                            x1a0Var = new y1a0(moneyEntity, subscriptionInfoEntity, str, sbpPaymentInfo.getRedirectLink());
                        }
                    }
                }
            } else if (i2 != 3) {
                w511.b();
                return null;
            }
            if (x1a0Var == null) {
                return new Result(new Result.Failure(new Exception("no payment info")));
            }
            u1a0Var = new u1a0(x1a0Var);
        } else if (i == 2) {
            ProcessingInfoDto processingInfo = getPaymentInfoDtoV3.getProcessingInfo();
            Text h = (processingInfo == null || (title = processingInfo.getTitle()) == null) ? unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_loading_payment_info) : g8e.i(Text.Companion, title);
            ProcessingInfoDto processingInfo2 = getPaymentInfoDtoV3.getProcessingInfo();
            if (processingInfo2 != null && (description = processingInfo2.getDescription()) != null) {
                constant = g8e.i(Text.Companion, description);
            }
            u1a0Var = new s1a0(constant, h);
        } else if (i == 3) {
            RefreshPageInformationDto refreshInfo = getPaymentInfoDtoV3.getRefreshInfo();
            u1a0Var = refreshInfo != null ? new t1a0(new TryToRefreshEntity(g8e.i(Text.Companion, refreshInfo.getMessage()), new Text.Constant(refreshInfo.getDescription()), qxy0.c(refreshInfo.getThemedImage(), null), new TryToRefreshEntity.Header.Default(m4m0.k(refreshInfo.getHeader())), ns.a(refreshInfo.getButton()))) : new Result.Failure(new Exception("no refresh info"));
        } else if (i == 4) {
            u1a0Var = new Result.Failure(new Exception("GetPaymentInfoDtoV3.Status.REDIRECT"));
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            u1a0Var = new Result.Failure(new Exception("GetPaymentInfoDtoV3.Status.UNKNOWN"));
        }
        return new Result(u1a0Var);
    }
}
