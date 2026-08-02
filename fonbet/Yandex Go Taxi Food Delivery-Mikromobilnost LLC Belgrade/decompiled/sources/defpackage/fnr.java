package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.am.AuthType;

/* loaded from: classes12.dex */
public final class fnr {
    public final String a;
    public final AuthType b;
    public final List c;
    public final uhx d;
    public final boolean e;

    public fnr(String str, AuthType authType, List list, uhx uhxVar, boolean z) {
        this.a = str;
        this.b = authType;
        this.c = list;
        this.d = uhxVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fnr) {
            fnr fnrVar = (fnr) obj;
            if (jl40.l(this.a, fnrVar.a) && this.b == fnrVar.b && jl40.l(this.c, fnrVar.c) && this.d == fnrVar.d && this.e == fnrVar.e) {
                EmptyList emptyList = EmptyList.a;
                if (emptyList.equals(emptyList)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AuthType authType = this.b;
        return ((Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.c((hashCode + (authType == null ? 0 : authType.hashCode())) * 31, 31, this.c)) * 31)) * 31) + 1;
    }

    public final String toString() {
        return "FlexWebViewRouterPayload(url=" + this.a + ", authType=" + this.b + ", callbacks=" + this.c + ", actionHandler=" + this.d + ", swipeable=" + this.e + ", externalWebCallbacks=" + EmptyList.a + Extension.C_BRAKE;
    }
}
