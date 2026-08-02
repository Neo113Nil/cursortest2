package xsna;

import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.PickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.cja0;
import xsna.dja0;
import xsna.fja0;
import xsna.hja0;

/* compiled from: PickingFeature.kt */
/* loaded from: classes17.dex */
public final class eja0 extends wk50<ija0, hja0, cja0, fja0> {
    public final gja0 f;
    public final List<PickerItem> g;
    public final f4z h;

    /* JADX WARN: Multi-variable type inference failed */
    public eja0(gja0 gja0Var, List<? extends PickerItem> list) {
        super(cja0.b.b, gja0Var);
        this.f = gja0Var;
        this.g = list;
        this.h = new f4z();
    }

    public static Set U(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof PickerItem.User) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((PickerItem.User) next).d) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((PickerItem.User) it2.next()).e);
        }
        return j5g.S0(arrayList3);
    }

    @Override // xsna.wk50
    public final void N(hja0 hja0Var, cja0 cja0Var) {
        hja0 hja0Var2 = hja0Var;
        cja0 cja0Var2 = cja0Var;
        if (cja0Var2 instanceof cja0.b) {
            if (hja0Var2 instanceof hja0.b) {
                T(new fja0.a(this.g));
                return;
            }
            return;
        }
        boolean z = cja0Var2 instanceof cja0.c;
        f4z f4zVar = this.h;
        if (!z) {
            if (!(cja0Var2 instanceof cja0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (hja0Var2 instanceof hja0.b) {
                f4zVar.b(new dja0.b(U(((hja0.b) hja0Var2).b)));
                return;
            } else {
                com.vk.metrics.eventtracking.b.a.q(new RuntimeException("Picking list not loaded"));
                return;
            }
        }
        int i = ((cja0.c) cja0Var2).b;
        if (hja0Var2 instanceof hja0.b) {
            PickerItem pickerItem = ((hja0.b) hja0Var2).b.get(i);
            if (pickerItem instanceof PickerItem.Add) {
                f4zVar.b(dja0.a.a);
            } else {
                if (!(pickerItem instanceof PickerItem.User)) {
                    throw new NoWhenBranchMatchedException();
                }
                PickerItem.User a = PickerItem.User.a((PickerItem.User) pickerItem, !r3.d);
                T(new fja0.b(a.e, a));
            }
        }
    }
}
