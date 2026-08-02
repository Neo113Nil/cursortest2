package defpackage;

import com.yandex.plus.core.data.common.PlusThemedImage;
import java.util.List;

/* loaded from: classes2.dex */
public final class i6c {
    public final PlusThemedImage a;
    public final CharSequence b;
    public final CharSequence c;
    public final List d;
    public final String e;
    public final String f;
    public final CharSequence g;

    public i6c(PlusThemedImage plusThemedImage, CharSequence charSequence, CharSequence charSequence2, List list, String str, String str2, CharSequence charSequence3) {
        this.a = plusThemedImage;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6c)) {
            return false;
        }
        i6c i6cVar = (i6c) obj;
        return jl40.l(this.a, i6cVar.a) && jl40.l(this.b, i6cVar.b) && jl40.l(this.c, i6cVar.c) && jl40.l(this.d, i6cVar.d) && jl40.l(this.e, i6cVar.e) && jl40.l(this.f, i6cVar.f) && jl40.l(this.g, i6cVar.g);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int b2 = unr0.b(unr0.b(unr0.c((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        CharSequence charSequence2 = this.g;
        return b2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingOfferContent(backgroundImage=" + this.a + ", titleText=" + ((Object) this.b) + ", subtitleText=" + ((Object) this.c) + ", itemContent=" + this.d + ", acceptButtonText=" + this.e + ", rejectButtonText=" + this.f + ", footerText=" + ((Object) this.g) + ')';
    }
}
