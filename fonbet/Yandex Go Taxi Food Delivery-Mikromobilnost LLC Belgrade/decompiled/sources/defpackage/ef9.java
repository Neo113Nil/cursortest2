package defpackage;

import java.util.Calendar;

@gsq0
/* loaded from: classes6.dex */
public final class ef9 {
    public static final df9 Companion = new df9();
    public final String a;
    public final String b;
    public final Calendar c;
    public final String d;

    public /* synthetic */ ef9(int i, String str, String str2, String str3, Calendar calendar) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, cf9.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = str3;
    }

    public ef9(String str, String str2, Calendar calendar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = str3;
    }
}
