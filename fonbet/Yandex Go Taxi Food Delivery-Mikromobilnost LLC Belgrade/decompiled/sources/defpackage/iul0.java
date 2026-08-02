package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorView;
import com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorViewUiState$ButtonUiState$Type;
import defpackage.iul0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class iul0 implements gul0 {
    public final /* synthetic */ SafetyCenterWebErrorView a;

    public iul0(SafetyCenterWebErrorView safetyCenterWebErrorView) {
        this.a = safetyCenterWebErrorView;
    }

    public static final void I(iul0 iul0Var, int i) {
        kul0 kul0Var;
        SafetyCenterWebErrorView safetyCenterWebErrorView = iul0Var.a;
        kul0Var = safetyCenterWebErrorView.binding;
        int width = kul0Var.c.getWidth();
        if (width == 0 || i == 0 || kul0Var.c.getVisibility() != 0) {
            return;
        }
        int u = (width - (tje.u(4, safetyCenterWebErrorView.getContext()) * i)) / i;
        GoFrameLayout goFrameLayout = kul0Var.d.b;
        if (goFrameLayout.getVisibility() != 0) {
            goFrameLayout = null;
        }
        if (goFrameLayout != null) {
            c.D(u, goFrameLayout.getLayoutParams().height, goFrameLayout);
        }
        GoFrameLayout goFrameLayout2 = kul0Var.f.b;
        if (goFrameLayout2.getVisibility() != 0) {
            goFrameLayout2 = null;
        }
        if (goFrameLayout2 != null) {
            c.D(u, goFrameLayout2.getLayoutParams().height, goFrameLayout2);
        }
        GoFrameLayout goFrameLayout3 = kul0Var.h.b;
        GoFrameLayout goFrameLayout4 = goFrameLayout3.getVisibility() == 0 ? goFrameLayout3 : null;
        if (goFrameLayout4 != null) {
            c.D(u, goFrameLayout4.getLayoutParams().height, goFrameLayout4);
        }
    }

    public static final void h(iul0 iul0Var) {
        kul0 kul0Var;
        SafetyCenterWebErrorView safetyCenterWebErrorView = iul0Var.a;
        kul0Var = safetyCenterWebErrorView.binding;
        do5 do5Var = kul0Var.d;
        do5 do5Var2 = kul0Var.h;
        do5 do5Var3 = kul0Var.f;
        Integer valueOf = Integer.valueOf(do5Var.b.getHeight());
        GoFrameLayout goFrameLayout = kul0Var.d.b;
        if (goFrameLayout.getVisibility() != 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        GoFrameLayout goFrameLayout2 = do5Var3.b;
        Integer valueOf2 = Integer.valueOf(goFrameLayout2.getHeight());
        if (goFrameLayout2.getVisibility() != 0) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : 0;
        GoFrameLayout goFrameLayout3 = do5Var2.b;
        Integer valueOf3 = Integer.valueOf(goFrameLayout3.getHeight());
        if (goFrameLayout3.getVisibility() != 0) {
            valueOf3 = null;
        }
        int[] iArr = {intValue2, valueOf3 != null ? valueOf3.intValue() : 0, tje.u(56, safetyCenterWebErrorView.getContext())};
        for (int i = 0; i < 3; i++) {
            intValue = Math.max(intValue, iArr[i]);
        }
        if (goFrameLayout.getVisibility() != 0) {
            goFrameLayout = null;
        }
        if (goFrameLayout != null) {
            c.D(goFrameLayout.getLayoutParams().width, intValue, goFrameLayout);
        }
        if (goFrameLayout2.getVisibility() != 0) {
            goFrameLayout2 = null;
        }
        if (goFrameLayout2 != null) {
            c.D(goFrameLayout2.getLayoutParams().width, intValue, goFrameLayout2);
        }
        GoFrameLayout goFrameLayout4 = goFrameLayout3.getVisibility() == 0 ? goFrameLayout3 : null;
        if (goFrameLayout4 != null) {
            c.D(goFrameLayout4.getLayoutParams().width, intValue, goFrameLayout4);
        }
    }

    @Override // defpackage.gul0
    public final void K7(final qul0 qul0Var) {
        kul0 kul0Var;
        int[] iArr;
        kul0 kul0Var2;
        kul0 kul0Var3;
        kul0 kul0Var4;
        kul0 kul0Var5;
        SafetyCenterWebErrorView safetyCenterWebErrorView = this.a;
        kul0Var = safetyCenterWebErrorView.binding;
        kul0Var.j.setText(qul0Var.a);
        kul0Var.g.setText(qul0Var.f);
        RobotoTextView robotoTextView = kul0Var.i;
        String str = qul0Var.b;
        robotoTextView.setText(str);
        robotoTextView.setVisibility(str != null ? 0 : 8);
        kul0Var.k.setImageDrawable(qul0Var.c);
        List list = qul0Var.d;
        if (list.size() < 2) {
            kul0Var5 = safetyCenterWebErrorView.binding;
            kul0Var5.e.setVisibility(8);
            safetyCenterWebErrorView.lastGradientColors = null;
        } else {
            final int[] iArr2 = {((Number) a.P(list)).intValue(), ((Number) a.Z(list)).intValue()};
            iArr = safetyCenterWebErrorView.lastGradientColors;
            if (!iArr2.equals(iArr)) {
                ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorView$InnerMvpView$createGradient$shaderFactory$1
                    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                    public Shader resize(int width, int height) {
                        return new LinearGradient(0.0f, 0.0f, 0.0f, height, iArr2, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    }
                };
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.setShaderFactory(shaderFactory);
                kul0Var2 = safetyCenterWebErrorView.binding;
                kul0Var2.e.setBackground(shapeDrawable);
            }
        }
        kul0Var3 = safetyCenterWebErrorView.binding;
        List<pul0> list2 = qul0Var.e;
        if (list2.isEmpty()) {
            kul0Var3.c.setVisibility(8);
            return;
        }
        kul0Var3.c.setVisibility(0);
        kul0Var3.d.b.setVisibility(8);
        kul0Var3.f.b.setVisibility(8);
        kul0Var3.h.b.setVisibility(8);
        for (pul0 pul0Var : list2) {
            kul0Var4 = safetyCenterWebErrorView.binding;
            SafetyCenterWebErrorViewUiState$ButtonUiState$Type safetyCenterWebErrorViewUiState$ButtonUiState$Type = pul0Var.a;
            UiStateDrawableWrapper uiStateDrawableWrapper = pul0Var.c;
            String str2 = pul0Var.b;
            int i = hul0.a[safetyCenterWebErrorViewUiState$ButtonUiState$Type.ordinal()];
            if (i == 1) {
                do5 do5Var = kul0Var4.d;
                do5Var.d.setText(str2);
                do5Var.c.setImageDrawable(uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null);
                do5Var.b.setVisibility(0);
            } else if (i == 2) {
                do5 do5Var2 = kul0Var4.f;
                do5Var2.b.setVisibility(0);
                do5Var2.d.setText(str2);
                do5Var2.c.setImageDrawable(uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null);
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                do5 do5Var3 = kul0Var4.h;
                do5Var3.d.setText(str2);
                do5Var3.c.setImageDrawable(uiStateDrawableWrapper != null ? uiStateDrawableWrapper.getDrawable() : null);
                do5Var3.b.setVisibility(0);
            }
        }
        WeakHashMap weakHashMap = b.a;
        if (!safetyCenterWebErrorView.isLaidOut() || safetyCenterWebErrorView.isLayoutRequested()) {
            safetyCenterWebErrorView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorView$InnerMvpView$updateButtons$lambda$0$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    iul0.I(iul0.this, qul0Var.e.size());
                    iul0.h(iul0.this);
                }
            });
        } else {
            I(this, list2.size());
            h(this);
        }
    }
}
