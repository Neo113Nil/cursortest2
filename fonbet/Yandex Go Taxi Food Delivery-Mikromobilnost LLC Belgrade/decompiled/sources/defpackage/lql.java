package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lql implements c4x {
    public final Expression a;
    public final t9l b;
    public final t9l c;
    public Integer d;

    public lql(t9l t9lVar, t9l t9lVar2, Expression expression) {
        this.a = expression;
        this.b = t9lVar;
        this.c = t9lVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((mql) ft6.b.U9.getValue()).b(ft6.a, this);
    }

    public lql() {
        this(null, null, null);
    }
}
