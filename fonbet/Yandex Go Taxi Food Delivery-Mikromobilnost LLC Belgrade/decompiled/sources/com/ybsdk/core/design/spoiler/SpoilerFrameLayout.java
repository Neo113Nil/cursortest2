package com.ybsdk.core.design.spoiler;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ybsdk.core.design.spoiler.Spoiler;
import com.ybsdk.core.utils.ColorModel;
import defpackage.dzh0;
import defpackage.h8;
import defpackage.jl40;
import defpackage.ovt0;
import defpackage.t3i0;
import defpackage.tje;
import defpackage.tls;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.zp31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0019\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u00112\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110&¢\u0006\u0004\b(\u0010)R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/ybsdk/core/design/spoiler/SpoilerFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/core/design/spoiler/Spoiler$a;", "previous", "current", "", "sizeChangeRequiresLayout", "(Lcom/ybsdk/core/design/spoiler/Spoiler$a;Lcom/ybsdk/core/design/spoiler/Spoiler$a;)Z", "widthPx", "Lzy11;", "setSpoilerWidth", "(I)V", "heightPx", "setSpoilerHeight", "Lcom/ybsdk/core/utils/ColorModel;", "color", "shouldRenderSpoiler", "updateSpoilerState", "(Lcom/ybsdk/core/utils/ColorModel;Z)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function1;", "listener", "setSpoilerStateListener", "(Ltls;)V", "changeVisibilityCallback", "Ltls;", "Lcom/ybsdk/core/design/spoiler/f;", "spoilerViewDelegate", "Lcom/ybsdk/core/design/spoiler/f;", "Lcom/ybsdk/core/design/spoiler/Spoiler;", "value", "spoiler", "Lcom/ybsdk/core/design/spoiler/Spoiler;", "setSpoiler", "(Lcom/ybsdk/core/design/spoiler/Spoiler;)V", "Lcom/ybsdk/core/design/spoiler/SpoilerEffect;", "spoilerEffect", "Lcom/ybsdk/core/design/spoiler/SpoilerEffect;", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SpoilerFrameLayout extends FrameLayout {
    private tls changeVisibilityCallback;
    private Spoiler spoiler;
    private final SpoilerEffect spoilerEffect;
    private f spoilerViewDelegate;

    public SpoilerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.spoilerViewDelegate = new f();
        this.spoiler = new Spoiler(null, null, 15);
        SpoilerEffect spoilerEffect = new SpoilerEffect(context);
        spoilerEffect.setParentView(this);
        this.spoilerEffect = spoilerEffect;
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t3i0.YbSdkSpoilers, 0, 0);
        this.spoilerViewDelegate.getClass();
        setSpoiler(f.a(obtainStyledAttributes));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSpoiler(Spoiler spoiler) {
        if (jl40.l(this.spoiler, spoiler)) {
            return;
        }
        Spoiler spoiler2 = this.spoiler;
        this.spoiler = spoiler;
        if (isAttachedToWindow()) {
            if (sizeChangeRequiresLayout(spoiler2.b, spoiler.b)) {
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

    private final boolean sizeChangeRequiresLayout(Spoiler.a previous, Spoiler.a current) {
        ovt0 ovt0Var = current.a;
        ovt0 ovt0Var2 = current.b;
        ovt0 ovt0Var3 = previous.a;
        ovt0 ovt0Var4 = previous.b;
        return (!jl40.l(ovt0Var, ovt0Var3) && ((current.a instanceof b) || (previous.a instanceof b))) || (!jl40.l(ovt0Var2, ovt0Var4) && ((ovt0Var2 instanceof b) || (ovt0Var4 instanceof b)));
    }

    public static /* synthetic */ void updateSpoilerState$default(SpoilerFrameLayout spoilerFrameLayout, ColorModel colorModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            colorModel = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        spoilerFrameLayout.updateSpoilerState(colorModel, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        Context context = getContext();
        setContentDescription(context != null ? context.getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount) : null);
        tje.N(zp31.a(this), null, null, new SpoilerFrameLayout$onAttachedToWindow$1(this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.changeVisibilityCallback = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.spoiler.a && getVisibility() == 0 && this.spoiler.d == Spoiler.SpoilerEnable.ENABLED) {
            this.spoilerEffect.draw(canvas);
        } else {
            super.onDraw(canvas);
        }
        h8 h8Var = new h8(3, this);
        while (h8Var.hasNext()) {
            ((View) h8Var.next()).setVisibility(this.spoiler.a ? 4 : 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Spoiler spoiler = this.spoiler;
        if (!spoiler.a) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        f fVar = this.spoilerViewDelegate;
        ovt0 ovt0Var = spoiler.b.a;
        fVar.getClass();
        int c = f.c(ovt0Var, widthMeasureSpec, this);
        f fVar2 = this.spoilerViewDelegate;
        ovt0 ovt0Var2 = this.spoiler.b.b;
        fVar2.getClass();
        super.onMeasure(c, f.b(ovt0Var2, heightMeasureSpec, this));
        f fVar3 = this.spoilerViewDelegate;
        Context context = getContext();
        SpoilerEffect spoilerEffect = this.spoilerEffect;
        Spoiler spoiler2 = this.spoiler;
        fVar3.getClass();
        f.d(context, spoilerEffect, this, spoiler2);
        invalidate();
    }

    public final void setSpoilerHeight(int heightPx) {
        b bVar;
        ovt0 ovt0Var = this.spoiler.b.b;
        if (ovt0Var instanceof b) {
            bVar = b.a((b) ovt0Var, heightPx);
        } else {
            if (!jl40.l(ovt0Var, vvb1.Q)) {
                w511.b();
                return;
            }
            bVar = new b(heightPx, Spoiler.Gravity.START);
        }
        Spoiler spoiler = this.spoiler;
        Spoiler.a aVar = spoiler.b;
        ovt0 ovt0Var2 = aVar.a;
        aVar.getClass();
        setSpoiler(Spoiler.a(spoiler, false, new Spoiler.a(ovt0Var2, bVar), null, null, 13));
    }

    public final void setSpoilerStateListener(tls listener) {
        this.changeVisibilityCallback = listener;
        listener.invoke(Boolean.valueOf(this.spoiler.a));
    }

    public final void setSpoilerWidth(int widthPx) {
        b bVar;
        ovt0 ovt0Var = this.spoiler.b.a;
        if (ovt0Var instanceof b) {
            bVar = b.a((b) ovt0Var, widthPx);
        } else {
            if (!jl40.l(ovt0Var, vvb1.Q)) {
                w511.b();
                return;
            }
            bVar = new b(widthPx, Spoiler.Gravity.START);
        }
        Spoiler spoiler = this.spoiler;
        Spoiler.a aVar = spoiler.b;
        ovt0 ovt0Var2 = aVar.b;
        aVar.getClass();
        setSpoiler(Spoiler.a(spoiler, false, new Spoiler.a(bVar, ovt0Var2), null, null, 13));
    }

    public final void updateSpoilerState(ColorModel color, boolean shouldRenderSpoiler) {
        f fVar = this.spoilerViewDelegate;
        Spoiler spoiler = this.spoiler;
        fVar.getClass();
        if (color == null) {
            color = Spoiler.e;
        }
        setSpoiler(Spoiler.a(spoiler, false, spoiler.b, color, shouldRenderSpoiler ? Spoiler.SpoilerEnable.ENABLED : Spoiler.SpoilerEnable.DISABLED, 1));
    }

    public SpoilerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SpoilerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SpoilerFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }
}
