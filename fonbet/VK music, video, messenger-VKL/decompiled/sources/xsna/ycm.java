package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogConvertIncognitoIntoUserEvent.kt */
/* loaded from: classes2.dex */
public final class ycm implements e900 {
    public final Peer a;
    public final int b;

    public ycm(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycm)) {
            return false;
        }
        ycm ycmVar = (ycm) obj;
        return epx.f(this.a, ycmVar.a) && this.b == ycmVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogConvertIncognitoIntoUserEvent(dialog=");
        sb.append(this.a);
        sb.append(", incognitoId=");
        return vu5.b(sb, this.b, ')');
    }
}
