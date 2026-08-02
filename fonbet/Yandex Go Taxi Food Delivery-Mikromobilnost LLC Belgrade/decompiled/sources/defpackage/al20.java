package defpackage;

import com.yandex.mob.b;
import com.yandex.mob.datastore.c;
import com.yandex.mob.datastore.d;
import com.yandex.mob.datastore.f;
import com.yandex.mob.domain.g;
import com.yandex.mob.domain.l;
import com.yandex.mob.domain.o;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class al20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ al20(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return (f) bVar.i.getValue();
            case 1:
                return (d) bVar.g.getValue();
            case 2:
                return (c) bVar.h.getValue();
            case 3:
                return (com.yandex.mob.data.c) bVar.n.getValue();
            case 4:
                return (l) bVar.j.getValue();
            case 5:
                return bVar.c;
            case 6:
                return new com.yandex.mob.data.c((f) bVar.i.getValue(), (l) bVar.j.getValue(), (g) bVar.l.getValue(), (an20) bVar.m.getValue());
            case 7:
                return qv10.e(bVar.c);
            case 8:
                return new tbi0(xn20.a(bVar.a, bVar.b, EmptyList.a, (tse) bVar.e.getValue()), new al20(bVar, 13));
            case 9:
                return new d((tbi0) bVar.f.getValue());
            case 10:
                return new c((tbi0) bVar.f.getValue());
            case 11:
                return new f((tbi0) bVar.f.getValue());
            case 12:
                return new g((o) bVar.k.getValue());
            default:
                ((rot) bVar.d.getValue()).a("ChildProcessWriteAttempt", new IllegalStateException("Attempted to write from child process"));
                return zy11.a;
        }
    }
}
