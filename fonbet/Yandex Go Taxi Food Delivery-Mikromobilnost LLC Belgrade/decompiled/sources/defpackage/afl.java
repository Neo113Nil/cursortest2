package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class afl implements c4x {
    public final List a;
    public final List b;
    public final List c;
    public final Expression d;
    public Integer e;

    public afl(Expression expression, List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = expression;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ifl) ft6.b.W8.getValue()).b(ft6.a, this);
    }
}
