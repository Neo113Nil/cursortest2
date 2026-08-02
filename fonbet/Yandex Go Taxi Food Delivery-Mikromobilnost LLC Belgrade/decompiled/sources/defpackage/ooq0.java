package defpackage;

import java.util.Calendar;

@gsq0
/* loaded from: classes6.dex */
public final class ooq0 {
    public static final noq0 Companion = new noq0();
    public final String a;
    public final String b;
    public final Calendar c;
    public final boolean d;

    public /* synthetic */ ooq0(int i, String str, String str2, Calendar calendar, boolean z) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, moq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = z;
    }

    public ooq0(String str, String str2, Calendar calendar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = z;
    }
}
