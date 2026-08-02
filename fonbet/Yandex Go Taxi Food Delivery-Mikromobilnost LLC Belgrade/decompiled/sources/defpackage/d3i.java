package defpackage;

import ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class d3i implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f3i b;
    public final /* synthetic */ a c;

    public /* synthetic */ d3i(f3i f3iVar, a aVar) {
        this.b = f3iVar;
        this.c = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.c;
        f3i f3iVar = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                ru.yandex.taxi.logistics.sdk.courier_comment_view.a.c(f3iVar, aVar, fidVar, vng.O(1));
                break;
            default:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    ru.yandex.taxi.logistics.sdk.courier_comment_view.a.c(f3iVar, aVar, btsVar, 0);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ d3i(f3i f3iVar, a aVar, int i) {
        this.b = f3iVar;
        this.c = aVar;
    }
}
