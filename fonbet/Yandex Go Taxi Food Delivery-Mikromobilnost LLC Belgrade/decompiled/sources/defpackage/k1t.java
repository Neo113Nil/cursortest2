package defpackage;

import java.util.Calendar;

@gsq0
/* loaded from: classes6.dex */
public final class k1t {
    public static final j1t Companion = new j1t();
    public final String a;
    public final String b;
    public final Calendar c;
    public final boolean d;

    public /* synthetic */ k1t(int i, String str, String str2, Calendar calendar, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, i1t.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
    }

    public k1t(String str, String str2, Calendar calendar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = z;
    }
}
