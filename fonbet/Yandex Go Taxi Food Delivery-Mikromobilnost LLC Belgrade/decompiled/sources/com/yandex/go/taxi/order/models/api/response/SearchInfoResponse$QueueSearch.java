package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.zone.dto.objects.QueueScreen;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.wpp0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/SearchInfoResponse$QueueSearch", "Lcom/yandex/go/taxi/order/models/api/response/r7;", "Companion", "QueueInfo", "$serializer", "com/yandex/go/taxi/order/models/api/response/j7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchInfoResponse$QueueSearch extends r7 {
    public static final j7 Companion = new j7();
    public final QueueInfo a;
    public final SearchInfoResponse$DisplaySettings b;

    public SearchInfoResponse$QueueSearch(int i, QueueInfo queueInfo, SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings) {
        if ((i & 1) == 0) {
            QueueInfo.Companion.getClass();
            queueInfo = QueueInfo.h;
        }
        this.a = queueInfo;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = searchInfoResponse$DisplaySettings;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInfoResponse$QueueSearch)) {
            return false;
        }
        SearchInfoResponse$QueueSearch searchInfoResponse$QueueSearch = (SearchInfoResponse$QueueSearch) obj;
        return jl40.l(this.a, searchInfoResponse$QueueSearch.a) && jl40.l(this.b, searchInfoResponse$QueueSearch.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SearchInfoResponse$DisplaySettings searchInfoResponse$DisplaySettings = this.b;
        return hashCode + (searchInfoResponse$DisplaySettings == null ? 0 : searchInfoResponse$DisplaySettings.hashCode());
    }

    public final String toString() {
        return "QueueSearch(queueInfo=" + this.a + ", displaySettings=" + this.b + Extension.C_BRAKE;
    }

    public SearchInfoResponse$QueueSearch() {
        QueueInfo.Companion.getClass();
        this.a = QueueInfo.h;
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$QueueSearch$QueueInfo;", "", "Companion", "QueueNotification", "com/yandex/go/taxi/order/models/api/response/k7", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class QueueInfo {
        public static final k7 Companion = new k7();
        public static final QueueInfo h = new QueueInfo(HProv.PP_VERSION_TIMESTAMP, null);
        public final QueueScreen a;
        public final QueueScreen b;
        public final QueueScreen c;
        public final QueueScreen d;
        public final QueueNotification e;
        public final String f;
        public final int g;

        public /* synthetic */ QueueInfo(int i, QueueScreen queueScreen, QueueScreen queueScreen2, QueueScreen queueScreen3, QueueScreen queueScreen4, QueueNotification queueNotification, String str, int i2) {
            this.a = (i & 1) == 0 ? QueueScreen.g : queueScreen;
            if ((i & 2) == 0) {
                this.b = QueueScreen.g;
            } else {
                this.b = queueScreen2;
            }
            if ((i & 4) == 0) {
                this.c = QueueScreen.g;
            } else {
                this.c = queueScreen3;
            }
            if ((i & 8) == 0) {
                this.d = QueueScreen.g;
            } else {
                this.d = queueScreen4;
            }
            if ((i & 16) == 0) {
                this.e = new QueueNotification(0);
            } else {
                this.e = queueNotification;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str;
            }
            if ((i & 64) == 0) {
                this.g = 0;
            } else {
                this.g = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueueInfo)) {
                return false;
            }
            QueueInfo queueInfo = (QueueInfo) obj;
            return jl40.l(this.a, queueInfo.a) && jl40.l(this.b, queueInfo.b) && jl40.l(this.c, queueInfo.c) && jl40.l(this.d, queueInfo.d) && jl40.l(this.e, queueInfo.e) && jl40.l(this.f, queueInfo.f) && this.g == queueInfo.g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.g) + unr0.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QueueInfo(mainScreen=");
            sb.append(this.a);
            sb.append(", confirmScreen=");
            sb.append(this.b);
            sb.append(", updateScreen=");
            sb.append(this.c);
            sb.append(", confirmErrorScreen=");
            sb.append(this.d);
            sb.append(", priceChangedNotification=");
            sb.append(this.e);
            sb.append(", priceChange=");
            sb.append(this.f);
            sb.append(", version=");
            return oyr.m(this.g, Extension.C_BRAKE, sb);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$QueueSearch$QueueInfo$QueueNotification;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/l7", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class QueueNotification {
            public static final l7 Companion = new l7();
            public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(4))};
            public final FormattedText a;
            public final FormattedText b;
            public final String c;
            public final ChangeOrderNotificationActionResponse d;

            public /* synthetic */ QueueNotification(int i, FormattedText formattedText, FormattedText formattedText2, String str, ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = "";
                } else {
                    this.c = str;
                }
                if ((i & 8) == 0) {
                    this.d = ChangeOrderNotificationActionResponse.NONE;
                } else {
                    this.d = changeOrderNotificationActionResponse;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof QueueNotification)) {
                    return false;
                }
                QueueNotification queueNotification = (QueueNotification) obj;
                return jl40.l(this.a, queueNotification.a) && jl40.l(this.b, queueNotification.b) && jl40.l(this.c, queueNotification.c) && this.d == queueNotification.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + unr0.b(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c);
            }

            public final String toString() {
                StringBuilder r = defpackage.n.r("QueueNotification(title=", this.a, ", subtitle=", this.b, ", iconTag=");
                r.append(this.c);
                r.append(", action=");
                r.append(this.d);
                r.append(Extension.C_BRAKE);
                return r.toString();
            }

            public QueueNotification() {
                this(0);
            }

            public QueueNotification(int i) {
                FormattedText formattedText = FormattedText.c;
                ChangeOrderNotificationActionResponse changeOrderNotificationActionResponse = ChangeOrderNotificationActionResponse.NONE;
                this.a = formattedText;
                this.b = formattedText;
                this.c = "";
                this.d = changeOrderNotificationActionResponse;
            }
        }

        public QueueInfo() {
            this(HProv.PP_VERSION_TIMESTAMP, null);
        }

        public QueueInfo(int i, QueueScreen queueScreen) {
            queueScreen = (i & 1) != 0 ? QueueScreen.g : queueScreen;
            QueueScreen queueScreen2 = QueueScreen.g;
            QueueNotification queueNotification = new QueueNotification(0);
            this.a = queueScreen;
            this.b = queueScreen2;
            this.c = queueScreen2;
            this.d = queueScreen2;
            this.e = queueNotification;
            this.f = "";
            this.g = 0;
        }
    }
}
