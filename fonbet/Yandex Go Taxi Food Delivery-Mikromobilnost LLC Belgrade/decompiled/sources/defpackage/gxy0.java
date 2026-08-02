package defpackage;

import com.ybsdk.core.utils.ColorModel;

/* loaded from: classes3.dex */
public abstract class gxy0 {
    public static final ColorModel a(fxy0 fxy0Var) {
        return lvy0.e((String) fxy0Var.b, (String) fxy0Var.a);
    }

    public static ColorModel b(fxy0 fxy0Var, srp0 srp0Var) {
        ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_background_primary);
        ColorModel a = a(fxy0Var);
        if (a != null) {
            return a;
        }
        x4c.h("Failed to parse", new srp0[]{srp0Var}, "color=" + fxy0Var, 4);
        return attr;
    }
}
