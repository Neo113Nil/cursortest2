package com.yandex.go.vault.flexsdk.descriptors.widget.view;

import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class VaultsPagerView$adapter$1 extends FunctionReferenceImpl implements tls {
    public final void i(VaultRarity vaultRarity) {
        b bVar = (b) this.receiver;
        tje.N(bVar.Jg(), null, null, new VaultsPagerPresenter$openVault$1(bVar, vaultRarity, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((VaultRarity) obj);
        return zy11.a;
    }
}
