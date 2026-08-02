package com.yandex.go.superapp.discovery.map.impl.experiments.v2;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.SuperAppDiscoveryMapLayerDto;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.bnv0;
import defpackage.c6z;
import defpackage.cyv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment;", "Lw96;", "Lc6z;", "Companion", "ServiceSearchBarConfig", "SearchBarConfig", "FlexContainerConfig", "Searchbar", PlusPayUiKitInflaterFactory.NAME_BUTTON, "ScreenOptions", "MapExplorationConfigDto", "MapVisibleBboxConfig", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/n", "fyv0", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppDiscoveryMapV2Experiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] o;
    public static final SuperAppDiscoveryMapV2Experiment p;
    public final Map b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final SuperAppDiscoveryMapLayerDto f;
    public final String g;
    public final String h;
    public final String i;
    public final ScreenOptions j;
    public final List k;
    public final FlexContainerConfig l;
    public final MapExplorationConfigDto m;
    public final MapVisibleBboxConfig n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new bnv0(27)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(28)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(29)), null, null, null};
        p = new SuperAppDiscoveryMapV2Experiment(0);
    }

    public /* synthetic */ SuperAppDiscoveryMapV2Experiment(int i, Map map, boolean z, boolean z2, boolean z3, SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto, String str, String str2, String str3, ScreenOptions screenOptions, List list, FlexContainerConfig flexContainerConfig, MapExplorationConfigDto mapExplorationConfigDto, MapVisibleBboxConfig mapVisibleBboxConfig) {
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
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i & 16) == 0) {
            this.f = SuperAppDiscoveryMapLayerDto.PLACES;
        } else {
            this.f = superAppDiscoveryMapLayerDto;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str2;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str3;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = screenOptions;
        }
        if ((i & 512) == 0) {
            this.k = EmptyList.a;
        } else {
            this.k = list;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = flexContainerConfig;
        }
        if ((i & 2048) == 0) {
            this.m = null;
        } else {
            this.m = mapExplorationConfigDto;
        }
        if ((i & 4096) == 0) {
            this.n = null;
        } else {
            this.n = mapVisibleBboxConfig;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$FlexContainerConfig;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class FlexContainerConfig {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ FlexContainerConfig(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public FlexContainerConfig() {
            this.a = "";
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig;", "", "Companion", "Insets", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class MapVisibleBboxConfig {
        public static final e Companion = new e();
        public final Float a;
        public final Insets b;

        public /* synthetic */ MapVisibleBboxConfig(int i, Float f, Insets insets) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = insets;
            }
        }

        public MapVisibleBboxConfig() {
            this.a = null;
            this.b = null;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$MapVisibleBboxConfig$Insets;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Insets {
            public static final f Companion = new f();
            public final float a;
            public final float b;
            public final float c;
            public final float d;

            public /* synthetic */ Insets(float f, float f2, float f3, float f4, int i) {
                if ((i & 1) == 0) {
                    this.a = 0.0f;
                } else {
                    this.a = f;
                }
                if ((i & 2) == 0) {
                    this.b = 0.0f;
                } else {
                    this.b = f2;
                }
                if ((i & 4) == 0) {
                    this.c = 0.0f;
                } else {
                    this.c = f3;
                }
                if ((i & 8) == 0) {
                    this.d = 0.0f;
                } else {
                    this.d = f4;
                }
            }

            public Insets() {
                this.a = 0.0f;
                this.b = 0.0f;
                this.c = 0.0f;
                this.d = 0.0f;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$ScreenOptions;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class ScreenOptions {
        public static final g Companion = new g();
        public final String a;
        public final float b;

        public /* synthetic */ ScreenOptions(String str, int i, float f) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 12.0f;
            } else {
                this.b = f;
            }
        }

        public ScreenOptions() {
            this.a = "";
            this.b = 12.0f;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$ServiceSearchBarConfig;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class ServiceSearchBarConfig {
        public static final o Companion = new o();
        public final String a;
        public final SearchBarConfig b;

        public /* synthetic */ ServiceSearchBarConfig(int i, String str, SearchBarConfig searchBarConfig) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new SearchBarConfig(0);
            } else {
                this.b = searchBarConfig;
            }
        }

        public ServiceSearchBarConfig() {
            SearchBarConfig searchBarConfig = new SearchBarConfig(0);
            this.a = "";
            this.b = searchBarConfig;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$Button;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Button {
        public static final a Companion = new a();
        public final String a;
        public final String b;
        public final n c;

        public /* synthetic */ Button(int i, String str, String str2, n nVar) {
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
                this.c = m.INSTANCE;
            } else {
                this.c = nVar;
            }
        }

        public Button() {
            m mVar = m.INSTANCE;
            this.a = "";
            this.b = "";
            this.c = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$Searchbar;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class Searchbar {
        public static final i Companion = new i();
        public final String a;
        public final String b;
        public final String c;
        public final n d;

        public /* synthetic */ Searchbar(int i, String str, String str2, String str3, n nVar) {
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
                this.d = m.INSTANCE;
            } else {
                this.d = nVar;
            }
        }

        public Searchbar() {
            this(0);
        }

        public Searchbar(int i) {
            m mVar = m.INSTANCE;
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = mVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$MapExplorationConfigDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class MapExplorationConfigDto {
        public static final d Companion = new d();
        public final double a;
        public final double b;
        public final long c;
        public final long d;

        public /* synthetic */ MapExplorationConfigDto(int i, double d, double d2, long j, long j2) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d2;
            }
            if ((i & 4) == 0) {
                this.c = 500L;
            } else {
                this.c = j;
            }
            if ((i & 8) == 0) {
                this.d = 200L;
            } else {
                this.d = j2;
            }
        }

        public MapExplorationConfigDto() {
            this.a = 0.0d;
            this.b = 0.0d;
            this.c = 500L;
            this.d = 200L;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/experiments/v2/SuperAppDiscoveryMapV2Experiment$SearchBarConfig;", "", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/experiments/v2/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class SearchBarConfig {
        public static final h Companion = new h();
        public static final i3y[] e;
        public final boolean a;
        public final Searchbar b;
        public final List c;
        public final List d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new cyv0(0)), kotlin.a.b(lazyThreadSafetyMode, new cyv0(1))};
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

    public SuperAppDiscoveryMapV2Experiment() {
        this(0);
    }

    public SuperAppDiscoveryMapV2Experiment(int i) {
        Map f = kotlin.collections.b.f();
        SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto = SuperAppDiscoveryMapLayerDto.PLACES;
        this.b = f;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = superAppDiscoveryMapLayerDto;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = null;
        this.k = EmptyList.a;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
