package com.yandex.go.address.address_map_picker.domain;

import defpackage.bc1;
import defpackage.bp0;
import defpackage.jl40;
import defpackage.k56;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u6r;
import defpackage.utd0;
import defpackage.v6r;
import defpackage.wls;
import defpackage.xp0;
import defpackage.xtd0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.address.clarification.UpdateReason;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbc1;", Constants.KEY_DATA, "Lzy11;", "<anonymous>", "(Lbc1;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerDrumsAnalyticsInteractor$observe$1", f = "AddressMapPickerDrumsAnalyticsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerDrumsAnalyticsInteractor$observe$1 extends SuspendLambda implements wls {
    final /* synthetic */ xp0 $source;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerDrumsAnalyticsInteractor$observe$1(d dVar, xp0 xp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$source = xp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapPickerDrumsAnalyticsInteractor$observe$1 addressMapPickerDrumsAnalyticsInteractor$observe$1 = new AddressMapPickerDrumsAnalyticsInteractor$observe$1(this.this$0, this.$source, continuation);
        addressMapPickerDrumsAnalyticsInteractor$observe$1.L$0 = obj;
        return addressMapPickerDrumsAnalyticsInteractor$observe$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapPickerDrumsAnalyticsInteractor$observe$1 addressMapPickerDrumsAnalyticsInteractor$observe$1 = (AddressMapPickerDrumsAnalyticsInteractor$observe$1) create((bc1) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapPickerDrumsAnalyticsInteractor$observe$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u6r u6rVar;
        k56 k56Var;
        bc1 bc1Var = (bc1) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean l = jl40.l(bc1Var, bc1.g);
        zy11 zy11Var = zy11.a;
        if (l) {
            bp0 bp0Var = this.this$0.a;
            xp0 xp0Var = this.$source;
            if (bp0Var.c.length() > 0) {
                bp0Var.a("RestrictedAreaPopup.MovePinOutOfArea", false, xp0Var, bp0Var.c, null);
                bp0Var.b(xp0Var, bp0Var.c);
                bp0Var.c = "";
                bp0Var.b = null;
                return zy11Var;
            }
        } else {
            v6r a = bc1Var.a();
            String str = (a == null || (u6rVar = a.a) == null || (k56Var = u6rVar.e) == null) ? null : k56Var.d;
            String str2 = str == null ? "" : str;
            utd0 utd0Var = bc1Var.a.d;
            Object S = kotlin.collections.a.S(utd0Var.a, utd0Var.b);
            xtd0 xtd0Var = S instanceof xtd0 ? (xtd0) S : null;
            String str3 = xtd0Var != null ? xtd0Var.e : null;
            bp0 bp0Var2 = this.this$0.a;
            xp0 xp0Var2 = this.$source;
            String str4 = bc1Var.f;
            UpdateReason updateReason = bc1Var.b;
            if (!bp0Var2.c.equals(str2)) {
                if (bp0Var2.c.length() > 0) {
                    bp0Var2.b(xp0Var2, bp0Var2.c);
                }
                bp0Var2.c = str2;
                bp0Var2.b = str3;
                bp0Var2.a("RestrictedAreaPopup.Shown", true, xp0Var2, str2, str4);
                return zy11Var;
            }
            if (updateReason == UpdateReason.NEW_FINAL_SUGGEST) {
                bp0Var2.a("RestrictedAreaPopup.MovePinInsideOfArea", false, xp0Var2, bp0Var2.c, null);
            }
        }
        return zy11Var;
    }
}
