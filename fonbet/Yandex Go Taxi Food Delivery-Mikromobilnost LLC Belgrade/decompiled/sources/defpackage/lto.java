package defpackage;

import com.yandex.go.explorer.impl.data.models.CellItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class lto {
    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellItemDto cellItemDto = (CellItemDto) it.next();
            Long m = bvu0.m(16, cellItemDto.a);
            ito itoVar = m != null ? new ito(m.longValue(), cellItemDto.b, true, false) : null;
            if (itoVar != null) {
                arrayList.add(itoVar);
            }
        }
        return arrayList;
    }
}
