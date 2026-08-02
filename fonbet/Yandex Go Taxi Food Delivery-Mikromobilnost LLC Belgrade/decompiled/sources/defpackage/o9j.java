package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.tracking.impl.details.ui.model.TitleStyle;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;

/* loaded from: classes5.dex */
public final class o9j extends yr31 {
    public final l9j b;
    public final j c;
    public final s8j w;
    public final ArrayList x;

    public o9j(l9j l9jVar, j jVar, s8j s8jVar) {
        this.b = l9jVar;
        this.c = jVar;
        this.w = s8jVar;
        List list = s8jVar.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            i9j i9jVar = null;
            if (i < 0) {
                scc.m();
                throw null;
            }
            d9j d9jVar = (d9j) obj;
            l9j l9jVar2 = this.b;
            String str = this.w.a;
            l9jVar2.getClass();
            String str2 = d9jVar.a;
            if (i == 0) {
                i9jVar = new i9j(str, TitleStyle.BIG);
            } else if (str2 != null) {
                i9jVar = new i9j(str2, TitleStyle.NORMAL);
            }
            arrayList.add(new j9j(i9jVar, d9jVar.b));
            i = i2;
        }
        this.x = arrayList;
    }
}
