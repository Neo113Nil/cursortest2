package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.coherent_selector;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector;
import defpackage.ibk0;
import defpackage.lck0;
import defpackage.ny61;
import defpackage.odk0;
import defpackage.pdk0;
import defpackage.w8i0;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class a implements lck0 {
    public final /* synthetic */ RideCardItemDto$CoherentRatingSelector a;
    public final /* synthetic */ odk0 b;

    public a(RideCardItemDto$CoherentRatingSelector rideCardItemDto$CoherentRatingSelector, odk0 odk0Var) {
        this.a = rideCardItemDto$CoherentRatingSelector;
        this.b = odk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // defpackage.lck0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, ibk0 ibk0Var, UiStateDrawableWrapper uiStateDrawableWrapper, w8i0 w8i0Var, Continuation continuation) {
        RideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1 rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1;
        CoroutineSingletons coroutineSingletons;
        int i2;
        String str;
        ibk0 ibk0Var2;
        UiStateDrawableWrapper uiStateDrawableWrapper2;
        w8i0 w8i0Var2;
        String str2;
        Object h;
        int i3;
        CharSequence charSequence;
        String str3;
        String str4;
        ibk0 ibk0Var3;
        UiStateDrawableWrapper uiStateDrawableWrapper3;
        w8i0 w8i0Var3;
        int i4 = i;
        if (continuation instanceof RideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1) {
            rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1 = (RideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1) continuation;
            int i5 = rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.label = i5 - Integer.MIN_VALUE;
                Object obj = rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.label;
                odk0 odk0Var = this.b;
                RideCardItemDto$CoherentRatingSelector rideCardItemDto$CoherentRatingSelector = this.a;
                if (i2 != 0) {
                    b.b(obj);
                    String str5 = rideCardItemDto$CoherentRatingSelector.a;
                    str = rideCardItemDto$CoherentRatingSelector.b;
                    List list = rideCardItemDto$CoherentRatingSelector.c;
                    ibk0Var2 = ibk0Var;
                    rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$0 = ibk0Var2;
                    uiStateDrawableWrapper2 = uiStateDrawableWrapper;
                    rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$1 = uiStateDrawableWrapper2;
                    w8i0Var2 = w8i0Var;
                    rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$2 = w8i0Var2;
                    rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$3 = str5;
                    rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$4 = str;
                    rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.I$0 = i4;
                    rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.label = 1;
                    Object h2 = odk0.h(odk0Var, list, i4, rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1);
                    if (h2 != coroutineSingletons) {
                        str2 = str5;
                        obj = h2;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.I$0;
                    CharSequence charSequence2 = (CharSequence) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$5;
                    String str6 = (String) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$4;
                    String str7 = (String) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$3;
                    w8i0 w8i0Var4 = (w8i0) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$2;
                    UiStateDrawableWrapper uiStateDrawableWrapper4 = (UiStateDrawableWrapper) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$1;
                    ibk0 ibk0Var4 = (ibk0) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$0;
                    b.b(obj);
                    i3 = i6;
                    charSequence = charSequence2;
                    ibk0Var3 = ibk0Var4;
                    str3 = str6;
                    str4 = str7;
                    w8i0Var3 = w8i0Var4;
                    uiStateDrawableWrapper3 = uiStateDrawableWrapper4;
                    return new pdk0(str4, str3, charSequence, (CharSequence) obj, i3, uiStateDrawableWrapper3, w8i0Var3, ibk0Var3);
                }
                i4 = rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.I$0;
                str = (String) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$4;
                str2 = (String) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$3;
                w8i0 w8i0Var5 = (w8i0) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$2;
                UiStateDrawableWrapper uiStateDrawableWrapper5 = (UiStateDrawableWrapper) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$1;
                ibk0 ibk0Var5 = (ibk0) rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$0;
                b.b(obj);
                uiStateDrawableWrapper2 = uiStateDrawableWrapper5;
                ibk0Var2 = ibk0Var5;
                w8i0Var2 = w8i0Var5;
                CharSequence charSequence3 = (CharSequence) obj;
                List list2 = rideCardItemDto$CoherentRatingSelector.d;
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$0 = ibk0Var2;
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$1 = uiStateDrawableWrapper2;
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$2 = w8i0Var2;
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$3 = str2;
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$4 = str;
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$5 = charSequence3;
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.I$0 = i4;
                rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.label = 2;
                h = odk0.h(odk0Var, list2, i4, rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1);
                if (h != coroutineSingletons) {
                    i3 = i4;
                    charSequence = charSequence3;
                    str3 = str;
                    str4 = str2;
                    ibk0Var3 = ibk0Var2;
                    uiStateDrawableWrapper3 = uiStateDrawableWrapper2;
                    w8i0Var3 = w8i0Var2;
                    obj = h;
                    return new pdk0(str4, str3, charSequence, (CharSequence) obj, i3, uiStateDrawableWrapper3, w8i0Var3, ibk0Var3);
                }
                return coroutineSingletons;
            }
        }
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1 = new RideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1(this, (ContinuationImpl) continuation);
        Object obj2 = rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.label;
        odk0 odk0Var2 = this.b;
        RideCardItemDto$CoherentRatingSelector rideCardItemDto$CoherentRatingSelector2 = this.a;
        if (i2 != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        List list22 = rideCardItemDto$CoherentRatingSelector2.d;
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$0 = ibk0Var2;
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$1 = uiStateDrawableWrapper2;
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$2 = w8i0Var2;
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$3 = str2;
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$4 = str;
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.L$5 = charSequence32;
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.I$0 = i4;
        rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1.label = 2;
        h = odk0.h(odk0Var2, list22, i4, rideCardCoherentRatingSelectorItemDataSource$stateFlow$2$provide$1);
        if (h != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
