package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eok implements c4x, hex {
    public final y8l a;

    public eok(y8l y8lVar) {
        this.a = y8lVar;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        cok cokVar = (cok) ft6.b.e3.getValue();
        lb7 lb7Var = ft6.a;
        if (this instanceof eok) {
            return ((w8l) cokVar.a.g7.getValue()).b(lb7Var, this.a);
        }
        cokVar.getClass();
        w511.b();
        return null;
    }
}
