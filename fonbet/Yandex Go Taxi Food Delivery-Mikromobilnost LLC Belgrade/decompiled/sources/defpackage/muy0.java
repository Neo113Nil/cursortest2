package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.TextAlignment;

/* loaded from: classes5.dex */
public final class muy0 extends n351 {
    public final luy0 c;
    public final y7m d;
    public final l690 e;
    public final TextAlignment f;
    public final b151 g;
    public final yg h;
    public final x2s i;
    public final String j;

    public muy0(luy0 luy0Var, y7m y7mVar, l690 l690Var, TextAlignment textAlignment, x9x0 x9x0Var, yg ygVar, x2s x2sVar, String str) {
        super("text", false, 14);
        this.c = luy0Var;
        this.d = y7mVar;
        this.e = l690Var;
        this.f = textAlignment;
        this.g = x9x0Var;
        this.h = ygVar;
        this.i = x2sVar;
        this.j = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muy0)) {
            return false;
        }
        muy0 muy0Var = (muy0) obj;
        return jl40.l(this.c, muy0Var.c) && jl40.l(this.d, muy0Var.d) && this.e.equals(muy0Var.e) && this.f == muy0Var.f && jl40.l(this.g, muy0Var.g) && jl40.l(this.h, muy0Var.h) && this.i.equals(muy0Var.i) && jl40.l(this.j, muy0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        y7m y7mVar = this.d;
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (y7mVar == null ? 0 : Float.hashCode(y7mVar.a))) * 31)) * 31)) * 31;
        b151 b151Var = this.g;
        int hashCode3 = (hashCode2 + (b151Var == null ? 0 : b151Var.hashCode())) * 31;
        yg ygVar = this.h;
        int a = tse0.a(this.i, (hashCode3 + (ygVar == null ? 0 : ygVar.hashCode())) * 31, 31);
        String str = this.j;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TextWidgetModel(text=" + this.c + ", height=" + this.d + ", padding=" + this.e + ", alignment=" + this.f + ", widgetAction=" + this.g + ", accessibilityInfo=" + this.h + ", onShownAnalyticsData=" + this.i + ", id=" + this.j + Extension.C_BRAKE;
    }
}
