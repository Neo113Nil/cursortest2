package defpackage;

import java.util.Calendar;

@gsq0
/* loaded from: classes6.dex */
public final class j99 {
    public static final i99 Companion = new i99();
    public final String a;
    public final String b;
    public final Calendar c;
    public final String d;

    public /* synthetic */ j99(int i, String str, String str2, String str3, Calendar calendar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, h99.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        if ((i & 8) == 0) {
            this.d = "user_ready";
        } else {
            this.d = str3;
        }
    }

    public j99(String str, String str2, Calendar calendar) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = "user_ready";
    }
}
