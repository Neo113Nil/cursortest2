package defpackage;

import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListButtonComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class lr1 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ lr1(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy11 addButtons$lambda$0;
        switch (this.a) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    jra1.f(0, 2, btsVar, null, this.b, true);
                } else {
                    btsVar.Y();
                }
                return zy11.a;
            default:
                addButtons$lambda$0 = ListButtonComponent.addButtons$lambda$0(this.b, (ButtonComponent) obj, ((Integer) obj2).intValue(), (ny6) obj3);
                return addButtons$lambda$0;
        }
    }
}
