package com.ybsdk.feature.card.internal.presentation.cardactivation;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.e;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import com.ybsdk.core.formatter.FormatTextWatcher;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.DefaultTextWatcher;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.anh0;
import defpackage.bmg0;
import defpackage.byy;
import defpackage.ca8;
import defpackage.d661;
import defpackage.da8;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.e48;
import defpackage.ea8;
import defpackage.evu0;
import defpackage.fa8;
import defpackage.g8e;
import defpackage.gvu0;
import defpackage.h0;
import defpackage.h9s;
import defpackage.ha8;
import defpackage.i3y;
import defpackage.ia8;
import defpackage.j98;
import defpackage.ja8;
import defpackage.jl40;
import defpackage.ka8;
import defpackage.l76;
import defpackage.l98;
import defpackage.l9s;
import defpackage.la8;
import defpackage.lfx;
import defpackage.m98;
import defpackage.ma8;
import defpackage.mf8;
import defpackage.n98;
import defpackage.na8;
import defpackage.ntz0;
import defpackage.oa8;
import defpackage.pa8;
import defpackage.qas0;
import defpackage.qn8;
import defpackage.qtb1;
import defpackage.qtz0;
import defpackage.r98;
import defpackage.rbv;
import defpackage.s98;
import defpackage.sk8;
import defpackage.sm91;
import defpackage.stz0;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.v4b1;
import defpackage.v98;
import defpackage.w04;
import defpackage.w511;
import defpackage.xty0;
import defpackage.xz3;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001N\b\u0000\u0018\u0000 _2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001`B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\u001aJ\u0019\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u0018\u001a\u00020\"H\u0002¢\u0006\u0004\b0\u00101J+\u00107\u001a\u00020/2\u0006\u00103\u001a\u0002022\b\b\u0002\u00104\u001a\u0002022\b\b\u0002\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000205H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u0004\u0018\u00010:2\u0006\u0010\u0018\u001a\u00020\"H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010UR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010S\u001a\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardactivation/CardActivationFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ld661;", "Lpa8;", "Lcom/ybsdk/feature/card/internal/presentation/cardactivation/a;", "Lfa8;", "viewModelFactory", "Lqn8;", "secondFactorHelper", "<init>", "(Lfa8;Lqn8;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/cardactivation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ld661;", "viewState", "render", "(Lpa8;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onDestroyView", "()V", "renderToolbar", "Lia8;", "updateInput", "(Lia8;)Lzy11;", "updateShownInputState", "(Lia8;)V", "Lcom/ybsdk/feature/card/internal/presentation/cardactivation/CardActivationInputState;", "inputState", "applyConstraintsByInputState", "(Lcom/ybsdk/feature/card/internal/presentation/cardactivation/CardActivationInputState;)V", "Lea8;", "statusMessage", "updateStatus", "(Lea8;)V", "Lh9s;", "getCurrentFormatter", "(Lia8;)Lh9s;", "", "maxLength", "groupSize", "", AppSettingsContract$Setting.COLUMN_PREFIX, "createFormatter", "(IILjava/lang/String;)Lh9s;", "cardPanPrefix", "Lcom/ybsdk/core/utils/text/Text;", "getCardNumberPlaceholder", "(Ljava/lang/String;)Lcom/ybsdk/core/utils/text/Text;", "getPrefix", "(Lia8;)Lcom/ybsdk/core/utils/text/Text;", "Lfa8;", "Lqn8;", "shownInputState", "Lcom/ybsdk/feature/card/internal/presentation/cardactivation/CardActivationInputState;", "Landroid/text/TextWatcher;", "inputTextWatcher", "Landroid/text/TextWatcher;", "currentFormatter", "Lh9s;", "currentFormatterTextWatcher", "formatterCvv", "formatterCardNumber", "cardNumberPrefix", "Lcom/ybsdk/core/utils/text/Text;", "cardNumberPlaceholder", "n98", "transitionListener", "Ln98;", "Landroidx/constraintlayout/widget/e;", "constraintSetCvv$delegate", "Li3y;", "getConstraintSetCvv", "()Landroidx/constraintlayout/widget/e;", "constraintSetCvv", "constraintSetCard$delegate", "getConstraintSetCard", "constraintSetCard", "Landroidx/transition/Transition;", "inputStateTransition$delegate", "getInputStateTransition", "()Landroidx/transition/Transition;", "inputStateTransition", "Companion", "l98", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardActivationFragment extends BaseMvvmFragment<d661, pa8, a> {
    public static final l98 Companion = new l98();
    private static final int DEFAULT_LENGTH_CARD_NUMBER = 19;
    private static final int DEFAULT_LENGTH_CVV = 3;
    private Text cardNumberPlaceholder;
    private Text cardNumberPrefix;

    /* renamed from: constraintSetCard$delegate, reason: from kotlin metadata */
    private final i3y constraintSetCard;

    /* renamed from: constraintSetCvv$delegate, reason: from kotlin metadata */
    private final i3y constraintSetCvv;
    private h9s currentFormatter;
    private TextWatcher currentFormatterTextWatcher;
    private h9s formatterCardNumber;
    private h9s formatterCvv;

    /* renamed from: inputStateTransition$delegate, reason: from kotlin metadata */
    private final i3y inputStateTransition;
    private TextWatcher inputTextWatcher;
    private final qn8 secondFactorHelper;
    private CardActivationInputState shownInputState;
    private final n98 transitionListener;
    private final fa8 viewModelFactory;

    public CardActivationFragment(fa8 fa8Var, qn8 qn8Var) {
        super(null, 3, null, null, a.class, 13, null);
        this.viewModelFactory = fa8Var;
        this.secondFactorHelper = qn8Var;
        this.transitionListener = new n98(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.constraintSetCvv = kotlin.a.b(lazyThreadSafetyMode, new j98(this, 0));
        this.constraintSetCard = kotlin.a.b(lazyThreadSafetyMode, new j98(this, 3));
        this.inputStateTransition = kotlin.a.b(lazyThreadSafetyMode, new j98(this, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ d661 access$getBinding(CardActivationFragment cardActivationFragment) {
        return (d661) cardActivationFragment.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyConstraintsByInputState(CardActivationInputState inputState) {
        e constraintSetCvv;
        int i = m98.a[inputState.ordinal()];
        if (i == 1) {
            constraintSetCvv = getConstraintSetCvv();
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            constraintSetCvv = getConstraintSetCard();
        }
        constraintSetCvv.b(((d661) getBinding()).o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e constraintSetCard_delegate$lambda$3(CardActivationFragment cardActivationFragment) {
        e eVar = new e();
        eVar.f(anh0.ybsdk_screen_card_activation_input_card, cardActivationFragment.requireContext());
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e constraintSetCvv_delegate$lambda$1(CardActivationFragment cardActivationFragment) {
        e eVar = new e();
        eVar.f(anh0.ybsdk_screen_card_activation_input_cvv, cardActivationFragment.requireContext());
        return eVar;
    }

    private final h9s createFormatter(int maxLength, int groupSize, String prefix) {
        int i = 0;
        for (int i2 = 0; i2 < prefix.length(); i2++) {
            if (Character.isDigit(prefix.charAt(i2))) {
                i++;
            }
        }
        int i3 = maxLength - i;
        if (i3 < 0) {
            i3 = 0;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append('#');
            i4++;
            if (i4 == groupSize) {
                sb.append(HexString.CHAR_SPACE);
                i4 = 0;
            }
        }
        return l76.k(2, true, qtb1.k().b(gvu0.z0(evu0.m0(sb.toString()).toString()).toString()));
    }

    public static /* synthetic */ h9s createFormatter$default(CardActivationFragment cardActivationFragment, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            str = "";
        }
        return cardActivationFragment.createFormatter(i, i2, str);
    }

    private final Text getCardNumberPlaceholder(String cardPanPrefix) {
        String str;
        boolean z;
        Text text = this.cardNumberPlaceholder;
        if (text != null) {
            return text;
        }
        int i = 0;
        for (int i2 = 0; i2 < cardPanPrefix.length(); i2++) {
            if (Character.isDigit(cardPanPrefix.charAt(i2))) {
                i++;
            }
        }
        b bVar = Text.Companion;
        String b = sk8.b();
        int length = b.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str = "";
                break;
            }
            char charAt = b.charAt(i3);
            if (i != 0) {
                if (Character.isDigit(charAt)) {
                    i--;
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = b.substring(i3);
                break;
            }
            i3++;
        }
        String obj = evu0.o0(str).toString();
        bVar.getClass();
        Text.Constant constant = new Text.Constant(obj);
        this.cardNumberPlaceholder = constant;
        return constant;
    }

    private final e getConstraintSetCard() {
        return (e) this.constraintSetCard.getValue();
    }

    private final e getConstraintSetCvv() {
        return (e) this.constraintSetCvv.getValue();
    }

    private final h9s getCurrentFormatter(ia8 viewState) {
        int i = m98.a[viewState.i().ordinal()];
        if (i == 1) {
            h9s h9sVar = this.formatterCvv;
            if (h9sVar != null) {
                return h9sVar;
            }
            Integer h = viewState.h();
            h9s createFormatter$default = createFormatter$default(this, h != null ? h.intValue() : 3, 0, null, 6, null);
            this.formatterCvv = createFormatter$default;
            return createFormatter$default;
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        h9s h9sVar2 = this.formatterCardNumber;
        if (h9sVar2 != null) {
            return h9sVar2;
        }
        Integer h2 = viewState.h();
        h9s createFormatter = createFormatter(h2 != null ? h2.intValue() : 19, 4, viewState.d());
        this.formatterCardNumber = createFormatter;
        return createFormatter;
    }

    private final Transition getInputStateTransition() {
        return (Transition) this.inputStateTransition.getValue();
    }

    private final Text getPrefix(ia8 viewState) {
        int i = m98.a[viewState.i().ordinal()];
        if (i != 1) {
            if (i == 2) {
                Text text = this.cardNumberPrefix;
                if (text != null) {
                    return text;
                }
                String d = viewState.d();
                StringBuilder sb = new StringBuilder();
                int length = d.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = d.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                String a = sk8.a(sb2);
                b bVar = Text.Companion;
                if (sb2.length() % 4 == 0) {
                    a = a.concat(" ");
                }
                Text.Constant i3 = g8e.i(bVar, a);
                this.cardNumberPrefix = i3;
                return i3;
            }
            w511.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$15$lambda$10(CardActivationFragment cardActivationFragment) {
        cardActivationFragment.getViewModel().k0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$15$lambda$11(CardActivationFragment cardActivationFragment, View view) {
        cardActivationFragment.getViewModel().m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$15$lambda$12(CardActivationFragment cardActivationFragment, View view) {
        cardActivationFragment.getViewModel().n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$15$lambda$13(CardActivationFragment cardActivationFragment) {
        cardActivationFragment.getViewModel().i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$15$lambda$14(CardActivationFragment cardActivationFragment) {
        cardActivationFragment.getViewModel().j0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$15$lambda$7(CardActivationFragment cardActivationFragment) {
        cardActivationFragment.getViewModel().g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$15$lambda$8(CardActivationFragment cardActivationFragment, View view) {
        cardActivationFragment.getViewModel().e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$15$lambda$9(CardActivationFragment cardActivationFragment, View view) {
        cardActivationFragment.getViewModel().h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Transition inputStateTransition_delegate$lambda$5(CardActivationFragment cardActivationFragment) {
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.d0(0);
        autoTransition.r(((d661) cardActivationFragment.getBinding()).r);
        autoTransition.a(cardActivationFragment.transitionListener);
        return autoTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(CardActivationFragment cardActivationFragment, String str, Bundle bundle) {
        cardActivationFragment.getViewModel().l0(((mf8) cardActivationFragment.secondFactorHelper).a(bundle));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar(pa8 viewState) {
        boolean z = (viewState instanceof ja8) || (viewState instanceof oa8);
        ((d661) getBinding()).u.render(new xz3(z ? Text.Empty.INSTANCE : unr0.h(Text.Companion, dzh0.ybsdk_card_card_activation), z, 3));
        setBackButtonVisible(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 renderToolbar$lambda$18(Text text, boolean z, stz0 stz0Var) {
        return stz0.a(stz0Var, text, null, null, null, null, z ? new ntz0(0) : qtz0.a, false, false, null, null, 0, 32734);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 updateInput(ia8 viewState) {
        d661 d661Var = (d661) getBinding();
        TextWatcher textWatcher = this.inputTextWatcher;
        if (textWatcher != null) {
            d661Var.b.removeTextChangedListener(textWatcher);
        }
        h9s currentFormatter = getCurrentFormatter(viewState);
        if (!jl40.l(this.currentFormatter, currentFormatter)) {
            l9s l9sVar = (l9s) currentFormatter;
            l9sVar.h(0, l9sVar.b().length());
            this.currentFormatter = l9sVar;
            TextWatcher textWatcher2 = this.currentFormatterTextWatcher;
            if (textWatcher2 != null) {
                d661Var.b.removeTextChangedListener(textWatcher2);
            }
            this.currentFormatterTextWatcher = new FormatTextWatcher(l9sVar, d661Var.b.getEditText(), null, false, null, 28, null);
        }
        LoadableInput loadableInput = d661Var.b;
        LoadableInput.render$default(loadableInput, false, new w04(27, viewState, this), 1, null);
        loadableInput.requestFocus();
        TextWatcher textWatcher3 = this.inputTextWatcher;
        if (textWatcher3 == null) {
            return null;
        }
        loadableInput.getEditText().addTextChangedListener(textWatcher3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g updateInput$lambda$24$lambda$22(ia8 ia8Var, CardActivationFragment cardActivationFragment, g gVar) {
        Text f = ia8Var.f();
        String obj = d.a(cardActivationFragment.requireContext(), ia8Var.e()).toString();
        Text prefix = cardActivationFragment.getPrefix(ia8Var);
        int i = m98.a[ia8Var.i().ordinal()];
        Text text = null;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            text = cardActivationFragment.getCardNumberPlaceholder(ia8Var.d());
        }
        Text text2 = text;
        ColorModel b = ia8Var.b();
        boolean z = true;
        LoadableInput.LoadingState loadingState = LoadableInput.LoadingState.DEFAULT;
        if (ia8Var.i() != CardActivationInputState.CVV) {
            z = false;
        }
        return g.a(gVar, obj, byy.a, false, loadingState, f, text2, null, false, null, prefix, null, false, null, b, z, 0, false, 0, 0, ia8Var.j(), ia8Var.k(), ia8Var.g(), 18822596);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateShownInputState(ia8 viewState) {
        if (this.shownInputState != viewState.i()) {
            if (this.shownInputState != null) {
                TransitionManager.a(getInputStateTransition(), ((d661) getBinding()).o());
            }
            applyConstraintsByInputState(viewState.i());
        }
        this.shownInputState = viewState.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateStatus(ea8 statusMessage) {
        int i;
        AppCompatTextView appCompatTextView = ((d661) getBinding()).r;
        if (statusMessage instanceof ca8) {
            i = ung0.ybColor_textIcon_negative;
        } else {
            if (!(statusMessage instanceof da8)) {
                w511.b();
                return;
            }
            i = ung0.ybColor_textIcon_primary;
        }
        appCompatTextView.setText(d.a(requireContext(), statusMessage.a()));
        xty0.f(appCompatTextView, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof r98) {
            sm91.h(bmg0.ybsdk_animation_wiggle, ((d661) getBinding()).r);
        } else {
            super.consumeSideEffect(sideEffect);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((ha8) this.viewModelFactory).a((CardActivationParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public d661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        d661 p = d661.p(inflater, container);
        p.u.setOnCloseButtonClickListener(new j98(this, 5));
        final int i = 2;
        p.c.setOnClickListener(new View.OnClickListener(this) { // from class: k98
            public final /* synthetic */ CardActivationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                CardActivationFragment cardActivationFragment = this.b;
                switch (i2) {
                    case 0:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$11(cardActivationFragment, view);
                        break;
                    case 1:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$12(cardActivationFragment, view);
                        break;
                    case 2:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$8(cardActivationFragment, view);
                        break;
                    default:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$9(cardActivationFragment, view);
                        break;
                }
            }
        });
        final int i2 = 3;
        p.d.setOnClickListener(new View.OnClickListener(this) { // from class: k98
            public final /* synthetic */ CardActivationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                CardActivationFragment cardActivationFragment = this.b;
                switch (i22) {
                    case 0:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$11(cardActivationFragment, view);
                        break;
                    case 1:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$12(cardActivationFragment, view);
                        break;
                    case 2:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$8(cardActivationFragment, view);
                        break;
                    default:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$9(cardActivationFragment, view);
                        break;
                }
            }
        });
        this.inputTextWatcher = new DefaultTextWatcher() { // from class: com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment$getViewBinding$1$4
            @Override // com.ybsdk.core.utils.text.DefaultTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                a viewModel;
                viewModel = CardActivationFragment.this.getViewModel();
                String obj = s != null ? s.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                if (((s98) viewModel.X()).e instanceof v98) {
                    return;
                }
                viewModel.a0(new h0(obj, 25));
            }
        };
        ErrorView errorView = p.h;
        final int i3 = 0;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new j98(this, 6));
        errorView.setChangeVisibilityWithDelay(false);
        LoadableInput loadableInput = p.b;
        loadableInput.setCanShowSoftInputOnFocus(false);
        p.p.setOnClickListener(new View.OnClickListener(this) { // from class: k98
            public final /* synthetic */ CardActivationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                CardActivationFragment cardActivationFragment = this.b;
                switch (i22) {
                    case 0:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$11(cardActivationFragment, view);
                        break;
                    case 1:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$12(cardActivationFragment, view);
                        break;
                    case 2:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$8(cardActivationFragment, view);
                        break;
                    default:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$9(cardActivationFragment, view);
                        break;
                }
            }
        });
        final int i4 = 1;
        p.q.setOnClickListener(new View.OnClickListener(this) { // from class: k98
            public final /* synthetic */ CardActivationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i4;
                CardActivationFragment cardActivationFragment = this.b;
                switch (i22) {
                    case 0:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$11(cardActivationFragment, view);
                        break;
                    case 1:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$12(cardActivationFragment, view);
                        break;
                    case 2:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$8(cardActivationFragment, view);
                        break;
                    default:
                        CardActivationFragment.getViewBinding$lambda$15$lambda$9(cardActivationFragment, view);
                        break;
                }
            }
        });
        ErrorView errorView2 = p.l;
        errorView2.setPrimaryButtonOnClickListener(new j98(this, i4));
        errorView2.setSecondaryButtonClickListener(new j98(this, i));
        p.i.setInputConnection(loadableInput.getEditText().onCreateInputConnection(new EditorInfo()));
        return p;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().m0(CardSecondFactorHelper$Request.ACTIVATION.getKey(), this, new e48(3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        TextWatcher textWatcher = this.currentFormatterTextWatcher;
        if (textWatcher != null) {
            ((d661) getBinding()).b.removeTextChangedListener(textWatcher);
        }
        this.currentFormatter = null;
        this.currentFormatterTextWatcher = null;
        this.shownInputState = null;
        getInputStateTransition().K(this.transitionListener);
        this.inputTextWatcher = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(pa8 viewState) {
        d661 d661Var = (d661) getBinding();
        renderToolbar(viewState);
        ErrorView errorView = d661Var.h;
        AppCompatTextView appCompatTextView = d661Var.f;
        ShimmerFrameLayout shimmerFrameLayout = d661Var.k;
        NumberKeyboardView numberKeyboardView = d661Var.i;
        boolean z = viewState instanceof ja8;
        ja8 ja8Var = z ? (ja8) viewState : null;
        errorView.render(ja8Var != null ? ja8Var.a() : null);
        ErrorView errorView2 = d661Var.l;
        boolean z2 = viewState instanceof la8;
        la8 la8Var = z2 ? (la8) viewState : null;
        errorView2.render(la8Var != null ? la8Var.a() : null);
        boolean z3 = viewState instanceof ka8;
        numberKeyboardView.setSkeletonMode(z3);
        boolean z4 = viewState instanceof ia8;
        numberKeyboardView.setEnabled(z4);
        shimmerFrameLayout.setVisibility(z3 ? 0 : 8);
        d661Var.t.setVisibility(viewState instanceof na8 ? 0 : 8);
        d661Var.o.setVisibility(viewState instanceof ma8 ? 0 : 8);
        d661Var.m.setVisibility(z2 ? 0 : 8);
        if (z) {
            return;
        }
        if (z3) {
            shimmerFrameLayout.startShimmer();
            return;
        }
        if (!z4) {
            if (z2 || viewState.equals(na8.a) || viewState.equals(ma8.a)) {
                return;
            }
            w511.b();
            return;
        }
        ia8 ia8Var = (ia8) viewState;
        appCompatTextView.setText(d.a(requireContext(), ia8Var.c()));
        rbv a = ia8Var.a();
        if (a != null) {
            v4b1.k(a, d661Var.e, null, null, 6);
        }
        updateInput(ia8Var);
        updateStatus(ia8Var.l());
        ColorModel m = ia8Var.m();
        if (m != null) {
            int i = m.get(requireContext());
            appCompatTextView.setTextColor(i);
            d661Var.j.setTextColor(i);
        }
        updateShownInputState(ia8Var);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
