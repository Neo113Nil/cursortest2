package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$NeedAuthorization$Reason;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class pt80 implements pw80 {
    public static final nt80 Companion = new nt80();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(18)), null};
    public final String a;
    public final OutMessage$NeedAuthorization$Reason b;
    public final String c;

    public /* synthetic */ pt80(int i, String str, OutMessage$NeedAuthorization$Reason outMessage$NeedAuthorization$Reason, String str2) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, mt80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = outMessage$NeedAuthorization$Reason;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt80)) {
            return false;
        }
        pt80 pt80Var = (pt80) obj;
        return jl40.l(this.a, pt80Var.a) && this.b == pt80Var.b && jl40.l(this.c, pt80Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedAuthorization(trackId=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", callbackUrl=");
        return b64.p(sb, this.c, ')');
    }
}
