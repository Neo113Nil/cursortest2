package com.yandex.go.scooters.parking.data.model;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.zqn0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/parking/data/model/ScootersParkingDescriptionExperiment;", "Lw96;", "Lc6z;", "Companion", "Content", "com/yandex/go/scooters/parking/data/model/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersParkingDescriptionExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(18)), null};
    public static final ScootersParkingDescriptionExperiment f = new ScootersParkingDescriptionExperiment(0);
    public final boolean b;
    public final Map c;
    public final Content d;

    public /* synthetic */ ScootersParkingDescriptionExperiment(int i, boolean z, Map map, Content content) {
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
            this.d = new Content(0);
        } else {
            this.d = content;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/parking/data/model/ScootersParkingDescriptionExperiment$Content;", "", "Companion", "Item", "PanoramaOnboarding", "$serializer", "com/yandex/go/scooters/parking/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Content {
        public static final b Companion = new b();
        public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(19)), null};
        public final String a;
        public final List b;
        public final PanoramaOnboarding c;

        public /* synthetic */ Content(int i, String str, List list, PanoramaOnboarding panoramaOnboarding) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = new PanoramaOnboarding(0);
            } else {
                this.c = panoramaOnboarding;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/parking/data/model/ScootersParkingDescriptionExperiment$Content$PanoramaOnboarding;", "", "Companion", "PhotoCompletion", "$serializer", "com/yandex/go/scooters/parking/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PanoramaOnboarding {
            public static final d Companion = new d();
            public final String a;
            public final long b;
            public final int c;
            public final PhotoCompletion d;

            public /* synthetic */ PanoramaOnboarding(int i, String str, long j, int i2, PhotoCompletion photoCompletion) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = 3000L;
                } else {
                    this.b = j;
                }
                if ((i & 4) == 0) {
                    this.c = 1;
                } else {
                    this.c = i2;
                }
                if ((i & 8) == 0) {
                    this.d = new PhotoCompletion(0);
                } else {
                    this.d = photoCompletion;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/parking/data/model/ScootersParkingDescriptionExperiment$Content$PanoramaOnboarding$PhotoCompletion;", "", "Companion", "$serializer", "com/yandex/go/scooters/parking/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class PhotoCompletion {
                public static final e Companion = new e();
                public final String a;

                public /* synthetic */ PhotoCompletion(int i, String str) {
                    if ((i & 1) == 0) {
                        this.a = "";
                    } else {
                        this.a = str;
                    }
                }

                public PhotoCompletion(int i) {
                    this.a = "";
                }

                public PhotoCompletion() {
                    this(0);
                }
            }

            public PanoramaOnboarding() {
                this(0);
            }

            public PanoramaOnboarding(int i) {
                PhotoCompletion photoCompletion = new PhotoCompletion(0);
                this.a = "";
                this.b = 3000L;
                this.c = 1;
                this.d = photoCompletion;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/parking/data/model/ScootersParkingDescriptionExperiment$Content$Item;", "", "Companion", "$serializer", "com/yandex/go/scooters/parking/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Item {
            public static final c Companion = new c();
            public final String a;
            public final String b;

            public /* synthetic */ Item(int i, String str, String str2) {
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
            }

            public Item() {
                this.a = "";
                this.b = "";
            }
        }

        public Content() {
            this(0);
        }

        public Content(int i) {
            PanoramaOnboarding panoramaOnboarding = new PanoramaOnboarding(0);
            this.a = "";
            this.b = EmptyList.a;
            this.c = panoramaOnboarding;
        }
    }

    public ScootersParkingDescriptionExperiment() {
        this(0);
    }

    public ScootersParkingDescriptionExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        Content content = new Content(0);
        this.b = false;
        this.c = f2;
        this.d = content;
    }
}
