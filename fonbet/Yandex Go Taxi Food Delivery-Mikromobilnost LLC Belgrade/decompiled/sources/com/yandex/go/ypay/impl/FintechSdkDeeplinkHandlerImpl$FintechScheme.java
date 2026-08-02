package com.yandex.go.ypay.impl;

import android.net.Uri;
import defpackage.cvu0;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/ypay/impl/FintechSdkDeeplinkHandlerImpl$FintechScheme", "", "Lcom/yandex/go/ypay/impl/FintechSdkDeeplinkHandlerImpl$FintechScheme;", "", "scheme", "Ljava/lang/String;", "FINTECH_SDK", "FINTECHSDK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final class FintechSdkDeeplinkHandlerImpl$FintechScheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FintechSdkDeeplinkHandlerImpl$FintechScheme[] $VALUES;
    public static final FintechSdkDeeplinkHandlerImpl$FintechScheme FINTECHSDK;
    public static final FintechSdkDeeplinkHandlerImpl$FintechScheme FINTECH_SDK;
    private final String scheme;

    static {
        FintechSdkDeeplinkHandlerImpl$FintechScheme fintechSdkDeeplinkHandlerImpl$FintechScheme = new FintechSdkDeeplinkHandlerImpl$FintechScheme("FINTECH_SDK", 0, "fintech-sdk");
        FINTECH_SDK = fintechSdkDeeplinkHandlerImpl$FintechScheme;
        FintechSdkDeeplinkHandlerImpl$FintechScheme fintechSdkDeeplinkHandlerImpl$FintechScheme2 = new FintechSdkDeeplinkHandlerImpl$FintechScheme("FINTECHSDK", 1, "fintechsdk");
        FINTECHSDK = fintechSdkDeeplinkHandlerImpl$FintechScheme2;
        FintechSdkDeeplinkHandlerImpl$FintechScheme[] fintechSdkDeeplinkHandlerImpl$FintechSchemeArr = {fintechSdkDeeplinkHandlerImpl$FintechScheme, fintechSdkDeeplinkHandlerImpl$FintechScheme2};
        $VALUES = fintechSdkDeeplinkHandlerImpl$FintechSchemeArr;
        $ENTRIES = kotlin.enums.a.a(fintechSdkDeeplinkHandlerImpl$FintechSchemeArr);
    }

    public FintechSdkDeeplinkHandlerImpl$FintechScheme(String str, int i, String str2) {
        this.scheme = str2;
    }

    public static FintechSdkDeeplinkHandlerImpl$FintechScheme valueOf(String str) {
        return (FintechSdkDeeplinkHandlerImpl$FintechScheme) Enum.valueOf(FintechSdkDeeplinkHandlerImpl$FintechScheme.class, str);
    }

    public static FintechSdkDeeplinkHandlerImpl$FintechScheme[] values() {
        return (FintechSdkDeeplinkHandlerImpl$FintechScheme[]) $VALUES.clone();
    }

    public final boolean a(Uri uri) {
        return cvu0.t(this.scheme, uri.getScheme(), true);
    }
}
