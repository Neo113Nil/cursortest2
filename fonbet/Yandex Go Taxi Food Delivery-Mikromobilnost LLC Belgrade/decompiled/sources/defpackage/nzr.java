package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class nzr {
    public final int a;
    public final List b;

    public nzr() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    public ozr[] a() {
        return (ozr[]) this.b.get(0);
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.a;
    }

    public List d() {
        return this.b;
    }

    public nzr(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public /* synthetic */ nzr(List list, int i) {
        this.b = list;
        this.a = i;
    }

    public nzr(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
