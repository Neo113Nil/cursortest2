package com.yandex.go.taxi.order.models.api.response.driver;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jbm;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/driver/DriverInfoBadgesBlock;", "", "Companion", "Badge", "$serializer", "com/yandex/go/taxi/order/models/api/response/driver/k", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DriverInfoBadgesBlock {
    public static final k Companion = new k();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jbm(12))};
    public final List a;

    public /* synthetic */ DriverInfoBadgesBlock(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DriverInfoBadgesBlock) && jl40.l(this.a, ((DriverInfoBadgesBlock) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DriverInfoBadgesBlock(badges=", Extension.C_BRAKE, this.a);
    }

    public DriverInfoBadgesBlock() {
        this.a = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/driver/DriverInfoBadgesBlock$Badge;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/driver/i", "$serializer", "com/yandex/go/taxi/order/models/api/response/driver/j", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Badge {
        public static final j Companion = new j();
        public final FormattedText a;
        public final i b;

        public /* synthetic */ Badge(int i, FormattedText formattedText, i iVar) {
            this.a = (i & 1) == 0 ? null : formattedText;
            if ((i & 2) == 0) {
                this.b = h.INSTANCE;
            } else {
                this.b = iVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return jl40.l(this.a, badge.a) && jl40.l(this.b, badge.b);
        }

        public final int hashCode() {
            FormattedText formattedText = this.a;
            return this.b.hashCode() + ((formattedText == null ? 0 : formattedText.a.hashCode()) * 31);
        }

        public final String toString() {
            return "Badge(title=" + this.a + ", background=" + this.b + Extension.C_BRAKE;
        }

        public Badge() {
            h hVar = h.INSTANCE;
            this.a = null;
            this.b = hVar;
        }
    }
}
