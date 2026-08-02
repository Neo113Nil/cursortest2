package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class myr {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myr)) {
            return false;
        }
        myr myrVar = (myr) obj;
        return Objects.equals(this.a, myrVar.a) && Objects.equals(this.b, myrVar.b) && Objects.equals(this.c, myrVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
