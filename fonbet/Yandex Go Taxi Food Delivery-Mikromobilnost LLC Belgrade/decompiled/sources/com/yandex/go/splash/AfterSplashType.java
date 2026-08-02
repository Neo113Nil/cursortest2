package com.yandex.go.splash;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/splash/AfterSplashType;", "", JCP.RAW_PREFIX, "WELCOME", "V2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AfterSplashType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AfterSplashType[] $VALUES;
    public static final AfterSplashType NONE;
    public static final AfterSplashType V2;
    public static final AfterSplashType WELCOME;

    static {
        AfterSplashType afterSplashType = new AfterSplashType(JCP.RAW_PREFIX, 0);
        NONE = afterSplashType;
        AfterSplashType afterSplashType2 = new AfterSplashType("WELCOME", 1);
        WELCOME = afterSplashType2;
        AfterSplashType afterSplashType3 = new AfterSplashType("V2", 2);
        V2 = afterSplashType3;
        AfterSplashType[] afterSplashTypeArr = {afterSplashType, afterSplashType2, afterSplashType3};
        $VALUES = afterSplashTypeArr;
        $ENTRIES = a.a(afterSplashTypeArr);
    }

    public static AfterSplashType valueOf(String str) {
        return (AfterSplashType) Enum.valueOf(AfterSplashType.class, str);
    }

    public static AfterSplashType[] values() {
        return (AfterSplashType[]) $VALUES.clone();
    }
}
