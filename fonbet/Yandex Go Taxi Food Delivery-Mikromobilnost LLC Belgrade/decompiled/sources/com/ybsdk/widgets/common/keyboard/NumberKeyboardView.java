package com.ybsdk.widgets.common.keyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.inputmethod.InputConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.keyboard.delegators.KeyboardImageView;
import com.ybsdk.widgets.common.keyboard.delegators.KeyboardTextButtonView;
import defpackage.akb1;
import defpackage.h8;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lcb1;
import defpackage.lwg0;
import defpackage.m810;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sls;
import defpackage.sza;
import defpackage.tls;
import defpackage.ub60;
import defpackage.vm60;
import defpackage.w3i0;
import defpackage.w511;
import defpackage.wm60;
import defpackage.xm60;
import defpackage.ym60;
import defpackage.zm60;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.VMInspector.OpenList;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 `2\u00020\u0001:\u0003.abB3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\u001cJ\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\rJ\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\rJ\u0015\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0011J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020.H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u00107R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R*\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010H\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR0\u0010M\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u000b\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR*\u0010[\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010?\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010\u001cR\u0011\u0010_\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b_\u0010]¨\u0006c"}, d2 = {"Lcom/ybsdk/widgets/common/keyboard/NumberKeyboardView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "keyboardId", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/Integer;)V", "Lzy11;", "onAttachedToWindow", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "setSkeletonMode", "hide", OpenList.STR_OPEN, "Lcom/ybsdk/widgets/common/keyboard/NumberKeyboardView$AdditionalButtonType;", "buttonType", "setAdditionalButtonType", "(Lcom/ybsdk/widgets/common/keyboard/NumberKeyboardView$AdditionalButtonType;)V", "from", "to", "animate", "", "Lzm60;", "generateKeyboardList", "()Ljava/util/List;", "type", "Landroid/view/View;", "createKey", "(Lzm60;)Landroid/view/View;", "keyEventCode", "sendKeyEvent", "(I)V", "Ljava/lang/Integer;", "Lcom/ybsdk/widgets/common/keyboard/delegators/KeyboardImageView;", "biometricView", "Lcom/ybsdk/widgets/common/keyboard/delegators/KeyboardImageView;", "additionalButton", "Lzm60;", "hidden", "Z", "divkitMode", "Lkotlin/Function0;", "onKeyBackspacePressed", "Lsls;", "getOnKeyBackspacePressed", "()Lsls;", "setOnKeyBackspacePressed", "(Lsls;)V", "onBiometricPressed", "getOnBiometricPressed", "setOnBiometricPressed", "Lkotlin/Function1;", "", "onCharPressed", "Ltls;", "getOnCharPressed", "()Ltls;", "setOnCharPressed", "(Ltls;)V", "Landroid/view/inputmethod/InputConnection;", "inputConnection", "Landroid/view/inputmethod/InputConnection;", "getInputConnection", "()Landroid/view/inputmethod/InputConnection;", "setInputConnection", "(Landroid/view/inputmethod/InputConnection;)V", "value", "biometricEnabled", "getBiometricEnabled", "()Z", "setBiometricEnabled", "isOpen", "Companion", "AdditionalButtonType", "vm60", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NumberKeyboardView extends ViewGroup {
    private static final int COLUMN_COUNT = 3;
    public static final vm60 Companion = new vm60();
    private static final float KEYBOARD_ALPHA_FULL = 1.0f;
    private static final float KEYBOARD_ALPHA_INACTIVE = 0.5f;
    private static final double KEYBOARD_HEIGHT_PERCENT = 0.38d;
    private static final long OPEN_HIDE_ANIMATION_DURATION_MS = 100;
    private static final int ROW_COUNT = 4;
    private zm60 additionalButton;
    private boolean biometricEnabled;
    private KeyboardImageView biometricView;
    private boolean divkitMode;
    private boolean hidden;
    private InputConnection inputConnection;
    private final Integer keyboardId;
    private sls onBiometricPressed;
    private tls onCharPressed;
    private sls onKeyBackspacePressed;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/widgets/common/keyboard/NumberKeyboardView$AdditionalButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/ybsdk/widgets/common/keyboard/a", "BIOMETRIC", "COMMA", "EMPTY", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdditionalButtonType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AdditionalButtonType[] $VALUES;
        public static final a Companion;
        public static final AdditionalButtonType BIOMETRIC = new AdditionalButtonType("BIOMETRIC", 0);
        public static final AdditionalButtonType COMMA = new AdditionalButtonType("COMMA", 1);
        public static final AdditionalButtonType EMPTY = new AdditionalButtonType("EMPTY", 2);

        private static final /* synthetic */ AdditionalButtonType[] $values() {
            return new AdditionalButtonType[]{BIOMETRIC, COMMA, EMPTY};
        }

        static {
            AdditionalButtonType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a();
        }

        private AdditionalButtonType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static AdditionalButtonType valueOf(String str) {
            return (AdditionalButtonType) Enum.valueOf(AdditionalButtonType.class, str);
        }

        public static AdditionalButtonType[] values() {
            return (AdditionalButtonType[]) $VALUES.clone();
        }
    }

    public NumberKeyboardView(Context context, AttributeSet attributeSet, int i, Integer num) {
        super(context, attributeSet, i);
        zm60 zm60Var;
        this.keyboardId = num;
        this.additionalButton = new xm60(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, w3i0.YbSdkNumberKeyboardView, i, 0);
        int i2 = obtainStyledAttributes.getInt(w3i0.YbSdkNumberKeyboardView_ybsdk_additionalButtonType, -1);
        if (i2 >= 0 && i2 < AdditionalButtonType.values().length) {
            AdditionalButtonType.Companion.getClass();
            int i3 = b.a[AdditionalButtonType.values()[i2].ordinal()];
            if (i3 == 1) {
                zm60Var = ym60.b;
            } else if (i3 == 2) {
                zm60Var = new xm60(true);
            } else {
                if (i3 != 3) {
                    w511.b();
                    throw null;
                }
                zm60Var = wm60.b;
            }
            this.additionalButton = zm60Var;
        }
        this.hidden = obtainStyledAttributes.getBoolean(w3i0.YbSdkNumberKeyboardView_ybsdk_hidden, false);
        this.divkitMode = obtainStyledAttributes.getBoolean(w3i0.YbSdkNumberKeyboardView_ybsdk_divkit_mode, false);
        obtainStyledAttributes.recycle();
        Iterator<T> it = generateKeyboardList().iterator();
        while (it.hasNext()) {
            addView(createKey((zm60) it.next()));
        }
        setImportantForAccessibility(2);
        setPadding(com.ybsdk.core.utils.ext.view.b.h(lwg0.ybsdk_keyboard_margin_horizontal, this), getPaddingTop(), com.ybsdk.core.utils.ext.view.b.h(lwg0.ybsdk_keyboard_margin_horizontal, this), com.ybsdk.core.utils.ext.view.b.h(lwg0.ybsdk_keyboard_margin_bottom, this));
    }

    private final void animate(final int from, final int to) {
        Animation animation = new Animation() { // from class: com.ybsdk.widgets.common.keyboard.NumberKeyboardView$animate$animation$1
            @Override // android.view.animation.Animation
            public void applyTransformation(float interpolatedTime, Transformation t) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) NumberKeyboardView.this.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) (((to - r0) * interpolatedTime) + from);
                NumberKeyboardView.this.setLayoutParams(layoutParams);
            }
        };
        animation.setDuration(100L);
        startAnimation(animation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View createKey(zm60 type) {
        int i = 2;
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (jl40.l(type, wm60.a)) {
            KeyboardImageView keyboardImageView = new KeyboardImageView(getContext(), attributeSet, i, objArr5 == true ? 1 : 0);
            keyboardImageView.render(type);
            final int i2 = 0;
            keyboardImageView.setOnItemClicked(new sls(this) { // from class: um60
                public final /* synthetic */ NumberKeyboardView b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    zy11 createKey$lambda$8$lambda$7;
                    zy11 createKey$lambda$10$lambda$9;
                    int i3 = i2;
                    NumberKeyboardView numberKeyboardView = this.b;
                    switch (i3) {
                        case 0:
                            createKey$lambda$8$lambda$7 = NumberKeyboardView.createKey$lambda$8$lambda$7(numberKeyboardView);
                            return createKey$lambda$8$lambda$7;
                        default:
                            createKey$lambda$10$lambda$9 = NumberKeyboardView.createKey$lambda$10$lambda$9(numberKeyboardView);
                            return createKey$lambda$10$lambda$9;
                    }
                }
            });
            return keyboardImageView;
        }
        if (type instanceof xm60) {
            KeyboardImageView keyboardImageView2 = new KeyboardImageView(getContext(), objArr4 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
            keyboardImageView2.render(type);
            final int i3 = 1;
            keyboardImageView2.setOnItemClicked(new sls(this) { // from class: um60
                public final /* synthetic */ NumberKeyboardView b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    zy11 createKey$lambda$8$lambda$7;
                    zy11 createKey$lambda$10$lambda$9;
                    int i32 = i3;
                    NumberKeyboardView numberKeyboardView = this.b;
                    switch (i32) {
                        case 0:
                            createKey$lambda$8$lambda$7 = NumberKeyboardView.createKey$lambda$8$lambda$7(numberKeyboardView);
                            return createKey$lambda$8$lambda$7;
                        default:
                            createKey$lambda$10$lambda$9 = NumberKeyboardView.createKey$lambda$10$lambda$9(numberKeyboardView);
                            return createKey$lambda$10$lambda$9;
                    }
                }
            });
            this.biometricView = keyboardImageView2;
            return keyboardImageView2;
        }
        if (type instanceof ym60) {
            KeyboardTextButtonView keyboardTextButtonView = new KeyboardTextButtonView(getContext(), objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
            keyboardTextButtonView.setItem((ym60) type);
            keyboardTextButtonView.setOnTextPressedCallback(new ub60(i, this));
            return keyboardTextButtonView;
        }
        if (jl40.l(type, wm60.b)) {
            return new View(getContext());
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createKey$lambda$10$lambda$9(NumberKeyboardView numberKeyboardView) {
        sls slsVar = numberKeyboardView.onBiometricPressed;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createKey$lambda$12$lambda$11(NumberKeyboardView numberKeyboardView, char c) {
        if (Character.isDigit(c)) {
            numberKeyboardView.sendKeyEvent(sza.d(c) + 7);
        }
        tls tlsVar = numberKeyboardView.onCharPressed;
        if (tlsVar != null) {
            tlsVar.invoke(Character.valueOf(c));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createKey$lambda$8$lambda$7(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.sendKeyEvent(67);
        sls slsVar = numberKeyboardView.onKeyBackspacePressed;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    private final List<zm60> generateKeyboardList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 10; i++) {
            if (i < 0 || i >= 10) {
                ny61.g(oyr.j(i, "Int ", " is not a decimal digit"));
                return null;
            }
            arrayList.add(new ym60((char) (i + 48)));
        }
        arrayList.add(this.additionalButton);
        arrayList.add(new ym60(MoneyInputEditView.DEFAULT_VALUE));
        arrayList.add(wm60.a);
        return arrayList;
    }

    private final void sendKeyEvent(int keyEventCode) {
        InputConnection inputConnection = this.inputConnection;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new KeyEvent(0, keyEventCode));
        }
        InputConnection inputConnection2 = this.inputConnection;
        if (inputConnection2 != null) {
            inputConnection2.sendKeyEvent(new KeyEvent(1, keyEventCode));
        }
    }

    public final boolean getBiometricEnabled() {
        return this.biometricEnabled;
    }

    public final InputConnection getInputConnection() {
        return this.inputConnection;
    }

    public final sls getOnBiometricPressed() {
        return this.onBiometricPressed;
    }

    public final tls getOnCharPressed() {
        return this.onCharPressed;
    }

    public final sls getOnKeyBackspacePressed() {
        return this.onKeyBackspacePressed;
    }

    public final void hide() {
        animate(((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) getLayoutParams())).bottomMargin, -getHeight());
    }

    public final boolean isOpen() {
        return ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) getLayoutParams())).bottomMargin == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        lcb1.d(this);
        super.onAttachedToWindow();
        Integer num = this.keyboardId;
        if (num != null) {
            setId(num.intValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View view;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        h8 h8Var = new h8(3, this);
        while (true) {
            int i = 0;
            while (h8Var.hasNext()) {
                view = (View) h8Var.next();
                view.layout(paddingStart, paddingTop, view.getMeasuredWidth() + paddingStart, view.getMeasuredHeight() + paddingTop);
                i++;
                int measuredWidth = view.getMeasuredWidth() + paddingStart;
                if (i == 3) {
                    break;
                } else {
                    paddingStart = measuredWidth;
                }
            }
            return;
            paddingStart = getPaddingStart();
            paddingTop = view.getMeasuredHeight() + paddingTop;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int i = 3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((size - getPaddingStart()) - getPaddingEnd()) / 3, 1073741824);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (!this.divkitMode) {
            size2 = m810.a(((akb1.e(getContext(), "navigation_bar_height") + size2) * KEYBOARD_HEIGHT_PERCENT) - akb1.e(getContext(), "navigation_bar_height"));
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((size2 - getPaddingBottom()) - getPaddingTop()) / 4, 1073741824);
        h8 h8Var = new h8(i, this);
        while (h8Var.hasNext()) {
            ((View) h8Var.next()).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        if (this.hidden) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -h;
            setLayoutParams(layoutParams);
            this.hidden = false;
        }
        super.onSizeChanged(w, h, oldw, oldh);
    }

    public final void open() {
        animate(((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) getLayoutParams())).bottomMargin, 0);
    }

    public final void setAdditionalButtonType(AdditionalButtonType buttonType) {
        zm60 zm60Var;
        int i = b.a[buttonType.ordinal()];
        if (i == 1) {
            zm60Var = ym60.b;
        } else if (i == 2) {
            zm60Var = new xm60(true);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            zm60Var = wm60.b;
        }
        if (zm60Var.equals(this.additionalButton)) {
            return;
        }
        this.additionalButton = zm60Var;
        removeAllViews();
        Iterator<T> it = generateKeyboardList().iterator();
        while (it.hasNext()) {
            addView(createKey((zm60) it.next()));
        }
    }

    public final void setBiometricEnabled(boolean z) {
        if (z != this.biometricEnabled) {
            this.biometricEnabled = z;
            KeyboardImageView keyboardImageView = this.biometricView;
            if (keyboardImageView != null) {
                keyboardImageView.render(new xm60(z));
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        h8 h8Var = new h8(3, this);
        while (h8Var.hasNext()) {
            ((View) h8Var.next()).setEnabled(enabled);
        }
    }

    public final void setInputConnection(InputConnection inputConnection) {
        this.inputConnection = inputConnection;
    }

    public final void setOnBiometricPressed(sls slsVar) {
        this.onBiometricPressed = slsVar;
    }

    public final void setOnCharPressed(tls tlsVar) {
        this.onCharPressed = tlsVar;
    }

    public final void setOnKeyBackspacePressed(sls slsVar) {
        this.onKeyBackspacePressed = slsVar;
    }

    public final void setSkeletonMode(boolean enabled) {
        setAlpha(!this.hidden ? enabled ? 0.5f : 1.0f : 0.0f);
    }

    public NumberKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    public NumberKeyboardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
    }

    public /* synthetic */ NumberKeyboardView(Context context, AttributeSet attributeSet, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : num);
    }

    public NumberKeyboardView(Context context) {
        this(context, null, 0, null, 14, null);
    }
}
