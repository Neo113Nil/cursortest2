package com.ybsdk.feature.kyc.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/ClientFormDocumentValidationResult;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "BAD_PHOTO_QUALITY", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClientFormDocumentValidationResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClientFormDocumentValidationResult[] $VALUES;
    public static final ClientFormDocumentValidationResult OK = new ClientFormDocumentValidationResult("OK", 0);
    public static final ClientFormDocumentValidationResult BAD_PHOTO_QUALITY = new ClientFormDocumentValidationResult("BAD_PHOTO_QUALITY", 1);

    private static final /* synthetic */ ClientFormDocumentValidationResult[] $values() {
        return new ClientFormDocumentValidationResult[]{OK, BAD_PHOTO_QUALITY};
    }

    static {
        ClientFormDocumentValidationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ClientFormDocumentValidationResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ClientFormDocumentValidationResult valueOf(String str) {
        return (ClientFormDocumentValidationResult) Enum.valueOf(ClientFormDocumentValidationResult.class, str);
    }

    public static ClientFormDocumentValidationResult[] values() {
        return (ClientFormDocumentValidationResult[]) $VALUES.clone();
    }
}
