package com.ybsdk.feature.kycesia.internal.domain;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import defpackage.rbo;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/ybsdk/feature/kycesia/internal/domain/EsiaResultInteractor$BrowserResultAction", "", "Lcom/ybsdk/feature/kycesia/internal/domain/EsiaResultInteractor$BrowserResultAction;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "rbo", "SIMPLIFY_IDENTIFICATION", "OPEN_SUPPORT", "KYC_ADDRESS", "DEEPLINK", JCP.RAW_PREFIX, "feature-esia_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class EsiaResultInteractor$BrowserResultAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EsiaResultInteractor$BrowserResultAction[] $VALUES;
    public static final rbo Companion;
    public static final EsiaResultInteractor$BrowserResultAction DEEPLINK;
    public static final EsiaResultInteractor$BrowserResultAction KYC_ADDRESS;
    public static final EsiaResultInteractor$BrowserResultAction NONE;
    public static final EsiaResultInteractor$BrowserResultAction OPEN_SUPPORT;
    public static final EsiaResultInteractor$BrowserResultAction SIMPLIFY_IDENTIFICATION;
    private final String value;

    static {
        EsiaResultInteractor$BrowserResultAction esiaResultInteractor$BrowserResultAction = new EsiaResultInteractor$BrowserResultAction("SIMPLIFY_IDENTIFICATION", 0, "open_simplified_identification_form");
        SIMPLIFY_IDENTIFICATION = esiaResultInteractor$BrowserResultAction;
        EsiaResultInteractor$BrowserResultAction esiaResultInteractor$BrowserResultAction2 = new EsiaResultInteractor$BrowserResultAction("OPEN_SUPPORT", 1, "support_chat");
        OPEN_SUPPORT = esiaResultInteractor$BrowserResultAction2;
        EsiaResultInteractor$BrowserResultAction esiaResultInteractor$BrowserResultAction3 = new EsiaResultInteractor$BrowserResultAction("KYC_ADDRESS", 2, "open_kyc_eds_address");
        KYC_ADDRESS = esiaResultInteractor$BrowserResultAction3;
        EsiaResultInteractor$BrowserResultAction esiaResultInteractor$BrowserResultAction4 = new EsiaResultInteractor$BrowserResultAction("DEEPLINK", 3, Constants.DEEPLINK);
        DEEPLINK = esiaResultInteractor$BrowserResultAction4;
        EsiaResultInteractor$BrowserResultAction esiaResultInteractor$BrowserResultAction5 = new EsiaResultInteractor$BrowserResultAction(JCP.RAW_PREFIX, 4, "none");
        NONE = esiaResultInteractor$BrowserResultAction5;
        EsiaResultInteractor$BrowserResultAction[] esiaResultInteractor$BrowserResultActionArr = {esiaResultInteractor$BrowserResultAction, esiaResultInteractor$BrowserResultAction2, esiaResultInteractor$BrowserResultAction3, esiaResultInteractor$BrowserResultAction4, esiaResultInteractor$BrowserResultAction5};
        $VALUES = esiaResultInteractor$BrowserResultActionArr;
        $ENTRIES = kotlin.enums.a.a(esiaResultInteractor$BrowserResultActionArr);
        Companion = new rbo();
    }

    public EsiaResultInteractor$BrowserResultAction(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static EsiaResultInteractor$BrowserResultAction valueOf(String str) {
        return (EsiaResultInteractor$BrowserResultAction) Enum.valueOf(EsiaResultInteractor$BrowserResultAction.class, str);
    }

    public static EsiaResultInteractor$BrowserResultAction[] values() {
        return (EsiaResultInteractor$BrowserResultAction[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
