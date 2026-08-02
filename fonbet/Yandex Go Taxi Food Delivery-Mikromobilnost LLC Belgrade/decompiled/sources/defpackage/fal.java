package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class fal implements c4x {
    public final Expression a;
    public final DivEdgeInsets b;
    public final Expression c;
    public final aok d;
    public final aok e;
    public Integer f;

    public fal(Expression expression, DivEdgeInsets divEdgeInsets, Expression expression2, aok aokVar, aok aokVar2) {
        this.a = expression;
        this.b = divEdgeInsets;
        this.c = expression2;
        this.d = aokVar;
        this.e = aokVar2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((pal) ft6.b.A7.getValue()).b(ft6.a, this);
    }

    public fal() {
        this(null, null, null, null, null);
    }
}
