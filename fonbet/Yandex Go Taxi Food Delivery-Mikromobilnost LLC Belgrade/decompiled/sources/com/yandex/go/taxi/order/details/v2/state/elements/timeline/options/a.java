package com.yandex.go.taxi.order.details.v2.state.elements.timeline.options;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.e;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$AdditionalOrderOptionState;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOptionsInfo;
import com.yandex.go.taxi.order.models.api.response.n8;
import com.yandex.go.taxi.order.models.api.response.o8;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.timer.k;
import defpackage.akk0;
import defpackage.crg;
import defpackage.d9k0;
import defpackage.e9k0;
import defpackage.g92;
import defpackage.gwk0;
import defpackage.ibk0;
import defpackage.ief;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mok0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pok0;
import defpackage.qzo;
import defpackage.rok0;
import defpackage.tpr;
import defpackage.w511;
import defpackage.xdf;
import defpackage.xv21;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class a {
    public final c a;
    public final xdf b;
    public final k7x0 c;
    public final k d;
    public final crg e;
    public final mok0 f;
    public final o2y0 g;

    public a(c cVar, xdf xdfVar, k7x0 k7x0Var, k kVar, crg crgVar, mok0 mok0Var, o2y0 o2y0Var) {
        this.a = cVar;
        this.b = xdfVar;
        this.c = k7x0Var;
        this.d = kVar;
        this.e = crgVar;
        this.f = mok0Var;
        this.g = o2y0Var;
    }

    public final tpr a(TimelineAdditionalOrderOptionsInfo timelineAdditionalOrderOptionsInfo, List list) {
        tpr g92Var;
        tpr I;
        if (timelineAdditionalOrderOptionsInfo == null) {
            return new g92(2, null);
        }
        List<e> list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (e eVar : list2) {
                if (eVar.getB() == ChangeOrderState$Source.DUE || eVar.getB() == ChangeOrderState$Source.ADDITIONAL_PAYMENT) {
                    z = true;
                    break;
                }
            }
        }
        g I2 = kotlinx.coroutines.flow.e.I(this.f.b, new RideCardTimelineOptionsMapper$orderOptionsFlow$1(timelineAdditionalOrderOptionsInfo.a, this, z, null));
        o8 o8Var = timelineAdditionalOrderOptionsInfo.b;
        if (o8Var == null) {
            I = new g92(2, null);
        } else {
            if (o8Var instanceof TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton) {
                TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton.AdditionalOrderOptionButton additionalOrderOptionButton = ((TimelineAdditionalOrderOptionButtons$SingleAdditionalOrderOptionButton) o8Var).a;
                RideCardTimerDto rideCardTimerDto = additionalOrderOptionButton.d;
                Date c = this.e.c(rideCardTimerDto != null ? rideCardTimerDto.b : null);
                Long valueOf = c != null ? Long.valueOf(c.getTime()) : null;
                RideCardTimerDto rideCardTimerDto2 = additionalOrderOptionButton.d;
                RideCardTimerDto.TimerType timerType = rideCardTimerDto2 != null ? rideCardTimerDto2.a : null;
                if (timerType == null || valueOf == null) {
                    String str = additionalOrderOptionButton.b;
                    g92Var = new g92(2, new pok0(str, str));
                } else {
                    g92Var = kotlinx.coroutines.flow.e.I(this.d.c(qzo.a(timerType), valueOf.longValue()), new RideCardTimelineOptionsMapper$buttonTitleFlow$1(o8Var, this, null));
                }
            } else {
                if (!(o8Var instanceof n8)) {
                    w511.b();
                    return null;
                }
                g92Var = new g92(2, null);
            }
            I = kotlinx.coroutines.flow.e.I(g92Var, new RideCardTimelineOptionsMapper$additionalOrderOptionButtons$1(z, null));
        }
        return new m0(I2, I, new RideCardTimelineOptionsMapper$mapAdditionalOrderOptionsInfo$1(3, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption, rok0 rok0Var, boolean z, ContinuationImpl continuationImpl) {
        RideCardTimelineOptionsMapper$mapChangeDueOption$1 rideCardTimelineOptionsMapper$mapChangeDueOption$1;
        int i;
        TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2;
        int i2;
        boolean z2;
        ibk0 ibk0Var;
        FormattedText formattedText;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption3;
        Calendar n;
        Date time;
        if (continuationImpl instanceof RideCardTimelineOptionsMapper$mapChangeDueOption$1) {
            rideCardTimelineOptionsMapper$mapChangeDueOption$1 = (RideCardTimelineOptionsMapper$mapChangeDueOption$1) continuationImpl;
            int i3 = rideCardTimelineOptionsMapper$mapChangeDueOption$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rideCardTimelineOptionsMapper$mapChangeDueOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardTimelineOptionsMapper$mapChangeDueOption$1.label;
                c cVar = this.a;
                String str = null;
                if (i != 0) {
                    b.b(obj);
                    ?? r2 = rok0Var == null ? timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.d == TimelineAdditionalOrderOption$AdditionalOrderOptionState.SELECTED ? 1 : 0 : rok0Var.a instanceof d9k0;
                    d9k0 d9k0Var = new d9k0(timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.e.a);
                    FormattedText formattedText2 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.b;
                    rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$0 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption;
                    rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$1 = null;
                    rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$2 = d9k0Var;
                    rideCardTimelineOptionsMapper$mapChangeDueOption$1.Z$0 = z;
                    rideCardTimelineOptionsMapper$mapChangeDueOption$1.I$0 = r2;
                    rideCardTimelineOptionsMapper$mapChangeDueOption$1.label = 1;
                    Object i4 = c.i(cVar, formattedText2, null, rideCardTimelineOptionsMapper$mapChangeDueOption$1, 30);
                    if (i4 != coroutineSingletons) {
                        timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption;
                        i2 = r2;
                        z2 = z;
                        ibk0Var = d9k0Var;
                        obj = i4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = rideCardTimelineOptionsMapper$mapChangeDueOption$1.I$0;
                    z2 = rideCardTimelineOptionsMapper$mapChangeDueOption$1.Z$0;
                    charSequence3 = (CharSequence) rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$4;
                    ibk0Var = (ibk0) rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$3;
                    timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption3 = (TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption) rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$0;
                    b.b(obj);
                    charSequence2 = (CharSequence) obj;
                    timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption3;
                    charSequence = charSequence3;
                    ibk0 ibk0Var2 = ibk0Var;
                    String str2 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2.a;
                    String a = str2 != null ? ((m7x0) this.c).a(str2) : null;
                    boolean z3 = !z2;
                    n = this.g.b().n();
                    if (n != null && (time = n.getTime()) != null) {
                        str = xv21.a(time);
                    }
                    if (str == null) {
                        str = "";
                    }
                    akk0 akk0Var = new akk0(1);
                    LinkedHashMap linkedHashMap = akk0Var.c;
                    linkedHashMap.put("due_source", str);
                    linkedHashMap.put("due_destination", timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2.e.a);
                    return new rok0(ibk0Var2, charSequence, charSequence2, a, i2 != 0, z3, akk0Var);
                }
                i2 = rideCardTimelineOptionsMapper$mapChangeDueOption$1.I$0;
                z2 = rideCardTimelineOptionsMapper$mapChangeDueOption$1.Z$0;
                ibk0Var = (ibk0) rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$2;
                timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2 = (TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption) rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$0;
                b.b(obj);
                CharSequence charSequence4 = (CharSequence) obj;
                formattedText = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2.c;
                if (formattedText != null) {
                    charSequence = charSequence4;
                    charSequence2 = null;
                    ibk0 ibk0Var22 = ibk0Var;
                    String str22 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2.a;
                    if (str22 != null) {
                    }
                    boolean z32 = !z2;
                    n = this.g.b().n();
                    if (n != null) {
                    }
                    if (str == null) {
                    }
                    akk0 akk0Var2 = new akk0(1);
                    LinkedHashMap linkedHashMap2 = akk0Var2.c;
                    linkedHashMap2.put("due_source", str);
                    linkedHashMap2.put("due_destination", timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2.e.a);
                    return new rok0(ibk0Var22, charSequence, charSequence2, a, i2 != 0, z32, akk0Var2);
                }
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$0 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2;
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$1 = null;
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$2 = null;
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$3 = ibk0Var;
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.L$4 = charSequence4;
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.Z$0 = z2;
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.I$0 = i2;
                rideCardTimelineOptionsMapper$mapChangeDueOption$1.label = 2;
                Object i5 = c.i(cVar, formattedText, null, rideCardTimelineOptionsMapper$mapChangeDueOption$1, 30);
                if (i5 != coroutineSingletons) {
                    charSequence3 = charSequence4;
                    obj = i5;
                    timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption3 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2;
                    charSequence2 = (CharSequence) obj;
                    timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption3;
                    charSequence = charSequence3;
                    ibk0 ibk0Var222 = ibk0Var;
                    String str222 = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2.a;
                    if (str222 != null) {
                    }
                    boolean z322 = !z2;
                    n = this.g.b().n();
                    if (n != null) {
                        str = xv21.a(time);
                    }
                    if (str == null) {
                    }
                    akk0 akk0Var22 = new akk0(1);
                    LinkedHashMap linkedHashMap22 = akk0Var22.c;
                    linkedHashMap22.put("due_source", str);
                    linkedHashMap22.put("due_destination", timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2.e.a);
                    return new rok0(ibk0Var222, charSequence, charSequence2, a, i2 != 0, z322, akk0Var22);
                }
                return coroutineSingletons;
            }
        }
        rideCardTimelineOptionsMapper$mapChangeDueOption$1 = new RideCardTimelineOptionsMapper$mapChangeDueOption$1(this, continuationImpl);
        Object obj2 = rideCardTimelineOptionsMapper$mapChangeDueOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardTimelineOptionsMapper$mapChangeDueOption$1.label;
        c cVar2 = this.a;
        String str3 = null;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        formattedText = timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption2.c;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption, rok0 rok0Var, boolean z, ContinuationImpl continuationImpl) {
        RideCardTimelineOptionsMapper$mapChangePriceOption$1 rideCardTimelineOptionsMapper$mapChangePriceOption$1;
        int i;
        boolean z2;
        ibk0 e9k0Var;
        boolean z3;
        String str;
        CharSequence charSequence;
        String str2;
        TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2 = timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption;
        if (continuationImpl instanceof RideCardTimelineOptionsMapper$mapChangePriceOption$1) {
            rideCardTimelineOptionsMapper$mapChangePriceOption$1 = (RideCardTimelineOptionsMapper$mapChangePriceOption$1) continuationImpl;
            int i2 = rideCardTimelineOptionsMapper$mapChangePriceOption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardTimelineOptionsMapper$mapChangePriceOption$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardTimelineOptionsMapper$mapChangePriceOption$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardTimelineOptionsMapper$mapChangePriceOption$1.label;
                if (i != 0) {
                    b.b(obj);
                    z2 = rok0Var == null ? timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.d == TimelineAdditionalOrderOption$AdditionalOrderOptionState.SELECTED : rok0Var.a instanceof e9k0;
                    e9k0Var = new e9k0(timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.f.a);
                    ief iefVar = timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.e;
                    String a = this.b.a(iefVar != null ? gwk0.h(iefVar) : null, timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.b.a(), false, true);
                    FormattedText formattedText = timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.c;
                    if (formattedText == null) {
                        z3 = z;
                        str = a;
                        charSequence = null;
                        ibk0 ibk0Var = e9k0Var;
                        String str3 = timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.a;
                        String a2 = str3 != null ? ((m7x0) this.c).a(str3) : null;
                        boolean z4 = !z3;
                        akk0 akk0Var = new akk0(2);
                        akk0Var.c.put("price", timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.f.a);
                        return new rok0(ibk0Var, str, charSequence, a2, z2, z4, akk0Var);
                    }
                    rideCardTimelineOptionsMapper$mapChangePriceOption$1.L$0 = timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2;
                    rideCardTimelineOptionsMapper$mapChangePriceOption$1.L$1 = null;
                    rideCardTimelineOptionsMapper$mapChangePriceOption$1.L$2 = null;
                    rideCardTimelineOptionsMapper$mapChangePriceOption$1.L$3 = e9k0Var;
                    rideCardTimelineOptionsMapper$mapChangePriceOption$1.L$4 = a;
                    z3 = z;
                    rideCardTimelineOptionsMapper$mapChangePriceOption$1.Z$0 = z3;
                    rideCardTimelineOptionsMapper$mapChangePriceOption$1.I$0 = z2 ? 1 : 0;
                    rideCardTimelineOptionsMapper$mapChangePriceOption$1.label = 1;
                    Object i3 = c.i(this.a, formattedText, null, rideCardTimelineOptionsMapper$mapChangePriceOption$1, 30);
                    if (i3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = a;
                    obj = i3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r1 = rideCardTimelineOptionsMapper$mapChangePriceOption$1.I$0;
                    boolean z5 = rideCardTimelineOptionsMapper$mapChangePriceOption$1.Z$0;
                    ?? r5 = (CharSequence) rideCardTimelineOptionsMapper$mapChangePriceOption$1.L$4;
                    e9k0Var = (ibk0) rideCardTimelineOptionsMapper$mapChangePriceOption$1.L$3;
                    TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption3 = (TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption) rideCardTimelineOptionsMapper$mapChangePriceOption$1.L$0;
                    b.b(obj);
                    z3 = z5;
                    z2 = r1;
                    timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2 = timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption3;
                    str2 = r5;
                }
                charSequence = (CharSequence) obj;
                str = str2;
                ibk0 ibk0Var2 = e9k0Var;
                String str32 = timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.a;
                String a22 = str32 != null ? ((m7x0) this.c).a(str32) : null;
                boolean z42 = !z3;
                akk0 akk0Var2 = new akk0(2);
                akk0Var2.c.put("price", timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.f.a);
                return new rok0(ibk0Var2, str, charSequence, a22, z2, z42, akk0Var2);
            }
        }
        rideCardTimelineOptionsMapper$mapChangePriceOption$1 = new RideCardTimelineOptionsMapper$mapChangePriceOption$1(this, continuationImpl);
        Object obj2 = rideCardTimelineOptionsMapper$mapChangePriceOption$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardTimelineOptionsMapper$mapChangePriceOption$1.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        str = str2;
        ibk0 ibk0Var22 = e9k0Var;
        String str322 = timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.a;
        String a222 = str322 != null ? ((m7x0) this.c).a(str322) : null;
        boolean z422 = !z3;
        akk0 akk0Var22 = new akk0(2);
        akk0Var22.c.put("price", timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption2.f.a);
        return new rok0(ibk0Var22, str, charSequence, a222, z2, z422, akk0Var22);
    }
}
