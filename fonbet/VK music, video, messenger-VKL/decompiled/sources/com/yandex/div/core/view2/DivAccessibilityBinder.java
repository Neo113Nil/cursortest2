package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.e5;
import com.yandex.div2.e9;
import com.yandex.div2.fa;
import com.yandex.div2.y4;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.b0u0;
import xsna.drm0;
import xsna.epx;
import xsna.eut0;
import xsna.hk;
import xsna.ikn;
import xsna.iut0;
import xsna.izs;
import xsna.s3q0;
import xsna.v1v;

/* compiled from: DivAccessibilityBinder.kt */
/* loaded from: classes7.dex */
public class DivAccessibilityBinder {
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final boolean enabled;

    /* compiled from: DivAccessibilityBinder.kt */
    public enum AccessibilityType {
        NONE,
        BUTTON,
        EDIT_TEXT,
        HEADER,
        IMAGE,
        LIST,
        SLIDER,
        SELECT,
        TAB_WIDGET,
        PAGER,
        TEXT,
        RADIO_BUTTON,
        CHECK_BOX,
        CONTAINER
    }

    /* compiled from: DivAccessibilityBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DivAccessibility.Type.values().length];
            try {
                iArr[DivAccessibility.Type.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAccessibility.Type.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAccessibility.Type.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAccessibility.Type.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAccessibility.Type.TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAccessibility.Type.EDIT_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivAccessibility.Type.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivAccessibility.Type.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivAccessibility.Type.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DivAccessibility.Type.TAB_BAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DivAccessibility.Type.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DivAccessibility.Type.CHECKBOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccessibilityType.values().length];
            try {
                iArr2[AccessibilityType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AccessibilityType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AccessibilityType.EDIT_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[AccessibilityType.HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[AccessibilityType.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[AccessibilityType.LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[AccessibilityType.PAGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[AccessibilityType.SLIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[AccessibilityType.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[AccessibilityType.TAB_WIDGET.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[AccessibilityType.TEXT.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[AccessibilityType.CHECK_BOX.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[AccessibilityType.RADIO_BUTTON.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[AccessibilityType.CONTAINER.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DivAccessibilityBinder(boolean z, AccessibilityStateProvider accessibilityStateProvider) {
        this.enabled = z;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyCheckedState(View view, ikn iknVar, Boolean bool) {
        DivAccessibility.Type type;
        DivAccessibility x = iknVar.x();
        AccessibilityType accessibilityType = (x == null || (type = x.g) == null) ? null : toAccessibilityType(type, iknVar);
        if (accessibilityType == AccessibilityType.CHECK_BOX || accessibilityType == AccessibilityType.RADIO_BUTTON) {
            hk d = iut0.d(view);
            ExtensiveAccessibilityDelegate extensiveAccessibilityDelegate = d instanceof ExtensiveAccessibilityDelegate ? (ExtensiveAccessibilityDelegate) d : null;
            if (extensiveAccessibilityDelegate != null) {
                extensiveAccessibilityDelegate.setChecked(bool);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDescriptionAndHint(View view, String str, String str2) {
        if (str == null) {
            str = str2;
        } else if (str2 != null && !str.equals(str2)) {
            str = v1v.a('\n', str, str2);
        }
        view.setContentDescription(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyMode(View view, DivAccessibility.Mode mode) {
        DivAccessibility.Mode mode2 = DivAccessibility.Mode.MERGE;
        int i = 0;
        boolean z = mode == mode2;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        new eut0().d(view, Boolean.valueOf(z));
        if (mode == DivAccessibility.Mode.EXCLUDE) {
            i = 4;
        } else {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null && !drm0.N(contentDescription) && (mode == mode2 || (view instanceof DivImageView) || (view instanceof DivGifImageView))) {
                i = 1;
            }
        }
        view.setImportantForAccessibility(i);
    }

    public static /* synthetic */ void applyMode$default(DivAccessibilityBinder divAccessibilityBinder, View view, DivAccessibility.Mode mode, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMode");
        }
        if ((i & 1) != 0) {
            mode = null;
        }
        divAccessibilityBinder.applyMode(view, mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyStateDescription(View view, String str) {
        iut0.t(view, str);
    }

    private void applyType(View view, ikn iknVar, DivAccessibility.Type type) {
        if (type == null) {
            type = DivAccessibility.Type.AUTO;
        }
        hk accessibilityDelegate = getAccessibilityDelegate(view, toAccessibilityType(type, iknVar));
        if (accessibilityDelegate != null) {
            iut0.q(view, accessibilityDelegate);
        }
    }

    private void bindCheckedState(final View view, final ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility x;
        DivAccessibility x2 = iknVar.x();
        Expression<Boolean> expression = x2 != null ? x2.c : null;
        if (ExpressionsKt.equalsToConstant(expression, (iknVar2 == null || (x = iknVar2.x()) == null) ? null : x.c)) {
            return;
        }
        applyCheckedState(view, iknVar, expression != null ? expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new izs<Boolean, s3q0>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindCheckedState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return s3q0.a;
            }

            public final void invoke(boolean z) {
                DivAccessibilityBinder.this.applyCheckedState(view, iknVar, Boolean.valueOf(z));
            }
        }) : null);
    }

    private void bindDescriptionAndHint(final View view, final ikn iknVar, ikn iknVar2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility x;
        DivAccessibility x2;
        DivAccessibility x3 = iknVar.x();
        final Expression<String> expression = x3 != null ? x3.a : null;
        DivAccessibility x4 = iknVar.x();
        final Expression<String> expression2 = x4 != null ? x4.b : null;
        if (ExpressionsKt.equalsToConstant(expression, (iknVar2 == null || (x2 = iknVar2.x()) == null) ? null : x2.a)) {
            if (ExpressionsKt.equalsToConstant(expression2, (iknVar2 == null || (x = iknVar2.x()) == null) ? null : x.b)) {
                return;
            }
        }
        applyDescriptionAndHint(view, expression != null ? expression.evaluate(expressionResolver) : null, expression2 != null ? expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression) && ExpressionsKt.isConstantOrNull(expression2)) {
            return;
        }
        izs<? super String, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindDescriptionAndHint$callback$1
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
                Expression<DivAccessibility.Mode> expression3;
                DivAccessibilityBinder divAccessibilityBinder = DivAccessibilityBinder.this;
                View view2 = view;
                Expression<String> expression4 = expression;
                DivAccessibility.Mode mode = null;
                String evaluate = expression4 != null ? expression4.evaluate(expressionResolver) : null;
                Expression<String> expression5 = expression2;
                divAccessibilityBinder.applyDescriptionAndHint(view2, evaluate, expression5 != null ? expression5.evaluate(expressionResolver) : null);
                DivAccessibilityBinder divAccessibilityBinder2 = DivAccessibilityBinder.this;
                View view3 = view;
                DivAccessibility x5 = iknVar.x();
                if (x5 != null && (expression3 = x5.d) != null) {
                    mode = expression3.evaluate(expressionResolver);
                }
                divAccessibilityBinder2.applyMode(view3, mode);
            }
        };
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, izsVar) : null);
        expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, izsVar) : null);
    }

    private void bindMode(final View view, ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility x;
        if (getEnabled()) {
            DivAccessibility x2 = iknVar.x();
            Expression<DivAccessibility.Mode> expression = x2 != null ? x2.d : null;
            if (ExpressionsKt.equalsToConstant(expression, (iknVar2 == null || (x = iknVar2.x()) == null) ? null : x.d)) {
                return;
            }
            applyMode(view, expression != null ? expression.evaluate(expressionResolver) : null);
            if (ExpressionsKt.isConstantOrNull(expression)) {
                return;
            }
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new izs<DivAccessibility.Mode, s3q0>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindMode$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(DivAccessibility.Mode mode) {
                    invoke2(mode);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DivAccessibility.Mode mode) {
                    DivAccessibilityBinder.this.applyMode(view, mode);
                }
            }) : null);
        }
    }

    private void bindStateDescription(final View view, ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivAccessibility x;
        DivAccessibility x2 = iknVar.x();
        Expression<String> expression = x2 != null ? x2.f : null;
        if (ExpressionsKt.equalsToConstant(expression, (iknVar2 == null || (x = iknVar2.x()) == null) ? null : x.f)) {
            return;
        }
        applyStateDescription(view, expression != null ? expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(expression)) {
            return;
        }
        expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindStateDescription$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                invoke2(str);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                DivAccessibilityBinder.this.applyStateDescription(view, str);
            }
        }) : null);
    }

    private void bindType(View view, ikn iknVar, ikn iknVar2) {
        if (this.accessibilityStateProvider.isAccessibilityEnabled(view.getContext())) {
            if (iknVar2 != null) {
                DivAccessibility x = iknVar.x();
                DivAccessibility.Type type = x != null ? x.g : null;
                DivAccessibility x2 = iknVar2.x();
                if (type == (x2 != null ? x2.g : null)) {
                    return;
                }
            }
            DivAccessibility x3 = iknVar.x();
            applyType(view, iknVar, x3 != null ? x3.g : null);
        }
    }

    private hk getAccessibilityDelegate(View view, AccessibilityType accessibilityType) {
        if (accessibilityType == AccessibilityType.LIST && (view instanceof BackHandlingRecyclerView)) {
            return new AccessibilityListDelegate((BackHandlingRecyclerView) view);
        }
        String toClassName = getToClassName(accessibilityType);
        boolean z = accessibilityType == AccessibilityType.HEADER;
        CharSequence accessibilityClassName = view.getAccessibilityClassName();
        if (!(toClassName.length() == 0 || epx.f(toClassName, accessibilityClassName)) || z) {
            return new ExtensiveAccessibilityDelegate(toClassName, z, accessibilityType == AccessibilityType.CHECK_BOX || accessibilityType == AccessibilityType.RADIO_BUTTON);
        }
        return null;
    }

    private String getToClassName(AccessibilityType accessibilityType) {
        switch (WhenMappings.$EnumSwitchMapping$1[accessibilityType.ordinal()]) {
            case 1:
                return "";
            case 2:
                return "android.widget.Button";
            case 3:
                return "android.widget.EditText";
            case 4:
                return "";
            case 5:
                return "android.widget.ImageView";
            case 6:
                return "";
            case 7:
                return "androidx.viewpager.widget.ViewPager";
            case 8:
                return "";
            case 9:
                return "android.widget.Spinner";
            case 10:
                return "android.widget.TabWidget";
            case 11:
                return "android.widget.TextView";
            case 12:
                return "android.widget.CheckBox";
            case 13:
                return "android.widget.RadioButton";
            case 14:
                return "android.view.ViewGroup";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private AccessibilityType toAccessibilityType(DivAccessibility.Type type, ikn iknVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                if (iknVar instanceof DivInput) {
                    return AccessibilityType.EDIT_TEXT;
                }
                if (iknVar instanceof DivText) {
                    return AccessibilityType.TEXT;
                }
                if (iknVar instanceof DivTabs) {
                    return AccessibilityType.TAB_WIDGET;
                }
                if (iknVar instanceof e9) {
                    return AccessibilityType.SELECT;
                }
                if (iknVar instanceof fa) {
                    return AccessibilityType.SLIDER;
                }
                if (iknVar instanceof e5) {
                    return AccessibilityType.IMAGE;
                }
                if (iknVar instanceof y4) {
                    return AccessibilityType.IMAGE;
                }
                if (iknVar instanceof DivGallery) {
                    DivAccessibility divAccessibility = ((DivGallery) iknVar).a;
                    if ((divAccessibility != null ? divAccessibility.a : null) != null) {
                        return AccessibilityType.PAGER;
                    }
                }
                return iknVar instanceof DivContainer ? AccessibilityType.CONTAINER : AccessibilityType.NONE;
            case 2:
                return AccessibilityType.NONE;
            case 3:
                return AccessibilityType.BUTTON;
            case 4:
                return AccessibilityType.IMAGE;
            case 5:
                return AccessibilityType.TEXT;
            case 6:
                return AccessibilityType.EDIT_TEXT;
            case 7:
                return AccessibilityType.HEADER;
            case 8:
                return AccessibilityType.LIST;
            case 9:
                return AccessibilityType.SELECT;
            case 10:
                return AccessibilityType.TAB_WIDGET;
            case 11:
                return AccessibilityType.RADIO_BUTTON;
            case 12:
                return AccessibilityType.CHECK_BOX;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public void bind(View view, ikn iknVar, ikn iknVar2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (iknVar.x() == null) {
            if ((iknVar2 != null ? iknVar2.x() : null) == null) {
                if (getEnabled()) {
                    applyMode$default(this, view, null, 1, null);
                    return;
                }
                return;
            }
        }
        bindType(view, iknVar, iknVar2);
        bindDescriptionAndHint(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindMode(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindStateDescription(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
        bindCheckedState(view, iknVar, iknVar2, expressionResolver, expressionSubscriber);
    }

    public boolean getEnabled() {
        return this.enabled;
    }
}
