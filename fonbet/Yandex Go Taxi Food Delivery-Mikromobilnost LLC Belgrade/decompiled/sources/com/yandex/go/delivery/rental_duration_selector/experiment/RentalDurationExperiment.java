package com.yandex.go.delivery.rental_duration_selector.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.vci0;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/experiment/RentalDurationExperiment;", "Lxn11;", "Lc6z;", "Companion", "com/yandex/go/delivery/rental_duration_selector/experiment/h", "$serializer", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RentalDurationExperiment implements xn11, c6z {
    public static final h Companion = new h();
    public static final i3y[] h;
    public static final RentalDurationExperiment i;
    public final boolean b;
    public final List c;
    public final Map d;
    public final SummaryBubbleDto e;
    public final SummaryListItemDto f;
    public final RentalDurationSelectorDto g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new vci0(10)), kotlin.a.b(lazyThreadSafetyMode, new vci0(11)), null, null, null};
        i = new RentalDurationExperiment(0);
    }

    public /* synthetic */ RentalDurationExperiment(int i2, boolean z, List list, Map map, SummaryBubbleDto summaryBubbleDto, SummaryListItemDto summaryListItemDto, RentalDurationSelectorDto rentalDurationSelectorDto) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i2 & 4) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map;
        }
        if ((i2 & 8) == 0) {
            this.e = null;
        } else {
            this.e = summaryBubbleDto;
        }
        if ((i2 & 16) == 0) {
            this.f = new SummaryListItemDto(0);
        } else {
            this.f = summaryListItemDto;
        }
        if ((i2 & 32) == 0) {
            this.g = new RentalDurationSelectorDto(0);
        } else {
            this.g = rentalDurationSelectorDto;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.d;
    }

    public RentalDurationExperiment() {
        this(0);
    }

    public RentalDurationExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        SummaryListItemDto summaryListItemDto = new SummaryListItemDto(0);
        RentalDurationSelectorDto rentalDurationSelectorDto = new RentalDurationSelectorDto(0);
        this.b = false;
        this.c = EmptyList.a;
        this.d = f;
        this.e = null;
        this.f = summaryListItemDto;
        this.g = rentalDurationSelectorDto;
    }
}
