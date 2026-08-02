package com.yandex.go.mainscreen.superapp.popup.data.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/popup/data/state/FallbackAssistanceAppearReason;", "", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NoReason", "LoadingTimeout", "ProductsErrorResponse", "popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FallbackAssistanceAppearReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FallbackAssistanceAppearReason[] $VALUES;
    public static final FallbackAssistanceAppearReason LoadingTimeout;
    public static final FallbackAssistanceAppearReason NoReason;
    public static final FallbackAssistanceAppearReason ProductsErrorResponse;
    private final String reason;

    static {
        FallbackAssistanceAppearReason fallbackAssistanceAppearReason = new FallbackAssistanceAppearReason("NoReason", 0, "");
        NoReason = fallbackAssistanceAppearReason;
        FallbackAssistanceAppearReason fallbackAssistanceAppearReason2 = new FallbackAssistanceAppearReason("LoadingTimeout", 1, "loading timeout");
        LoadingTimeout = fallbackAssistanceAppearReason2;
        FallbackAssistanceAppearReason fallbackAssistanceAppearReason3 = new FallbackAssistanceAppearReason("ProductsErrorResponse", 2, "products error response");
        ProductsErrorResponse = fallbackAssistanceAppearReason3;
        FallbackAssistanceAppearReason[] fallbackAssistanceAppearReasonArr = {fallbackAssistanceAppearReason, fallbackAssistanceAppearReason2, fallbackAssistanceAppearReason3};
        $VALUES = fallbackAssistanceAppearReasonArr;
        $ENTRIES = a.a(fallbackAssistanceAppearReasonArr);
    }

    public FallbackAssistanceAppearReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public static FallbackAssistanceAppearReason valueOf(String str) {
        return (FallbackAssistanceAppearReason) Enum.valueOf(FallbackAssistanceAppearReason.class, str);
    }

    public static FallbackAssistanceAppearReason[] values() {
        return (FallbackAssistanceAppearReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }
}
