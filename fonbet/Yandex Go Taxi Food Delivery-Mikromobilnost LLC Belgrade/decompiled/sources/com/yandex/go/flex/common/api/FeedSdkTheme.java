package com.yandex.go.flex.common.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/flex/common/api/FeedSdkTheme;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "DARK", "LIGHT", "ULTIMA_LIGHT", "ULTIMA_DARK", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FeedSdkTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeedSdkTheme[] $VALUES;
    public static final FeedSdkTheme DARK;
    public static final FeedSdkTheme LIGHT;
    public static final FeedSdkTheme ULTIMA_DARK;
    public static final FeedSdkTheme ULTIMA_LIGHT;
    private final String id;

    static {
        FeedSdkTheme feedSdkTheme = new FeedSdkTheme("DARK", 0, "dark");
        DARK = feedSdkTheme;
        FeedSdkTheme feedSdkTheme2 = new FeedSdkTheme("LIGHT", 1, "light");
        LIGHT = feedSdkTheme2;
        FeedSdkTheme feedSdkTheme3 = new FeedSdkTheme("ULTIMA_LIGHT", 2, "ultimaLight");
        ULTIMA_LIGHT = feedSdkTheme3;
        FeedSdkTheme feedSdkTheme4 = new FeedSdkTheme("ULTIMA_DARK", 3, "ultimaDark");
        ULTIMA_DARK = feedSdkTheme4;
        FeedSdkTheme[] feedSdkThemeArr = {feedSdkTheme, feedSdkTheme2, feedSdkTheme3, feedSdkTheme4};
        $VALUES = feedSdkThemeArr;
        $ENTRIES = kotlin.enums.a.a(feedSdkThemeArr);
    }

    public FeedSdkTheme(String str, int i, String str2) {
        this.id = str2;
    }

    public static FeedSdkTheme valueOf(String str) {
        return (FeedSdkTheme) Enum.valueOf(FeedSdkTheme.class, str);
    }

    public static FeedSdkTheme[] values() {
        return (FeedSdkTheme[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
