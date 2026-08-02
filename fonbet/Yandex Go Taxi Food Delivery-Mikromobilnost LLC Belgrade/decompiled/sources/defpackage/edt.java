package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;

/* loaded from: classes11.dex */
public final class edt extends udt {
    public static final edt d = new edt();
    public static final List e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        e = scc.g(new kms(evaluableType, false), new kms(evaluableType, false), new kms(EvaluableType.BOOLEAN, false));
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return e;
    }

    @Override // com.yandex.div.evaluable.function.n
    public final boolean l() {
        return f;
    }
}
