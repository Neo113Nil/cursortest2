package defpackage;

import androidx.compose.runtime.h;

/* loaded from: classes.dex */
public final class q1b0 extends d2b0 {
    public r1b0 z;

    @Override // defpackage.d2b0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof h) {
            return super.containsKey((h) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof j131) {
            return super.containsValue((j131) obj);
        }
        return false;
    }

    @Override // defpackage.d2b0
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final r1b0 b() {
        ce11 ce11Var = this.c;
        r1b0 r1b0Var = this.z;
        if (ce11Var != r1b0Var.a) {
            this.b = new kx40();
            r1b0Var = new r1b0(this.c, this.y);
        }
        this.z = r1b0Var;
        return r1b0Var;
    }

    @Override // defpackage.d2b0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof h) {
            return (j131) super.get((h) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof h) ? obj2 : (j131) super.getOrDefault((h) obj, (j131) obj2);
    }

    @Override // defpackage.d2b0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof h) {
            return (j131) super.remove((h) obj);
        }
        return null;
    }
}
