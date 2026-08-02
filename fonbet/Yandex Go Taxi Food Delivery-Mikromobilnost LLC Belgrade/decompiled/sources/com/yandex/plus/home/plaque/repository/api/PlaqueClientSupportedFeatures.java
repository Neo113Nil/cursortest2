package com.yandex.plus.home.plaque.repository.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/home/plaque/repository/api/PlaqueClientSupportedFeatures;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BACKEND_ACTION_PERFORM", "plus-home-plaque-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlaqueClientSupportedFeatures {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlaqueClientSupportedFeatures[] $VALUES;
    public static final PlaqueClientSupportedFeatures BACKEND_ACTION_PERFORM;
    private final String value = "backend_action_perform";

    static {
        PlaqueClientSupportedFeatures plaqueClientSupportedFeatures = new PlaqueClientSupportedFeatures();
        BACKEND_ACTION_PERFORM = plaqueClientSupportedFeatures;
        PlaqueClientSupportedFeatures[] plaqueClientSupportedFeaturesArr = {plaqueClientSupportedFeatures};
        $VALUES = plaqueClientSupportedFeaturesArr;
        $ENTRIES = a.a(plaqueClientSupportedFeaturesArr);
    }

    public static PlaqueClientSupportedFeatures valueOf(String str) {
        return (PlaqueClientSupportedFeatures) Enum.valueOf(PlaqueClientSupportedFeatures.class, str);
    }

    public static PlaqueClientSupportedFeatures[] values() {
        return (PlaqueClientSupportedFeatures[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
