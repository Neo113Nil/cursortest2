package defpackage;

import com.yandex.go.user_profile.ui.ProfileContext;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pcf0 extends adf0 {
    public final ProfileContext a;
    public final jff0 b;
    public final sff0 c;

    public pcf0(ProfileContext profileContext, jff0 jff0Var, sff0 sff0Var) {
        this.a = profileContext;
        this.b = jff0Var;
        this.c = sff0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcf0)) {
            return false;
        }
        pcf0 pcf0Var = (pcf0) obj;
        return this.a == pcf0Var.a && jl40.l(this.b, pcf0Var.b) && jl40.l(this.c, pcf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HandleNameAndRating(profileContext=" + this.a + ", name=" + this.b + ", rating=" + this.c + Extension.C_BRAKE;
    }
}
