package defpackage;

import com.yandex.delivery.map_filters.ui.a;
import ru.yandex.taxi.logistics.sdk.management.localstate.e;
import ru.yandex.taxi.logistics.sdk.mission_details.b;

/* loaded from: classes5.dex */
public final class m2i extends ja {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2i(j2m0 j2m0Var, Object obj, Object obj2, Object obj3, int i) {
        super(j2m0Var, null);
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    @Override // defpackage.ja
    public final yr31 b(v1m0 v1m0Var) {
        int i = this.w;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                ((o2i) obj3).a.getClass();
                return new n2i((h2i) obj2, (z1i) obj);
            case 1:
                return new a((w5r) obj2, (q9i) obj, (lrw) ((f6r) obj3).a.a.get());
            case 2:
                wjm wjmVar = ((bk20) obj3).a;
                return new b((uj20) obj2, (wj20) obj, (ij20) ((jl00) wjmVar.b).get(), (sk7) ((dx9) wjmVar.c).get(), (ru.yandex.taxi.logistics.sdk.mission_details.interactors.a) ((xvf0) wjmVar.w).get(), (ru.yandex.taxi.logistics.sdk.mission_details.ui.b) ((di20) wjmVar.x).get());
            case 3:
                at20 at20Var = ((kk70) obj3).a;
                return new jk70((ek70) obj2, (ck70) obj, (ds0) ((lq40) at20Var.b).get());
            case 4:
                return new q7a0((n7a0) obj2, (eii) obj, (s9n) ((f380) ((r7a0) obj3).a.a).get());
            default:
                a201 a201Var = ((n701) obj3).a;
                return new ru.yandex.taxi.logistics.sdk.tracking.preparer.skeleton.b((m701) obj2, (i701) obj, (x201) ((xvf0) a201Var.b).get(), (e) ((ibg) a201Var.c).get());
        }
    }
}
