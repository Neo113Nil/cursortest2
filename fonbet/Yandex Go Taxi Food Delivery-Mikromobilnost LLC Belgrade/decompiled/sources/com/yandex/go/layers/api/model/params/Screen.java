package com.yandex.go.layers.api.model.params;

import defpackage.czo0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.rbp0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/layers/api/model/params/Screen;", "", "", "analyticsName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "rbp0", "MAIN", "CHOOSE_A", "CHOOSE_B", "CHOOSE_MID", "CHOOSE_USERPLACE", "TOTW", "MULTIORDER", "SUMMARY", "DISCOVERY", "SUPERAPP_DISCOVERY_MAP", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Screen[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Screen CHOOSE_A;
    public static final Screen CHOOSE_B;
    public static final Screen CHOOSE_MID;
    public static final Screen CHOOSE_USERPLACE;
    public static final rbp0 Companion;
    public static final Screen DISCOVERY;
    public static final Screen MAIN;
    public static final Screen MULTIORDER;
    public static final Screen SUMMARY;
    public static final Screen SUPERAPP_DISCOVERY_MAP;
    public static final Screen TOTW;
    private final String analyticsName;

    static {
        Screen screen = new Screen("MAIN", 0, "main");
        MAIN = screen;
        Screen screen2 = new Screen("CHOOSE_A", 1, "choose_a");
        CHOOSE_A = screen2;
        Screen screen3 = new Screen("CHOOSE_B", 2, "choose_b");
        CHOOSE_B = screen3;
        Screen screen4 = new Screen("CHOOSE_MID", 3, "choose_mid");
        CHOOSE_MID = screen4;
        Screen screen5 = new Screen("CHOOSE_USERPLACE", 4, "choose_userplace");
        CHOOSE_USERPLACE = screen5;
        Screen screen6 = new Screen("TOTW", 5, "totw");
        TOTW = screen6;
        Screen screen7 = new Screen("MULTIORDER", 6, "multiorder");
        MULTIORDER = screen7;
        Screen screen8 = new Screen("SUMMARY", 7, "summary");
        SUMMARY = screen8;
        Screen screen9 = new Screen("DISCOVERY", 8, "discovery");
        DISCOVERY = screen9;
        Screen screen10 = new Screen("SUPERAPP_DISCOVERY_MAP", 9, "superapp_discovery_map");
        SUPERAPP_DISCOVERY_MAP = screen10;
        Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6, screen7, screen8, screen9, screen10};
        $VALUES = screenArr;
        $ENTRIES = kotlin.enums.a.a(screenArr);
        Companion = new rbp0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(16));
    }

    public Screen(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
