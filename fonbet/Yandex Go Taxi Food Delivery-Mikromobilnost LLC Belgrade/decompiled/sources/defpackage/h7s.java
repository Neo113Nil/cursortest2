package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.types.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public final class h7s extends c {
    public static final h7s b = new h7s();
    public static final String c = "formatDateAsLocalWithLocale";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        kms kmsVar = new kms(EvaluableType.DATETIME, false);
        EvaluableType evaluableType = EvaluableType.STRING;
        d = scc.g(kmsVar, new kms(evaluableType, false), new kms(evaluableType, false));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        a aVar = (a) list.get(0);
        String str = (String) list.get(1);
        String str2 = (String) list.get(2);
        Date date = new Date(aVar.a);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new Locale.Builder().setLanguageTag(str2).build());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(date);
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
