package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d9b0 {
    public final ThemedImageUrlEntity a;
    public final c9b0 b;
    public final ccb0 c;

    public d9b0(ThemedImageUrlEntity themedImageUrlEntity, c9b0 c9b0Var, ccb0 ccb0Var) {
        this.a = themedImageUrlEntity;
        this.b = c9b0Var;
        this.c = ccb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9b0)) {
            return false;
        }
        d9b0 d9b0Var = (d9b0) obj;
        return this.a.equals(d9b0Var.a) && this.b.equals(d9b0Var.b) && this.c.equals(d9b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Content(icon=" + this.a + ", background=" + this.b + ", text=" + this.c + Extension.C_BRAKE;
    }
}
