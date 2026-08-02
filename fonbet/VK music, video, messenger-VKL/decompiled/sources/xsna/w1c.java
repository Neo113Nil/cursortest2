package xsna;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.util.StateSet;
import com.vk.utils.vectordrawable.VectorPath;

/* compiled from: CheckboxDrawable.kt */
/* loaded from: classes2.dex */
public final class w1c extends AnimatedStateListDrawable {
    public static final int[] b = {R.attr.state_checked};
    public static final int[] c = StateSet.NOTHING;
    public static final int d = com.vkontakte.android.R.drawable.vkim_check_on_outline;
    public static final int e = com.vkontakte.android.R.drawable.vkim_check_off_outline;

    /* compiled from: CheckboxDrawable.kt */
    public static final class a {
        public static int a(je40 je40Var, boolean z, boolean z2) {
            tcn tcnVar = (tcn) je40Var.c;
            if (z2) {
                int[] iArr = w1c.b;
                return ((Number) tcnVar.invoke(Integer.valueOf(com.vkontakte.android.R.attr.vk_legacy_accent))).intValue();
            }
            if (z) {
                return -1;
            }
            int[] iArr2 = w1c.b;
            return ((Number) tcnVar.invoke(Integer.valueOf(com.vkontakte.android.R.attr.vk_legacy_icon_tertiary))).intValue();
        }

        public static void b(qlr0 qlr0Var, boolean z, je40 je40Var) {
            int[] iArr = w1c.b;
            int a = a(je40Var, z, false);
            VectorPath findPath = qlr0Var.findPath("outline");
            if (findPath != null) {
                if (z) {
                    findPath.setStrokeColor(-1);
                    findPath.setStrokeAlpha(255);
                } else {
                    findPath.setStrokeAlpha(0);
                }
            }
            VectorPath findPath2 = qlr0Var.findPath("bg");
            if (findPath2 != null) {
                if (z) {
                    findPath2.setStrokeAlpha(0);
                } else {
                    findPath2.setStrokeColor(a);
                }
            }
        }

        @SuppressLint({"ResourceType"})
        public static void c(qlr0 qlr0Var, boolean z, je40 je40Var) {
            int[] iArr = w1c.b;
            int a = a(je40Var, z, true);
            VectorPath findPath = qlr0Var.findPath("outline");
            if (findPath != null) {
                if (z) {
                    findPath.setStrokeColor(-1);
                    findPath.setStrokeAlpha(255);
                } else {
                    findPath.setStrokeAlpha(0);
                }
            }
            VectorPath findPath2 = qlr0Var.findPath("bg");
            if (findPath2 != null) {
                findPath2.setStrokeColor(a);
            }
        }
    }
}
