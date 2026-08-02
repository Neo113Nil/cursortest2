package com.yandex.payment.divkit.bind;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.api.DivKitApi;
import com.yandex.payment.divkit.bind.BindType;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.bind.view.DKCardContainer;
import com.yandex.payment.divkit.bind.view.DKCardInputViewImpl;
import com.yandex.payment.divkit.usecases.d;
import com.yandex.payment.sdk.core.data.CardId;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.CardValidationConfig;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.datasource.bind.interfaces.CardButtonTitle;
import com.yandex.payment.sdk.nfcscanner.tools.c;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.payment.sdk.ui.CardInputView;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.yandex.xplat.payment.sdk.Scenario;
import defpackage.a5f;
import defpackage.abe;
import defpackage.arf;
import defpackage.brf;
import defpackage.c98;
import defpackage.cg8;
import defpackage.cnk;
import defpackage.cof;
import defpackage.crf;
import defpackage.d98;
import defpackage.dke;
import defpackage.dpa0;
import defpackage.drf;
import defpackage.dzf;
import defpackage.e98;
import defpackage.eja1;
import defpackage.es31;
import defpackage.evu0;
import defpackage.f98;
import defpackage.fl10;
import defpackage.frf;
import defpackage.grf;
import defpackage.gtf;
import defpackage.hh5;
import defpackage.hs31;
import defpackage.htf;
import defpackage.hu31;
import defpackage.i3y;
import defpackage.i891;
import defpackage.in8;
import defpackage.iu31;
import defpackage.j9f;
import defpackage.jhq0;
import defpackage.jl40;
import defpackage.jn8;
import defpackage.kl41;
import defpackage.kn8;
import defpackage.krf;
import defpackage.ll41;
import defpackage.ln8;
import defpackage.lrf;
import defpackage.m93;
import defpackage.ml41;
import defpackage.mn8;
import defpackage.mrf;
import defpackage.mta1;
import defpackage.n891;
import defpackage.ncq0;
import defpackage.nl41;
import defpackage.nn8;
import defpackage.nrf;
import defpackage.nx;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.o400;
import defpackage.o560;
import defpackage.omk;
import defpackage.ong0;
import defpackage.p560;
import defpackage.pg8;
import defpackage.pm5;
import defpackage.prf;
import defpackage.pv5;
import defpackage.px90;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.qu5;
import defpackage.qv90;
import defpackage.r891;
import defpackage.raq0;
import defpackage.rs31;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sae;
import defpackage.sjh;
import defpackage.sls;
import defpackage.sr4;
import defpackage.ss8;
import defpackage.sv90;
import defpackage.tc5;
import defpackage.tje;
import defpackage.tue0;
import defpackage.tyh0;
import defpackage.u131;
import defpackage.u2l;
import defpackage.ujk;
import defpackage.uu5;
import defpackage.uv90;
import defpackage.uvq;
import defpackage.uyj;
import defpackage.uyv;
import defpackage.vfc;
import defpackage.vv5;
import defpackage.vv90;
import defpackage.vvb1;
import defpackage.vyv;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wga0;
import defpackage.xl10;
import defpackage.xxk;
import defpackage.y22;
import defpackage.y8f;
import defpackage.yhl;
import defpackage.yv90;
import defpackage.zbq0;
import defpackage.zmk;
import defpackage.zy11;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000À\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 ¶\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004·\u0001¸\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\u0005J!\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010-\u001a\u00020,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0005J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020/H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\b2\u0006\u0010#\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u00105\u001a\u00020/H\u0002¢\u0006\u0004\b5\u00101J\u0017\u0010<\u001a\u00020\b2\u0006\u0010#\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\b2\u0006\u0010#\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\b2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010#\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\b2\u0006\u0010#\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010GJ\u0017\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u001fH\u0002¢\u0006\u0004\bM\u0010!J\u000f\u0010N\u001a\u00020\bH\u0002¢\u0006\u0004\bN\u0010\u0005J\u000f\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010s\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010z\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R \u0010¢\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010^\u001a\u0006\b \u0001\u0010¡\u0001R*\u0010¤\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R \u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b«\u0001\u0010^\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010¯\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010±\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010°\u0001R\u0019\u0010²\u0001\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010°\u0001R\u0017\u0010µ\u0001\u001a\u00020h8BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001¨\u0006¹\u0001"}, d2 = {"Lcom/yandex/payment/divkit/bind/DKBindCardFragment;", "Landroidx/fragment/app/Fragment;", "Luu5;", "Ltue0;", "<init>", "()V", "Larf;", "callbacks", "Lzy11;", "setBindCallback", "(Larf;)V", "Lgtf;", "setPreselectCallback", "(Lgtf;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/yandex/payment/sdk/core/data/PaymentToken;", "paymentToken", "Lraq0;", "continuePaying", "(Lcom/yandex/payment/sdk/core/data/PaymentToken;Lraq0;)V", "Lhtf;", ClidProvider.STATE, "setExternalButtonState", "(Lhtf;)V", "showSelectFragment", "Lnrf;", "currentCallback", "setupInput", "(Lnrf;Landroid/os/Bundle;)V", "Lcom/yandex/payment/sdk/ui/CardInput$State;", "", "toDivState", "(Lcom/yandex/payment/sdk/ui/CardInput$State;)Ljava/lang/String;", "", "startPaymentAfterSelect", "()Z", "observeSaveCardFlag", "setButtonText", "observeLiveData", "isLoading", "setScreenLoadingState", "(Z)V", "Lf98;", "setButtonState", "(Lf98;)V", "Lnn8;", "setScreenState", "(Lnn8;)V", "Lin8;", "setTerminalErrorState", "(Lin8;)V", "Luyv;", "inputErrorState", "setNonTerminalErrorState", "(Luyv;)V", "Lnl41;", "setWebViewState", "(Lnl41;)V", "setPreselectWebViewState", "Lcnk;", "divData", "observeDivData", "(Lcnk;)V", "continuePayingInternal", "listenNfcState", "Lcom/yandex/payment/sdk/nfcscanner/tools/c;", "requestController", "()Lcom/yandex/payment/sdk/nfcscanner/tools/c;", "Lcom/yandex/payment/divkit/bind/DKButtonLoadingAnimatedView;", "animatedView", "Lcom/yandex/payment/divkit/bind/DKButtonLoadingAnimatedView;", "Lcom/yandex/payment/sdk/ui/CardInputView;", "cardInput", "Lcom/yandex/payment/sdk/ui/CardInputView;", "bindCallbacks", "Larf;", "preselectCallbacks", "Lgtf;", "Ltc5;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Ltc5;", "activityViewModel", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Ldpa0;", "_binding", "Ldpa0;", "Lnx;", "actionFlowReceiver", "Lnx;", "getActionFlowReceiver", "()Lnx;", "setActionFlowReceiver", "(Lnx;)V", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lu2l;", "parsingEnvironment", "Lu2l;", "getParsingEnvironment", "()Lu2l;", "setParsingEnvironment", "(Lu2l;)V", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Lvv90;", "paymentApi", "Lvv90;", "getPaymentApi", "()Lvv90;", "setPaymentApi", "(Lvv90;)V", "Luvq;", "fitchBindScreenUseCase", "Luvq;", "getFitchBindScreenUseCase", "()Luvq;", "setFitchBindScreenUseCase", "(Luvq;)V", "Lcg8;", "cardInputBridge", "Lcg8;", "Lcom/yandex/payment/divkit/bind/BindType;", "bindType", "Lcom/yandex/payment/divkit/bind/BindType;", "Lcom/yandex/payment/sdk/ui/CardInputMode;", "cardInputMode", "Lcom/yandex/payment/sdk/ui/CardInputMode;", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "Lhu31;", "viewReadyObservable", "Lhu31;", "getViewReadyObservable", "()Lhu31;", "setViewReadyObservable", "(Lhu31;)V", "Lcom/yandex/payment/divkit/bind/b;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/payment/divkit/bind/b;", "viewModel", "isNfcAdapterEnabled", "Z", "isNfcFlagEnabled", "isCardScannerEnabled", "getBinding", "()Ldpa0;", "binding", "Companion", "FixupOnLayoutChangeListener", "com/yandex/payment/divkit/bind/a", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKBindCardFragment extends Fragment implements uu5, tue0 {
    private static final String ARG_BIND_TYPE = "ARG_BIND_TYPE";
    public static final String BACK = "back";
    public static final String BACK_BUTTON_VISIBILITY_VARIABLE_NAME = "card_input_screen_back_button_div_state";
    public static final String BLUR_VISIBILITY_VARIABLE_NAME = "card_input_screen_anim_div_state";
    public static final String BUTTON_STATE_VARIABLE_NAME = "card_input_screen_button_state";
    public static final String CHECKBOX = "checkbox";
    public static final String CLOSE = "close";
    public static final String CONTINUE = "continue";
    public static final a Companion = new a();
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
    private BindType bindType;
    private CardInputView cardInput;
    private cg8 cardInputBridge;
    private CardInputMode cardInputMode;
    private Div2View div2View;
    public ujk divConfiguration;
    public rwo eventReporter;
    public uvq fitchBindScreenUseCase;
    private boolean isCardScannerEnabled;
    private boolean isNfcAdapterEnabled;
    private boolean isNfcFlagEnabled;
    private View.OnLayoutChangeListener layoutChangeListener;
    public u2l parsingEnvironment;
    public vv90 paymentApi;
    private gtf preselectCallbacks;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    public hu31 viewReadyObservable;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = kotlin.a.a(new brf(this, 0));

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext = kotlin.a.a(new brf(this, 1));

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/payment/divkit/bind/DKBindCardFragment$FixupOnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/ViewGroup;", "target", "<init>", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "Landroid/view/ViewGroup;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.payment.divkit.bind.DKBindCardFragment$special$$inlined$viewModels$default$1] */
    public DKBindCardFragment() {
        brf brfVar = new brf(this, 4);
        final ?? r1 = new sls(this) { // from class: com.yandex.payment.divkit.bind.DKBindCardFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.payment.divkit.bind.DKBindCardFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.payment.divkit.bind.DKBindCardFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, brfVar, new sls() { // from class: com.yandex.payment.divkit.bind.DKBindCardFragment$special$$inlined$viewModels$default$4
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
    public static final tc5 activityViewModel_delegate$lambda$0(DKBindCardFragment dKBindCardFragment) {
        tc5 activityViewModel;
        arf arfVar = dKBindCardFragment.bindCallbacks;
        if (arfVar == null || (activityViewModel = arfVar.a()) == null) {
            gtf gtfVar = dKBindCardFragment.preselectCallbacks;
            activityViewModel = gtfVar != null ? ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).a.getActivityViewModel() : null;
        }
        if (activityViewModel != null) {
            return activityViewModel;
        }
        ny61.r("ViewModel is null, callback isn`t provided");
        return null;
    }

    private final void continuePayingInternal(PaymentToken paymentToken, raq0 callbacks) {
        b viewModel = getViewModel();
        if (viewModel.Q && viewModel.G == CardInput$State.CARD_DETAILS_VALID) {
            ((yv90) ((zbq0) callbacks).k()).i(paymentToken, null, new grf(callbacks));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(DKBindCardFragment dKBindCardFragment) {
        return new Div2Context(dKBindCardFragment.requireActivity(), dKBindCardFragment.getDivConfiguration(), 0, dKBindCardFragment.getViewLifecycleOwner(), 4, null);
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
    public final b getViewModel() {
        return (b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoading() {
        b viewModel = getViewModel();
        return jl40.l((!viewModel.P ? viewModel.z ? viewModel.M : viewModel.W().l : viewModel.X().k).d(), kn8.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void listenNfcState() {
        p s = eja1.s(getViewLifecycleOwner());
        sjh sjhVar = uyj.a;
        tje.N(s, o400.a, null, new DKBindCardFragment$listenNfcState$1(this, null), 2);
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
            div2View4.post(new j9f(9, divData, this));
        }
        rwo eventReporter = getEventReporter();
        sv90 sv90Var = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.DK_BIND;
        sv90Var.getClass();
        ((y22) eventReporter).a(sv90.w0(psdkScreen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1(cnk cnkVar, final DKBindCardFragment dKBindCardFragment) {
        for (Pair pair : cnkVar.b) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKBindCardFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
        if (dKBindCardFragment.isNfcAdapterEnabled && dKBindCardFragment.isNfcFlagEnabled) {
            Div2View div2View2 = dKBindCardFragment.div2View;
            if (div2View2 != null) {
                final int i = 0;
                div2View2.post(new Runnable(dKBindCardFragment) { // from class: erf
                    public final /* synthetic */ DKBindCardFragment b;

                    {
                        this.b = dKBindCardFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = i;
                        DKBindCardFragment dKBindCardFragment2 = this.b;
                        switch (i2) {
                            case 0:
                                DKBindCardFragment.observeDivData$lambda$1$1(dKBindCardFragment2);
                                break;
                            default:
                                DKBindCardFragment.observeDivData$lambda$1$2(dKBindCardFragment2);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        Div2View div2View3 = dKBindCardFragment.div2View;
        if (div2View3 != null) {
            final int i2 = 1;
            div2View3.post(new Runnable(dKBindCardFragment) { // from class: erf
                public final /* synthetic */ DKBindCardFragment b;

                {
                    this.b = dKBindCardFragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    DKBindCardFragment dKBindCardFragment2 = this.b;
                    switch (i22) {
                        case 0:
                            DKBindCardFragment.observeDivData$lambda$1$1(dKBindCardFragment2);
                            break;
                        default:
                            DKBindCardFragment.observeDivData$lambda$1$2(dKBindCardFragment2);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1$1(DKBindCardFragment dKBindCardFragment) {
        Div2View div2View = dKBindCardFragment.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_nfc_visibility", "visible");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1$2(DKBindCardFragment dKBindCardFragment) {
        Div2View div2View = dKBindCardFragment.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_nfc_visibility", "gone");
        }
    }

    private final void observeLiveData() {
        tje.N(eja1.s(this), null, null, new DKBindCardFragment$observeLiveData$1(this, null), 3);
        tje.N(eja1.s(this), null, null, new DKBindCardFragment$observeLiveData$2(this, null), 3);
        b viewModel = getViewModel();
        int i = 1;
        (!viewModel.P ? viewModel.z ? viewModel.M : viewModel.W().l : viewModel.X().k).f(getViewLifecycleOwner(), new cof(i, new crf(this, 9)));
        getViewModel().A.f(getViewLifecycleOwner(), new cof(i, new crf(this, 10)));
        b viewModel2 = getViewModel();
        (!viewModel2.P ? viewModel2.z ? viewModel2.N : viewModel2.W().m : viewModel2.X().l).f(getViewLifecycleOwner(), new cof(i, new crf(this, 11)));
        b viewModel3 = getViewModel();
        (!viewModel3.P ? viewModel3.z ? viewModel3.O : viewModel3.W().n : viewModel3.X().m).f(getViewLifecycleOwner(), new cof(i, new crf(this, 0)));
        getViewModel().B.f(getViewLifecycleOwner(), new cof(i, new crf(this, i)));
        getViewModel().C.f(getViewLifecycleOwner(), new cof(i, new crf(this, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$0(DKBindCardFragment dKBindCardFragment, nn8 nn8Var) {
        dKBindCardFragment.setScreenState(nn8Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$1(DKBindCardFragment dKBindCardFragment, Boolean bool) {
        dKBindCardFragment.setScreenLoadingState(bool.booleanValue());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$2(DKBindCardFragment dKBindCardFragment, f98 f98Var) {
        dKBindCardFragment.setButtonState(f98Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$3(DKBindCardFragment dKBindCardFragment, nl41 nl41Var) {
        dKBindCardFragment.setWebViewState(nl41Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$4(DKBindCardFragment dKBindCardFragment, nl41 nl41Var) {
        dKBindCardFragment.setPreselectWebViewState(nl41Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeLiveData$lambda$5(DKBindCardFragment dKBindCardFragment, nn8 nn8Var) {
        dKBindCardFragment.setScreenState(nn8Var);
        return zy11.a;
    }

    private final void observeSaveCardFlag() {
        getViewModel().D.f(getViewLifecycleOwner(), new cof(1, new crf(this, 8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 observeSaveCardFlag$lambda$0(DKBindCardFragment dKBindCardFragment, Boolean bool) {
        Scenario d;
        CardInputView cardInputView;
        cg8 cg8Var = dKBindCardFragment.cardInputBridge;
        if (cg8Var != null && (cardInputView = cg8Var.b) != null) {
            cardInputView.setSaveCardOnPayment(bool.booleanValue());
        }
        CardInputView cardInputView2 = dKBindCardFragment.cardInput;
        if (cardInputView2 != null) {
            cardInputView2.setSaveCardOnPayment(bool.booleanValue());
        }
        CardInputMode cardInputMode = dKBindCardFragment.cardInputMode;
        if (cardInputMode != null && (d = r891.d(cardInputMode)) != null) {
            rwo eventReporter = dKBindCardFragment.getEventReporter();
            sv90 sv90Var = qv90.a;
            boolean booleanValue = bool.booleanValue();
            sv90Var.getClass();
            ((y22) eventReporter).a(sv90.b(booleanValue, d, false));
        }
        String str = bool.booleanValue() ? "true" : "false";
        Div2View div2View = dKBindCardFragment.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_checkbox_value", str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(DKBindCardFragment dKBindCardFragment) {
        gtf gtfVar = dKBindCardFragment.preselectCallbacks;
        if (gtfVar != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).t(null);
        }
        gtf gtfVar2 = dKBindCardFragment.preselectCallbacks;
        if (gtfVar2 != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar2).r();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(DKBindCardFragment dKBindCardFragment) {
        dKBindCardFragment.showSelectFragment();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(DKBindCardFragment dKBindCardFragment, jhq0 jhq0Var) {
        gtf gtfVar = dKBindCardFragment.preselectCallbacks;
        if (gtfVar != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar).m(jhq0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(DKBindCardFragment dKBindCardFragment, PaymentMethod paymentMethod) {
        if (dKBindCardFragment.preselectCallbacks != null) {
            o3a0.e.a(paymentMethod);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c requestController() {
        b viewModel = getViewModel();
        viewModel.getClass();
        krf krfVar = new krf(viewModel);
        c cVar = viewModel.K;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(krfVar);
        viewModel.K = cVar2;
        return cVar2;
    }

    private final void setButtonState(f98 state) {
        Scenario d;
        Div2View div2View;
        Div2View div2View2;
        Div2View div2View3;
        if (state instanceof e98) {
            arf arfVar = this.bindCallbacks;
            if (arfVar != null) {
                arfVar.n(false);
                return;
            }
            return;
        }
        if (state instanceof c98) {
            CardButtonTitle cardButtonTitle = ((c98) state).a;
            if (cardButtonTitle == CardButtonTitle.ShowNext && (div2View3 = this.div2View) != null) {
                div2View3.setVariable("card_input_screen_button_state", toDivState(CardInput$State.CARD_NUMBER));
            }
            if (cardButtonTitle != CardButtonTitle.ShowProcess || (div2View2 = this.div2View) == null) {
                return;
            }
            div2View2.setVariable("card_input_screen_button_state", toDivState(CardInput$State.CARD_DETAILS));
            return;
        }
        if (!(state instanceof d98)) {
            w511.b();
            return;
        }
        CardButtonTitle cardButtonTitle2 = ((d98) state).a;
        if (cardButtonTitle2 == CardButtonTitle.ShowNext && (div2View = this.div2View) != null) {
            div2View.setVariable("card_input_screen_button_state", "continue");
        }
        if (cardButtonTitle2 == CardButtonTitle.ShowProcess) {
            CardInputMode cardInputMode = this.cardInputMode;
            if (cardInputMode != null && (d = r891.d(cardInputMode)) != null) {
                rwo eventReporter = getEventReporter();
                qv90.a.getClass();
                ((y22) eventReporter).a(sv90.u(d));
            }
            Div2View div2View4 = this.div2View;
            if (div2View4 != null) {
                div2View4.setVariable("card_input_screen_button_state", "continue");
            }
        }
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
            arf arfVar = this.bindCallbacks;
            if (arfVar != null) {
                arfVar.m();
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
            arf arfVar2 = this.bindCallbacks;
            if (arfVar2 != null) {
                arfVar2.c(((ln8) state).a);
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
        if (state instanceof in8) {
            in8 in8Var = (in8) state;
            PaymentKitError paymentKitError = in8Var.a;
            if (paymentKitError.getKind6_6_0() == PaymentKitError.Kind6_6_0.warning) {
                setNonTerminalErrorState(new uyv(paymentKitError.getMessage()));
                return;
            } else {
                setTerminalErrorState(in8Var);
                return;
            }
        }
        if (!(state instanceof mn8)) {
            w511.b();
            return;
        }
        BindType bindType = this.bindType;
        if (!n891.p(bindType != null ? Boolean.valueOf(bindType.getIsPaymentContext()) : null)) {
            yhl.d(state, "Illegal model state ");
            return;
        }
        gtf gtfVar3 = this.preselectCallbacks;
        if (gtfVar3 != null) {
            ((com.yandex.payment.sdk.ui.preselect.a) gtfVar3).f();
        }
        arf arfVar3 = this.bindCallbacks;
        if (arfVar3 != null) {
            arfVar3.f();
        }
        arf arfVar4 = this.bindCallbacks;
        if (arfVar4 != null) {
            arfVar4.x();
            arfVar4.r(n891.q(Integer.valueOf(ryh0.paymentsdk_success_title)));
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
        BindType bindType = this.bindType;
        boolean o = n891.o(bindType != null ? Boolean.valueOf(bindType.getIsPaymentContext()) : null);
        arf arfVar2 = this.bindCallbacks;
        if (o) {
            if (arfVar2 != null) {
                arfVar2.q(state.a);
            }
        } else if (arfVar2 != null) {
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

    private final void setupInput(nrf currentCallback, Bundle savedInstanceState) {
        CardInputView cardInputView;
        BindType bindType = this.bindType;
        boolean y = bindType instanceof BindType.OnlyBind ? currentCallback.y() : bindType instanceof BindType.BindAndPay ? currentCallback.g() : false;
        DKCardInputViewImpl dKCardInputViewImpl = new DKCardInputViewImpl(new ContextThemeWrapper(getContext(), currentCallback.i()), null, 0, 6, null);
        CardInputMode cardInputMode = this.cardInputMode;
        if (cardInputMode == null) {
            ny61.r("Required value was null.");
            return;
        }
        CardValidationConfig o = currentCallback.o();
        BindType bindType2 = this.bindType;
        BindType.OnlyBind onlyBind = bindType2 instanceof BindType.OnlyBind ? (BindType.OnlyBind) bindType2 : null;
        dKCardInputViewImpl.setup(cardInputMode, o, onlyBind != null ? onlyBind.provideScanner(this) : null, getEventReporter(), currentCallback.s(), y, this.isCardScannerEnabled);
        dKCardInputViewImpl.setPaymentApi(currentCallback.k());
        CardInputMode cardInputMode2 = this.cardInputMode;
        if (cardInputMode2 == null) {
            ny61.r("Required value was null.");
            return;
        }
        cg8 cg8Var = new cg8(cardInputMode2);
        this.cardInputBridge = cg8Var;
        cg8Var.a(dKCardInputViewImpl);
        cg8 cg8Var2 = this.cardInputBridge;
        if (cg8Var2 != null && (cardInputView = cg8Var2.b) != null) {
            cardInputView.setSaveCardOnPayment(true);
        }
        dKCardInputViewImpl.setSaveCardOnPayment(true);
        dKCardInputViewImpl.setHelpCallback(new dke(7, currentCallback, this));
        dKCardInputViewImpl.setCardPaymentSystemListener(new crf(this, 3));
        dKCardInputViewImpl.setMaskedCardNumberListener(new crf(this, 4));
        dKCardInputViewImpl.setOnStateChangeListener(new a5f(21));
        dKCardInputViewImpl.setFragmentOnStateChangeListener(new drf(this, dKCardInputViewImpl));
        dKCardInputViewImpl.setInputErrorListener(new crf(this, 5));
        if (savedInstanceState == null) {
            dKCardInputViewImpl.focusInput();
        }
        this.cardInput = dKCardInputViewImpl;
        ((iu31) getViewReadyObservable()).a = new drf(dKCardInputViewImpl, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInput$lambda$1$0(nrf nrfVar, DKBindCardFragment dKBindCardFragment, int i) {
        nrfVar.z(new TextRes.StringText(dKBindCardFragment.getString(tyh0.paymentsdk_divkit_cvv_help_text, String.valueOf(i))), null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInput$lambda$1$1(DKBindCardFragment dKBindCardFragment, CardPaymentSystem cardPaymentSystem) {
        dKBindCardFragment.getViewModel().F = cardPaymentSystem;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInput$lambda$1$2(DKBindCardFragment dKBindCardFragment, String str) {
        dKBindCardFragment.getViewModel().getClass();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInput$lambda$1$3(CardInput$State cardInput$State) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInput$lambda$1$4(DKBindCardFragment dKBindCardFragment, prf prfVar, CardInput$State cardInput$State) {
        Div2View div2View = dKBindCardFragment.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_button_state", dKBindCardFragment.toDivState(cardInput$State));
        }
        b viewModel = dKBindCardFragment.getViewModel();
        viewModel.G = cardInput$State;
        if (cardInput$State == CardInput$State.CARD_DETAILS_VALID && viewModel.Q) {
            NewCard newCard = prfVar.getNewCard();
            if (newCard == null) {
                ny61.r("Valid card state without card number");
                return null;
            }
            PaymentMethod paymentMethod = vvb1.v(newCard).a;
            if (!jl40.l(viewModel.E, paymentMethod)) {
                viewModel.E = paymentMethod;
                crf crfVar = viewModel.J;
                if (crfVar != null) {
                    crfVar.invoke(paymentMethod);
                }
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInput$lambda$1$5(DKBindCardFragment dKBindCardFragment, vyv vyvVar) {
        Div2View div2View = dKBindCardFragment.div2View;
        if (div2View != null) {
            div2View.setVariable("card_input_screen_error_state", vyvVar.a);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInput$lambda$2(DKCardInputViewImpl dKCardInputViewImpl, DKBindCardFragment dKBindCardFragment, View view) {
        if (view instanceof DKCardContainer) {
            ((ViewGroup) view).addView(dKCardInputViewImpl);
        } else if (view instanceof DKButtonLoadingAnimatedView) {
            dKBindCardFragment.animatedView = (DKButtonLoadingAnimatedView) view;
        }
        return zy11.a;
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

    private final boolean startPaymentAfterSelect() {
        BindType bindType = this.bindType;
        BindType.PreselectBindAndPay preselectBindAndPay = bindType instanceof BindType.PreselectBindAndPay ? (BindType.PreselectBindAndPay) bindType : null;
        return n891.o(preselectBindAndPay != null ? Boolean.valueOf(preselectBindAndPay.getStartPaymentAfterSelect()) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String toDivState(CardInput$State cardInput$State) {
        boolean z;
        int i;
        nrf nrfVar = this.bindCallbacks;
        if (nrfVar == null) {
            nrfVar = this.preselectCallbacks;
        }
        boolean z2 = false;
        if (nrfVar != null) {
            CardInputMode cardInputMode = this.cardInputMode;
            int i2 = cardInputMode == null ? -1 : frf.a[cardInputMode.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    z = nrfVar.y();
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    z = nrfVar.g();
                }
                if (getViewModel().F == CardPaymentSystem.MIR && z) {
                    z2 = true;
                }
                i = frf.b[cardInput$State.ordinal()];
                if (i != 1) {
                    return "number";
                }
                if (i == 2) {
                    return z2 ? MetaDataField.DATE_FIELD : "date_cvv";
                }
                if (i == 3) {
                    return "continue";
                }
                if (i == 4) {
                    return startPaymentAfterSelect() ? "pay" : "continue";
                }
                w511.b();
                return null;
            }
        }
        z = false;
        if (getViewModel().F == CardPaymentSystem.MIR) {
            z2 = true;
        }
        i = frf.b[cardInput$State.ordinal()];
        if (i != 1) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$0(DKBindCardFragment dKBindCardFragment) {
        return new ss8(2, dKBindCardFragment.getFitchBindScreenUseCase(), dKBindCardFragment.getEventReporter(), dKBindCardFragment.getPaymentApi());
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
        BindType bindType = (BindType) requireArguments().getParcelable(ARG_BIND_TYPE);
        this.bindType = bindType;
        if (bindType != null) {
            this.isNfcFlagEnabled = bindType.getIsNfcEnabled();
            this.isCardScannerEnabled = bindType.getIsCardScannerEnabled();
        }
        BindType bindType2 = this.bindType;
        this.cardInputMode = bindType2 instanceof BindType.OnlyBind ? CardInputMode.BindOnly : bindType2 instanceof BindType.BindAndPay ? CardInputMode.PayAndBind : bindType2 instanceof BindType.PreselectBindAndPay ? ((BindType.PreselectBindAndPay) bindType2).getStartPaymentAfterSelect() ? CardInputMode.PayAndBind : CardInputMode.BindOnly : null;
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
        if (this.isNfcFlagEnabled) {
            getLifecycle().a(requestController());
            c requestController = requestController();
            if (!requestController.x) {
                requestController.x = true;
                NfcAdapter nfcAdapter = requestController.y;
                if (nfcAdapter != null) {
                    nfcAdapter.enableReaderMode(requestController.w, requestController.D, HProv.PP_FAST_CODE, new Bundle(0));
                }
            }
            tje.N(eja1.s(this), uyj.a, null, new DKBindCardFragment$onCreateView$2(this, null), 2);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [gtf] */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.fragment.app.Fragment, com.yandex.payment.divkit.bind.DKBindCardFragment] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Scenario d;
        super.onViewCreated(view, savedInstanceState);
        int i = 1;
        boolean h = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        int i2 = 0;
        getDivContext().getDivVariableController().i(new u131("isLightTheme", h));
        vv5 vv5Var = BindType.Companion;
        BindType bindType = this.bindType;
        vv5Var.getClass();
        arf arfVar = bindType instanceof BindType.PreselectBindAndPay ? this.preselectCallbacks : this.bindCallbacks;
        this.layoutChangeListener = new FixupOnLayoutChangeListener(getBinding().a);
        ConstraintLayout constraintLayout = getBinding().a;
        View.OnLayoutChangeListener onLayoutChangeListener = this.layoutChangeListener;
        if (onLayoutChangeListener == null) {
            onLayoutChangeListener = null;
        }
        constraintLayout.addOnLayoutChangeListener(onLayoutChangeListener);
        int i3 = 2;
        getViewModel().H = new brf(this, i3);
        if (arfVar != null) {
            setupInput(arfVar, savedInstanceState);
            b viewModel = getViewModel();
            BindType bindType2 = this.bindType;
            px90 F = arfVar.F();
            CardInputView cardInputView = this.cardInput;
            if (cardInputView == null) {
                ny61.r("Required value was null.");
                return;
            }
            uv90 A = arfVar.A();
            viewModel.A.m(Boolean.TRUE);
            if (bindType2 instanceof BindType.OnlyBind) {
                String verifyCardId = ((BindType.OnlyBind) bindType2).getVerifyCardId();
                viewModel.P = false;
                if (verifyCardId == null || evu0.J(verifyCardId)) {
                    viewModel.Y(h, false, false, false);
                    viewModel.z = false;
                    viewModel.W().h = new sae(13, viewModel);
                    qu5 W = viewModel.W();
                    W.getClass();
                    W.a(cardInputView, new pm5(i, W), new sr4(8, W), new hh5(4, W));
                    F.a = viewModel.W().b;
                    if (F.b != null) {
                        F.b = null;
                    }
                } else {
                    viewModel.z = true;
                    F.a = new pg8(i3, viewModel);
                    if (F.b != null) {
                        F.b = null;
                    }
                    viewModel.M.l(kn8.a);
                    viewModel.N.l(e98.a);
                    ((yv90) viewModel.w).j.f(new CardId(verifyCardId), new krf(viewModel));
                }
            } else if (bindType2 instanceof BindType.BindAndPay) {
                if (A == null) {
                    ny61.r("Required value was null.");
                    return;
                }
                BindType.BindAndPay bindAndPay = (BindType.BindAndPay) bindType2;
                boolean isBackButtonEnabled = bindAndPay.getIsBackButtonEnabled();
                boolean shouldShowSaveCard = bindAndPay.getShouldShowSaveCard();
                viewModel.P = true;
                viewModel.X().i = false;
                viewModel.Y(h, true, isBackButtonEnabled, shouldShowSaveCard);
                viewModel.X().i = true;
                viewModel.X().j = new lrf(A);
                p560 X = viewModel.X();
                X.getClass();
                X.a(cardInputView, new fl10(X), new o560(X), new xl10(X));
                F.a = viewModel.X().b;
                if (F.b != null) {
                    F.b = null;
                }
            } else if (bindType2 instanceof BindType.PreselectBindAndPay) {
                BindType.PreselectBindAndPay preselectBindAndPay = (BindType.PreselectBindAndPay) bindType2;
                boolean startPaymentAfterSelect = preselectBindAndPay.getStartPaymentAfterSelect();
                boolean isBackButtonEnabled2 = preselectBindAndPay.getIsBackButtonEnabled();
                viewModel.P = startPaymentAfterSelect;
                viewModel.Q = startPaymentAfterSelect;
                viewModel.Y(h, startPaymentAfterSelect, isBackButtonEnabled2, startPaymentAfterSelect);
                F.a = new mrf(i2, viewModel, cardInputView);
                if (F.b != null) {
                    F.b = null;
                }
            }
            arfVar.C();
        }
        b viewModel2 = getViewModel();
        brf brfVar = new brf(this, 3);
        crf crfVar = new crf(this, 6);
        crf crfVar2 = new crf(this, 7);
        viewModel2.H = brfVar;
        viewModel2.I = crfVar;
        viewModel2.J = crfVar2;
        observeLiveData();
        observeSaveCardFlag();
        setButtonText();
        CardInputMode cardInputMode = this.cardInputMode;
        if (cardInputMode != null && (d = r891.d(cardInputMode)) != null) {
            rwo eventReporter = getEventReporter();
            qv90.a.getClass();
            ((y22) eventReporter).a(sv90.x(d));
        }
        if (arfVar != null) {
            arfVar.n(false);
        }
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
