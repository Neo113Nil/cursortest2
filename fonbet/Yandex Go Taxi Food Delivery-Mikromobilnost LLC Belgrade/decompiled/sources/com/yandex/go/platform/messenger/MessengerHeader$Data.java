package com.yandex.go.platform.messenger;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/platform/messenger/MessengerHeader$Data", "", "Companion", "$serializer", "com/yandex/go/platform/messenger/a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MessengerHeader$Data {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ MessengerHeader$Data(int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, MessengerHeader$Data$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessengerHeader$Data)) {
            return false;
        }
        MessengerHeader$Data messengerHeader$Data = (MessengerHeader$Data) obj;
        return jl40.l(this.a, messengerHeader$Data.a) && jl40.l(this.b, messengerHeader$Data.b) && jl40.l(this.c, messengerHeader$Data.c) && jl40.l(this.d, messengerHeader$Data.d) && jl40.l(this.e, messengerHeader$Data.e) && this.f == messengerHeader$Data.f;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", avatarUrl=");
        sb.append(this.c);
        sb.append(", rating=");
        sb.append(this.d);
        sb.append(", status=");
        sb.append(this.e);
        sb.append(", withCloseBtn=");
        return unr0.u(sb, this.f, ')');
    }
}
