package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class e2r implements qrq0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final cms d;

    public /* synthetic */ e2r(int i, cms cmsVar, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = cmsVar;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new c2r(this);
            default:
                return new s5r(this);
        }
    }
}
