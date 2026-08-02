package xsna;

import android.content.Context;
import kotlin.Pair;
import xsna.ppy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ipy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ipy(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new Pair((bxc0) obj, new ppy.c((Context) this.c));
            default:
                j9i j9iVar = (j9i) this.c;
                j9i j9iVar2 = (j9i) obj;
                j9iVar2.b.add(j9iVar);
                j9iVar.a.add(j9iVar2);
                return s3q0.a;
        }
    }
}
