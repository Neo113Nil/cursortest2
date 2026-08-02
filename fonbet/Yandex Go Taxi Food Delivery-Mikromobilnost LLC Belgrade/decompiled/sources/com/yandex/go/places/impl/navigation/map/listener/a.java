package com.yandex.go.places.impl.navigation.map.listener;

import android.view.View;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import com.yandex.go.places.impl.navigation.map.listener.a;
import defpackage.a3c0;
import defpackage.aqh;
import defpackage.bsa0;
import defpackage.f130;
import defpackage.go80;
import defpackage.jl40;
import defpackage.o3v;
import defpackage.p3v;
import defpackage.scc;
import defpackage.sls;
import defpackage.sr00;
import defpackage.tdc0;
import defpackage.tje;
import defpackage.tse;
import defpackage.u45;
import defpackage.uo21;
import defpackage.v030;
import defpackage.w511;
import defpackage.z65;
import defpackage.zbc0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes13.dex */
public final class a implements v030 {
    public final zbc0 a;
    public final tse b;
    public final go80 c;
    public final tdc0 w;
    public final PlacesMapMode x;
    public boolean y;
    public final aqh z = new aqh();

    public a(zbc0 zbc0Var, tse tseVar, go80 go80Var, tdc0 tdc0Var, PlacesMapMode placesMapMode) {
        this.a = zbc0Var;
        this.b = tseVar;
        this.c = go80Var;
        this.w = tdc0Var;
        this.x = placesMapMode;
    }

