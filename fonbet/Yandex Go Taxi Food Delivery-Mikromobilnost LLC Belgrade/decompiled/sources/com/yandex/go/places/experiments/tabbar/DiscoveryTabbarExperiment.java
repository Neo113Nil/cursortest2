package com.yandex.go.places.experiments.tabbar;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w96;
import defpackage.xyi;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/places/experiments/tabbar/DiscoveryTabbarExperiment;", "Lw96;", "Lc6z;", "Companion", "DiscoveryTab", "DiscoveryTabType", "com/yandex/go/places/experiments/tabbar/c", "$serializer", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DiscoveryTabbarExperiment extends w96 implements c6z {
    public static final c Companion = new c();
    public static final i3y[] e;
    public static final DiscoveryTabbarExperiment f;
    public final boolean b;
    public final Map c;
    public final List d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/places/experiments/tabbar/DiscoveryTabbarExperiment$DiscoveryTabType;", "", "Companion", "com/yandex/go/places/experiments/tabbar/e", "NATIVE_TAB", "FLEX_TAB", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DiscoveryTabType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DiscoveryTabType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final e Companion;
        public static final DiscoveryTabType FLEX_TAB;
        public static final DiscoveryTabType NATIVE_TAB;

        static {
            DiscoveryTabType discoveryTabType = new DiscoveryTabType("NATIVE_TAB", 0);
            NATIVE_TAB = discoveryTabType;
            DiscoveryTabType discoveryTabType2 = new DiscoveryTabType("FLEX_TAB", 1);
            FLEX_TAB = discoveryTabType2;
            DiscoveryTabType[] discoveryTabTypeArr = {discoveryTabType, discoveryTabType2};
            $VALUES = discoveryTabTypeArr;
            $ENTRIES = kotlin.enums.a.a(discoveryTabTypeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(11));
        }

        public static DiscoveryTabType valueOf(String str) {
            return (DiscoveryTabType) Enum.valueOf(DiscoveryTabType.class, str);
        }

        public static DiscoveryTabType[] values() {
            return (DiscoveryTabType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new xyi(8)), kotlin.a.b(lazyThreadSafetyMode, new xyi(9))};
        f = new DiscoveryTabbarExperiment(0);
    }

    public /* synthetic */ DiscoveryTabbarExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public DiscoveryTabbarExperiment() {
        this(0);
    }

    public DiscoveryTabbarExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/tabbar/DiscoveryTabbarExperiment$DiscoveryTab;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/tabbar/d", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DiscoveryTab {
        public static final d Companion = new d();
        public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(10))};
        public final boolean a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final DiscoveryTabType f;

        public /* synthetic */ DiscoveryTab(int i, boolean z, String str, String str2, String str3, String str4, DiscoveryTabType discoveryTabType) {
            this.a = (i & 1) == 0 ? false : z;
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
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = discoveryTabType;
            }
        }

        public DiscoveryTab() {
            this.a = false;
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = null;
        }
    }
}
