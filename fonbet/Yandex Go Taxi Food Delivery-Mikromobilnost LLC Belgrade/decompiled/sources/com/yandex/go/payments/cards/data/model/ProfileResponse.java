package com.yandex.go.payments.cards.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.v8f0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/ProfileResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfileResponse {
    public static final j Companion = new j();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(22))};
    public final UserCardProfileName a;

    public /* synthetic */ ProfileResponse(int i, UserCardProfileName userCardProfileName) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = userCardProfileName;
        }
    }

    public ProfileResponse() {
        this.a = null;
    }
}
