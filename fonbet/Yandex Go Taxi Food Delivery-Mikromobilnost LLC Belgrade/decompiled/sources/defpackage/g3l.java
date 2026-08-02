package defpackage;

import com.yandex.div.json.expressions.Expression;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class g3l {
    public final w53 a = new w53();
    public final Expression b;

    public g3l(y2l y2lVar) {
        this.b = y2lVar.b;
        for (w2l w2lVar : y2lVar.a) {
            w53 w53Var = this.a;
            String str = w2lVar.a;
            Object obj = w2lVar.b;
            if (obj == null) {
                obj = EmptyList.a;
            }
            w53Var.put(str, obj);
        }
    }
}
