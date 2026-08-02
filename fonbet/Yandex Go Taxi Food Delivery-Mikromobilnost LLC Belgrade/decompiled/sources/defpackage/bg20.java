package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class bg20 {
    public final CharSequence a;
    public final FormattedText b;

    public bg20(CharSequence charSequence, FormattedText formattedText) {
        this.a = charSequence;
        this.b = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg20)) {
            return false;
        }
        bg20 bg20Var = (bg20) obj;
        return jl40.l(this.b, bg20Var.b) && jl40.l(this.a.toString(), bg20Var.a.toString());
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
