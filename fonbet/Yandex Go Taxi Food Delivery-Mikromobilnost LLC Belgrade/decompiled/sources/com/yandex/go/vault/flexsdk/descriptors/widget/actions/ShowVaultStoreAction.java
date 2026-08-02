package com.yandex.go.vault.flexsdk.descriptors.widget.actions;

import defpackage.gsq0;
import defpackage.kr;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/ShowVaultStoreAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/vault/flexsdk/descriptors/widget/actions/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShowVaultStoreAction extends kr {
    public static final f Companion = new f();
    public final String a;
    public final VaultStoreErrorScreenPayload b;

    public /* synthetic */ ShowVaultStoreAction(int i, String str, VaultStoreErrorScreenPayload vaultStoreErrorScreenPayload) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new VaultStoreErrorScreenPayload(0);
        } else {
            this.b = vaultStoreErrorScreenPayload;
        }
    }

    public ShowVaultStoreAction() {
        VaultStoreErrorScreenPayload vaultStoreErrorScreenPayload = new VaultStoreErrorScreenPayload(0);
        this.a = "";
        this.b = vaultStoreErrorScreenPayload;
    }
}
