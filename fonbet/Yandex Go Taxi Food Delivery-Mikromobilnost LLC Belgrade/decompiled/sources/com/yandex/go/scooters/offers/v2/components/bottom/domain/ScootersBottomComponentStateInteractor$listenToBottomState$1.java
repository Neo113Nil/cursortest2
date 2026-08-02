package com.yandex.go.scooters.offers.v2.components.bottom.domain;

import android.content.Context;
import com.yandex.go.scooters.offers.v2.data.model.ScootersBookState$Booking$Type;
import defpackage.a3n0;
import defpackage.bms;
import defpackage.h3n0;
import defpackage.hxo0;
import defpackage.i3n0;
import defpackage.k1b1;
import defpackage.k3n0;
import defpackage.kyh0;
import defpackage.m3n0;
import defpackage.mvg;
import defpackage.n3n0;
import defpackage.ny61;
import defpackage.o3n0;
import defpackage.q2n0;
import defpackage.q3n0;
import defpackage.r2n0;
import defpackage.r3n0;
import defpackage.s2n0;
import defpackage.t2n0;
import defpackage.u2n0;
import defpackage.v2n0;
import defpackage.w2n0;
import defpackage.w511;
import defpackage.w5n0;
import defpackage.x2n0;
import defpackage.x5n0;
import defpackage.y2n0;
import defpackage.y5n0;
import defpackage.z2n0;
import defpackage.z5n0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz5n0;", "offerCardState", "La3n0;", "bookState", "Lhxo0$a;", "promoblockState", "Lr3n0;", "<anonymous>", "(Lz5n0;La3n0;Lhxo0$a;)Lr3n0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.components.bottom.domain.ScootersBottomComponentStateInteractor$listenToBottomState$1", f = "ScootersBottomComponentStateInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersBottomComponentStateInteractor$listenToBottomState$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBottomComponentStateInteractor$listenToBottomState$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ScootersBottomComponentStateInteractor$listenToBottomState$1 scootersBottomComponentStateInteractor$listenToBottomState$1 = new ScootersBottomComponentStateInteractor$listenToBottomState$1(this.this$0, (Continuation) obj4);
        scootersBottomComponentStateInteractor$listenToBottomState$1.L$0 = (z5n0) obj;
        scootersBottomComponentStateInteractor$listenToBottomState$1.L$1 = (a3n0) obj2;
        scootersBottomComponentStateInteractor$listenToBottomState$1.L$2 = (hxo0.a) obj3;
        return scootersBottomComponentStateInteractor$listenToBottomState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object q3n0Var;
        z5n0 z5n0Var = (z5n0) this.L$0;
        a3n0 a3n0Var = (a3n0) this.L$1;
        hxo0.a aVar = (hxo0.a) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (!(a3n0Var instanceof s2n0)) {
                if (a3n0Var instanceof r2n0) {
                    a aVar2 = this.this$0;
                    ScootersBookState$Booking$Type scootersBookState$Booking$Type = ((r2n0) a3n0Var).a;
                    aVar2.getClass();
                    return scootersBookState$Booking$Type == ScootersBookState$Booking$Type.PACKAGE_PURCHASE ? aVar2.b() : new q3n0((String) null, 3);
                }
                if (!(a3n0Var instanceof t2n0) && !(a3n0Var instanceof z2n0)) {
                    if (a3n0Var instanceof q2n0) {
                        return new n3n0(((q2n0) a3n0Var).a);
                    }
                    if (!(a3n0Var instanceof y2n0)) {
                        w511.b();
                        return null;
                    }
                    a aVar3 = this.this$0;
                    x2n0 x2n0Var = ((y2n0) a3n0Var).a;
                    e eVar = aVar3.b;
                    Context context = aVar3.a;
                    if (x2n0Var.equals(v2n0.a)) {
                        return new q3n0(eVar.a.getString(kyh0.scooters_photo_verification_in_progress_title), i3n0.a);
                    }
                    if (x2n0Var instanceof u2n0) {
                        return new m3n0(k1b1.a(context, eVar.a.getString(kyh0.scooters_photo_verification_failed), eVar.a.getString(kyh0.try_again), false), new h3n0(((u2n0) x2n0Var).a));
                    }
                    if (x2n0Var instanceof w2n0) {
                        return new m3n0(k1b1.a(context, eVar.a.getString(kyh0.scooters_photo_verification_failed), eVar.a.getString(kyh0.scooters_photocontrol_verification_impossible_button_full_check), false), k3n0.a);
                    }
                    w511.b();
                    return null;
                }
                return this.this$0.b();
            }
            a aVar4 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            aVar4.getClass();
            if (z5n0Var instanceof y5n0) {
                q3n0Var = aVar4.a((y5n0) z5n0Var, aVar, this);
            } else if (z5n0Var instanceof w5n0) {
                q3n0Var = new o3n0(((w5n0) z5n0Var).a);
            } else {
                if (!(z5n0Var instanceof x5n0) && z5n0Var != null) {
                    w511.b();
                    return null;
                }
                q3n0Var = new q3n0(aVar4.b.a.getString(kyh0.scooters_card_button_on_loading), 2);
            }
            obj = q3n0Var;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (r3n0) obj;
    }
}
