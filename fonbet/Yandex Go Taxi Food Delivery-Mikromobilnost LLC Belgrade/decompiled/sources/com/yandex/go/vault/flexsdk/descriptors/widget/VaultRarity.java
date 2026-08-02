package com.yandex.go.vault.flexsdk.descriptors.widget;

import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.n331;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/VaultRarity;", "", "Companion", "n331", "COMMON", "RARE", "LEGENDARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VaultRarity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VaultRarity[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final VaultRarity COMMON;
    public static final n331 Companion;
    public static final VaultRarity LEGENDARY;
    public static final VaultRarity RARE;

    static {
        VaultRarity vaultRarity = new VaultRarity("COMMON", 0);
        COMMON = vaultRarity;
        VaultRarity vaultRarity2 = new VaultRarity("RARE", 1);
        RARE = vaultRarity2;
        VaultRarity vaultRarity3 = new VaultRarity("LEGENDARY", 2);
        LEGENDARY = vaultRarity3;
        VaultRarity[] vaultRarityArr = {vaultRarity, vaultRarity2, vaultRarity3};
        $VALUES = vaultRarityArr;
        $ENTRIES = kotlin.enums.a.a(vaultRarityArr);
        Companion = new n331();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(17));
    }

    public static VaultRarity valueOf(String str) {
        return (VaultRarity) Enum.valueOf(VaultRarity.class, str);
    }

    public static VaultRarity[] values() {
        return (VaultRarity[]) $VALUES.clone();
    }
}
