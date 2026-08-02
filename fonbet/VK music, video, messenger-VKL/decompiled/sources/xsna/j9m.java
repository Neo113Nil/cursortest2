package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogAddIncognitoEvent.kt */
/* loaded from: classes2.dex */
public final class j9m implements e900 {
    public final Peer a;
    public final int b;

    public j9m(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9m)) {
            return false;
        }
        j9m j9mVar = (j9m) obj;
        return epx.f(this.a, j9mVar.a) && this.b == j9mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAddIncognitoEvent(dialog=");
        sb.append(this.a);
        sb.append(", incognitoId=");
        return vu5.b(sb, this.b, ')');
    }
}
