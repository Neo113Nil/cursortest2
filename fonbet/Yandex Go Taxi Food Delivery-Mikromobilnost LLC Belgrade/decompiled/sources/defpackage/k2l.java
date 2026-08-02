package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class k2l implements c4x, hex {
    public final Object a() {
        if (this instanceof j2l) {
            return ((j2l) this).a;
        }
        if (this instanceof h2l) {
            return ((h2l) this).b();
        }
        if (this instanceof i2l) {
            return ((i2l) this).b();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((f2l) ft6.b.I5.getValue()).b(ft6.a, this);
    }
}
