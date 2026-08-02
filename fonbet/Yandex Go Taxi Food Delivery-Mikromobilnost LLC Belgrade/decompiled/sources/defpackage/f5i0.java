package defpackage;

import com.yandex.browser.rtm.Environment;
import com.yandex.browser.rtm.Platform;

/* loaded from: classes.dex */
public final class f5i0 {
    public final String a;
    public final k5i0 b;
    public final String c;
    public final String d;
    public final Platform e;
    public final String f;
    public final Environment g;
    public final i5i0 h;

    public f5i0(e5i0 e5i0Var) {
        this.a = e5i0Var.a;
        this.c = e5i0Var.b;
        this.b = e5i0Var.c;
        this.d = e5i0Var.d;
        this.e = e5i0Var.e;
        this.f = e5i0Var.f;
        this.g = e5i0Var.g;
        i5i0 i5i0Var = e5i0Var.h;
        this.h = i5i0Var == null ? new i5i0(0) : i5i0Var;
    }

    public final b5i0 a(String str) {
        return new b5i0(str, this.b, this.a, this.c, this.d, this.e, this.g, this.f, this.h);
    }
}
