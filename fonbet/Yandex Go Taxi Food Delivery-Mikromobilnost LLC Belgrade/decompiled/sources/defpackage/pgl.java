package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class pgl implements c4x {
    public Integer a;

    public final Object a() {
        if (this instanceof ngl) {
            return ((ngl) this).b();
        }
        if (this instanceof ogl) {
            return ((ogl) this).b();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((vgl) ft6.b.H8.getValue()).b(ft6.a, this);
    }
}
