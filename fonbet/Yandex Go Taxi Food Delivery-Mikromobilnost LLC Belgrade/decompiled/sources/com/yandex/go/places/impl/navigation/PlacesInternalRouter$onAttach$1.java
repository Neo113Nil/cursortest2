package com.yandex.go.places.impl.navigation;

import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import defpackage.a5g;
import defpackage.bcc0;
import defpackage.dm80;
import defpackage.ftj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.vl80;
import defpackage.xl80;
import defpackage.yl80;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "La5g;", "component", "Lzy11;", "<anonymous>", "(Ltse;La5g;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.PlacesInternalRouter$onAttach$1", f = "PlacesInternalRouter.kt", l = {169, 179}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesInternalRouter$onAttach$1 extends SuspendLambda implements zls {
    final /* synthetic */ dm80 $payload;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesInternalRouter$onAttach$1(d dVar, dm80 dm80Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
        this.$payload = dm80Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlacesInternalRouter$onAttach$1 placesInternalRouter$onAttach$1 = new PlacesInternalRouter$onAttach$1(this.this$0, this.$payload, (Continuation) obj3);
        placesInternalRouter$onAttach$1.L$0 = (a5g) obj2;
        return placesInternalRouter$onAttach$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (com.yandex.go.places.impl.navigation.d.k0(r12, r0, false, r11) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x013c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        if (r0.b(r12, r11) == r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.yandex.go.places.impl.navigation.common.stack.a] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        com.yandex.go.places.impl.navigation.map.listener.a aVar;
        a5g a5gVar = (a5g) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z2 = true;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.t0 = (com.yandex.go.places.map.ui.overlay.a) a5gVar.b1.get();
            String str = this.this$0.s0;
            if (str != null) {
                ((ftj) a5gVar.s.get()).e = str;
            }
            ?? r12 = (List) this.this$0.V.a.getValue();
            int i2 = 0;
            if (r12.isEmpty()) {
                d dVar = this.this$0;
                dm80 dm80Var = this.$payload;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
            } else {
                if (r12.size() > 1 && (((bcc0) kotlin.collections.a.P(r12)).a instanceof vl80) && (aVar = a5gVar.e().c) != null) {
                    aVar.y = true;
                }
                this.this$0.V.a();
                this.this$0.V.b((bcc0) kotlin.collections.a.P(r12));
                ?? r0 = (com.yandex.go.places.impl.navigation.common.stack.a) this.this$0.u0.getValue();
                Iterable iterable = (Iterable) r12;
                List J = kotlin.collections.a.J(iterable, 1);
                boolean z3 = J instanceof Collection;
                if (!z3 || !J.isEmpty()) {
                    Iterator it = J.iterator();
                    while (it.hasNext()) {
                        if (((bcc0) it.next()).a instanceof yl80) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z3 || !J.isEmpty()) {
                    Iterator it2 = J.iterator();
                    while (it2.hasNext()) {
                        if (((bcc0) it2.next()).a instanceof xl80) {
                            break;
                        }
                    }
                }
                z2 = false;
                if (z && z2) {
                    r12 = new ArrayList(tcc.n(iterable, 10));
                    for (Object obj2 : iterable) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        bcc0 bcc0Var = (bcc0) obj2;
                        dm80 dm80Var2 = bcc0Var.a;
                        if (i2 > 0 && ((dm80Var2 instanceof yl80) || (dm80Var2 instanceof xl80))) {
                            bcc0Var = bcc0.a(bcc0Var, PlacesNavigationEntry$Source.INTERNAL);
                        }
                        r12.add(bcc0Var);
                        i2 = i3;
                    }
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
