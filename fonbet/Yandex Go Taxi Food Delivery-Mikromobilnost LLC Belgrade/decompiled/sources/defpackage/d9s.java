package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public abstract class d9s {
    public static final FormattedText a(String str, FormattedText formattedText) {
        List<Object> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            if (obj instanceof FormattedText.d) {
                obj = FormattedText.d.e((FormattedText.d) obj, str);
            } else if (obj instanceof FormattedText.h) {
                obj = FormattedText.h.e((FormattedText.h) obj, null, null, str, 1983);
            }
            arrayList.add(obj);
        }
        return new FormattedText(arrayList);
    }

    public static final FormattedText b(String str, String str2, FormattedText formattedText) {
        List<Object> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            if (obj instanceof FormattedText.d) {
                obj = (FormattedText.d) obj;
            } else if (obj instanceof FormattedText.h) {
                FormattedText.h hVar = (FormattedText.h) obj;
                obj = FormattedText.h.e(hVar, cvu0.v(hVar.a, str, str2, false), null, null, 2046);
            }
            arrayList.add(obj);
        }
        return new FormattedText(arrayList);
    }

    public static final FormattedText c(FormattedText formattedText, xdf xdfVar, fef fefVar, boolean z) {
        List<Object> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            if (obj instanceof FormattedText.d) {
                obj = (FormattedText.d) obj;
            } else if (obj instanceof FormattedText.h) {
                FormattedText.h hVar = (FormattedText.h) obj;
                obj = FormattedText.h.e(hVar, xdfVar.a(fefVar, hVar.a, false, z), null, null, 2046);
            }
            arrayList.add(obj);
        }
        return new FormattedText(arrayList);
    }

    public static final FormattedText d(FormattedText formattedText, xdf xdfVar, ief iefVar) {
        return c(formattedText, xdfVar, gwk0.h(iefVar), true);
    }
}
