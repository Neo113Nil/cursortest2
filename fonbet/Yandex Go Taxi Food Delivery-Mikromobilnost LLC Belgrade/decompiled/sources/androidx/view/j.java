package androidx.view;

import android.os.Bundle;
import defpackage.h73;
import defpackage.jl40;
import defpackage.k550;
import defpackage.kf50;
import defpackage.na50;
import defpackage.ny61;
import defpackage.qrb1;
import defpackage.s5r;
import defpackage.tls;
import defpackage.xfo;
import defpackage.yw01;
import java.util.List;
import java.util.ListIterator;
import kotlin.sequences.b;

/* loaded from: classes10.dex */
public abstract class j {
    public c a;
    public boolean b;

    public abstract f a();

    public final kf50 b() {
        c cVar = this.a;
        if (cVar != null) {
            return cVar;
        }
        ny61.r("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public f c(f fVar, Bundle bundle, k550 k550Var) {
        return fVar;
    }

    public void d(List list, final k550 k550Var) {
        s5r s5rVar = new s5r(b.i(new yw01(new h73(1, list), new tls() { // from class: androidx.navigation.Navigator$navigate$1
            final /* synthetic */ na50 $navigatorExtras;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                f c;
                b bVar = (b) obj;
                f fVar = bVar.b;
                if (fVar == null) {
                    fVar = null;
                }
                if (fVar == null || (c = j.this.c(fVar, bVar.a(), k550Var)) == null) {
                    return null;
                }
                return c.equals(fVar) ? bVar : j.this.b().a(c, c.a(bVar.a()));
            }
        })));
        while (s5rVar.hasNext()) {
            b().g((b) s5rVar.next());
        }
    }

    public void e(c cVar) {
        this.a = cVar;
        this.b = true;
    }

    public void f(b bVar) {
        f fVar = bVar.b;
        if (fVar == null) {
            fVar = null;
        }
        if (fVar == null) {
            return;
        }
        c(fVar, null, qrb1.e(Navigator$onLaunchSingleTop$1.w));
        b().c(bVar);
    }

    public void g(Bundle bundle) {
    }

    public Bundle h() {
        return null;
    }

    public void i(b bVar, boolean z) {
        List list = (List) b().e.a.getValue();
        if (!list.contains(bVar)) {
            xfo.m("popBackStack was called with ", bVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        b bVar2 = null;
        while (j()) {
            bVar2 = (b) listIterator.previous();
            if (jl40.l(bVar2, bVar)) {
                break;
            }
        }
        if (bVar2 != null) {
            b().d(bVar2, z);
        }
    }

    public boolean j() {
        return true;
    }
}
