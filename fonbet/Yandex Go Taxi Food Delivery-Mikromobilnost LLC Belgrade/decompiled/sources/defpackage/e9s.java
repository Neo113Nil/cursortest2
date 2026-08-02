package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.common_models.net.z;

/* loaded from: classes6.dex */
public abstract class e9s {
    public static final o a(o oVar, y8s y8sVar) {
        if (oVar instanceof FormattedText.h) {
            FormattedText.h hVar = (FormattedText.h) oVar;
            return FormattedText.h.e(hVar, (String) y8sVar.invoke(hVar.a), null, null, 2046);
        }
        if (oVar instanceof FormattedText.g) {
            FormattedText.g gVar = (FormattedText.g) oVar;
            FormattedText.h hVar2 = gVar.b;
            return FormattedText.g.e(gVar, FormattedText.h.e(hVar2, (String) y8sVar.invoke(hVar2.a), null, null, 2046));
        }
        if (!(oVar instanceof FormattedText.a)) {
            if (!(oVar instanceof FormattedText.d) && !(oVar instanceof FormattedText.e)) {
                jl40.l(oVar, z.INSTANCE);
            }
            return oVar;
        }
        FormattedText.a aVar = (FormattedText.a) oVar;
        List list = aVar.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((o) it.next(), y8sVar));
        }
        return FormattedText.a.e(aVar, arrayList);
    }

    public static final FormattedText b(FormattedText formattedText, c6z c6zVar) {
        if (c6zVar == null || formattedText.a.isEmpty()) {
            return formattedText;
        }
        y8s y8sVar = new y8s(c6zVar, 0);
        List list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((o) it.next(), y8sVar));
        }
        return new FormattedText(arrayList);
    }
}
