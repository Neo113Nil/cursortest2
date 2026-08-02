package defpackage;

/* loaded from: classes6.dex */
public final class gln0 {
    public final int a;
    public final CharSequence b;

    public gln0(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gln0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            gln0 gln0Var = (gln0) obj;
            return this.a == gln0Var.a && jl40.l(this.b, gln0Var.b);
        }
        ny61.t("null cannot be cast to non-null type ru.yandex.taxi.scooters.presentation.feedback.domain.model.ScootersFeedbackItemLevelTitle");
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.a).hashCode() * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }
}
