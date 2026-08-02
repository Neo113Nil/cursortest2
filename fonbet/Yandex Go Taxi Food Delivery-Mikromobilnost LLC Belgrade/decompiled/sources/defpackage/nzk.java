package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nzk implements c4x {
    public final t9l a;
    public final t9l b;
    public final Expression c;
    public Integer d;

    public nzk(t9l t9lVar, t9l t9lVar2, Expression expression) {
        this.a = t9lVar;
        this.b = t9lVar2;
        this.c = expression;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ozk) ft6.b.g5.getValue()).b(ft6.a, this);
    }

    public nzk() {
        this(null, null, null);
    }
}
