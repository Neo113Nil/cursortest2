package defpackage;

import androidx.compose.runtime.f;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class kdb1 {
    public static final void a(sls slsVar, f530 f530Var, c6y c6yVar, s5y s5yVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1055276397);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.k(c6yVar) ? 256 : 128) | (btsVar.k(s5yVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            qdb1.a(wwg.S(-933153643, true, new r5y(c6yVar, f530Var, s5yVar, f.n(slsVar, btsVar), 0), btsVar), btsVar, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) slsVar, f530Var, (Object) c6yVar, (Object) s5yVar, i, 10);
        }
    }

    public static final void b(final float f, float f2, fid fidVar, final int i) {
        final float f3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1379381290);
        int i2 = (btsVar.b(f2) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 n = ljs0.n(c530.a, f2, f);
            byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
            a7u0 a7u0Var = gl51.a;
            f3 = f2;
            ocb1.b(n, f3, ((el51) btsVar.m(a7u0Var)).c(), ((el51) btsVar.m(a7u0Var)).d(), b, 0, null, btsVar, i2 & 112, 96);
        } else {
            f3 = f2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f, f3, i) { // from class: ols0
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(7);
                    kdb1.b(this.a, this.b, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2006176000);
        if (btsVar.V(i & 1, i != 0)) {
            f530 k = an91.k(ljs0.c(c530.a, 1.0f), 16.0f);
            ldd.a.getClass();
            xab1.a(k, null, ldd.b, btsVar, 3078, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i8r0(i, 21);
        }
    }

    public static final Calendar d() {
        return Calendar.getInstance();
    }

    public static final Calendar e() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static final Calendar f(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static final ArrayList g(Locale locale) {
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        int i = jl40.l(locale.getLanguage(), "en") ? 3 : 2;
        List g = scc.g(shortWeekdays[2], shortWeekdays[3], shortWeekdays[4], shortWeekdays[5], shortWeekdays[6], shortWeekdays[7], shortWeekdays[1]);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(gvu0.A0(i, (String) it.next()).toLowerCase(locale));
        }
        return arrayList;
    }

    public static final boolean h(Calendar calendar, Calendar calendar2) {
        return calendar.getTimeInMillis() > calendar2.getTimeInMillis();
    }

    public static final boolean i(Calendar calendar, Calendar calendar2) {
        return calendar.getTimeInMillis() < calendar2.getTimeInMillis();
    }

    public static final boolean j(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static final boolean k(Calendar calendar, Calendar calendar2) {
        if (calendar == null && calendar2 == null) {
            return true;
        }
        if (calendar == null || calendar2 == null) {
            return false;
        }
        return j(calendar, calendar2);
    }
}
