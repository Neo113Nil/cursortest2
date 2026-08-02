package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.eua;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CheckInAction;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/u", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CheckInAction {
    public static final u Companion = new u();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(21))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final CheckInActionType e;

    public /* synthetic */ CheckInAction(int i, String str, String str2, String str3, String str4, CheckInActionType checkInActionType) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = CheckInActionType.BUTTON;
        } else {
            this.e = checkInActionType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckInAction)) {
            return false;
        }
        CheckInAction checkInAction = (CheckInAction) obj;
        return jl40.l(this.a, checkInAction.a) && jl40.l(this.b, checkInAction.b) && jl40.l(this.c, checkInAction.c) && jl40.l(this.d, checkInAction.d) && this.e == checkInAction.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("CheckInAction(title=", this.a, ", waitingTitle=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", waitingSubtitle=", this.d, ", type=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CheckInAction() {
        this(0);
    }

    public CheckInAction(int i) {
        CheckInActionType checkInActionType = CheckInActionType.BUTTON;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = checkInActionType;
    }
}
