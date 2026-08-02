package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gmk0 implements zjk0 {
    public final String a;
    public final String b;
    public final ListBuilder c;
    public final ArrayList d;
    public final akk0 e;

    public gmk0(String str, String str2, ListBuilder listBuilder) {
        this.a = str;
        this.b = str2;
        this.c = listBuilder;
        ArrayList arrayList = new ArrayList(tcc.n(listBuilder, 10));
        Iterator<E> it = listBuilder.iterator();
        while (it.hasNext()) {
            arrayList.add(((fmk0) it.next()).c);
        }
        this.d = arrayList;
        this.e = qpa1.e(this.b, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmk0)) {
            return false;
        }
        gmk0 gmk0Var = (gmk0) obj;
        return jl40.l(this.a, gmk0Var.a) && jl40.l(this.b, gmk0Var.b) && this.c.equals(gmk0Var.c);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardPromoPlaqueListUiState(id=", this.a, ", analyticsId=", this.b, ", items=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
