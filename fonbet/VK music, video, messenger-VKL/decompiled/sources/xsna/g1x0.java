package xsna;

import java.io.File;

/* compiled from: VoipShareCallCalendarInfo.kt */
/* loaded from: classes7.dex */
public final class g1x0 {
    public final String a;
    public final String b;
    public final File c;

    public g1x0(String str, String str2, File file) {
        this.a = str;
        this.b = str2;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1x0)) {
            return false;
        }
        g1x0 g1x0Var = (g1x0) obj;
        return epx.f(this.a, g1x0Var.a) && epx.f(this.b, g1x0Var.b) && epx.f(this.c, g1x0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "VoipShareCallInfo(subject=" + this.a + ", description=" + this.b + ", calendarEventIcs=" + this.c + ')';
    }
}
