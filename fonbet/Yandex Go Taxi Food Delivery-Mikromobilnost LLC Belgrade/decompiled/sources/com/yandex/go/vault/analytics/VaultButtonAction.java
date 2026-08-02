package com.yandex.go.vault.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/vault/analytics/VaultButtonAction;", "", "NEXT_VAULT", "WHATS_INSIDE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VaultButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VaultButtonAction[] $VALUES;
    public static final VaultButtonAction NEXT_VAULT;
    public static final VaultButtonAction WHATS_INSIDE;

    static {
        VaultButtonAction vaultButtonAction = new VaultButtonAction("NEXT_VAULT", 0);
        NEXT_VAULT = vaultButtonAction;
        VaultButtonAction vaultButtonAction2 = new VaultButtonAction("WHATS_INSIDE", 1);
        WHATS_INSIDE = vaultButtonAction2;
        VaultButtonAction[] vaultButtonActionArr = {vaultButtonAction, vaultButtonAction2};
        $VALUES = vaultButtonActionArr;
        $ENTRIES = a.a(vaultButtonActionArr);
    }

    public static VaultButtonAction valueOf(String str) {
        return (VaultButtonAction) Enum.valueOf(VaultButtonAction.class, str);
    }

    public static VaultButtonAction[] values() {
        return (VaultButtonAction[]) $VALUES.clone();
    }
}
