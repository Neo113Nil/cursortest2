package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput;

import android.R;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsResetReason;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoEventName;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.TextState;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.formatters.ExpirationDateFormatter;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.textwatchers.CardNumberTextWatcher;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.textwatchers.CvvTextWatcher;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.textwatchers.ExpirationDateTextWatcher;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.CardPanInputView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.DateExpiredInputView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.SecretCodeInputView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.abr;
import defpackage.b131;
import defpackage.bau0;
import defpackage.bvf0;
import defpackage.cbr;
import defpackage.ck8;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.cx7;
import defpackage.dau0;
import defpackage.ebr;
import defpackage.f5n;
import defpackage.fk8;
import defpackage.fv50;
import defpackage.gso;
import defpackage.gvu0;
import defpackage.hau0;
import defpackage.hk8;
import defpackage.ig8;
import defpackage.jg8;
import defpackage.jl40;
import defpackage.klk;
import defpackage.l8x;
import defpackage.lg8;
import defpackage.li3;
import defpackage.lk8;
import defpackage.mg8;
import defpackage.mof;
import defpackage.ng8;
import defpackage.ny61;
import defpackage.o400;
import defpackage.omh0;
import defpackage.pj8;
import defpackage.qhw0;
import defpackage.qk8;
import defpackage.sg8;
import defpackage.sjh;
import defpackage.sls;
import defpackage.t8;
import defpackage.tcc;
import defpackage.th91;
import defpackage.tje;
import defpackage.tk8;
import defpackage.tse;
import defpackage.ugh0;
import defpackage.uyj;
import defpackage.w511;
import defpackage.x031;
import defpackage.x9u0;
import defpackage.xb8;
import defpackage.xpb1;
import defpackage.yar;
import defpackage.yg5;
import defpackage.yz91;
import defpackage.z031;
import defpackage.z22;
import defpackage.z6q0;
import defpackage.z9u0;
import defpackage.zh5;
import defpackage.zj8;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002\u008a\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0010J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u000e*\u00020\u00002\u0006\u0010$\u001a\u00020\u001cH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020!H\u0002¢\u0006\u0004\b)\u0010*J#\u0010/\u001a\u00020\u000e2\b\b\u0001\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u0010J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0010J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u0010\u001fJ\u0017\u00105\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b7\u0010\u001fJ\u000f\u00108\u001a\u00020\u000eH\u0002¢\u0006\u0004\b8\u0010\u0010J\u000f\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u0010\u0010J\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u0010JE\u0010?\u001a\u00020\u000e2\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010;2\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010;2\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010;H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bA\u0010\u0010J\u000f\u0010B\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010\u0010J\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010\u0010J\u001f\u0010F\u001a\u00020E2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010;H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bH\u0010\u001fJ\u0013\u0010I\u001a\u00020-*\u00020\u001cH\u0002¢\u0006\u0004\bI\u0010JJ\u0013\u0010K\u001a\u00020-*\u00020\u001cH\u0002¢\u0006\u0004\bK\u0010JJ\u0013\u0010L\u001a\u00020-*\u00020\u001cH\u0002¢\u0006\u0004\bL\u0010JJ\u0013\u0010M\u001a\u00020-*\u00020\u001cH\u0002¢\u0006\u0004\bM\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010]R\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010uR\u0014\u0010w\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0080\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0085\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/CardInputMainView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lz22;", "analytics", "Landroid/content/Context;", "context", "Lxb8;", "cardBindingRepository", "Lig8;", "params", "Lzh5;", "variableController", "<init>", "(Lz22;Landroid/content/Context;Lxb8;Lig8;Lzh5;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lklk;", "actionHandler", "setActionHandler", "(Lklk;)V", "Lyg5;", "resolver", "setExpressionResolver", "(Lyg5;)V", "evaluateExpressions", "applyResolvedColors", "Lsg8;", ClidProvider.STATE, "render", "(Lsg8;)V", "startWaitingForBin", "", "cancelWaitingForBin", "()Z", "details", "highlightValidationErrors", "(Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/CardInputMainView;Lsg8;)V", "setInputsText", "isLocked", "setLocked", "(Z)V", "", "codeType", "", "customLabel", "setSecurityCodeType", "(ILjava/lang/String;)V", "switchToCardNumber", "switchToCardDetails", "updateCardNumberInput", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/contract/TextState;", "updateCardNumberTextState", "(Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/contract/TextState;)V", "updateCvvVisibility", "gainFocusExpirationDate", "gainFocusCvv", "gainFocusNumber", "Lkotlin/Function0;", "onCardEditDone", "onExpirationDateEditDone", "onCvvEditDone", "setEditorActions", "(Lsls;Lsls;Lsls;)V", "submitForm", "expandCardNumber", "collapseCardNumber", "action", "Landroid/widget/TextView$OnEditorActionListener;", "createNextActionListener", "(Lsls;)Landroid/widget/TextView$OnEditorActionListener;", "updateVariables", "toCardNumberInputState", "(Lsg8;)Ljava/lang/String;", "toDateInputState", "toCvvInputState", "toFullFormInputState", "Lig8;", "Lzh5;", "Lyar;", "binding", "Lyar;", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/CardPanInputView;", "cardNumberInput", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/CardPanInputView;", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/DateExpiredInputView;", "cardExpirationDateInput", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/DateExpiredInputView;", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/SecretCodeInputView;", "cardCvvInput", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/views/SecretCodeInputView;", "useDynamicPatterns", "Z", "Lhk8;", "cardNetworkPatternDictionary", "Lhk8;", "cachedStateForController", "Lsg8;", "Llk8;", "cardNetworkChecker", "Llk8;", "Ltk8;", "cardNumberFormatter", "Ltk8;", "Lfv50;", "networkImageFacade", "Lfv50;", "Lz6q0;", "securityCodeTypeStringFacade", "Lz6q0;", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/a;", "viewController", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/a;", "isExpandedNumber", "Landroidx/constraintlayout/widget/e;", "expandedConstrainSet", "Landroidx/constraintlayout/widget/e;", "collapsedCardInput", "collapsedCardInputWithoutCvv", "", "animationDuration", "J", "Ltse;", "scope", "Ltse;", "Ll8x;", "submitJob", "Ll8x;", "waitingJob", "expressionResolver", "Lyg5;", "resolvedTextColor", "Ljava/lang/Integer;", "resolvedPlaceholderColor", "resolvedTopLabelColor", "resolvedErrorTextColor", "Companion", "mg8", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardInputMainView extends ConstraintLayout {

    @Deprecated
    public static final String CARD_NUMBER_INPUT_STATE_VARIABLE = "js.TokenizationScreenState.cardNumberInputState";

    @Deprecated
    public static final String CVV_INPUT_STATE_VARIABLE = "js.TokenizationScreenState.cvvInputState";
    private static final mg8 Companion = new mg8();

    @Deprecated
    public static final String DATE_INPUT_STATE_VARIABLE = "js.TokenizationScreenState.dateInputState";

    @Deprecated
    public static final int DEFAULT_PADDING = 16;

    @Deprecated
    public static final String FULL_FORM_STATE_CARD_NUMBER_INPUT_IN_PROGRESS = "cardNumberInputInProgress";

    @Deprecated
    public static final String FULL_FORM_STATE_DATE_CVV_IN_PROGRESS = "dateCvvInputInProgress";

    @Deprecated
    public static final String FULL_FORM_STATE_SUBMITTED = "submitted";

    @Deprecated
    public static final String FULL_FORM_STATE_VARIABLE = "js.TokenizationScreenState.fullFormState";

    @Deprecated
    public static final String INPUT_STATE_COMPLETED = "completed";

    @Deprecated
    public static final String INPUT_STATE_EMPTY = "empty";

    @Deprecated
    public static final String INPUT_STATE_ERROR = "error";

    @Deprecated
    public static final String INPUT_STATE_FOCUSED = "focused";

    @Deprecated
    public static final String INPUT_STATE_FOCUSED_WITH_ERROR = "focusedWithError";

    @Deprecated
    public static final String LISTENER_KEY = "CARD_INPUT_VIEW_LISTENER";

    @Deprecated
    public static final int PAN_LAST_DIGITS_NUMBER = 4;

    @Deprecated
    public static final String PAYMENT_SYSTEM_LOADING_VARIABLE = "js.TokenizationScreenState.paymentSystemLoadingState";

    @Deprecated
    public static final String TOKENIZATION_SCREEN_STATE = "js.TokenizationScreenState";
    private final long animationDuration;
    private final yar binding;
    private final sg8 cachedStateForController;
    private final SecretCodeInputView cardCvvInput;
    private final DateExpiredInputView cardExpirationDateInput;
    private final lk8 cardNetworkChecker;
    private final hk8 cardNetworkPatternDictionary;
    private final tk8 cardNumberFormatter;
    private final CardPanInputView cardNumberInput;
    private final e collapsedCardInput;
    private final e collapsedCardInputWithoutCvv;
    private final e expandedConstrainSet;
    private yg5 expressionResolver;
    private boolean isExpandedNumber;
    private final fv50 networkImageFacade;
    private final ig8 params;
    private Integer resolvedErrorTextColor;
    private Integer resolvedPlaceholderColor;
    private Integer resolvedTextColor;
    private Integer resolvedTopLabelColor;
    private final tse scope;
    private final z6q0 securityCodeTypeStringFacade;
    private l8x submitJob;
    private final boolean useDynamicPatterns;
    private final zh5 variableController;
    private final a viewController;
    private l8x waitingJob;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView$5, reason: invalid class name */
    public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((CardInputMainView) this.receiver).gainFocusExpirationDate();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView$7, reason: invalid class name */
    public /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((CardInputMainView) this.receiver).submitForm();
            return zy11.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r7v22, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.util.ArrayList] */
    public CardInputMainView(z22 z22Var, Context context, xb8 xb8Var, ig8 ig8Var, zh5 zh5Var) {
        super(context);
        hk8 hk8Var;
        Map map;
        f5n f5nVar;
        f5n f5nVar2;
        ?? r7;
        this.params = ig8Var;
        this.variableController = zh5Var;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(omh0.finsdk_view_card_input_main, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i2 = ugh0.finsdkCardCvvInput;
        SecretCodeInputView secretCodeInputView = (SecretCodeInputView) cma1.O(i2, inflate);
        ExpirationDateFormatter expirationDateFormatter = null;
        ?? r12 = 0;
        if (secretCodeInputView != null) {
            i2 = ugh0.finsdkCardExpirationDateInput;
            DateExpiredInputView dateExpiredInputView = (DateExpiredInputView) cma1.O(i2, inflate);
            if (dateExpiredInputView != null) {
                i2 = ugh0.finsdkCardNumberInput;
                CardPanInputView cardPanInputView = (CardPanInputView) cma1.O(i2, inflate);
                if (cardPanInputView != null) {
                    this.binding = new yar(constraintLayout, constraintLayout, secretCodeInputView, dateExpiredInputView, cardPanInputView);
                    this.cardNumberInput = cardPanInputView;
                    this.cardExpirationDateInput = dateExpiredInputView;
                    this.cardCvvInput = secretCodeInputView;
                    boolean l = jl40.l(ig8Var.b, Boolean.TRUE);
                    this.useDynamicPatterns = l;
                    f5n f5nVar3 = ig8Var.e;
                    Map map2 = f5nVar3 != null ? f5nVar3.b : null;
                    if (!l || map2 == null || map2.isEmpty()) {
                        hk8Var = new hk8(i);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            pj8 pj8Var = (pj8) entry.getValue();
                            for (CardNetwork cardNetwork : CardNetwork.a()) {
                                if (jl40.l(cardNetwork.getStringCode(), str.toUpperCase(Locale.ROOT))) {
                                    List list = pj8Var.c;
                                    if (list != null) {
                                        List<ck8> list2 = list;
                                        r7 = new ArrayList(tcc.n(list2, 10));
                                        for (ck8 ck8Var : list2) {
                                            r7.add(new zj8(ck8Var.a, ck8Var.b));
                                        }
                                    } else {
                                        r7 = EmptyList.a;
                                    }
                                    arrayList.add(new Pair(cardNetwork, new fk8(pj8Var.e, r7, pj8Var.f, pj8Var.g)));
                                }
                            }
                            w511.i("Collection contains no element matching the predicate.");
                            throw null;
                        }
                        hk8Var = new hk8(b.s(arrayList));
                    }
                    this.cardNetworkPatternDictionary = hk8Var;
                    sg8 sg8Var = this.useDynamicPatterns ? xpb1.B : null;
                    this.cachedStateForController = sg8Var;
                    lk8 lk8Var = new lk8(hk8Var);
                    this.cardNetworkChecker = lk8Var;
                    tk8 tk8Var = new tk8(lk8Var);
                    this.cardNumberFormatter = tk8Var;
                    ig8 ig8Var2 = this.params;
                    fv50 fv50Var = new fv50((!this.useDynamicPatterns || (f5nVar2 = ig8Var2.e) == null) ? null : f5nVar2.b, ig8Var2.c, lk8Var);
                    this.networkImageFacade = fv50Var;
                    z6q0 z6q0Var = new z6q0((!this.useDynamicPatterns || (f5nVar = this.params.e) == null) ? null : f5nVar.b, lk8Var);
                    this.securityCodeTypeStringFacade = z6q0Var;
                    final int i3 = 1;
                    a aVar = new a(sg8Var, z22Var, xb8Var, hk8Var, lk8Var, this.params, fv50Var, z6q0Var, new jg8(this, i), new jg8(this, i3), this.variableController);
                    this.viewController = aVar;
                    this.isExpandedNumber = true;
                    e eVar = new e();
                    eVar.f(omh0.finsdk_view_card_input_main, context);
                    this.expandedConstrainSet = eVar;
                    e eVar2 = new e();
                    eVar2.f(omh0.finsdk_view_card_input_collapsed_card_pan, context);
                    this.collapsedCardInput = eVar2;
                    e eVar3 = new e();
                    eVar3.f(omh0.finsdk_view_card_input_collapsed_card_pan, context);
                    int i4 = 8;
                    eVar3.x(ugh0.finsdkCardCvvInput, 8);
                    eVar3.e(ugh0.finsdkCardNumberInput, 7);
                    eVar3.e(ugh0.finsdkCardExpirationDateInput, 7);
                    eVar3.e(ugh0.finsdkCardExpirationDateInput, 6);
                    eVar3.i(ugh0.finsdkCardNumberInput, 6, 0, 6);
                    eVar3.i(ugh0.finsdkCardNumberInput, 7, ugh0.finsdkCardExpirationDateInput, 6);
                    eVar3.i(ugh0.finsdkCardExpirationDateInput, 6, ugh0.finsdkCardNumberInput, 7);
                    eVar3.w(ugh0.finsdkCardExpirationDateInput, 6, (int) (16.0f * getResources().getDisplayMetrics().density));
                    this.collapsedCardInputWithoutCvv = eVar3;
                    this.animationDuration = getResources().getInteger(R.integer.config_longAnimTime);
                    qhw0 a = jl40.a();
                    sjh sjhVar = uyj.a;
                    this.scope = bvf0.a(cvw.U(a, o400.a));
                    boolean z = this.useDynamicPatterns;
                    f5n f5nVar4 = this.params.e;
                    Integer valueOf = (f5nVar4 == null || (map = f5nVar4.b) == null) ? null : Integer.valueOf(map.size());
                    f5n f5nVar5 = this.params.e;
                    Long valueOf2 = f5nVar5 != null ? Long.valueOf(f5nVar5.a) : null;
                    String a2 = DynamicBinInfoEventName.INIT_EVENT.a();
                    MapBuilder mapBuilder = new MapBuilder();
                    mapBuilder.put(BackendConfig.Restrictions.ENABLED, String.valueOf(z));
                    String num = valueOf != null ? valueOf.toString() : null;
                    if (num != null) {
                        mapBuilder.put("tovarish_networks_count", num);
                    }
                    String l2 = valueOf2 != null ? valueOf2.toString() : null;
                    if (l2 != null) {
                        mapBuilder.put("next_action_timeout_ms", l2);
                    }
                    yz91.c(z22Var, new li3(i4, a2, mapBuilder.j()), this.useDynamicPatterns);
                    abr binding = this.cardNumberInput.getBinding();
                    binding.d.addTextChangedListener(new CardNumberTextWatcher(aVar, tk8Var));
                    binding.f.setOnTouchListener(new t8(4, this));
                    DateExpiredInputView dateExpiredInputView2 = this.cardExpirationDateInput;
                    dateExpiredInputView2.setInputFilters();
                    int i5 = 2;
                    dateExpiredInputView2.getBinding().c.addTextChangedListener(new ExpirationDateTextWatcher(aVar, expirationDateFormatter, i5, r12 == true ? 1 : 0));
                    dateExpiredInputView2.getBinding().c.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: kg8
                        public final /* synthetic */ CardInputMainView b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z2) {
                            int i6 = i;
                            CardInputMainView cardInputMainView = this.b;
                            switch (i6) {
                                case 0:
                                    CardInputMainView.lambda$8$lambda$7(cardInputMainView, view, z2);
                                    break;
                                default:
                                    CardInputMainView.lambda$11$lambda$10(cardInputMainView, view, z2);
                                    break;
                            }
                        }
                    });
                    SecretCodeInputView secretCodeInputView2 = this.cardCvvInput;
                    secretCodeInputView2.updateLengthFilter();
                    secretCodeInputView2.getBinding();
                    SecretCodeInputView secretCodeInputView3 = this.cardCvvInput;
                    secretCodeInputView3.updateLengthFilter();
                    secretCodeInputView3.getBinding().c.addTextChangedListener(new CvvTextWatcher(aVar));
                    secretCodeInputView3.getBinding().c.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: kg8
                        public final /* synthetic */ CardInputMainView b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z2) {
                            int i6 = i3;
                            CardInputMainView cardInputMainView = this.b;
                            switch (i6) {
                                case 0:
                                    CardInputMainView.lambda$8$lambda$7(cardInputMainView, view, z2);
                                    break;
                                default:
                                    CardInputMainView.lambda$11$lambda$10(cardInputMainView, view, z2);
                                    break;
                            }
                        }
                    });
                    setEditorActions(new AnonymousClass5(0, this, CardInputMainView.class, "gainFocusExpirationDate", "gainFocusExpirationDate()V", 0), new jg8(this, i5), new AnonymousClass7(0, this, CardInputMainView.class, "submitForm", "submitForm()V", 0));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$12(CardInputMainView cardInputMainView) {
        if (((sg8) cardInputMainView.viewController.o.getValue()).l) {
            cardInputMainView.submitForm();
        } else {
            cardInputMainView.gainFocusCvv();
        }
        return zy11.a;
    }

    private final void applyResolvedColors() {
        Integer num = this.resolvedTextColor;
        Integer num2 = this.resolvedPlaceholderColor;
        Integer num3 = this.resolvedTopLabelColor;
        abr binding = this.cardNumberInput.getBinding();
        if (num3 != null) {
            binding.c.setTextColor(num3.intValue());
        }
        if (num != null) {
            int intValue = num.intValue();
            binding.d.setTextColor(intValue);
            binding.f.setTextColor(intValue);
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            binding.d.setHintTextColor(intValue2);
            binding.f.setHintTextColor(intValue2);
            binding.e.setTextColor(intValue2);
        }
        cbr binding2 = this.cardExpirationDateInput.getBinding();
        if (num3 != null) {
            binding2.b.setTextColor(num3.intValue());
        }
        if (num != null) {
            binding2.c.setTextColor(num.intValue());
        }
        if (num2 != null) {
            int intValue3 = num2.intValue();
            binding2.c.setHintTextColor(intValue3);
            binding2.d.setTextColor(intValue3);
        }
        ebr binding3 = this.cardCvvInput.getBinding();
        if (num3 != null) {
            binding3.b.setTextColor(num3.intValue());
        }
        if (num != null) {
            binding3.c.setTextColor(num.intValue());
        }
        if (num2 != null) {
            int intValue4 = num2.intValue();
            binding3.c.setHintTextColor(intValue4);
            binding3.d.setTextColor(intValue4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean cancelWaitingForBin() {
        l8x l8xVar = this.waitingJob;
        if (l8xVar == null) {
            return false;
        }
        l8xVar.a(null);
        this.waitingJob = null;
        return true;
    }

    private final void collapseCardNumber() {
        this.collapsedCardInput.b(this.binding.a);
        th91.f(this.binding.a, Long.valueOf(this.animationDuration));
    }

    private final TextView.OnEditorActionListener createNextActionListener(sls action) {
        return new lg8(0, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createNextActionListener$lambda$40(sls slsVar, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 || slsVar == null) {
            return true;
        }
        slsVar.invoke();
        return true;
    }

    private final void evaluateExpressions() {
        yg5 yg5Var = this.expressionResolver;
        if (yg5Var == null) {
            return;
        }
        this.resolvedTextColor = evaluateExpressions$resolveColorExpression(yg5Var, this.params.g);
        this.resolvedPlaceholderColor = evaluateExpressions$resolveColorExpression(yg5Var, this.params.f);
        this.resolvedTopLabelColor = evaluateExpressions$resolveColorExpression(yg5Var, this.params.h);
        this.resolvedErrorTextColor = evaluateExpressions$resolveColorExpression(yg5Var, this.params.i);
        applyResolvedColors();
    }

    private static final Integer evaluateExpressions$resolveColorExpression(yg5 yg5Var, String str) {
        if (str == null) {
            return null;
        }
        return yg5Var.resolveColor(str);
    }

    private final void expandCardNumber() {
        this.expandedConstrainSet.b(this.binding.a);
        th91.f(this.binding.a, Long.valueOf(this.animationDuration));
    }

    private final void gainFocusCvv() {
        this.cardCvvInput.gainFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gainFocusExpirationDate() {
        this.cardExpirationDateInput.gainFocus();
    }

    private final void gainFocusNumber() {
        CardPanInputView.gainFocus$features_bdui_release$default(this.cardNumberInput, false, 1, null);
    }

    private final void highlightValidationErrors(CardInputMainView cardInputMainView, sg8 sg8Var) {
        CardPanInputView cardPanInputView = cardInputMainView.cardNumberInput;
        TextView textView = cardPanInputView.getBinding().c;
        qk8 qk8Var = sg8Var.a;
        if (qk8Var.b) {
            b131 b131Var = qk8Var.c;
            if (b131Var instanceof x031) {
                cardPanInputView.showError$features_bdui_release();
                Integer num = cardInputMainView.resolvedErrorTextColor;
                if (num != null) {
                    textView.setTextColor(num.intValue());
                }
            } else {
                if (!(b131Var instanceof z031)) {
                    w511.b();
                    return;
                }
                cardPanInputView.hideError$features_bdui_release();
                Integer num2 = cardInputMainView.resolvedTopLabelColor;
                if (num2 != null) {
                    textView.setTextColor(num2.intValue());
                }
            }
        } else {
            cardPanInputView.hideError$features_bdui_release();
            Integer num3 = cardInputMainView.resolvedTopLabelColor;
            if (num3 != null) {
                textView.setTextColor(num3.intValue());
            }
        }
        DateExpiredInputView dateExpiredInputView = cardInputMainView.cardExpirationDateInput;
        TextView textView2 = dateExpiredInputView.getBinding().b;
        gso gsoVar = sg8Var.c;
        if (gsoVar.c) {
            b131 b131Var2 = gsoVar.d;
            if (b131Var2 instanceof x031) {
                dateExpiredInputView.showError();
                Integer num4 = cardInputMainView.resolvedErrorTextColor;
                if (num4 != null) {
                    textView2.setTextColor(num4.intValue());
                }
            } else {
                if (!(b131Var2 instanceof z031)) {
                    w511.b();
                    return;
                }
                dateExpiredInputView.hideError();
                Integer num5 = cardInputMainView.resolvedTopLabelColor;
                if (num5 != null) {
                    textView2.setTextColor(num5.intValue());
                }
            }
        } else {
            dateExpiredInputView.hideError();
            Integer num6 = cardInputMainView.resolvedTopLabelColor;
            if (num6 != null) {
                textView2.setTextColor(num6.intValue());
            }
        }
        SecretCodeInputView secretCodeInputView = cardInputMainView.cardCvvInput;
        TextView textView3 = secretCodeInputView.getBinding().b;
        if (!sg8Var.l) {
            mof mofVar = sg8Var.b;
            if (mofVar.b) {
                b131 b131Var3 = mofVar.c;
                if (b131Var3 instanceof x031) {
                    secretCodeInputView.showError();
                    Integer num7 = cardInputMainView.resolvedErrorTextColor;
                    if (num7 != null) {
                        textView3.setTextColor(num7.intValue());
                        return;
                    }
                    return;
                }
                if (!(b131Var3 instanceof z031)) {
                    w511.b();
                    return;
                }
                secretCodeInputView.hideError();
                Integer num8 = cardInputMainView.resolvedTopLabelColor;
                if (num8 != null) {
                    textView3.setTextColor(num8.intValue());
                    return;
                }
                return;
            }
        }
        Integer num9 = cardInputMainView.resolvedTopLabelColor;
        if (num9 != null) {
            textView3.setTextColor(num9.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$11$lambda$10(CardInputMainView cardInputMainView, View view, boolean z) {
        if (!z || ((sg8) cardInputMainView.viewController.o.getValue()).l) {
            return;
        }
        cardInputMainView.viewController.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$6$lambda$5(CardInputMainView cardInputMainView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        cardInputMainView.viewController.d();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$8$lambda$7(CardInputMainView cardInputMainView, View view, boolean z) {
        if (z) {
            cardInputMainView.viewController.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$13(CardInputMainView cardInputMainView, Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        zy11 zy11Var = zy11.a;
        if (str == null) {
            return zy11Var;
        }
        int hashCode = str.hashCode();
        if (hashCode != 348678395) {
            if (hashCode != 621927971) {
                if (hashCode == 771808583 && str.equals("dateCvvInputInProgress")) {
                    cardInputMainView.viewController.f();
                }
            } else if (str.equals("cardNumberInputInProgress")) {
                cardInputMainView.viewController.d();
            }
        } else if (str.equals("submitted")) {
            cardInputMainView.submitForm();
        }
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render(sg8 state) {
        synchronized (xpb1.A) {
            xpb1.B = state;
        }
        updateVariables(state);
        setInputsText(state);
        setLocked(state.j.a());
        setSecurityCodeType(state.h, state.i);
        updateCardNumberInput(state);
        hau0 hau0Var = state.j;
        if (hau0Var instanceof dau0) {
            updateCardNumberTextState(TextState.REGULAR);
            switchToCardNumber();
            gainFocusNumber();
        } else if (hau0Var instanceof bau0) {
            updateCardNumberTextState(TextState.MASKED);
            switchToCardDetails();
            gainFocusExpirationDate();
        } else if (hau0Var instanceof z9u0) {
            updateCardNumberTextState(TextState.MASKED);
            switchToCardDetails();
            if (!state.l) {
                gainFocusCvv();
            }
        } else if (!(hau0Var instanceof x9u0)) {
            w511.b();
            return;
        } else {
            updateCardNumberTextState(TextState.MASKED);
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
            switchToCardDetails();
        }
        updateCvvVisibility(state);
        highlightValidationErrors(this, state);
    }

    private final void setEditorActions(sls onCardEditDone, sls onExpirationDateEditDone, sls onCvvEditDone) {
        this.cardNumberInput.getBinding().d.setOnEditorActionListener(createNextActionListener(onCardEditDone));
        this.cardExpirationDateInput.getBinding().c.setOnEditorActionListener(createNextActionListener(onExpirationDateEditDone));
        this.cardCvvInput.getBinding().c.setOnEditorActionListener(createNextActionListener(onCvvEditDone));
    }

    public static /* synthetic */ void setEditorActions$default(CardInputMainView cardInputMainView, sls slsVar, sls slsVar2, sls slsVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = null;
        }
        if ((i & 2) != 0) {
            slsVar2 = null;
        }
        if ((i & 4) != 0) {
            slsVar3 = null;
        }
        cardInputMainView.setEditorActions(slsVar, slsVar2, slsVar3);
    }

    private final void setInputsText(sg8 state) {
        this.cardNumberInput.setCardNumberIfNew$features_bdui_release(state.a.a);
        this.cardExpirationDateInput.setTextIfNew$features_bdui_release(state.c.a);
        this.cardCvvInput.setTextIfNew$features_bdui_release(state.b.a);
    }

    private final void setLocked(boolean isLocked) {
        th91.g(this.binding.b, isLocked);
        this.cardNumberInput.setLocked$features_bdui_release(isLocked);
        this.cardCvvInput.setLocked(isLocked);
        this.cardExpirationDateInput.setLocked(isLocked);
    }

    private final void setSecurityCodeType(int codeType, String customLabel) {
        this.cardCvvInput.setSecurityCodeType(codeType, customLabel);
    }

    private final void startWaitingForBin() {
        l8x l8xVar = this.waitingJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.waitingJob = tje.N(this.scope, null, null, new CardInputMainView$startWaitingForBin$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitForm() {
        l8x l8xVar = this.submitJob;
        if (l8xVar == null || !l8xVar.isActive()) {
            l8x l8xVar2 = this.submitJob;
            if (l8xVar2 != null) {
                l8xVar2.a(null);
            }
            this.submitJob = tje.N(this.scope, null, null, new CardInputMainView$submitForm$1(this, null), 3);
        }
    }

    private final void switchToCardDetails() {
        if (this.isExpandedNumber) {
            this.isExpandedNumber = false;
            collapseCardNumber();
        }
    }

    private final void switchToCardNumber() {
        if (this.isExpandedNumber) {
            return;
        }
        this.isExpandedNumber = true;
        expandCardNumber();
    }

    private final String toCardNumberInputState(sg8 sg8Var) {
        qk8 qk8Var = sg8Var.a;
        hau0 hau0Var = sg8Var.j;
        if (qk8Var.c instanceof z031) {
            return "completed";
        }
        boolean z = qk8Var.b;
        return (z && (hau0Var instanceof dau0)) ? "focusedWithError" : z ? "error" : hau0Var instanceof dau0 ? "focused" : "empty";
    }

    private final String toCvvInputState(sg8 sg8Var) {
        boolean z = sg8Var.l;
        hau0 hau0Var = sg8Var.j;
        if (z) {
            return "empty";
        }
        mof mofVar = sg8Var.b;
        if (mofVar.c instanceof z031) {
            return "completed";
        }
        boolean z2 = mofVar.b;
        return (z2 && (hau0Var instanceof z9u0)) ? "focusedWithError" : z2 ? "error" : hau0Var instanceof z9u0 ? "focused" : "empty";
    }

    private final String toDateInputState(sg8 sg8Var) {
        gso gsoVar = sg8Var.c;
        hau0 hau0Var = sg8Var.j;
        if (gsoVar.d instanceof z031) {
            return "completed";
        }
        boolean z = gsoVar.c;
        return (z && (hau0Var instanceof bau0)) ? "focusedWithError" : z ? "error" : hau0Var instanceof bau0 ? "focused" : "empty";
    }

    private final String toFullFormInputState(sg8 sg8Var) {
        hau0 hau0Var = sg8Var.j;
        if (hau0Var.equals(dau0.a)) {
            return "cardNumberInputInProgress";
        }
        if (hau0Var.equals(bau0.a) || hau0Var.equals(z9u0.a)) {
            return "dateCvvInputInProgress";
        }
        if (hau0Var instanceof x9u0) {
            return "submitted";
        }
        w511.b();
        return null;
    }

    private final void updateCardNumberInput(sg8 details) {
        CardPanInputView cardPanInputView = this.cardNumberInput;
        cardPanInputView.setTextFieldValueMasked$features_bdui_release(String.format("%s", Arrays.copyOf(new Object[]{gvu0.B0(4, details.a.a)}, 1)));
        cardPanInputView.moveCursor$features_bdui_release();
        cardPanInputView.updateCardTypeView$features_bdui_release(details.f, this.useDynamicPatterns, details.g, details.d, details.e, details.k);
    }

    private final void updateCardNumberTextState(TextState state) {
        CardPanInputView cardPanInputView = this.cardNumberInput;
        int i = ng8.a[state.ordinal()];
        if (i == 1) {
            cardPanInputView.getBinding().d.setVisibility(0);
            cardPanInputView.getBinding().f.setVisibility(8);
        } else if (i != 2) {
            w511.b();
        } else {
            cardPanInputView.getBinding().d.setVisibility(8);
            cardPanInputView.getBinding().f.setVisibility(0);
        }
    }

    private final void updateCvvVisibility(sg8 state) {
        boolean z = state.l;
        boolean z2 = state.l;
        int i = z ? 8 : 0;
        if (this.cardCvvInput.getVisibility() != i) {
            if (z2 && this.cardCvvInput.hasFocus()) {
                this.cardExpirationDateInput.gainFocus();
            }
            this.cardCvvInput.setVisibility(i);
            if (z2 && !this.isExpandedNumber) {
                this.collapsedCardInputWithoutCvv.b(this.binding.a);
                th91.f(this.binding.a, Long.valueOf(this.animationDuration));
            } else {
                if (z2 || this.isExpandedNumber) {
                    return;
                }
                this.collapsedCardInput.b(this.binding.a);
                th91.f(this.binding.a, Long.valueOf(this.animationDuration));
            }
        }
    }

    private final void updateVariables(sg8 state) {
        this.variableController.setVariable("js.TokenizationScreenState.cardNumberInputState", toCardNumberInputState(state));
        this.variableController.setVariable("js.TokenizationScreenState.dateInputState", toDateInputState(state));
        this.variableController.setVariable("js.TokenizationScreenState.cvvInputState", toCvvInputState(state));
        this.variableController.setVariable("js.TokenizationScreenState.fullFormState", toFullFormInputState(state));
        this.variableController.setVariable(PAYMENT_SYSTEM_LOADING_VARIABLE, state.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 viewController$lambda$0(CardInputMainView cardInputMainView) {
        cardInputMainView.startWaitingForBin();
        return zy11.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tje.N(this.scope, null, null, new CardInputMainView$onAttachedToWindow$1(this, null), 3);
        updateVariables((sg8) this.viewController.o.getValue());
        this.variableController.setVariableListener("js.TokenizationScreenState.fullFormState", "CARD_INPUT_VIEW_LISTENER", new cx7(9, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        synchronized (xpb1.A) {
            xpb1.B = null;
        }
        kotlinx.coroutines.a.g(this.scope.getCoroutineContext(), null);
        this.variableController.removeVariableListener("js.TokenizationScreenState.fullFormState", "CARD_INPUT_VIEW_LISTENER");
        a aVar = this.viewController;
        com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.dynamicbininfo.a aVar2 = aVar.x;
        bvf0.j(aVar2.j, null);
        aVar2.i(0, DynamicBinInfoAnalyticsResetReason.MANUAL_RESET);
        aVar.k.invoke();
    }

    public final void setActionHandler(klk actionHandler) {
        this.viewController.p = actionHandler;
    }

    public final void setExpressionResolver(yg5 resolver) {
        this.expressionResolver = resolver;
        this.viewController.q = resolver;
        evaluateExpressions();
    }
}
