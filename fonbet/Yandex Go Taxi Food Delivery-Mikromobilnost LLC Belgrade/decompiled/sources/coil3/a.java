package coil3;

import coil3.a;
import defpackage.fyg;
import defpackage.g0c;
import defpackage.i3y;
import defpackage.k1d;
import defpackage.nwq;
import defpackage.ou;
import defpackage.ov00;
import defpackage.pkx;
import defpackage.sbc;
import defpackage.sls;
import defpackage.vng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final i3y f;
    public final i3y g;

    public a(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = kotlin.a.a(new sls(this) { // from class: j1d
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                EmptyList emptyList = EmptyList.a;
                int i3 = 0;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        List list6 = aVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            ycc.r((List) ((sls) list6.get(i3)).invoke(), arrayList);
                            i3++;
                        }
                        aVar.d = emptyList;
                        return arrayList;
                    default:
                        List list7 = aVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            ycc.r((List) ((sls) list7.get(i3)).invoke(), arrayList2);
                            i3++;
                        }
                        aVar.e = emptyList;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = kotlin.a.a(new sls(this) { // from class: j1d
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                EmptyList emptyList = EmptyList.a;
                int i3 = 0;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        List list6 = aVar.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i3 < size) {
                            ycc.r((List) ((sls) list6.get(i3)).invoke(), arrayList);
                            i3++;
                        }
                        aVar.d = emptyList;
                        return arrayList;
                    default:
                        List list7 = aVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i3 < size2) {
                            ycc.r((List) ((sls) list7.get(i3)).invoke(), arrayList2);
                            i3++;
                        }
                        aVar.e = emptyList;
                        return arrayList2;
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a() {
        this(r1, r1, r1, r1, r1);
        EmptyList emptyList = EmptyList.a;
    }

    /* renamed from: coil3.a$a, reason: collision with other inner class name */
    public static final class C0029a {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public C0029a(a aVar) {
            this.a = new ArrayList(aVar.a);
            this.b = new ArrayList(aVar.b);
            this.c = new ArrayList(aVar.c);
            List list = (List) aVar.f.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new sbc(2, (Pair) it.next()));
            }
            this.d = arrayList;
            List list2 = (List) aVar.g.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new k1d((fyg) it2.next(), 1));
            }
            this.e = arrayList2;
        }

        public final void a(nwq nwqVar, g0c g0cVar) {
            this.d.add(new ou(11, nwqVar, g0cVar));
        }

        public final void b(pkx pkxVar, g0c g0cVar) {
            this.c.add(new Pair(pkxVar, g0cVar));
        }

        public final void c(ov00 ov00Var, g0c g0cVar) {
            this.b.add(new Pair(ov00Var, g0cVar));
        }

        public final a d() {
            return new a(vng.L(this.a), vng.L(this.b), vng.L(this.c), vng.L(this.d), vng.L(this.e));
        }

        public C0029a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }
    }
}
