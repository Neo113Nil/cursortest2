package defpackage;

import com.yandex.go.profile.domain.flex.a;
import com.yandex.go.profile.domain.flex.f;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class nef0 {
    public final f a;
    public final a b;
    public final ljr c;

    public nef0(f fVar, a aVar, ljr ljrVar) {
        this.a = fVar;
        this.b = aVar;
        this.c = ljrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nef0)) {
            return false;
        }
        nef0 nef0Var = (nef0) obj;
        return this.a == nef0Var.a && this.b == nef0Var.b && this.c == nef0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 273205710) * 31);
    }

    public final String toString() {
        return "Payload(actionsRepository=" + this.a + ", documentTracker=" + this.b + ", screenName=superprofile, flexInsetParams=" + this.c + Extension.C_BRAKE;
    }
}
