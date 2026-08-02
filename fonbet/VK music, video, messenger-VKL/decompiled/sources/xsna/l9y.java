package xsna;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;

/* compiled from: JsonGeneratorImpl.java */
/* loaded from: classes12.dex */
public abstract class l9y extends jjt {
    public static final int[] k = amb.j;
    public final tnv e;
    public int[] f;
    public int g;
    public jmi0 h;
    public final boolean i;
    public final boolean j;

    public l9y(tnv tnvVar, int i, ip70 ip70Var) {
        this.b = i;
        this.d = new pby(0, null, JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.i(i) ? new xno(this) : null);
        this.c = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.i(i);
        this.f = k;
        this.h = DefaultPrettyPrinter.b;
        this.e = tnvVar;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.i(i)) {
            this.g = 127;
        }
        this.j = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.i(i);
        this.i = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.i(i);
    }

    public final void J(String str) throws IOException {
        JsonGenerator.i("Can not " + str + ", expecting field name (context: " + this.d.e() + ")");
        throw null;
    }
}
