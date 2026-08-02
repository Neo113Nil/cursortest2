package com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder;

import android.graphics.drawable.BitmapDrawable;
import defpackage.bxv0;
import defpackage.i4h0;
import defpackage.lwv0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.mwv0;
import defpackage.nwv0;
import defpackage.ny61;
import defpackage.owv0;
import defpackage.pwv0;
import defpackage.qwv0;
import defpackage.rwv0;
import defpackage.sjh;
import defpackage.swv0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.SuperAppDiscoveryMapSearchItemViewHolder$bind$4", f = "SuperAppDiscoveryMapSearchItemViewHolder.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapSearchItemViewHolder$bind$4 extends SuspendLambda implements wls {
    final /* synthetic */ bxv0 $data;
    final /* synthetic */ ListItemComponent $typedView;
    int I$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchItemViewHolder$bind$4(bxv0 bxv0Var, ListItemComponent listItemComponent, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$data = bxv0Var;
        this.$typedView = listItemComponent;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapSearchItemViewHolder$bind$4(this.$data, this.$typedView, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapSearchItemViewHolder$bind$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var = zy11.a;
        if (i3 == 0) {
            kotlin.b.b(obj);
            bxv0 bxv0Var = this.$data;
            swv0 swv0Var = bxv0Var.d;
            if (swv0Var instanceof mwv0) {
                i = i4h0.super_app_discovery_map_search_organization_fallback_icon;
            } else if ((swv0Var instanceof owv0) || (swv0Var instanceof pwv0)) {
                i = i4h0.super_app_discovery_map_search_transport_fallback_icon;
            } else if (swv0Var instanceof nwv0) {
                i = i4h0.super_app_discovery_map_search_organizations_fallback_icon;
            } else if (swv0Var instanceof lwv0) {
                i = i4h0.super_app_discovery_map_search_organizations_fallback_icon;
            } else if ((swv0Var instanceof qwv0) || (swv0Var instanceof rwv0)) {
                i = i4h0.super_app_discovery_map_search_address_fallback_icon;
            } else {
                if (swv0Var != null) {
                    w511.b();
                    return null;
                }
                i = i4h0.super_app_discovery_map_search_organizations_fallback_icon;
            }
            if (bxv0Var.c == null) {
                this.$typedView.setLeadImage(tje.y(i, this.this$0.S.a));
                return zy11Var;
            }
            this.this$0.V.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            SuperAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1 superAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1 = new SuperAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1(this.this$0, this.$data, null);
            this.I$0 = i;
            this.label = 1;
            obj = tje.k0(mdhVar, superAppDiscoveryMapSearchItemViewHolder$bind$4$iconByTag$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            i2 = i;
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$0;
            kotlin.b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        ListItemComponent listItemComponent = this.$typedView;
        if (bitmapDrawable == null) {
            listItemComponent.setLeadImage(tje.y(i2, this.this$0.S.a));
            return zy11Var;
        }
        listItemComponent.setLeadImage(bitmapDrawable);
        return zy11Var;
    }
}
