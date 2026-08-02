package xsna;

import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;

/* compiled from: ImItemListConfig.kt */
/* loaded from: classes2.dex */
public final class r5w {
    public final int a;
    public final int b;
    public final jtm c;
    public final ImItemListFragment.b d;
    public final ImItemListFragment.c e;

    public r5w(int i, int i2, jtm jtmVar, ImItemListFragment.b bVar, ImItemListFragment.c cVar) {
        this.a = i;
        this.b = i2;
        this.c = jtmVar;
        this.d = bVar;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5w)) {
            return false;
        }
        r5w r5wVar = (r5w) obj;
        return this.a == r5wVar.a && this.b == r5wVar.b && epx.f(this.c, r5wVar.c) && this.d.equals(r5wVar.d) && this.e.equals(r5wVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImItemListConfig(initialPageLimit=" + this.a + ", pageLimit=" + this.b + ", dialogListReporter=" + this.c + ", dialogListActionProvider=" + this.d + ", externalActionsHandler=" + this.e + ')';
    }
}
