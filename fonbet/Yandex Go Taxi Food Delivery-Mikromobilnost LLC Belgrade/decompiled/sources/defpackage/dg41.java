package defpackage;

import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class dg41 {
    public final UiWebViewConfig a;
    public final bi41 b;
    public final dp41 c;
    public final s45 d;
    public final String e;
    public final em41 f;
    public final to41 g;
    public final ms41 h;

    public dg41(UiWebViewConfig uiWebViewConfig, bi41 bi41Var, dp41 dp41Var, sc scVar, em41 em41Var, lul0 lul0Var, ovl0 ovl0Var, int i) {
        bi41Var = (i & 2) != 0 ? bi41.D4 : bi41Var;
        dp41Var = (i & 4) != 0 ? dp41.a : dp41Var;
        scVar = (i & 8) != 0 ? null : scVar;
        String str = (i & 16) != 0 ? null : "Family.Webview";
        em41Var = (i & 32) != 0 ? null : em41Var;
        to41 to41Var = (i & 64) != 0 ? to41.a : lul0Var;
        ms41 ms41Var = (i & 128) != 0 ? ms41.a : ovl0Var;
        this.a = uiWebViewConfig;
        this.b = bi41Var;
        this.c = dp41Var;
        this.d = scVar;
        this.e = str;
        this.f = em41Var;
        this.g = to41Var;
        this.h = ms41Var;
    }
}
