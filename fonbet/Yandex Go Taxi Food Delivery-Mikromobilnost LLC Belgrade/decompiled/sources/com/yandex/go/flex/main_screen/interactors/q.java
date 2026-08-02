package com.yandex.go.flex.main_screen.interactors;

import com.yandex.go.flex.main_screen.api.domain.SuperappTopPlaqueType;
import com.yandex.go.flex.main_screen.data.widgets.orders.OrdersWidgetSection;
import com.yandex.go.flex.main_screen.data.widgets.plaque.PlaqueWidgetSection;
import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import defpackage.atx;
import defpackage.bvf0;
import defpackage.bzp0;
import defpackage.cnr0;
import defpackage.czp0;
import defpackage.dd00;
import defpackage.dzp0;
import defpackage.gye0;
import defpackage.hcw0;
import defpackage.jst;
import defpackage.mcw0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pcw0;
import defpackage.qcw0;
import defpackage.r6s0;
import defpackage.rcc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uwl;
import defpackage.uyj;
import defpackage.v800;
import defpackage.vit;
import defpackage.wby0;
import defpackage.yvf0;
import defpackage.yw11;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class q {
    public final com.yandex.go.flex.main_screen.presentation.feed.e a;
    public final qcw0 b;
    public final gye0 c;
    public final yw11 d;
    public final com.yandex.go.flex.main_screen.domain.h e;
    public final vit f;
    public final atx g;
    public final dd00 h;
    public final tt2 i;
    public final flex.engine.a j;

    public q(com.yandex.go.flex.main_screen.presentation.feed.e eVar, qcw0 qcw0Var, gye0 gye0Var, yw11 yw11Var, com.yandex.go.flex.main_screen.domain.h hVar, vit vitVar, atx atxVar, dd00 dd00Var, tt2 tt2Var, flex.engine.a aVar) {
        this.a = eVar;
        this.b = qcw0Var;
        this.c = gye0Var;
        this.d = yw11Var;
        this.e = hVar;
        this.f = vitVar;
        this.g = atxVar;
        this.h = dd00Var;
        this.i = tt2Var;
        this.j = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0051, code lost:
    
        if (r1 == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ShowUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1 showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1;
        Object obj;
        int i;
        boolean z;
        com.yandex.go.flex.main_screen.data.network.c cVar;
        r0 r0Var;
        Object value;
        Object k0;
        if (continuationImpl instanceof ShowUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1) {
            showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1 = (ShowUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1) continuationImpl;
            int i2 = showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.label;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    jst.e.getClass();
                    com.yandex.go.flex.main_screen.domain.h hVar = this.e;
                    showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.label = 1;
                    obj2 = hVar.a(showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    kotlin.b.b(obj2);
                }
                SuperappTopPlaqueType superappTopPlaqueType = (SuperappTopPlaqueType) obj2;
                yw11 yw11Var = this.d;
                z = superappTopPlaqueType != SuperappTopPlaqueType.DOCUMENT_SECTION || superappTopPlaqueType == SuperappTopPlaqueType.HEADER_COMPACT_TOP;
                yw11Var.getClass();
                czp0 czp0Var = new czp0(z2, new bzp0(null));
                ListBuilder a = rcc.a();
                a.add(new OrdersWidgetSection(60));
                if (z) {
                    a.add(new PlaqueWidgetSection(0));
                }
                ywl ywlVar = new ywl(new dzp0(czp0Var, a.j(), null, null, null, null), wby0.INSTANCE, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null);
                r0 r0Var2 = this.a.d;
                Boolean bool = Boolean.FALSE;
                r0Var2.getClass();
                r0Var2.m(null, bool);
                this.c.a = false;
                cVar = (com.yandex.go.flex.main_screen.data.network.c) ((yvf0) this.f.b).get();
                if (cVar != null) {
                    cVar.x.set(null);
                    bvf0.j(((v800) cVar.y.getAndSet(cVar.a())).a, null);
                }
                this.g.a.set(null);
                this.h.a.l(MainSidePagerSidePage.NONE);
                r0Var = this.b.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, new pcw0(mcw0.a, hcw0.a)));
                showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.L$0 = null;
                showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.L$1 = null;
                showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.label = 2;
                this.i.getClass();
                sjh sjhVar = uyj.a;
                k0 = tje.k0(o400.a, new ShowUnavailableAddressScaffoldInteractor$showDocument$2(this, ywlVar, null), showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1);
                if (k0 != obj) {
                    k0 = zy11.a;
                }
                return k0 != obj ? obj : k0;
            }
        }
        showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1 = new ShowUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1(this, continuationImpl);
        Object obj22 = showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        SuperappTopPlaqueType superappTopPlaqueType2 = (SuperappTopPlaqueType) obj22;
        yw11 yw11Var2 = this.d;
        if (superappTopPlaqueType2 != SuperappTopPlaqueType.DOCUMENT_SECTION) {
        }
        yw11Var2.getClass();
        czp0 czp0Var2 = new czp0(z22, new bzp0(null));
        ListBuilder a2 = rcc.a();
        a2.add(new OrdersWidgetSection(60));
        if (z) {
        }
        ywl ywlVar2 = new ywl(new dzp0(czp0Var2, a2.j(), null, null, null, null), wby0.INSTANCE, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null);
        r0 r0Var22 = this.a.d;
        Boolean bool2 = Boolean.FALSE;
        r0Var22.getClass();
        r0Var22.m(null, bool2);
        this.c.a = false;
        cVar = (com.yandex.go.flex.main_screen.data.network.c) ((yvf0) this.f.b).get();
        if (cVar != null) {
        }
        this.g.a.set(null);
        this.h.a.l(MainSidePagerSidePage.NONE);
        r0Var = this.b.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, new pcw0(mcw0.a, hcw0.a)));
        showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.L$0 = null;
        showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.L$1 = null;
        showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1.label = 2;
        this.i.getClass();
        sjh sjhVar2 = uyj.a;
        k0 = tje.k0(o400.a, new ShowUnavailableAddressScaffoldInteractor$showDocument$2(this, ywlVar2, null), showUnavailableAddressScaffoldInteractor$showUnavailableAddressScaffold$1);
        if (k0 != obj) {
        }
        if (k0 != obj) {
        }
    }
}
