package com.yandex.messaging.internal.net.file;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/internal/net/file/CacheType;", "", "", "cacheSize", CA20Status.STATUS_USER_I, "a", "()I", "", "directoryName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "RAW", "IMAGE", "VOICE", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CacheType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CacheType[] $VALUES;
    public static final CacheType IMAGE;
    public static final CacheType RAW;
    public static final CacheType VOICE;
    private final int cacheSize;
    private final String directoryName;

    static {
        CacheType cacheType = new CacheType("RAW", 0, 64000, "raw");
        RAW = cacheType;
        CacheType cacheType2 = new CacheType("IMAGE", 1, 100, "image");
        IMAGE = cacheType2;
        CacheType cacheType3 = new CacheType("VOICE", 2, 200, "voice");
        VOICE = cacheType3;
        CacheType[] cacheTypeArr = {cacheType, cacheType2, cacheType3};
        $VALUES = cacheTypeArr;
        $ENTRIES = kotlin.enums.a.a(cacheTypeArr);
    }

    public CacheType(String str, int i, int i2, String str2) {
        this.cacheSize = i2;
        this.directoryName = str2;
    }

    public static k4o c() {
        return $ENTRIES;
    }

    public static CacheType valueOf(String str) {
        return (CacheType) Enum.valueOf(CacheType.class, str);
    }

    public static CacheType[] values() {
        return (CacheType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getCacheSize() {
        return this.cacheSize;
    }

    /* renamed from: b, reason: from getter */
    public final String getDirectoryName() {
        return this.directoryName;
    }
}
