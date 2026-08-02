package com.yandex.go.user_session.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.qv10;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_session/data/model/SuperappSession;", "", "Companion", "com/yandex/go/user_session/data/model/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SuperappSession {
    public static final a Companion = new a();
    public static final SuperappSession h = new SuperappSession(0);
    public final String a;
    public final long b;
    public final Long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;

    public /* synthetic */ SuperappSession(int i, String str, long j, Long l, long j2, long j3, int i2, long j4) {
        if (123 != (i & HProv.PP_PASSWD_TERM)) {
            qje.Z(i, HProv.PP_PASSWD_TERM, SuperappSession$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperappSession)) {
            return false;
        }
        SuperappSession superappSession = (SuperappSession) obj;
        return jl40.l(this.a, superappSession.a) && this.b == superappSession.b && jl40.l(this.c, superappSession.c) && this.d == superappSession.d && this.e == superappSession.e && this.f == superappSession.f && this.g == superappSession.g;
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return Long.hashCode(this.g) + oyr.b(this.f, qv10.c(qv10.c((c + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("SuperappSession(uid=", this.a, ", createdAtMs=", this.b);
        l.append(", foregroundStoppedAtMs=");
        l.append(this.c);
        l.append(", creationTtl=");
        l.append(this.d);
        x4e.A(this.e, ", foregroundStoppedTtl=", ", appVersion=", l);
        l.append(this.f);
        l.append(", passportUid=");
        l.append(this.g);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public SuperappSession() {
        this(0);
    }

    public SuperappSession(String str, long j, Long l, long j2, long j3, int i, long j4) {
        this.a = str;
        this.b = j;
        this.c = l;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
    }

    public /* synthetic */ SuperappSession(int i) {
        this("", -1L, null, -1L, -1L, -1, -1L);
    }
}
