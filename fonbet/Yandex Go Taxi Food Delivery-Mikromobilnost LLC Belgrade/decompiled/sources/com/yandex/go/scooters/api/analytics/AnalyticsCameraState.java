package com.yandex.go.scooters.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/scooters/api/analytics/AnalyticsCameraState;", "", "", ClidProvider.STATE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CAMERA", "PERMISSION_REQUEST", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsCameraState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnalyticsCameraState[] $VALUES;
    public static final AnalyticsCameraState CAMERA;
    public static final AnalyticsCameraState PERMISSION_REQUEST;
    private final String state;

    static {
        AnalyticsCameraState analyticsCameraState = new AnalyticsCameraState("CAMERA", 0, "camera");
        CAMERA = analyticsCameraState;
        AnalyticsCameraState analyticsCameraState2 = new AnalyticsCameraState("PERMISSION_REQUEST", 1, "permission_request");
        PERMISSION_REQUEST = analyticsCameraState2;
        AnalyticsCameraState[] analyticsCameraStateArr = {analyticsCameraState, analyticsCameraState2};
        $VALUES = analyticsCameraStateArr;
        $ENTRIES = a.a(analyticsCameraStateArr);
    }

    public AnalyticsCameraState(String str, int i, String str2) {
        this.state = str2;
    }

    public static AnalyticsCameraState valueOf(String str) {
        return (AnalyticsCameraState) Enum.valueOf(AnalyticsCameraState.class, str);
    }

    public static AnalyticsCameraState[] values() {
        return (AnalyticsCameraState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
