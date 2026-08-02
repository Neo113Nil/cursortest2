package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class g73 implements Iterable, xfx {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g73(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new h8(1, (Object[]) obj);
            case 1:
                return new irv((Iterator) ((sls) obj).invoke());
            case 2:
                return ((qrq0) obj).iterator();
            default:
                return new h8((j4o) obj);
        }
    }
}
