package com.yandex.go.vault.flexsdk.descriptors.widget.actions;

import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.y570;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/OpenVaultAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/vault/flexsdk/descriptors/widget/actions/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OpenVaultAction extends kr {
    public static final e Companion = new e();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(17)), null};
    public final VaultRarity a;
    public final boolean b;

    public /* synthetic */ OpenVaultAction(int i, VaultRarity vaultRarity, boolean z) {
        this.a = (i & 1) == 0 ? VaultRarity.COMMON : vaultRarity;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public OpenVaultAction() {
        this.a = VaultRarity.COMMON;
        this.b = false;
    }
}
