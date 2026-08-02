package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/interactor/VerticalHubV2UiStateInteractor$PaymentCardKind", "", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/interactor/VerticalHubV2UiStateInteractor$PaymentCardKind;", "MONEY", "TRANSPORT_CARD", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final class VerticalHubV2UiStateInteractor$PaymentCardKind {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerticalHubV2UiStateInteractor$PaymentCardKind[] $VALUES;
    public static final VerticalHubV2UiStateInteractor$PaymentCardKind MONEY;
    public static final VerticalHubV2UiStateInteractor$PaymentCardKind NONE;
    public static final VerticalHubV2UiStateInteractor$PaymentCardKind TRANSPORT_CARD;

    static {
        VerticalHubV2UiStateInteractor$PaymentCardKind verticalHubV2UiStateInteractor$PaymentCardKind = new VerticalHubV2UiStateInteractor$PaymentCardKind("MONEY", 0);
        MONEY = verticalHubV2UiStateInteractor$PaymentCardKind;
        VerticalHubV2UiStateInteractor$PaymentCardKind verticalHubV2UiStateInteractor$PaymentCardKind2 = new VerticalHubV2UiStateInteractor$PaymentCardKind("TRANSPORT_CARD", 1);
        TRANSPORT_CARD = verticalHubV2UiStateInteractor$PaymentCardKind2;
        VerticalHubV2UiStateInteractor$PaymentCardKind verticalHubV2UiStateInteractor$PaymentCardKind3 = new VerticalHubV2UiStateInteractor$PaymentCardKind(JCP.RAW_PREFIX, 2);
        NONE = verticalHubV2UiStateInteractor$PaymentCardKind3;
        VerticalHubV2UiStateInteractor$PaymentCardKind[] verticalHubV2UiStateInteractor$PaymentCardKindArr = {verticalHubV2UiStateInteractor$PaymentCardKind, verticalHubV2UiStateInteractor$PaymentCardKind2, verticalHubV2UiStateInteractor$PaymentCardKind3};
        $VALUES = verticalHubV2UiStateInteractor$PaymentCardKindArr;
        $ENTRIES = kotlin.enums.a.a(verticalHubV2UiStateInteractor$PaymentCardKindArr);
    }

    public static VerticalHubV2UiStateInteractor$PaymentCardKind valueOf(String str) {
        return (VerticalHubV2UiStateInteractor$PaymentCardKind) Enum.valueOf(VerticalHubV2UiStateInteractor$PaymentCardKind.class, str);
    }

    public static VerticalHubV2UiStateInteractor$PaymentCardKind[] values() {
        return (VerticalHubV2UiStateInteractor$PaymentCardKind[]) $VALUES.clone();
    }
}
