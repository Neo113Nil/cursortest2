package com.yandex.go.places.impl.navigation.discovery.map;

import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.OrganizationCardFlexModalView;
import defpackage.je80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tdc0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.ww90;
import defpackage.xl80;
import defpackage.xw90;
import defpackage.z6c0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.discovery.map.PlacesDiscoveryMapOverlayRouterImpl$openOrganizationCard$1", f = "PlacesDiscoveryMapOverlayRouterImpl.kt", l = {466}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesDiscoveryMapOverlayRouterImpl$openOrganizationCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isPayloadUpdating;
    final /* synthetic */ xl80 $organizationCardPayload;
    final /* synthetic */ PlacesNavigationEntry$Source $source;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesDiscoveryMapOverlayRouterImpl$openOrganizationCard$1(a aVar, xl80 xl80Var, PlacesNavigationEntry$Source placesNavigationEntry$Source, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$organizationCardPayload = xl80Var;
        this.$source = placesNavigationEntry$Source;
        this.$isPayloadUpdating = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesDiscoveryMapOverlayRouterImpl$openOrganizationCard$1(this.this$0, this.$organizationCardPayload, this.$source, this.$isPayloadUpdating, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesDiscoveryMapOverlayRouterImpl$openOrganizationCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        xl80 xl80Var;
        tdc0 tdc0Var;
        Object E;
        xl80 xl80Var2;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            a aVar = this.this$0;
            xl80 xl80Var3 = this.$organizationCardPayload;
            aVar.getClass();
            je80 je80Var = xl80Var3.i;
            if (je80Var == null) {
                je80Var = je80.u;
            }
            obj2 = null;
            xl80 xl80Var4 = new xl80(xl80Var3.a, xl80Var3.c, xl80Var3.b, xl80Var3.d, xl80Var3.e, xl80Var3.f, xl80Var3.g, xl80Var3.h, new je80(je80Var.a, je80Var.b, je80Var.c, je80Var.d, true, false, je80Var.g, je80Var.h, je80Var.i, je80Var.j, je80Var.k, je80Var.l, je80Var.m, je80Var.n, je80Var.o, je80Var.p, je80Var.q, je80Var.r, je80Var.s, je80Var.t), xl80Var3.j, xl80Var3.k, xl80Var3.l, xl80Var3.m);
            boolean p0 = this.this$0.p0(xl80Var4);
            if (!p0 || (tdc0Var = this.this$0.r0) == null) {
                xl80Var = xl80Var4;
                a.j0(this.this$0, qoi0.a(OrganizationCardFlexModalView.class));
                i = z6c0.a[this.$source.ordinal()];
                if (i != 1) {
                    this.this$0.a0().c(xl80Var, true, this.$isPayloadUpdating, new xw90(21, this.this$0, xl80Var));
                } else {
                    if (i != 2) {
                        w511.b();
                        return obj2;
                    }
                    a aVar2 = this.this$0;
                    aVar2.e0(xl80Var, true, new ww90(24, aVar2, xl80Var));
                }
                return zy11.a;
            }
            this.L$0 = xl80Var4;
            this.Z$0 = p0;
            this.label = 1;
            E = tdc0Var.b.E(this);
            if (E == coroutineSingletons) {
                return coroutineSingletons;
            }
            xl80Var2 = xl80Var4;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xl80Var2 = (xl80) this.L$0;
            b.b(obj);
            E = obj;
            obj2 = null;
        }
        xl80Var = xl80Var2;
        a.j0(this.this$0, qoi0.a(OrganizationCardFlexModalView.class));
        i = z6c0.a[this.$source.ordinal()];
        if (i != 1) {
        }
        return zy11.a;
    }
}
