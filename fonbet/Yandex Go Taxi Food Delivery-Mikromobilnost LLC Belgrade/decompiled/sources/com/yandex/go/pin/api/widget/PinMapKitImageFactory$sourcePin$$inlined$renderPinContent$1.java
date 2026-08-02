package com.yandex.go.pin.api.widget;

import android.graphics.PointF;
import android.graphics.Rect;
import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.pin.api.v2.d;
import defpackage.agh0;
import defpackage.bl00;
import defpackage.ewb0;
import defpackage.get0;
import defpackage.i1c0;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.r0c0;
import defpackage.sq00;
import defpackage.tm91;
import defpackage.tse;
import defpackage.wls;
import defpackage.z0c0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.api.widget.PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1", f = "PinMapKitImageFactory.kt", l = {274}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1 extends SuspendLambda implements wls {
    final /* synthetic */ ewb0 $holder;
    final /* synthetic */ sq00 $pinInfo$inlined;
    final /* synthetic */ sq00 $pinInfo$inlined$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1(ewb0 ewb0Var, Continuation continuation, b bVar, sq00 sq00Var, sq00 sq00Var2) {
        super(2, continuation);
        this.$holder = ewb0Var;
        this.this$0 = bVar;
        this.$pinInfo$inlined = sq00Var;
        this.$pinInfo$inlined$1 = sq00Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1(this.$holder, continuation, this.this$0, this.$pinInfo$inlined, this.$pinInfo$inlined$1);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i1c0 a;
        PinV2Component pinV2Component;
        PinV2Component pinV2Component2;
        PinV2Component.Position position;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ewb0 ewb0Var = this.$holder;
            PinV1Component pinV1Component = ewb0Var.a;
            if (pinV1Component != null) {
                b bVar = this.this$0;
                Integer num = this.$pinInfo$inlined.d;
                CharSequence a2 = bVar.f.a(num == null ? "" : num.intValue() <= 0 ? "—" : String.valueOf(num.intValue()));
                r0c0 r0c0Var = this.this$0.e;
                p0c0 p0c0Var = this.$pinInfo$inlined.a;
                r0c0Var.getClass();
                z0c0 e = r0c0.e(true, p0c0Var);
                if (e == null) {
                    e = this.this$0.e.g();
                }
                return tm91.c(pinV1Component, e, this.$pinInfo$inlined.c, a2.length() == 0 ? Pin$State.IDLE : Pin$State.TEXT, null, a2);
            }
            PinV2Component pinV2Component3 = ewb0Var.b;
            if (pinV2Component3 == null) {
                ny61.r("Missing pin render");
                return null;
            }
            i1c0 f = this.this$0.e.f(this.$pinInfo$inlined$1.a);
            if (f == null) {
                f = this.this$0.e.i();
            }
            i1c0 i1c0Var = f;
            sq00 sq00Var = this.$pinInfo$inlined$1;
            a = i1c0.a(i1c0Var, 0, 0, sq00Var.k, sq00Var.l, 3);
            sq00 sq00Var2 = this.$pinInfo$inlined$1;
            PinV2Component.Position position2 = sq00Var2.c ? PinV2Component.Position.ANCHORED : PinV2Component.Position.DEFAULT;
            b bVar2 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = pinV2Component3;
            this.L$3 = null;
            this.L$4 = position2;
            this.L$5 = a;
            this.L$6 = pinV2Component3;
            this.label = 1;
            Object a3 = b.a(bVar2, sq00Var2, true, this);
            if (a3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            pinV2Component = pinV2Component3;
            pinV2Component2 = pinV2Component;
            obj = a3;
            position = position2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pinV2Component = (PinV2Component) this.L$6;
            a = (i1c0) this.L$5;
            position = (PinV2Component.Position) this.L$4;
            pinV2Component2 = (PinV2Component) this.L$2;
            kotlin.b.b(obj);
        }
        bl00 a4 = d.a(pinV2Component, a, position, (SourceOnMapControl.a) obj);
        if (this.$pinInfo$inlined$1.j != null) {
            get0 get0Var = (get0) this.this$0.g.get();
            PointF anchor = a4.b.getAnchor();
            if (anchor == null) {
                anchor = new PointF();
            }
            int i2 = agh0.source_on_map_accept_trail_button;
            get0Var.getClass();
            i3y i3yVar = get0Var.b;
            i3y i3yVar2 = get0Var.a;
            i3y i3yVar3 = get0Var.e;
            Rect b = get0.b(pinV2Component2, i2);
            if (b != null) {
                ((Rect) i3yVar2.getValue()).set(b);
                Rect b2 = get0.b(pinV2Component2, agh0.source_on_map_decline_trail_button);
                if (b2 != null) {
                    ((Rect) i3yVar.getValue()).set(b2);
                    pinV2Component2.getGlobalVisibleRect((Rect) i3yVar3.getValue());
                    ((PointF) get0Var.c.getValue()).set(get0.a((Rect) i3yVar3.getValue(), anchor, (Rect) i3yVar2.getValue()));
                    ((PointF) get0Var.d.getValue()).set(get0.a((Rect) i3yVar3.getValue(), anchor, (Rect) i3yVar.getValue()));
                }
            }
        }
        return a4;
    }
}
