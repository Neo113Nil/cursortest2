package defpackage;

import com.yandex.messaging.input.bricks.writing.InputWritingPhase;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p1w {
    public final InputWritingPhase a;
    public final String b;
    public final long c;
    public final boolean d;

    public p1w(InputWritingPhase inputWritingPhase, String str, long j, boolean z) {
        this.a = inputWritingPhase;
        this.b = str;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1w)) {
            return false;
        }
        p1w p1wVar = (p1w) obj;
        return this.a == p1wVar.a && jl40.l(this.b, p1wVar.b) && this.c == p1wVar.c && this.d == p1wVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qv10.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "InputWritingState(phase=" + this.a + ", text=" + this.b + ", waitFor=" + this.c + ", canRecordVoice=" + this.d + Extension.C_BRAKE;
    }
}
