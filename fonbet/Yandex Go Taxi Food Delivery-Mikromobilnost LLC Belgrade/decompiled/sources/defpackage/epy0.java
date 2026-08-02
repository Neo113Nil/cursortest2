package defpackage;

import io.flutter.plugin.editing.a;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class epy0 {
    public final ea20 a;
    public a b;

    public epy0(ufg ufgVar) {
        c1x0 c1x0Var = new c1x0(this);
        ea20 ea20Var = new ea20(ufgVar, "flutter/textinput", qtb1.G, null);
        this.a = ea20Var;
        ea20Var.b(c1x0Var);
    }

    public static HashMap a(int i, int i2, int i3, int i4, String str) {
        HashMap p = x4e.p("text", str);
        b64.B(i, p, "selectionBase", i2, "selectionExtent");
        b64.B(i3, p, "composingBase", i4, "composingExtent");
        return p;
    }
}
