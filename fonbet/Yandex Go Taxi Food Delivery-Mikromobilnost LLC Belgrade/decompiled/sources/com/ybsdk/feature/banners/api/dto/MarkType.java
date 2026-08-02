package com.ybsdk.feature.banners.api.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/feature/banners/api/dto/MarkType;", "", "<init>", "(Ljava/lang/String;I)V", "READ", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MarkType[] $VALUES;
    public static final MarkType READ = new MarkType("READ", 0);

    private static final /* synthetic */ MarkType[] $values() {
        return new MarkType[]{READ};
    }

    static {
        MarkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MarkType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static MarkType valueOf(String str) {
        return (MarkType) Enum.valueOf(MarkType.class, str);
    }

    public static MarkType[] values() {
        return (MarkType[]) $VALUES.clone();
    }
}
