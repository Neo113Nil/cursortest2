package com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/SuggestEntity$BehaviourEntity", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/SuggestEntity$BehaviourEntity;", "<init>", "(Ljava/lang/String;I)V", "PLUS", "REPLACE", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SuggestEntity$BehaviourEntity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuggestEntity$BehaviourEntity[] $VALUES;
    public static final SuggestEntity$BehaviourEntity PLUS = new SuggestEntity$BehaviourEntity("PLUS", 0);
    public static final SuggestEntity$BehaviourEntity REPLACE = new SuggestEntity$BehaviourEntity("REPLACE", 1);

    private static final /* synthetic */ SuggestEntity$BehaviourEntity[] $values() {
        return new SuggestEntity$BehaviourEntity[]{PLUS, REPLACE};
    }

    static {
        SuggestEntity$BehaviourEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SuggestEntity$BehaviourEntity(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SuggestEntity$BehaviourEntity valueOf(String str) {
        return (SuggestEntity$BehaviourEntity) Enum.valueOf(SuggestEntity$BehaviourEntity.class, str);
    }

    public static SuggestEntity$BehaviourEntity[] values() {
        return (SuggestEntity$BehaviourEntity[]) $VALUES.clone();
    }
}
