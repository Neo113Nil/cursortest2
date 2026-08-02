package com.yandex.go.places.impl.navigation.discovery.map;

import com.yandex.go.places.impl.navigation.common.base.c;
import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.places.impl.navigation.discovery.map.a;
import com.yandex.go.places.impl.ui.organizations.OrganizationsModalView;
import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;
import defpackage.b7c0;
import defpackage.kn80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tse;
import defpackage.u3m;
import defpackage.u9c0;
import defpackage.w511;
import defpackage.wls;
import defpackage.ww90;
import defpackage.yl80;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.discovery.map.PlacesDiscoveryMapOverlayRouterImpl$openOrganizationsList$1", f = "PlacesDiscoveryMapOverlayRouterImpl.kt", l = {417, NetworkRequestException.TOO_MANY_REQUESTS}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesDiscoveryMapOverlayRouterImpl$openOrganizationsList$1 extends SuspendLambda implements wls {
    final /* synthetic */ yl80 $payload;
    final /* synthetic */ PlacesNavigationEntry$Source $source;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesDiscoveryMapOverlayRouterImpl$openOrganizationsList$1(PlacesNavigationEntry$Source placesNavigationEntry$Source, a aVar, yl80 yl80Var, Continuation continuation) {
        super(2, continuation);
        this.$source = placesNavigationEntry$Source;
        this.this$0 = aVar;
        this.$payload = yl80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesDiscoveryMapOverlayRouterImpl$openOrganizationsList$1(this.$source, this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesDiscoveryMapOverlayRouterImpl$openOrganizationsList$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r6 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r6 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            b.b(obj);
            int i3 = b7c0.a[this.$source.ordinal()];
            if (i3 == 1) {
                a aVar = this.this$0;
                yl80 yl80Var = this.$payload;
                ww90 ww90Var = new ww90(25, aVar, yl80Var);
                this.label = 1;
                obj = aVar.f0(yl80Var, true, ww90Var, this);
            } else {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                kn80 kn80Var = this.this$0.E;
                this.label = 2;
                obj = kn80Var.a.b(u9c0.b, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            b.b(obj);
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            u3m u3mVar = (u3m) obj;
            a aVar2 = this.this$0;
            if (u3mVar != null) {
                a.j0(aVar2, qoi0.a(OrganizationsListV2ModalView.class));
                c a0 = this.this$0.a0();
                final yl80 yl80Var2 = this.$payload;
                final a aVar3 = this.this$0;
                final int i4 = 0;
                a0.d(yl80Var2, true, new sls() { // from class: a7c0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        Object value;
                        ArrayList arrayList;
                        Object value2;
                        ArrayList arrayList2;
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        yl80 yl80Var3 = yl80Var2;
                        a aVar4 = aVar3;
                        switch (i5) {
                            case 0:
                                r0 r0Var = aVar4.V.a;
                                do {
                                    value = r0Var.getValue();
                                    arrayList = new ArrayList();
                                    for (Object obj2 : (List) value) {
                                        if (!jl40.l(((bcc0) obj2).a, yl80Var3)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                } while (!r0Var.k(value, arrayList));
                                a.i0(aVar4, qoi0.a(OrganizationsListV2ModalView.class));
                                break;
                            default:
                                r0 r0Var2 = aVar4.V.a;
                                do {
                                    value2 = r0Var2.getValue();
                                    arrayList2 = new ArrayList();
                                    for (Object obj3 : (List) value2) {
                                        if (!jl40.l(((bcc0) obj3).a, yl80Var3)) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                } while (!r0Var2.k(value2, arrayList2));
                                a.i0(aVar4, qoi0.a(OrganizationsModalView.class));
                                break;
                        }
                        return zy11Var;
                    }
                });
            } else {
                a.j0(aVar2, qoi0.a(OrganizationsModalView.class));
                c a02 = this.this$0.a0();
                final yl80 yl80Var3 = this.$payload;
                final a aVar4 = this.this$0;
                a02.d(yl80Var3, true, new sls() { // from class: a7c0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        Object value;
                        ArrayList arrayList;
                        Object value2;
                        ArrayList arrayList2;
                        int i5 = i2;
                        zy11 zy11Var = zy11.a;
                        yl80 yl80Var32 = yl80Var3;
                        a aVar42 = aVar4;
                        switch (i5) {
                            case 0:
                                r0 r0Var = aVar42.V.a;
                                do {
                                    value = r0Var.getValue();
                                    arrayList = new ArrayList();
                                    for (Object obj2 : (List) value) {
                                        if (!jl40.l(((bcc0) obj2).a, yl80Var32)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                } while (!r0Var.k(value, arrayList));
                                a.i0(aVar42, qoi0.a(OrganizationsListV2ModalView.class));
                                break;
                            default:
                                r0 r0Var2 = aVar42.V.a;
                                do {
                                    value2 = r0Var2.getValue();
                                    arrayList2 = new ArrayList();
                                    for (Object obj3 : (List) value2) {
                                        if (!jl40.l(((bcc0) obj3).a, yl80Var32)) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                } while (!r0Var2.k(value2, arrayList2));
                                a.i0(aVar42, qoi0.a(OrganizationsModalView.class));
                                break;
                        }
                        return zy11Var;
                    }
                });
            }
        }
        return zy11.a;
    }
}
