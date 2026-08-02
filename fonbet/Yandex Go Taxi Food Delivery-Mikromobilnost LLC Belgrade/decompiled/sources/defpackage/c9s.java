package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public abstract class c9s {
    public static final FormattedText a(FormattedText formattedText, Map map) {
        List<Object> list = formattedText.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Object obj : list) {
            if (obj instanceof FormattedText.h) {
                FormattedText.h hVar = (FormattedText.h) obj;
                String str = (String) map.get(hVar.a);
                if (str != null) {
                    obj = FormattedText.h.e(hVar, str, null, null, 2046);
                }
            }
            arrayList.add(obj);
        }
        return new FormattedText(arrayList);
    }
}
