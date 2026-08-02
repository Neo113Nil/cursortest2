package defpackage;

import java.util.Comparator;
import java.util.Map;
import ru.yandex.taxi.masstransit.model.GroundThreadPriority;

/* loaded from: classes6.dex */
public final class ff30 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ String c;

    public /* synthetic */ ff30(int i, String str, Map map) {
        this.a = i;
        this.b = map;
        this.c = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Map map = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                w1u w1uVar = (w1u) obj;
                String str2 = w1uVar.e;
                if (str2 == null) {
                    str2 = str;
                }
                GroundThreadPriority c = vha1.c(w1uVar, (Map) map.get(str2));
                w1u w1uVar2 = (w1u) obj2;
                String str3 = w1uVar2.e;
                if (str3 != null) {
                    str = str3;
                }
                return uvc.b(c, vha1.c(w1uVar2, (Map) map.get(str)));
            default:
                w1u w1uVar3 = (w1u) obj;
                String str4 = w1uVar3.e;
                if (str4 == null) {
                    str4 = str;
                }
                GroundThreadPriority c2 = vha1.c(w1uVar3, (Map) map.get(str4));
                w1u w1uVar4 = (w1u) obj2;
                String str5 = w1uVar4.e;
                if (str5 != null) {
                    str = str5;
                }
                return uvc.b(c2, vha1.c(w1uVar4, (Map) map.get(str)));
        }
    }
}
