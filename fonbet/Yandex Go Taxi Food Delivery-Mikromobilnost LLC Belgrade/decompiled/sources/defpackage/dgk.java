package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class dgk implements c4x, hex {
    public final Object a() {
        if (this instanceof zfk) {
            return ((zfk) this).a;
        }
        if (this instanceof bgk) {
            return ((bgk) this).a;
        }
        if (this instanceof yfk) {
            return ((yfk) this).a;
        }
        if (this instanceof cgk) {
            return ((cgk) this).a;
        }
        if (this instanceof agk) {
            return ((agk) this).b();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ofk) ft6.b.P1.getValue()).b(ft6.a, this);
    }
}
