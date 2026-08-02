package xsna;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;

/* compiled from: JsonWriteContext.java */
/* loaded from: classes12.dex */
public final class pby extends vay {
    public final pby d;
    public final xno e;
    public pby f;
    public String g;
    public boolean h;

    public pby(int i, pby pbyVar, xno xnoVar) {
        this.a = i;
        this.d = pbyVar;
        this.e = xnoVar;
        this.b = -1;
    }

    @Override // xsna.vay
    public final String a() {
        return this.g;
    }

    public final int f(String str) throws JsonProcessingException {
        if (this.a != 2 || this.h) {
            return 4;
        }
        this.h = true;
        this.g = str;
        xno xnoVar = this.e;
        if (xnoVar == null || !xnoVar.a(str)) {
            return this.b < 0 ? 0 : 1;
        }
        throw new JsonGenerationException(zr.a("Duplicate field '", str, "'"), null, null);
    }

    public final int g() {
        int i = this.a;
        if (i == 2) {
            if (!this.h) {
                return 5;
            }
            this.h = false;
            this.b++;
            return 2;
        }
        if (i == 1) {
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 >= 0) {
                return 1;
            }
        } else {
            int i3 = this.b + 1;
            this.b = i3;
            if (i3 != 0) {
                return 3;
            }
        }
        return 0;
    }
}
