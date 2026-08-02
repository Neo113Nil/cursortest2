package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;

/* loaded from: classes5.dex */
public final class obu implements pre {
    public final String a;
    public final sbv b;
    public final FormattedText c;
    public final hty0 d;
    public final boolean e;
    public final fws0 f;
    public final fws0 g;
    public final vu0 h;

    public obu(String str, sbv sbvVar, FormattedText formattedText, hty0 hty0Var, boolean z, fws0 fws0Var, fws0 fws0Var2, vu0 vu0Var) {
        this.a = str;
        this.b = sbvVar;
        this.c = formattedText;
        this.d = hty0Var;
        this.e = z;
        this.f = fws0Var;
        this.g = fws0Var2;
        this.h = vu0Var;
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "header";
    }
}
