package com.yandex.go.profile.domain.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/profile/domain/data/Sources;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CACHE", "FALLBACK", "NETWORK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Sources {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Sources[] $VALUES;
    public static final Sources CACHE;
    public static final Sources FALLBACK;
    public static final Sources NETWORK;
    private final String value;

    static {
        Sources sources = new Sources("CACHE", 0, "cache");
        CACHE = sources;
        Sources sources2 = new Sources("FALLBACK", 1, "fallback");
        FALLBACK = sources2;
        Sources sources3 = new Sources("NETWORK", 2, "network");
        NETWORK = sources3;
        Sources[] sourcesArr = {sources, sources2, sources3};
        $VALUES = sourcesArr;
        $ENTRIES = a.a(sourcesArr);
    }

    public Sources(String str, int i, String str2) {
        this.value = str2;
    }

    public static Sources valueOf(String str) {
        return (Sources) Enum.valueOf(Sources.class, str);
    }

    public static Sources[] values() {
        return (Sources[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
