package xsna;

import com.vk.translate.impl.models.SelectLanguageInitConfig;
import com.vk.translate.impl.models.SupportedTranslateLanguage;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectLanguageViewModel.kt */
/* loaded from: classes6.dex */
public final class j9i0 extends nyt0 {
    public static final String i = new Locale("en").getLanguage();
    public static final String j = new Locale("es").getLanguage();
    public static final String k = new Locale("ru").getLanguage();
    public final hw3 b;
    public final ofy0 c;
    public final j43 d;
    public final io.reactivex.rxjava3.subjects.d<c9i0> e;
    public final io.reactivex.rxjava3.internal.operators.observable.y f;
    public final io.reactivex.rxjava3.subjects.f<b9i0> g;
    public final io.reactivex.rxjava3.internal.operators.observable.q2 h;

    public j9i0(hw3 hw3Var, ofy0 ofy0Var, j43 j43Var, SelectLanguageInitConfig selectLanguageInitConfig) {
        c9i0 i2;
        this.b = hw3Var;
        this.c = ofy0Var;
        this.d = j43Var;
        if (selectLanguageInitConfig instanceof SelectLanguageInitConfig.Empty) {
            i2 = i();
        } else {
            if (!(selectLanguageInitConfig instanceof SelectLanguageInitConfig.WithLanguages)) {
                throw new NoWhenBranchMatchedException();
            }
            SelectLanguageInitConfig.WithLanguages withLanguages = (SelectLanguageInitConfig.WithLanguages) selectLanguageInitConfig;
            i2 = !withLanguages.d().d().i(withLanguages.g().d()) ? i() : j43Var.a(withLanguages.d(), withLanguages.g());
        }
        io.reactivex.rxjava3.subjects.d<c9i0> O0 = io.reactivex.rxjava3.subjects.d.O0(i2);
        this.e = O0;
        this.f = new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        io.reactivex.rxjava3.subjects.f<b9i0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.g = fVar;
        this.h = new io.reactivex.rxjava3.internal.operators.observable.q2(fVar, new bx80(new svz(29), 5));
    }

    public final c9i0 i() {
        Object obj;
        Object obj2;
        SupportedTranslateLanguage supportedTranslateLanguage;
        Set b = this.b.b();
        String language = this.c.i().getLanguage();
        Set<SupportedTranslateLanguage> set = b;
        Iterator it = set.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((SupportedTranslateLanguage) obj2).d(), language)) {
                break;
            }
        }
        SupportedTranslateLanguage supportedTranslateLanguage2 = (SupportedTranslateLanguage) obj2;
        j43 j43Var = this.d;
        if (supportedTranslateLanguage2 == null) {
            for (SupportedTranslateLanguage supportedTranslateLanguage3 : set) {
                if (!supportedTranslateLanguage3.h().isEmpty()) {
                    for (SupportedTranslateLanguage supportedTranslateLanguage4 : set) {
                        if (epx.f(j5g.Y(supportedTranslateLanguage3.h()), supportedTranslateLanguage4.d())) {
                            return j43Var.b(supportedTranslateLanguage3, supportedTranslateLanguage4);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        String d = supportedTranslateLanguage2.d();
        Set set2 = b;
        String str = i;
        boolean f = epx.f(d, str);
        String str2 = j;
        if (f) {
            str = str2;
        } else if (!epx.f(d, str2) && !epx.f(d, k)) {
            str = "";
        }
        if (str.length() == 0) {
            supportedTranslateLanguage = (SupportedTranslateLanguage) j5g.X(set2);
        } else {
            Set set3 = set2;
            Iterator it2 = set3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (epx.f(((SupportedTranslateLanguage) next).d(), str)) {
                    obj = next;
                    break;
                }
            }
            SupportedTranslateLanguage supportedTranslateLanguage5 = (SupportedTranslateLanguage) obj;
            supportedTranslateLanguage = supportedTranslateLanguage5 == null ? (SupportedTranslateLanguage) j5g.X(set3) : supportedTranslateLanguage5;
        }
        return j43Var.b(supportedTranslateLanguage, supportedTranslateLanguage2);
    }
}
