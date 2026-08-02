package com.ybsdk.feature.transfer.version2.api;

import com.ybsdk.feature.transfer.version2.api.entities.PhoneTransferRequest;
import defpackage.dfb0;
import defpackage.k4o;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/PhoneInputSource;", "", "<init>", "(Ljava/lang/String;I)V", "MANUALLY", "COPY_PASTED", "PHONEBOOK", "PREDEFINED", "toDto", "Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest$InputSource;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneInputSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhoneInputSource[] $VALUES;
    public static final PhoneInputSource MANUALLY = new PhoneInputSource("MANUALLY", 0);
    public static final PhoneInputSource COPY_PASTED = new PhoneInputSource("COPY_PASTED", 1);
    public static final PhoneInputSource PHONEBOOK = new PhoneInputSource("PHONEBOOK", 2);
    public static final PhoneInputSource PREDEFINED = new PhoneInputSource("PREDEFINED", 3);

    private static final /* synthetic */ PhoneInputSource[] $values() {
        return new PhoneInputSource[]{MANUALLY, COPY_PASTED, PHONEBOOK, PREDEFINED};
    }

    static {
        PhoneInputSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PhoneInputSource(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PhoneInputSource valueOf(String str) {
        return (PhoneInputSource) Enum.valueOf(PhoneInputSource.class, str);
    }

    public static PhoneInputSource[] values() {
        return (PhoneInputSource[]) $VALUES.clone();
    }

    public final PhoneTransferRequest.InputSource toDto() {
        int i = dfb0.a[ordinal()];
        if (i == 1) {
            return PhoneTransferRequest.InputSource.MANUALLY;
        }
        if (i == 2) {
            return PhoneTransferRequest.InputSource.COPY_PASTED;
        }
        if (i == 3) {
            return PhoneTransferRequest.InputSource.PHONEBOOK;
        }
        if (i == 4) {
            return PhoneTransferRequest.InputSource.PREDEFINED;
        }
        w511.b();
        return null;
    }
}
