package com.yandex.go.taxi.order.details.v2.state.elements.slider;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Slider;
import defpackage.bvf0;
import defpackage.ink0;
import defpackage.jgv;
import defpackage.ny61;
import defpackage.sqs0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final jgv a;
    public final e b;
    public final c c;
    public final sqs0 d;

    public a(jgv jgvVar, e eVar, c cVar, sqs0 sqs0Var) {
        this.a = jgvVar;
        this.b = eVar;
        this.c = cVar;
        this.d = sqs0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r15 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardItemDto$Slider.StateInfo.State state, ContinuationImpl continuationImpl) {
        RideCardSliderItemDataSource$mapState$1 rideCardSliderItemDataSource$mapState$1;
        int i;
        RideCardItemDto$Slider.StateInfo.State state2;
        CharSequence charSequence;
        FormattedText formattedText;
        RideCardItemDto$Slider.StateInfo.State state3;
        CharSequence charSequence2;
        String a;
        CharSequence charSequence3;
        CharSequence charSequence4;
        BitmapDrawable bitmapDrawable;
        CharSequence charSequence5;
        if (continuationImpl instanceof RideCardSliderItemDataSource$mapState$1) {
            rideCardSliderItemDataSource$mapState$1 = (RideCardSliderItemDataSource$mapState$1) continuationImpl;
            int i2 = rideCardSliderItemDataSource$mapState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardSliderItemDataSource$mapState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardSliderItemDataSource$mapState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardSliderItemDataSource$mapState$1.label;
                e eVar = this.b;
                c cVar = this.c;
                BitmapDrawable bitmapDrawable2 = null;
                if (i != 0) {
                    b.b(obj);
                    FormattedText formattedText2 = state.b;
                    if (formattedText2 == null) {
                        state2 = state;
                        charSequence = null;
                        formattedText = state2.c;
                        if (formattedText == null) {
                            state3 = state2;
                            charSequence2 = null;
                            a = this.a.a(state3.d);
                            if (a != null) {
                            }
                            return new ink0(charSequence, charSequence2, bitmapDrawable2);
                        }
                        rideCardSliderItemDataSource$mapState$1.L$0 = state2;
                        rideCardSliderItemDataSource$mapState$1.L$1 = charSequence;
                        rideCardSliderItemDataSource$mapState$1.L$2 = null;
                        rideCardSliderItemDataSource$mapState$1.label = 2;
                        Object i3 = c.i(cVar, formattedText, null, rideCardSliderItemDataSource$mapState$1, 30);
                        if (i3 != coroutineSingletons) {
                            state3 = state2;
                            obj = i3;
                            charSequence2 = (CharSequence) obj;
                            a = this.a.a(state3.d);
                            if (a != null) {
                            }
                            return new ink0(charSequence, charSequence2, bitmapDrawable2);
                        }
                        return coroutineSingletons;
                    }
                    rideCardSliderItemDataSource$mapState$1.L$0 = state;
                    rideCardSliderItemDataSource$mapState$1.L$1 = null;
                    rideCardSliderItemDataSource$mapState$1.label = 1;
                    obj = c.i(cVar, formattedText2, null, rideCardSliderItemDataSource$mapState$1, 30);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence = (CharSequence) rideCardSliderItemDataSource$mapState$1.L$1;
                            state3 = (RideCardItemDto$Slider.StateInfo.State) rideCardSliderItemDataSource$mapState$1.L$0;
                            b.b(obj);
                            charSequence2 = (CharSequence) obj;
                            a = this.a.a(state3.d);
                            if (a != null) {
                                rideCardSliderItemDataSource$mapState$1.L$0 = null;
                                rideCardSliderItemDataSource$mapState$1.L$1 = charSequence;
                                rideCardSliderItemDataSource$mapState$1.L$2 = charSequence2;
                                rideCardSliderItemDataSource$mapState$1.L$3 = null;
                                rideCardSliderItemDataSource$mapState$1.L$4 = a;
                                rideCardSliderItemDataSource$mapState$1.label = 3;
                                Object o = e.o(eVar, a, null, rideCardSliderItemDataSource$mapState$1, 14);
                                if (o != coroutineSingletons) {
                                    charSequence3 = charSequence;
                                    charSequence4 = charSequence2;
                                    obj = o;
                                    bitmapDrawable = (BitmapDrawable) obj;
                                    if (bitmapDrawable == null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            return new ink0(charSequence, charSequence2, bitmapDrawable2);
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence5 = (CharSequence) rideCardSliderItemDataSource$mapState$1.L$2;
                            charSequence = (CharSequence) rideCardSliderItemDataSource$mapState$1.L$1;
                            b.b(obj);
                            bitmapDrawable2 = (BitmapDrawable) obj;
                            charSequence2 = charSequence5;
                            return new ink0(charSequence, charSequence2, bitmapDrawable2);
                        }
                        a = (String) rideCardSliderItemDataSource$mapState$1.L$4;
                        charSequence4 = (CharSequence) rideCardSliderItemDataSource$mapState$1.L$2;
                        charSequence3 = (CharSequence) rideCardSliderItemDataSource$mapState$1.L$1;
                        b.b(obj);
                        bitmapDrawable = (BitmapDrawable) obj;
                        if (bitmapDrawable == null) {
                            bitmapDrawable2 = bitmapDrawable;
                            charSequence2 = charSequence4;
                            charSequence = charSequence3;
                            return new ink0(charSequence, charSequence2, bitmapDrawable2);
                        }
                        rideCardSliderItemDataSource$mapState$1.L$0 = null;
                        rideCardSliderItemDataSource$mapState$1.L$1 = charSequence3;
                        rideCardSliderItemDataSource$mapState$1.L$2 = charSequence4;
                        rideCardSliderItemDataSource$mapState$1.L$3 = null;
                        rideCardSliderItemDataSource$mapState$1.L$4 = null;
                        rideCardSliderItemDataSource$mapState$1.label = 4;
                        obj = e.k(eVar, a, null, rideCardSliderItemDataSource$mapState$1, 14);
                        if (obj != coroutineSingletons) {
                            charSequence5 = charSequence4;
                            charSequence = charSequence3;
                            bitmapDrawable2 = (BitmapDrawable) obj;
                            charSequence2 = charSequence5;
                            return new ink0(charSequence, charSequence2, bitmapDrawable2);
                        }
                        return coroutineSingletons;
                    }
                    state = (RideCardItemDto$Slider.StateInfo.State) rideCardSliderItemDataSource$mapState$1.L$0;
                    b.b(obj);
                }
                CharSequence charSequence6 = (CharSequence) obj;
                state2 = state;
                charSequence = charSequence6;
                formattedText = state2.c;
                if (formattedText == null) {
                }
            }
        }
        rideCardSliderItemDataSource$mapState$1 = new RideCardSliderItemDataSource$mapState$1(this, continuationImpl);
        Object obj2 = rideCardSliderItemDataSource$mapState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardSliderItemDataSource$mapState$1.label;
        e eVar2 = this.b;
        c cVar2 = this.c;
        BitmapDrawable bitmapDrawable22 = null;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj2;
        state2 = state;
        charSequence = charSequence62;
        formattedText = state2.c;
        if (formattedText == null) {
        }
    }

    public final Object b(RideCardItemDto$Slider rideCardItemDto$Slider, SuspendLambda suspendLambda) {
        return bvf0.n(new RideCardSliderItemDataSource$stateFlow$2(this, rideCardItemDto$Slider, null), suspendLambda);
    }
}
