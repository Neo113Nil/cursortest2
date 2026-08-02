package com.yandex.go.notifications.acknowledge.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import defpackage.xlf0;
import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/notifications/acknowledge/data/model/PushAckParam;", "", "Companion", "$serializer", "com/yandex/go/notifications/acknowledge/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PushAckParam {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(21)), null, null};
    public final String a;
    public final String b;
    public final PushAckStatus c;
    public final String d;
    public final Calendar e;

    public /* synthetic */ PushAckParam(int i, String str, String str2, PushAckStatus pushAckStatus, String str3, Calendar calendar) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, PushAckParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = pushAckStatus;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = Calendar.getInstance();
        } else {
            this.e = calendar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushAckParam)) {
            return false;
        }
        PushAckParam pushAckParam = (PushAckParam) obj;
        return jl40.l(this.a, pushAckParam.a) && jl40.l(this.b, pushAckParam.b) && this.c == pushAckParam.c && jl40.l(this.d, pushAckParam.d) && jl40.l(this.e, pushAckParam.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PushAckParam(id=", this.a, ", pushId=", this.b, ", status=");
        v.append(this.c);
        v.append(", deviceId=");
        v.append(this.d);
        v.append(", eventTime=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PushAckParam(String str, String str2, PushAckStatus pushAckStatus, String str3, Calendar calendar) {
        this.a = str;
        this.b = str2;
        this.c = pushAckStatus;
        this.d = str3;
        this.e = calendar;
    }
}
