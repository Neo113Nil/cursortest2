package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;

/* loaded from: classes11.dex */
public final class eet extends fet {
    public static final eet d = new eet();
    public static final List e;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        e = scc.g(new kms(evaluableType, false), new kms(evaluableType, false));
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return e;
    }
}
