package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.savings.internal.network.dto.DiffRateCalendarDayStyle;
import com.ybsdk.feature.savings.internal.network.dto.DiffRateCalendarEntry;
import com.ybsdk.feature.savings.internal.network.dto.DiffRateCalendarResponse;
import com.ybsdk.feature.savings.internal.network.dto.DiffRateCalendarTooltip;
import defpackage.bij;
import defpackage.gh91;
import defpackage.kdb1;
import defpackage.lg91;
import defpackage.lvy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vij;
import defpackage.wls;
import defpackage.zy11;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarResponse;", "it", "Lbij;", "<anonymous>", "(Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarResponse;)Lbij;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.data.DiffRateCalendarRepository$getDiffRateCalendar$3$1", f = "DiffRateCalendarRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DiffRateCalendarRepository$getDiffRateCalendar$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DiffRateCalendarRepository$getDiffRateCalendar$3$1 diffRateCalendarRepository$getDiffRateCalendar$3$1 = new DiffRateCalendarRepository$getDiffRateCalendar$3$1(2, continuation);
        diffRateCalendarRepository$getDiffRateCalendar$3$1.L$0 = obj;
        return diffRateCalendarRepository$getDiffRateCalendar$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiffRateCalendarRepository$getDiffRateCalendar$3$1) create((DiffRateCalendarResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String subtitle;
        String title;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        DiffRateCalendarResponse diffRateCalendarResponse = (DiffRateCalendarResponse) this.L$0;
        List<DiffRateCalendarEntry> entries = diffRateCalendarResponse.getEntries();
        Map<String, DiffRateCalendarDayStyle> styles = diffRateCalendarResponse.getStyles();
        MapBuilder mapBuilder = new MapBuilder();
        for (DiffRateCalendarEntry diffRateCalendarEntry : entries) {
            DiffRateCalendarDayStyle diffRateCalendarDayStyle = styles.get(diffRateCalendarEntry.getStyle());
            Calendar d = lg91.d(diffRateCalendarEntry.getFrom());
            Calendar d2 = lg91.d(diffRateCalendarEntry.getTo());
            if (diffRateCalendarDayStyle != null && d != null && d2 != null) {
                Themes<String> highlightColor = diffRateCalendarDayStyle.getHighlightColor();
                ColorModel c = highlightColor != null ? lvy0.c(highlightColor) : null;
                ColorModel c2 = lvy0.c(diffRateCalendarDayStyle.getTextColor());
                DiffRateCalendarTooltip tooltip = diffRateCalendarDayStyle.getTooltip();
                Text.Constant e = (tooltip == null || (title = tooltip.getTitle()) == null) ? null : d.e(title);
                DiffRateCalendarTooltip tooltip2 = diffRateCalendarDayStyle.getTooltip();
                Text.Constant e2 = (tooltip2 == null || (subtitle = tooltip2.getSubtitle()) == null) ? null : d.e(subtitle);
                DiffRateCalendarTooltip tooltip3 = diffRateCalendarDayStyle.getTooltip();
                vij vijVar = new vij(c, c2, e, e2, tooltip3 != null ? tooltip3.getDiffRateStatus() : false);
                Calendar calendar = (Calendar) d.clone();
                while (!calendar.after(d2)) {
                    mapBuilder.put(Long.valueOf(gh91.a(calendar)), vijVar);
                    calendar.add(5, 1);
                }
            }
        }
        MapBuilder j = mapBuilder.j();
        Calendar calendar2 = (Calendar) kdb1.e().clone();
        calendar2.add(2, -11);
        calendar2.set(5, 1);
        return new bij(j, calendar2);
    }
}
