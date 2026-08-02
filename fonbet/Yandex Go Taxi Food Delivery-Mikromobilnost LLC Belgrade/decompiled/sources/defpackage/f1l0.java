package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class f1l0 implements k41 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ k1l0 b;
    public final /* synthetic */ o2y0 c;
    public final /* synthetic */ int w;

    public f1l0(int i, k1l0 k1l0Var, o2y0 o2y0Var, ArrayList arrayList) {
        this.a = arrayList;
        this.b = k1l0Var;
        this.c = o2y0Var;
        this.w = i;
    }

    @Override // defpackage.sy60
    public final void a() {
        k1l0.P(this.w, this.b, this.c, this.a);
    }

    @Override // defpackage.k41
    public final void d(Address address) {
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.set(this.w, address);
        this.b.Q(arrayList, this.c);
    }
}
