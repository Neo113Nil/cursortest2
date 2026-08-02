package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.o;
import ru.yandex.taxi.common_models.net.z;

/* loaded from: classes6.dex */
public abstract class b9s {
    public static final String a(String str, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            str = cvu0.v(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    public static final FormattedText b(FormattedText formattedText, HashMap hashMap) {
        List list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((o) it.next(), hashMap));
        }
        return new FormattedText(arrayList);
    }

    public static final o c(o oVar, HashMap hashMap) {
        if (oVar instanceof FormattedText.h) {
            FormattedText.h hVar = (FormattedText.h) oVar;
            return FormattedText.h.e(hVar, a(hVar.a, hashMap), null, null, 2046);
        }
        if (oVar instanceof FormattedText.g) {
            FormattedText.g gVar = (FormattedText.g) oVar;
            FormattedText.h hVar2 = gVar.b;
            return FormattedText.g.e(gVar, FormattedText.h.e(hVar2, a(hVar2.a, hashMap), null, null, 2046));
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
            arrayList.add(c((o) it.next(), hashMap));
        }
        return FormattedText.a.e(aVar, arrayList);
    }
}
