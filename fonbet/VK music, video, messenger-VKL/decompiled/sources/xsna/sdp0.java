package xsna;

import io.jsonwebtoken.JwtParser;
import io.opentelemetry.api.trace.SpanKind;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

/* compiled from: TraceIdRatioBasedSampler.java */
/* loaded from: classes11.dex */
public final class sdp0 implements n0h0 {
    public static final rm5 d = hpw.a;
    public static final rm5 e = hpw.b;
    public final long b;
    public final String c;

    public sdp0(long j, double d2) {
        this.b = j;
        StringBuilder sb = new StringBuilder("TraceIdRatioBased{");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(Locale.ROOT);
        decimalFormatSymbols.setDecimalSeparator(JwtParser.SEPARATOR_CHAR);
        sb.append(new DecimalFormat("0.000000", decimalFormatSymbols).format(d2));
        sb.append("}");
        this.c = sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sdp0) && this.b == ((sdp0) obj).b;
    }

    @Override // xsna.n0h0
    public final String getDescription() {
        return this.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // xsna.n0h0
    public final p0h0 shouldSample(wmj wmjVar, String str, String str2, SpanKind spanKind, q94 q94Var, List<d9z> list) {
        char[] cArr = oz80.a;
        return Math.abs((((long) oz80.a(str.charAt(30), str.charAt(31))) & 255) | ((((((((((long) oz80.a(str.charAt(16), str.charAt(17))) & 255) << 56) | ((((long) oz80.a(str.charAt(18), str.charAt(19))) & 255) << 48)) | ((((long) oz80.a(str.charAt(20), str.charAt(21))) & 255) << 40)) | ((((long) oz80.a(str.charAt(22), str.charAt(23))) & 255) << 32)) | ((((long) oz80.a(str.charAt(24), str.charAt(25))) & 255) << 24)) | ((((long) oz80.a(str.charAt(26), str.charAt(27))) & 255) << 16)) | ((((long) oz80.a(str.charAt(28), str.charAt(29))) & 255) << 8))) < this.b ? d : e;
    }

    public final String toString() {
        return this.c;
    }
}
