package com.ybsdk.feature.card.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/card/internal/entities/GetApplicationStatusEntity$Status", "", "Lcom/ybsdk/feature/card/internal/entities/GetApplicationStatusEntity$Status;", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "SUCCESS", "FAILED", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetApplicationStatusEntity$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GetApplicationStatusEntity$Status[] $VALUES;
    public static final GetApplicationStatusEntity$Status PROCESSING = new GetApplicationStatusEntity$Status("PROCESSING", 0);
    public static final GetApplicationStatusEntity$Status SUCCESS = new GetApplicationStatusEntity$Status("SUCCESS", 1);
    public static final GetApplicationStatusEntity$Status FAILED = new GetApplicationStatusEntity$Status("FAILED", 2);

    private static final /* synthetic */ GetApplicationStatusEntity$Status[] $values() {
        return new GetApplicationStatusEntity$Status[]{PROCESSING, SUCCESS, FAILED};
    }

    static {
        GetApplicationStatusEntity$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private GetApplicationStatusEntity$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static GetApplicationStatusEntity$Status valueOf(String str) {
        return (GetApplicationStatusEntity$Status) Enum.valueOf(GetApplicationStatusEntity$Status.class, str);
    }

    public static GetApplicationStatusEntity$Status[] values() {
        return (GetApplicationStatusEntity$Status[]) $VALUES.clone();
    }
}
