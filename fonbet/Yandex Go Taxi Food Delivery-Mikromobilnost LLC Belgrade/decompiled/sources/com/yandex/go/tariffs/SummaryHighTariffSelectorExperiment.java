package com.yandex.go.tariffs;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w0v0;
import defpackage.w96;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffs/SummaryHighTariffSelectorExperiment;", "Lw96;", "Companion", "com/yandex/go/tariffs/a", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SummaryHighTariffSelectorExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(23))};
    public static final SummaryHighTariffSelectorExperiment e = new SummaryHighTariffSelectorExperiment(0);
    public final boolean b;
    public final Set c;

    public /* synthetic */ SummaryHighTariffSelectorExperiment(int i, boolean z, Set set) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptySet.a;
        } else {
            this.c = set;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public SummaryHighTariffSelectorExperiment(int i) {
        this.b = false;
        this.c = EmptySet.a;
    }

    public SummaryHighTariffSelectorExperiment() {
        this(0);
    }
}
