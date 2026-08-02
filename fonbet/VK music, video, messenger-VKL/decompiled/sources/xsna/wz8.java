package xsna;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* compiled from: CalendarModel.kt */
/* loaded from: classes11.dex */
public abstract class wz8 {
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();

    public wz8(Locale locale) {
        this.a = locale;
    }

    public abstract String a(long j, String str, Locale locale);

    public abstract rz8 b(long j);

    public abstract bxk c(Locale locale);

    public abstract int d();

    public abstract zz8 e(int i, int i2);

    public abstract zz8 f(long j);

    public abstract zz8 g(rz8 rz8Var);

    public abstract rz8 h();

    public abstract List<Pair<String, String>> i();

    public abstract rz8 j(String str, String str2, Locale locale);

    public abstract zz8 k(zz8 zz8Var, int i);
}
