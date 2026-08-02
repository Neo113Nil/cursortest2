package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.BubbleToggleModel$Size;

/* loaded from: classes5.dex */
public final class fo6 {
    public final String a;
    public final BubbleToggleModel$Size b;
    public final String c;
    public final hty0 d;
    public final sbv e;
    public final x2s f;

    public fo6(String str, BubbleToggleModel$Size bubbleToggleModel$Size, String str2, hty0 hty0Var, sbv sbvVar, x2s x2sVar) {
        this.a = str;
        this.b = bubbleToggleModel$Size;
        this.c = str2;
        this.d = hty0Var;
        this.e = sbvVar;
        this.f = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo6)) {
            return false;
        }
        fo6 fo6Var = (fo6) obj;
        return jl40.l(this.a, fo6Var.a) && this.b == fo6Var.b && jl40.l(this.c, fo6Var.c) && jl40.l(this.d, fo6Var.d) && jl40.l(this.e, fo6Var.e) && this.f.equals(fo6Var.f);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        hty0 hty0Var = this.d;
        int hashCode = (b + (hty0Var == null ? 0 : hty0Var.hashCode())) * 31;
        sbv sbvVar = this.e;
        return this.f.hashCode() + ((hashCode + (sbvVar != null ? sbvVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BubbleToggleModel(id=" + this.a + ", size=" + this.b + ", text=" + this.c + ", textStyle=" + this.d + ", icon=" + this.e + ", analyticsData=" + this.f + Extension.C_BRAKE;
    }
}
