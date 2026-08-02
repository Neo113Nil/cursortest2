package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cp8 {
    public final ArrayList a;
    public final nhq0 b;
    public final boolean c;

    public cp8(ArrayList arrayList, nhq0 nhq0Var, boolean z) {
        this.a = arrayList;
        this.b = nhq0Var;
        this.c = z;
    }

    public final List a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final nhq0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp8)) {
            return false;
        }
        cp8 cp8Var = (cp8) obj;
        return this.a.equals(cp8Var.a) && this.b.equals(cp8Var.b) && this.c == cp8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardSkinCarousel(items=");
        sb.append(this.a);
        sb.append(", selectedCard=");
        sb.append(this.b);
        sb.append(", promoAnimationRequired=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
