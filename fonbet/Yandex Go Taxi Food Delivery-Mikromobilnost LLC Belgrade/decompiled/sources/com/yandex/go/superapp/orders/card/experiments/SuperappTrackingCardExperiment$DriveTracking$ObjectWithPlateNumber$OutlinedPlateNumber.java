package com.yandex.go.superapp.orders.card.experiments;

import defpackage.cyv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber", "Lcom/yandex/go/superapp/orders/card/experiments/m;", "Companion", "Placement", "$serializer", "com/yandex/go/superapp/orders/card/experiments/l", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber implements m {
    public static final l Companion = new l();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(22))};
    public final Placement a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber$Placement;", "", "Original", "Redesign2026", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Placement {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Placement[] $VALUES;
        public static final Placement Original;
        public static final Placement Redesign2026;

        static {
            Placement placement = new Placement("Original", 0);
            Original = placement;
            Placement placement2 = new Placement("Redesign2026", 1);
            Redesign2026 = placement2;
            Placement[] placementArr = {placement, placement2};
            $VALUES = placementArr;
            $ENTRIES = kotlin.enums.a.a(placementArr);
        }

        public static Placement valueOf(String str) {
            return (Placement) Enum.valueOf(Placement.class, str);
        }

        public static Placement[] values() {
            return (Placement[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber(int i, Placement placement) {
        if ((i & 1) == 0) {
            this.a = Placement.Original;
        } else {
            this.a = placement;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Placement getA() {
        return this.a;
    }

    public SuperappTrackingCardExperiment$DriveTracking$ObjectWithPlateNumber$OutlinedPlateNumber() {
        this.a = Placement.Original;
    }
}
