package com.yandex.go.pickuppoints.impl;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.xn11;
import defpackage.y99;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/pickuppoints/impl/ClarifyPointsScreenStrategyConfigurationExperiment;", "Lxn11;", "Companion", "com/yandex/go/pickuppoints/impl/h", "izb", "MapConfigurationDto", "SummaryConfigurationDto", "SummaryInnerConfigurationDto", "PointConfigurationDto", "PrimarySuggestType", "com/yandex/go/pickuppoints/impl/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClarifyPointsScreenStrategyConfigurationExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(21))};
    public static final ClarifyPointsScreenStrategyConfigurationExperiment d = new ClarifyPointsScreenStrategyConfigurationExperiment(0);
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/pickuppoints/impl/ClarifyPointsScreenStrategyConfigurationExperiment$PrimarySuggestType;", "", "Companion", "com/yandex/go/pickuppoints/impl/d", "MAP", BaseDatabaseHelper.TYPE_TEXT, "OPEN_COPTER_CITY_TOURS_SELECTOR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PrimarySuggestType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PrimarySuggestType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final PrimarySuggestType MAP;
        public static final PrimarySuggestType OPEN_COPTER_CITY_TOURS_SELECTOR;
        public static final PrimarySuggestType TEXT;

        static {
            PrimarySuggestType primarySuggestType = new PrimarySuggestType("MAP", 0);
            MAP = primarySuggestType;
            PrimarySuggestType primarySuggestType2 = new PrimarySuggestType(BaseDatabaseHelper.TYPE_TEXT, 1);
            TEXT = primarySuggestType2;
            PrimarySuggestType primarySuggestType3 = new PrimarySuggestType("OPEN_COPTER_CITY_TOURS_SELECTOR", 2);
            OPEN_COPTER_CITY_TOURS_SELECTOR = primarySuggestType3;
            PrimarySuggestType[] primarySuggestTypeArr = {primarySuggestType, primarySuggestType2, primarySuggestType3};
            $VALUES = primarySuggestTypeArr;
            $ENTRIES = kotlin.enums.a.a(primarySuggestTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(22));
        }

        public static PrimarySuggestType valueOf(String str) {
            return (PrimarySuggestType) Enum.valueOf(PrimarySuggestType.class, str);
        }

        public static PrimarySuggestType[] values() {
            return (PrimarySuggestType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ClarifyPointsScreenStrategyConfigurationExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ClarifyPointsScreenStrategyConfigurationExperiment(int i) {
        this.b = EmptyList.a;
    }

    public ClarifyPointsScreenStrategyConfigurationExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickuppoints/impl/ClarifyPointsScreenStrategyConfigurationExperiment$SummaryConfigurationDto;", "", "Companion", "$serializer", "com/yandex/go/pickuppoints/impl/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SummaryConfigurationDto {
        public static final i Companion = new i();
        public final SummaryInnerConfigurationDto a;

        public /* synthetic */ SummaryConfigurationDto(int i, SummaryInnerConfigurationDto summaryInnerConfigurationDto) {
            if ((i & 1) == 0) {
                this.a = new SummaryInnerConfigurationDto(0);
            } else {
                this.a = summaryInnerConfigurationDto;
            }
        }

        public SummaryConfigurationDto() {
            this(0);
        }

        public SummaryConfigurationDto(int i) {
            this.a = new SummaryInnerConfigurationDto(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickuppoints/impl/ClarifyPointsScreenStrategyConfigurationExperiment$PointConfigurationDto;", "", "Companion", "$serializer", "com/yandex/go/pickuppoints/impl/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PointConfigurationDto {
        public static final c Companion = new c();
        public final Float a;
        public final Float b;

        public /* synthetic */ PointConfigurationDto(int i, Float f, Float f2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = f2;
            }
        }

        public PointConfigurationDto(int i) {
            this.a = null;
            this.b = null;
        }

        public PointConfigurationDto() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickuppoints/impl/ClarifyPointsScreenStrategyConfigurationExperiment$MapConfigurationDto;", "", "Companion", "$serializer", "com/yandex/go/pickuppoints/impl/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class MapConfigurationDto {
        public static final b Companion = new b();
        public final PointConfigurationDto a;
        public final PointConfigurationDto b;

        public /* synthetic */ MapConfigurationDto(int i, PointConfigurationDto pointConfigurationDto, PointConfigurationDto pointConfigurationDto2) {
            this.a = (i & 1) == 0 ? new PointConfigurationDto(0) : pointConfigurationDto;
            if ((i & 2) == 0) {
                this.b = new PointConfigurationDto(0);
            } else {
                this.b = pointConfigurationDto2;
            }
        }

        public MapConfigurationDto() {
            this(0);
        }

        public MapConfigurationDto(int i) {
            PointConfigurationDto pointConfigurationDto = new PointConfigurationDto(0);
            PointConfigurationDto pointConfigurationDto2 = new PointConfigurationDto(0);
            this.a = pointConfigurationDto;
            this.b = pointConfigurationDto2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickuppoints/impl/ClarifyPointsScreenStrategyConfigurationExperiment$SummaryInnerConfigurationDto;", "", "Companion", "$serializer", "com/yandex/go/pickuppoints/impl/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SummaryInnerConfigurationDto {
        public static final j Companion = new j();
        public static final i3y[] d;
        public final PrimarySuggestType a;
        public final PrimarySuggestType b;
        public final PrimarySuggestType c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new y99(26)), kotlin.a.b(lazyThreadSafetyMode, new y99(27)), kotlin.a.b(lazyThreadSafetyMode, new y99(28))};
        }

        public /* synthetic */ SummaryInnerConfigurationDto(int i, PrimarySuggestType primarySuggestType, PrimarySuggestType primarySuggestType2, PrimarySuggestType primarySuggestType3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = primarySuggestType;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = primarySuggestType2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = primarySuggestType3;
            }
        }

        public SummaryInnerConfigurationDto(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public SummaryInnerConfigurationDto() {
            this(0);
        }
    }
}
