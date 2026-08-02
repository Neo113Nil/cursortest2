package com.yandex.fintechsdk.entities.region;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/fintechsdk/entities/region/Region;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "RU", "UZ", "entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Region {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Region[] $VALUES;
    public static final Region RU;
    public static final Region UZ;
    private final String key;

    static {
        Region region = new Region("RU", 0, ClearCryptoProPrefs.COUNTRY);
        RU = region;
        Region region2 = new Region("UZ", 1, "uz");
        UZ = region2;
        Region[] regionArr = {region, region2};
        $VALUES = regionArr;
        $ENTRIES = a.a(regionArr);
    }

    public Region(String str, int i, String str2) {
        this.key = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static Region valueOf(String str) {
        return (Region) Enum.valueOf(Region.class, str);
    }

    public static Region[] values() {
        return (Region[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
