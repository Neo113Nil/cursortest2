package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n7v;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$AiBubble", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "Title", "Content", "$serializer", "com/yandex/go/taxi/order/models/api/response/k4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$AiBubble extends a7 {
    public static final k4 Companion = new k4();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(10))};
    public final String a;
    public final String b;
    public final Title c;
    public final Content d;
    public final com.yandex.go.slot.dto.b2 e;
    public final List f;

    public RideCardItemDto$AiBubble(int i, String str, String str2, Title title, Content content, com.yandex.go.slot.dto.b2 b2Var, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new Title(0);
        } else {
            this.c = title;
        }
        if ((i & 8) == 0) {
            this.d = new Content(0);
        } else {
            this.d = content;
        }
        if ((i & 16) == 0) {
            this.e = com.yandex.go.slot.dto.y0.INSTANCE;
        } else {
            this.e = b2Var;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$AiBubble)) {
            return false;
        }
        RideCardItemDto$AiBubble rideCardItemDto$AiBubble = (RideCardItemDto$AiBubble) obj;
        return jl40.l(this.a, rideCardItemDto$AiBubble.a) && jl40.l(this.b, rideCardItemDto$AiBubble.b) && jl40.l(this.c, rideCardItemDto$AiBubble.c) && jl40.l(this.d, rideCardItemDto$AiBubble.d) && jl40.l(this.e, rideCardItemDto$AiBubble.e) && jl40.l(this.f, rideCardItemDto$AiBubble.f);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AiBubble(id=", this.a, ", analyticsId=", this.b, ", title=");
        v.append(this.c);
        v.append(", content=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(", buttons=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$AiBubble$Content;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/l4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Content {
        public static final l4 Companion = new l4();
        public final FormattedText a;

        public /* synthetic */ Content(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = formattedText;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Content) && jl40.l(this.a, ((Content) obj).a);
        }

        public final int hashCode() {
            FormattedText formattedText = this.a;
            if (formattedText == null) {
                return 0;
            }
            return formattedText.a.hashCode();
        }

        public final String toString() {
            return ly3.p("Content(text=", Extension.C_BRAKE, this.a);
        }

        public Content(int i) {
            this.a = null;
        }

        public Content() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$AiBubble$Title;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/m4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Title {
        public static final m4 Companion = new m4();
        public final n7v a;
        public final FormattedText b;

        public /* synthetic */ Title(int i, n7v n7vVar, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = n7vVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Title)) {
                return false;
            }
            Title title = (Title) obj;
            return jl40.l(this.a, title.a) && jl40.l(this.b, title.b);
        }

        public final int hashCode() {
            n7v n7vVar = this.a;
            int hashCode = (n7vVar == null ? 0 : n7vVar.hashCode()) * 31;
            FormattedText formattedText = this.b;
            return hashCode + (formattedText != null ? formattedText.a.hashCode() : 0);
        }

        public final String toString() {
            return "Title(image=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
        }

        public Title(int i) {
            this.a = null;
            this.b = null;
        }

        public Title() {
            this(0);
        }
    }

    public RideCardItemDto$AiBubble() {
        Title title = new Title(0);
        Content content = new Content(0);
        com.yandex.go.slot.dto.y0 y0Var = com.yandex.go.slot.dto.y0.INSTANCE;
        this.a = "";
        this.b = null;
        this.c = title;
        this.d = content;
        this.e = y0Var;
        this.f = EmptyList.a;
    }
}
