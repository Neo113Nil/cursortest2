package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* loaded from: classes.dex */
public final class rl5 extends j5k.e.d.AbstractC3105e.b {
    public final String a;
    public final String b;

    public rl5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // xsna.j5k.e.d.AbstractC3105e.b
    @NonNull
    public final String a() {
        return this.a;
    }

    @Override // xsna.j5k.e.d.AbstractC3105e.b
    @NonNull
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.AbstractC3105e.b)) {
            return false;
        }
        j5k.e.d.AbstractC3105e.b bVar = (j5k.e.d.AbstractC3105e.b) obj;
        return this.a.equals(bVar.a()) && this.b.equals(bVar.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return i5s.a(sb, this.b, "}");
    }
}
