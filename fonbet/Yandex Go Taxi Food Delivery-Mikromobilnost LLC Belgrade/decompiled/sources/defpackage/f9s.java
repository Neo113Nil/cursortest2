package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.common_models.net.z;

/* loaded from: classes6.dex */
public abstract class f9s {
    public static final FormattedText a(FormattedText formattedText, tls tlsVar) {
        List list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((o) it.next(), tlsVar));
        }
        return new FormattedText(arrayList);
    }

    public static final o b(o oVar, tls tlsVar) {
        if (oVar instanceof FormattedText.h) {
            FormattedText.h hVar = (FormattedText.h) oVar;
            return FormattedText.h.e(hVar, (String) tlsVar.invoke(hVar.a), null, null, 2046);
        }
        if (oVar instanceof FormattedText.g) {
            FormattedText.g gVar = (FormattedText.g) oVar;
            FormattedText.h hVar2 = gVar.b;
            return FormattedText.g.e(gVar, FormattedText.h.e(hVar2, (String) tlsVar.invoke(hVar2.a), null, null, 2046));
        }
        if (!(oVar instanceof FormattedText.a)) {
            if ((oVar instanceof FormattedText.d) || (oVar instanceof FormattedText.e) || jl40.l(oVar, z.INSTANCE)) {
                return oVar;
            }
            w511.b();
            return null;
        }
        FormattedText.a aVar = (FormattedText.a) oVar;
        List list = aVar.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((o) it.next(), tlsVar));
        }
        return FormattedText.a.e(aVar, arrayList);
    }

    public static final FormattedText c(xdf xdfVar, fef fefVar, FormattedText formattedText) {
        return formattedText.a.isEmpty() ? formattedText : a(formattedText, new z8s(xdfVar.f(fefVar), 0));
    }

    public static final FormattedText d(FormattedText formattedText, fef fefVar, xdf xdfVar, long j) {
        return formattedText.a.isEmpty() ? formattedText : a(c(xdfVar, fefVar, formattedText), new a9s(xdfVar, j / 100.0d, 0));
    }

    public static final FormattedText e(FormattedText formattedText, c6z c6zVar) {
        return (c6zVar == null || formattedText.a.isEmpty()) ? formattedText : a(formattedText, new y8s(c6zVar, 1));
    }
}
