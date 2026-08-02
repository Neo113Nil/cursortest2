package com.yandex.go.drive.sdkintegration.source;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.tvl;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/drive/sdkintegration/source/DriveStoredUserSession;", "", "Companion", "$serializer", "com/yandex/go/drive/sdkintegration/source/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DriveStoredUserSession {
    public static final b Companion = new b();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(17))};
    public final Long a;
    public final String b;
    public final List c;

    public /* synthetic */ DriveStoredUserSession(int i, Long l, String str, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveStoredUserSession)) {
            return false;
        }
        DriveStoredUserSession driveStoredUserSession = (DriveStoredUserSession) obj;
        return jl40.l(this.a, driveStoredUserSession.a) && jl40.l(this.b, driveStoredUserSession.b) && jl40.l(this.c, driveStoredUserSession.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriveStoredUserSession(timestamp=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", sessions=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public DriveStoredUserSession() {
        this(0);
    }

    public DriveStoredUserSession(Long l, String str, List list) {
        this.a = l;
        this.b = str;
        this.c = list;
    }

    public /* synthetic */ DriveStoredUserSession(int i) {
        this(null, null, EmptyList.a);
    }
}
