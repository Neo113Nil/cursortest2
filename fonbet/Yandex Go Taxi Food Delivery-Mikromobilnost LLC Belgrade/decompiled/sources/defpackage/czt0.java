package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.transition.c;

/* loaded from: classes6.dex */
public final class czt0 implements q {
    public final /* synthetic */ qor0 a;
    public final /* synthetic */ Lifecycle b;

    public czt0(qor0 qor0Var, Lifecycle lifecycle) {
        this.a = qor0Var;
        this.b = lifecycle;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        c cVar = this.a.c;
        int i = bzt0.a[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cVar.d.d();
                return;
            } else {
                if (i != 3) {
                    return;
                }
                b bVar = cVar.e;
                if (bVar != null) {
                    bVar.M1(new AttachableViewHolder.b(7, null));
                }
                this.b.d(this);
                return;
            }
        }
        x43 x43Var = cVar.c;
        x43Var.isEmpty();
        if (x43Var.isEmpty()) {
            return;
        }
        b bVar2 = cVar.e;
        if (bVar2 != null) {
            bVar2.I(new AttachableViewHolder.a());
        } else {
            cVar.b((av31) x43Var.removeLast(), 0);
        }
    }
}
