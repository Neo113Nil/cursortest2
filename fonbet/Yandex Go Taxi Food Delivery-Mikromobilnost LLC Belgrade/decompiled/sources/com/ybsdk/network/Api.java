package com.ybsdk.network;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.card.api.dto.CardClaimingStatusRequest;
import com.ybsdk.feature.card.api.dto.CardClaimingStatusResponse;
import com.ybsdk.network.dto.AgreementListResponse;
import com.ybsdk.network.dto.ApplicationRequest;
import com.ybsdk.network.dto.ApplicationResponse;
import com.ybsdk.network.dto.ApplicationSendCodeRequest;
import com.ybsdk.network.dto.ApplicationSendCodeResponse;
import com.ybsdk.network.dto.ApplicationStatusRequest;
import com.ybsdk.network.dto.ApplicationStatusResponse;
import com.ybsdk.network.dto.ApplicationSubmitCodeRequest;
import com.ybsdk.network.dto.ApplicationSubmitCodeResponse;
import com.ybsdk.network.dto.BalanceRequest;
import com.ybsdk.network.dto.BalanceResponse;
import com.ybsdk.network.dto.CashbackStatusRequest;
import com.ybsdk.network.dto.CashbackStatusResponse;
import com.ybsdk.network.dto.CheckPaymentRequest;
import com.ybsdk.network.dto.CheckPaymentResponse;
import com.ybsdk.network.dto.GetMenuResponse;
import com.ybsdk.network.dto.GetUserInfoResponse;
import com.ybsdk.network.dto.InnResponse;
import com.ybsdk.network.dto.RegistrationApplicationStatusResponseV2;
import com.ybsdk.network.dto.RegistrationNextRequest;
import com.ybsdk.network.dto.RegistrationNextResponse;
import com.ybsdk.network.dto.RemoteConfigRequest;
import com.ybsdk.network.dto.RemoteConfigResponse;
import com.ybsdk.network.dto.StartSessionRequest;
import com.ybsdk.network.dto.StartSessionResponse;
import com.ybsdk.network.dto.SupportChatResponse;
import com.ybsdk.network.dto.WalletsInfoResponse;
import com.ybsdk.network.dto.card.CardDeliveryStatusRequest;
import com.ybsdk.network.dto.card.CardDeliveryStatusResponse;
import com.ybsdk.network.dto.changephone.ChangePhoneApplicationStatusRequest;
import com.ybsdk.network.dto.changephone.ChangePhoneApplicationStatusResponse;
import com.ybsdk.network.dto.changephone.ChangePhoneSendCodeRequest;
import com.ybsdk.network.dto.changephone.ChangePhoneSendCodeResponse;
import com.ybsdk.network.dto.changephone.ChangePhoneSubmitCodeResponse;
import com.ybsdk.network.dto.creditlimit.CreditLimitSetSettingsRequest;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdApplicationFormRequest;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdApplicationResponse;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdInnRequest;
import com.ybsdk.network.dto.skeletons.SkeletonsRequest;
import com.ybsdk.network.dto.skeletons.SkeletonsResponse;
import com.ybsdk.network.dto.topup.TopupNoticeContentDeprecatedRequest;
import com.ybsdk.network.dto.topup.TopupNoticeContentDeprecatedResponse;
import com.ybsdk.network.dto.topup.TopupNoticeContentRequest;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetResponse;
import defpackage.djg0;
import defpackage.iyd0;
import defpackage.q76;
import defpackage.s490;
import defpackage.uau;
import defpackage.v3f;
import defpackage.wqs;
import defpackage.z8u;
import defpackage.zy11;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000î\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH§@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\bH§@¢\u0006\u0004\b\u0018\u0010\u0011J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001d0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001e\u0010\u001cJ \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"J&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001d0\b2\b\b\u0001\u0010\u0003\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001d0\b2\b\b\u0001\u0010\u0003\u001a\u00020'H§@¢\u0006\u0004\b)\u0010*J,\u00100\u001a\b\u0012\u0004\u0012\u00020/0\b2\b\b\u0001\u0010,\u001a\u00020+2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-H§@¢\u0006\u0004\b0\u00101J,\u00103\u001a\b\u0012\u0004\u0012\u00020/0\b2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-2\b\b\u0001\u0010,\u001a\u000202H§@¢\u0006\u0004\b3\u00104J6\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u001d0\u00140\b2\b\b\u0001\u0010,\u001a\u0002052\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b7\u00108J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u0002090\bH§@¢\u0006\u0004\b:\u0010\u0011J0\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00140\b2\b\b\u0001\u0010,\u001a\u0002052\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b<\u00108J,\u0010=\u001a\b\u0012\u0004\u0012\u00020/0\b2\b\b\u0001\u0010,\u001a\u0002022\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-H§@¢\u0006\u0004\b=\u0010>J0\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00140\b2\b\b\u0001\u0010,\u001a\u0002052\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b?\u00108J \u0010@\u001a\b\u0012\u0004\u0012\u00020;0\b2\b\b\u0001\u0010,\u001a\u000205H§@¢\u0006\u0004\b@\u0010AJ*\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\b2\b\b\u0001\u0010,\u001a\u00020B2\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\bD\u0010EJ \u0010F\u001a\b\u0012\u0004\u0012\u00020C0\b2\b\b\u0001\u0010,\u001a\u00020BH§@¢\u0006\u0004\bF\u0010GJ \u0010J\u001a\b\u0012\u0004\u0012\u00020I0\b2\b\b\u0001\u0010,\u001a\u00020HH§@¢\u0006\u0004\bJ\u0010KJ \u0010N\u001a\b\u0012\u0004\u0012\u00020M0\b2\b\b\u0001\u0010,\u001a\u00020LH§@¢\u0006\u0004\bN\u0010OJ*\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\b2\b\b\u0001\u0010,\u001a\u00020P2\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\bR\u0010SJ\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\bH§@¢\u0006\u0004\bU\u0010\u0011J&\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u001d0\b2\b\b\u0001\u0010,\u001a\u00020VH§@¢\u0006\u0004\bX\u0010YJL\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\b2\b\b\u0001\u0010Z\u001a\u00020-2\b\b\u0001\u0010,\u001a\u00020[2\n\b\u0001\u0010\\\u001a\u0004\u0018\u00010-2\u0014\b\u0001\u0010^\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0]H§@¢\u0006\u0004\b`\u0010aJX\u0010b\u001a\b\u0012\u0004\u0012\u00020_0\b2\b\b\u0001\u0010Z\u001a\u00020-2\b\b\u0001\u0010,\u001a\u00020[2\n\b\u0001\u0010\\\u001a\u0004\u0018\u00010-2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-2\u0014\b\u0001\u0010^\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0]H§@¢\u0006\u0004\bb\u0010cJ*\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\b2\b\b\u0001\u0010d\u001a\u00020-2\b\b\u0001\u0010e\u001a\u00020-H§@¢\u0006\u0004\bg\u0010hJ&\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\u00140\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\bj\u0010\u0016J0\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\u00140\b2\b\b\u0001\u0010,\u001a\u00020k2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\bm\u0010nJ\u001f\u0010o\u001a\b\u0012\u0004\u0012\u00020-0\u00042\b\b\u0001\u0010,\u001a\u00020-H'¢\u0006\u0004\bo\u0010pJ\u001c\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\u001d0\bH§@¢\u0006\u0004\br\u0010\u0011J<\u0010t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0]0\u001d0\b2\b\b\u0001\u0010.\u001a\u00020-2\b\b\u0001\u0010,\u001a\u00020sH§@¢\u0006\u0004\bt\u0010uJ6\u0010x\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0\u001d0\u00140\b2\b\b\u0001\u0010,\u001a\u00020v2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\bx\u0010yJ0\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020{0\u001d0\b2\b\b\u0001\u0010.\u001a\u00020-2\b\b\u0001\u0010,\u001a\u00020zH§@¢\u0006\u0004\b|\u0010}J1\u0010\u007f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0\u001d0\b2\b\b\u0001\u0010.\u001a\u00020-2\b\b\u0001\u0010,\u001a\u00020PH§@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J+\u0010\u0083\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0082\u00010\u001d0\b2\t\b\u0001\u0010,\u001a\u00030\u0081\u0001H§@¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J,\u0010\u0088\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010\u001d0\b2\n\b\u0001\u0010\u0086\u0001\u001a\u00030\u0085\u0001H§@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/ybsdk/network/Api;", "", "Lcom/ybsdk/network/dto/RemoteConfigRequest;", "body", "Lretrofit2/Call;", "Lcom/ybsdk/network/dto/RemoteConfigResponse;", "B", "(Lcom/ybsdk/network/dto/RemoteConfigRequest;)Lretrofit2/Call;", "Lkotlin/Result;", "d", "(Lcom/ybsdk/network/dto/RemoteConfigRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/BalanceRequest;", "Lcom/ybsdk/network/dto/BalanceResponse;", "J", "(Lcom/ybsdk/network/dto/BalanceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/WalletsInfoResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltq11;", "attemptNumber", "Liyd0;", "c", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/AgreementListResponse;", "e", "Lcom/ybsdk/network/dto/CheckPaymentRequest;", "Lcom/ybsdk/network/dto/CheckPaymentResponse;", "M", "(Lcom/ybsdk/network/dto/CheckPaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "A", "Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedRequest;", "Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedResponse;", "r", "(Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/topup/TopupNoticeContentRequest;", "Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetResponse;", "k", "(Lcom/ybsdk/network/dto/topup/TopupNoticeContentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/skeletons/SkeletonsRequest;", "Lcom/ybsdk/network/dto/skeletons/SkeletonsResponse;", "u", "(Lcom/ybsdk/network/dto/skeletons/SkeletonsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/ApplicationRequest;", "request", "", "idempotencyToken", "Lcom/ybsdk/network/dto/ApplicationResponse;", "h", "(Lcom/ybsdk/network/dto/ApplicationRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lv3f;", CA20Status.STATUS_REQUEST_K, "(Ljava/lang/String;Lv3f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/ApplicationStatusRequest;", "Lcom/ybsdk/network/dto/RegistrationApplicationStatusResponseV2;", "b", "(Lcom/ybsdk/network/dto/ApplicationStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationResponse;", "G", "Lcom/ybsdk/network/dto/ApplicationStatusResponse;", "L", CA20Status.STATUS_REQUEST_C, "(Lv3f;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "f", "(Lcom/ybsdk/network/dto/ApplicationStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationFormRequest;", "Lzy11;", "t", "(Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationFormRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CA20Status.STATUS_CERTIFICATE_H, "(Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdInnRequest;", "Lcom/ybsdk/network/dto/InnResponse;", "n", "(Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdInnRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/ApplicationSendCodeRequest;", "Lcom/ybsdk/network/dto/ApplicationSendCodeResponse;", RemoteBioParameters.X, "(Lcom/ybsdk/network/dto/ApplicationSendCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/ApplicationSubmitCodeRequest;", "Lcom/ybsdk/network/dto/ApplicationSubmitCodeResponse;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "(Lcom/ybsdk/network/dto/ApplicationSubmitCodeRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/GetUserInfoResponse;", "F", "Lcom/ybsdk/network/dto/RegistrationNextRequest;", "Lcom/ybsdk/network/dto/RegistrationNextResponse;", "l", "(Lcom/ybsdk/network/dto/RegistrationNextRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lcom/ybsdk/network/dto/StartSessionRequest;", "pinToken", "", "headers", "Lcom/ybsdk/network/dto/StartSessionResponse;", "v", "(Ljava/lang/String;Lcom/ybsdk/network/dto/StartSessionRequest;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "(Ljava/lang/String;Lcom/ybsdk/network/dto/StartSessionRequest;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "services", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/SupportChatResponse;", "w", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "o", "Lcom/ybsdk/feature/card/api/dto/CardClaimingStatusRequest;", "Lcom/ybsdk/feature/card/api/dto/CardClaimingStatusResponse;", "s", "(Lcom/ybsdk/feature/card/api/dto/CardClaimingStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", CA20Status.STATUS_USER_I, "(Ljava/lang/String;)Lretrofit2/Call;", "Lcom/ybsdk/network/dto/GetMenuResponse;", "p", "Lcom/ybsdk/network/dto/creditlimit/CreditLimitSetSettingsRequest;", "E", "(Ljava/lang/String;Lcom/ybsdk/network/dto/creditlimit/CreditLimitSetSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusRequest;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusResponse;", RemoteBioParameters.Y, "(Lcom/ybsdk/network/dto/changephone/ChangePhoneApplicationStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeRequest;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse;", CA20Status.STATUS_REQUEST_D, "(Ljava/lang/String;Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/changephone/ChangePhoneSubmitCodeResponse;", "z", "(Ljava/lang/String;Lcom/ybsdk/network/dto/ApplicationSubmitCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/card/CardDeliveryStatusRequest;", "Lcom/ybsdk/network/dto/card/CardDeliveryStatusResponse;", "q", "(Lcom/ybsdk/network/dto/card/CardDeliveryStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/network/dto/CashbackStatusRequest;", "cashbackStatusRequest", "Lcom/ybsdk/network/dto/CashbackStatusResponse;", CoreConstants.PushMessage.SERVICE_TYPE, "(Lcom/ybsdk/network/dto/CashbackStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Api {
    @s490("v2/check_payment")
    Object A(@q76 CheckPaymentRequest checkPaymentRequest, Continuation<? super Result<DataWithStatusResponse<CheckPaymentResponse>>> continuation);

    @s490("v1/client-experiments/v1/get_remote_config")
    Call<RemoteConfigResponse> B(@q76 RemoteConfigRequest body);

    @s490("v1/applications/v1/product/create_application")
    Object C(@q76 v3f v3fVar, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<ApplicationResponse>> continuation);

    @s490("v1/applications/v1/change_phone/send_code")
    Object D(@z8u("X-Idempotency-Token") String str, @q76 ChangePhoneSendCodeRequest changePhoneSendCodeRequest, Continuation<? super Result<DataWithStatusResponse<ChangePhoneSendCodeResponse>>> continuation);

    @s490("v1/credit-limit/purchase/settings/set")
    Object E(@z8u("X-Idempotency-Token") String str, @q76 CreditLimitSetSettingsRequest creditLimitSetSettingsRequest, Continuation<? super Result<DataWithStatusResponse<Map<String, String>>>> continuation);

    @s490("v1/userinfo/v2/get_user_info")
    Object F(Continuation<? super Result<GetUserInfoResponse>> continuation);

    @s490("v1/applications/v1/simplified_identification/create_application")
    Object G(Continuation<? super Result<SimplifiedIdApplicationResponse>> continuation);

    @s490("v1/applications/v1/simplified_identification/set_draft_form")
    Object H(@q76 SimplifiedIdApplicationFormRequest simplifiedIdApplicationFormRequest, Continuation<? super Result<zy11>> continuation);

    @s490("v1/wallet/v1/plus/get_widget_info")
    @RawJsonString
    Call<String> I(@q76 @RawJsonString String request);

    @s490("v1/wallet/v2/get_balance")
    Object J(@q76 BalanceRequest balanceRequest, Continuation<? super Result<BalanceResponse>> continuation);

    @s490("v1/applications/v2/registration/create_application")
    Object K(@z8u("X-Idempotency-Token") String str, @q76 v3f v3fVar, Continuation<? super Result<ApplicationResponse>> continuation);

    @s490("v1/applications/v1/get_application_status")
    Object L(@q76 ApplicationStatusRequest applicationStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<ApplicationStatusResponse>>> continuation);

    @s490("v1/wallet/v1/check_payment")
    Object M(@q76 CheckPaymentRequest checkPaymentRequest, Continuation<? super Result<CheckPaymentResponse>> continuation);

    @s490("v1/wallet/v1/get_wallets_info")
    Object a(Continuation<? super Result<WalletsInfoResponse>> continuation);

    @s490("v1/applications/v2/registration/get_application_status")
    Object b(@q76 ApplicationStatusRequest applicationStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<RegistrationApplicationStatusResponseV2>>>> continuation);

    @s490("v1/wallet/v1/get_wallets_info")
    Object c(@z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<WalletsInfoResponse>>> continuation);

    @s490("v1/client-experiments/v1/get_remote_config")
    Object d(@q76 RemoteConfigRequest remoteConfigRequest, Continuation<? super Result<RemoteConfigResponse>> continuation);

    @s490("v1/wallet/v1/get_agreement_list")
    Object e(Continuation<? super Result<AgreementListResponse>> continuation);

    @s490("v1/applications/v1/simplified_identification/get_application_status/long")
    Object f(@q76 ApplicationStatusRequest applicationStatusRequest, Continuation<? super Result<ApplicationStatusResponse>> continuation);

    @s490("v1/applications/v1/product/get_application_status")
    Object g(@q76 ApplicationStatusRequest applicationStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<ApplicationStatusResponse>>> continuation);

    @s490("v1/applications/v1/create_application")
    Object h(@q76 ApplicationRequest applicationRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<ApplicationResponse>> continuation);

    @s490("/v1/get_cashback_status")
    Object i(@q76 CashbackStatusRequest cashbackStatusRequest, Continuation<? super Result<DataWithStatusResponse<CashbackStatusResponse>>> continuation);

    @s490("v1/applications/v1/registration/submit_code")
    Object j(@q76 ApplicationSubmitCodeRequest applicationSubmitCodeRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<ApplicationSubmitCodeResponse>> continuation);

    @s490("v1/screens/get_topup_notice")
    Object k(@q76 TopupNoticeContentRequest topupNoticeContentRequest, Continuation<? super Result<DataWithStatusResponse<DivBottomSheetResponse>>> continuation);

    @s490("v1/registration/next")
    Object l(@q76 RegistrationNextRequest registrationNextRequest, Continuation<? super Result<DataWithStatusResponse<RegistrationNextResponse>>> continuation);

    @s490("v1/userinfo/v1/start_session")
    Object m(@z8u("Authorization") String str, @q76 StartSessionRequest startSessionRequest, @z8u("X-PIN-Token") String str2, @z8u("X-Idempotency-Token") String str3, @uau Map<String, String> map, Continuation<? super Result<StartSessionResponse>> continuation);

    @s490("v1/applications/v1/simplified_identification/get_inn")
    Object n(@q76 SimplifiedIdInnRequest simplifiedIdInnRequest, Continuation<? super Result<InnResponse>> continuation);

    @s490("v1/payment-methods/v1/get-list")
    Object o(@z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<PaymentMethodsListDto>>> continuation);

    @s490("v2/screens/v1/get_menu")
    Object p(Continuation<? super Result<DataWithStatusResponse<GetMenuResponse>>> continuation);

    @s490("v1/card_delivery_status")
    Object q(@q76 CardDeliveryStatusRequest cardDeliveryStatusRequest, Continuation<? super Result<DataWithStatusResponse<CardDeliveryStatusResponse>>> continuation);

    @s490("v1/topup/v1/get_topup_notice_content")
    Object r(@q76 TopupNoticeContentDeprecatedRequest topupNoticeContentDeprecatedRequest, Continuation<? super Result<TopupNoticeContentDeprecatedResponse>> continuation);

    @s490("v1/applications/v1/claim_card/get_application_status")
    Object s(@q76 CardClaimingStatusRequest cardClaimingStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<CardClaimingStatusResponse>>> continuation);

    @s490("v1/applications/v1/simplified_identification/submit_form")
    Object t(@q76 SimplifiedIdApplicationFormRequest simplifiedIdApplicationFormRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<zy11>> continuation);

    @s490("v1/skeleton/screens")
    Object u(@q76 SkeletonsRequest skeletonsRequest, Continuation<? super Result<DataWithStatusResponse<SkeletonsResponse>>> continuation);

    @s490("v1/userinfo/v1/start_session")
    Object v(@z8u("Authorization") String str, @q76 StartSessionRequest startSessionRequest, @z8u("X-PIN-Token") String str2, @uau Map<String, String> map, Continuation<? super Result<StartSessionResponse>> continuation);

    @wqs("4.0/support_chat/v2/chats")
    Object w(@djg0("services") String str, @djg0("status") String str2, Continuation<? super Result<SupportChatResponse>> continuation);

    @s490("v1/applications/v1/registration/send_code")
    Object x(@q76 ApplicationSendCodeRequest applicationSendCodeRequest, Continuation<? super Result<ApplicationSendCodeResponse>> continuation);

    @s490("v1/applications/v1/change_phone/get_application_status")
    Object y(@q76 ChangePhoneApplicationStatusRequest changePhoneApplicationStatusRequest, @z8u("X-YB-Polling-Attempt-Number") int i, Continuation<? super Result<iyd0<DataWithStatusResponse<ChangePhoneApplicationStatusResponse>>>> continuation);

    @s490("v1/applications/v1/change_phone/submit_code")
    Object z(@z8u("X-Idempotency-Token") String str, @q76 ApplicationSubmitCodeRequest applicationSubmitCodeRequest, Continuation<? super Result<DataWithStatusResponse<ChangePhoneSubmitCodeResponse>>> continuation);
}
