package defpackage;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;

/* loaded from: classes.dex */
public final class pph implements vph {
    public final AdditionalAction a;

    public pph(AdditionalAction additionalAction) {
        this.a = additionalAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pph) && this.a == ((pph) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
