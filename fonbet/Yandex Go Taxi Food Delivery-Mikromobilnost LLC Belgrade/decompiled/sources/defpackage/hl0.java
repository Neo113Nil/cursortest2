package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class hl0 {
    public final FormattedText a;
    public final Integer b;
    public final Integer c;
    public final yn0 d;

    public static final class a {
        public FormattedText a;
        public Integer b;
    }

    public hl0(FormattedText formattedText, Integer num, Integer num2, yn0 yn0Var) {
        this.a = formattedText;
        this.b = num;
        this.c = num2;
        this.d = yn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl0)) {
            return false;
        }
        hl0 hl0Var = (hl0) obj;
        return jl40.l(this.a, hl0Var.a) && jl40.l(this.b, hl0Var.b) && jl40.l(this.c, hl0Var.c) && jl40.l(this.d, hl0Var.d);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        yn0 yn0Var = this.d;
        return hashCode3 + (yn0Var != null ? yn0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalButtonSuggestViewModel(title=" + this.a + ", color=" + this.b + ", size=" + this.c + ", additionalAction=" + this.d + Extension.C_BRAKE;
    }

    public hl0() {
        this(null, null, null, null);
    }
}
