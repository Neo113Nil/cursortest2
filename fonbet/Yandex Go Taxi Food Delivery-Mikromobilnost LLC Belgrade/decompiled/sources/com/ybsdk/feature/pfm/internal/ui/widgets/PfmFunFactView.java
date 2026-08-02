package com.ybsdk.feature.pfm.internal.ui.widgets;

import android.content.Context;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import defpackage.cma1;
import defpackage.e461;
import defpackage.jl40;
import defpackage.lbh0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tbb0;
import defpackage.tls;
import defpackage.ubb0;
import defpackage.ung0;
import defpackage.unh0;
import defpackage.z4b0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0002\n-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u000eJ%\u0010\u001c\u001a\u00020\f2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/widgets/PfmFunFactView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lubb0;", ClidProvider.STATE, "Lzy11;", "updateGradient", "(Lubb0;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "viewState", "render", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "Lcom/ybsdk/feature/divkit/api/ui/ActionHandler;", "handler", "setDivActionHandler", "(Ltls;)V", "", "opacityValue", "setOpacityValue", "(F)V", "Lkotlin/Function0;", "animationEnabled", "setAnimationEnabled", "(Lsls;)V", "Le461;", "binding", "Le461;", "Lsls;", "currentState", "Lubb0;", "Companion", "tbb0", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmFunFactView extends ConstraintLayout {
    private static final tbb0 Companion = new tbb0();
    private static final ColorModel.Attr DEFAULT_GRADIENT_END_COLOR = new ColorModel.Attr(ung0.ybColor_background_secondary);

    @Deprecated
    public static final float MINIMUM_RADIUS_VALUE_PX = 0.01f;
    private sls animationEnabled;
    private final e461 binding;
    private ubb0 currentState;

    public PfmFunFactView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(unh0.ybsdk_pfm_fun_fact, this);
        int i2 = lbh0.funFactDivView;
        YbDivView ybDivView = (YbDivView) cma1.O(i2, this);
        if (ybDivView == null) {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
            throw null;
        }
        this.binding = new e461(this, ybDivView);
        this.animationEnabled = new z4b0(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animationEnabled$lambda$0() {
        return false;
    }

    private final void updateGradient(final ubb0 state) {
        ubb0 ubb0Var = this.currentState;
        if (jl40.l(ubb0Var != null ? ubb0Var.b : null, state.b)) {
            ubb0 ubb0Var2 = this.currentState;
            if (jl40.j(ubb0Var2 != null ? Float.valueOf(ubb0Var2.d) : null, state.d)) {
                ubb0 ubb0Var3 = this.currentState;
                if (jl40.j(ubb0Var3 != null ? Float.valueOf(ubb0Var3.e) : null, state.e)) {
                    ubb0 ubb0Var4 = this.currentState;
                    if (jl40.j(ubb0Var4 != null ? Float.valueOf(ubb0Var4.f) : null, state.f)) {
                        return;
                    }
                }
            }
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: com.ybsdk.feature.pfm.internal.ui.widgets.PfmFunFactView$updateGradient$shapeDrawable$1$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                tbb0 tbb0Var;
                ColorModel.Attr attr;
                tbb0 tbb0Var2;
                ubb0 ubb0Var5 = ubb0.this;
                float f = width * ubb0Var5.d;
                float f2 = height;
                float f3 = f2 * ubb0Var5.e;
                float f4 = f2 * ubb0Var5.f;
                float f5 = f4 < 0.01f ? 0.01f : f4;
                ColorModel colorModel = ubb0Var5.b;
                if (colorModel == null) {
                    tbb0Var2 = PfmFunFactView.Companion;
                    tbb0Var2.getClass();
                    colorModel = PfmFunFactView.DEFAULT_GRADIENT_END_COLOR;
                }
                int i = colorModel.get(this.getContext());
                tbb0Var = PfmFunFactView.Companion;
                tbb0Var.getClass();
                attr = PfmFunFactView.DEFAULT_GRADIENT_END_COLOR;
                return new RadialGradient(f, f3, f5, new int[]{i, attr.get(this.getContext())}, (float[]) null, Shader.TileMode.CLAMP);
            }
        });
        this.binding.a.setBackground(shapeDrawable);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        ubb0 ubb0Var = this.currentState;
        if (ubb0Var != null) {
            updateGradient(ubb0Var);
        }
    }

    public final void render(ubb0 viewState) {
        if (((Boolean) this.animationEnabled.invoke()).booleanValue()) {
            setVisibility(0);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams.height = (viewState != null ? viewState.c : null) != null ? -2 : 0;
                setLayoutParams(layoutParams);
            }
        } else {
            setVisibility((viewState != null ? viewState.c : null) == null ? 8 : 0);
        }
        if (jl40.l(this.currentState, viewState)) {
            return;
        }
        if ((viewState != null ? viewState.c : null) == null) {
            return;
        }
        updateGradient(viewState);
        YbDivView.setData$default(this.binding.b, viewState.c, null, viewState.a, false, 10, null);
        this.currentState = viewState;
    }

    public final void setAnimationEnabled(sls animationEnabled) {
        this.animationEnabled = animationEnabled;
    }

    public final void setDivActionHandler(tls handler) {
        this.binding.b.setActionHandler(handler);
    }

    public final void setOpacityValue(float opacityValue) {
        this.binding.a.setAlpha(opacityValue);
    }

    public PfmFunFactView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PfmFunFactView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PfmFunFactView(Context context) {
        this(context, null, 0, 6, null);
    }
}
