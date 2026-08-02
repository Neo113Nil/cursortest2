package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cq5;
import xsna.p9r0;

/* compiled from: VKAvatarBorderDecorationMapper.kt */
/* loaded from: classes15.dex */
public final class q9r0 {
    public static p9r0 a(Context context, cq5 cq5Var, l9r0 l9r0Var, xp5 xp5Var) {
        if (cq5Var.equals(cq5.b.a) || cq5Var.equals(cq5.o.a)) {
            if (!l9r0Var.a) {
                xp5Var.getClass();
                return new p9r0.c(0);
            }
            Integer num = l9r0Var.b;
            if (num != null) {
                return new p9r0.c(num.intValue());
            }
            xp5Var.getClass();
            return x9r0.a(R.attr.vk_ui_background_content, context);
        }
        if (cq5Var.equals(cq5.i.a)) {
            xp5Var.getClass();
            return x9r0.a(R.attr.vk_ui_stroke_positive, context);
        }
        if (cq5Var.equals(cq5.h.a)) {
            xp5Var.getClass();
            return x9r0.a(R.attr.vk_ui_stroke_accent, context);
        }
        if (cq5Var.equals(cq5.j.a)) {
            xp5Var.getClass();
            return new p9r0.c(context.getColor(R.color.vk_orange));
        }
        if (cq5Var.equals(cq5.k.a)) {
            xp5Var.getClass();
            return x9r0.a(R.attr.vk_ui_accent_purple, context);
        }
        if (cq5Var.equals(cq5.e.a)) {
            xp5Var.getClass();
            return new p9r0.c(-15027457);
        }
        if (cq5Var.equals(cq5.f.a)) {
            xp5Var.getClass();
            return new p9r0.c(-14186507);
        }
        if (cq5Var.equals(cq5.m.a)) {
            return x9r0.a(xp5Var.a(), context);
        }
        if (cq5Var.equals(cq5.n.a)) {
            xp5Var.getClass();
            return x9r0.a(R.attr.vk_ui_separator_primary, context);
        }
        if (cq5Var.equals(cq5.d.a)) {
            xp5Var.getClass();
            return x9r0.a(R.attr.vk_ui_stroke_negative, context);
        }
        if (cq5Var.equals(cq5.g.a)) {
            xp5Var.getClass();
            return x9r0.a(R.attr.vk_ui_accent_red, context);
        }
        if (cq5Var.equals(cq5.c.a) || cq5Var.equals(cq5.l.a)) {
            xp5Var.getClass();
            return new p9r0.c(0);
        }
        if (cq5Var instanceof cq5.a) {
            return ((cq5.a) cq5Var).a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
