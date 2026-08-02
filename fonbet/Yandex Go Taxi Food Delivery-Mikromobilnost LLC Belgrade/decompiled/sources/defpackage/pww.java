package defpackage;

import com.yandex.plus.core.graphql.type.INVITE_CANCELLATION_REASON;

/* loaded from: classes2.dex */
public final class pww {
    public final qww a;
    public final INVITE_CANCELLATION_REASON b;

    public pww(qww qwwVar, INVITE_CANCELLATION_REASON invite_cancellation_reason) {
        this.a = qwwVar;
        this.b = invite_cancellation_reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pww)) {
            return false;
        }
        pww pwwVar = (pww) obj;
        return jl40.l(this.a, pwwVar.a) && this.b == pwwVar.b;
    }

    public final int hashCode() {
        qww qwwVar = this.a;
        return this.b.hashCode() + ((qwwVar == null ? 0 : qwwVar.hashCode()) * 31);
    }

    public final String toString() {
        return "FamilyInvite(webViewInvite=" + this.a + ", inviteCancellationReason=" + this.b + ')';
    }
}
