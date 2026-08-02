package com.yandex.payment.divkit.verify;

import android.content.Context;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.api.DivKitApi;
import com.yandex.payment.divkit.bind.DKButtonLoadingAnimatedView;
import com.yandex.payment.divkit.usecases.d;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.nfcscanner.tools.c;
import com.yandex.payment.sdk.ui.CardInputView;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import defpackage.abe;
import defpackage.ar5;
import defpackage.arf;
import defpackage.bx5;
import defpackage.cg8;
import defpackage.cnk;
import defpackage.cof;
import defpackage.cvu0;
import defpackage.dpa0;
import defpackage.dy40;
import defpackage.dzf;
import defpackage.e98;
import defpackage.eja1;
import defpackage.es31;
import defpackage.fvf;
import defpackage.gtf;
import defpackage.gvf;
import defpackage.gyc;
import defpackage.hs31;
import defpackage.htf;
import defpackage.hu31;
import defpackage.hvf;
import defpackage.i3y;
import defpackage.i891;
import defpackage.iho;
import defpackage.in8;
import defpackage.j9f;
import defpackage.jhq0;
import defpackage.jl40;
import defpackage.jn8;
import defpackage.joz0;
import defpackage.jvf;
import defpackage.kl41;
import defpackage.kn8;
import defpackage.kvf;
import defpackage.ll41;
import defpackage.ln8;
import defpackage.lvf;
import defpackage.m93;
import defpackage.md51;
import defpackage.ml41;
import defpackage.mn8;
import defpackage.mta1;
import defpackage.n891;
import defpackage.ncq0;
import defpackage.nl41;
import defpackage.nn8;
import defpackage.nrf;
import defpackage.nu5;
import defpackage.nx;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.o400;
import defpackage.omk;
import defpackage.ong0;
import defpackage.oxe;
import defpackage.pg8;
import defpackage.pv5;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.q7w;
import defpackage.qoi0;
import defpackage.qu5;
import defpackage.qv90;
import defpackage.qw5;
import defpackage.raq0;
import defpackage.rf8;
import defpackage.rs31;
import defpackage.rv10;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.sls;
import defpackage.sv90;
import defpackage.tc5;
import defpackage.thb1;
import defpackage.tje;
import defpackage.tls;
import defpackage.tue0;
import defpackage.tyh0;
import defpackage.u131;
import defpackage.u2l;
import defpackage.ujk;
import defpackage.us20;
import defpackage.uu5;
import defpackage.uvq;
import defpackage.uyj;
import defpackage.uyv;
import defpackage.vfc;
import defpackage.vv90;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wga0;
import defpackage.wj00;
import defpackage.wnf;
import defpackage.wuv;
import defpackage.xw5;
import defpackage.xxk;
import defpackage.y22;
import defpackage.y891;
import defpackage.y8f;
import defpackage.yhl;
import defpackage.yv90;
import defpackage.zbq0;
import defpackage.zgf;
import defpackage.zmk;
import defpackage.zw0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ©\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004ª\u0001«\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010\u0006J\u0017\u00101\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00103J\u0017\u00105\u001a\u00020\t2\u0006\u0010$\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\t2\u0006\u0010$\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\t2\u0006\u0010$\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\t2\u0006\u0010$\u001a\u00020>H\u0002¢\u0006\u0004\bA\u0010@J\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020 H\u0002¢\u0006\u0004\bF\u0010\"J\u000f\u0010G\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\"\u0010i\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010p\u001a\u00020o8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010w\u001a\u00020v8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R&\u0010~\u001a\u00020}8\u0006@\u0006X\u0087.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u0099\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010[\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R \u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¢\u0001\u0010[\u001a\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010¨\u0001\u001a\u00020e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/yandex/payment/divkit/verify/DKVerifyCardFragment;", "Landroidx/fragment/app/Fragment;", "Luu5;", "Ltue0;", "Lwnf;", "<init>", "()V", "Larf;", "callbacks", "Lzy11;", "setBindCallback", "(Larf;)V", "Lgtf;", "setPreselectCallback", "(Lgtf;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/yandex/payment/sdk/core/data/PaymentToken;", "paymentToken", "Lraq0;", "continuePaying", "(Lcom/yandex/payment/sdk/core/data/PaymentToken;Lraq0;)V", "Lhtf;", ClidProvider.STATE, "setExternalButtonState", "(Lhtf;)V", "", "cvn", "proceed", "(Ljava/lang/String;)V", "showSelectFragment", "observeSaveCardFlag", "setButtonText", "observeLiveData", "", "isLoading", "setScreenLoadingState", "(Z)V", "()Z", "Lnn8;", "setScreenState", "(Lnn8;)V", "Lin8;", "setTerminalErrorState", "(Lin8;)V", "Luyv;", "inputErrorState", "setNonTerminalErrorState", "(Luyv;)V", "Lnl41;", "setWebViewState", "(Lnl41;)V", "setPreselectWebViewState", "Lcnk;", "divData", "observeDivData", "(Lcnk;)V", "continuePayingInternal", "listenNfcState", "Lcom/yandex/payment/sdk/nfcscanner/tools/c;", "requestController", "()Lcom/yandex/payment/sdk/nfcscanner/tools/c;", "verificationIntentId", "Ljava/lang/String;", "bindingId", "currency", "Lcom/yandex/payment/divkit/bind/DKButtonLoadingAnimatedView;", "animatedView", "Lcom/yandex/payment/divkit/bind/DKButtonLoadingAnimatedView;", "Lcom/yandex/payment/sdk/ui/CardInputView;", "cardInput", "Lcom/yandex/payment/sdk/ui/CardInputView;", "bindCallbacks", "Larf;", "preselectCallbacks", "Lgtf;", "Ltc5;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Ltc5;", "activityViewModel", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Ldpa0;", "_binding", "Ldpa0;", "Lnx;", "actionFlowReceiver", "Lnx;", "getActionFlowReceiver", "()Lnx;", "setActionFlowReceiver", "(Lnx;)V", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Lvv90;", "paymentApi", "Lvv90;", "getPaymentApi", "()Lvv90;", "setPaymentApi", "(Lvv90;)V", "Luvq;", "fitchBindScreenUseCase", "Luvq;", "getFitchBindScreenUseCase", "()Luvq;", "setFitchBindScreenUseCase", "(Luvq;)V", "Lcg8;", "cardInputBridge", "Lcg8;", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "Lhu31;", "viewReadyObservable", "Lhu31;", "getViewReadyObservable", "()Lhu31;", "setViewReadyObservable", "(Lhu31;)V", "Lkvf;", "viewModel$delegate", "getViewModel", "()Lkvf;", "viewModel", "getBinding", "()Ldpa0;", "binding", "Companion", "FixupOnLayoutChangeListener", "hvf", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKVerifyCardFragment extends Fragment implements uu5, tue0, wnf {
    private static final String ARG_BINDING_ID = "ARG_BINDING_ID";
    private static final String ARG_CURRENCY = "ARG_CURRENCY";
    private static final String ARG_VERIFICATION_INTENT_ID = "ARG_VERIFICATION_INTENT_ID";
    public static final String BACK = "back";
    public static final String BACK_BUTTON_VISIBILITY_VARIABLE_NAME = "card_input_screen_back_button_div_state";
    public static final String BLUR_VISIBILITY_VARIABLE_NAME = "card_input_screen_anim_div_state";
    public static final String BUTTON_STATE_VARIABLE_NAME = "card_input_screen_button_state";
    public static final String CHECKBOX = "checkbox";
    public static final String CLOSE = "close";
    public static final String CONTINUE = "continue";
    public static final hvf Companion = new hvf();
    public static final float DEFAULT_ALPHA = 1.0f;
    public static final String ERROR_STATE_VARIABLE_NAME = "card_input_screen_error_state";
    public static final String FALSE = "false";
    public static final float LOADING_ALPHA = 0.5f;
    public static final String NFC_VISIBILITY_VARIABLE_NAME = "card_input_screen_nfc_visibility";
    public static final String PAY = "pay";
    public static final String PAY_BUTTON_TEXT_VARIABLE_NAME = "card_input_screen_pay_button_text";
    public static final String SAVE_CHECKBOX_VALUE_VARIABLE_NAME = "card_input_screen_checkbox_value";
    public static final String SAVE_CHECKBOX_VISIBILITY_VARIABLE_NAME = "card_input_screen_checkbox_state";
    public static final String TERMS_CLICK = "terms_click";
    public static final String TRUE = "true";
    private dpa0 _binding;
    public nx actionFlowReceiver;
    private DKButtonLoadingAnimatedView animatedView;
    private arf bindCallbacks;
    private String bindingId;
    private CardInputView cardInput;
    private cg8 cardInputBridge;
    private String currency;
    private Div2View div2View;
    public ujk divConfiguration;
    public rwo eventReporter;
    public uvq fitchBindScreenUseCase;
    private View.OnLayoutChangeListener layoutChangeListener;
    public u2l parsingEnvironment;
    public vv90 paymentApi;
    private gtf preselectCallbacks;
    private String verificationIntentId;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public hu31 viewReadyObservable;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = a.a(new gvf(this, 0));

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext = a.a(new gvf(this, 1));

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/payment/divkit/verify/DKVerifyCardFragment$FixupOnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/ViewGroup;", "target", "<init>", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Landroid/view/ViewGroup;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FixupOnLayoutChangeListener implements View.OnLayoutChangeListener {
        private final ViewGroup target;

        public FixupOnLayoutChangeListener(ViewGroup viewGroup) {
            this.target = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            TransitionManager.endTransitions(this.target);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.payment.divkit.verify.DKVerifyCardFragment$special$$inlined$viewModels$default$1] */
    public DKVerifyCardFragment() {
        gvf gvfVar = new gvf(this, 2);
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.divkit.verify.DKVerifyCardFragment$special$$inlined$viewModels$default$1
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        final i3y b = a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.verify.DKVerifyCardFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(kvf.class), new sls() { // from class: com.yandex.payment.divkit.verify.DKVerifyCardFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, gvfVar, new sls() { // from class: com.yandex.payment.divkit.verify.DKVerifyCardFragment$special$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                if (slsVar != null && (y8fVar = (y8f) slsVar.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tc5 activityViewModel_delegate$lambda$0(DKVerifyCardFragment dKVerifyCardFragment) {
        tc5 activityViewModel;
        arf arfVar = dKVerifyCardFragment.bindCallbacks;
        if (arfVar == null || (activityViewModel = arfVar.a()) == null) {
            gtf gtfVar = dKVerifyCardFragment.preselectCallbacks;
            activityViewModel = gtfVar != null ? ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).a.getActivityViewModel() : null;
        }
        if (activityViewModel != null) {
            return activityViewModel;
        }
        ny61.r("ViewModel is null, callback isn`t provided");
        return null;
    }

    private final void continuePayingInternal(PaymentToken paymentToken, raq0 callbacks) {
        getViewModel().getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(DKVerifyCardFragment dKVerifyCardFragment) {
        return new Div2Context(dKVerifyCardFragment.requireActivity(), dKVerifyCardFragment.getDivConfiguration(), 0, dKVerifyCardFragment.getViewLifecycleOwner(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tc5 getActivityViewModel() {
        return (tc5) this.activityViewModel.getValue();
    }

    private final dpa0 getBinding() {
        dpa0 dpa0Var = this._binding;
        if (dpa0Var != null) {
            return dpa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final Div2Context getDivContext() {
        return (Div2Context) this.divContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kvf getViewModel() {
        return (kvf) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoading() {
        kvf viewModel = getViewModel();
        return jl40.l((viewModel.x ? viewModel.L : ((qu5) viewModel.w.getValue()).l).d(), kn8.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void listenNfcState() {
        p s = eja1.s(getViewLifecycleOwner());
        sjh sjhVar = uyj.a;
        tje.N(s, o400.a, null, new DKVerifyCardFragment$listenNfcState$1(this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeDivData(cnk divData) {
        Div2View div2View = this.div2View;
        if (div2View == null || !jl40.l(div2View.getParent(), getBinding().c)) {
            Div2View div2View2 = new Div2View(getDivContext(), null, 0, 6, null);
            div2View2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            div2View2.setId(View.generateViewId());
            this.div2View = div2View2;
        }
        if (getBinding().c.getChildCount() == 0) {
            getBinding().c.addView(this.div2View);
        }
        Div2View div2View3 = this.div2View;
        if (div2View3 != null) {
            omk omkVar = divData.a;
            div2View3.setData(omkVar, new zmk(omkVar.b));
        }
        Div2View div2View4 = this.div2View;
        if (div2View4 != null) {
            div2View4.post(new j9f(20, divData, this));
        }
        rwo eventReporter = getEventReporter();
        sv90 sv90Var = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.DK_BIND;
        sv90Var.getClass();
        ((y22) eventReporter).a(sv90.w0(psdkScreen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1(cnk cnkVar, DKVerifyCardFragment dKVerifyCardFragment) {
        for (Pair pair : cnkVar.b) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKVerifyCardFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
        Div2View div2View2 = dKVerifyCardFragment.div2View;
        if (div2View2 != null) {
            div2View2.post(new oxe(7, dKVerifyCardFragment));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1$1(DKVerifyCardFragment dKVerifyCardFragment) {
        Div2View div2View = dKVerifyCardFragment.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_nfc_visibility", "gone");
        }
    }

    private final void observeLiveData() {
        int i = 3;
        tje.N(eja1.s(this), null, null, new DKVerifyCardFragment$observeLiveData$1(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKVerifyCardFragment$observeLiveData$2(this, null), 3);
        kvf viewModel = getViewModel();
        (viewModel.x ? viewModel.L : ((qu5) viewModel.w.getValue()).l).f(getViewLifecycleOwner(), new cof(i, new fvf(this, 7)));
        getViewModel().y.f(getViewLifecycleOwner(), new cof(i, new fvf(this, 0)));
        kvf viewModel2 = getViewModel();
        (viewModel2.x ? viewModel2.N : ((qu5) viewModel2.w.getValue()).n).f(getViewLifecycleOwner(), new cof(i, new fvf(this, 1)));
        getViewModel().F.f(getViewLifecycleOwner(), new cof(i, new fvf(this, 2)));
        getViewModel().G.f(getViewLifecycleOwner(), new cof(i, new fvf(this, i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$0(DKVerifyCardFragment dKVerifyCardFragment, nn8 nn8Var) {
        dKVerifyCardFragment.setScreenState(nn8Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$1(DKVerifyCardFragment dKVerifyCardFragment, Boolean bool) {
        dKVerifyCardFragment.setScreenLoadingState(bool.booleanValue());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$2(DKVerifyCardFragment dKVerifyCardFragment, nl41 nl41Var) {
        dKVerifyCardFragment.setWebViewState(nl41Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$3(DKVerifyCardFragment dKVerifyCardFragment, nl41 nl41Var) {
        dKVerifyCardFragment.setPreselectWebViewState(nl41Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$4(DKVerifyCardFragment dKVerifyCardFragment, nn8 nn8Var) {
        dKVerifyCardFragment.setScreenState(nn8Var);
        return zy11.a;
    }

    private final void observeSaveCardFlag() {
        getViewModel().H.f(getViewLifecycleOwner(), new cof(3, new fvf(this, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeSaveCardFlag$lambda$0(DKVerifyCardFragment dKVerifyCardFragment, Boolean bool) {
        CardInputView cardInputView;
        cg8 cg8Var = dKVerifyCardFragment.cardInputBridge;
        if (cg8Var != null && (cardInputView = cg8Var.b) != null) {
            cardInputView.setSaveCardOnPayment(bool.booleanValue());
        }
        CardInputView cardInputView2 = dKVerifyCardFragment.cardInput;
        if (cardInputView2 != null) {
            cardInputView2.setSaveCardOnPayment(bool.booleanValue());
        }
        String str = bool.booleanValue() ? "true" : "false";
        Div2View div2View = dKVerifyCardFragment.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_checkbox_value", str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(DKVerifyCardFragment dKVerifyCardFragment) {
        gtf gtfVar = dKVerifyCardFragment.preselectCallbacks;
        if (gtfVar != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).t(null);
        }
        gtf gtfVar2 = dKVerifyCardFragment.preselectCallbacks;
        if (gtfVar2 != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar2).r();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$1(DKVerifyCardFragment dKVerifyCardFragment, rf8 rf8Var) {
        arf arfVar = dKVerifyCardFragment.bindCallbacks;
        if (arfVar != null) {
            arfVar.h(rf8Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(DKVerifyCardFragment dKVerifyCardFragment, String str) {
        arf arfVar = dKVerifyCardFragment.bindCallbacks;
        if (arfVar != null) {
            arfVar.j(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(DKVerifyCardFragment dKVerifyCardFragment) {
        dKVerifyCardFragment.showSelectFragment();
        return zy11.a;
    }

    private static final zy11 onViewCreated$lambda$5(DKVerifyCardFragment dKVerifyCardFragment, jhq0 jhq0Var) {
        gtf gtfVar = dKVerifyCardFragment.preselectCallbacks;
        if (gtfVar != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).m(jhq0Var);
        }
        return zy11.a;
    }

    private static final zy11 onViewCreated$lambda$6(DKVerifyCardFragment dKVerifyCardFragment, PaymentMethod paymentMethod) {
        if (dKVerifyCardFragment.preselectCallbacks != null) {
            o3a0.e.a(paymentMethod);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c requestController() {
        kvf viewModel = getViewModel();
        viewModel.getClass();
        jvf jvfVar = new jvf(viewModel);
        c cVar = viewModel.J;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(jvfVar);
        viewModel.J = cVar2;
        return cVar2;
    }

    private final void setButtonText() {
        zbq0 zbq0Var;
        Div2View div2View;
        wga0 wga0Var;
        gtf gtfVar = this.preselectCallbacks;
        if (gtfVar != null) {
            zbq0Var = ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).a.selectFragmentCallbacks;
            PaymentSettings paymentSettings = null;
            if (zbq0Var != null && (wga0Var = zbq0Var.B) != null) {
                paymentSettings = wga0Var.g();
            }
            if (paymentSettings == null || (div2View = this.div2View) == null) {
                return;
            }
            div2View.setVariable("card_input_screen_pay_button_text", mta1.d(requireContext(), paymentSettings, getEventReporter()));
        }
    }

    private final void setNonTerminalErrorState(uyv inputErrorState) {
        CardInputView cardInputView;
        ((y22) getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Показ нетерминальной ошибки", "non_terminal_error_shown"));
        DKButtonLoadingAnimatedView dKButtonLoadingAnimatedView = this.animatedView;
        if (dKButtonLoadingAnimatedView != null) {
            dKButtonLoadingAnimatedView.stopAnimation();
        }
        CardInputView cardInputView2 = this.cardInput;
        if (cardInputView2 != null) {
            cardInputView2.setAlpha(1.0f);
        }
        Div2View div2View = this.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_anim_div_state", "gone");
        }
        Div2View div2View2 = this.div2View;
        if (div2View2 != null) {
            div2View2.setVariable("card_input_screen_button_state", "continue");
        }
        cg8 cg8Var = this.cardInputBridge;
        if (cg8Var != null && (cardInputView = cg8Var.b) != null) {
            cardInputView.setCardForbiddenState();
        }
        Div2View div2View3 = this.div2View;
        if (div2View3 != null) {
            div2View3.setVariable("card_input_screen_error_state", inputErrorState.b.toLowerCase(Locale.ROOT));
        }
        CardInputView cardInputView3 = this.cardInput;
        if (cardInputView3 != null) {
            cardInputView3.requestFocus();
        }
    }

    private final void setPreselectWebViewState(nl41 state) {
        if (state instanceof ll41) {
            gtf gtfVar = this.preselectCallbacks;
            if (gtfVar != null) {
                ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).d(((ll41) state).a.toString(), EmptyList.a);
                return;
            }
            return;
        }
        if (state instanceof ml41) {
            gtf gtfVar2 = this.preselectCallbacks;
            if (gtfVar2 != null) {
                ml41 ml41Var = (ml41) state;
                ((com.yandex.payment.sdk.ui.preselect.a) gtfVar2).d(ml41Var.a.toString(), ml41Var.b);
                return;
            }
            return;
        }
        if (!(state instanceof kl41)) {
            w511.b();
            return;
        }
        gtf gtfVar3 = this.preselectCallbacks;
        if (gtfVar3 != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar3).f();
        }
    }

    private final void setScreenLoadingState(boolean isLoading) {
        getBinding().d.setVisibility(isLoading ? 0 : 8);
        getBinding().c.setVisibility(isLoading ? 8 : 0);
    }

    private final void setScreenState(nn8 state) {
        boolean z = state instanceof kn8;
        getBinding().b.setVisibility(z ? 0 : 8);
        if (state instanceof jn8) {
            Div2View div2View = this.div2View;
            if (div2View != null) {
                div2View.setVariable("card_input_screen_button_state", "number");
            }
            Div2View div2View2 = this.div2View;
            if (div2View2 != null) {
                div2View2.setVariable("card_input_screen_anim_div_state", "gone");
                return;
            }
            return;
        }
        if (z) {
            CardInputView cardInputView = this.cardInput;
            if (cardInputView != null) {
                cardInputView.clearFocus();
            }
            DKButtonLoadingAnimatedView dKButtonLoadingAnimatedView = this.animatedView;
            if (dKButtonLoadingAnimatedView != null) {
                dKButtonLoadingAnimatedView.startAnimation();
            }
            CardInputView cardInputView2 = this.cardInput;
            if (cardInputView2 != null) {
                cardInputView2.setAlpha(0.5f);
            }
            Div2View div2View3 = this.div2View;
            if (div2View3 != null) {
                div2View3.setVariable("card_input_screen_button_state", ResultType.RESULT_TYPE_LOADING);
            }
            Div2View div2View4 = this.div2View;
            if (div2View4 != null) {
                div2View4.setVariable("card_input_screen_anim_div_state", "visible");
                return;
            }
            return;
        }
        if (state instanceof ln8) {
            arf arfVar = this.bindCallbacks;
            if (arfVar != null) {
                arfVar.c(((ln8) state).a);
            }
            gtf gtfVar = this.preselectCallbacks;
            if (gtfVar != null) {
                ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).f();
            }
            gtf gtfVar2 = this.preselectCallbacks;
            if (gtfVar2 != null) {
                ((com.yandex.payment.sdk.ui.preselect.a) gtfVar2).c(((ln8) state).a);
                return;
            }
            return;
        }
        if (!(state instanceof in8)) {
            if (state instanceof mn8) {
                yhl.d(state, "Illegal model state ");
                return;
            } else {
                w511.b();
                return;
            }
        }
        in8 in8Var = (in8) state;
        PaymentKitError paymentKitError = in8Var.a;
        if (paymentKitError.getKind6_6_0() == PaymentKitError.Kind6_6_0.warning) {
            setNonTerminalErrorState(new uyv(paymentKitError.getMessage()));
        } else {
            setTerminalErrorState(in8Var);
        }
    }

    private final void setTerminalErrorState(in8 state) {
        arf arfVar = this.bindCallbacks;
        if (arfVar != null) {
            arfVar.f();
        }
        gtf gtfVar = this.preselectCallbacks;
        if (gtfVar != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).f();
        }
        arf arfVar2 = this.bindCallbacks;
        if (arfVar2 != null) {
            arfVar2.e(state.a);
        }
    }

    private final void setWebViewState(nl41 state) {
        if (state instanceof ll41) {
            arf arfVar = this.bindCallbacks;
            if (arfVar != null) {
                arfVar.j(((ll41) state).a.toString());
                return;
            }
            return;
        }
        if (state instanceof ml41) {
            arf arfVar2 = this.bindCallbacks;
            if (arfVar2 != null) {
                ml41 ml41Var = (ml41) state;
                arfVar2.d(ml41Var.a.toString(), ml41Var.b);
                return;
            }
            return;
        }
        if (!(state instanceof kl41)) {
            w511.b();
            return;
        }
        arf arfVar3 = this.bindCallbacks;
        if (arfVar3 != null) {
            arfVar3.f();
        }
    }

    private final void showSelectFragment() {
        if (!isAdded() || getParentFragmentManager().S()) {
            return;
        }
        gtf gtfVar = this.preselectCallbacks;
        if (gtfVar != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).t(null);
        }
        gtf gtfVar2 = this.preselectCallbacks;
        if (gtfVar2 != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar2).r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$0(DKVerifyCardFragment dKVerifyCardFragment) {
        return new lvf(dKVerifyCardFragment.getEventReporter(), dKVerifyCardFragment.getPaymentApi());
    }

    @Override // defpackage.tue0
    public void continuePaying(PaymentToken paymentToken, raq0 callbacks) {
        ((zbq0) callbacks).m();
        continuePayingInternal(paymentToken, callbacks);
    }

    public final nx getActionFlowReceiver() {
        nx nxVar = this.actionFlowReceiver;
        if (nxVar != null) {
            return nxVar;
        }
        return null;
    }

    public final ujk getDivConfiguration() {
        ujk ujkVar = this.divConfiguration;
        if (ujkVar != null) {
            return ujkVar;
        }
        return null;
    }

    public final rwo getEventReporter() {
        rwo rwoVar = this.eventReporter;
        if (rwoVar != null) {
            return rwoVar;
        }
        return null;
    }

    public final uvq getFitchBindScreenUseCase() {
        uvq uvqVar = this.fitchBindScreenUseCase;
        if (uvqVar != null) {
            return uvqVar;
        }
        return null;
    }

    public final u2l getParsingEnvironment() {
        u2l u2lVar = this.parsingEnvironment;
        if (u2lVar != null) {
            return u2lVar;
        }
        return null;
    }

    public final vv90 getPaymentApi() {
        vv90 vv90Var = this.paymentApi;
        if (vv90Var != null) {
            return vv90Var;
        }
        return null;
    }

    public final hu31 getViewReadyObservable() {
        hu31 hu31Var = this.viewReadyObservable;
        if (hu31Var != null) {
            return hu31Var;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(ARG_VERIFICATION_INTENT_ID);
        if (string != null) {
            this.verificationIntentId = string;
        }
        String string2 = requireArguments.getString(ARG_BINDING_ID);
        if (string2 != null) {
            this.bindingId = string2;
        }
        String string3 = requireArguments.getString(ARG_CURRENCY);
        if (string3 != null) {
            this.currency = string3;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        nrf nrfVar = this.bindCallbacks;
        if (nrfVar == null) {
            nrfVar = this.preselectCallbacks;
        }
        if (nrfVar != null) {
            xxk xxkVar = (xxk) nrfVar.b(this, xxk.class);
            requireActivity();
            requireActivity().getApplicationContext();
            requireActivity().getApplication();
            pv5 x = nrfVar.x();
            vv90 k = nrfVar.k();
            nrfVar.s();
            k.getClass();
            new ncq0();
            dzf dzfVar = (dzf) xxkVar;
            nx a = dzfVar.a();
            q5z.h(a);
            this.actionFlowReceiver = a;
            ujk b = dzfVar.b();
            q5z.h(b);
            this.divConfiguration = b;
            u2l c = dzfVar.c();
            q5z.h(c);
            this.parsingEnvironment = c;
            this.eventReporter = dzfVar.g;
            this.paymentApi = k;
            dzf dzfVar2 = (dzf) xxkVar;
            m93 m93Var = new m93(dzfVar2.a.getApplicationContext());
            abe e = dzfVar2.e();
            DivKitApi d = dzfVar2.d();
            rwo rwoVar = dzfVar2.g;
            this.fitchBindScreenUseCase = new d(m93Var, e, x, new com.yandex.payment.divkit.common.a(new com.yandex.payment.divkit.repository.a(d, rwoVar), rwoVar));
            hu31 hu31Var = (hu31) dzfVar.v.get();
            q5z.h(hu31Var);
            this.viewReadyObservable = hu31Var;
        }
        dpa0 o = dpa0.o(inflater, container);
        this._binding = o;
        return o.a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        cg8 cg8Var = this.cardInputBridge;
        if (cg8Var != null) {
            cg8Var.a(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getDivContext().getDivVariableController().i(new u131("isLightTheme", i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true)));
        arf arfVar = this.bindCallbacks;
        this.layoutChangeListener = new FixupOnLayoutChangeListener(getBinding().a);
        ConstraintLayout constraintLayout = getBinding().a;
        View.OnLayoutChangeListener onLayoutChangeListener = this.layoutChangeListener;
        if (onLayoutChangeListener == null) {
            onLayoutChangeListener = null;
        }
        constraintLayout.addOnLayoutChangeListener(onLayoutChangeListener);
        int i = 3;
        getViewModel().I = new gvf(this, i);
        getViewModel().D = new fvf(this, 5);
        getViewModel().E = new fvf(this, 6);
        if (arfVar != null) {
            kvf viewModel = getViewModel();
            String str = this.verificationIntentId;
            String str2 = this.bindingId;
            String str3 = this.currency;
            viewModel.y.m(Boolean.TRUE);
            rwo rwoVar = viewModel.b;
            vv90 vv90Var = viewModel.c;
            dy40 dy40Var = viewModel.M;
            dy40 dy40Var2 = viewModel.L;
            viewModel.x = true;
            viewModel.C = new pg8(i, viewModel);
            e98 e98Var = e98.a;
            kn8 kn8Var = kn8.a;
            if (str != null) {
                dy40Var2.l(kn8Var);
                dy40Var.l(e98Var);
                nu5 nu5Var = ((yv90) vv90Var).j;
                zgf zgfVar = new zgf(4, viewModel);
                xw5 xw5Var = nu5Var.a;
                bx5 bx5Var = xw5Var.a;
                rwo rwoVar2 = bx5Var.l;
                iho f = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Дополнительно верифицировать карту", "card_additional_verify");
                md51 h = bx5Var.f.a.f(new wuv(str, null, null), new rv10(29), NetworkServiceRetryingStrategy.retryOnce).h(new ar5(4));
                ((y22) rwoVar2).b(f, h);
                h.h(new qw5(xw5Var, zgfVar, 0)).c(new qw5(zgfVar, 1));
                wj00 wj00Var = new wj00(0);
                wj00Var.k("bind_card_verification_intent_id", str);
                wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Доверификация начата");
                ((y22) rwoVar).a(y891.c("additional_verify_started", wj00Var));
            } else if (str2 != null) {
                dy40Var2.l(kn8Var);
                dy40Var.l(e98Var);
                nu5 nu5Var2 = ((yv90) vv90Var).j;
                zgf zgfVar2 = new zgf(4, viewModel);
                xw5 xw5Var2 = nu5Var2.a;
                bx5 bx5Var2 = xw5Var2.a;
                rwo rwoVar3 = bx5Var2.l;
                iho f2 = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Дополнительно верифицировать карту", "card_additional_verify");
                md51 h2 = bx5Var2.f.a.f(new wuv(null, str2, str3), new rv10(29), NetworkServiceRetryingStrategy.retryOnce).h(new ar5(14));
                ((y22) rwoVar3).b(f2, h2);
                h2.h(new qw5(xw5Var2, zgfVar2, 2)).c(new qw5(zgfVar2, 3));
                wj00 wj00Var2 = new wj00(0);
                wj00Var2.k("bind_card_binding_id", str2);
                if (str3 != null) {
                    wj00Var2.k("currency", str3);
                }
                wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Доверификация начата");
                ((y22) rwoVar).a(y891.c("additional_verify_started", wj00Var2));
            }
            arfVar.C();
        }
        getViewModel().I = new gvf(this, 4);
        observeLiveData();
        observeSaveCardFlag();
        setButtonText();
        if (arfVar != null) {
            arfVar.n(false);
        }
    }

    @Override // defpackage.wnf
    public void proceed(String cvn) {
        kvf viewModel = getViewModel();
        dy40 dy40Var = viewModel.L;
        String str = viewModel.z;
        LinkedHashMap linkedHashMap = viewModel.A;
        joz0 joz0Var = viewModel.B;
        if (str == null || linkedHashMap == null || joz0Var == null) {
            PaymentKitError.Companion.getClass();
            dy40Var.l(new in8(com.yandex.payment.sdk.core.data.a.d("Missing verification data")));
            return;
        }
        dy40Var.l(kn8.a);
        nu5 nu5Var = ((yv90) viewModel.c).j;
        us20 us20Var = viewModel.C;
        if (us20Var == null) {
            us20Var = new gyc(viewModel);
        }
        us20 us20Var2 = us20Var;
        final jvf jvfVar = new jvf(viewModel);
        xw5 xw5Var = nu5Var.a;
        String str2 = joz0Var.a;
        final int i = 0;
        wj00 wj00Var = new wj00(0);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            wj00Var.k((String) entry.getKey(), (String) entry.getValue());
        }
        if (!cvu0.s(str2, "/api", false)) {
            str2 = cvu0.s(str2, "/", false) ? str2.concat("api") : str2.concat("/api");
        }
        String str3 = joz0Var.b;
        q7w q7wVar = new q7w(str3, str2);
        bx5 bx5Var = xw5Var.a;
        boolean f = thb1.f(cvn);
        bx5Var.p.invoke(q7wVar);
        rwo rwoVar = bx5Var.l;
        qv90.a.getClass();
        ((y22) rwoVar).a(sv90.t(str3));
        final int i2 = 1;
        bx5Var.e.a(cvn, wj00Var).g(new zw0(bx5Var, str, wj00Var, f, us20Var2)).h(new tls() { // from class: ww5
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                jvf jvfVar2 = jvfVar;
                switch (i3) {
                    case 0:
                        n891.n(new lu5(2, jvfVar2, (sb8) obj));
                        break;
                    default:
                        n891.n(new lu5(1, jvfVar2, (YSError) obj));
                        break;
                }
                return zy11Var;
            }
        }).c(new tls() { // from class: ww5
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                jvf jvfVar2 = jvfVar;
                switch (i3) {
                    case 0:
                        n891.n(new lu5(2, jvfVar2, (sb8) obj));
                        break;
                    default:
                        n891.n(new lu5(1, jvfVar2, (YSError) obj));
                        break;
                }
                return zy11Var;
            }
        });
    }

    public final void setActionFlowReceiver(nx nxVar) {
        this.actionFlowReceiver = nxVar;
    }

    @Override // defpackage.uu5
    public void setBindCallback(arf callbacks) {
        this.bindCallbacks = callbacks;
    }

    public final void setDivConfiguration(ujk ujkVar) {
        this.divConfiguration = ujkVar;
    }

    public final void setEventReporter(rwo rwoVar) {
        this.eventReporter = rwoVar;
    }

    @Override // defpackage.tue0
    public void setExternalButtonState(htf state) {
        Integer num;
        Context requireContext = requireContext();
        if (this.preselectCallbacks != null) {
            new pv5();
            num = Integer.valueOf(tyh0.paymentsdk_pay_button_title_fomatted);
        } else {
            num = null;
        }
        String string = requireContext.getString(n891.q(num), mta1.e("RUB", getEventReporter()), mta1.b(state.a));
        Div2View div2View = this.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_pay_button_text", string);
        }
    }

    public final void setFitchBindScreenUseCase(uvq uvqVar) {
        this.fitchBindScreenUseCase = uvqVar;
    }

    public final void setParsingEnvironment(u2l u2lVar) {
        this.parsingEnvironment = u2lVar;
    }

    public final void setPaymentApi(vv90 vv90Var) {
        this.paymentApi = vv90Var;
    }

    @Override // defpackage.tue0
    public void setPreselectCallback(gtf callbacks) {
        this.preselectCallbacks = callbacks;
    }

    public final void setViewReadyObservable(hu31 hu31Var) {
        this.viewReadyObservable = hu31Var;
    }
}
