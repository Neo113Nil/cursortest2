package xsna;

import java.util.List;

/* compiled from: BaseItemsFactory.kt */
/* loaded from: classes5.dex */
public final class kf6 implements jjv0 {
    public final /* synthetic */ kbe b;

    public kf6(kbe kbeVar) {
        this.b = kbeVar;
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        List list = (List) this.b.invoke();
        if (list == null || i == -1 || list.size() <= i) {
            return 0;
        }
        return ((we6) list.get(i)).g();
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        return 0;
    }
}
