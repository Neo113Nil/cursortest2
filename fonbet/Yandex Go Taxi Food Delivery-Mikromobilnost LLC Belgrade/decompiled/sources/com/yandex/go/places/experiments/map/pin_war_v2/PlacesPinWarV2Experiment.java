package com.yandex.go.places.experiments.map.pin_war_v2;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.fvb0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.l1b0;
import defpackage.qje;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00022\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment;", "Lw96;", "Companion", "PinsParameters", "Clustering", "PinStyleVariantConfig", "TextLinesConfig", "LabelRenderingMode", "TextLinesLimit", "CameraRedrawMode", "Animation", "GeometryEasing", "ZoomStep", "com/yandex/go/places/experiments/map/pin_war_v2/e", "$serializer", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlacesPinWarV2Experiment extends w96 {
    public static final e Companion = new e();
    public static final PlacesPinWarV2Experiment m = new PlacesPinWarV2Experiment(0);
    public final boolean b;
    public final Float c;
    public final Float d;
    public final Integer e;
    public final PinsParameters f;
    public final PinsParameters g;
    public final PinsParameters h;
    public final Clustering i;
    public final Animation j;
    public final CameraRedrawMode k;
    public final PinStyleVariantConfig l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$CameraRedrawMode;", "", "Companion", "Mode", "$serializer", "com/yandex/go/places/experiments/map/pin_war_v2/b", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CameraRedrawMode {
        public static final b Companion = new b();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(23)), null};
        public final Mode a;
        public final Long b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$CameraRedrawMode$Mode;", "", "Companion", "com/yandex/go/places/experiments/map/pin_war_v2/c", "IMMEDIATE", "NEVER", "DEFERRED_WITH_TIMEOUT", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Mode {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Mode[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
            public static final Mode DEFERRED_WITH_TIMEOUT;
            public static final Mode IMMEDIATE;
            public static final Mode NEVER;

            static {
                Mode mode = new Mode("IMMEDIATE", 0);
                IMMEDIATE = mode;
                Mode mode2 = new Mode("NEVER", 1);
                NEVER = mode2;
                Mode mode3 = new Mode("DEFERRED_WITH_TIMEOUT", 2);
                DEFERRED_WITH_TIMEOUT = mode3;
                Mode[] modeArr = {mode, mode2, mode3};
                $VALUES = modeArr;
                $ENTRIES = kotlin.enums.a.a(modeArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(24));
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }
        }

        public /* synthetic */ CameraRedrawMode(int i, Mode mode, Long l) {
            if (1 != (i & 1)) {
                qje.Z(i, 1, PlacesPinWarV2Experiment$CameraRedrawMode$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = mode;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = l;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$GeometryEasing;", "", "Companion", "com/yandex/go/places/experiments/map/pin_war_v2/f", "LINEAR", "EASE_IN", "EASE_OUT", "EASE_IN_OUT", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class GeometryEasing {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ GeometryEasing[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f Companion;
        public static final GeometryEasing EASE_IN;
        public static final GeometryEasing EASE_IN_OUT;
        public static final GeometryEasing EASE_OUT;
        public static final GeometryEasing LINEAR;

        static {
            GeometryEasing geometryEasing = new GeometryEasing("LINEAR", 0);
            LINEAR = geometryEasing;
            GeometryEasing geometryEasing2 = new GeometryEasing("EASE_IN", 1);
            EASE_IN = geometryEasing2;
            GeometryEasing geometryEasing3 = new GeometryEasing("EASE_OUT", 2);
            EASE_OUT = geometryEasing3;
            GeometryEasing geometryEasing4 = new GeometryEasing("EASE_IN_OUT", 3);
            EASE_IN_OUT = geometryEasing4;
            GeometryEasing[] geometryEasingArr = {geometryEasing, geometryEasing2, geometryEasing3, geometryEasing4};
            $VALUES = geometryEasingArr;
            $ENTRIES = kotlin.enums.a.a(geometryEasingArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(20));
        }

        public static GeometryEasing valueOf(String str) {
            return (GeometryEasing) Enum.valueOf(GeometryEasing.class, str);
        }

        public static GeometryEasing[] values() {
            return (GeometryEasing[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$LabelRenderingMode;", "", "Companion", "com/yandex/go/places/experiments/map/pin_war_v2/g", "INDEPENDENT_LABEL", "EMBEDDED_IN_ICON", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class LabelRenderingMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LabelRenderingMode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final g Companion;
        public static final LabelRenderingMode EMBEDDED_IN_ICON;
        public static final LabelRenderingMode INDEPENDENT_LABEL;

        static {
            LabelRenderingMode labelRenderingMode = new LabelRenderingMode("INDEPENDENT_LABEL", 0);
            INDEPENDENT_LABEL = labelRenderingMode;
            LabelRenderingMode labelRenderingMode2 = new LabelRenderingMode("EMBEDDED_IN_ICON", 1);
            EMBEDDED_IN_ICON = labelRenderingMode2;
            LabelRenderingMode[] labelRenderingModeArr = {labelRenderingMode, labelRenderingMode2};
            $VALUES = labelRenderingModeArr;
            $ENTRIES = kotlin.enums.a.a(labelRenderingModeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(21));
        }

        public static LabelRenderingMode valueOf(String str) {
            return (LabelRenderingMode) Enum.valueOf(LabelRenderingMode.class, str);
        }

        public static LabelRenderingMode[] values() {
            return (LabelRenderingMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$ZoomStep;", "", "Companion", "com/yandex/go/places/experiments/map/pin_war_v2/l", "FULL", "HALF", "QUARTER", "EIGHTH", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ZoomStep {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ZoomStep[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final l Companion;
        public static final ZoomStep EIGHTH;
        public static final ZoomStep FULL;
        public static final ZoomStep HALF;
        public static final ZoomStep QUARTER;

        static {
            ZoomStep zoomStep = new ZoomStep("FULL", 0);
            FULL = zoomStep;
            ZoomStep zoomStep2 = new ZoomStep("HALF", 1);
            HALF = zoomStep2;
            ZoomStep zoomStep3 = new ZoomStep("QUARTER", 2);
            QUARTER = zoomStep3;
            ZoomStep zoomStep4 = new ZoomStep("EIGHTH", 3);
            EIGHTH = zoomStep4;
            ZoomStep[] zoomStepArr = {zoomStep, zoomStep2, zoomStep3, zoomStep4};
            $VALUES = zoomStepArr;
            $ENTRIES = kotlin.enums.a.a(zoomStepArr);
            Companion = new l();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(26));
        }

        public static ZoomStep valueOf(String str) {
            return (ZoomStep) Enum.valueOf(ZoomStep.class, str);
        }

        public static ZoomStep[] values() {
            return (ZoomStep[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PlacesPinWarV2Experiment(int i, boolean z, Float f, Float f2, Integer num, PinsParameters pinsParameters, PinsParameters pinsParameters2, PinsParameters pinsParameters3, Clustering clustering, Animation animation, CameraRedrawMode cameraRedrawMode, PinStyleVariantConfig pinStyleVariantConfig) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = f2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = pinsParameters;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = pinsParameters2;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = pinsParameters3;
        }
        if ((i & 128) == 0) {
            this.i = new Clustering(0);
        } else {
            this.i = clustering;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = animation;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = cameraRedrawMode;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = pinStyleVariantConfig;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$PinStyleVariantConfig;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/pin_war_v2/h", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PinStyleVariantConfig {
        public static final h Companion = new h();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(22))};
        public final List a;

        public /* synthetic */ PinStyleVariantConfig(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public PinStyleVariantConfig() {
            this.a = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$PinsParameters;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/pin_war_v2/i", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PinsParameters {
        public static final i Companion = new i();
        public final Float a;
        public final Float b;

        public /* synthetic */ PinsParameters(int i, Float f, Float f2) {
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

        public PinsParameters() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$TextLinesLimit;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/pin_war_v2/k", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class TextLinesLimit {
        public static final k Companion = new k();
        public final Integer a;
        public final Integer b;

        public /* synthetic */ TextLinesLimit(int i, Integer num, Integer num2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num2;
            }
        }

        public TextLinesLimit() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$TextLinesConfig;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/pin_war_v2/j", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class TextLinesConfig {
        public static final j Companion = new j();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(23))};
        public final String a;
        public final TextLinesLimit b;
        public final LabelRenderingMode c;

        public /* synthetic */ TextLinesConfig(int i, String str, TextLinesLimit textLinesLimit, LabelRenderingMode labelRenderingMode) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = textLinesLimit;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = labelRenderingMode;
            }
        }

        public TextLinesConfig() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$Animation;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/pin_war_v2/a", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Animation {
        public static final a Companion = new a();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(19))};
        public final Float a;
        public final Double b;
        public final Double c;
        public final GeometryEasing d;

        public /* synthetic */ Animation(int i, Float f, Double d, Double d2, GeometryEasing geometryEasing) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = d;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = d2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = geometryEasing;
            }
        }

        public Animation() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/map/pin_war_v2/PlacesPinWarV2Experiment$Clustering;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/map/pin_war_v2/d", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Clustering {
        public static final d Companion = new d();
        public static final i3y[] j = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(25)), null, null, null, null};
        public final boolean a;
        public final Integer b;
        public final Float c;
        public final CameraRedrawMode d;
        public final ZoomStep e;
        public final Animation f;
        public final Float g;
        public final PinStyleVariantConfig h;
        public final ImageDto i;

        public /* synthetic */ Clustering(int i, boolean z, Integer num, Float f, CameraRedrawMode cameraRedrawMode, ZoomStep zoomStep, Animation animation, Float f2, PinStyleVariantConfig pinStyleVariantConfig, ImageDto imageDto) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = f;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = cameraRedrawMode;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = zoomStep;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = animation;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = f2;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = pinStyleVariantConfig;
            }
            if ((i & 256) == 0) {
                this.i = new ImageDto(0);
            } else {
                this.i = imageDto;
            }
        }

        public Clustering() {
            this(0);
        }

        public Clustering(int i) {
            ImageDto imageDto = new ImageDto(0);
            this.a = false;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = imageDto;
        }
    }

    public PlacesPinWarV2Experiment() {
        this(0);
    }

    public PlacesPinWarV2Experiment(int i) {
        Clustering clustering = new Clustering(0);
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = clustering;
        this.j = null;
        this.k = null;
        this.l = null;
    }
}
