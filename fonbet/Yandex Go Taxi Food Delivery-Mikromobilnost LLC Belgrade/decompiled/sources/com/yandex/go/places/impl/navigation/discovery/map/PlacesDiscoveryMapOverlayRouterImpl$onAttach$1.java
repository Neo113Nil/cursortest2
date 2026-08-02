package com.yandex.go.places.impl.navigation.discovery.map;

import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.places.map.domain.layer.PlacesLayersInteractor$selectedPinLocationFlow$$inlined$flatMapLatest$1;
import com.yandex.go.places.map.domain.layer.c;
import defpackage.a3c0;
import defpackage.a5g;
import defpackage.bcc0;
import defpackage.c0g;
import defpackage.dm80;
import defpackage.g130;
import defpackage.i7c0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tdc0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uo21;
import defpackage.wls;
import defpackage.xl80;
import defpackage.yl80;
import defpackage.z65;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "La5g;", "it", "Lzy11;", "<anonymous>", "(Ltse;La5g;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.discovery.map.PlacesDiscoveryMapOverlayRouterImpl$onAttach$1", f = "PlacesDiscoveryMapOverlayRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesDiscoveryMapOverlayRouterImpl$onAttach$1 extends SuspendLambda implements zls {
    final /* synthetic */ boolean $skipFirst;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.places.impl.navigation.discovery.map.PlacesDiscoveryMapOverlayRouterImpl$onAttach$1$2", f = "PlacesDiscoveryMapOverlayRouterImpl.kt", l = {203, 207, 209}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.places.impl.navigation.discovery.map.PlacesDiscoveryMapOverlayRouterImpl$onAttach$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ boolean $hadStoredStack;
        final /* synthetic */ List<bcc0> $normalized;
        final /* synthetic */ boolean $shouldAttachSocialLayerEagerly;
        final /* synthetic */ boolean $shouldKeepSocialLayerSuspended;
        final /* synthetic */ boolean $skipFirst;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, a aVar, boolean z2, List list, boolean z3, boolean z4, Continuation continuation) {
            super(2, continuation);
            this.$shouldKeepSocialLayerSuspended = z;
            this.this$0 = aVar;
            this.$shouldAttachSocialLayerEagerly = z2;
            this.$normalized = list;
            this.$skipFirst = z3;
            this.$hadStoredStack = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$shouldKeepSocialLayerSuspended, this.this$0, this.$shouldAttachSocialLayerEagerly, this.$normalized, this.$skipFirst, this.$hadStoredStack, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            if (r8 == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        
            if (com.yandex.go.places.impl.navigation.discovery.map.a.m0(r8, r1, r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0039, code lost:
        
            if (r8 == r0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            tdc0 tdc0Var;
            List<bcc0> list;
            Object b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                b.b(obj);
                if (this.$shouldKeepSocialLayerSuspended && (tdc0Var = this.this$0.r0) != null) {
                    this.label = 1;
                    obj = tdc0Var.b.E(this);
                }
                if (this.$shouldAttachSocialLayerEagerly) {
                    a aVar = this.this$0;
                    boolean z = !this.$shouldKeepSocialLayerSuspended;
                    this.label = 2;
                }
                a aVar2 = this.this$0;
                list = this.$normalized;
                this.label = 3;
                aVar2.getClass();
                if (list.isEmpty()) {
                }
            } else if (i == 1) {
                b.b(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    a aVar3 = this.this$0;
                    boolean z2 = this.$skipFirst && this.$hadStoredStack;
                    tpr t = e.t(new com.yandex.go.superapp.discovery.map.impl.data.repositories.common.b(e.c(aVar3.h0.a)));
                    if (z2) {
                        t = new mth(t, 4);
                    }
                    aVar3.s0 = tje.N(aVar3.o(), null, null, new PlacesDiscoveryMapOverlayRouterImpl$subscribeToPayloadUpdates$$inlined$safeCollectIn$1(t, null, aVar3), 3);
                    return zy11Var;
                }
                b.b(obj);
                a aVar22 = this.this$0;
                list = this.$normalized;
                this.label = 3;
                aVar22.getClass();
                if (list.isEmpty()) {
                    b = zy11Var;
                } else {
                    aVar22.V.a();
                    b = aVar22.w0.b(list, this);
                }
            }
            if (this.$shouldAttachSocialLayerEagerly) {
            }
            a aVar222 = this.this$0;
            list = this.$normalized;
            this.label = 3;
            aVar222.getClass();
            if (list.isEmpty()) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesDiscoveryMapOverlayRouterImpl$onAttach$1(a aVar, boolean z, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$skipFirst = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlacesDiscoveryMapOverlayRouterImpl$onAttach$1 placesDiscoveryMapOverlayRouterImpl$onAttach$1 = new PlacesDiscoveryMapOverlayRouterImpl$onAttach$1(this.this$0, this.$skipFirst, (Continuation) obj3);
        placesDiscoveryMapOverlayRouterImpl$onAttach$1.L$0 = (a5g) obj2;
        zy11 zy11Var = zy11.a;
        placesDiscoveryMapOverlayRouterImpl$onAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fe  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v36 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        ArrayList arrayList2;
        Iterator it;
        boolean z4;
        com.yandex.go.places.impl.navigation.map.listener.a aVar;
        a5g a5gVar = (a5g) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ((com.yandex.go.places.map.ui.overlay.a) a5gVar.b1.get()).b();
        g130 e = a5gVar.e();
        a aVar2 = this.this$0;
        e.a(aVar2.p0, ((c0g) aVar2.c0).B5());
        this.this$0.q0 = (i7c0) a5gVar.a3.get();
        a aVar3 = this.this$0;
        tdc0 tdc0Var = (tdc0) a5gVar.N2.get();
        if (!tdc0Var.c) {
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
        aVar3.r0 = tdc0Var;
        a aVar4 = this.this$0;
        pzt0 pzt0Var = aVar4.t0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        c cVar = (c) a5gVar.E.get();
        aVar4.t0 = tje.N(aVar4.o(), null, null, new PlacesDiscoveryMapOverlayRouterImpl$subscribeToSelectedPin$$inlined$safeCollectIn$1(e.t(new com.yandex.go.places.map.domain.layer.b(e.X(cVar.a.c, new PlacesLayersInteractor$selectedPinLocationFlow$$inlined$flatMapLatest$1(null, cVar)))), null, aVar4.o0), 3);
        ?? r14 = (List) this.this$0.V.a.getValue();
        boolean z5 = !((Collection) r14).isEmpty();
        if (r14.size() > 1) {
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Object obj2 : (Iterable) r14) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                boolean z6 = ((bcc0) obj2).a instanceof xl80;
                boolean z7 = i < scc.f(r14) && (((bcc0) r14.get(i2)).a instanceof xl80);
                if (!z6 || !z7) {
                    arrayList3.add(obj2);
                }
                i = i2;
            }
            if (arrayList3.size() == 1) {
                r14 = Collections.singletonList(bcc0.a((bcc0) kotlin.collections.a.s0(arrayList3), PlacesNavigationEntry$Source.STARTER));
            } else {
                if (!arrayList3.isEmpty()) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        if (((bcc0) it2.next()).a instanceof yl80) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!arrayList3.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        if (((bcc0) it3.next()).a instanceof xl80) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (!z || !z2) {
                    arrayList = arrayList3;
                    if (arrayList.size() > 1 && (aVar = a5gVar.e().c) != null) {
                        aVar.y = true;
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList4 = arrayList;
                        if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                if (((bcc0) it4.next()).a instanceof yl80) {
                                }
                            }
                        }
                        z3 = true;
                        a aVar5 = this.this$0;
                        aVar5.getClass();
                        arrayList2 = arrayList;
                        if ((arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                dm80 dm80Var = ((bcc0) it.next()).a;
                                xl80 xl80Var = dm80Var instanceof xl80 ? (xl80) dm80Var : null;
                                if (xl80Var == null ? false : aVar5.p0(xl80Var)) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        z4 = false;
                        tje.N(this.this$0.o(), null, null, new AnonymousClass2(z4, this.this$0, z3, arrayList, this.$skipFirst, z5, null), 3);
                        return zy11.a;
                    }
                    z3 = false;
                    a aVar52 = this.this$0;
                    aVar52.getClass();
                    arrayList2 = arrayList;
                    if (arrayList2 instanceof Collection) {
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    z4 = false;
                    tje.N(this.this$0.o(), null, null, new AnonymousClass2(z4, this.this$0, z3, arrayList, this.$skipFirst, z5, null), 3);
                    return zy11.a;
                }
                r14 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it5 = arrayList3.iterator();
                int i3 = 0;
                while (it5.hasNext()) {
                    Object next = it5.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    bcc0 bcc0Var = (bcc0) next;
                    dm80 dm80Var2 = bcc0Var.a;
                    if (i3 > 0 && ((dm80Var2 instanceof yl80) || (dm80Var2 instanceof xl80))) {
                        bcc0Var = bcc0.a(bcc0Var, PlacesNavigationEntry$Source.INTERNAL);
                    }
                    r14.add(bcc0Var);
                    i3 = i4;
                }
            }
        }
        arrayList = r14;
        if (arrayList.size() > 1) {
            aVar.y = true;
        }
        if (!arrayList.isEmpty()) {
        }
        z3 = false;
        a aVar522 = this.this$0;
        aVar522.getClass();
        arrayList2 = arrayList;
        if (arrayList2 instanceof Collection) {
        }
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        z4 = false;
        tje.N(this.this$0.o(), null, null, new AnonymousClass2(z4, this.this$0, z3, arrayList, this.$skipFirst, z5, null), 3);
        return zy11.a;
    }
}
