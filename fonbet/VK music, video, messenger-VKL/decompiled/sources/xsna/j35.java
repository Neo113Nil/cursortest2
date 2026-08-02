package xsna;

import java.util.ArrayList;

/* compiled from: AuthGetCredentialsForServiceMultiResponseModel.kt */
/* loaded from: classes6.dex */
public final class j35 {
    public final ArrayList a;
    public final ArrayList b;

    public j35(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j35)) {
            return false;
        }
        j35 j35Var = (j35) obj;
        return this.a.equals(j35Var.a) && this.b.equals(j35Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetCredentialsForServiceMultiResponseModel(success=");
        sb.append(this.a);
        sb.append(", errors=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
