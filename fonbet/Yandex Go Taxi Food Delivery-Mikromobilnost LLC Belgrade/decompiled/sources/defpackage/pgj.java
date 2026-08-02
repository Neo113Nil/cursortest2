package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.k;
import java.util.List;

/* loaded from: classes.dex */
public abstract class pgj extends c {
    public final List b;
    public final EvaluableType c;

    public pgj() {
        EvaluableType evaluableType = EvaluableType.BOOLEAN;
        this.b = scc.g(new kms(evaluableType, false), new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, true));
        this.c = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Boolean bool = (Boolean) list.get(0);
        Object b = k.b(list, bool, false);
        Boolean bool2 = b instanceof Boolean ? (Boolean) b : null;
        return bool2 == null ? bool : bool2;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }
}
