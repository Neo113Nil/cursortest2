package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class iqm0 {
    public final hqm0 a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final boolean f;
    public final xpm0 g;
    public final xpm0 h;

    public /* synthetic */ iqm0(fqm0 fqm0Var, String str, FormattedText formattedText, FormattedText formattedText2, xpm0 xpm0Var, xpm0 xpm0Var2, int i) {
        this((i & 1) != 0 ? null : fqm0Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : formattedText, null, (i & 16) != 0 ? null : formattedText2, false, (i & 64) != 0 ? null : xpm0Var, (i & 128) != 0 ? null : xpm0Var2);
    }

    public iqm0() {
        this(null, null, null, null, null, null, 255);
    }

    public iqm0(hqm0 hqm0Var, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, boolean z, xpm0 xpm0Var, xpm0 xpm0Var2) {
        this.a = hqm0Var;
        this.b = str;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = formattedText3;
        this.f = z;
        this.g = xpm0Var;
        this.h = xpm0Var2;
    }
}
