package com.yandex.go.chargers.design.components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.payment.common.result.ResultType;
import defpackage.a2i0;
import defpackage.bdc;
import defpackage.cc6;
import defpackage.dc6;
import defpackage.dn7;
import defpackage.ex0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.mcb1;
import defpackage.mrg0;
import defpackage.nm7;
import defpackage.ny61;
import defpackage.scc;
import defpackage.t1w;
import defpackage.tje;
import defpackage.tls;
import defpackage.uo9;
import defpackage.vo9;
import defpackage.xng0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001>B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\u001fJ\u001b\u0010)\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b*\u0010\u001fJ\u001b\u0010+\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b+\u0010\u0013J\u0011\u0010-\u001a\u00020,*\u00020,¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/yandex/go/chargers/design/components/ChargersButtonsView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Luj9;", "Lzy11;", "onButtonClickListener", "", "wrapInBottomContainerShadow", "<init>", "(Landroid/content/Context;Ltls;Z)V", "", "Luo9;", "buttons", "isTextOnlyUpdated", "(Ljava/util/List;)Z", "isSameButtonsWithDifferentState", "updateButtonsTexts", "(Ljava/util/List;)V", "withAnimation", "updateConstraints", "(Ljava/util/List;Z)V", "applyConstraintSet", "button", "Lru/yandex/taxi/design/ButtonComponent;", "createButton", "(Luo9;)Lru/yandex/taxi/design/ButtonComponent;", "updateButtonBackground", "(Lru/yandex/taxi/design/ButtonComponent;Luo9;)V", "onAttachedToWindow", "()V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parentToAttach", "attach", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "Lt1w;", "insets", "handleInsets", "(Lt1w;)V", ResultType.RESULT_TYPE_LOADING, "success", "onDetachedFromWindow", "updateButtons", "", "getFirstIconFromText", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Ltls;", "Z", "Ldc6;", "bottomContainerShadow", "Ldc6;", ClidProvider.STATE, "Ljava/util/List;", "vo9", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersButtonsView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final dc6 bottomContainerShadow;
    private final tls onButtonClickListener;
    private List<uo9> state;
    private final boolean wrapInBottomContainerShadow;

    public ChargersButtonsView(Context context, tls tlsVar, boolean z) {
        super(context, null, 0, 0, 14, null);
        this.onButtonClickListener = tlsVar;
        this.wrapInBottomContainerShadow = z;
        this.bottomContainerShadow = new dc6(context);
        this.state = EmptyList.a;
        setId(View.generateViewId());
        int u = tje.u(8, getContext());
        int u2 = tje.u(8, getContext());
        setPadding(u, u2, u, u2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r10 != (r4 - 1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r6 >= getChildCount()) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r7 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        r7 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (getChildAt(r6) == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r5 < 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        defpackage.scc.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        defpackage.ny61.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        if (r10 != (r5 - 1)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c5, code lost:
    
        r5 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        r2.i(r3, 7, r4, r5);
        r2.i(r14.getId(), 3, 0, 3);
        r2.i(r14.getId(), 4, 0, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
    
        if (r13.g == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00df, code lost:
    
        r2.o(r14.getId()).e.z = "1:1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fa, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ee, code lost:
    
        r2.o(r14.getId()).e.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c7, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a8, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0096, code lost:
    
        r4 = getChildAt(r11).getId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void applyConstraintSet(List<uo9> buttons) {
        int r = tje.r(mrg0.go_design_s_space, getContext());
        e eVar = new e();
        eVar.g(this);
        int i = 0;
        for (Object obj : buttons) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            uo9 uo9Var = (uo9) obj;
            View childAt = getChildAt(i);
            ButtonComponent buttonComponent = childAt instanceof ButtonComponent ? (ButtonComponent) childAt : null;
            if (buttonComponent != null) {
                updateButtonBackground(buttonComponent, uo9Var);
            }
            eVar.j(childAt.getId(), 6, i == 0 ? 0 : getChildAt(i - 1).getId(), i == 0 ? 6 : 7, i == 0 ? 0 : r);
            int id = childAt.getId();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (!(i4 < getChildCount())) {
                    break;
                }
                int i5 = i4 + 1;
                if (getChildAt(i4) == null) {
                    ny61.s();
                    return;
                }
                i3++;
                if (i3 < 0) {
                    scc.l();
                    throw null;
                }
                i4 = i5;
            }
        }
        eVar.b(this);
    }

    private final ButtonComponent createButton(uo9 button) {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(0, -2));
        buttonComponent.setId(View.generateViewId());
        buttonComponent.setOutline(0, null);
        boolean z = button.g;
        CharSequence charSequence = button.a;
        buttonComponent.setText(z ? getFirstIconFromText(charSequence) : mcb1.b(buttonComponent, charSequence, null, 0, 12));
        updateButtonBackground(buttonComponent, button);
        buttonComponent.setEnabled(button.c);
        buttonComponent.setDebounceClickListener(new nm7(24, this, button));
        return buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButton$lambda$0$0(ChargersButtonsView chargersButtonsView, uo9 uo9Var) {
        chargersButtonsView.onButtonClickListener.invoke(uo9Var.d);
    }

    private final boolean isSameButtonsWithDifferentState(List<uo9> buttons) {
        if (this.state.size() != buttons.size()) {
            return false;
        }
        ArrayList P0 = a.P0(this.state, buttons);
        if (P0.isEmpty()) {
            return true;
        }
        Iterator it = P0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (!jl40.l(((uo9) pair.getFirst()).d, ((uo9) pair.getSecond()).d)) {
                return false;
            }
        }
        return true;
    }

    private final boolean isTextOnlyUpdated(List<uo9> buttons) {
        if (this.state.size() != buttons.size()) {
            return false;
        }
        ArrayList P0 = a.P0(this.state, buttons);
        if (P0.isEmpty()) {
            return true;
        }
        Iterator it = P0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            uo9 uo9Var = (uo9) pair.getFirst();
            uo9 uo9Var2 = (uo9) pair.getSecond();
            if (uo9Var.c != uo9Var2.c || uo9Var.g != uo9Var2.g || uo9Var.e != uo9Var2.e || uo9Var.h != uo9Var2.h || !jl40.l(uo9Var.d, uo9Var2.d)) {
                return false;
            }
        }
        return true;
    }

    private final void updateButtonBackground(ButtonComponent buttonComponent, uo9 uo9Var) {
        kdc kdcVar = uo9Var.f;
        if (kdcVar != null) {
            buttonComponent.setButtonBackground(kdcVar);
            buttonComponent.setDisabledButtonBackground(uo9Var.f);
        } else {
            bdc bdcVar = new bdc(uo9Var.e ? xng0.controlMain : xng0.controlMinor);
            buttonComponent.setButtonBackground(bdcVar);
            buttonComponent.setDisabledButtonBackground(bdcVar);
        }
        buttonComponent.setAlpha(uo9Var.c ? 1.0f : 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonsTexts(List<uo9> buttons) {
        int i = 0;
        for (Object obj : buttons) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            uo9 uo9Var = (uo9) obj;
            View childAt = getChildAt(i);
            ButtonComponent buttonComponent = childAt instanceof ButtonComponent ? (ButtonComponent) childAt : null;
            if (buttonComponent != null) {
                boolean z = uo9Var.g;
                CharSequence charSequence = uo9Var.a;
                buttonComponent.setText(z ? getFirstIconFromText(charSequence) : mcb1.b(buttonComponent, charSequence, null, 0, 12));
            }
            i = i2;
        }
    }

    private final void updateConstraints(List<uo9> buttons, boolean withAnimation) {
        ex0 ex0Var = new ex0(withAnimation, this, buttons, 6);
        if (withAnimation) {
            post(new dn7(23, ex0Var));
        } else {
            ex0Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateConstraints$lambda$0(boolean z, ChargersButtonsView chargersButtonsView, List list) {
        if (z) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 300L;
            changeBounds.w = new AccelerateDecelerateInterpolator();
            changeBounds.a(new vo9(chargersButtonsView, list));
            TransitionManager.a(changeBounds, chargersButtonsView);
        }
        chargersButtonsView.applyConstraintSet(list);
        return zy11.a;
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        if (this.wrapInBottomContainerShadow) {
            this.bottomContainerShadow.c();
        }
        invalidate();
    }

    public final void attach(CoordinatorLayout parentToAttach) {
        if (getParent() != null) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        }
        CoordinatorLayout.LayoutParams layoutParams = new CoordinatorLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        parentToAttach.addView(this, layoutParams);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.wrapInBottomContainerShadow) {
            this.bottomContainerShadow.b(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final CharSequence getFirstIconFromText(CharSequence charSequence) {
        if (!(charSequence instanceof SpannableStringBuilder)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequence;
        CustomImageSpan[] customImageSpanArr = (CustomImageSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), CustomImageSpan.class);
        if (customImageSpanArr.length > 0) {
            CustomImageSpan customImageSpan = customImageSpanArr[0];
            int spanStart = spannableStringBuilder2.getSpanStart(customImageSpan);
            int spanEnd = spannableStringBuilder2.getSpanEnd(customImageSpan);
            spannableStringBuilder.append(spannableStringBuilder2.subSequence(spanStart, spanEnd));
            spannableStringBuilder.setSpan(customImageSpan, spannableStringBuilder.length() - (spanEnd - spanStart), spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void handleInsets(t1w insets) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), tje.u(8, getContext()) + insets.g);
    }

    public final void loading() {
        removeAllViews();
        Context context = getContext();
        int u = tje.u(56, getContext());
        ShimmeringBar shimmeringBar = new ShimmeringBar(context, null, 0, a2i0.StandartShimmeringBarStyle, 6, null);
        shimmeringBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, u));
        addView(shimmeringBar);
        this.state = EmptyList.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.wrapInBottomContainerShadow) {
            this.bottomContainerShadow.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.wrapInBottomContainerShadow) {
            dc6 dc6Var = this.bottomContainerShadow;
            dc6Var.g = null;
            cc6 cc6Var = dc6Var.h;
            if (cc6Var != null) {
                cc6Var.cancel();
            }
        }
    }

    public final void success(List<uo9> buttons) {
        if (isTextOnlyUpdated(buttons)) {
            updateButtonsTexts(buttons);
        } else if (isSameButtonsWithDifferentState(buttons)) {
            updateConstraints(buttons, true);
        } else {
            updateButtons(buttons);
        }
        this.state = buttons;
    }

    public final void updateButtons(List<uo9> buttons) {
        removeAllViews();
        setVisibility(!buttons.isEmpty() ? 0 : 8);
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            addView(createButton((uo9) it.next()));
        }
        updateConstraints(buttons, false);
    }

    public /* synthetic */ ChargersButtonsView(Context context, tls tlsVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, tlsVar, (i & 4) != 0 ? true : z);
    }
}
