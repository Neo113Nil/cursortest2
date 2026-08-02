package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class agl implements c4x {
    public Integer a;

    public final Object a() {
        if (this instanceof zfl) {
            return ((zfl) this).b();
        }
        if (this instanceof yfl) {
            return ((yfl) this).b();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((bgl) ft6.b.t8.getValue()).b(ft6.a, this);
    }
}
