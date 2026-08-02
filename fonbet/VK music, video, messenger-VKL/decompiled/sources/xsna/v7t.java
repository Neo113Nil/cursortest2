package xsna;

import com.vk.games.presentation.catalog.model.ListNextState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GamesCatalogState.kt */
/* loaded from: classes17.dex */
public final class v7t {
    public final List<udt> a;
    public final boolean b;
    public final boolean c;
    public final kbt d;
    public final boolean e;
    public final ListNextState f;
    public final boolean g;
    public final int h;

    public v7t() {
        this(null, null, false, 0, 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v7t a(v7t v7tVar, ArrayList arrayList, boolean z, boolean z2, ListNextState listNextState, boolean z3, int i, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = v7tVar.a;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            z = v7tVar.b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = v7tVar.c;
        }
        boolean z5 = z2;
        kbt kbtVar = (i2 & 8) != 0 ? v7tVar.d : null;
        boolean z6 = (i2 & 16) != 0 ? v7tVar.e : true;
        if ((i2 & 32) != 0) {
            listNextState = v7tVar.f;
        }
        ListNextState listNextState2 = listNextState;
        boolean z7 = (i2 & 64) != 0 ? v7tVar.g : z3;
        int i3 = (i2 & 128) != 0 ? v7tVar.h : i;
        v7tVar.getClass();
        return new v7t(list2, z4, z5, kbtVar, z6, listNextState2, z7, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7t)) {
            return false;
        }
        v7t v7tVar = (v7t) obj;
        return epx.f(this.a, v7tVar.a) && this.b == v7tVar.b && this.c == v7tVar.c && epx.f(this.d, v7tVar.d) && this.e == v7tVar.e && this.f == v7tVar.f && this.g == v7tVar.g && this.h == v7tVar.h;
    }

    public final int hashCode() {
        List<udt> list = this.a;
        int b = qoy.b(qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.b), 31, this.c);
        kbt kbtVar = this.d;
        int b2 = qoy.b((b + (kbtVar == null ? 0 : kbtVar.hashCode())) * 31, 31, this.e);
        ListNextState listNextState = this.f;
        return Integer.hashCode(this.h) + qoy.b((b2 + (listNextState != null ? listNextState.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamePageData(data=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        sb.append(this.c);
        sb.append(", error=");
        sb.append(this.d);
        sb.append(", errorToastState=");
        sb.append(this.e);
        sb.append(", nextLoadState=");
        sb.append(this.f);
        sb.append(", hasNext=");
        sb.append(this.g);
        sb.append(", loadedElements=");
        return vu5.b(sb, this.h, ')');
    }

    public /* synthetic */ v7t(ArrayList arrayList, kbt kbtVar, boolean z, int i, int i2) {
        this((i2 & 1) != 0 ? null : arrayList, false, false, (i2 & 8) != 0 ? null : kbtVar, false, null, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v7t(List<? extends udt> list, boolean z, boolean z2, kbt kbtVar, boolean z3, ListNextState listNextState, boolean z4, int i) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = kbtVar;
        this.e = z3;
        this.f = listNextState;
        this.g = z4;
        this.h = i;
    }
}
