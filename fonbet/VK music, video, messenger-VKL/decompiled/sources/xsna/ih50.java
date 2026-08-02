package xsna;

import androidx.annotation.Nullable;

/* compiled from: MutablePair.java */
/* loaded from: classes12.dex */
public final class ih50<T> {

    @Nullable
    public String a;

    @Nullable
    public String b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof qg90)) {
            return false;
        }
        qg90 qg90Var = (qg90) obj;
        F f = qg90Var.a;
        Object obj2 = this.a;
        if (f != obj2 && (f == 0 || !f.equals(obj2))) {
            return false;
        }
        S s = qg90Var.b;
        Object obj3 = this.b;
        if (s != obj3) {
            return s != 0 && s.equals(obj3);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.a) + " " + ((Object) this.b) + "}";
    }
}
