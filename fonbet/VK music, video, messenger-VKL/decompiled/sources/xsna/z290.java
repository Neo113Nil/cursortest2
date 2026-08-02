package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import kotlin.LazyThreadSafetyMode;

/* compiled from: OverlayRedesignVisibilityAnimationHelper.kt */
/* loaded from: classes17.dex */
public final class z290 {
    public final Object a;
    public final Object b;
    public final Object c;

    public z290(u750 u750Var, x2b0 x2b0Var) {
        tsk0 tsk0Var = new tsk0(u750Var, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, tsk0Var);
        this.b = msy.a(lazyThreadSafetyMode, new y4(23, u750Var, x2b0Var));
        this.c = msy.a(lazyThreadSafetyMode, new dei0(u750Var, 6));
    }

    public z290(ViewGroup viewGroup, nx0 nx0Var, VkPlaceholder vkPlaceholder, View view, VkPlaceholder vkPlaceholder2, tw0 tw0Var) {
        ConstraintLayout constraintLayout;
        this.a = viewGroup;
        this.b = view;
        biq biqVar = new biq();
        biqVar.addTarget(nx0Var.b);
        biqVar.addTarget(view);
        if (tw0Var != null && (constraintLayout = (ConstraintLayout) tw0Var.a) != null) {
            biqVar.addTarget(constraintLayout);
        }
        if (vkPlaceholder != null) {
            biqVar.addTarget(vkPlaceholder);
        }
        if (vkPlaceholder2 != null) {
            biqVar.addTarget(vkPlaceholder2);
        }
        this.c = biqVar;
    }
}
