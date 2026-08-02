package com.yandex.browser.rtm;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/browser/rtm/Platform;", "", "", "tag", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PHONE", "TABLET", "APP", "TV", "TVAPP", "STATION", "UNSUPPORTED", "lib-redir-log"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Platform {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Platform[] $VALUES;
    public static final Platform APP;
    public static final Platform PHONE;
    public static final Platform STATION;
    public static final Platform TABLET;
    public static final Platform TV;
    public static final Platform TVAPP;
    public static final Platform UNSUPPORTED;
    private final String tag;

    static {
        Platform platform = new Platform("PHONE", 0, "touch");
        PHONE = platform;
        Platform platform2 = new Platform("TABLET", 1, "pad");
        TABLET = platform2;
        Platform platform3 = new Platform("APP", 2, "app");
        APP = platform3;
        Platform platform4 = new Platform("TV", 3, "tv");
        TV = platform4;
        Platform platform5 = new Platform("TVAPP", 4, "tvapp");
        TVAPP = platform5;
        Platform platform6 = new Platform("STATION", 5, "station");
        STATION = platform6;
        Platform platform7 = new Platform("UNSUPPORTED", 6, "unsupported");
        UNSUPPORTED = platform7;
        Platform[] platformArr = {platform, platform2, platform3, platform4, platform5, platform6, platform7};
        $VALUES = platformArr;
        $ENTRIES = a.a(platformArr);
    }

    public Platform(String str, int i, String str2) {
        this.tag = str2;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTag() {
        return this.tag;
    }
}
