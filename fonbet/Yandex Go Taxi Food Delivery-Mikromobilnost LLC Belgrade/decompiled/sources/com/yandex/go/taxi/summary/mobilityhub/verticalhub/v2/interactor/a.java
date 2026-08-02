package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[HubOfferType.values().length];
        try {
            iArr[HubOfferType.TAXI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HubOfferType.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[HubLeadingItemKind.values().length];
        try {
            iArr2[HubLeadingItemKind.PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[HubLeadingItemKind.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[VerticalHubV2UiStateInteractor$PaymentCardKind.values().length];
        try {
            iArr3[VerticalHubV2UiStateInteractor$PaymentCardKind.MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[VerticalHubV2UiStateInteractor$PaymentCardKind.TRANSPORT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[VerticalHubV2UiStateInteractor$PaymentCardKind.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
        int[] iArr4 = new int[ModalState.values().length];
        try {
            iArr4[ModalState.Anchored.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[ModalState.Expanded.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[ModalState.Other.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
