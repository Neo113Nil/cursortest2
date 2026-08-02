package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class dtu0 extends c {
    public static final dtu0 b = new dtu0();
    public static final String c = "encodeUri";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        d = Collections.singletonList(new kms(evaluableType, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return cvu0.v(cvu0.v(cvu0.v(cvu0.v(cvu0.v(cvu0.v(URLEncoder.encode((String) list.get(0), uza.a.name()), "+", "%20", false), "%21", "!", false), "%7E", "~", false), "%27", "'", false), "%28", Extension.O_BRAKE, false), "%29", Extension.C_BRAKE, false);
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
