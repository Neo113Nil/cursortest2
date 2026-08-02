package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class muu0 extends c {
    public static final muu0 b = new muu0();
    public static final String c = "toUrl";
    public static final List d = Collections.singletonList(new kms(EvaluableType.STRING, false));
    public static final EvaluableType e = EvaluableType.URL;
    public static final boolean f = true;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) a.P(list);
        try {
            try {
                new URL(str);
                return new rg21(str);
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid url ".concat(str));
            }
        } catch (IllegalArgumentException e2) {
            b.e(c, list, "Unable to convert value to Url.", e2);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return d;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return c;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return e;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return f;
    }
}