    public static boolean c(u45 u45Var) {
        return (u45Var instanceof p3v) && ((p3v) u45Var).getIsMapEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(u45 u45Var) {
        View view = u45Var instanceof View ? (View) u45Var : null;
        return view != null && view.isAttachedToWindow();
    }

    public static u45 e(List list) {
        Object obj;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (d((u45) obj)) {
                break;
            }
        }
        return (u45) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(u45 u45Var, int i) {
        View view = u45Var instanceof View ? (View) u45Var : null;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    @Override // defpackage.v030
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        Object obj;
        int i;
        int i2 = f130.a[modalViewCoordinator$StackChangeType.ordinal()];
        zbc0 zbc0Var = this.a;
        final int i3 = 0;
        aqh aqhVar = this.z;
        final int i4 = 1;
        if (i2 == 1) {
            if (u45Var2 != null) {
                ArrayList a = zbc0Var.a();
                LinkedHashSet linkedHashSet = zbc0Var.a;
                List<u45> J0 = kotlin.collections.a.J0(a);
                u45 e = e(J0);
                if (e != null && d(e)) {
                    o3v o3vVar = e instanceof o3v ? (o3v) e : null;
                    if (o3vVar != null) {
                        o3vVar.onHide();
                    }
                }
                h(u45Var2);
                if (this.x == PlacesMapMode.WITH_MAP) {
                    boolean c = c(u45Var2);
                    tdc0 tdc0Var = this.w;
                    if (!c) {
                        tdc0Var.getClass();
                    } else if (!tdc0Var.c) {
                        tdc0Var.c = true;
                        a3c0 a3c0Var = tdc0Var.a;
                        a3c0Var.z.Kg(new z65(a3c0Var));
                        uo21 uo21Var = a3c0Var.y;
                        if (uo21Var != null) {
                            uo21Var.attach();
                        }
                        a3c0Var.x.hideBlockedZones();
                        a3c0Var.c.b8(a3c0Var);
                    }
                }
                if (c(u45Var2) && this.y) {
                    this.y = false;
                    g(u45Var2, 4);
                    linkedHashSet.add(new WeakReference(u45Var2));
                    aqhVar.b(u45Var2, true, new sls(this) { // from class: e130
                        public final /* synthetic */ a b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            a aVar = this.b;
                            switch (i5) {
                                case 0:
                                    aVar.f();
                                    break;
                                default:
                                    aVar.f();
                                    break;
                            }
                            return zy11Var;
                        }
                    });
                    return;
                }
                linkedHashSet.add(new WeakReference(u45Var2));
                aqhVar.b(u45Var2, false, new sls(this) { // from class: e130
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        a aVar = this.b;
                        switch (i5) {
                            case 0:
                                aVar.f();
                                break;
                            default:
                                aVar.f();
                                break;
                        }
                        return zy11Var;
                    }
                });
                if ((u45Var2 instanceof p3v) && ((p3v) u45Var2).getIsMapEnabled()) {
                    for (u45 u45Var3 : J0) {
                        g(u45Var3, aqhVar.a.containsKey(u45Var3) ? 4 : 8);
                    }
                }
                f();
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                b();
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (u45Var != null) {
            if (d(u45Var)) {
                o3v o3vVar2 = u45Var instanceof o3v ? (o3v) u45Var : null;
                if (o3vVar2 != null) {
                    o3vVar2.onHide();
                }
            }
            LinkedHashSet linkedHashSet2 = zbc0Var.a;
            Iterator it = linkedHashSet2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((WeakReference) obj).get(), u45Var)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) obj;
            if (weakReference != null) {
                linkedHashSet2.remove(weakReference);
            }
            aqhVar.a(u45Var);
            ArrayList a2 = zbc0Var.a();
            u45 e2 = e(a2);
            if (e2 != null && d(e2)) {
                o3v o3vVar3 = e2 instanceof o3v ? (o3v) e2 : null;
                if (o3vVar3 != null) {
                    o3vVar3.onShow();
                }
            }
            if (e2 == null || !c(e2)) {
                ListIterator listIterator = a2.listIterator(a2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (c((u45) listIterator.previous())) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = a2.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        scc.m();
                        throw null;
                    }
                    if (i5 > i) {
                        arrayList.add(next);
                    }
                    i5 = i6;
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    g((u45) it3.next(), 0);
                }
                tje.N(this.b, null, null, new ModalViewCoordinatorMapAwareListener$updateMapScreen$1(this, null, null), 3);
            } else {
                g(e2, 0);
                aqhVar.a(e2);
                h(e2);
            }
            f();
        }
    }

    public final void b() {
        this.a.a.clear();
        aqh aqhVar = this.z;
        Iterator it = kotlin.collections.a.J0(aqhVar.a.keySet()).iterator();
        while (it.hasNext()) {
            aqhVar.a((u45) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        aqh aqhVar = this.z;
        WeakHashMap weakHashMap = aqhVar.a;
        WeakHashMap weakHashMap2 = aqhVar.a;
        for (u45 u45Var : kotlin.collections.a.J0(weakHashMap.keySet())) {
            zbc0 zbc0Var = this.a;
            ArrayList a = zbc0Var.a();
            if (a.contains(u45Var)) {
                bsa0 bsa0Var = (bsa0) weakHashMap2.get(u45Var);
                if (bsa0Var != null && bsa0Var.d) {
                    u45 e = e(a);
                    View view = u45Var instanceof View ? (View) u45Var : null;
                    if (view != null) {
                        if (view.getVisibility() != 4 || jl40.l(u45Var, e)) {
                            bsa0 bsa0Var2 = (bsa0) weakHashMap2.get(u45Var);
                            if (bsa0Var2 == null || !bsa0Var2.a) {
                                aqhVar.a(u45Var);
                            }
                        } else {
                            aqhVar.a(u45Var);
                            if (zbc0Var.a().contains(u45Var) && view.getVisibility() == 4 && !jl40.l(u45Var, e)) {
                                ((View) u45Var).setVisibility(8);
                            }
                        }
                    }
                }
            } else {
                aqhVar.a(u45Var);
            }
        }
    }

    public final void h(u45 u45Var) {
        tse tseVar = this.b;
        if (u45Var == null) {
            tje.N(tseVar, null, null, new ModalViewCoordinatorMapAwareListener$updateMapScreen$1(this, null, null), 3);
        } else if (u45Var instanceof p3v) {
            p3v p3vVar = (p3v) u45Var;
            if (p3vVar.getIsMapEnabled()) {
                tje.N(tseVar, null, null, new ModalViewCoordinatorMapAwareListener$updateMapScreen$1(this, new sr00(this.a.a().isEmpty(), p3vVar.getMapScreenId()), null), 3);
            }
        }
    }
}
