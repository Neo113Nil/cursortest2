package com.yandex.messaging.base.rights;

import defpackage.by4;
import defpackage.k4o;
import defpackage.kgx;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/base/rights/ClientSupportedFeatureFlag;", "Lby4;", "", "", "", "feature", "Ljava/lang/String;", "getFeature", "()Ljava/lang/String;", "", "bitPosition", CA20Status.STATUS_USER_I, "getBitPosition", "()I", "EphemeralMessages", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ClientSupportedFeatureFlag implements by4 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClientSupportedFeatureFlag[] $VALUES;
    public static final ClientSupportedFeatureFlag EphemeralMessages;
    private final String feature = "ephemeral messages";
    private final int bitPosition = 0;

    static {
        ClientSupportedFeatureFlag clientSupportedFeatureFlag = new ClientSupportedFeatureFlag();
        EphemeralMessages = clientSupportedFeatureFlag;
        ClientSupportedFeatureFlag[] clientSupportedFeatureFlagArr = {clientSupportedFeatureFlag};
        $VALUES = clientSupportedFeatureFlagArr;
        $ENTRIES = a.a(clientSupportedFeatureFlagArr);
    }

    public static ClientSupportedFeatureFlag valueOf(String str) {
        return (ClientSupportedFeatureFlag) Enum.valueOf(ClientSupportedFeatureFlag.class, str);
    }

    public static ClientSupportedFeatureFlag[] values() {
        return (ClientSupportedFeatureFlag[]) $VALUES.clone();
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        throw new ClassCastException();
    }

    @Override // defpackage.by4
    /* renamed from: p, reason: from getter */
    public final int getBitPosition() {
        return this.bitPosition;
    }
}
