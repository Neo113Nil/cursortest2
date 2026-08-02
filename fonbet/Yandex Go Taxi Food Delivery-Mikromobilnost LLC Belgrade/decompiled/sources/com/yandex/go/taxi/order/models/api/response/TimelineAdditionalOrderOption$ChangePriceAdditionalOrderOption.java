package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.x1z0;
import defpackage.xvz;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption", "Lcom/yandex/go/taxi/order/models/api/response/j8;", "Companion", "ChangePriceActionInfo", "$serializer", "com/yandex/go/taxi/order/models/api/response/h8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption extends j8 {
    public static final h8 Companion = new h8();
    public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(14)), null, null};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final TimelineAdditionalOrderOption$AdditionalOrderOptionState d;
    public final ief e;
    public final ChangePriceActionInfo f;

    public TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption(int i, String str, FormattedText formattedText, FormattedText formattedText2, TimelineAdditionalOrderOption$AdditionalOrderOptionState timelineAdditionalOrderOption$AdditionalOrderOptionState, ief iefVar, ChangePriceActionInfo changePriceActionInfo) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        int i2 = 0;
        if ((i & 2) == 0) {
            this.b = new FormattedText(i2);
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = TimelineAdditionalOrderOption$AdditionalOrderOptionState.UNSELECTED;
        } else {
            this.d = timelineAdditionalOrderOption$AdditionalOrderOptionState;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = iefVar;
        }
        if ((i & 32) == 0) {
            this.f = new ChangePriceActionInfo(0);
        } else {
            this.f = changePriceActionInfo;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption)) {
            return false;
        }
        TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption = (TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption) obj;
        return jl40.l(this.a, timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.a) && jl40.l(this.b, timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.b) && jl40.l(this.c, timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.c) && this.d == timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.d && jl40.l(this.e, timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.e) && jl40.l(this.f, timelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.f);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a);
        FormattedText formattedText = this.c;
        int hashCode = (this.d.hashCode() + ((c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31;
        ief iefVar = this.e;
        return this.f.a.hashCode() + ((hashCode + (iefVar != null ? iefVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder q = xvz.q("ChangePriceAdditionalOrderOption(iconTag=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", state=");
        q.append(this.d);
        q.append(", currencyRules=");
        q.append(this.e);
        q.append(", changePriceActionInfo=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption$ChangePriceActionInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/g8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ChangePriceActionInfo {
        public static final g8 Companion = new g8();
        public final String a;

        public /* synthetic */ ChangePriceActionInfo(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangePriceActionInfo) && jl40.l(this.a, ((ChangePriceActionInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("ChangePriceActionInfo(price=", this.a, Extension.C_BRAKE);
        }

        public ChangePriceActionInfo(int i) {
            this.a = "";
        }

        public ChangePriceActionInfo() {
            this(0);
        }
    }

    public TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption() {
        FormattedText formattedText = new FormattedText(0);
        TimelineAdditionalOrderOption$AdditionalOrderOptionState timelineAdditionalOrderOption$AdditionalOrderOptionState = TimelineAdditionalOrderOption$AdditionalOrderOptionState.UNSELECTED;
        ChangePriceActionInfo changePriceActionInfo = new ChangePriceActionInfo(0);
        this.a = null;
        this.b = formattedText;
        this.c = null;
        this.d = timelineAdditionalOrderOption$AdditionalOrderOptionState;
        this.e = null;
        this.f = changePriceActionInfo;
    }
}
