package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.ErrorBodyLoggingRule$Type;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class a6o {
    public static final z5o Companion = new z5o();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new fgn(28)), null};
    public final ErrorBodyLoggingRule$Type a;
    public final Integer b;

    public /* synthetic */ a6o(int i, ErrorBodyLoggingRule$Type errorBodyLoggingRule$Type, Integer num) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, y5o.a.getDescriptor());
            throw null;
        }
        this.a = errorBodyLoggingRule$Type;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6o)) {
            return false;
        }
        a6o a6oVar = (a6o) obj;
        return this.a == a6oVar.a && jl40.l(this.b, a6oVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ErrorBodyLoggingRule(type=" + this.a + ", length=" + this.b + Extension.C_BRAKE;
    }
}
