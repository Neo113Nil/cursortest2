package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
/* loaded from: classes9.dex */
public final class bwx {
    public static final xvx Companion = new xvx();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final awx f;
    public final boolean g;

    public /* synthetic */ bwx(int i, String str, String str2, String str3, String str4, String str5, awx awxVar, boolean z) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, wvx.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = awxVar;
        this.g = z;
    }

    public bwx(String str, String str2, String str3, String str4, String str5, awx awxVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = awxVar;
        this.g = z;
    }
}
