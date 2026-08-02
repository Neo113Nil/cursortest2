package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a1l implements c4x {
    public Integer a;

    public final Object a() {
        if (this instanceof z0l) {
            return ((z0l) this).b();
        }
        if (this instanceof y0l) {
            return ((y0l) this).b;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((b1l) ft6.b.E5.getValue()).b(ft6.a, this);
    }
}
