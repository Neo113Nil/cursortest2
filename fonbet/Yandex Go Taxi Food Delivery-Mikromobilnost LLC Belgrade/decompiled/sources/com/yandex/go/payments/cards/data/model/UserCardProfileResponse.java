package com.yandex.go.payments.cards.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.z121;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/UserCardProfileResponse;", "", "Companion", "UserCardProfile", "$serializer", "com/yandex/go/payments/cards/data/model/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UserCardProfileResponse {
    public static final k Companion = new k();
    public final UserCardProfile a;

    public /* synthetic */ UserCardProfileResponse(int i, UserCardProfile userCardProfile) {
        if ((i & 1) == 0) {
            this.a = new UserCardProfile(0);
        } else {
            this.a = userCardProfile;
        }
    }

    /* renamed from: a, reason: from getter */
    public final UserCardProfile getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserCardProfileResponse) && jl40.l(this.a, ((UserCardProfileResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserCardProfileResponse(userCardProfile=" + this.a + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/UserCardProfileResponse$UserCardProfile;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/data/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class UserCardProfile {
        public static final l Companion = new l();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z121(27))};
        public final UserCardProfileName a;

        public /* synthetic */ UserCardProfile(int i, UserCardProfileName userCardProfileName) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = userCardProfileName;
            }
        }

        /* renamed from: a, reason: from getter */
        public final UserCardProfileName getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserCardProfile) && this.a == ((UserCardProfile) obj).a;
        }

        public final int hashCode() {
            UserCardProfileName userCardProfileName = this.a;
            if (userCardProfileName == null) {
                return 0;
            }
            return userCardProfileName.hashCode();
        }

        public final String toString() {
            return "UserCardProfile(userCardProfileName=" + this.a + Extension.C_BRAKE;
        }

        public UserCardProfile(int i) {
            this.a = null;
        }

        public UserCardProfile() {
            this(0);
        }
    }

    public UserCardProfileResponse() {
        this.a = new UserCardProfile(0);
    }
}
