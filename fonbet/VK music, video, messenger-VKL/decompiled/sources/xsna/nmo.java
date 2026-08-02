package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public class nmo extends vcr<wqd0> {
    public wqd0 e;
    public final wqd0 f;
    public final int g;
    public final String h;
    public final String i;
    public final List<wqd0> j;
    public final boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    public nmo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    @Override // xsna.vcr
    public final wqd0 b() {
        return this.f;
    }

    @Override // xsna.vcr
    public final int c() {
        return this.g;
    }

    @Override // xsna.vcr
    public final wqd0 d() {
        return this.e;
    }

    @Override // xsna.vcr
    public final void e(wqd0 wqd0Var) {
        this.e = null;
    }

    public /* synthetic */ nmo(wqd0 wqd0Var, String str, String str2, int i) {
        this((i & 1) != 0 ? null : wqd0Var, null, (i & 4) != 0 ? 1 : 5, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, null);
    }

    public nmo(wqd0 wqd0Var, wqd0 wqd0Var2, int i, String str, String str2, ArrayList arrayList) {
        super(i, wqd0Var, wqd0Var2);
        this.e = wqd0Var;
        this.f = wqd0Var2;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = arrayList;
        this.k = true;
    }
}
