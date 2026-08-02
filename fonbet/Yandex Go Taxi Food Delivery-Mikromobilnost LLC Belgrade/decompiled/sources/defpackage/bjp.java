package defpackage;

import defpackage.khp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes5.dex */
public final class bjp {
    public static final bjp h;
    public final String a;
    public final khp.a b;
    public final e81 c;
    public final ArrayList d;
    public final ArrayList e;
    public List f;
    public List g;

    static {
        e81 e81Var = new e81(0);
        EmptyList emptyList = EmptyList.a;
        h = new bjp(emptyList, emptyList, "", null, e81Var);
    }

    public bjp(List list, List list2, String str, khp.a aVar, e81 e81Var) {
        this.a = str;
        this.b = aVar;
        this.c = e81Var;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list2);
        this.e = arrayList2;
        EmptyList emptyList = EmptyList.a;
        this.f = emptyList;
        this.g = emptyList;
        a();
    }

    public final void a() {
        this.f = this.d;
        this.g = a.J0(this.e);
    }
}
