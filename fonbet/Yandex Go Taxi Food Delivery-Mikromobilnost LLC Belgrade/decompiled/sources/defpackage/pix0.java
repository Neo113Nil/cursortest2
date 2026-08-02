package defpackage;

import java.util.List;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes14.dex */
public final class pix0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ pix0(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        List list = this.b;
        switch (i) {
            case 0:
                List list2 = (List) obj;
                for (Object obj3 : (List) obj2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    list2.add((yn4) obj3);
                    if (i2 != scc.f(list)) {
                        list2.add(new rql(DividerType.MARGIN));
                    }
                    i2 = i3;
                }
                return zy11Var;
            default:
                List list3 = (List) obj;
                for (Object obj4 : (List) obj2) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    list3.add((yn4) obj4);
                    if (i2 != scc.f(list)) {
                        list3.add(new rql(DividerType.MARGIN));
                    }
                    i2 = i4;
                }
                return zy11Var;
        }
    }
}
