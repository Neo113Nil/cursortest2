package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hgl implements c4x {
    public final Expression a;
    public final bcl b;
    public Integer c;

    public hgl(Expression expression, bcl bclVar) {
        this.a = expression;
        this.b = bclVar;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((igl) ft6.b.w8.getValue()).b(ft6.a, this);
    }

    public hgl() {
        this(null, null);
    }
}
