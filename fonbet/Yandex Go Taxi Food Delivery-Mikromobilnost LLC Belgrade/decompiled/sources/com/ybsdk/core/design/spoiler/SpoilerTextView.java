package com.ybsdk.core.design.spoiler;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.design.spoiler.Spoiler;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import defpackage.bvf0;
import defpackage.dzh0;
import defpackage.evu0;
import defpackage.fcl0;
import defpackage.iwt0;
import defpackage.jl40;
import defpackage.ovt0;
import defpackage.pz40;
import defpackage.sls;
import defpackage.t3i0;
import defpackage.tls;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.zp31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 I2\u00020\u0001:\u0001JB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0019H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0014¢\u0006\u0004\b%\u0010$J\u001f\u0010(\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0006H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J#\u00101\u001a\u00020\u00192\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00100\u001a\u00020\u0012¢\u0006\u0004\b1\u00102J!\u00105\u001a\u00020\u00192\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001903¢\u0006\u0004\b5\u00106R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010=\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/ybsdk/core/design/spoiler/SpoilerTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/core/design/spoiler/b;", "width", "Lkotlin/Pair;", "getBackgroundHorizontalBounds", "(Lcom/ybsdk/core/design/spoiler/b;)Lkotlin/Pair;", "Lcom/ybsdk/core/design/spoiler/Spoiler$a;", "previous", "current", "", "sizeChangeRequiresLayout", "(Lcom/ybsdk/core/design/spoiler/Spoiler$a;Lcom/ybsdk/core/design/spoiler/Spoiler$a;)Z", "Lcom/ybsdk/core/design/spoiler/Spoiler;", "stateChangeRequiresLayout", "(Lcom/ybsdk/core/design/spoiler/Spoiler;Lcom/ybsdk/core/design/spoiler/Spoiler;)Z", "Lkotlin/Function0;", "Lzy11;", "action", "safeUpdateBackground", "(Lsls;)V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lcom/ybsdk/core/utils/ColorModel;", "color", "isSpoilerEnabled", "updateSpoilerState", "(Lcom/ybsdk/core/utils/ColorModel;Z)V", "Lkotlin/Function1;", "listener", "setSpoilerStateListener", "(Ltls;)V", "changeVisibilityCallback", "Ltls;", "Lcom/ybsdk/core/design/spoiler/f;", "spoilerViewDelegate", "Lcom/ybsdk/core/design/spoiler/f;", "value", "spoiler", "Lcom/ybsdk/core/design/spoiler/Spoiler;", "getSpoiler", "()Lcom/ybsdk/core/design/spoiler/Spoiler;", "setSpoiler", "(Lcom/ybsdk/core/design/spoiler/Spoiler;)V", "Lcom/ybsdk/core/design/spoiler/SpoilerEffect;", "spoilerEffect", "Lcom/ybsdk/core/design/spoiler/SpoilerEffect;", "Lpz40;", "textChangesFlow", "Lpz40;", "Companion", "iwt0", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class SpoilerTextView extends AppCompatTextView {
    public static final iwt0 Companion = new iwt0();
    private static final int HALF_DIVIDER = 2;
    private static final double SPOILER_SIZE_WIDTH_DIVIDER = 1.6d;
    private tls changeVisibilityCallback;
    private Spoiler spoiler;
    private final SpoilerEffect spoilerEffect;
    private final f spoilerViewDelegate;
    private pz40 textChangesFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public SpoilerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.spoilerViewDelegate = new f();
        this.spoiler = new Spoiler(null, 0 == true ? 1 : 0, 15);
        SpoilerEffect spoilerEffect = new SpoilerEffect(context);
        spoilerEffect.setParentView(this);
        this.spoilerEffect = spoilerEffect;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t3i0.YbSdkSpoilers, 0, 0);
        setSpoiler(f.a(obtainStyledAttributes));
        obtainStyledAttributes.recycle();
    }

    private final Pair<Integer, Integer> getBackgroundHorizontalBounds(b width) {
        int width2 = getWidth() / 2;
        int i = (int) (width.a / SPOILER_SIZE_WIDTH_DIVIDER);
        return new Pair<>(Integer.valueOf(width2 - i), Integer.valueOf(width2 + i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onMeasure$lambda$3(SpoilerTextView spoilerTextView) {
        Pair<Integer, Integer> pair;
        ovt0 ovt0Var = spoilerTextView.spoiler.b.a;
        if (ovt0Var instanceof b) {
            pair = spoilerTextView.getBackgroundHorizontalBounds((b) ovt0Var);
        } else {
            if (!jl40.l(ovt0Var, vvb1.Q)) {
                w511.b();
                return null;
            }
            pair = new Pair<>(0, Integer.valueOf(spoilerTextView.getWidth()));
        }
        spoilerTextView.getBackground().setBounds(((Number) pair.getFirst()).intValue(), 0, ((Number) pair.getSecond()).intValue(), spoilerTextView.getBackground().getBounds().bottom);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onMeasure$lambda$4(SpoilerTextView spoilerTextView) {
        spoilerTextView.getBackground().setBounds(0, 0, spoilerTextView.getWidth(), spoilerTextView.getBackground().getBounds().bottom);
        return zy11.a;
    }

    private final void safeUpdateBackground(sls action) {
        if (getBackground() != null) {
            post(new fcl0(24, action));
        }
    }

    private final boolean sizeChangeRequiresLayout(Spoiler.a previous, Spoiler.a current) {
        ovt0 ovt0Var = current.a;
        ovt0 ovt0Var2 = current.b;
        ovt0 ovt0Var3 = previous.a;
        ovt0 ovt0Var4 = previous.b;
        return (!jl40.l(ovt0Var, ovt0Var3) && ((current.a instanceof b) || (previous.a instanceof b))) || (!jl40.l(ovt0Var2, ovt0Var4) && ((ovt0Var2 instanceof b) || (ovt0Var4 instanceof b)));
    }

    private final boolean stateChangeRequiresLayout(Spoiler previous, Spoiler current) {
        ViewGroup.LayoutParams layoutParams;
        boolean z = previous.a;
        boolean z2 = current.a;
        Spoiler.a aVar = current.b;
        if (z == z2 || (layoutParams = getLayoutParams()) == null) {
            return false;
        }
        return (layoutParams.width == -2 && (aVar.a instanceof b)) || (layoutParams.height == -2 && (aVar.b instanceof b));
    }

    public static /* synthetic */ void updateSpoilerState$default(SpoilerTextView spoilerTextView, ColorModel colorModel, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: updateSpoilerState");
            return;
        }
        if ((i & 1) != 0) {
            colorModel = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        spoilerTextView.updateSpoilerState(colorModel, z);
    }

    public final Spoiler getSpoiler() {
        return this.spoiler;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        r0 c = bvf0.c(getText());
        kotlinx.coroutines.flow.e.H(zp31.a(this), new m0(d.b, c, new SpoilerTextView$onAttachedToWindow$1$1(this, getContext().getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount), null)));
        this.textChangesFlow = c;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.changeVisibilityCallback = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.spoiler.a && getVisibility() == 0 && this.spoiler.d == Spoiler.SpoilerEnable.ENABLED) {
            this.spoilerEffect.draw(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        CharSequence text;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Spoiler spoiler = this.spoiler;
        Spoiler.a aVar = spoiler.b;
        if ((aVar.a instanceof b) || (aVar.b instanceof b)) {
            if (!spoiler.a || (text = getText()) == null || evu0.J(text)) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                final int i = 1;
                safeUpdateBackground(new sls(this) { // from class: hwt0
                    public final /* synthetic */ SpoilerTextView b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        zy11 onMeasure$lambda$3;
                        zy11 onMeasure$lambda$4;
                        int i2 = i;
                        SpoilerTextView spoilerTextView = this.b;
                        switch (i2) {
                            case 0:
                                onMeasure$lambda$3 = SpoilerTextView.onMeasure$lambda$3(spoilerTextView);
                                return onMeasure$lambda$3;
                            default:
                                onMeasure$lambda$4 = SpoilerTextView.onMeasure$lambda$4(spoilerTextView);
                                return onMeasure$lambda$4;
                        }
                    }
                });
            } else {
                f fVar = this.spoilerViewDelegate;
                ovt0 ovt0Var = this.spoiler.b.a;
                fVar.getClass();
                int c = f.c(ovt0Var, widthMeasureSpec, this);
                f fVar2 = this.spoilerViewDelegate;
                ovt0 ovt0Var2 = this.spoiler.b.b;
                fVar2.getClass();
                super.onMeasure(c, f.b(ovt0Var2, heightMeasureSpec, this));
                final int i2 = 0;
                safeUpdateBackground(new sls(this) { // from class: hwt0
                    public final /* synthetic */ SpoilerTextView b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        zy11 onMeasure$lambda$3;
                        zy11 onMeasure$lambda$4;
                        int i22 = i2;
                        SpoilerTextView spoilerTextView = this.b;
                        switch (i22) {
                            case 0:
                                onMeasure$lambda$3 = SpoilerTextView.onMeasure$lambda$3(spoilerTextView);
                                return onMeasure$lambda$3;
                            default:
                                onMeasure$lambda$4 = SpoilerTextView.onMeasure$lambda$4(spoilerTextView);
                                return onMeasure$lambda$4;
                        }
                    }
                });
            }
        }
        if (this.spoiler.a) {
            f fVar3 = this.spoilerViewDelegate;
            Context context = getContext();
            SpoilerEffect spoilerEffect = this.spoilerEffect;
            Spoiler spoiler2 = this.spoiler;
            fVar3.getClass();
            f.d(context, spoilerEffect, this, spoiler2);
            invalidate();
        }
    }

    public final void setSpoiler(Spoiler spoiler) {
        if (jl40.l(this.spoiler, spoiler)) {
            return;
        }
        Spoiler spoiler2 = this.spoiler;
        this.spoiler = spoiler;
        if (isAttachedToWindow()) {
            if (sizeChangeRequiresLayout(spoiler2.b, spoiler.b) || stateChangeRequiresLayout(spoiler2, spoiler)) {
                requestLayout();
                return;
            }
            f fVar = this.spoilerViewDelegate;
            Context context = getContext();
            SpoilerEffect spoilerEffect = this.spoilerEffect;
            Spoiler spoiler3 = this.spoiler;
            fVar.getClass();
            f.d(context, spoilerEffect, this, spoiler3);
            invalidate();
        }
    }

    public final void setSpoilerStateListener(tls listener) {
        this.changeVisibilityCallback = listener;
        listener.invoke(Boolean.valueOf(this.spoiler.a));
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        super.setText(text, type);
        if (text == null) {
            text = "";
        }
        pz40 pz40Var = this.textChangesFlow;
        if (pz40Var != null) {
            ((r0) pz40Var).l(text);
        }
    }

    public final void updateSpoilerState(ColorModel color, boolean isSpoilerEnabled) {
        f fVar = this.spoilerViewDelegate;
        Spoiler spoiler = this.spoiler;
        fVar.getClass();
        if (color == null) {
            color = Spoiler.e;
        }
        setSpoiler(Spoiler.a(spoiler, false, spoiler.b, color, isSpoilerEnabled ? Spoiler.SpoilerEnable.ENABLED : Spoiler.SpoilerEnable.DISABLED, 1));
    }

    public SpoilerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SpoilerTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SpoilerTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
