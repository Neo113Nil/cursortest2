package defpackage;

import java.util.Calendar;

@gsq0
/* loaded from: classes6.dex */
public final class loq0 {
    public static final koq0 Companion = new koq0();
    public final String a;
    public final String b;
    public final Calendar c;
    public final boolean d;

    public /* synthetic */ loq0(int i, String str, String str2, Calendar calendar, boolean z) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, joq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = z;
    }

    public loq0(String str, String str2, Calendar calendar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = z;
    }
}
