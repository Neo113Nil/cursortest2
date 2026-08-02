package xsna;

import com.vk.sharing.core.view.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ysy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ysy(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        long j = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                wsy wsyVar = (wsy) obj2;
                long c = h9x.c(((h9x) ((if2) obj).d()).a, j);
                int i2 = wsy.t;
                wsyVar.h(c);
                wsyVar.c.invoke();
                break;
            default:
                l.a aVar = ((com.vk.sharing.core.view.f) obj2).D;
                if (aVar != null) {
                    aVar.P2(j);
                }
                break;
        }
        return s3q0.a;
    }
}
