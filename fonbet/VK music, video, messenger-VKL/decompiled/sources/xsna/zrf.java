package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.uuf;

/* compiled from: ClipsWrapperItemsMviState.kt */
/* loaded from: classes17.dex */
public final class zrf implements km50, uuf.f {
    public final List<wrf> b;
    public final int c;
    public final int d;
    public final kwc e;

    public zrf() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zrf c(zrf zrfVar, ArrayList arrayList, int i, int i2, int i3) {
        List list = arrayList;
        if ((i3 & 1) != 0) {
            list = zrfVar.b;
        }
        if ((i3 & 2) != 0) {
            i = zrfVar.c;
        }
        zrfVar.getClass();
        kwc kwcVar = zrfVar.e;
        zrfVar.getClass();
        return new zrf(list, i, i2, kwcVar);
    }

    @Override // xsna.uuf.f
    public final int a() {
        return this.c;
    }

    @Override // xsna.uuf.f
    public final int b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrf)) {
            return false;
        }
        zrf zrfVar = (zrf) obj;
        return epx.f(this.b, zrfVar.b) && this.c == zrfVar.c && this.d == zrfVar.d && epx.f(this.e, zrfVar.e);
    }

    @Override // xsna.uuf.f
    public final List<wrf> getItems() {
        return this.b;
    }

    public final wrf h() {
        return (wrf) j5g.b0(this.d, this.b);
    }

    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 961);
        kwc kwcVar = this.e;
        return a + (kwcVar == null ? 0 : kwcVar.hashCode());
    }

    public final boolean m() {
        return this.b.size() > 1;
    }

    public final String toString() {
        return "ClipsWrapperItemsMviState(items=" + this.b + ", initialItemIndex=" + this.c + ", currentItemIndex=" + this.d + ", commentIdForReply=null, initialData=" + this.e + ')';
    }

    public zrf(List list, int i, int i2, kwc kwcVar) {
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = kwcVar;
    }

    public zrf(int i) {
        this(EmptyList.b, 0, 0, null);
    }
}
