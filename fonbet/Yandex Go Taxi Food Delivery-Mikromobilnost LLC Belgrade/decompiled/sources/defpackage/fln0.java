package defpackage;

/* loaded from: classes6.dex */
public final class fln0 {
    public final String a;
    public final CharSequence b;

    public fln0(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fln0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return jl40.l(this.a, ((fln0) obj).a);
        }
        ny61.t("null cannot be cast to non-null type ru.yandex.taxi.scooters.presentation.feedback.domain.model.ScootersFeedbackItem");
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
