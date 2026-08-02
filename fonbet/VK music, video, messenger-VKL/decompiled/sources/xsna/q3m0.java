package xsna;

import android.location.Location;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class q3m0 implements izs {
    public final /* synthetic */ r3m0 b;
    public final /* synthetic */ com.vk.lists.c c;
    public final /* synthetic */ int d;

    public /* synthetic */ q3m0(r3m0 r3m0Var, com.vk.lists.c cVar, int i) {
        this.b = r3m0Var;
        this.c = cVar;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str = this.b.e;
        return r3m0.b(this.c, (Location) obj, str, this.d);
    }
}
