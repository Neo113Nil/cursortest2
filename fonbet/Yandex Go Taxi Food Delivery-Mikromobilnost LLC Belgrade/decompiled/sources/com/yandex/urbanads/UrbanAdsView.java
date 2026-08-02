package com.yandex.urbanads;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.urbanads.UrbanAdsView;
import defpackage.on70;
import defpackage.pey;
import defpackage.sls;
import defpackage.u1m;
import defpackage.v3c0;
import defpackage.vf21;
import defpackage.zy11;
import flex.engine.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001e\u0010\u0018J7\u0010%\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014¢\u0006\u0004\b%\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010)\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/yandex/urbanads/UrbanAdsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "Lpey;", "getLifecycleOwner", "(Landroid/content/Context;)Lpey;", "Lvf21;", "urbanAdsSource", "", "preferredAspectRatio", "Lzy11;", "set", "(Lvf21;Ljava/lang/Float;)V", "load", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDetachedFromWindow", "onAttachedToWindow", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lvf21;", "Ljava/lang/Float;", "isAttached", "Z", "Lv3c0;", "placeholderManager", "Lv3c0;", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UrbanAdsView extends FrameLayout {
    private boolean isAttached;
    private final v3c0 placeholderManager;
    private Float preferredAspectRatio;
    private vf21 urbanAdsSource;

    public UrbanAdsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final int i2 = 0;
        new sls(this) { // from class: bg21
            public final /* synthetic */ UrbanAdsView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View contentView;
                vf21 vf21Var;
                zy11 placeholderManager$lambda$2;
                int i3 = i2;
                UrbanAdsView urbanAdsView = this.b;
                switch (i3) {
                    case 0:
                        contentView = urbanAdsView.getContentView();
                        return contentView;
                    case 1:
                        vf21Var = urbanAdsView.urbanAdsSource;
                        return vf21Var;
                    default:
                        placeholderManager$lambda$2 = UrbanAdsView.placeholderManager$lambda$2(urbanAdsView);
                        return placeholderManager$lambda$2;
                }
            }
        };
        final int i3 = 1;
        new sls(this) { // from class: bg21
            public final /* synthetic */ UrbanAdsView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View contentView;
                vf21 vf21Var;
                zy11 placeholderManager$lambda$2;
                int i32 = i3;
                UrbanAdsView urbanAdsView = this.b;
                switch (i32) {
                    case 0:
                        contentView = urbanAdsView.getContentView();
                        return contentView;
                    case 1:
                        vf21Var = urbanAdsView.urbanAdsSource;
                        return vf21Var;
                    default:
                        placeholderManager$lambda$2 = UrbanAdsView.placeholderManager$lambda$2(urbanAdsView);
                        return placeholderManager$lambda$2;
                }
            }
        };
        final int i4 = 2;
        new sls(this) { // from class: bg21
            public final /* synthetic */ UrbanAdsView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View contentView;
                vf21 vf21Var;
                zy11 placeholderManager$lambda$2;
                int i32 = i4;
                UrbanAdsView urbanAdsView = this.b;
                switch (i32) {
                    case 0:
                        contentView = urbanAdsView.getContentView();
                        return contentView;
                    case 1:
                        vf21Var = urbanAdsView.urbanAdsSource;
                        return vf21Var;
                    default:
                        placeholderManager$lambda$2 = UrbanAdsView.placeholderManager$lambda$2(urbanAdsView);
                        return placeholderManager$lambda$2;
                }
            }
        };
        this.placeholderManager = new v3c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getContentView() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                return childAt;
            }
        }
        return null;
    }

    private final pey getLifecycleOwner(Context context) {
        boolean z = context instanceof pey;
        Object obj = context;
        if (!z) {
            boolean z2 = context instanceof ContextWrapper;
            obj = context;
            if (z2) {
                obj = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (obj instanceof pey) {
            return (pey) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 placeholderManager$lambda$2(UrbanAdsView urbanAdsView) {
        urbanAdsView.requestLayout();
        return zy11.a;
    }

    public static /* synthetic */ void set$default(UrbanAdsView urbanAdsView, vf21 vf21Var, Float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = null;
        }
        urbanAdsView.set(vf21Var, f);
    }

    public final void load() {
        vf21 vf21Var = this.urbanAdsSource;
        if (vf21Var != null) {
            u1m c = on70.c(vf21Var.b);
            if (vf21Var.c) {
                return;
            }
            a.q(vf21Var.a, c, null, false, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        pey lifecycleOwner = getLifecycleOwner(getContext());
        if (lifecycleOwner != null) {
            vf21 vf21Var = this.urbanAdsSource;
            if (vf21Var != null) {
                vf21Var.a.g(this, lifecycleOwner);
            }
            if (this.urbanAdsSource != null) {
                this.placeholderManager.getClass();
                this.placeholderManager.getClass();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttached = false;
        vf21 vf21Var = this.urbanAdsSource;
        if (vf21Var != null) {
            vf21Var.a.j();
        }
        this.placeholderManager.getClass();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.placeholderManager.getClass();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int measuredWidth;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Float f = this.preferredAspectRatio;
        if (f == null || f.floatValue() <= 0.0f || getMeasuredHeight() != 0 || (measuredWidth = getMeasuredWidth()) <= 0) {
            return;
        }
        setMeasuredDimension(measuredWidth, (int) (measuredWidth / f.floatValue()));
    }

    public final void set(vf21 urbanAdsSource, Float preferredAspectRatio) {
        if (this.urbanAdsSource == urbanAdsSource) {
            return;
        }
        this.placeholderManager.getClass();
        vf21 vf21Var = this.urbanAdsSource;
        if (vf21Var != null) {
            vf21Var.a.j();
        }
        this.urbanAdsSource = urbanAdsSource;
        this.preferredAspectRatio = preferredAspectRatio;
        pey lifecycleOwner = getLifecycleOwner(getContext());
        if (lifecycleOwner != null) {
            urbanAdsSource.a.g(this, lifecycleOwner);
        }
        this.placeholderManager.getClass();
        urbanAdsSource.getClass();
        this.placeholderManager.getClass();
    }

    public UrbanAdsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ UrbanAdsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public UrbanAdsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void set(vf21 vf21Var) {
        set$default(this, vf21Var, null, 2, null);
    }
}
