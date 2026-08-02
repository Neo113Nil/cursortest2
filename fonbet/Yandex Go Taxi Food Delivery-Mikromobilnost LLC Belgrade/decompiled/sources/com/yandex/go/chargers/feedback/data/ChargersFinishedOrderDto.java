package com.yandex.go.chargers.feedback.data;

import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wu9;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/feedback/data/ChargersFinishedOrderDto;", "", "Companion", "FinishingStage", "$serializer", "com/yandex/go/chargers/feedback/data/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFinishedOrderDto {
    public static final s Companion = new s();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final String c;
    public final ChargersOrderDetailsDto d;
    public final ChargersSurgeModalDto e;
    public final Boolean f;
    public final FinishingStage g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/feedback/data/ChargersFinishedOrderDto$FinishingStage;", "", "Companion", "com/yandex/go/chargers/feedback/data/t", "DEFAULT", "FREE_CHECK_PERIOD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class FinishingStage {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FinishingStage[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final t Companion;
        public static final FinishingStage DEFAULT;
        public static final FinishingStage FREE_CHECK_PERIOD;

        static {
            FinishingStage finishingStage = new FinishingStage("DEFAULT", 0);
            DEFAULT = finishingStage;
            FinishingStage finishingStage2 = new FinishingStage("FREE_CHECK_PERIOD", 1);
            FREE_CHECK_PERIOD = finishingStage2;
            FinishingStage[] finishingStageArr = {finishingStage, finishingStage2};
            $VALUES = finishingStageArr;
            $ENTRIES = kotlin.enums.a.a(finishingStageArr);
            Companion = new t();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(26));
        }

        public static FinishingStage valueOf(String str) {
            return (FinishingStage) Enum.valueOf(FinishingStage.class, str);
        }

        public static FinishingStage[] values() {
            return (FinishingStage[]) $VALUES.clone();
        }
    }

    static {
        com.yandex.go.chargers.surge.data.c cVar = ChargersSurgeModalDto.Companion;
        h = new i3y[]{null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(25))};
    }

    public /* synthetic */ ChargersFinishedOrderDto(int i, String str, String str2, String str3, ChargersOrderDetailsDto chargersOrderDetailsDto, ChargersSurgeModalDto chargersSurgeModalDto, Boolean bool, FinishingStage finishingStage) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = new ChargersOrderDetailsDto(0);
        } else {
            this.d = chargersOrderDetailsDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = chargersSurgeModalDto;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = FinishingStage.DEFAULT;
        } else {
            this.g = finishingStage;
        }
    }

    public ChargersFinishedOrderDto() {
        ChargersOrderDetailsDto chargersOrderDetailsDto = new ChargersOrderDetailsDto(0);
        FinishingStage finishingStage = FinishingStage.DEFAULT;
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = chargersOrderDetailsDto;
        this.e = null;
        this.f = null;
        this.g = finishingStage;
    }
}
