package com.yandex.xplat.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/xplat/common/HashType;", "", "Md5", "Sha256", "Sha512", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HashType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HashType[] $VALUES;
    public static final HashType Md5;
    public static final HashType Sha256;
    public static final HashType Sha512;

    static {
        HashType hashType = new HashType("Md5", 0);
        Md5 = hashType;
        HashType hashType2 = new HashType("Sha256", 1);
        Sha256 = hashType2;
        HashType hashType3 = new HashType("Sha512", 2);
        Sha512 = hashType3;
        HashType[] hashTypeArr = {hashType, hashType2, hashType3};
        $VALUES = hashTypeArr;
        $ENTRIES = kotlin.enums.a.a(hashTypeArr);
    }

    public static HashType valueOf(String str) {
        return (HashType) Enum.valueOf(HashType.class, str);
    }

    public static HashType[] values() {
        return (HashType[]) $VALUES.clone();
    }
}
