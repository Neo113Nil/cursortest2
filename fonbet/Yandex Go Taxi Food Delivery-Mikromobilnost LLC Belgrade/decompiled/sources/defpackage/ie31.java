package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.model.ModalState;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ErrorButtonAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.FilterType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ie31 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[TransitRoutesHubAnalytics$MobilityHubOrigin.values().length];
        try {
            iArr[TransitRoutesHubAnalytics$MobilityHubOrigin.Transport.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
        int[] iArr2 = new int[ErrorButtonAction.values().length];
        try {
            iArr2[ErrorButtonAction.OPEN_ADDRESS_SELECTOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ErrorButtonAction.REFRESH.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ErrorButtonAction.REFRESH_TRANSPORT_ROUTES.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ErrorButtonAction.REFRESH_ROUTESTATS.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ErrorButtonAction.EXPAND.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[ModalState.values().length];
        try {
            iArr3[ModalState.Expanded.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ModalState.Anchored.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[ModalState.Other.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[FilterType.values().length];
        try {
            iArr4[FilterType.MUTUAL_EXCLUSIVE_FILTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[FilterType.TRANSPORT_TYPE_SELECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[FilterType.DUE_SELECTOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
