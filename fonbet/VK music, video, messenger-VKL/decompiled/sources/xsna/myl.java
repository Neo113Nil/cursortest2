package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class myl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ nyl c;
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Coordinates f;
    public final /* synthetic */ Integer g;
    public final /* synthetic */ List h;
    public final /* synthetic */ UserId i;

    public /* synthetic */ myl(int i, nyl nylVar, int i2, List list, Coordinates coordinates, Integer num, List list2, UserId userId) {
        this.b = i;
        this.c = nylVar;
        this.d = i2;
        this.e = list;
        this.f = coordinates;
        this.g = num;
        this.h = list2;
        this.i = userId;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        twl twlVar = (twl) obj;
        int size = twlVar.b.size() + this.b;
        return (size >= twlVar.a || twlVar.b.isEmpty()) ? io.reactivex.rxjava3.core.x.k(twlVar) : new io.reactivex.rxjava3.internal.operators.flowable.n0(io.reactivex.rxjava3.core.x.e(io.reactivex.rxjava3.core.x.k(twlVar), this.c.a(this.d, this.e, size, this.f, this.g, this.h, this.i)), new uq(9)).s();
    }
}
