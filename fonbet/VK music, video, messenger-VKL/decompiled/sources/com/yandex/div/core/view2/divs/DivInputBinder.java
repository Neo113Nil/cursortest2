package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.View;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.util.inputfilter.BaseInputFilter;
import com.yandex.div.core.util.inputfilter.ExpressionInputFilter;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.inputfilter.RegexInputFilter;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.CurrencyInputMask;
import com.yandex.div.core.util.mask.FixedLengthInputMask;
import com.yandex.div.core.util.mask.PhoneInputMask;
import com.yandex.div.core.util.mask.PhoneInputMaskKt;
import com.yandex.div.core.util.validator.ExpressionValidator;
import com.yandex.div.core.util.validator.RegexValidator;
import com.yandex.div.core.util.validator.ValidatorItemData;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a;
import com.yandex.div2.b6;
import com.yandex.div2.f6;
import com.yandex.div2.l6;
import com.yandex.div2.m4;
import com.yandex.div2.s5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.bmn;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.erm0;
import xsna.gzs;
import xsna.izs;
import xsna.kkn;
import xsna.mq;
import xsna.qmn;
import xsna.s3q0;
import xsna.wzs;
import xsna.znn;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes7.dex */
public final class DivInputBinder extends DivViewBinder<a.h, DivInput, DivInputView> {
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final DivActionBinder actionBinder;
    private final DivBaseBinder baseBinder;
    private final ErrorCollectors errorCollectors;
    private final DivTypefaceResolver typefaceResolver;
    private final TwoWayStringVariableBinder variableBinder;

