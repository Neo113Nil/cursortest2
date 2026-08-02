package defpackage;

import java.util.Map;
import java.util.Objects;
import yads.nx;

/* loaded from: classes7.dex */
public final class ar71 extends sw81 {
    public final Object a;
    public int w;
    public final /* synthetic */ nx x;

    public ar71(nx nxVar, int i) {
        this.x = nxVar;
        this.a = nxVar.c(i);
        this.w = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        nx nxVar = this.x;
        Map f = nxVar.f();
        Object obj = this.a;
        if (f != null) {
            return f.get(obj);
        }
        int i = this.w;
        if (i == -1 || i >= nxVar.size() || !tja1.a(obj, nxVar.c(this.w))) {
            this.w = nxVar.b(obj);
        }
        int i2 = this.w;
        if (i2 == -1) {
            return null;
        }
        return nxVar.h(i2);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        nx nxVar = this.x;
        Map f = nxVar.f();
        Object obj2 = this.a;
        if (f != null) {
            return f.put(obj2, obj);
        }
        int i = this.w;
        if (i == -1 || i >= nxVar.size() || !tja1.a(obj2, nxVar.c(this.w))) {
            this.w = nxVar.b(obj2);
        }
        int i2 = this.w;
        if (i2 == -1) {
            nxVar.put(obj2, obj);
            return null;
        }
        Object h = nxVar.h(i2);
        int i3 = this.w;
        Object[] objArr = nxVar.w;
        Objects.requireNonNull(objArr);
        objArr[i3] = obj;
        return h;
    }
}
