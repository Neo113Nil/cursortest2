package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class kdl implements c4x {
    public final m3k a;
    public final Expression b;
    public final v3k c;
    public Integer d;

    public kdl(m3k m3kVar, Expression expression, v3k v3kVar) {
        this.a = m3kVar;
        this.b = expression;
        this.c = v3kVar;
    }

    public static kdl a(kdl kdlVar, m3k m3kVar) {
        return new kdl(m3kVar, kdlVar.b, kdlVar.c);
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((vdl) ft6.b.n8.getValue()).b(ft6.a, this);
    }
}
