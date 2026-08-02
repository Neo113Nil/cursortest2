package com.yandex.go.taxi.order.search.factory;

import com.yandex.go.coroutines.h;
import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.taxi.order.search.polling.model.ETA;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.a0c0;
import defpackage.ewb0;
import defpackage.f0c0;
import defpackage.i1c0;
import defpackage.mvg;
import defpackage.n380;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.r0c0;
import defpackage.tse;
import defpackage.wls;
import defpackage.z0c0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/view/ViewGroup;", "<anonymous>", "(Ltse;)Landroid/view/ViewGroup;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.factory.SearchMapPinFactory$createPinView$2", f = "SearchMapPinFactory.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchMapPinFactory$createPinView$2 extends SuspendLambda implements wls {
    final /* synthetic */ p0c0 $pinStyle;
    final /* synthetic */ n380 $pinV2State;
    final /* synthetic */ SearchState $state;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMapPinFactory$createPinView$2(SearchState searchState, a aVar, p0c0 p0c0Var, n380 n380Var, Continuation continuation) {
        super(2, continuation);
        this.$state = searchState;
        this.this$0 = aVar;
        this.$pinStyle = p0c0Var;
        this.$pinV2State = n380Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchMapPinFactory$createPinView$2(this.$state, this.this$0, this.$pinStyle, this.$pinV2State, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchMapPinFactory$createPinView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if (r4 == null) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        f0c0 h;
        i1c0 i;
        ETA eta;
        z0c0 g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            if (this.$state.h) {
                h hVar = this.this$0.e;
                this.label = 1;
                a = hVar.a(this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a = obj;
        ewb0 ewb0Var = (ewb0) a;
        a aVar = this.this$0;
        PinV1Component pinV1Component = ewb0Var.a;
        SearchState searchState = this.$state;
        p0c0 p0c0Var = this.$pinStyle;
        aVar.getClass();
        if (pinV1Component != null) {
            pinV1Component.setAnchored(true, false);
            pinV1Component.setState(Pin$State.TEXT, false);
            r0c0 r0c0Var = aVar.c;
            if (p0c0Var != null) {
                r0c0Var.getClass();
                g = r0c0.e(true, p0c0Var);
            }
            g = r0c0Var.g();
            pinV1Component.setPinV1Style(g);
            ETA eta2 = searchState.g;
            pinV1Component.setPinText(aVar.a.a(eta2 != null ? String.valueOf(Integer.valueOf(eta2.a())) : "1"));
        } else {
            pinV1Component = null;
        }
        if (pinV1Component != null) {
            return pinV1Component;
        }
        a aVar2 = this.this$0;
        PinV2Component pinV2Component = ewb0Var.b;
        SearchState searchState2 = this.$state;
        p0c0 p0c0Var2 = this.$pinStyle;
        n380 n380Var = this.$pinV2State;
        r0c0 r0c0Var2 = aVar2.c;
        if (pinV2Component != null) {
            if (searchState2.q || (eta = searchState2.g) == null) {
                h = r0c0Var2.h();
            } else {
                int a2 = eta.a();
                h = a2 <= 0 ? a0c0.c : new a0c0(String.valueOf(a2), Integer.valueOf(a2));
            }
            pinV2Component.updateControlState(new SourceOnMapControl.a(h, n380Var.b, n380Var.a, n380Var.d, n380Var.c, null, null, 1968));
            if (p0c0Var2 == null || (i = r0c0Var2.f(p0c0Var2)) == null) {
                i = r0c0Var2.i();
            }
            pinV2Component.updateControlStyle(i);
            pinV2Component.updatePosition(PinV2Component.Position.ANCHORED, false);
            return pinV2Component;
        }
        return null;
    }
}
