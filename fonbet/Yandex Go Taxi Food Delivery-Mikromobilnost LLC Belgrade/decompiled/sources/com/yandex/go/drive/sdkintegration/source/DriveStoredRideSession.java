package com.yandex.go.drive.sdkintegration.source;

import defpackage.auu0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.pnz;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/drive/sdkintegration/source/DriveStoredRideSession;", "", "Companion", "$serializer", "com/yandex/go/drive/sdkintegration/source/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DriveStoredRideSession {
    public static final a Companion = new a();
    public final String a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public /* synthetic */ DriveStoredRideSession(int i, String str, Long l, String str2, String str3, String str4, String str5, String str6, int i2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i2;
        }
    }

    public static final /* synthetic */ void i(DriveStoredRideSession driveStoredRideSession, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(driveStoredRideSession.a, "")) {
            yjdVar.o(serialDescriptor, 0, driveStoredRideSession.a);
        }
        if (yjdVar.F() || driveStoredRideSession.b != null) {
            yjdVar.g(serialDescriptor, 1, pnz.a, driveStoredRideSession.b);
        }
        if (yjdVar.F() || driveStoredRideSession.c != null) {
            yjdVar.g(serialDescriptor, 2, auu0.a, driveStoredRideSession.c);
        }
        if (yjdVar.F() || driveStoredRideSession.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, driveStoredRideSession.d);
        }
        if (yjdVar.F() || driveStoredRideSession.e != null) {
            yjdVar.g(serialDescriptor, 4, auu0.a, driveStoredRideSession.e);
        }
        if (yjdVar.F() || driveStoredRideSession.f != null) {
            yjdVar.g(serialDescriptor, 5, auu0.a, driveStoredRideSession.f);
        }
        if (yjdVar.F() || driveStoredRideSession.g != null) {
            yjdVar.g(serialDescriptor, 6, auu0.a, driveStoredRideSession.g);
        }
        if (!yjdVar.F() && driveStoredRideSession.h == 0) {
            return;
        }
        yjdVar.A(7, driveStoredRideSession.h, serialDescriptor);
    }

    /* renamed from: a, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: b, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final Long getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DriveStoredRideSession)) {
            return false;
        }
        DriveStoredRideSession driveStoredRideSession = (DriveStoredRideSession) obj;
        return jl40.l(this.a, driveStoredRideSession.a) && jl40.l(this.b, driveStoredRideSession.b) && jl40.l(this.c, driveStoredRideSession.c) && jl40.l(this.d, driveStoredRideSession.d) && jl40.l(this.e, driveStoredRideSession.e) && jl40.l(this.f, driveStoredRideSession.f) && jl40.l(this.g, driveStoredRideSession.g) && this.h == driveStoredRideSession.h;
    }

    /* renamed from: f, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* renamed from: g, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: h, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return Integer.hashCode(this.h) + ((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriveStoredRideSession(id=");
        sb.append(this.a);
        sb.append(", freeTime=");
        sb.append(this.b);
        sb.append(", plateNumber=");
        g8e.D(sb, this.c, ", buttonTitle=", this.d, ", buttonSubtitle=");
        g8e.D(sb, this.e, ", buttonIconUrl=", this.f, ", buttonPrice=");
        sb.append(this.g);
        sb.append(", goStateOrdinal=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public DriveStoredRideSession(String str, Long l, String str2, String str3, String str4, String str5, String str6, int i) {
        this.a = str;
        this.b = l;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i;
    }

    public DriveStoredRideSession() {
        this("", null, null, null, null, null, null, 0);
    }
}
