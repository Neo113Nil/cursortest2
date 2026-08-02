package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.common.PageImageHeaderDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.GetPaymentInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.RedirectInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.RefreshPageInfoDto;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.SuccessInfoDto;
import defpackage.f8g0;
import defpackage.g8e;
import defpackage.g8g0;
import defpackage.gpi0;
import defpackage.h8g0;
import defpackage.k8g0;
import defpackage.mvg;
import defpackage.nbg0;
import defpackage.ns;
import defpackage.ny61;
import defpackage.qxy0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x991;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoDto;", "dto", "Lkotlin/Result;", "Ll8g0;", "<anonymous>", "(Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/info/GetPaymentInfoDto;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.data.QrPaymentsV2Repository$toEntity$2", f = "QrPaymentsV2Repository.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Repository$toEntity$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Repository$toEntity$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentsV2Repository$toEntity$2 qrPaymentsV2Repository$toEntity$2 = new QrPaymentsV2Repository$toEntity$2(this.this$0, continuation);
        qrPaymentsV2Repository$toEntity$2.L$0 = obj;
        return qrPaymentsV2Repository$toEntity$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsV2Repository$toEntity$2) create((GetPaymentInfoDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ed, code lost:
    
        if (r11 != null) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            GetPaymentInfoDto getPaymentInfoDto = (GetPaymentInfoDto) this.L$0;
            int i2 = nbg0.a[getPaymentInfoDto.getStatus().ordinal()];
            if (i2 == 1) {
                SuccessInfoDto successInfo = getPaymentInfoDto.getSuccessInfo();
                if (successInfo != null) {
                    b bVar = this.this$0;
                    this.label = 1;
                    obj = b.b(bVar, successInfo, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                obj2 = new Result.Failure(new Exception("get_payment_info.successInfo is null"));
                return new Result(obj2);
            }
            if (i2 == 2) {
                obj2 = f8g0.a;
            } else if (i2 == 3) {
                RefreshPageInfoDto refreshInfo = getPaymentInfoDto.getRefreshInfo();
                if (refreshInfo != null) {
                    b bVar2 = this.this$0;
                    bVar2.getClass();
                    Text.Constant i3 = g8e.i(Text.Companion, refreshInfo.getTitle());
                    Text.Constant constant = new Text.Constant(refreshInfo.getDescription());
                    ThemedImageUrlEntity c = qxy0.c(refreshInfo.getImage(), null);
                    PageImageHeaderDto header = refreshInfo.getHeader();
                    ThemedImageUrlEntity c2 = qxy0.c(header.getTitleImage(), null);
                    Themes<String> cornerImage = header.getCornerImage();
                    obj2 = new h8g0(new gpi0(i3, constant, c, new PageImageHeaderEntity(c2, cornerImage != null ? qxy0.c(cornerImage, null) : null), ns.a(refreshInfo.getButton()), x991.a(bVar2.b.a)));
                } else {
                    obj2 = new Result.Failure(new Exception("get_payment_info.refreshInfo is null"));
                }
            } else if (i2 == 4) {
                RedirectInfoDto redirectInfo = getPaymentInfoDto.getRedirectInfo();
                if (redirectInfo != null) {
                    this.this$0.getClass();
                    obj2 = new g8g0(redirectInfo.getAction());
                } else {
                    obj2 = new Result.Failure(new Exception("get_payment_info.redirectInfo is null"));
                }
            } else {
                if (i2 != 5) {
                    w511.b();
                    return null;
                }
                obj2 = new Result.Failure(new Exception("get_payment_info.status is UNKNOWN"));
            }
            return new Result(obj2);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        obj2 = (k8g0) obj;
    }
}
