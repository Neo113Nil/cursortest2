package defpackage;

import java.util.List;

/* loaded from: classes9.dex */
public final class dfx extends xij {
    public final /* synthetic */ int a = 1;
    public final List b;
    public final List c;
    public final Object d;

    public dfx(List list, List list2, qg20 qg20Var) {
        this.b = list;
        this.c = list2;
        this.d = qg20Var;
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        int i3 = this.a;
        List list = this.c;
        List list2 = this.b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                return ((zij) obj).a((u0x) list2.get(i), (u0x) list.get(i2));
            default:
                return ((Boolean) ((qg20) obj).d.invoke(list2.get(i), list.get(i2))).booleanValue();
        }
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        int i3 = this.a;
        List list = this.c;
        List list2 = this.b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                return ((zij) obj).b((u0x) list2.get(i), (u0x) list.get(i2));
            default:
                return ((Boolean) ((qg20) obj).c.invoke(list2.get(i), list.get(i2))).booleanValue();
        }
    }

    @Override // defpackage.xij
    public Object c(int i, int i2) {
        switch (this.a) {
            case 0:
                return ((zij) this.d).c((u0x) this.b.get(i), (u0x) this.c.get(i2));
            default:
                return super.c(i, i2);
        }
    }

    @Override // defpackage.xij
    public final int d() {
        switch (this.a) {
        }
        return this.c.size();
    }

    @Override // defpackage.xij
    public final int e() {
        switch (this.a) {
        }
        return this.b.size();
    }

    public dfx(List list, List list2, zij zijVar) {
        this.b = list;
        this.c = list2;
        this.d = zijVar;
    }
}
