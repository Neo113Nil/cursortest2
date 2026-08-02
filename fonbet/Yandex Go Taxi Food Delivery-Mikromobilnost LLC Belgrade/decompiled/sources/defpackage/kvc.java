package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.OptionType;

/* loaded from: classes5.dex */
public final class kvc {
    public static final kvc h = new kvc(0);
    public final String a;
    public final String b;
    public final String c;
    public final CharSequence d;
    public final boolean e;
    public final OptionType f;
    public final CharSequence g;

    public kvc(String str, String str2, String str3, CharSequence charSequence, boolean z, OptionType optionType, CharSequence charSequence2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = charSequence;
        this.e = z;
        this.f = optionType;
        this.g = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvc)) {
            return false;
        }
        kvc kvcVar = (kvc) obj;
        return jl40.l(this.a, kvcVar.a) && jl40.l(this.b, kvcVar.b) && jl40.l(this.c, kvcVar.c) && jl40.l(this.d, kvcVar.d) && this.e == kvcVar.e && this.f == kvcVar.f && jl40.l(this.g, kvcVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + unr0.e(smw0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ComparisonItemUiState(title=", this.a, ", subtitle=", this.b, ", price=");
        v.append(this.c);
        v.append(", time=");
        v.append((Object) this.d);
        v.append(", selected=");
        v.append(this.e);
        v.append(", type=");
        v.append(this.f);
        v.append(", timeDescription=");
        return xvz.n(v, this.g, Extension.C_BRAKE);
    }

    public kvc() {
        this(0);
    }

    public /* synthetic */ kvc(int i) {
        this("", "", "", "", false, OptionType.ORIGINAL, "");
    }
}
