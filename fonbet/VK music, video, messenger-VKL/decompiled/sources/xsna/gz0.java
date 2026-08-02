package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;

/* compiled from: AdsItemOverlayVisibilityRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class gz0 {
    public final hx0 a;
    public final VkPlaceholder b;
    public final View c;
    public final VkPlaceholder d;
    public final rw0 e;
    public r390 f;
    public final z3n g;

    public gz0(ViewGroup viewGroup, hx0 hx0Var, VkPlaceholder vkPlaceholder, View view, VkPlaceholder vkPlaceholder2, rw0 rw0Var) {
        this.a = hx0Var;
        this.b = vkPlaceholder;
        this.c = view;
        this.d = vkPlaceholder2;
        this.e = rw0Var;
        this.g = new z3n(viewGroup, hx0Var, vkPlaceholder, view, vkPlaceholder2, rw0Var);
    }

    public final void a(r390 r390Var) {
        ConstraintLayout constraintLayout;
        boolean z = r390Var.f;
        boolean z2 = r390Var.e;
        r390 r390Var2 = this.f;
        z3n z3nVar = this.g;
        if (r390Var2 == null) {
            zmp0.a((ViewGroup) z3nVar.b, (biq) z3nVar.d);
        } else {
            z3nVar.getClass();
            biq biqVar = (biq) z3nVar.d;
            ViewGroup viewGroup = (ViewGroup) z3nVar.b;
            boolean f = epx.f(r390Var.a, r390Var2.a);
            boolean z3 = z2 != r390Var2.e;
            if (!f || z3) {
                zmp0.b(viewGroup);
            } else {
                biqVar.setDuration(z != r390Var2.f ? 200L : 300L);
                zmp0.b(viewGroup);
                zmp0.a(viewGroup, biqVar);
            }
        }
        this.a.b.setVisibility(r390Var.b ? 0 : 8);
        boolean z4 = r390Var.c;
        VkPlaceholder vkPlaceholder = this.d;
        if (vkPlaceholder != null) {
            vkPlaceholder.setVisibility(z4 ? 0 : 8);
        }
        boolean z5 = r390Var.d;
        rw0 rw0Var = this.e;
        if (rw0Var != null && (constraintLayout = (ConstraintLayout) rw0Var.a) != null) {
            constraintLayout.setVisibility(z5 ? 0 : 8);
        }
        VkPlaceholder vkPlaceholder2 = this.b;
        if (vkPlaceholder2 != null) {
            vkPlaceholder2.setVisibility(z2 ? 0 : 8);
        }
        this.c.setVisibility(z ? 0 : 8);
        this.f = r390Var;
    }
}
