package com.yandex.go.external_service.preloader;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.uiv0;
import defpackage.vn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.video.m3.preload_manager.tracking.PreloadEventTracker;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/external_service/preloader/SuperAppConfigEatsKitStaticExperiment;", "Lvn11;", "Companion", "Type", "BundleStrategy", "com/yandex/go/external_service/preloader/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppConfigEatsKitStaticExperiment implements vn11 {
    public static final c Companion = new c();
    public static final i3y[] h;
    public static final SuperAppConfigEatsKitStaticExperiment i;
    public final Type b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final BundleStrategy g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/external_service/preloader/SuperAppConfigEatsKitStaticExperiment$BundleStrategy;", "", "Companion", "com/yandex/go/external_service/preloader/b", "NORMAL", PreloadEventTracker.PRELOAD_ERROR_CATEGORY, "IGNORE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BundleStrategy {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BundleStrategy[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final BundleStrategy IGNORE;
        public static final BundleStrategy NORMAL;
        public static final BundleStrategy PRELOAD;

        static {
            BundleStrategy bundleStrategy = new BundleStrategy("NORMAL", 0);
            NORMAL = bundleStrategy;
            BundleStrategy bundleStrategy2 = new BundleStrategy(PreloadEventTracker.PRELOAD_ERROR_CATEGORY, 1);
            PRELOAD = bundleStrategy2;
            BundleStrategy bundleStrategy3 = new BundleStrategy("IGNORE", 2);
            IGNORE = bundleStrategy3;
            BundleStrategy[] bundleStrategyArr = {bundleStrategy, bundleStrategy2, bundleStrategy3};
            $VALUES = bundleStrategyArr;
            $ENTRIES = kotlin.enums.a.a(bundleStrategyArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(26));
        }

        public static BundleStrategy valueOf(String str) {
            return (BundleStrategy) Enum.valueOf(BundleStrategy.class, str);
        }

        public static BundleStrategy[] values() {
            return (BundleStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/external_service/preloader/SuperAppConfigEatsKitStaticExperiment$Type;", "", "Companion", "com/yandex/go/external_service/preloader/d", JCP.RAW_PREFIX, "LCP", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final Type LCP;
        public static final Type NONE;

        static {
            Type type = new Type(JCP.RAW_PREFIX, 0);
            NONE = type;
            Type type2 = new Type("LCP", 1);
            LCP = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(27));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new uiv0(24)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new uiv0(25))};
        i = new SuperAppConfigEatsKitStaticExperiment(0);
    }

    public /* synthetic */ SuperAppConfigEatsKitStaticExperiment(int i2, Type type, int i3, int i4, int i5, int i6, BundleStrategy bundleStrategy) {
        this.b = (i2 & 1) == 0 ? Type.NONE : type;
        if ((i2 & 2) == 0) {
            this.c = -1;
        } else {
            this.c = i3;
        }
        if ((i2 & 4) == 0) {
            this.d = -1;
        } else {
            this.d = i4;
        }
        if ((i2 & 8) == 0) {
            this.e = -1;
        } else {
            this.e = i5;
        }
        if ((i2 & 16) == 0) {
            this.f = -1;
        } else {
            this.f = i6;
        }
        if ((i2 & 32) == 0) {
            this.g = BundleStrategy.NORMAL;
        } else {
            this.g = bundleStrategy;
        }
    }

    public SuperAppConfigEatsKitStaticExperiment() {
        this(0);
    }

    public SuperAppConfigEatsKitStaticExperiment(int i2) {
        Type type = Type.NONE;
        BundleStrategy bundleStrategy = BundleStrategy.NORMAL;
        this.b = type;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = bundleStrategy;
    }
}
