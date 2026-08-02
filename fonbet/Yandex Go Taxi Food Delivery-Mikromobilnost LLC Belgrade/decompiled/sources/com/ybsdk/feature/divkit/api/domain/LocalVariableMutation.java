package com.ybsdk.feature.divkit.api.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ybsdk/feature/divkit/api/domain/LocalVariableMutation;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLE_SHIMMER", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalVariableMutation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LocalVariableMutation[] $VALUES;
    public static final LocalVariableMutation DISABLE_SHIMMER = new LocalVariableMutation("DISABLE_SHIMMER", 0);

    private static final /* synthetic */ LocalVariableMutation[] $values() {
        return new LocalVariableMutation[]{DISABLE_SHIMMER};
    }

    static {
        LocalVariableMutation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private LocalVariableMutation(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static LocalVariableMutation valueOf(String str) {
        return (LocalVariableMutation) Enum.valueOf(LocalVariableMutation.class, str);
    }

    public static LocalVariableMutation[] values() {
        return (LocalVariableMutation[]) $VALUES.clone();
    }
}
