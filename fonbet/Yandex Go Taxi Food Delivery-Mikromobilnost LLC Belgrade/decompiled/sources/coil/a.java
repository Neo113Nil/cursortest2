package coil;

import defpackage.owq;
import defpackage.rv00;
import defpackage.uh6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public a(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a() {
        this(r1, r1, r1, r1, r1);
        EmptyList emptyList = EmptyList.a;
    }

    /* renamed from: coil.a$a, reason: collision with other inner class name */
    public static final class C0028a {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public C0028a(a aVar) {
            this.a = new ArrayList(aVar.a);
            this.b = new ArrayList(aVar.b);
            this.c = new ArrayList(aVar.c);
            this.d = new ArrayList(aVar.d);
            this.e = new ArrayList(aVar.e);
        }

        public final void a(owq owqVar, Class cls) {
            this.d.add(new Pair(owqVar, cls));
        }

        public final void b(rv00 rv00Var, Class cls) {
            this.b.add(new Pair(rv00Var, cls));
        }

        public final a c() {
            return new a(uh6.P(this.a), uh6.P(this.b), uh6.P(this.c), uh6.P(this.d), uh6.P(this.e));
        }

        public C0028a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }
    }
}
