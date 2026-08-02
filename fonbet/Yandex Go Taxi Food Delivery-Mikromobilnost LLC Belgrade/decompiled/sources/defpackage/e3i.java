package defpackage;

import ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class e3i implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss4 b;
    public final /* synthetic */ f3i c;
    public final /* synthetic */ a w;

    public /* synthetic */ e3i(ss4 ss4Var, f3i f3iVar, a aVar, int i) {
        this.a = i;
        this.b = ss4Var;
        this.c = f3iVar;
        this.w = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.w;
        f3i f3iVar = this.c;
        ss4 ss4Var = this.b;
        Object[] objArr = 0;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    qti.a(ss4Var.c, wwg.S(129293089, true, new d3i(f3iVar, aVar), btsVar), btsVar, 56);
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    sb2.b(nnm.f(ss4Var.c, btsVar2, qti.e), wwg.S(-1391107336, true, new e3i(ss4Var, f3iVar, aVar, objArr == true ? 1 : 0), btsVar2), btsVar2, 56);
                    break;
                }
        }
        return zy11Var;
    }
}
