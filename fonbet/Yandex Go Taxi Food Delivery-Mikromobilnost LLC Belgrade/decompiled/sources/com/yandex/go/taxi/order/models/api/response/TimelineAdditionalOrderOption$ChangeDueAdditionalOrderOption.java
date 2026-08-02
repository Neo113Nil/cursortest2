package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption", "Lcom/yandex/go/taxi/order/models/api/response/j8;", "Companion", "ChangeDueActionInfo", "$serializer", "com/yandex/go/taxi/order/models/api/response/f8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption extends j8 {
    public static final f8 Companion = new f8();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(13)), null};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final TimelineAdditionalOrderOption$AdditionalOrderOptionState d;
    public final ChangeDueActionInfo e;

    public TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption(int i, String str, FormattedText formattedText, FormattedText formattedText2, TimelineAdditionalOrderOption$AdditionalOrderOptionState timelineAdditionalOrderOption$AdditionalOrderOptionState, ChangeDueActionInfo changeDueActionInfo) {
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
            this.e = new ChangeDueActionInfo(0);
        } else {
            this.e = changeDueActionInfo;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption)) {
            return false;
        }
        TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption = (TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption) obj;
        return jl40.l(this.a, timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.a) && jl40.l(this.b, timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.b) && jl40.l(this.c, timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.c) && this.d == timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.d && jl40.l(this.e, timelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.e);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a);
        FormattedText formattedText = this.c;
        return this.e.a.hashCode() + ((this.d.hashCode() + ((c + (formattedText != null ? formattedText.a.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q = xvz.q("ChangeDueAdditionalOrderOption(iconTag=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", state=");
        q.append(this.d);
        q.append(", changeDueActionInfo=");
        q.append(this.e);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption$ChangeDueActionInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/e8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ChangeDueActionInfo {
        public static final e8 Companion = new e8();
        public final String a;

        public /* synthetic */ ChangeDueActionInfo(int i, String str) {
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
            return (obj instanceof ChangeDueActionInfo) && jl40.l(this.a, ((ChangeDueActionInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("ChangeDueActionInfo(due=", this.a, Extension.C_BRAKE);
        }

        public ChangeDueActionInfo(int i) {
            this.a = "";
        }

        public ChangeDueActionInfo() {
            this(0);
        }
    }

    public TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption() {
        FormattedText formattedText = new FormattedText(0);
        TimelineAdditionalOrderOption$AdditionalOrderOptionState timelineAdditionalOrderOption$AdditionalOrderOptionState = TimelineAdditionalOrderOption$AdditionalOrderOptionState.UNSELECTED;
        ChangeDueActionInfo changeDueActionInfo = new ChangeDueActionInfo(0);
        this.a = null;
        this.b = formattedText;
        this.c = null;
        this.d = timelineAdditionalOrderOption$AdditionalOrderOptionState;
        this.e = changeDueActionInfo;
    }
}
