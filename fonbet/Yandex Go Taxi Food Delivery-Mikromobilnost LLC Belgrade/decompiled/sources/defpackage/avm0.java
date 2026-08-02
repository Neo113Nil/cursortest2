package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class avm0 implements bvm0 {
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final String f;
    public final yum0 g;
    public final vum0 h;
    public final xum0 i;
    public final zum0 j;

    public avm0(String str, String str2, FormattedText formattedText, FormattedText formattedText2, String str3, String str4, yum0 yum0Var, vum0 vum0Var, xum0 xum0Var, zum0 zum0Var) {
        this.a = str;
        this.b = str2;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = str3;
        this.f = str4;
        this.g = yum0Var;
        this.h = vum0Var;
        this.i = xum0Var;
        this.j = zum0Var;
    }

    @Override // defpackage.bvm0
    public final String a() {
        return this.f;
    }

    @Override // defpackage.bvm0
    public final FormattedText b() {
        return this.c;
    }

    @Override // defpackage.bvm0
    public final FormattedText c() {
        return this.d;
    }

    @Override // defpackage.bvm0
    public final String getBackgroundColor() {
        return this.e;
    }
}
