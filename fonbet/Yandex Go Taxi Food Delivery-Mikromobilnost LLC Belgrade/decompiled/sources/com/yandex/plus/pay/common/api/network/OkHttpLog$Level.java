package com.yandex.plus.pay.common.api.network;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/pay/common/api/network/OkHttpLog$Level", "", "Lcom/yandex/plus/pay/common/api/network/OkHttpLog$Level;", JCP.RAW_PREFIX, "BASIC", "HEADERS", "BODY", "pay-sdk-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OkHttpLog$Level {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OkHttpLog$Level[] $VALUES;
    public static final OkHttpLog$Level BASIC;
    public static final OkHttpLog$Level BODY;
    public static final OkHttpLog$Level HEADERS;
    public static final OkHttpLog$Level NONE;

    static {
        OkHttpLog$Level okHttpLog$Level = new OkHttpLog$Level(JCP.RAW_PREFIX, 0);
        NONE = okHttpLog$Level;
        OkHttpLog$Level okHttpLog$Level2 = new OkHttpLog$Level("BASIC", 1);
        BASIC = okHttpLog$Level2;
        OkHttpLog$Level okHttpLog$Level3 = new OkHttpLog$Level("HEADERS", 2);
        HEADERS = okHttpLog$Level3;
        OkHttpLog$Level okHttpLog$Level4 = new OkHttpLog$Level("BODY", 3);
        BODY = okHttpLog$Level4;
        OkHttpLog$Level[] okHttpLog$LevelArr = {okHttpLog$Level, okHttpLog$Level2, okHttpLog$Level3, okHttpLog$Level4};
        $VALUES = okHttpLog$LevelArr;
        $ENTRIES = a.a(okHttpLog$LevelArr);
    }

    public static OkHttpLog$Level valueOf(String str) {
        return (OkHttpLog$Level) Enum.valueOf(OkHttpLog$Level.class, str);
    }

    public static OkHttpLog$Level[] values() {
        return (OkHttpLog$Level[]) $VALUES.clone();
    }
}
