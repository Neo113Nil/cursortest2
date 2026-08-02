package xsna;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;

/* compiled from: GeneratorBase.java */
/* loaded from: classes12.dex */
public abstract class jjt extends JsonGenerator {
    public int b;
    public boolean c;
    public pby d;

    static {
        JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.j();
        JsonGenerator.Feature.ESCAPE_NON_ASCII.j();
        JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.j();
    }

    public final String H(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.i(this.b)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        JsonGenerator.i(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(scale), 9999, 9999));
        throw null;
    }

    public final boolean I(JsonGenerator.Feature feature) {
        return (feature.j() & this.b) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void x() throws IOException {
        p();
    }
}
