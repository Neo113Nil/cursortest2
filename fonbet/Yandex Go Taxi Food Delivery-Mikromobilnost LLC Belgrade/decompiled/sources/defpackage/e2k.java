package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.b;

/* loaded from: classes9.dex */
public final class e2k implements qrq0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ e2k(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.qrq0
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new c2k(((qrq0) obj2).iterator(), (tls) obj);
            case 1:
                return new vxs(this);
            default:
                List t = b.t((qrq0) obj2);
                xcc.q(t, (Comparator) obj);
                return ((ArrayList) t).iterator();
        }
    }
}
