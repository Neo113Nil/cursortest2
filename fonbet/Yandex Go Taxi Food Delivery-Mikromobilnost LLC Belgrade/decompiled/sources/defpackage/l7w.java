package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l7w implements c4x {
    public final String a;
    public final Expression b;
    public Integer c;

    public l7w(Expression expression, String str) {
        this.a = str;
        this.b = expression;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        m7w m7wVar = (m7w) ft6.b.ja.getValue();
        lb7 lb7Var = ft6.a;
        m7wVar.getClass();
        return m7w.d(lb7Var, this);
    }
}
