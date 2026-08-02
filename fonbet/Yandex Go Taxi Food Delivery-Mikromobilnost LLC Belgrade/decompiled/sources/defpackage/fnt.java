package defpackage;

import com.yandex.go.drive.api.models.GoDriveSessionState;

/* loaded from: classes12.dex */
public final class fnt {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final GoDriveSessionState h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fnt(qfm qfmVar) {
        this(r1, r2, r3, r4, r5, r6, r7, r10);
        GoDriveSessionState goDriveSessionState;
        String str = qfmVar.a;
        umt umtVar = qfmVar.f;
        String str2 = umtVar.c;
        Long l = qfmVar.b;
        String str3 = umtVar.a;
        String str4 = umtVar.b;
        String str5 = umtVar.d;
        String str6 = umtVar.e;
        switch (gnt.a[qfmVar.d.ordinal()]) {
            case 1:
                goDriveSessionState = GoDriveSessionState.ReservationFree;
                break;
            case 2:
                goDriveSessionState = GoDriveSessionState.ReservationPaid;
                break;
            case 3:
                goDriveSessionState = GoDriveSessionState.AcceptanceFree;
                break;
            case 4:
                goDriveSessionState = GoDriveSessionState.AcceptancePaid;
                break;
            case 5:
                goDriveSessionState = GoDriveSessionState.Riding;
                break;
            case 6:
                goDriveSessionState = GoDriveSessionState.Parking;
                break;
            case 7:
                goDriveSessionState = GoDriveSessionState.Unrecognized;
                break;
            default:
                w511.b();
                throw null;
        }
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final Long e() {
        return this.c;
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.b;
    }

    public final GoDriveSessionState h() {
        return this.h;
    }

    public fnt(String str, String str2, Long l, String str3, String str4, String str5, String str6, GoDriveSessionState goDriveSessionState) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = goDriveSessionState;
    }
}
