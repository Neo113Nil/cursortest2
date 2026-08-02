package xsna;

import com.vk.avatar.api.border.AvatarBorderType;
import xsna.cq5;

/* compiled from: Extenstions.kt */
/* loaded from: classes15.dex */
public final class tdq {
    public static final float a(u9r0 u9r0Var) {
        int i = u9r0Var.a;
        l9r0 l9r0Var = u9r0Var.b;
        if (!l9r0Var.i) {
            return i / 2.0f;
        }
        return yq.a(l9r0Var.d, 2, i, 2.0f);
    }

    public static final float b(u9r0 u9r0Var) {
        float f;
        float f2;
        l9r0 l9r0Var = u9r0Var.b;
        cq5 cq5Var = u9r0Var.d;
        if (epx.f(cq5Var, cq5.b.a)) {
            if (u9r0Var.c == AvatarBorderType.CIRCLE) {
                f = l9r0Var.h;
                f2 = f / 2.0f;
            } else {
                f2 = l9r0Var.c + (l9r0Var.g / 2.0f);
            }
        } else if (epx.f(cq5Var, cq5.m.a)) {
            f2 = l9r0Var.g * 0.25f;
        } else {
            f = l9r0Var.g;
            f2 = f / 2.0f;
        }
        return a(u9r0Var) + l9r0Var.h + f2;
    }
}
