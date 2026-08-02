package com.yandex.go.vault.flexsdk.descriptors.widget.actions;

import defpackage.dw;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tje;
import defpackage.tse;
import defpackage.wgr;

/* loaded from: classes14.dex */
public final class h implements dw {
    public final wgr a;
    public final tse b;

    public h(tse tseVar, wgr wgrVar) {
        this.a = wgrVar;
        this.b = tseVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        boolean z = krVar instanceof VaultAcceptAction;
        tse tseVar = this.b;
        if (z) {
            tje.N(tseVar, null, null, new VaultActionHandler$handle$1(this, krVar, null), 3);
            return;
        }
        if (krVar instanceof OpenPrizeAction) {
            tje.N(tseVar, null, null, new VaultActionHandler$handle$2(this, krVar, null), 3);
        } else if (krVar instanceof ShowVaultStoreAction) {
            tje.N(tseVar, null, null, new VaultActionHandler$handle$3(this, krVar, null), 3);
        } else if (krVar instanceof OpenVaultAction) {
            tje.N(tseVar, null, null, new VaultActionHandler$handle$4(this, krVar, null), 3);
        }
    }
}
