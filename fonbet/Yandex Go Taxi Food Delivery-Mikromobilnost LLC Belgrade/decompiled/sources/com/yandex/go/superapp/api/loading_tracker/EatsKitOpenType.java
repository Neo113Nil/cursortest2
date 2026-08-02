package com.yandex.go.superapp.api.loading_tracker;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/superapp/api/loading_tracker/EatsKitOpenType;", "", "", "key", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "INITIAL", "CACHE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EatsKitOpenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EatsKitOpenType[] $VALUES;
    public static final EatsKitOpenType CACHE;
    public static final EatsKitOpenType INITIAL;
    private final String key;

    static {
        EatsKitOpenType eatsKitOpenType = new EatsKitOpenType("INITIAL", 0, "initial");
        INITIAL = eatsKitOpenType;
        EatsKitOpenType eatsKitOpenType2 = new EatsKitOpenType("CACHE", 1, "cache");
        CACHE = eatsKitOpenType2;
        EatsKitOpenType[] eatsKitOpenTypeArr = {eatsKitOpenType, eatsKitOpenType2};
        $VALUES = eatsKitOpenTypeArr;
        $ENTRIES = a.a(eatsKitOpenTypeArr);
    }

    public EatsKitOpenType(String str, int i, String str2) {
        this.key = str2;
    }

    public static EatsKitOpenType valueOf(String str) {
        return (EatsKitOpenType) Enum.valueOf(EatsKitOpenType.class, str);
    }

    public static EatsKitOpenType[] values() {
        return (EatsKitOpenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
