package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d2l implements c4x {
    public Integer a;

    public final Object a() {
        if (this instanceof c2l) {
            return ((c2l) this).b;
        }
        if (this instanceof a2l) {
            return ((a2l) this).b;
        }
        if (this instanceof b2l) {
            return ((b2l) this).b;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((e2l) ft6.b.H5.getValue()).b(ft6.a, this);
    }
}
