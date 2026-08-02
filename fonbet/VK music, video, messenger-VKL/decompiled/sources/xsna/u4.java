package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AboutVideoAdapter.kt */
/* loaded from: classes2.dex */
public final class u4 implements g530, cvx, i920 {
    public Object b;

    public /* synthetic */ u4(Object obj) {
        this.b = obj;
    }

    @Override // xsna.g530
    public void H2() {
        com.vk.libvideo.bottomsheet.about.delegate.c cVar = (com.vk.libvideo.bottomsheet.about.delegate.c) this.b;
        Iterator<hfz> it = cVar.h.f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof AboutVideoItem.h) {
                break;
            } else {
                i++;
            }
        }
        cVar.notifyItemChanged(i, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0266 A[LOOP:0: B:25:0x0260->B:27:0x0266, LOOP_END] */
    @Override // xsna.i920
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public frz a(frz frzVar, frz frzVar2, Object obj) {
        DialogsHistory dialogsHistory;
        DialogsHistory dialogsHistory2;
        Iterator<Dialog> it;
        DialogsHistory dialogsHistory3;
        long longValue = ((Number) obj).longValue();
        p0w p0wVar = (p0w) this.b;
        DialogsHistory dialogsHistory4 = ((xrm) frzVar).b;
        DialogsHistory dialogsHistory5 = ((xrm) frzVar2).b;
        Long valueOf = Long.valueOf(longValue);
        Long Sb = dialogsHistory5.k().isEmpty() ? Long.MIN_VALUE : ((Dialog) j5g.i0(dialogsHistory5.k())).Sb();
        if (!dialogsHistory4.k().isEmpty()) {
            Long Sb2 = ((Dialog) j5g.Y(dialogsHistory4.k())).Sb();
            Long Sb3 = ((Dialog) j5g.i0(dialogsHistory4.k())).Sb();
            if (valueOf.compareTo(Sb2) < 0 || Sb.compareTo(Sb3) > 0) {
                if (!dialogsHistory4.k().isEmpty()) {
                    Long Sb4 = ((Dialog) j5g.Y(dialogsHistory4.k())).Sb();
                    Long Sb5 = ((Dialog) j5g.i0(dialogsHistory4.k())).Sb();
                    if (valueOf.compareTo(Sb4) >= 0 && Sb.compareTo(Sb5) > 0) {
                        if (dialogsHistory5.i() && dialogsHistory5.j()) {
                            ArrayList b = p0wVar.b(dialogsHistory4, Sb, dialogsHistory5);
                            if (!b.isEmpty()) {
                                dialogsHistory3 = new DialogsHistory(dialogsHistory5);
                                dialogsHistory3.k().addAll(b);
                                p0w.d(dialogsHistory3, dialogsHistory4, b);
                                p0w.c(dialogsHistory3, dialogsHistory4, b);
                                dialogsHistory3.y(dialogsHistory4.i());
                                dialogsHistory3.z(dialogsHistory4.j());
                                dialogsHistory2 = dialogsHistory3;
                                ArrayList arrayList = new ArrayList(c5g.u(dialogsHistory5, 10));
                                it = dialogsHistory5.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(it.next().Sb());
                                }
                                return new xrm(dialogsHistory2, j5g.S0(arrayList), fsk.l(dialogsHistory2), null, 8);
                            }
                            dialogsHistory = new DialogsHistory(dialogsHistory5);
                        } else {
                            dialogsHistory = new DialogsHistory(dialogsHistory5);
                        }
                        dialogsHistory2 = dialogsHistory;
                        ArrayList arrayList2 = new ArrayList(c5g.u(dialogsHistory5, 10));
                        it = dialogsHistory5.iterator();
                        while (it.hasNext()) {
                        }
                        return new xrm(dialogsHistory2, j5g.S0(arrayList2), fsk.l(dialogsHistory2), null, 8);
                    }
                }
                if (!dialogsHistory4.k().isEmpty()) {
                    Long Sb6 = ((Dialog) j5g.Y(dialogsHistory4.k())).Sb();
                    Long Sb7 = ((Dialog) j5g.i0(dialogsHistory4.k())).Sb();
                    if (valueOf.compareTo(Sb6) < 0 && Sb.compareTo(Sb7) <= 0) {
                        if (dialogsHistory5.g() && dialogsHistory5.h()) {
                            ArrayList a = p0wVar.a(dialogsHistory4, valueOf, dialogsHistory5);
                            if (!a.isEmpty()) {
                                dialogsHistory3 = new DialogsHistory(dialogsHistory5);
                                dialogsHistory3.k().addAll(0, a);
                                p0w.d(dialogsHistory3, dialogsHistory4, a);
                                p0w.c(dialogsHistory3, dialogsHistory4, a);
                                dialogsHistory3.w(dialogsHistory4.g());
                                dialogsHistory3.x(dialogsHistory4.h());
                                dialogsHistory2 = dialogsHistory3;
                                ArrayList arrayList22 = new ArrayList(c5g.u(dialogsHistory5, 10));
                                it = dialogsHistory5.iterator();
                                while (it.hasNext()) {
                                }
                                return new xrm(dialogsHistory2, j5g.S0(arrayList22), fsk.l(dialogsHistory2), null, 8);
                            }
                            dialogsHistory = new DialogsHistory(dialogsHistory5);
                        } else {
                            dialogsHistory = new DialogsHistory(dialogsHistory5);
                        }
                        dialogsHistory2 = dialogsHistory;
                        ArrayList arrayList222 = new ArrayList(c5g.u(dialogsHistory5, 10));
                        it = dialogsHistory5.iterator();
                        while (it.hasNext()) {
                        }
                        return new xrm(dialogsHistory2, j5g.S0(arrayList222), fsk.l(dialogsHistory2), null, 8);
                    }
                }
                if (!dialogsHistory4.k().isEmpty()) {
                    Long Sb8 = ((Dialog) j5g.Y(dialogsHistory4.k())).Sb();
                    Long Sb9 = ((Dialog) j5g.i0(dialogsHistory4.k())).Sb();
                    if (valueOf.compareTo(Sb8) < 0 && Sb.compareTo(Sb9) > 0) {
                        boolean z = true;
                        boolean z2 = (dialogsHistory5.g() && dialogsHistory5.h()) ? false : true;
                        boolean z3 = (dialogsHistory5.i() && dialogsHistory5.j()) ? false : true;
                        if (z3 && z2) {
                            dialogsHistory = new DialogsHistory(dialogsHistory5);
                            dialogsHistory2 = dialogsHistory;
                            ArrayList arrayList2222 = new ArrayList(c5g.u(dialogsHistory5, 10));
                            it = dialogsHistory5.iterator();
                            while (it.hasNext()) {
                            }
                            return new xrm(dialogsHistory2, j5g.S0(arrayList2222), fsk.l(dialogsHistory2), null, 8);
                        }
                        List a2 = z2 ? EmptyList.b : p0wVar.a(dialogsHistory4, valueOf, dialogsHistory5);
                        List b2 = z3 ? EmptyList.b : p0wVar.b(dialogsHistory4, Sb, dialogsHistory5);
                        boolean z4 = z2 || a2.isEmpty();
                        if (!z3 && !b2.isEmpty()) {
                            z = false;
                        }
                        DialogsHistory dialogsHistory6 = new DialogsHistory(dialogsHistory5);
                        dialogsHistory6.k().addAll(0, a2);
                        dialogsHistory6.k().addAll(b2);
                        p0w.d(dialogsHistory6, dialogsHistory4, a2);
                        p0w.d(dialogsHistory6, dialogsHistory4, b2);
                        p0w.c(dialogsHistory6, dialogsHistory4, a2);
                        p0w.c(dialogsHistory6, dialogsHistory4, b2);
                        dialogsHistory6.w(z4 ? dialogsHistory5.g() : dialogsHistory4.g());
                        dialogsHistory6.x(z4 ? dialogsHistory5.h() : dialogsHistory4.h());
                        dialogsHistory6.y(z ? dialogsHistory5.i() : dialogsHistory4.i());
                        dialogsHistory6.z(z ? dialogsHistory5.j() : dialogsHistory4.j());
                        dialogsHistory2 = dialogsHistory6;
                        ArrayList arrayList22222 = new ArrayList(c5g.u(dialogsHistory5, 10));
                        it = dialogsHistory5.iterator();
                        while (it.hasNext()) {
                        }
                        return new xrm(dialogsHistory2, j5g.S0(arrayList22222), fsk.l(dialogsHistory2), null, 8);
                    }
                }
                dialogsHistory = new DialogsHistory(dialogsHistory5);
                dialogsHistory2 = dialogsHistory;
                ArrayList arrayList222222 = new ArrayList(c5g.u(dialogsHistory5, 10));
                it = dialogsHistory5.iterator();
                while (it.hasNext()) {
                }
                return new xrm(dialogsHistory2, j5g.S0(arrayList222222), fsk.l(dialogsHistory2), null, 8);
            }
        }
        dialogsHistory = new DialogsHistory(dialogsHistory5);
        dialogsHistory2 = dialogsHistory;
        ArrayList arrayList2222222 = new ArrayList(c5g.u(dialogsHistory5, 10));
        it = dialogsHistory5.iterator();
        while (it.hasNext()) {
        }
        return new xrm(dialogsHistory2, j5g.S0(arrayList2222222), fsk.l(dialogsHistory2), null, 8);
    }

    @Override // xsna.cvx
    public int c(int i) {
        int[] iArr;
        Integer R;
        t2n t2nVar = (t2n) this.b;
        if (t2nVar == null || (iArr = t2nVar.n) == null || (R = rl3.R(i, iArr)) == null) {
            return 1;
        }
        return R.intValue();
    }

    @Override // xsna.cvx
    public int e(int i) {
        int[] iArr;
        Integer R;
        t2n t2nVar = (t2n) this.b;
        if (t2nVar == null || (iArr = t2nVar.l) == null || (R = rl3.R(i, iArr)) == null) {
            return 0;
        }
        return R.intValue();
    }

    @Override // xsna.cvx
    public int f(int i) {
        int[] iArr;
        Integer R;
        t2n t2nVar = (t2n) this.b;
        if (t2nVar == null || (iArr = t2nVar.m) == null || (R = rl3.R(i, iArr)) == null) {
            return 0;
        }
        return R.intValue();
    }

    @Override // xsna.cvx
    public int i(int i) {
        int[] iArr;
        Integer R;
        t2n t2nVar = (t2n) this.b;
        if (t2nVar == null || (iArr = t2nVar.o) == null || (R = rl3.R(i, iArr)) == null) {
            return 1;
        }
        return R.intValue();
    }

    public u4(int i) {
        switch (i) {
            case 4:
                new vsq(3);
                this.b = new p0w();
                break;
            default:
                this.b = new LinkedHashSet();
                break;
        }
    }

    @Override // xsna.g530
    public void g3() {
    }
}
