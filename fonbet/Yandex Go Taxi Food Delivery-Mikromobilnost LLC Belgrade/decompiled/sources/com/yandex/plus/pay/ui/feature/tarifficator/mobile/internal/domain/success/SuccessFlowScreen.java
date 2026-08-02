package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/domain/success/SuccessFlowScreen;", "", "UPSALE", "TOPUP", "FAMILY_INVITATION", "CONTACTS", "SUCCESS", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SuccessFlowScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuccessFlowScreen[] $VALUES;
    public static final SuccessFlowScreen CONTACTS;
    public static final SuccessFlowScreen FAMILY_INVITATION;
    public static final SuccessFlowScreen SUCCESS;
    public static final SuccessFlowScreen TOPUP;
    public static final SuccessFlowScreen UPSALE;

    static {
        SuccessFlowScreen successFlowScreen = new SuccessFlowScreen("UPSALE", 0);
        UPSALE = successFlowScreen;
        SuccessFlowScreen successFlowScreen2 = new SuccessFlowScreen("TOPUP", 1);
        TOPUP = successFlowScreen2;
        SuccessFlowScreen successFlowScreen3 = new SuccessFlowScreen("FAMILY_INVITATION", 2);
        FAMILY_INVITATION = successFlowScreen3;
        SuccessFlowScreen successFlowScreen4 = new SuccessFlowScreen("CONTACTS", 3);
        CONTACTS = successFlowScreen4;
        SuccessFlowScreen successFlowScreen5 = new SuccessFlowScreen("SUCCESS", 4);
        SUCCESS = successFlowScreen5;
        SuccessFlowScreen[] successFlowScreenArr = {successFlowScreen, successFlowScreen2, successFlowScreen3, successFlowScreen4, successFlowScreen5};
        $VALUES = successFlowScreenArr;
        $ENTRIES = kotlin.enums.a.a(successFlowScreenArr);
    }

    public static SuccessFlowScreen valueOf(String str) {
        return (SuccessFlowScreen) Enum.valueOf(SuccessFlowScreen.class, str);
    }

    public static SuccessFlowScreen[] values() {
        return (SuccessFlowScreen[]) $VALUES.clone();
    }
}
