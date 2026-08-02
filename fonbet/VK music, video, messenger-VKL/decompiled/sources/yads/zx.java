package yads;

import java.util.Map;

/* loaded from: classes10.dex */
public final class zx extends b0 {
    public final Object b;
    public int c;
    public final /* synthetic */ cy d;

    public zx(cy cyVar, int i) {
        this.d = cyVar;
        this.b = cyVar.b(i);
        this.c = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Map a = this.d.a();
        if (a != null) {
            return a.get(this.b);
        }
        int i = this.c;
        if (i == -1 || i >= this.d.size() || !ma2.a(this.b, this.d.b(this.c))) {
            this.c = this.d.a(this.b);
        }
        int i2 = this.c;
        if (i2 == -1) {
            return null;
        }
        return this.d.c(i2);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map a = this.d.a();
        if (a != null) {
            return a.put(this.b, obj);
        }
        int i = this.c;
        if (i == -1 || i >= this.d.size() || !ma2.a(this.b, this.d.b(this.c))) {
            this.c = this.d.a(this.b);
        }
        int i2 = this.c;
        if (i2 == -1) {
            this.d.put(this.b, obj);
            return null;
        }
        Object c = this.d.c(i2);
        this.d.a(this.c, obj);
        return c;
    }
}
