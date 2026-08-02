package com.yandex.go.vault.flexsdk.descriptors.widget.actions;

import defpackage.gsq0;
import defpackage.kr;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/OpenPrizeAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/vault/flexsdk/descriptors/widget/actions/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OpenPrizeAction extends kr {
    public static final a Companion = new a();
    public final OpenPrizePayload a;

    public /* synthetic */ OpenPrizeAction(int i, OpenPrizePayload openPrizePayload) {
        if (1 == (i & 1)) {
            this.a = openPrizePayload;
        } else {
            qje.Z(i, 1, OpenPrizeAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public OpenPrizeAction(OpenPrizePayload openPrizePayload) {
        this.a = openPrizePayload;
    }
}
