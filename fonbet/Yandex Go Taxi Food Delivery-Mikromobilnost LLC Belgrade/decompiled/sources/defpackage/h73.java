package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class h73 implements qrq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h73(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new h8(1, (Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return vrq0.a((wls) obj);
            case 3:
                return (Iterator) obj;
            default:
                return new jjy((String) obj);
        }
    }
}
