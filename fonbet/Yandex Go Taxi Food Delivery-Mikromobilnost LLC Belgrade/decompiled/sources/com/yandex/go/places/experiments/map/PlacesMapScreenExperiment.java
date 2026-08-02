package com.yandex.go.places.experiments.map;

import com.yandex.go.places.models.data.entities.network.CategoryFilterType;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.l1b0;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.JCP;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment;", "Lw96;", "Lc6z;", "Companion", "CardOption", "Screen", "RevealingState", "CategoryFilter", "CategoryFilterAction", "PinTags", "SliderMapUpdatesConfig", "com/yandex/go/places/experiments/map/d", "$serializer", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlacesMapScreenExperiment extends w96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] l;
    public static final PlacesMapScreenExperiment m;
    public final Map b;
    public final boolean c;
    public final double d;
    public final int e;
    public final double f;
    public final String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final List k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$RevealingState;", "", "Companion", "com/yandex/go/places/experiments/map/f", "EXPANDED", "COMPACT", "COLLAPSED", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RevealingState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RevealingState[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final RevealingState COLLAPSED;
        public static final RevealingState COMPACT;
        public static final f Companion;
        public static final RevealingState EXPANDED;

        static {
            RevealingState revealingState = new RevealingState("EXPANDED", 0);
            EXPANDED = revealingState;
            RevealingState revealingState2 = new RevealingState("COMPACT", 1);
            COMPACT = revealingState2;
            RevealingState revealingState3 = new RevealingState("COLLAPSED", 2);
            COLLAPSED = revealingState3;
            RevealingState[] revealingStateArr = {revealingState, revealingState2, revealingState3};
            $VALUES = revealingStateArr;
            $ENTRIES = kotlin.enums.a.a(revealingStateArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(21));
        }

        public static RevealingState valueOf(String str) {
            return (RevealingState) Enum.valueOf(RevealingState.class, str);
        }

        public static RevealingState[] values() {
            return (RevealingState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$Screen;", "", "Companion", "com/yandex/go/places/experiments/map/g", "MAIN", "ORGANIZATION_LIST", "ORGANIZATION_LIST_V2", "ORGANIZATION_CARD", JCP.RAW_PREFIX, "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Screen {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final g Companion;
        public static final Screen MAIN;
        public static final Screen NONE;
        public static final Screen ORGANIZATION_CARD;
        public static final Screen ORGANIZATION_LIST;
        public static final Screen ORGANIZATION_LIST_V2;

        static {
            Screen screen = new Screen("MAIN", 0);
            MAIN = screen;
            Screen screen2 = new Screen("ORGANIZATION_LIST", 1);
            ORGANIZATION_LIST = screen2;
            Screen screen3 = new Screen("ORGANIZATION_LIST_V2", 2);
            ORGANIZATION_LIST_V2 = screen3;
            Screen screen4 = new Screen("ORGANIZATION_CARD", 3);
            ORGANIZATION_CARD = screen4;
            Screen screen5 = new Screen(JCP.RAW_PREFIX, 4);
            NONE = screen5;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5};
            $VALUES = screenArr;
            $ENTRIES = kotlin.enums.a.a(screenArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(22));
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new l1b0(15)), null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new l1b0(16))};
        m = new PlacesMapScreenExperiment(0);
    }

    public /* synthetic */ PlacesMapScreenExperiment(int i, Map map, boolean z, double d, int i2, double d2, String str, boolean z2, String str2, String str3, List list) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = 12.0d;
        } else {
            this.d = d;
        }
        if ((i & 8) == 0) {
            this.e = 300;
        } else {
            this.e = i2;
        }
        if ((i & 16) == 0) {
            this.f = 1.0d;
        } else {
            this.f = d2;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str;
        }
        if ((i & 64) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str2;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str3;
        }
        if ((i & 512) == 0) {
            this.k = EmptyList.a;
        } else {
            this.k = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getI() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$SliderMapUpdatesConfig;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/h", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SliderMapUpdatesConfig {
        public static final h Companion = new h();
        public final Boolean a;
        public final Integer b;
        public final boolean c;

        public /* synthetic */ SliderMapUpdatesConfig(int i, Boolean bool, Integer num, boolean z) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public SliderMapUpdatesConfig() {
            this.a = null;
            this.b = null;
            this.c = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CategoryFilterAction;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/c", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CategoryFilterAction {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ CategoryFilterAction(int i, String str, String str2, String str3) {
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
        }

        public CategoryFilterAction(int i) {
            this.a = "";
            this.b = "";
            this.c = null;
        }

        public CategoryFilterAction() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CategoryFilter;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/b", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CategoryFilter {
        public static final b Companion = new b();
        public static final i3y[] g = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(20)), null};
        public final ImageDto a;
        public final String b;
        public final String c;
        public final CategoryFilterAction d;
        public final CategoryFilterType e;
        public final String f;

        public /* synthetic */ CategoryFilter(int i, ImageDto imageDto, String str, String str2, CategoryFilterAction categoryFilterAction, CategoryFilterType categoryFilterType, String str3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = imageDto;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = new CategoryFilterAction(0);
            } else {
                this.d = categoryFilterAction;
            }
            if ((i & 16) == 0) {
                this.e = CategoryFilterType.UNKNOWN;
            } else {
                this.e = categoryFilterType;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str3;
            }
        }

        public CategoryFilter() {
            CategoryFilterAction categoryFilterAction = new CategoryFilterAction(0);
            CategoryFilterType categoryFilterType = CategoryFilterType.UNKNOWN;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = categoryFilterAction;
            this.e = categoryFilterType;
            this.f = null;
        }
    }

    public PlacesMapScreenExperiment() {
        this(0);
    }

    public PlacesMapScreenExperiment(int i) {
        this.b = kotlin.collections.b.f();
        this.c = false;
        this.d = 12.0d;
        this.e = 300;
        this.f = 1.0d;
        this.g = "";
        this.h = false;
        this.i = "";
        this.j = "";
        this.k = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$PinTags;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/e", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PinTags {
        public static final e Companion = new e();
        public final ImageDto a;
        public final ImageDto b;
        public final ImageDto c;
        public final ImageDto d;
        public final ImageDto e;
        public final ImageDto f;
        public final ImageDto g;
        public final ImageDto h;

        public /* synthetic */ PinTags(int i, ImageDto imageDto, ImageDto imageDto2, ImageDto imageDto3, ImageDto imageDto4, ImageDto imageDto5, ImageDto imageDto6, ImageDto imageDto7, ImageDto imageDto8) {
            this.a = (i & 1) == 0 ? new ImageDto(0) : imageDto;
            if ((i & 2) == 0) {
                this.b = new ImageDto(0);
            } else {
                this.b = imageDto2;
            }
            if ((i & 4) == 0) {
                this.c = new ImageDto(0);
            } else {
                this.c = imageDto3;
            }
            if ((i & 8) == 0) {
                this.d = new ImageDto(0);
            } else {
                this.d = imageDto4;
            }
            if ((i & 16) == 0) {
                this.e = new ImageDto(0);
            } else {
                this.e = imageDto5;
            }
            if ((i & 32) == 0) {
                this.f = new ImageDto(0);
            } else {
                this.f = imageDto6;
            }
            if ((i & 64) == 0) {
                this.g = new ImageDto(0);
            } else {
                this.g = imageDto7;
            }
            if ((i & 128) == 0) {
                this.h = new ImageDto(0);
            } else {
                this.h = imageDto8;
            }
        }

        public PinTags() {
            ImageDto imageDto = new ImageDto(0);
            ImageDto imageDto2 = new ImageDto(0);
            ImageDto imageDto3 = new ImageDto(0);
            ImageDto imageDto4 = new ImageDto(0);
            ImageDto imageDto5 = new ImageDto(0);
            ImageDto imageDto6 = new ImageDto(0);
            ImageDto imageDto7 = new ImageDto(0);
            ImageDto imageDto8 = new ImageDto(0);
            this.a = imageDto;
            this.b = imageDto2;
            this.c = imageDto3;
            this.d = imageDto4;
            this.e = imageDto5;
            this.f = imageDto6;
            this.g = imageDto7;
            this.h = imageDto8;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/PlacesMapScreenExperiment$CardOption;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/a", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CardOption {
        public static final a Companion = new a();
        public static final i3y[] m;
        public final Screen a;
        public final String b;
        public final double c;
        public final Double d;
        public final Double e;
        public final Double f;
        public final RevealingState g;
        public final String h;
        public final List i;
        public final Integer j;
        public final PinTags k;
        public final SliderMapUpdatesConfig l;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            m = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new l1b0(17)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new l1b0(18)), null, kotlin.a.b(lazyThreadSafetyMode, new l1b0(19)), null, null, null};
        }

        public /* synthetic */ CardOption(int i, Screen screen, String str, double d, Double d2, Double d3, Double d4, RevealingState revealingState, String str2, List list, Integer num, PinTags pinTags, SliderMapUpdatesConfig sliderMapUpdatesConfig) {
            this.a = (i & 1) == 0 ? Screen.NONE : screen;
            if ((i & 2) == 0) {
                this.b = "none";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = 12.0d;
            } else {
                this.c = d;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = d2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = d3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = d4;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = revealingState;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str2;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = list;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = num;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = pinTags;
            }
            if ((i & 2048) == 0) {
                this.l = null;
            } else {
                this.l = sliderMapUpdatesConfig;
            }
        }

        public CardOption() {
            this.a = Screen.NONE;
            this.b = "none";
            this.c = 12.0d;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
        }
    }
}
