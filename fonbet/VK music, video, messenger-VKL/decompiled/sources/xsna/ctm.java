package xsna;

import android.util.ArraySet;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import xsna.hfr;

/* compiled from: DialogsListLoaderUpdater.kt */
/* loaded from: classes18.dex */
public final class ctm implements qsz<xrm, zsm> {
    public final io.reactivex.rxjava3.internal.operators.observable.c0 a;
    public final fto0 b;
    public final yuk<xrm, gkx0> c;
    public final hnm d;
    public final d000 e;

    public ctm(io.reactivex.rxjava3.internal.operators.observable.c0 c0Var, fto0 fto0Var, yuk yukVar, hnm hnmVar, d000 d000Var) {
        this.a = c0Var;
        this.b = fto0Var;
        this.c = yukVar;
        this.d = hnmVar;
        this.e = d000Var;
    }

    @Override // xsna.qsz
    public final io.reactivex.rxjava3.core.q<zsm> a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qsz
    public final xrm b(xrm xrmVar, zsm zsmVar, drz<xrm> drzVar, boolean z) {
        xrm xrmVar2 = xrmVar;
        zsm zsmVar2 = zsmVar;
        ewf<gkx0> ewfVar = xrmVar2.d;
        DialogsHistory dialogsHistory = xrmVar2.b;
        if (z) {
            if ((zsmVar2 instanceof tpx) || (zsmVar2 instanceof npx) || (zsmVar2 instanceof n580) || (zsmVar2 instanceof h980)) {
                c(xrmVar2, drzVar, "updateLoaderData isResetting= " + z + " update= " + zsmVar2);
                return xrmVar2;
            }
        } else {
            if (zsmVar2 instanceof npx) {
                c(xrmVar2, drzVar, "updateLoaderData -> InvalidateCacheEvent");
                return xrmVar2;
            }
            boolean z2 = zsmVar2 instanceof tpx;
            d000 d000Var = this.e;
            if (z2) {
                tpx tpxVar = (tpx) zsmVar2;
                gkx0 gkx0Var = tpxVar.a;
                int i = tpxVar.b;
                d000Var.b(new wnh(tpxVar, 8));
                try {
                    xrm xrmVar3 = (xrm) ((utk) this.c.b(i, "unknown", tpxVar.a).c()).a;
                    Iterable iterable = xrmVar3.b;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (!ewfVar.b(((Dialog) it.next()).nc())) {
                                c(xrmVar2, drzVar, "invalidateRange");
                                return xrmVar2;
                            }
                        }
                    }
                    return (xrm) this.b.a(xrmVar2, new xrm(xrmVar3.b, null, null, null, 14), gkx0Var);
                } catch (Throwable th) {
                    d000Var.b(new nef(th, 7));
                    drzVar.b("invalidateRange invalidateSince= " + gkx0Var.b + " limit= " + i);
                    return xrmVar2;
                }
            }
            if (zsmVar2 instanceof n580) {
                n580 n580Var = (n580) zsmVar2;
                d000Var.b(new mxj(n580Var, 2));
                int e = on00.e(c5g.u(dialogsHistory, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                Iterator<Dialog> it2 = dialogsHistory.iterator();
                while (it2.hasNext()) {
                    Dialog next = it2.next();
                    linkedHashMap.put(Long.valueOf(next.Zb().b), next);
                }
                ArrayList arrayList = n580Var.a;
                boolean z3 = true;
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Dialog dialog = (Dialog) linkedHashMap.get(Long.valueOf(((Number) it3.next()).longValue()));
                        if (!(dialog == null ? false : ewfVar.b(dialog.nc()))) {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (!z3) {
                    c(xrmVar2, drzVar, "removeDialogs update.ids.size= " + arrayList.size());
                    return xrmVar2;
                }
                DialogsHistory dialogsHistory2 = new DialogsHistory(dialogsHistory);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    dialogsHistory2.q(Long.valueOf(((Number) it4.next()).longValue()));
                }
                return new xrm(dialogsHistory2, j5g.S0(arrayList), fsk.l(dialogsHistory2), null, 8);
            }
            if (zsmVar2 instanceof o580) {
                o580 o580Var = (o580) zsmVar2;
                ArraySet arraySet = o580Var.a;
                d000Var.b(new sim(o580Var, 2));
                LinkedHashSet d0 = j5g.d0(arraySet, j5g.S0(dialogsHistory.r()));
                if (d0.isEmpty()) {
                    return xrmVar2;
                }
                try {
                    wpp<Long, Dialog> wppVar = (wpp) this.d.a(d0).c();
                    hfr j = rli0.j(new i5g(wppVar.c.values()), new o1e(xrmVar2, 16));
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    hfr.a aVar = new hfr.a(j);
                    while (aVar.hasNext()) {
                        linkedHashSet.add(Long.valueOf(((Dialog) aVar.next()).Zb().b));
                    }
                    if (!linkedHashSet.isEmpty()) {
                        DialogsHistory dialogsHistory3 = new DialogsHistory(dialogsHistory);
                        wppVar.q(linkedHashSet);
                        dialogsHistory3.B(wppVar);
                        return new xrm(dialogsHistory3, linkedHashSet, fsk.l(dialogsHistory3), null, 8);
                    }
                    ImFeatures imFeatures = ImFeatures.VKM_DIALOGS_NONEXPIRED_FIX;
                    imFeatures.getClass();
                    if (!com.vk.toggle.b.A.a(imFeatures)) {
                        return xrmVar2;
                    }
                    c(xrmVar2, drzVar, "updateDialogs: all dialogs filtered out by nonExpiredRange");
                    return xrmVar2;
                } catch (Throwable th2) {
                    d000Var.h(new atm(th2, 0));
                    drzVar.b("updateDialogs updateSize= " + arraySet.size());
                    return xrmVar2;
                }
            }
            if (zsmVar2 instanceof h980) {
                h980 h980Var = (h980) zsmVar2;
                d000Var.b(new s1m(h980Var, 2));
                if (dialogsHistory.r().contains(Long.valueOf(h980Var.a))) {
                    c(xrmVar2, drzVar, "onMsgEditUpdate");
                    return xrmVar2;
                }
            } else {
                if (!(zsmVar2 instanceof o980)) {
                    throw new NoWhenBranchMatchedException();
                }
                o980 o980Var = (o980) zsmVar2;
                d000Var.b(new btm(o980Var, 0));
                ArrayList r = dialogsHistory.r();
                if (!r.isEmpty()) {
                    Iterator it5 = r.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (o980Var.a.contains(Long.valueOf(((Number) it5.next()).longValue()))) {
                            c(xrmVar2, drzVar, "onMsgUpdate");
                            break;
                        }
                    }
                }
            }
        }
        return xrmVar2;
    }

    public final void c(xrm xrmVar, drz drzVar, String str) {
        this.e.b(new vg0(9));
        drzVar.b(str + " -> invalidateCache updatesDialogsIdsSize= " + xrmVar.c.size());
    }
}
