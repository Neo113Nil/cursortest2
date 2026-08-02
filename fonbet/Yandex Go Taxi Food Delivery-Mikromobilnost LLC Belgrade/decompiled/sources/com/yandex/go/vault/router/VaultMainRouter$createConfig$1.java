package com.yandex.go.vault.router;

import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizeAction;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizeActionVaultActionButton;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenPrizePayload;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.OpenVaultAction;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.ShowVaultStoreAction;
import com.yandex.go.vault.flexsdk.descriptors.widget.actions.VaultAcceptAction;
import defpackage.kr;
import defpackage.l331;
import defpackage.m950;
import defpackage.sy60;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.w331;
import defpackage.x231;
import defpackage.x991;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class VaultMainRouter$createConfig$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(kr krVar) {
        boolean z;
        final c cVar = (c) this.receiver;
        cVar.getClass();
        if ((krVar instanceof OpenVaultAction) || (krVar instanceof VaultAcceptAction)) {
            z = true;
        } else if (krVar instanceof OpenPrizeAction) {
            OpenPrizePayload openPrizePayload = ((OpenPrizeAction) krVar).a;
            String str = openPrizePayload.a;
            String str2 = openPrizePayload.b;
            String str3 = openPrizePayload.c;
            String str4 = openPrizePayload.d;
            String str5 = openPrizePayload.e;
            boolean z2 = openPrizePayload.g;
            List<OpenPrizeActionVaultActionButton> list = openPrizePayload.f;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (OpenPrizeActionVaultActionButton openPrizeActionVaultActionButton : list) {
                arrayList.add(new x231(x991.b(openPrizeActionVaultActionButton.a), openPrizeActionVaultActionButton.b, openPrizeActionVaultActionButton.c, openPrizeActionVaultActionButton.d, openPrizeActionVaultActionButton.e, openPrizeActionVaultActionButton.f, true));
            }
            l331 l331Var = new l331(str, str2, str3, str4, str5, arrayList, z2);
            m950 m950Var = (m950) cVar.G.get();
            z = true;
            final char c = 1 == true ? 1 : 0;
            cVar.A(m950Var, l331Var, new sy60() { // from class: com.yandex.go.vault.router.b
                @Override // defpackage.sy60
                public final void a() {
                    int i = c;
                    c cVar2 = cVar;
                    switch (i) {
                        case 0:
                            tje.N(cVar2.o(), null, null, new VaultMainRouter$handleAction$2$1(cVar2, null), 3);
                            break;
                        default:
                            tje.N(cVar2.o(), null, null, new VaultMainRouter$VaultInnerNavigator$navigateToPrize$1$1(cVar2, null), 3);
                            break;
                    }
                }
            });
            tje.N(cVar.o(), null, null, new VaultMainRouter$handleAction$1(cVar, null), 3);
        } else {
            z = true;
            final int i = 0;
            if (krVar instanceof ShowVaultStoreAction) {
                ShowVaultStoreAction showVaultStoreAction = (ShowVaultStoreAction) krVar;
                cVar.A((m950) cVar.L.get(), new w331(showVaultStoreAction.a, showVaultStoreAction.b), new sy60() { // from class: com.yandex.go.vault.router.b
                    @Override // defpackage.sy60
                    public final void a() {
                        int i2 = i;
                        c cVar2 = cVar;
                        switch (i2) {
                            case 0:
                                tje.N(cVar2.o(), null, null, new VaultMainRouter$handleAction$2$1(cVar2, null), 3);
                                break;
                            default:
                                tje.N(cVar2.o(), null, null, new VaultMainRouter$VaultInnerNavigator$navigateToPrize$1$1(cVar2, null), 3);
                                break;
                        }
                    }
                });
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
