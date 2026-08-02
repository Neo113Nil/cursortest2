package com.yandex.go.blur.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.q03;
import defpackage.r66;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/blur/experiments/BlurConfigurationExperiment;", "Lvn11;", "Companion", "AgslRenderEffect", "SystemRenderEffect", "Scrim", "DevicePerformanceClass", "com/yandex/go/blur/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlurConfigurationExperiment implements vn11 {
    public static final b Companion = new b();
    public static final BlurConfigurationExperiment f = new BlurConfigurationExperiment(0);
    public final AgslRenderEffect b;
    public final SystemRenderEffect c;
    public final Scrim d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/blur/experiments/BlurConfigurationExperiment$DevicePerformanceClass;", "", "Companion", "com/yandex/go/blur/experiments/c", "LOW", "MEDIUM", "HIGH", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DevicePerformanceClass {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DevicePerformanceClass[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c Companion;
        public static final DevicePerformanceClass HIGH;
        public static final DevicePerformanceClass LOW;
        public static final DevicePerformanceClass MEDIUM;

        static {
            DevicePerformanceClass devicePerformanceClass = new DevicePerformanceClass("LOW", 0);
            LOW = devicePerformanceClass;
            DevicePerformanceClass devicePerformanceClass2 = new DevicePerformanceClass("MEDIUM", 1);
            MEDIUM = devicePerformanceClass2;
            DevicePerformanceClass devicePerformanceClass3 = new DevicePerformanceClass("HIGH", 2);
            HIGH = devicePerformanceClass3;
            DevicePerformanceClass[] devicePerformanceClassArr = {devicePerformanceClass, devicePerformanceClass2, devicePerformanceClass3};
            $VALUES = devicePerformanceClassArr;
            $ENTRIES = kotlin.enums.a.a(devicePerformanceClassArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(0));
        }

        public static DevicePerformanceClass valueOf(String str) {
            return (DevicePerformanceClass) Enum.valueOf(DevicePerformanceClass.class, str);
        }

        public static DevicePerformanceClass[] values() {
            return (DevicePerformanceClass[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BlurConfigurationExperiment(int i, AgslRenderEffect agslRenderEffect, SystemRenderEffect systemRenderEffect, Scrim scrim, boolean z) {
        this.b = (i & 1) == 0 ? new AgslRenderEffect(0) : agslRenderEffect;
        if ((i & 2) == 0) {
            this.c = new SystemRenderEffect(0);
        } else {
            this.c = systemRenderEffect;
        }
        if ((i & 4) == 0) {
            this.d = new Scrim(0);
        } else {
            this.d = scrim;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/blur/experiments/BlurConfigurationExperiment$Scrim;", "", "Companion", "$serializer", "com/yandex/go/blur/experiments/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Scrim {
        public static final d Companion = new d();
        public final boolean a;
        public final String b;
        public final String c;

        public /* synthetic */ Scrim(String str, int i, String str2, boolean z) {
            this.a = (i & 1) == 0 ? true : z;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public Scrim(int i) {
            this.a = true;
            this.b = "";
            this.c = "";
        }

        public Scrim() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/blur/experiments/BlurConfigurationExperiment$AgslRenderEffect;", "", "Companion", "$serializer", "com/yandex/go/blur/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AgslRenderEffect {
        public static final a Companion = new a();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(29))};
        public final boolean a;
        public final int b;
        public final DevicePerformanceClass c;

        public /* synthetic */ AgslRenderEffect(int i, boolean z, int i2, DevicePerformanceClass devicePerformanceClass) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = 20;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = devicePerformanceClass;
            }
        }

        public AgslRenderEffect(int i) {
            this.a = false;
            this.b = 20;
            this.c = null;
        }

        public AgslRenderEffect() {
            this(0);
        }
    }

    public BlurConfigurationExperiment() {
        this(0);
    }

    public BlurConfigurationExperiment(int i) {
        AgslRenderEffect agslRenderEffect = new AgslRenderEffect(0);
        SystemRenderEffect systemRenderEffect = new SystemRenderEffect(0);
        Scrim scrim = new Scrim(0);
        this.b = agslRenderEffect;
        this.c = systemRenderEffect;
        this.d = scrim;
        this.e = false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/blur/experiments/BlurConfigurationExperiment$SystemRenderEffect;", "", "Companion", "$serializer", "com/yandex/go/blur/experiments/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SystemRenderEffect {
        public static final e Companion = new e();
        public static final i3y[] h = {null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(1))};
        public final boolean a;
        public final boolean b;
        public final int c;
        public final boolean d;
        public final int e;
        public final int f;
        public final DevicePerformanceClass g;

        public /* synthetic */ SystemRenderEffect(int i, boolean z, boolean z2, int i2, boolean z3, int i3, int i4, DevicePerformanceClass devicePerformanceClass) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = 2;
            } else {
                this.c = i2;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z3;
            }
            if ((i & 16) == 0) {
                this.e = 128;
            } else {
                this.e = i3;
            }
            if ((i & 32) == 0) {
                this.f = 64;
            } else {
                this.f = i4;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = devicePerformanceClass;
            }
        }

        public SystemRenderEffect(int i) {
            this.a = false;
            this.b = false;
            this.c = 2;
            this.d = false;
            this.e = 128;
            this.f = 64;
            this.g = null;
        }

        public SystemRenderEffect() {
            this(0);
        }
    }
}
