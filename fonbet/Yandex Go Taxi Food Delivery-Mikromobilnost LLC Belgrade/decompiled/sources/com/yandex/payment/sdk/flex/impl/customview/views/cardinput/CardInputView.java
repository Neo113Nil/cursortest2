package com.yandex.payment.sdk.flex.impl.customview.views.cardinput;

import android.R;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.yandex.div.core.expression.variables.a;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.contract.TextState;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.textwatchers.CardNumberTextWatcher;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.textwatchers.CvvTextWatcher;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.textwatchers.ExpirationDateTextWatcher;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.CardNumberInputView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.CvvInputView;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.views.ExpirationDateInputView;
import defpackage.a131;
import defpackage.aau0;
import defpackage.ah8;
import defpackage.bh8;
import defpackage.bvf0;
import defpackage.c231;
import defpackage.cau0;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.cx7;
import defpackage.dab1;
import defpackage.fau0;
import defpackage.fso;
import defpackage.gvu0;
import defpackage.hg8;
import defpackage.j24;
import defpackage.jl40;
import defpackage.jlk;
import defpackage.kh91;
import defpackage.kir;
import defpackage.l8x;
import defpackage.lg8;
import defpackage.lir;
import defpackage.lof;
import defpackage.m9h0;
import defpackage.nh8;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ok8;
import defpackage.qhw0;
import defpackage.rg8;
import defpackage.rk8;
import defpackage.sjh;
import defpackage.sls;
import defpackage.t8;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vlh0;
import defpackage.w031;
import defpackage.w511;
import defpackage.w9u0;
import defpackage.wb8;
import defpackage.xar;
import defpackage.y031;
import defpackage.y9u0;
import defpackage.yh5;
import defpackage.ymu;
import defpackage.zar;
import defpackage.zy11;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 e2\u00020\u0001:\u0001fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00112\b\b\u0001\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b*\u0010\u001cJ\u0017\u0010,\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u0010\u0013J\u000f\u00100\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u0010\u0013JE\u00105\u001a\u00020\u00112\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001012\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u000101H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b7\u0010\u0013J\u000f\u00108\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u0010\u0013J\u000f\u00109\u001a\u00020\u0011H\u0002¢\u0006\u0004\b9\u0010\u0013J\u001f\u0010<\u001a\u00020;2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u000101H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b>\u0010\u001cJ\u0013\u0010@\u001a\u00020?*\u00020\u0019H\u0002¢\u0006\u0004\b@\u0010AJ\u0013\u0010B\u001a\u00020?*\u00020\u0019H\u0002¢\u0006\u0004\bB\u0010AJ\u0013\u0010C\u001a\u00020?*\u00020\u0019H\u0002¢\u0006\u0004\bC\u0010AJ\u0013\u0010D\u001a\u00020?*\u00020\u0019H\u0002¢\u0006\u0004\bD\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010FR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010FR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/CardInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Lwb8;", "cardBindingRepository", "Lhg8;", "params", "Lyh5;", "variableController", "", "isLightTheme", "enableDebranding", "Llir;", "eventReporter", "<init>", "(Landroid/content/Context;Lwb8;Lhg8;Lyh5;ZZLlir;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljlk;", "actionHandler", "setActionHandler", "(Ljlk;)V", "Lrg8;", ClidProvider.STATE, "render", "(Lrg8;)V", "details", "highlightValidationErrors", "(Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/CardInputView;Lrg8;)V", "setInputsText", "isLocked", "setLocked", "(Z)V", "", "codeType", "setSecurityCodeType", "(I)V", "switchToCardNumber", "switchToCardDetails", "updateCardNumberInput", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/contract/TextState;", "updateCardNumberTextState", "(Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/contract/TextState;)V", "gainFocusExpirationDate", "gainFocusCvv", "gainFocusNumber", "Lkotlin/Function0;", "onCardEditDone", "onExpirationDateEditDone", "onCvvEditDone", "setEditorActions", "(Lsls;Lsls;Lsls;)V", "submitForm", "expandCardNumber", "collapseCardNumber", "action", "Landroid/widget/TextView$OnEditorActionListener;", "createNextActionListener", "(Lsls;)Landroid/widget/TextView$OnEditorActionListener;", "updateVariables", "", "toCardNumberInputState", "(Lrg8;)Ljava/lang/String;", "toDateInputState", "toCvvInputState", "toFullFormInputState", "Lyh5;", "Z", "Llir;", "Lxar;", "binding", "Lxar;", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/views/CardNumberInputView;", "cardNumberInput", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/views/CardNumberInputView;", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/views/ExpirationDateInputView;", "cardExpirationDateInput", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/views/ExpirationDateInputView;", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/views/CvvInputView;", "cardCvvInput", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/views/CvvInputView;", "Lnh8;", "viewController", "Lnh8;", "isExpandedNumber", "Landroidx/constraintlayout/widget/e;", "expandedConstrainSet", "Landroidx/constraintlayout/widget/e;", "collapsedCardInput", "", "animationDuration", "J", "Ltse;", "scope", "Ltse;", "Ll8x;", "submitJob", "Ll8x;", "Companion", "ah8", "flex-impl-18-1-0_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardInputView extends ConstraintLayout {

    @Deprecated
    public static final String CARD_NUMBER_INPUT_STATE_VARIABLE = "js.TokenizationScreenState.cardNumberInputState";

    @Deprecated
    public static final String CVV_INPUT_STATE_VARIABLE = "js.TokenizationScreenState.cvvInputState";
    private static final ah8 Companion = new ah8();

    @Deprecated
    public static final String DATE_INPUT_STATE_VARIABLE = "js.TokenizationScreenState.dateInputState";

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
    public static final String TOKENIZATION_SCREEN_STATE = "js.TokenizationScreenState";
    private final long animationDuration;
    private final xar binding;
    private final CvvInputView cardCvvInput;
    private final ExpirationDateInputView cardExpirationDateInput;
    private final CardNumberInputView cardNumberInput;
    private final e collapsedCardInput;
    private final boolean enableDebranding;
    private final lir eventReporter;
    private final e expandedConstrainSet;
    private boolean isExpandedNumber;
    private final boolean isLightTheme;
    private final tse scope;
    private l8x submitJob;
    private final yh5 variableController;
    private final nh8 viewController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView$4, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((CardInputView) this.receiver).gainFocusExpirationDate();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView$5, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((CardInputView) this.receiver).gainFocusCvv();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView$6, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((CardInputView) this.receiver).submitForm();
            return zy11.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardInputView(Context context, wb8 wb8Var, hg8 hg8Var, yh5 yh5Var, boolean z, boolean z2, lir lirVar) {
        super(context);
        this.variableController = yh5Var;
        this.isLightTheme = z;
        this.enableDebranding = z2;
        this.eventReporter = lirVar;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(vlh0.finsdk_view_card_input, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i2 = m9h0.finsdkCardCvvInput;
        CvvInputView cvvInputView = (CvvInputView) cma1.O(i2, inflate);
        rk8 rk8Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (cvvInputView != null) {
            i2 = m9h0.finsdkCardExpirationDateInput;
            ExpirationDateInputView expirationDateInputView = (ExpirationDateInputView) cma1.O(i2, inflate);
            if (expirationDateInputView != null) {
                i2 = m9h0.finsdkCardNumberInput;
                CardNumberInputView cardNumberInputView = (CardNumberInputView) cma1.O(i2, inflate);
                if (cardNumberInputView != null) {
                    this.binding = new xar(constraintLayout, constraintLayout, cvvInputView, expirationDateInputView, cardNumberInputView);
                    this.cardNumberInput = cardNumberInputView;
                    this.cardExpirationDateInput = expirationDateInputView;
                    this.cardCvvInput = cvvInputView;
                    nh8 nh8Var = new nh8(dab1.z, z, z2, wb8Var, yh5Var, hg8Var, lirVar);
                    this.viewController = nh8Var;
                    final int i3 = 1;
                    this.isExpandedNumber = true;
                    e eVar = new e();
                    eVar.f(vlh0.finsdk_view_card_input, context);
                    this.expandedConstrainSet = eVar;
                    e eVar2 = new e();
                    eVar2.f(vlh0.finsdk_view_card_input_collapsed_card_number, context);
                    this.collapsedCardInput = eVar2;
                    this.animationDuration = getResources().getInteger(R.integer.config_longAnimTime);
                    qhw0 a = jl40.a();
                    sjh sjhVar = uyj.a;
                    this.scope = bvf0.a(cvw.U(a, o400.a));
                    zar binding = cardNumberInputView.getBinding();
                    int i4 = 2;
                    binding.c.addTextChangedListener(new CardNumberTextWatcher(nh8Var, rk8Var, i4, objArr3 == true ? 1 : 0));
                    binding.e.setOnTouchListener(new t8(5, this));
                    expirationDateInputView.setInputFilters();
                    expirationDateInputView.getBinding().c.addTextChangedListener(new ExpirationDateTextWatcher(nh8Var, objArr2 == true ? 1 : 0, i4, objArr == true ? 1 : 0));
                    expirationDateInputView.getBinding().c.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: zg8
                        public final /* synthetic */ CardInputView b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z3) {
                            int i5 = i;
                            CardInputView cardInputView = this.b;
                            switch (i5) {
                                case 0:
                                    CardInputView.lambda$1$0(cardInputView, view, z3);
                                    break;
                                default:
                                    CardInputView.lambda$2$0(cardInputView, view, z3);
                                    break;
                            }
                        }
                    });
                    cvvInputView.updateLengthFilter();
                    cvvInputView.getBinding().c.addTextChangedListener(new CvvTextWatcher(nh8Var));
                    cvvInputView.getBinding().c.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: zg8
                        public final /* synthetic */ CardInputView b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z3) {
                            int i5 = i3;
                            CardInputView cardInputView = this.b;
                            switch (i5) {
                                case 0:
                                    CardInputView.lambda$1$0(cardInputView, view, z3);
                                    break;
                                default:
                                    CardInputView.lambda$2$0(cardInputView, view, z3);
                                    break;
                            }
                        }
                    });
                    setEditorActions(new AnonymousClass4(0, this, CardInputView.class, "gainFocusExpirationDate", "gainFocusExpirationDate()V", 0), new AnonymousClass5(0, this, CardInputView.class, "gainFocusCvv", "gainFocusCvv()V", 0), new AnonymousClass6(0, this, CardInputView.class, "submitForm", "submitForm()V", 0));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void collapseCardNumber() {
        this.collapsedCardInput.b(this.binding.a);
        ConstraintLayout constraintLayout = this.binding.a;
        long j = this.animationDuration;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(j);
        TransitionManager.beginDelayedTransition(constraintLayout, changeBounds);
    }

    private final TextView.OnEditorActionListener createNextActionListener(sls action) {
        return new lg8(1, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createNextActionListener$lambda$0(sls slsVar, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 || slsVar == null) {
            return true;
        }
        slsVar.invoke();
        return true;
    }

    private final void expandCardNumber() {
        this.expandedConstrainSet.b(this.binding.a);
        ConstraintLayout constraintLayout = this.binding.a;
        long j = this.animationDuration;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(j);
        TransitionManager.beginDelayedTransition(constraintLayout, changeBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gainFocusCvv() {
        this.cardCvvInput.gainFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gainFocusExpirationDate() {
        this.cardExpirationDateInput.gainFocus();
    }

    private final void gainFocusNumber() {
        CardNumberInputView.gainFocus$flex_impl_18_1_0_release$default(this.cardNumberInput, false, 1, null);
    }

    private final void highlightValidationErrors(CardInputView cardInputView, rg8 rg8Var) {
        CardNumberInputView cardNumberInputView = cardInputView.cardNumberInput;
        ok8 ok8Var = rg8Var.b;
        String str = "payment_form_card_validation_completed";
        if (ok8Var.b) {
            a131 a131Var = ok8Var.c;
            if (a131Var instanceof w031) {
                cardNumberInputView.showError$flex_impl_18_1_0_release(cardInputView.isLightTheme);
            } else if (!(a131Var instanceof y031)) {
                w511.b();
                return;
            } else {
                cardInputView.eventReporter.a(new kir(str));
                cardNumberInputView.hideError$flex_impl_18_1_0_release(cardInputView.isLightTheme);
            }
        } else {
            cardNumberInputView.hideError$flex_impl_18_1_0_release(cardInputView.isLightTheme);
        }
        ExpirationDateInputView expirationDateInputView = cardInputView.cardExpirationDateInput;
        fso fsoVar = rg8Var.c;
        if (fsoVar.c) {
            a131 a131Var2 = fsoVar.d;
            if (a131Var2 instanceof w031) {
                expirationDateInputView.showError(cardInputView.isLightTheme);
            } else if (!(a131Var2 instanceof y031)) {
                w511.b();
                return;
            } else {
                cardInputView.eventReporter.a(new kir(str));
                expirationDateInputView.hideError(cardInputView.isLightTheme);
            }
        } else {
            expirationDateInputView.hideError(cardInputView.isLightTheme);
        }
        CvvInputView cvvInputView = cardInputView.cardCvvInput;
        lof lofVar = rg8Var.d;
        if (!lofVar.b) {
            cvvInputView.hideError(cardInputView.isLightTheme);
            return;
        }
        a131 a131Var3 = lofVar.c;
        if (a131Var3 instanceof w031) {
            cvvInputView.showError(cardInputView.isLightTheme);
        } else if (!(a131Var3 instanceof y031)) {
            w511.b();
        } else {
            cardInputView.eventReporter.a(new kir(str));
            cvvInputView.hideError(cardInputView.isLightTheme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$0$0(CardInputView cardInputView, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        cardInputView.viewController.b();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$0(CardInputView cardInputView, View view, boolean z) {
        if (z) {
            cardInputView.viewController.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$0(CardInputView cardInputView, View view, boolean z) {
        if (z) {
            cardInputView.viewController.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(CardInputView cardInputView, Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        zy11 zy11Var = zy11.a;
        if (str == null) {
            return zy11Var;
        }
        int hashCode = str.hashCode();
        if (hashCode != 348678395) {
            if (hashCode != 621927971) {
                if (hashCode == 771808583 && str.equals("dateCvvInputInProgress")) {
                    cardInputView.viewController.d();
                }
            } else if (str.equals("cardNumberInputInProgress")) {
                cardInputView.viewController.b();
            }
        } else if (str.equals("submitted")) {
            cardInputView.submitForm();
        }
        return zy11Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render(rg8 state) {
        synchronized (dab1.y) {
            dab1.z = state;
        }
        updateVariables(state);
        setInputsText(state);
        fau0 fau0Var = state.a;
        setLocked((fau0Var instanceof w9u0) && ((w9u0) fau0Var).a);
        setSecurityCodeType(state.f);
        updateCardNumberInput(state);
        fau0 fau0Var2 = state.a;
        if (fau0Var2 instanceof cau0) {
            updateCardNumberTextState(TextState.REGULAR);
            switchToCardNumber();
            gainFocusNumber();
        } else if (fau0Var2 instanceof aau0) {
            updateCardNumberTextState(TextState.MASKED);
            switchToCardDetails();
            gainFocusExpirationDate();
        } else if (fau0Var2 instanceof y9u0) {
            updateCardNumberTextState(TextState.MASKED);
            switchToCardDetails();
            gainFocusCvv();
        } else if (!(fau0Var2 instanceof w9u0)) {
            w511.b();
            return;
        } else {
            updateCardNumberTextState(TextState.MASKED);
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
            switchToCardDetails();
        }
        highlightValidationErrors(this, state);
        this.cardNumberInput.initTextColor$flex_impl_18_1_0_release(this.isLightTheme);
        this.cardExpirationDateInput.initTextColor$flex_impl_18_1_0_release(this.isLightTheme);
        this.cardCvvInput.initTextColor$flex_impl_18_1_0_release(this.isLightTheme);
    }

    private final void setEditorActions(sls onCardEditDone, sls onExpirationDateEditDone, sls onCvvEditDone) {
        this.cardNumberInput.getBinding().c.setOnEditorActionListener(createNextActionListener(onCardEditDone));
        this.cardExpirationDateInput.getBinding().c.setOnEditorActionListener(createNextActionListener(onExpirationDateEditDone));
        this.cardCvvInput.getBinding().c.setOnEditorActionListener(createNextActionListener(onCvvEditDone));
    }

    public static /* synthetic */ void setEditorActions$default(CardInputView cardInputView, sls slsVar, sls slsVar2, sls slsVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = null;
        }
        if ((i & 2) != 0) {
            slsVar2 = null;
        }
        if ((i & 4) != 0) {
            slsVar3 = null;
        }
        cardInputView.setEditorActions(slsVar, slsVar2, slsVar3);
    }

    private final void setInputsText(rg8 state) {
        this.cardNumberInput.setCardNumberIfNew$flex_impl_18_1_0_release(state.b.a);
        this.cardExpirationDateInput.setTextIfNew$flex_impl_18_1_0_release(state.c.a);
        this.cardCvvInput.setTextIfNew$flex_impl_18_1_0_release(state.d.a);
    }

    private final void setLocked(boolean isLocked) {
        kh91.c(this.binding.b, isLocked);
        this.cardNumberInput.setLocked$flex_impl_18_1_0_release(isLocked);
        this.cardCvvInput.setLocked(isLocked);
        this.cardExpirationDateInput.setLocked(isLocked);
    }

    private final void setSecurityCodeType(int codeType) {
        this.cardCvvInput.setSecurityCodeType(codeType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitForm() {
        l8x l8xVar = this.submitJob;
        if (l8xVar == null || !l8xVar.isActive()) {
            l8x l8xVar2 = this.submitJob;
            if (l8xVar2 != null) {
                l8xVar2.a(null);
            }
            this.submitJob = tje.N(this.scope, null, null, new CardInputView$submitForm$1(this, null), 3);
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

    private final String toCardNumberInputState(rg8 rg8Var) {
        ok8 ok8Var = rg8Var.b;
        fau0 fau0Var = rg8Var.a;
        if (ok8Var.c instanceof y031) {
            return "completed";
        }
        boolean z = ok8Var.b;
        return (z && (fau0Var instanceof cau0)) ? "focusedWithError" : z ? "error" : fau0Var instanceof cau0 ? "focused" : "empty";
    }

    private final String toCvvInputState(rg8 rg8Var) {
        lof lofVar = rg8Var.d;
        fau0 fau0Var = rg8Var.a;
        if (lofVar.c instanceof y031) {
            return "completed";
        }
        boolean z = lofVar.b;
        return (z && (fau0Var instanceof y9u0)) ? "focusedWithError" : z ? "error" : fau0Var instanceof y9u0 ? "focused" : "empty";
    }

    private final String toDateInputState(rg8 rg8Var) {
        fso fsoVar = rg8Var.c;
        fau0 fau0Var = rg8Var.a;
        if (fsoVar.d instanceof y031) {
            return "completed";
        }
        boolean z = fsoVar.c;
        return (z && (fau0Var instanceof aau0)) ? "focusedWithError" : z ? "error" : fau0Var instanceof aau0 ? "focused" : "empty";
    }

    private final String toFullFormInputState(rg8 rg8Var) {
        fau0 fau0Var = rg8Var.a;
        if (fau0Var.equals(cau0.a)) {
            return "cardNumberInputInProgress";
        }
        if (fau0Var.equals(aau0.a) || fau0Var.equals(y9u0.a)) {
            return "dateCvvInputInProgress";
        }
        if (fau0Var instanceof w9u0) {
            return "submitted";
        }
        w511.b();
        return null;
    }

    private final void updateCardNumberInput(rg8 details) {
        CardNumberInputView cardNumberInputView = this.cardNumberInput;
        cardNumberInputView.setTextFieldValueMasked$flex_impl_18_1_0_release(String.format("%s", Arrays.copyOf(new Object[]{gvu0.B0(4, details.b.a)}, 1)));
        cardNumberInputView.moveCursor$flex_impl_18_1_0_release();
        cardNumberInputView.updateCardTypeView$flex_impl_18_1_0_release(details.e);
    }

    private final void updateCardNumberTextState(TextState state) {
        CardNumberInputView cardNumberInputView = this.cardNumberInput;
        int i = bh8.a[state.ordinal()];
        if (i == 1) {
            cardNumberInputView.getBinding().c.setVisibility(0);
            cardNumberInputView.getBinding().e.setVisibility(8);
        } else if (i != 2) {
            w511.b();
        } else {
            cardNumberInputView.getBinding().c.setVisibility(8);
            cardNumberInputView.getBinding().e.setVisibility(0);
        }
    }

    private final void updateVariables(rg8 state) {
        ((ymu) this.variableController).H("js.TokenizationScreenState.cardNumberInputState", toCardNumberInputState(state));
        ((ymu) this.variableController).H("js.TokenizationScreenState.dateInputState", toDateInputState(state));
        ((ymu) this.variableController).H("js.TokenizationScreenState.cvvInputState", toCvvInputState(state));
        ((ymu) this.variableController).H("js.TokenizationScreenState.fullFormState", toFullFormInputState(state));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tje.N(this.scope, null, null, new CardInputView$onAttachedToWindow$1(this, null), 3);
        updateVariables((rg8) this.viewController.j.getValue());
        yh5 yh5Var = this.variableController;
        cx7 cx7Var = new cx7(11, this);
        ymu ymuVar = (ymu) yh5Var;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ymuVar.c;
        c231 g = ((a) ymuVar.b).g("js.TokenizationScreenState.fullFormState");
        if (g != null) {
            tls tlsVar = (tls) linkedHashMap.get("CARD_INPUT_VIEW_LISTENER");
            if (tlsVar != null) {
                g.f(tlsVar);
                linkedHashMap.remove("CARD_INPUT_VIEW_LISTENER");
            }
            j24 j24Var = new j24(19, cx7Var);
            g.a(j24Var);
            linkedHashMap.put("CARD_INPUT_VIEW_LISTENER", j24Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        tls tlsVar;
        super.onDetachedFromWindow();
        synchronized (dab1.y) {
            dab1.z = null;
        }
        kotlinx.coroutines.a.g(this.scope.getCoroutineContext(), null);
        ymu ymuVar = (ymu) this.variableController;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ymuVar.c;
        c231 g = ((a) ymuVar.b).g("js.TokenizationScreenState.fullFormState");
        if (g == null || (tlsVar = (tls) linkedHashMap.get("CARD_INPUT_VIEW_LISTENER")) == null) {
            return;
        }
        g.f(tlsVar);
        linkedHashMap.remove("CARD_INPUT_VIEW_LISTENER");
    }

    public final void setActionHandler(jlk actionHandler) {
        this.viewController.k = actionHandler;
    }
}
