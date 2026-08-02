package com.yandex.go.superapp.discovery.map.impl.experiments;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.ImageDto;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.bnv0;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tsv0;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment;", "Lw96;", "Lc6z;", "Companion", "SearchBarConfig", "Searchbar", PlusPayUiKitInflaterFactory.NAME_BUTTON, "ScreenOptions", "SettlementFocusingConfig", "CategoryFilter", "CategoryFilterType", "com/yandex/go/superapp/discovery/map/impl/experiments/f", "com/yandex/go/superapp/discovery/map/impl/experiments/p", "vtv0", "ytv0", "com/yandex/go/superapp/discovery/map/impl/experiments/h", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppDiscoveryMapExperiment extends w96 implements c6z {
    public static final h Companion = new h();
    public static final i3y[] j = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(2)), null, null, null, null, null, null, null};
    public static final SuperAppDiscoveryMapExperiment k = new SuperAppDiscoveryMapExperiment(0);
    public final Map b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final ScreenOptions h;
    public final SearchBarConfig i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$CategoryFilterType;", "", "Companion", "com/yandex/go/superapp/discovery/map/impl/experiments/g", "CHARGERS", "SCOOTERS", "TRANSPORT", "FAVOURITES", "CATEGORY", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CategoryFilterType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CategoryFilterType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final CategoryFilterType CATEGORY;
        public static final CategoryFilterType CHARGERS;
        public static final g Companion;
        public static final CategoryFilterType FAVOURITES;
        public static final CategoryFilterType SCOOTERS;
        public static final CategoryFilterType TRANSPORT;
        public static final CategoryFilterType UNKNOWN;

        static {
            CategoryFilterType categoryFilterType = new CategoryFilterType("CHARGERS", 0);
            CHARGERS = categoryFilterType;
            CategoryFilterType categoryFilterType2 = new CategoryFilterType("SCOOTERS", 1);
            SCOOTERS = categoryFilterType2;
            CategoryFilterType categoryFilterType3 = new CategoryFilterType("TRANSPORT", 2);
            TRANSPORT = categoryFilterType3;
            CategoryFilterType categoryFilterType4 = new CategoryFilterType("FAVOURITES", 3);
            FAVOURITES = categoryFilterType4;
            CategoryFilterType categoryFilterType5 = new CategoryFilterType("CATEGORY", 4);
            CATEGORY = categoryFilterType5;
            CategoryFilterType categoryFilterType6 = new CategoryFilterType("UNKNOWN", 5);
            UNKNOWN = categoryFilterType6;
            CategoryFilterType[] categoryFilterTypeArr = {categoryFilterType, categoryFilterType2, categoryFilterType3, categoryFilterType4, categoryFilterType5, categoryFilterType6};
            $VALUES = categoryFilterTypeArr;
            $ENTRIES = kotlin.enums.a.a(categoryFilterTypeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(7));
        }

        public static CategoryFilterType valueOf(String str) {
            return (CategoryFilterType) Enum.valueOf(CategoryFilterType.class, str);
        }

        public static CategoryFilterType[] values() {
            return (CategoryFilterType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SuperAppDiscoveryMapExperiment(int i, Map map, boolean z, boolean z2, String str, String str2, String str3, ScreenOptions screenOptions, SearchBarConfig searchBarConfig) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = screenOptions;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = searchBarConfig;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getM() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$SettlementFocusingConfig;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SettlementFocusingConfig {
        public static final q Companion = new q();
        public final boolean a;
        public final long b;
        public final Double c;

        public /* synthetic */ SettlementFocusingConfig(int i, boolean z, long j, Double d) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = 0L;
            } else {
                this.b = j;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = d;
            }
        }

        public SettlementFocusingConfig() {
            this.a = false;
            this.b = 0L;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$Button;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Button {
        public static final a Companion = new a();
        public final String a;
        public final String b;
        public final p c;

        public /* synthetic */ Button(int i, String str, String str2, p pVar) {
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
                this.c = o.INSTANCE;
            } else {
                this.c = pVar;
            }
        }

        public Button() {
            o oVar = o.INSTANCE;
            this.a = "";
            this.b = "";
            this.c = oVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$ScreenOptions;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ScreenOptions {
        public static final i Companion = new i();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(8))};
        public final String a;
        public final float b;
        public final SettlementFocusingConfig c;
        public final List d;

        public /* synthetic */ ScreenOptions(int i, String str, float f, SettlementFocusingConfig settlementFocusingConfig, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 12.0f;
            } else {
                this.b = f;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = settlementFocusingConfig;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = list;
            }
        }

        public ScreenOptions() {
            this.a = "";
            this.b = 12.0f;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$Searchbar;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Searchbar {
        public static final k Companion = new k();
        public final String a;
        public final String b;
        public final String c;
        public final p d;

        public /* synthetic */ Searchbar(int i, String str, String str2, String str3, p pVar) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = o.INSTANCE;
            } else {
                this.d = pVar;
            }
        }

        public Searchbar() {
            this(0);
        }

        public Searchbar(int i) {
            o oVar = o.INSTANCE;
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = oVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$SearchBarConfig;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SearchBarConfig {
        public static final j Companion = new j();
        public static final i3y[] e;
        public final boolean a;
        public final Searchbar b;
        public final List c;
        public final List d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(17)), kotlin.a.b(lazyThreadSafetyMode, new bnv0(18))};
        }

        public /* synthetic */ SearchBarConfig(int i, boolean z, Searchbar searchbar, List list, List list2) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = new Searchbar(0);
            } else {
                this.b = searchbar;
            }
            int i2 = i & 4;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.c = emptyList;
            } else {
                this.c = list;
            }
            if ((i & 8) == 0) {
                this.d = emptyList;
            } else {
                this.d = list2;
            }
        }

        public SearchBarConfig() {
            this(0);
        }

        public SearchBarConfig(int i) {
            Searchbar searchbar = new Searchbar(0);
            this.a = false;
            this.b = searchbar;
            EmptyList emptyList = EmptyList.a;
            this.c = emptyList;
            this.d = emptyList;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/SuperAppDiscoveryMapExperiment$CategoryFilter;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CategoryFilter {
        public static final b Companion = new b();
        public static final i3y[] h = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(3)), null};
        public final ImageDto a;
        public final ImageDto b;
        public final String c;
        public final String d;
        public final f e;
        public final CategoryFilterType f;
        public final boolean g;

        public /* synthetic */ CategoryFilter(int i, ImageDto imageDto, ImageDto imageDto2, String str, String str2, f fVar, CategoryFilterType categoryFilterType, boolean z) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = imageDto;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = imageDto2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = e.INSTANCE;
            } else {
                this.e = fVar;
            }
            if ((i & 32) == 0) {
                this.f = CategoryFilterType.UNKNOWN;
            } else {
                this.f = categoryFilterType;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z;
            }
        }

        public CategoryFilter() {
            e eVar = e.INSTANCE;
            CategoryFilterType categoryFilterType = CategoryFilterType.UNKNOWN;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = eVar;
            this.f = categoryFilterType;
            this.g = false;
        }
    }

    public SuperAppDiscoveryMapExperiment() {
        this(0);
    }

    public SuperAppDiscoveryMapExperiment(int i) {
        this.b = kotlin.collections.b.f();
        this.c = false;
        this.d = false;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = null;
        this.i = null;
    }
}
