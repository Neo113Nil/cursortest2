package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class qa90 implements izs {
    public final /* synthetic */ ra90 b;
    public final /* synthetic */ com.vk.lists.c c;
    public final /* synthetic */ int d;

    public /* synthetic */ qa90(ra90 ra90Var, com.vk.lists.c cVar, int i) {
        this.b = ra90Var;
        this.c = cVar;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ra90 ra90Var = this.b;
        ArrayList arrayList = ra90Var.h;
        int k = this.c.k();
        return ra90Var.a(this.d, k, arrayList, (List) obj);
    }
}
