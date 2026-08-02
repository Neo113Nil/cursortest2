package xsna;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Closeable;

/* compiled from: JsonReadContext.java */
/* loaded from: classes12.dex */
public final class lay extends vay {
    public final lay d;
    public final xno e;
    public lay f;
    public String g;
    public int h;
    public int i;

    public lay(lay layVar, int i, xno xnoVar, int i2, int i3, int i4) {
        this.d = layVar;
        this.e = xnoVar;
        this.a = i2;
        this.h = i3;
        this.i = i4;
        this.b = -1;
        this.c = i;
    }

    @Override // xsna.vay
    public final String a() {
        return this.g;
    }

    public final void f(String str) throws JsonProcessingException {
        this.g = str;
        xno xnoVar = this.e;
        if (xnoVar == null || !xnoVar.a(str)) {
            return;
        }
        Closeable closeable = (Closeable) xnoVar.a;
        throw new JsonParseException(closeable instanceof JsonParser ? (JsonParser) closeable : null, zr.a("Duplicate field '", str, "'"));
    }
}