    /* compiled from: DivInputBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivInput.KeyboardType.values().length];
            try {
                iArr2[DivInput.KeyboardType.SINGLE_LINE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DivInput.KeyboardType.MULTI_LINE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DivInput.KeyboardType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DivInput.KeyboardType.URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DivInput.KeyboardType.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DivInput.KeyboardType.PHONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DivInput.KeyboardType.PASSWORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivInput.EnterKeyType.values().length];
            try {
                iArr3[DivInput.EnterKeyType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[DivInput.EnterKeyType.SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[DivInput.EnterKeyType.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[DivInput.EnterKeyType.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[DivInput.EnterKeyType.GO.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivInput.Autocapitalization.values().length];
            try {
                iArr4[DivInput.Autocapitalization.SENTENCES.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[DivInput.Autocapitalization.WORDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[DivInput.Autocapitalization.ALL_CHARACTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public DivInputBinder(DivBaseBinder divBaseBinder, DivTypefaceResolver divTypefaceResolver, TwoWayStringVariableBinder twoWayStringVariableBinder, DivActionBinder divActionBinder, AccessibilityStateProvider accessibilityStateProvider, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayStringVariableBinder;
        this.actionBinder = divActionBinder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyNativeBackgroundColor(DivInputView divInputView, BindingContext bindingContext, DivInput divInput, DivInput divInput2) {
        Drawable nativeBackground$div_release;
        Drawable drawable;
        Expression<Integer> expression;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivInput.a aVar = divInput.K;
        int intValue = (aVar == null || (expression = aVar.a) == null) ? 0 : expression.evaluate(expressionResolver).intValue();
        if (intValue == 0 || (nativeBackground$div_release = divInputView.getNativeBackground$div_release()) == null) {
            drawable = null;
        } else {
            nativeBackground$div_release.setTint(intValue);
            drawable = nativeBackground$div_release;
        }
        this.baseBinder.bindBackground$div_release(bindingContext, divInputView, divInput, divInput2, ReleasablesKt.getExpressionSubscriber(divInputView), drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextAlignment(DivInputView divInputView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        divInputView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        int i = divAlignmentHorizontal == null ? -1 : WhenMappings.$EnumSwitchMapping$0[divAlignmentHorizontal.ordinal()];
        int i2 = 5;
        if (i != 1) {
            if (i == 2) {
                i2 = 4;
            } else if (i == 3 || (i != 4 && i == 5)) {
                i2 = 6;
            }
        }
        divInputView.setTextAlignment(i2);
    }

    private final void attachAccessibility(final ValidatorItemData validatorItemData, Div2View div2View, final DivInputView divInputView, final boolean z) {
        final IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't find label with id '" + validatorItemData.getLabelId() + '\'');
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent$div_release().getViewIdProvider();
        if (!divInputView.isLaidOut() || divInputView.isLayoutRequested()) {
            divInputView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$attachAccessibility$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    int viewId = DivViewIdProvider.this.getViewId(validatorItemData.getLabelId());
                    if (viewId == -1) {
                        orCreate.logError(illegalArgumentException);
                        return;
                    }
                    View findViewById = divInputView.getRootView().findViewById(viewId);
                    if (findViewById != null) {
                        findViewById.setLabelFor(z ? -1 : divInputView.getId());
                    } else {
                        orCreate.logError(illegalArgumentException);
                    }
                }
            });
            return;
        }
        int viewId = viewIdProvider.getViewId(validatorItemData.getLabelId());
        if (viewId == -1) {
            orCreate.logError(illegalArgumentException);
            return;
        }
        View findViewById = divInputView.getRootView().findViewById(viewId);
        if (findViewById != null) {
            findViewById.setLabelFor(z ? -1 : divInputView.getId());
        } else {
            orCreate.logError(illegalArgumentException);
        }
    }

    private final DivInputBinder$createCallbacks$1 createCallbacks(DivInputView divInputView, BindingContext bindingContext, BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, Div2View div2View, String str) {
        return new DivInputBinder$createCallbacks$1(baseInputMask, inputFiltersHolder, divInputView, bindingContext, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCapitalization(DivInput divInput, ExpressionResolver expressionResolver) {
        int i = WhenMappings.$EnumSwitchMapping$3[divInput.f.evaluate(expressionResolver).ordinal()];
        if (i == 1) {
            return 16384;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4096;
        }
        return 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImeAction(DivInput.EnterKeyType enterKeyType) {
        int i = WhenMappings.$EnumSwitchMapping$2[enterKeyType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 6;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getKeyboardType(DivInput.KeyboardType keyboardType) {
        switch (WhenMappings.$EnumSwitchMapping$1[keyboardType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 131073;
            case 3:
                return 33;
            case 4:
                return 17;
            case 5:
                return 12290;
            case 6:
                return 3;
            case 7:
                return 129;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void observeBackground(DivInputView divInputView, final BindingContext bindingContext, final DivInput divInput, final DivInput divInput2, ExpressionResolver expressionResolver) {
        final DivInputView divInputView2;
        Expression<Integer> expression;
        DivInput.a aVar = divInput.K;
        DivInput.a aVar2 = divInput.K;
        Disposable disposable = null;
        if (DivDataExtensionsKt.equalsToConstant(aVar, divInput2 != null ? divInput2.K : null)) {
            return;
        }
        applyNativeBackgroundColor(divInputView, bindingContext, divInput, divInput2);
        if (DivDataExtensionsKt.isConstant(aVar2)) {
            return;
        }
        if (aVar2 == null || (expression = aVar2.a) == null) {
            divInputView2 = divInputView;
        } else {
            divInputView2 = divInputView;
            disposable = expression.observeAndGet(expressionResolver, new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeBackground$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                    invoke(num.intValue());
                    return s3q0.a;
                }

                public final void invoke(int i) {
                    DivInputBinder.this.applyNativeBackgroundColor(divInputView2, bindingContext, divInput, divInput2);
                }
            });
        }
        divInputView2.addSubscription(disposable);
    }

    private final void observeBaseTextProperties(DivInputView divInputView, DivInput divInput, DivInput divInput2, ExpressionResolver expressionResolver) {
        Expression<Long> expression = divInput.q;
        Expression<DivSizeUnit> expression2 = divInput.r;
        Expression<Double> expression3 = divInput.E;
        Expression<Integer> expression4 = divInput.S;
        Expression<Long> expression5 = divInput.F;
        Expression<String> expression6 = divInput.p;
        Expression<DivFontWeight> expression7 = divInput.t;
        Expression<Long> expression8 = divInput.u;
        Expression<JSONObject> expression9 = divInput.s;
        Expression<Long> expression10 = divInput2 != null ? divInput2.q : null;
        Expression<DivSizeUnit> expression11 = divInput2 != null ? divInput2.r : null;
        Expression<Double> expression12 = divInput2 != null ? divInput2.E : null;
        Expression<Integer> expression13 = divInput2 != null ? divInput2.S : null;
        Expression<Long> expression14 = divInput2 != null ? divInput2.F : null;
        Expression<String> expression15 = divInput2 != null ? divInput2.p : null;
        TextViewExtensionsKt.observeBaseTextProperties(divInputView, expression, expression2, expression3, expression4, expression5, expression6, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, expression15, divInput2 != null ? divInput2.t : null, divInput2 != null ? divInput2.u : null, divInput2 != null ? divInput2.s : null, divInput2, this.typefaceResolver, expressionResolver);
    }

    private final void observeEnterTypeAndActions(DivInputView divInputView, DivInput divInput, BindingContext bindingContext, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.l.observeAndGet(expressionResolver, new DivInputBinder$observeEnterTypeAndActions$callback$1(divInput, expressionResolver, divInputView, this, bindingContext)));
    }

    private final void observeFilters(DivInputView divInputView, DivInput divInput, final BindingContext bindingContext, final izs<? super InputFiltersHolder, s3q0> izsVar) {
        if (divInput.H != null) {
            return;
        }
        final List<bmn> list = divInput.n;
        List<bmn> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        izs<? super String, s3q0> izsVar2 = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeFilters$updateFiltersData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                ErrorCollectors errorCollectors;
                BaseInputFilter baseInputFilter;
                List<bmn> list3 = list;
                ExpressionResolver expressionResolver2 = expressionResolver;
                DivInputBinder divInputBinder = this;
                BindingContext bindingContext2 = bindingContext;
                ArrayList arrayList = new ArrayList();
                for (bmn bmnVar : list3) {
                    if (bmnVar instanceof bmn.b) {
                        try {
                            baseInputFilter = new RegexInputFilter(((bmn.b) bmnVar).b.a.evaluate(expressionResolver2));
                        } catch (PatternSyntaxException e) {
                            errorCollectors = divInputBinder.errorCollectors;
                            errorCollectors.getOrCreate(bindingContext2.getDivView().getDataTag(), bindingContext2.getDivView().getDivData()).logError(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + "'.", e));
                            baseInputFilter = null;
                        }
                    } else {
                        if (!(bmnVar instanceof bmn.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        baseInputFilter = new ExpressionInputFilter(((bmn.a) bmnVar).b.a, expressionResolver2);
                    }
                    if (baseInputFilter != null) {
                        arrayList.add(baseInputFilter);
                    }
                }
                izsVar.invoke(new InputFiltersHolder(arrayList));
            }
        };
        for (bmn bmnVar : list) {
            if (bmnVar instanceof bmn.b) {
                divInputView.addSubscription(((bmn.b) bmnVar).b.a.observe(expressionResolver, izsVar2));
            }
        }
        izsVar2.invoke(s3q0.a);
    }

    private final void observeHighlightColor(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression<Integer> expression = divInput.x;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHighlightColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivInputView.this.setHighlightColor(expression.evaluate(expressionResolver).intValue());
            }
        }));
    }

    private final void observeHintColor(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.y.observeAndGet(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivInputView.this.setHintTextColor(divInput.y.evaluate(expressionResolver).intValue());
            }
        }));
    }

    private final void observeHintText(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression<String> expression = divInput.z;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeHintText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivInputView.this.setInputHint(expression.evaluate(expressionResolver));
            }
        }));
    }

    private final void observeIsEnabled(final DivInputView divInputView, DivInput divInput, ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.B.observeAndGet(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeIsEnabled$callback$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                if (!z && DivInputView.this.isFocused()) {
                    DivActionTypedUtilsKt.closeKeyboard(DivInputView.this);
                }
                DivInputView.this.setEnabled$div_release(z);
            }
        }));
    }

    private final void observeKeyboardTypeAndCapitalization(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        izs<? super DivInput.KeyboardType, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeKeyboardTypeAndCapitalization$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                int keyboardType;
                int capitalization;
                DivInput.KeyboardType evaluate = DivInput.this.C.evaluate(expressionResolver);
                DivInputView divInputView2 = divInputView;
                keyboardType = this.getKeyboardType(evaluate);
                capitalization = this.getCapitalization(DivInput.this, expressionResolver);
                divInputView2.setInputType(keyboardType | capitalization);
                divInputView.setHorizontallyScrolling(evaluate != DivInput.KeyboardType.MULTI_LINE_TEXT);
            }
        };
        divInputView.addSubscription(divInput.C.observe(expressionResolver, izsVar));
        divInputView.addSubscription(divInput.f.observeAndGet(expressionResolver, izsVar));
    }

    private final void observeMask(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver, Div2View div2View, final izs<? super BaseInputMask, s3q0> izsVar) {
        Expression<String> expression;
        Disposable observe;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final KeyListener keyListener = divInputView.getKeyListener();
        final wzs<Exception, gzs<? extends s3q0>, s3q0> wzsVar = new wzs<Exception, gzs<? extends s3q0>, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$catchCommonMaskException$1
            {
                super(2);
            }

            @Override // xsna.wzs
            public /* bridge */ /* synthetic */ s3q0 invoke(Exception exc, gzs<? extends s3q0> gzsVar) {
                invoke2(exc, (gzs<s3q0>) gzsVar);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Exception exc, gzs<s3q0> gzsVar) {
                if (!(exc instanceof PatternSyntaxException)) {
                    gzsVar.invoke();
                    return;
                }
                ErrorCollector.this.logError(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
            }
        };
        izs<? super String, s3q0> izsVar2 = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                BaseInputMask baseInputMask;
                Locale locale;
                s5 s5Var = DivInput.this.H;
                T t = 0;
                qmn a = s5Var != null ? s5Var.a() : null;
                Ref$ObjectRef<BaseInputMask> ref$ObjectRef2 = ref$ObjectRef;
                if (a instanceof m4) {
                    divInputView.setKeyListener(keyListener);
                    m4 m4Var = (m4) a;
                    String evaluate = m4Var.b.evaluate(expressionResolver);
                    List<m4.a> list = m4Var.c;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (m4.a aVar : list) {
                        char x0 = erm0.x0(aVar.a.evaluate(expressionResolver2));
                        Expression<String> expression2 = aVar.c;
                        String evaluate2 = expression2 != null ? expression2.evaluate(expressionResolver2) : null;
                        Character y0 = erm0.y0(aVar.b.evaluate(expressionResolver2));
                        arrayList.add(new BaseInputMask.MaskKey(x0, evaluate2, y0 != null ? y0.charValue() : (char) 0));
                    }
                    BaseInputMask.MaskData maskData = new BaseInputMask.MaskData(evaluate, arrayList, m4Var.a.evaluate(expressionResolver).booleanValue());
                    baseInputMask = ref$ObjectRef.element;
                    if (baseInputMask != null) {
                        BaseInputMask.updateMaskData$default(baseInputMask, maskData, false, 2, null);
                        t = baseInputMask;
                    } else {
                        final wzs<Exception, gzs<s3q0>, s3q0> wzsVar2 = wzsVar;
                        t = new FixedLengthInputMask(maskData, new izs<Exception, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public /* bridge */ /* synthetic */ s3q0 invoke(Exception exc) {
                                invoke2(exc);
                                return s3q0.a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Exception exc) {
                                wzsVar2.invoke(exc, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.2.1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // xsna.gzs
                                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                                        invoke2();
                                        return s3q0.a;
                                    }
                                });
                            }
                        });
                    }
                } else if (a instanceof kkn) {
                    Expression<String> expression3 = ((kkn) a).a;
                    String evaluate3 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                    if (evaluate3 != null) {
                        locale = Locale.forLanguageTag(evaluate3);
                        ErrorCollector errorCollector = orCreate;
                        String languageTag = locale.toLanguageTag();
                        if (!epx.f(languageTag, evaluate3)) {
                            errorCollector.logWarning(new IllegalArgumentException("Original locale tag '" + evaluate3 + "' is not equals to final one '" + languageTag + '\''));
                        }
                    } else {
                        locale = Locale.getDefault();
                    }
                    divInputView.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
                    BaseInputMask baseInputMask2 = ref$ObjectRef.element;
                    BaseInputMask baseInputMask3 = baseInputMask2;
                    if (baseInputMask3 != null) {
                        ((CurrencyInputMask) baseInputMask2).updateCurrencyParams(locale);
                        t = baseInputMask3;
                    } else {
                        final wzs<Exception, gzs<s3q0>, s3q0> wzsVar3 = wzsVar;
                        t = new CurrencyInputMask(locale, new izs<Exception, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public /* bridge */ /* synthetic */ s3q0 invoke(Exception exc) {
                                invoke2(exc);
                                return s3q0.a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Exception exc) {
                                wzsVar3.invoke(exc, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.4.1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // xsna.gzs
                                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                                        invoke2();
                                        return s3q0.a;
                                    }
                                });
                            }
                        });
                    }
                } else if (a instanceof znn) {
                    divInputView.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
                    baseInputMask = ref$ObjectRef.element;
                    if (baseInputMask != null) {
                        BaseInputMask.updateMaskData$default(baseInputMask, PhoneInputMaskKt.getDEFAULT_MASK_DATA(), false, 2, null);
                        t = baseInputMask;
                    } else {
                        final wzs<Exception, gzs<s3q0>, s3q0> wzsVar4 = wzsVar;
                        t = new PhoneInputMask(new izs<Exception, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public /* bridge */ /* synthetic */ s3q0 invoke(Exception exc) {
                                invoke2(exc);
                                return s3q0.a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Exception exc) {
                                wzsVar4.invoke(exc, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder.observeMask.updateMaskData.1.6.1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // xsna.gzs
                                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                                        invoke2();
                                        return s3q0.a;
                                    }
                                });
                            }
                        });
                    }
                } else {
                    divInputView.setKeyListener(keyListener);
                }
                ref$ObjectRef2.element = t;
                izsVar.invoke(ref$ObjectRef.element);
            }
        };
        s5 s5Var = divInput.H;
        qmn a = s5Var != null ? s5Var.a() : null;
        if (a instanceof m4) {
            m4 m4Var = (m4) a;
            divInputView.addSubscription(m4Var.b.observe(expressionResolver, izsVar2));
            for (m4.a aVar : m4Var.c) {
                divInputView.addSubscription(aVar.a.observe(expressionResolver, izsVar2));
                Expression<String> expression2 = aVar.c;
                if (expression2 != null) {
                    divInputView.addSubscription(expression2.observe(expressionResolver, izsVar2));
                }
                divInputView.addSubscription(aVar.b.observe(expressionResolver, izsVar2));
            }
            divInputView.addSubscription(m4Var.a.observe(expressionResolver, izsVar2));
        } else if ((a instanceof kkn) && (expression = ((kkn) a).a) != null && (observe = expression.observe(expressionResolver, izsVar2)) != null) {
            divInputView.addSubscription(observe);
        }
        izsVar2.invoke(s3q0.a);
    }

    private final void observeMaxLength(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression<Long> expression = divInput.I;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxLength$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                int i;
                DivInputView divInputView2 = DivInputView.this;
                long longValue = expression.evaluate(expressionResolver).longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        mq.a(longValue, "Unable convert '", "' to Int");
                    }
                    i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divInputView2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
            }
        }));
    }

    private final void observeMaxVisibleLines(final DivInputView divInputView, DivInput divInput, final ExpressionResolver expressionResolver) {
        final Expression<Long> expression = divInput.J;
        if (expression == null) {
            return;
        }
        divInputView.addSubscription(expression.observeAndGet(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeMaxVisibleLines$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                int i;
                DivInputView divInputView2 = DivInputView.this;
                long longValue = expression.evaluate(expressionResolver).longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        mq.a(longValue, "Unable convert '", "' to Int");
                    }
                    i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divInputView2.setMaxLines(i);
            }
        }));
    }

    private final void observeSelectAllOnFocus(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver) {
        divInputView.addSubscription(divInput.O.observeAndGet(expressionResolver, new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeSelectAllOnFocus$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivInputView.this.setSelectAllOnFocus(divInput.O.evaluate(expressionResolver).booleanValue());
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void observeText(final DivInputView divInputView, DivInput divInput, BindingContext bindingContext, DivStatePath divStatePath) {
        String str;
        String a;
        Div2View divView = bindingContext.getDivView();
        divInputView.removeAfterTextChangeListener();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        observeMask(divInputView, divInput, bindingContext.getExpressionResolver(), divView, new izs<BaseInputMask, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(BaseInputMask baseInputMask) {
                invoke2(baseInputMask);
                return s3q0.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BaseInputMask baseInputMask) {
                ref$ObjectRef.element = baseInputMask;
                if (baseInputMask != 0) {
                    DivInputView divInputView2 = divInputView;
                    divInputView2.setText(baseInputMask.getValue());
                    divInputView2.setSelection(baseInputMask.getCursorPosition());
                }
            }
        });
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        observeFilters(divInputView, divInput, bindingContext, new izs<InputFiltersHolder, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(InputFiltersHolder inputFiltersHolder) {
                invoke2(inputFiltersHolder);
                return s3q0.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InputFiltersHolder inputFiltersHolder) {
                String str2;
                ref$ObjectRef2.element = inputFiltersHolder;
                if (inputFiltersHolder != 0) {
                    DivInputView divInputView2 = divInputView;
                    Editable editableText = divInputView2.getEditableText();
                    if (editableText == null || (str2 = editableText.toString()) == null) {
                        str2 = "";
                    }
                    inputFiltersHolder.setCurrentValue(str2);
                    inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
                }
            }
        });
        s5 s5Var = divInput.H;
        String str2 = divInput.T;
        if (s5Var != null) {
            qmn a2 = s5Var.a();
            if (a2 == null || (a = a2.a()) == null) {
                return;
            } else {
                str = a;
            }
        } else {
            str = str2;
            str2 = null;
        }
        divInputView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, createCallbacks(divInputView, bindingContext, (BaseInputMask) ref$ObjectRef.element, (InputFiltersHolder) ref$ObjectRef2.element, divView, str2), divStatePath));
        observeValidators(divInputView, divInput, bindingContext.getExpressionResolver(), divView);
    }

    private final void observeTextAlignment(final DivInputView divInputView, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2, final ExpressionResolver expressionResolver) {
        applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
        izs<? super DivAlignmentHorizontal, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeTextAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivInputBinder.this.applyTextAlignment(divInputView, expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver));
            }
        };
        divInputView.addSubscription(expression.observe(expressionResolver, izsVar));
        divInputView.addSubscription(expression2.observe(expressionResolver, izsVar));
    }

    private final void observeValidators(final DivInputView divInputView, final DivInput divInput, final ExpressionResolver expressionResolver, final Div2View div2View) {
        final ArrayList arrayList = new ArrayList();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData());
        final izs<Integer, s3q0> izsVar = new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$revalidateExpressionValidator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                invoke(num.intValue());
                return s3q0.a;
            }

            public final void invoke(int i) {
                DivInputBinder.this.validate(arrayList.get(i), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
            }
        };
        divInputView.addTextChangedListener(new TextWatcher() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this.validate((ValidatorItemData) it.next(), String.valueOf(divInputView.getText()), divInputView, div2View, expressionResolver);
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        izs<? super String, s3q0> izsVar2 = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                ValidatorItemData validatorDataItem;
                arrayList.clear();
                List<b6> list = divInput.a0;
                if (list != null) {
                    DivInputBinder divInputBinder = this;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    ErrorCollector errorCollector = orCreate;
                    List<ValidatorItemData> list2 = arrayList;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        validatorDataItem = divInputBinder.toValidatorDataItem((b6) it.next(), expressionResolver2, errorCollector);
                        if (validatorDataItem != null) {
                            list2.add(validatorDataItem);
                        }
                    }
                    List<ValidatorItemData> list3 = arrayList;
                    DivInputBinder divInputBinder2 = this;
                    DivInputView divInputView2 = divInputView;
                    Div2View div2View2 = div2View;
                    ExpressionResolver expressionResolver3 = expressionResolver;
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        divInputBinder2.validate((ValidatorItemData) it2.next(), String.valueOf(divInputView2.getText()), divInputView2, div2View2, expressionResolver3);
                    }
                }
            }
        };
        List<b6> list = divInput.a0;
        if (list != null) {
            final int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                b6 b6Var = (b6) obj;
                if (b6Var instanceof b6.b) {
                    b6.b bVar = (b6.b) b6Var;
                    divInputView.addSubscription(bVar.b.c.observe(expressionResolver, izsVar2));
                    divInputView.addSubscription(bVar.b.b.observe(expressionResolver, izsVar2));
                    divInputView.addSubscription(bVar.b.a.observe(expressionResolver, izsVar2));
                } else {
                    if (!(b6Var instanceof b6.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b6.a aVar = (b6.a) b6Var;
                    divInputView.addSubscription(aVar.b.b.observe(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$observeValidators$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return s3q0.a;
                        }

                        public final void invoke(boolean z) {
                            izsVar.invoke(Integer.valueOf(i));
                        }
                    }));
                    divInputView.addSubscription(aVar.b.c.observe(expressionResolver, izsVar2));
                    divInputView.addSubscription(aVar.b.a.observe(expressionResolver, izsVar2));
                }
                i = i2;
            }
        }
        izsVar2.invoke(s3q0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValidatorItemData toValidatorDataItem(b6 b6Var, final ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        if (!(b6Var instanceof b6.b)) {
            if (!(b6Var instanceof b6.a)) {
                throw new NoWhenBranchMatchedException();
            }
            final f6 f6Var = ((b6.a) b6Var).b;
            return new ValidatorItemData(new ExpressionValidator(f6Var.a.evaluate(expressionResolver).booleanValue(), new gzs<Boolean>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$toValidatorDataItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // xsna.gzs
                public final Boolean invoke() {
                    return f6.this.b.evaluate(expressionResolver);
                }
            }), f6Var.d, f6Var.c.evaluate(expressionResolver));
        }
        l6 l6Var = ((b6.b) b6Var).b;
        try {
            return new ValidatorItemData(new RegexValidator(new Regex(l6Var.c.evaluate(expressionResolver)), l6Var.a.evaluate(expressionResolver).booleanValue()), l6Var.d, l6Var.b.evaluate(expressionResolver));
        } catch (PatternSyntaxException e) {
            errorCollector.logError(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + '\'', e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validate(ValidatorItemData validatorItemData, String str, DivInputView divInputView, Div2View div2View, ExpressionResolver expressionResolver) {
        boolean validate = validatorItemData.getValidator().validate(str);
        VariableMutationHandler.Companion.setVariable(div2View, validatorItemData.getVariableName(), String.valueOf(validate), expressionResolver);
        attachAccessibility(validatorItemData, div2View, divInputView, validate);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivInputView divInputView, BindingContext bindingContext, DivInput divInput, DivInput divInput2, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divInputView.setTextAlignment(5);
        divInputView.setAccessibilityEnabled$div_release(this.accessibilityStateProvider.isAccessibilityEnabled(divInputView.getContext()));
        observeBackground(divInputView, bindingContext, divInput, divInput2, expressionResolver);
        observeBaseTextProperties(divInputView, divInput, divInput2, expressionResolver);
        observeTextAlignment(divInputView, divInput.Q, divInput.R, expressionResolver);
        observeMaxVisibleLines(divInputView, divInput, expressionResolver);
        observeMaxLength(divInputView, divInput, expressionResolver);
        observeHintText(divInputView, divInput, expressionResolver);
        observeHintColor(divInputView, divInput, expressionResolver);
        observeHighlightColor(divInputView, divInput, expressionResolver);
        observeKeyboardTypeAndCapitalization(divInputView, divInput, expressionResolver);
        observeEnterTypeAndActions(divInputView, divInput, bindingContext, expressionResolver);
        observeSelectAllOnFocus(divInputView, divInput, expressionResolver);
        observeIsEnabled(divInputView, divInput, expressionResolver);
        observeText(divInputView, divInput, bindingContext, divStatePath);
        divInputView.setFocusTracker$div_release(bindingContext.getDivView().getInputFocusTracker$div_release());
        InputFocusTracker focusTracker$div_release = divInputView.getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            focusTracker$div_release.requestFocusIfNeeded(divInputView);
        }
    }
}
