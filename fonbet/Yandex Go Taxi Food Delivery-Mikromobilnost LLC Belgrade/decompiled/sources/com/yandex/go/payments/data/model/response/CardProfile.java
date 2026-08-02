package com.yandex.go.payments.data.model.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/response/CardProfile;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/response/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CardProfile {
    public static final v Companion = new v();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(22))};
    public final UserCardProfileName a;

    public /* synthetic */ CardProfile(int i, UserCardProfileName userCardProfileName) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = userCardProfileName;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardProfile) && this.a == ((CardProfile) obj).a;
    }

    public final int hashCode() {
        UserCardProfileName userCardProfileName = this.a;
        if (userCardProfileName == null) {
            return 0;
        }
        return userCardProfileName.hashCode();
    }

    public final String toString() {
        return "CardProfile(name=" + this.a + Extension.C_BRAKE;
    }

    public CardProfile() {
        this.a = null;
    }
}
