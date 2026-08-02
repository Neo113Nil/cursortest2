package defpackage;

import android.content.Context;
import android.os.LocaleList;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.a;

/* loaded from: classes9.dex */
public final class j5z {
    public final ko21 a;
    public final wu2 b;
    public final dne0 c;
    public final rx2 d;
    public final h3y e;
    public final Context f;
    public final i3y g = a.a(new ppr(24, this));

    public j5z(Context context, ko21 ko21Var, wu2 wu2Var, dne0 dne0Var, rx2 rx2Var, h3y h3yVar) {
        this.a = ko21Var;
        this.b = wu2Var;
        this.c = dne0Var;
        this.d = rx2Var;
        this.e = h3yVar;
        this.f = context.getApplicationContext();
    }

    public static final int a(j5z j5zVar, LocaleList localeList, String str) {
        j5zVar.getClass();
        int size = localeList.size();
        for (int i = 0; i < size; i++) {
            Locale locale = localeList.get(i);
            if (jl40.l(locale != null ? locale.getLanguage() : null, str)) {
                return i;
            }
        }
        return -1;
    }

    public static Locale e() {
        Locale locale = Locale.getDefault();
        return j73.y(DateFormatSymbols.getAvailableLocales(), locale) ? locale : Locale.ENGLISH;
    }

    public static Set f(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(tcc.n(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).getLanguage());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String str = (String) next;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        return kotlin.collections.a.N0(arrayList2);
    }

    public final String b() {
        return this.a.a().a();
    }

    public final Locale c() {
        return this.a.a().a;
    }

    public final String d() {
        return (String) this.g.getValue();
    }
}
