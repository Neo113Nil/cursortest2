package defpackage;

import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes6.dex */
public final class gd30 {
    public final String a;
    public final f140 b;
    public final boolean c;
    public final boolean d;
    public final ButtonSize e;
    public final ButtonStyle f;
    public final ButtonForm g;

    public gd30(String str, f140 f140Var, boolean z, boolean z2, ButtonSize buttonSize, ButtonStyle buttonStyle, int i) {
        buttonSize = (i & 16) != 0 ? ButtonSize.L : buttonSize;
        ButtonForm buttonForm = ButtonForm.Squircle;
        this.a = str;
        this.b = f140Var;
        this.c = z;
        this.d = z2;
        this.e = buttonSize;
        this.f = buttonStyle;
        this.g = buttonForm;
    }
}
