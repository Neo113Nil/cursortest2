package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class iqk implements c4x, qvk {
    public final Expression a;
    public final Expression b;
    public final List c;
    public final String d;
    public Integer e;

    static {
        new kvo(Boolean.FALSE);
    }

    public iqk(Expression expression, Expression expression2, List list, String str) {
        this.a = expression;
        this.b = expression2;
        this.c = list;
        this.d = str;
    }

    @Override // defpackage.qvk
    public final String a() {
        return this.d;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((jqk) ft6.b.y3.getValue()).b(ft6.a, this);
    }
}
