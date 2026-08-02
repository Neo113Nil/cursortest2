package com.yandex.go.scooters.mosru.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/mosru/api/domain/model/ScootersMosRuWebViewOpenReason;", "", "DEEPLINK", "go-client-android.features.scooters.mosru:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuWebViewOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMosRuWebViewOpenReason[] $VALUES;
    public static final ScootersMosRuWebViewOpenReason DEEPLINK;

    static {
        ScootersMosRuWebViewOpenReason scootersMosRuWebViewOpenReason = new ScootersMosRuWebViewOpenReason("DEEPLINK", 0);
        DEEPLINK = scootersMosRuWebViewOpenReason;
        ScootersMosRuWebViewOpenReason[] scootersMosRuWebViewOpenReasonArr = {scootersMosRuWebViewOpenReason};
        $VALUES = scootersMosRuWebViewOpenReasonArr;
        $ENTRIES = a.a(scootersMosRuWebViewOpenReasonArr);
    }

    public static ScootersMosRuWebViewOpenReason valueOf(String str) {
        return (ScootersMosRuWebViewOpenReason) Enum.valueOf(ScootersMosRuWebViewOpenReason.class, str);
    }

    public static ScootersMosRuWebViewOpenReason[] values() {
        return (ScootersMosRuWebViewOpenReason[]) $VALUES.clone();
    }
}
