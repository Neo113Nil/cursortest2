package defpackage;

import com.yandex.plus.core.graphql.type.CHANGE_VOLUNTARY_AGREEMENT_STATUS;

/* loaded from: classes2.dex */
public final class cb9 {
    public final CHANGE_VOLUNTARY_AGREEMENT_STATUS a;

    public cb9(CHANGE_VOLUNTARY_AGREEMENT_STATUS change_voluntary_agreement_status) {
        this.a = change_voluntary_agreement_status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb9) && this.a == ((cb9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChangeVoluntaryAgreementStatus(status=" + this.a + ')';
    }
}
