package com.yandex.go.superapp.orders.card.experiments;

import defpackage.ahw0;
import defpackage.auu0;
import defpackage.bhw0;
import defpackage.c6z;
import defpackage.cyv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.w5w0;
import defpackage.w96;
import defpackage.yjd;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment;", "Lw96;", "Lc6z;", "Companion", "TaxiTracking", "DriveTracking", "ScootersTracking", "DeliveryTracking", "NavigatorTracking", "ChargersTracking", "ExternalServiceTracking", "ahw0", "HorizontalPlacement", "TrackingCardColors", "com/yandex/go/superapp/orders/card/experiments/b", "$serializer", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperappTrackingCardExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] s;
    public final boolean b;
    public final Map c;
    public final TaxiTracking d;
    public final DriveTracking e;
    public final ScootersTracking f;
    public final DeliveryTracking g;
    public final NavigatorTracking h;
    public final ChargersTracking i;
    public final ExternalServiceTracking j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final Map p;
    public final String q;
    public final boolean r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$HorizontalPlacement;", "", "Lead", "Trail", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class HorizontalPlacement {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ HorizontalPlacement[] $VALUES;
        public static final HorizontalPlacement Lead;
        public static final HorizontalPlacement Trail;

        static {
            HorizontalPlacement horizontalPlacement = new HorizontalPlacement("Lead", 0);
            Lead = horizontalPlacement;
            HorizontalPlacement horizontalPlacement2 = new HorizontalPlacement("Trail", 1);
            Trail = horizontalPlacement2;
            HorizontalPlacement[] horizontalPlacementArr = {horizontalPlacement, horizontalPlacement2};
            $VALUES = horizontalPlacementArr;
            $ENTRIES = kotlin.enums.a.a(horizontalPlacementArr);
        }

        public static HorizontalPlacement valueOf(String str) {
            return (HorizontalPlacement) Enum.valueOf(HorizontalPlacement.class, str);
        }

        public static HorizontalPlacement[] values() {
            return (HorizontalPlacement[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        s = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new w5w0(17)), null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new w5w0(18)), null, null};
    }

    public /* synthetic */ SuperappTrackingCardExperiment(int i, boolean z, Map map, TaxiTracking taxiTracking, DriveTracking driveTracking, ScootersTracking scootersTracking, DeliveryTracking deliveryTracking, NavigatorTracking navigatorTracking, ChargersTracking chargersTracking, ExternalServiceTracking externalServiceTracking, int i2, int i3, int i4, int i5, boolean z2, Map map2, String str, boolean z3) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = taxiTracking;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = driveTracking;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = scootersTracking;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = deliveryTracking;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = navigatorTracking;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = chargersTracking;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = externalServiceTracking;
        }
        if ((i & 512) == 0) {
            this.k = 64;
        } else {
            this.k = i2;
        }
        if ((i & 1024) == 0) {
            this.l = 12;
        } else {
            this.l = i3;
        }
        if ((i & 2048) == 0) {
            this.m = 2;
        } else {
            this.m = i4;
        }
        if ((i & 4096) == 0) {
            this.n = 2;
        } else {
            this.n = i5;
        }
        if ((i & 8192) == 0) {
            this.o = false;
        } else {
            this.o = z2;
        }
        this.p = (i & 16384) == 0 ? kotlin.collections.b.f() : map2;
        this.q = (32768 & i) == 0 ? "" : str;
        if ((i & 65536) == 0) {
            this.r = false;
        } else {
            this.r = z3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$TaxiTracking;", "", "Companion", "Tariff", "$serializer", "com/yandex/go/superapp/orders/card/experiments/u", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TaxiTracking {
        public static final u Companion = new u();
        public static final i3y[] d;
        public final String a;
        public final Map b;
        public final ahw0 c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new cyv0(29)), kotlin.a.b(lazyThreadSafetyMode, new bhw0(0))};
        }

        public /* synthetic */ TaxiTracking(int i, String str, Map map, ahw0 ahw0Var) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = kotlin.collections.b.f();
            } else {
                this.b = map;
            }
            if ((i & 4) == 0) {
                this.c = r.INSTANCE;
            } else {
                this.c = ahw0Var;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$TaxiTracking$Tariff;", "", "Companion", "$serializer", "com/yandex/go/superapp/orders/card/experiments/v", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final class Tariff {
            public static final v Companion = new v();
            public final String a;

            public /* synthetic */ Tariff(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
            }

            /* renamed from: a, reason: from getter */
            public final String getA() {
                return this.a;
            }

            public Tariff() {
                this.a = null;
            }
        }

        public TaxiTracking() {
            Map f = kotlin.collections.b.f();
            r rVar = r.INSTANCE;
            this.a = null;
            this.b = f;
            this.c = rVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$ExternalServiceTracking;", "", "Companion", "Timeline", "$serializer", "com/yandex/go/superapp/orders/card/experiments/n", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ExternalServiceTracking {
        public static final n Companion = new n();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(23)), null};
        public final HorizontalPlacement a;
        public final Timeline b;

        public /* synthetic */ ExternalServiceTracking(int i, HorizontalPlacement horizontalPlacement, Timeline timeline) {
            this.a = (i & 1) == 0 ? HorizontalPlacement.Trail : horizontalPlacement;
            if ((i & 2) == 0) {
                this.b = new Timeline(0);
            } else {
                this.b = timeline;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$ExternalServiceTracking$Timeline;", "", "Companion", "Type", "$serializer", "com/yandex/go/superapp/orders/card/experiments/o", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes14.dex */
        public static final class Timeline {
            public static final o Companion = new o();
            public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(24))};
            public final Type a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$ExternalServiceTracking$Timeline$Type;", "", "None", "Circle", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
            public static final class Type {
                private static final /* synthetic */ k4o $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type Circle;
                public static final Type None;

                static {
                    Type type = new Type("None", 0);
                    None = type;
                    Type type2 = new Type("Circle", 1);
                    Circle = type2;
                    Type[] typeArr = {type, type2};
                    $VALUES = typeArr;
                    $ENTRIES = kotlin.enums.a.a(typeArr);
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public /* synthetic */ Timeline(int i, Type type) {
                if ((i & 1) == 0) {
                    this.a = Type.None;
                } else {
                    this.a = type;
                }
            }

            /* renamed from: a, reason: from getter */
            public final Type getA() {
                return this.a;
            }

            public Timeline() {
                this(0);
            }

            public Timeline(int i) {
                this.a = Type.None;
            }
        }

        public ExternalServiceTracking() {
            HorizontalPlacement horizontalPlacement = HorizontalPlacement.Trail;
            Timeline timeline = new Timeline(0);
            this.a = horizontalPlacement;
            this.b = timeline;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$DriveTracking;", "", "Companion", "com/yandex/go/superapp/orders/card/experiments/m", "$serializer", "com/yandex/go/superapp/orders/card/experiments/h", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DriveTracking {
        public static final h Companion = new h();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(20))};
        public final String a;
        public final m b;

        public /* synthetic */ DriveTracking(int i, String str, m mVar) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = k.INSTANCE;
            } else {
                this.b = mVar;
            }
        }

        public DriveTracking() {
            k kVar = k.INSTANCE;
            this.a = null;
            this.b = kVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$NavigatorTracking;", "", "Companion", "$serializer", "com/yandex/go/superapp/orders/card/experiments/p", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NavigatorTracking {
        public static final p Companion = new p();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(25))};
        public final String a;
        public final String b;
        public final HorizontalPlacement c;

        public /* synthetic */ NavigatorTracking(int i, String str, String str2, HorizontalPlacement horizontalPlacement) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = HorizontalPlacement.Trail;
            } else {
                this.c = horizontalPlacement;
            }
        }

        public NavigatorTracking() {
            HorizontalPlacement horizontalPlacement = HorizontalPlacement.Trail;
            this.a = null;
            this.b = null;
            this.c = horizontalPlacement;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$ScootersTracking;", "", "Companion", "$serializer", "com/yandex/go/superapp/orders/card/experiments/t", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ScootersTracking {
        public static final t Companion = new t();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cyv0(28))};
        public final String a;
        public final String b;
        public final ahw0 c;

        public /* synthetic */ ScootersTracking(int i, String str, String str2, ahw0 ahw0Var) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = r.INSTANCE;
            } else {
                this.c = ahw0Var;
            }
        }

        public ScootersTracking() {
            r rVar = r.INSTANCE;
            this.a = null;
            this.b = null;
            this.c = rVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$DeliveryTracking;", "", "Companion", "com/yandex/go/superapp/orders/card/experiments/g", "$serializer", "com/yandex/go/superapp/orders/card/experiments/c", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DeliveryTracking {
        public static final c Companion = new c();
        public static final i3y[] e;
        public final String a;
        public final HorizontalPlacement b;
        public final boolean c;
        public final g d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new cyv0(17)), null, kotlin.a.b(lazyThreadSafetyMode, new cyv0(18))};
        }

        public /* synthetic */ DeliveryTracking(int i, String str, HorizontalPlacement horizontalPlacement, boolean z, g gVar) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = HorizontalPlacement.Trail;
            } else {
                this.b = horizontalPlacement;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = e.INSTANCE;
            } else {
                this.d = gVar;
            }
        }

        public DeliveryTracking() {
            HorizontalPlacement horizontalPlacement = HorizontalPlacement.Trail;
            e eVar = e.INSTANCE;
            this.a = null;
            this.b = horizontalPlacement;
            this.c = false;
            this.d = eVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$TrackingCardColors;", "", "Companion", "$serializer", "com/yandex/go/superapp/orders/card/experiments/w", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class TrackingCardColors {
        public static final w Companion = new w();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ TrackingCardColors(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public static final /* synthetic */ void e(TrackingCardColors trackingCardColors, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(trackingCardColors.a, "")) {
                yjdVar.o(serialDescriptor, 0, trackingCardColors.a);
            }
            if (yjdVar.F() || trackingCardColors.b != null) {
                yjdVar.g(serialDescriptor, 1, auu0.a, trackingCardColors.b);
            }
            if (yjdVar.F() || !jl40.l(trackingCardColors.c, "")) {
                yjdVar.o(serialDescriptor, 2, trackingCardColors.c);
            }
            if (!yjdVar.F() && trackingCardColors.d == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 3, auu0.a, trackingCardColors.d);
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: d, reason: from getter */
        public final String getD() {
            return this.d;
        }

        public TrackingCardColors() {
            this.a = "";
            this.b = null;
            this.c = "";
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/orders/card/experiments/SuperappTrackingCardExperiment$ChargersTracking;", "", "Companion", "$serializer", "com/yandex/go/superapp/orders/card/experiments/a", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargersTracking {
        public static final a Companion = new a();
        public static final i3y[] f;
        public final String a;
        public final HorizontalPlacement b;
        public final boolean c;
        public final boolean d;
        public final ahw0 e;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new cyv0(15)), null, null, kotlin.a.b(lazyThreadSafetyMode, new cyv0(16))};
        }

        public /* synthetic */ ChargersTracking(int i, String str, HorizontalPlacement horizontalPlacement, boolean z, boolean z2, ahw0 ahw0Var) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = HorizontalPlacement.Trail;
            } else {
                this.b = horizontalPlacement;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z2;
            }
            if ((i & 16) == 0) {
                this.e = r.INSTANCE;
            } else {
                this.e = ahw0Var;
            }
        }

        public ChargersTracking() {
            HorizontalPlacement horizontalPlacement = HorizontalPlacement.Trail;
            r rVar = r.INSTANCE;
            this.a = null;
            this.b = horizontalPlacement;
            this.c = false;
            this.d = false;
            this.e = rVar;
        }
    }

    public SuperappTrackingCardExperiment() {
        this(0);
    }

    public SuperappTrackingCardExperiment(int i) {
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = 64;
        this.l = 12;
        this.m = 2;
        this.n = 2;
        this.o = false;
        this.p = f2;
        this.q = "";
        this.r = false;
    }
}
