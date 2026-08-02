package androidx.view;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.app.f1;
import androidx.lifecycle.Lifecycle;
import defpackage.a550;
import defpackage.ak00;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.d550;
import defpackage.dnm;
import defpackage.e100;
import defpackage.enm;
import defpackage.f550;
import defpackage.ffx;
import defpackage.gci0;
import defpackage.i3y;
import defpackage.j550;
import defpackage.jl40;
import defpackage.k550;
import defpackage.ke50;
import defpackage.kp50;
import defpackage.l550;
import defpackage.ny61;
import defpackage.orb1;
import defpackage.oyr;
import defpackage.pey;
import defpackage.pnt0;
import defpackage.qc;
import defpackage.qrb1;
import defpackage.qrq0;
import defpackage.qs31;
import defpackage.scc;
import defpackage.sls;
import defpackage.t2k0;
import defpackage.t550;
import defpackage.tcc;
import defpackage.tls;
import defpackage.u1l;
import defpackage.u6e0;
import defpackage.ud2;
import defpackage.unr0;
import defpackage.vg10;
import defpackage.wj6;
import defpackage.x43;
import defpackage.x450;
import defpackage.xfo;
import defpackage.ycc;
import defpackage.ym11;
import defpackage.yw01;
import defpackage.zdj;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.a;
import kotlin.sequences.b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public abstract class d {
    public final ArrayList A;
    public final i3y B;
    public final n0 C;
    public final Context a;
    public final Activity b;
    public f550 c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final x43 g;
    public final r0 h;
    public final r0 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public pey n;
    public a550 o;
    public final CopyOnWriteArrayList p;
    public Lifecycle.State q;
    public final wj6 r;
    public final qc s;
    public final boolean t;
    public final ke50 u;
    public final LinkedHashMap v;
    public tls w;
    public tls x;
    public final LinkedHashMap y;
    public int z;

    public d(Context context) {
        Object obj;
        this.a = context;
        Iterator it = a.d(NavController$activity$1.w, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.b = (Activity) obj;
        this.g = new x43();
        EmptyList emptyList = EmptyList.a;
        this.h = bvf0.c(emptyList);
        this.i = bvf0.c(emptyList);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new CopyOnWriteArrayList();
        this.q = Lifecycle.State.INITIALIZED;
        this.r = new wj6(3, this);
        this.s = new qc(13, this, false);
        this.t = true;
        ke50 ke50Var = new ke50();
        this.u = ke50Var;
        this.v = new LinkedHashMap();
        this.y = new LinkedHashMap();
        ke50Var.a(new g(ke50Var));
        ke50Var.a(new a(this.a));
        this.A = new ArrayList();
        this.B = kotlin.a.a(new sls() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                d.this.getClass();
                d dVar = d.this;
                return new h(dVar.a, dVar.u);
            }
        });
        this.C = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }

    public static f e(f fVar, int i, boolean z) {
        if (fVar.A == i) {
            return fVar;
        }
        f550 f550Var = fVar instanceof f550 ? (f550) fVar : fVar.b;
        return f550Var.h(i, f550Var, z);
    }

    public static void l(d dVar, String str, k550 k550Var) {
        f fVar;
        if (dVar.c == null) {
            vg10.a(46, str, ". Navigation graph has not been set for NavController ", dVar, "Cannot navigate to ");
            return;
        }
        b bVar = (b) dVar.g.h();
        if (bVar == null || (fVar = bVar.b) == null) {
            fVar = dVar.c;
        }
        f550 f550Var = fVar instanceof f550 ? (f550) fVar : fVar.b;
        d550 j = f550Var.j(str, true, f550Var);
        if (j == null) {
            StringBuilder x = unr0.x("Navigation destination that matches route ", str, " cannot be found in the navigation graph ");
            x.append(dVar.c);
            throw new IllegalArgumentException(x.toString());
        }
        f fVar2 = j.a;
        Bundle a = fVar2.a(j.b);
        if (a == null) {
            a = new Bundle();
        }
        Intent intent = new Intent();
        int i = f.D;
        String str2 = fVar2.B;
        intent.setDataAndType(Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : ""), null);
        intent.setAction(null);
        a.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        dVar.k(fVar2, a, k550Var);
    }

    public static /* synthetic */ void o(d dVar, b bVar) {
        dVar.n(bVar, false, new x43());
    }

    public final void a(f fVar, Bundle bundle, b bVar, List list) {
        Bundle bundle2;
        Context context;
        b bVar2;
        f550 f550Var;
        Object obj;
        Object obj2;
        f fVar2 = bVar.b;
        boolean z = fVar2 instanceof zdj;
        x43 x43Var = this.g;
        if (!z) {
            while (!x43Var.isEmpty() && (((b) x43Var.last()).b instanceof zdj) && m(((b) x43Var.last()).b.A, true, false)) {
            }
        }
        x43 x43Var2 = new x43();
        boolean z2 = fVar instanceof f550;
        Context context2 = this.a;
        Object obj3 = null;
        if (z2) {
            f fVar3 = fVar2;
            while (true) {
                f550 f550Var2 = fVar3.b;
                if (f550Var2 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (jl40.l(((b) obj2).b, f550Var2)) {
                                break;
                            }
                        }
                    }
                    b bVar3 = (b) obj2;
                    if (bVar3 == null) {
                        bVar3 = new b(context2, f550Var2, bundle, h(), this.o, UUID.randomUUID().toString(), null);
                        bundle2 = bundle;
                    } else {
                        bundle2 = bundle;
                    }
                    context = context2;
                    x43Var2.addFirst(bVar3);
                    if (!x43Var.isEmpty() && ((b) x43Var.last()).b == f550Var2) {
                        o(this, (b) x43Var.last());
                    }
                } else {
                    bundle2 = bundle;
                    context = context2;
                }
                if (f550Var2 == null || f550Var2 == fVar) {
                    break;
                }
                fVar3 = f550Var2;
                context2 = context;
            }
        } else {
            bundle2 = bundle;
            context = context2;
        }
        f fVar4 = x43Var2.isEmpty() ? fVar2 : ((b) x43Var2.first()).b;
        while (fVar4 != null && d(fVar4.A) != fVar4) {
            f550 f550Var3 = fVar4.b;
            if (f550Var3 != null) {
                Bundle bundle3 = (bundle2 == null || !bundle2.isEmpty()) ? bundle2 : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (jl40.l(((b) obj).b, f550Var3)) {
                            break;
                        }
                    }
                }
                b bVar4 = (b) obj;
                if (bVar4 == null) {
                    f550Var = f550Var3;
                    bVar4 = new b(context, f550Var, f550Var3.a(bundle3), h(), this.o, UUID.randomUUID().toString(), null);
                } else {
                    f550Var = f550Var3;
                }
                x43Var2.addFirst(bVar4);
            } else {
                f550Var = f550Var3;
            }
            fVar4 = f550Var;
        }
        if (!x43Var2.isEmpty()) {
            fVar2 = ((b) x43Var2.first()).b;
        }
        while (!x43Var.isEmpty() && (((b) x43Var.last()).b instanceof f550) && ((f550) ((b) x43Var.last()).b).E.b(fVar2.A) == null) {
            o(this, (b) x43Var.last());
        }
        b bVar5 = (b) x43Var.f();
        if (bVar5 == null) {
            bVar5 = (b) x43Var2.f();
        }
        if (!jl40.l(bVar5 != null ? bVar5.b : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                if (jl40.l(((b) previous).b, this.c)) {
                    obj3 = previous;
                    break;
                }
            }
            b bVar6 = (b) obj3;
            if (bVar6 == null) {
                f550 f550Var4 = this.c;
                bVar2 = new b(context, f550Var4, f550Var4.a(bundle2), h(), this.o, UUID.randomUUID().toString(), null);
            } else {
                bVar2 = bVar6;
            }
            x43Var2.addFirst(bVar2);
        }
        Iterator it = x43Var2.iterator();
        while (it.hasNext()) {
            b bVar7 = (b) it.next();
            Object obj4 = this.v.get(this.u.b(bVar7.b.a));
            if (obj4 == null) {
                xfo.g(oyr.t(new StringBuilder("NavigatorBackStack for "), fVar.a, " should already be created"));
                return;
            }
            ((c) obj4).j(bVar7);
        }
        x43Var.addAll(x43Var2);
        x43Var.addLast(bVar);
        Iterator it2 = kotlin.collections.a.o0(x43Var2, bVar).iterator();
        while (it2.hasNext()) {
            b bVar8 = (b) it2.next();
            f550 f550Var5 = bVar8.b.b;
            if (f550Var5 != null) {
                j(bVar8, f(f550Var5.A));
            }
        }
    }

    public final boolean b() {
        x43 x43Var;
        while (true) {
            x43Var = this.g;
            if (x43Var.isEmpty() || !(((b) x43Var.last()).b instanceof f550)) {
                break;
            }
            o(this, (b) x43Var.last());
        }
        b bVar = (b) x43Var.h();
        ArrayList arrayList = this.A;
        if (bVar != null) {
            arrayList.add(bVar);
        }
        this.z++;
        t();
        int i = this.z - 1;
        this.z = i;
        if (i == 0) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                Iterator it2 = this.p.iterator();
                if (it2.hasNext()) {
                    if (it2.next() != null) {
                        ny61.u();
                        return false;
                    }
                    f fVar = bVar2.b;
                    bVar2.a();
                    throw null;
                }
                this.C.g(bVar2);
            }
            ArrayList arrayList3 = new ArrayList(x43Var);
            r0 r0Var = this.h;
            r0Var.getClass();
            r0Var.m(null, arrayList3);
            ArrayList p = p();
            r0 r0Var2 = this.i;
            r0Var2.getClass();
            r0Var2.m(null, p);
        }
        return bVar != null;
    }

    public final boolean c(ArrayList arrayList, f fVar, boolean z, boolean z2) {
        final d dVar;
        boolean z3;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        x43 x43Var = new x43();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = this;
                z3 = z2;
                break;
            }
            j jVar = (j) it.next();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            b bVar = (b) this.g.last();
            dVar = this;
            z3 = z2;
            dVar.x = new NavController$executePopOperations$1(ref$BooleanRef2, ref$BooleanRef, dVar, z3, x43Var);
            jVar.i(bVar, z3);
            dVar.x = null;
            if (!ref$BooleanRef2.element) {
                break;
            }
            this = dVar;
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = dVar.l;
            if (!z) {
                dnm dnmVar = new dnm(new enm(a.d(NavController$executePopOperations$2.w, fVar), new tls() { // from class: androidx.navigation.NavController$executePopOperations$3
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(!d.this.l.containsKey(Integer.valueOf(((f) obj).A)));
                    }
                }, 1), (byte) 0);
                while (dnmVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((f) dnmVar.next()).A);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) x43Var.f();
                    linkedHashMap.put(valueOf, navBackStackEntryState != null ? navBackStackEntryState.getId() : null);
                }
            }
            if (!x43Var.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) x43Var.first();
                dnm dnmVar2 = new dnm(new enm(a.d(NavController$executePopOperations$5.w, dVar.d(navBackStackEntryState2.getDestinationId())), new tls() { // from class: androidx.navigation.NavController$executePopOperations$6
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(!d.this.l.containsKey(Integer.valueOf(((f) obj).A)));
                    }
                }, 1), (byte) 0);
                while (dnmVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((f) dnmVar2.next()).A), navBackStackEntryState2.getId());
                }
                if (linkedHashMap.values().contains(navBackStackEntryState2.getId())) {
                    dVar.m.put(navBackStackEntryState2.getId(), x43Var);
                }
            }
        }
        dVar.u();
        return ref$BooleanRef.element;
    }

    public final f d(int i) {
        f fVar;
        f550 f550Var = this.c;
        if (f550Var == null) {
            return null;
        }
        if (f550Var.A == i) {
            return f550Var;
        }
        b bVar = (b) this.g.h();
        if (bVar == null || (fVar = bVar.b) == null) {
            fVar = this.c;
        }
        return e(fVar, i, false);
    }

    public final b f(int i) {
        Object obj;
        x43 x43Var = this.g;
        ListIterator listIterator = x43Var.listIterator(x43Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((b) obj).b.A == i) {
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar != null) {
            return bVar;
        }
        StringBuilder t = b64.t(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        b bVar2 = (b) x43Var.h();
        t.append(bVar2 != null ? bVar2.b : null);
        throw new IllegalArgumentException(t.toString().toString());
    }

    public final f550 g() {
        f550 f550Var = this.c;
        if (f550Var != null) {
            return f550Var;
        }
        ny61.r("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final Lifecycle.State h() {
        return this.n == null ? Lifecycle.State.CREATED : this.q;
    }

    public final h i() {
        return (h) this.B.getValue();
    }

    public final void j(b bVar, b bVar2) {
        this.j.put(bVar, bVar2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(bVar2) == null) {
            linkedHashMap.put(bVar2, new AtomicInteger(0));
        }
        ((AtomicInteger) linkedHashMap.get(bVar2)).incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f3, code lost:
    
        if (r8.equals(r2) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0203, code lost:
    
        r2 = new defpackage.x43();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
    
        if (defpackage.scc.f(r1) < r6) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020e, code lost:
    
        r7 = (androidx.view.b) defpackage.ycc.z(r1);
        s(r7);
        r19 = new androidx.view.b(r7.a, r7.b, r7.b.a(r30), r7.w, r7.x, r7.y, r7.z);
        r19.w = r7.w;
        r19.b(r7.D);
        r2.addFirst(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024e, code lost:
    
        r3 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0256, code lost:
    
        if (r3.hasNext() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0258, code lost:
    
        r5 = (androidx.view.b) r3.next();
        r6 = r5.b.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0262, code lost:
    
        if (r6 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0264, code lost:
    
        j(r5, f(r6.A));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x026d, code lost:
    
        r1.addLast(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0271, code lost:
    
        r1 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0279, code lost:
    
        if (r1.hasNext() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027b, code lost:
    
        r2 = (androidx.view.b) r1.next();
        r13.b(r2.b.a).f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x028d, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0201, code lost:
    
        if (r29.A == r2.A) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00fb A[LOOP:7: B:92:0x004d->B:101:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0106 A[EDGE_INSN: B:102:0x0106->B:103:0x0106 BREAK  A[LOOP:7: B:92:0x004d->B:101:0x00fb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02d6 A[LOOP:1: B:23:0x02d0->B:25:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(final f fVar, Bundle bundle, k550 k550Var) {
        LinkedHashMap linkedHashMap;
        boolean z;
        boolean z2;
        ListIterator listIterator;
        int i;
        Iterator it;
        boolean m;
        Object obj;
        ListIterator listIterator2;
        d550 d550Var;
        Object obj2;
        boolean z3;
        LinkedHashMap linkedHashMap2 = this.v;
        Iterator it2 = linkedHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).d = true;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        x43 x43Var = this.g;
        ke50 ke50Var = this.u;
        if (k550Var != null) {
            boolean z4 = k550Var.e;
            boolean z5 = k550Var.d;
            String str = k550Var.j;
            if (str != null) {
                if (x43Var.isEmpty()) {
                    linkedHashMap = linkedHashMap2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator3 = x43Var.listIterator(x43Var.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            linkedHashMap = linkedHashMap2;
                            obj = null;
                            break;
                        }
                        obj = listIterator3.previous();
                        b bVar = (b) obj;
                        f fVar2 = bVar.b;
                        Bundle a = bVar.a();
                        if (jl40.l(fVar2.B, str)) {
                            linkedHashMap = linkedHashMap2;
                        } else {
                            d550 d = fVar2.d(str);
                            linkedHashMap = linkedHashMap2;
                            if (fVar2.equals(d != null ? d.a : null)) {
                                Bundle bundle2 = d.b;
                                if (a != null && bundle2 != null) {
                                    Iterator it3 = bundle2.keySet().iterator();
                                    while (it3.hasNext()) {
                                        Iterator it4 = it3;
                                        String str2 = (String) it3.next();
                                        if (a.containsKey(str2)) {
                                            listIterator2 = listIterator3;
                                            x450 x450Var = (x450) d.a.z.get(str2);
                                            t550 t550Var = x450Var != null ? x450Var.a : null;
                                            if (t550Var != null) {
                                                d550Var = d;
                                                obj2 = t550Var.a(bundle2, str2);
                                            } else {
                                                d550Var = d;
                                                obj2 = null;
                                            }
                                            Object a2 = t550Var != null ? t550Var.a(a, str2) : null;
                                            if (t550Var != null && !t550Var.f(obj2, a2)) {
                                                z3 = false;
                                                break;
                                            } else {
                                                listIterator3 = listIterator2;
                                                it3 = it4;
                                                d = d550Var;
                                            }
                                        }
                                    }
                                }
                            }
                            listIterator2 = listIterator3;
                            z3 = false;
                            if (!z5 || !z3) {
                                arrayList.add(ke50Var.b(bVar.b.a));
                            }
                            if (!z3) {
                                break;
                            }
                            linkedHashMap2 = linkedHashMap;
                            listIterator3 = listIterator2;
                        }
                        listIterator2 = listIterator3;
                        z3 = true;
                        if (!z5) {
                        }
                        arrayList.add(ke50Var.b(bVar.b.a));
                        if (!z3) {
                        }
                    }
                    b bVar2 = (b) obj;
                    f fVar3 = bVar2 != null ? bVar2.b : null;
                    if (fVar3 == null) {
                        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
                    } else {
                        m = c(arrayList, fVar3, z5, z4);
                    }
                }
                m = false;
            } else {
                linkedHashMap = linkedHashMap2;
                int i2 = k550Var.c;
                if (i2 != -1) {
                    m = m(i2, z5, z4);
                }
            }
            z = m;
            final Bundle a3 = fVar.a(bundle);
            if (k550Var != null && k550Var.b) {
                if (this.l.containsKey(Integer.valueOf(fVar.A))) {
                    ref$BooleanRef.element = q(fVar.A, a3, k550Var);
                    z2 = false;
                    u();
                    it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).d = false;
                    }
                    if (!z || ref$BooleanRef.element || z2) {
                        b();
                    } else {
                        t();
                        return;
                    }
                }
            }
            if (k550Var != null && k550Var.a) {
                b bVar3 = (b) x43Var.h();
                listIterator = x43Var.listIterator(x43Var.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    } else if (((b) listIterator.previous()).b == fVar) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                if (i != -1) {
                    if (fVar instanceof f550) {
                        int i3 = f550.I;
                        List s = b.s(new yw01(a.d(NavGraph$Companion$childHierarchy$1.w, (f550) fVar), NavController$launchSingleTopInternal$childHierarchyId$1.w));
                        if (x43Var.size() - i == s.size()) {
                            List subList = x43Var.subList(i, x43Var.size());
                            ArrayList arrayList2 = new ArrayList(tcc.n(subList, 10));
                            Iterator it5 = subList.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(Integer.valueOf(((b) it5.next()).b.A));
                            }
                        }
                    } else if (bVar3 != null) {
                        f fVar4 = bVar3.b;
                        if (fVar4 != null) {
                        }
                    }
                    if (!z2) {
                        b bVar4 = new b(this.a, fVar, a3, h(), this.o, UUID.randomUUID().toString(), null);
                        j b = ke50Var.b(fVar.a);
                        List singletonList = Collections.singletonList(bVar4);
                        this.w = new tls() { // from class: androidx.navigation.NavController$navigate$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj3) {
                                Ref$BooleanRef.this.element = true;
                                this.a(fVar, a3, (b) obj3, EmptyList.a);
                                return zy11.a;
                            }
                        };
                        b.d(singletonList, k550Var);
                        this.w = null;
                    }
                    u();
                    it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                    }
                    if (z) {
                    }
                    b();
                }
            }
            z2 = false;
            if (!z2) {
            }
            u();
            it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
            }
            if (z) {
            }
            b();
        }
        linkedHashMap = linkedHashMap2;
        z = false;
        final Bundle a32 = fVar.a(bundle);
        if (k550Var != null) {
            if (this.l.containsKey(Integer.valueOf(fVar.A))) {
            }
        }
        if (k550Var != null) {
            b bVar32 = (b) x43Var.h();
            listIterator = x43Var.listIterator(x43Var.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        z2 = false;
        if (!z2) {
        }
        u();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        b();
    }

    public final boolean m(int i, boolean z, boolean z2) {
        f fVar;
        x43 x43Var = this.g;
        if (x43Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = kotlin.collections.a.q0(x43Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar = null;
                break;
            }
            fVar = ((b) it.next()).b;
            j b = this.u.b(fVar.a);
            if (z || fVar.A != i) {
                arrayList.add(b);
            }
            if (fVar.A == i) {
                break;
            }
        }
        if (fVar != null) {
            return c(arrayList, fVar, z, z2);
        }
        int i2 = f.D;
        Log.i("NavController", "Ignoring popBackStack to destination " + orb1.b(i, this.a) + " as it was not found on the current back stack");
        return false;
    }

    public final void n(b bVar, boolean z, x43 x43Var) {
        a550 a550Var;
        gci0 gci0Var;
        Set set;
        x43 x43Var2 = this.g;
        b bVar2 = (b) x43Var2.last();
        if (!jl40.l(bVar2, bVar)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(bVar.b);
            f fVar = bVar2.b;
            sb.append(", which is not the top of the back stack (");
            sb.append(fVar);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        ycc.z(x43Var2);
        c cVar = (c) this.v.get(this.u.b(bVar2.b.a));
        boolean z2 = true;
        if ((cVar == null || (gci0Var = cVar.f) == null || (set = (Set) gci0Var.a.getValue()) == null || !set.contains(bVar2)) && !this.k.containsKey(bVar2)) {
            z2 = false;
        }
        Lifecycle.State state = bVar2.A.w;
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.a(state2)) {
            if (z) {
                bVar2.b(state2);
                x43Var.addFirst(new NavBackStackEntryState(bVar2));
            }
            if (z2) {
                bVar2.b(state2);
            } else {
                bVar2.b(Lifecycle.State.DESTROYED);
                s(bVar2);
            }
        }
        if (z || z2 || (a550Var = this.o) == null) {
            return;
        }
        qs31 qs31Var = (qs31) a550Var.b.remove(bVar2.y);
        if (qs31Var != null) {
            qs31Var.a();
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.v.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((c) it.next()).f.a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                b bVar = (b) obj;
                if (!arrayList.contains(bVar) && !bVar.D.a(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            ycc.r(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            b bVar2 = (b) next;
            if (!arrayList.contains(bVar2) && bVar2.D.a(Lifecycle.State.STARTED)) {
                arrayList3.add(next);
            }
        }
        ycc.r(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((b) next2).b instanceof f550)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, final Bundle bundle, k550 k550Var) {
        f g;
        b bVar;
        f fVar;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        final String str = (String) linkedHashMap.get(Integer.valueOf(i));
        ycc.v(linkedHashMap.values(), new tls() { // from class: androidx.navigation.NavController$restoreStateInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return Boolean.valueOf(jl40.l((String) obj, str));
            }
        }, true);
        x43 x43Var = (x43) ym11.c(this.m).remove(str);
        final ArrayList arrayList = new ArrayList();
        b bVar2 = (b) this.g.h();
        if (bVar2 == null || (g = bVar2.b) == null) {
            g = g();
        }
        if (x43Var != null) {
            Iterator it = x43Var.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                f e = e(g, navBackStackEntryState.getDestinationId(), true);
                Context context = this.a;
                if (e == null) {
                    int i2 = f.D;
                    xfo.m("Restore State failed: destination ", orb1.b(navBackStackEntryState.getDestinationId(), context), " cannot be found from the current destination ", g);
                    return false;
                }
                arrayList.add(navBackStackEntryState.instantiate(context, e, h(), this.o));
                g = e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((b) next).b instanceof f550)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            b bVar3 = (b) it3.next();
            List list = (List) kotlin.collections.a.b0(arrayList2);
            if (list != null && (bVar = (b) kotlin.collections.a.Z(list)) != null && (fVar = bVar.b) != null) {
                str2 = fVar.a;
            }
            if (jl40.l(str2, bVar3.b.a)) {
                list.add(bVar3);
            } else {
                arrayList2.add(scc.i(bVar3));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            j b = this.u.b(((b) kotlin.collections.a.P(list2)).b.a);
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            this.w = new tls() { // from class: androidx.navigation.NavController$executeRestoreState$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    List<b> list3;
                    b bVar4 = (b) obj;
                    Ref$BooleanRef.this.element = true;
                    int indexOf = arrayList.indexOf(bVar4);
                    if (indexOf != -1) {
                        int i3 = indexOf + 1;
                        list3 = arrayList.subList(ref$IntRef.element, i3);
                        ref$IntRef.element = i3;
                    } else {
                        list3 = EmptyList.a;
                    }
                    this.a(bVar4.b, bundle, bVar4, list3);
                    return zy11.a;
                }
            };
            b.d(list2, k550Var);
            this.w = null;
        }
        return ref$BooleanRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(f550 f550Var, Bundle bundle) {
        Activity activity;
        Intent intent;
        int[] intArray;
        Bundle bundle2;
        b bVar;
        f fVar;
        d550 i;
        boolean z;
        int length;
        int i2;
        String str;
        boolean z2;
        f h;
        Bundle bundle3;
        f h2;
        f550 f550Var2;
        ArrayList<String> stringArrayList;
        pnt0 pnt0Var = f550Var.E;
        x43 x43Var = this.g;
        if (!x43Var.isEmpty() && h() == Lifecycle.State.DESTROYED) {
            ny61.r("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        if (jl40.l(this.c, f550Var)) {
            int e = pnt0Var.e();
            for (int i3 = 0; i3 < e; i3++) {
                f fVar2 = (f) pnt0Var.f(i3);
                int c = this.c.E.c(i3);
                pnt0 pnt0Var2 = this.c.E;
                if (pnt0Var2.a) {
                    kp50.a(pnt0Var2);
                }
                int c2 = cvw.c(pnt0Var2.b, pnt0Var2.w, c);
                if (c2 >= 0) {
                    Object[] objArr = pnt0Var2.c;
                    Object obj = objArr[c2];
                    objArr[c2] = fVar2;
                }
            }
            Iterator it = x43Var.iterator();
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                int i4 = f.D;
                u1l u1lVar = new u1l(2, b.s(a.d(NavDestination$Companion$hierarchy$1.w, bVar2.b)));
                f fVar3 = this.c;
                Iterator it2 = u1lVar.iterator();
                while (true) {
                    ListIterator listIterator = ((t2k0) it2).a;
                    if (listIterator.hasPrevious()) {
                        f fVar4 = (f) listIterator.previous();
                        if ((!jl40.l(fVar4, this.c) || !fVar3.equals(f550Var)) && (fVar3 instanceof f550)) {
                            f550 f550Var3 = (f550) fVar3;
                            fVar3 = f550Var3.h(fVar4.A, f550Var3, false);
                        }
                    }
                }
                bVar2.b = fVar3;
            }
            return;
        }
        f550 f550Var4 = this.c;
        LinkedHashMap linkedHashMap = this.v;
        boolean z3 = true;
        if (f550Var4 != null) {
            Iterator it3 = new ArrayList(this.l.keySet()).iterator();
            while (it3.hasNext()) {
                int intValue = ((Integer) it3.next()).intValue();
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((c) it4.next()).d = true;
                }
                boolean q = q(intValue, null, qrb1.e(NavController$clearBackStackInternal$restored$1.w));
                Iterator it5 = linkedHashMap.values().iterator();
                while (it5.hasNext()) {
                    ((c) it5.next()).d = false;
                }
                if (q) {
                    m(intValue, true, false);
                }
            }
            m(f550Var4.A, true, false);
        }
        this.c = f550Var;
        Bundle bundle4 = this.d;
        ke50 ke50Var = this.u;
        if (bundle4 != null && (stringArrayList = bundle4.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it6 = stringArrayList.iterator();
            while (it6.hasNext()) {
                String next = it6.next();
                j b = ke50Var.b(next);
                Bundle bundle5 = bundle4.getBundle(next);
                if (bundle5 != null) {
                    b.g(bundle5);
                }
            }
        }
        Parcelable[] parcelableArr = this.e;
        Context context = this.a;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                f d = d(navBackStackEntryState.getDestinationId());
                if (d == null) {
                    int i5 = f.D;
                    StringBuilder x = unr0.x("Restoring the Navigation back stack failed: destination ", orb1.b(navBackStackEntryState.getDestinationId(), context), " cannot be found from the current destination ");
                    b bVar3 = (b) x43Var.h();
                    x.append(bVar3 != null ? bVar3.b : null);
                    throw new IllegalStateException(x.toString());
                }
                b instantiate = navBackStackEntryState.instantiate(context, d, h(), this.o);
                j b2 = ke50Var.b(d.a);
                Object obj2 = linkedHashMap.get(b2);
                if (obj2 == null) {
                    obj2 = new c(this, b2);
                    linkedHashMap.put(b2, obj2);
                }
                x43Var.addLast(instantiate);
                ((c) obj2).j(instantiate);
                f550 f550Var5 = instantiate.b.b;
                if (f550Var5 != null) {
                    j(instantiate, f(f550Var5.A));
                }
            }
            u();
            this.e = null;
        }
        Collection values = kotlin.collections.b.t(ke50Var.a).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : values) {
            if (!((j) obj3).b) {
                arrayList.add(obj3);
            }
        }
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            j jVar = (j) it7.next();
            Object obj4 = linkedHashMap.get(jVar);
            if (obj4 == null) {
                obj4 = new c(this, jVar);
                linkedHashMap.put(jVar, obj4);
            }
            jVar.e((c) obj4);
        }
        if (this.c == null || !x43Var.isEmpty()) {
            b();
            return;
        }
        if (!this.f && (activity = this.b) != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e2) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                }
                ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                Bundle bundle6 = new Bundle();
                bundle2 = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                if (bundle2 != null) {
                    bundle6.putAll(bundle2);
                }
                if (intArray != null || intArray.length == 0) {
                    bVar = (b) x43Var.h();
                    if (bVar != null || (fVar = bVar.b) == null) {
                        fVar = this.c;
                    }
                    f550 f550Var6 = !(fVar instanceof f550) ? (f550) fVar : fVar.b;
                    i = f550Var6.i(new e100(intent), true, f550Var6);
                    if (i != null) {
                        f fVar5 = i.a;
                        x43 x43Var2 = new x43();
                        f fVar6 = fVar5;
                        while (true) {
                            f550 f550Var7 = fVar6.b;
                            z = z3;
                            if (f550Var7 == null || f550Var7.F != fVar6.A) {
                                x43Var2.addFirst(fVar6);
                            }
                            if (!jl40.l(f550Var7, null) && f550Var7 != null) {
                                fVar6 = f550Var7;
                                z3 = z;
                            }
                        }
                        List J0 = kotlin.collections.a.J0(x43Var2);
                        ArrayList arrayList2 = new ArrayList(tcc.n(J0, 10));
                        Iterator it8 = J0.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(Integer.valueOf(((f) it8.next()).A));
                        }
                        intArray = kotlin.collections.a.I0(arrayList2);
                        Bundle a = fVar5.a(i.b);
                        if (a != null) {
                            bundle6.putAll(a);
                        }
                        parcelableArrayList = null;
                        if (intArray != null && intArray.length != 0) {
                            f550 f550Var8 = this.c;
                            length = intArray.length;
                            i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    str = null;
                                    break;
                                }
                                int i6 = intArray[i2];
                                if (i2 == 0) {
                                    h2 = this.c;
                                    if (h2.A != i6) {
                                        h2 = null;
                                    }
                                } else {
                                    h2 = f550Var8.h(i6, f550Var8, false);
                                }
                                if (h2 == null) {
                                    int i7 = f.D;
                                    str = orb1.b(i6, context);
                                    break;
                                }
                                if (i2 != intArray.length - 1 && (h2 instanceof f550)) {
                                    while (true) {
                                        f550Var2 = (f550) h2;
                                        if (!(f550Var2.h(f550Var2.F, f550Var2, false) instanceof f550)) {
                                            break;
                                        } else {
                                            h2 = f550Var2.h(f550Var2.F, f550Var2, false);
                                        }
                                    }
                                    f550Var8 = f550Var2;
                                }
                                i2++;
                            }
                            if (str != null) {
                                bundle6.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                int length2 = intArray.length;
                                Bundle[] bundleArr = new Bundle[length2];
                                for (int i8 = 0; i8 < length2; i8++) {
                                    Bundle bundle7 = new Bundle();
                                    bundle7.putAll(bundle6);
                                    if (parcelableArrayList != null && (bundle3 = (Bundle) parcelableArrayList.get(i8)) != null) {
                                        bundle7.putAll(bundle3);
                                    }
                                    bundleArr[i8] = bundle7;
                                }
                                int flags = intent.getFlags();
                                int i9 = 268435456 & flags;
                                if (i9 != 0 && (flags & 32768) == 0) {
                                    intent.addFlags(32768);
                                    f1 f1Var = new f1(context);
                                    ComponentName component = intent.getComponent();
                                    if (component == null) {
                                        component = intent.resolveActivity(f1Var.b.getPackageManager());
                                    }
                                    if (component != null) {
                                        f1Var.a(component);
                                    }
                                    f1Var.a.add(intent);
                                    f1Var.e();
                                    activity.finish();
                                    activity.overridePendingTransition(0, 0);
                                    return;
                                }
                                if (i9 != 0) {
                                    if (!x43Var.isEmpty()) {
                                        m(this.c.A, z, false);
                                    }
                                    int i10 = 0;
                                    while (i10 < intArray.length) {
                                        int i11 = intArray[i10];
                                        int i12 = i10 + 1;
                                        Bundle bundle8 = bundleArr[i10];
                                        final f d2 = d(i11);
                                        if (d2 == null) {
                                            int i13 = f.D;
                                            StringBuilder x2 = unr0.x("Deep Linking failed: destination ", orb1.b(i11, context), " cannot be found from the current destination ");
                                            b bVar4 = (b) x43Var.h();
                                            x2.append(bVar4 != null ? bVar4.b : null);
                                            throw new IllegalStateException(x2.toString());
                                        }
                                        k(d2, bundle8, qrb1.e(new tls() { // from class: androidx.navigation.NavController$handleDeepLink$2

                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lud2;", "Lzy11;", "invoke", "(Lud2;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            /* renamed from: androidx.navigation.NavController$handleDeepLink$2$1, reason: invalid class name */
                                            final class AnonymousClass1 extends Lambda implements tls {
                                                public static final AnonymousClass1 w = new AnonymousClass1(1);

                                                @Override // defpackage.tls
                                                public final Object invoke(Object obj) {
                                                    ud2 ud2Var = (ud2) obj;
                                                    ud2Var.a = 0;
                                                    ud2Var.b = 0;
                                                    return zy11.a;
                                                }
                                            }

                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu6e0;", "Lzy11;", "invoke", "(Lu6e0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                            /* renamed from: androidx.navigation.NavController$handleDeepLink$2$2, reason: invalid class name */
                                            final class AnonymousClass2 extends Lambda implements tls {
                                                public static final AnonymousClass2 w = new AnonymousClass2(1);

                                                @Override // defpackage.tls
                                                public final Object invoke(Object obj) {
                                                    ((u6e0) obj).a = true;
                                                    return zy11.a;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // defpackage.tls
                                            public final Object invoke(Object obj5) {
                                                l550 l550Var = (l550) obj5;
                                                ud2 ud2Var = new ud2();
                                                AnonymousClass1.w.invoke(ud2Var);
                                                j550 j550Var = l550Var.a;
                                                j550Var.g = ud2Var.a;
                                                j550Var.h = ud2Var.b;
                                                j550Var.i = -1;
                                                j550Var.j = -1;
                                                f fVar7 = f.this;
                                                if (fVar7 instanceof f550) {
                                                    int i14 = f.D;
                                                    qrq0 d3 = a.d(NavDestination$Companion$hierarchy$1.w, fVar7);
                                                    d dVar = this;
                                                    Iterator it9 = d3.iterator();
                                                    while (true) {
                                                        if (!it9.hasNext()) {
                                                            int i15 = f550.I;
                                                            l550Var.d = ((f) b.n(a.d(NavGraph$Companion$childHierarchy$1.w, this.g()))).A;
                                                            u6e0 u6e0Var = new u6e0();
                                                            AnonymousClass2.w.invoke(u6e0Var);
                                                            l550Var.e = u6e0Var.a;
                                                            break;
                                                        }
                                                        f fVar8 = (f) it9.next();
                                                        b bVar5 = (b) dVar.g.h();
                                                        f fVar9 = bVar5 != null ? bVar5.b : null;
                                                        if (jl40.l(fVar8, fVar9 != null ? fVar9.b : null)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                return zy11.a;
                                            }
                                        }));
                                        i10 = i12;
                                    }
                                    this.f = true;
                                    return;
                                }
                                f550 f550Var9 = this.c;
                                int length3 = intArray.length;
                                for (int i14 = 0; i14 < length3; i14++) {
                                    int i15 = intArray[i14];
                                    Bundle bundle9 = bundleArr[i14];
                                    if (i14 == 0) {
                                        h = this.c;
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                        h = f550Var9.h(i15, f550Var9, false);
                                    }
                                    if (h == null) {
                                        int i16 = f.D;
                                        ak00.h("Deep Linking failed: destination ", orb1.b(i15, context), " cannot be found in graph ", f550Var9);
                                        return;
                                    }
                                    if (i14 == intArray.length - 1) {
                                        j550 j550Var = new j550();
                                        j550Var.c = this.c.A;
                                        j550Var.d = null;
                                        j550Var.e = true;
                                        j550Var.f = false;
                                        j550Var.g = 0;
                                        j550Var.h = 0;
                                        k(h, bundle9, j550Var.a());
                                    } else if (h instanceof f550) {
                                        f550 f550Var10 = (f550) h;
                                        while (f550Var10.h(f550Var10.F, f550Var10, z2) instanceof f550) {
                                            f550Var10 = (f550) f550Var10.h(f550Var10.F, f550Var10, z2);
                                            z2 = false;
                                        }
                                        f550Var9 = f550Var10;
                                    }
                                }
                                this.f = true;
                                return;
                            }
                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                        }
                    }
                }
                z = true;
                if (intArray != null) {
                    f550 f550Var82 = this.c;
                    length = intArray.length;
                    i2 = 0;
                    while (true) {
                        if (i2 < length) {
                        }
                        i2++;
                    }
                    if (str != null) {
                    }
                }
            }
            intArray = null;
            if (extras == null) {
            }
            Bundle bundle62 = new Bundle();
            if (extras == null) {
            }
            if (bundle2 != null) {
            }
            if (intArray != null) {
            }
            bVar = (b) x43Var.h();
            if (bVar != null) {
            }
            fVar = this.c;
            if (!(fVar instanceof f550)) {
            }
            i = f550Var6.i(new e100(intent), true, f550Var6);
            if (i != null) {
            }
            z = true;
            if (intArray != null) {
            }
        }
        k(this.c, bundle, null);
    }

    public final void s(b bVar) {
        b bVar2 = (b) this.j.remove(bVar);
        if (bVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(bVar2);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            c cVar = (c) this.v.get(this.u.b(bVar2.b.a));
            if (cVar != null) {
                cVar.b(bVar2);
            }
            linkedHashMap.remove(bVar2);
        }
    }

    public final void t() {
        AtomicInteger atomicInteger;
        gci0 gci0Var;
        Set set;
        ArrayList arrayList = new ArrayList(this.g);
        if (arrayList.isEmpty()) {
            return;
        }
        f fVar = ((b) kotlin.collections.a.Z(arrayList)).b;
        ArrayList arrayList2 = new ArrayList();
        if (fVar instanceof zdj) {
            Iterator it = kotlin.collections.a.q0(arrayList).iterator();
            while (it.hasNext()) {
                f fVar2 = ((b) it.next()).b;
                arrayList2.add(fVar2);
                if (!(fVar2 instanceof zdj) && !(fVar2 instanceof f550)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (b bVar : kotlin.collections.a.q0(arrayList)) {
            Lifecycle.State state = bVar.D;
            f fVar3 = bVar.b;
            if (fVar != null && fVar3.A == fVar.A) {
                Lifecycle.State state2 = Lifecycle.State.RESUMED;
                if (state != state2) {
                    c cVar = (c) this.v.get(this.u.b(fVar3.a));
                    if (jl40.l((cVar == null || (gci0Var = cVar.f) == null || (set = (Set) gci0Var.a.getValue()) == null) ? null : Boolean.valueOf(set.contains(bVar)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.k.get(bVar)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(bVar, Lifecycle.State.STARTED);
                    } else {
                        hashMap.put(bVar, state2);
                    }
                }
                f fVar4 = (f) kotlin.collections.a.R(arrayList2);
                if (fVar4 != null && fVar4.A == fVar3.A) {
                    ycc.x(arrayList2);
                }
                fVar = fVar.b;
            } else if (arrayList2.isEmpty() || fVar3.A != ((f) kotlin.collections.a.P(arrayList2)).A) {
                bVar.b(Lifecycle.State.CREATED);
            } else {
                f fVar5 = (f) ycc.x(arrayList2);
                if (state == Lifecycle.State.RESUMED) {
                    bVar.b(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state3 = Lifecycle.State.STARTED;
                    if (state != state3) {
                        hashMap.put(bVar, state3);
                    }
                }
                f550 f550Var = fVar5.b;
                if (f550Var != null && !arrayList2.contains(f550Var)) {
                    arrayList2.add(f550Var);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            Lifecycle.State state4 = (Lifecycle.State) hashMap.get(bVar2);
            if (state4 != null) {
                bVar2.b(state4);
            } else {
                bVar2.c();
            }
        }
    }

    public final void u() {
        int i;
        boolean z = false;
        if (this.t) {
            x43 x43Var = this.g;
            if (x43Var == null || !x43Var.isEmpty()) {
                Iterator it = x43Var.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(((b) it.next()).b instanceof f550) && (i = i + 1) < 0) {
                        scc.l();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z = true;
            }
        }
        this.s.h(z);
    }
}
