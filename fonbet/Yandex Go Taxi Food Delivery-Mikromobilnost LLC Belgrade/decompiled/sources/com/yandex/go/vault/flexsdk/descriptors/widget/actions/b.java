package com.yandex.go.vault.flexsdk.descriptors.widget.actions;

import defpackage.b7p0;
import defpackage.mu;
import defpackage.nu;
import defpackage.pv01;
import defpackage.qoi0;
import defpackage.uh60;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class b implements nu {
    public final /* synthetic */ int a;
    public final h b;
    public final mu c;

    public b(h hVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = hVar;
                this.c = new mu("OpenVaultAction", qoi0.a(OpenVaultAction.class), new OpenVaultActionDescriptorFactory$actionDescriptor$1(0, OpenVaultAction.Companion, e.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new uh60(15, this)), EmptyList.a, false);
                break;
            case 2:
                this.b = hVar;
                this.c = new mu("ShowVaultStoreAction", qoi0.a(ShowVaultStoreAction.class), new ShowVaultStoreActionDescriptorFactory$actionDescriptor$1(0, ShowVaultStoreAction.Companion, f.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new b7p0(29, this)), EmptyList.a, false);
                break;
            case 3:
                this.b = hVar;
                this.c = new mu("VaultAcceptAction", qoi0.a(VaultAcceptAction.class), new VaultAcceptActionDescriptorFactory$actionDescriptor$1(0, VaultAcceptAction.Companion, g.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new pv01(25, this)), EmptyList.a, false);
                break;
            default:
                this.b = hVar;
                this.c = new mu("OpenPrizeAction", qoi0.a(OpenPrizeAction.class), new OpenPrizeActionDescriptorFactory$actionDescriptor$1(0, OpenPrizeAction.Companion, a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new uh60(12, this)), EmptyList.a, false);
                break;
        }
    }

    @Override // defpackage.nu
    public final mu create() {
        switch (this.a) {
        }
        return this.c;
    }
}
