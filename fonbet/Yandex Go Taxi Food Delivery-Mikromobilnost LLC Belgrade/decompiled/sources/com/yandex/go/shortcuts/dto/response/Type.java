package com.yandex.go.shortcuts.dto.response;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Type;", "", "UNKNOWN", "MEDIA_STORIES", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;
    public static final Type MEDIA_STORIES;
    public static final Type UNKNOWN;

    static {
        Type type = new Type("UNKNOWN", 0);
        UNKNOWN = type;
        Type type2 = new Type("MEDIA_STORIES", 1);
        MEDIA_STORIES = type2;
        Type[] typeArr = {type, type2};
        $VALUES = typeArr;
        $ENTRIES = kotlin.enums.a.a(typeArr);
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }
}
