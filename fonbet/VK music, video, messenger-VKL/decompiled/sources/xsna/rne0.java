package xsna;

import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ResultParser;
import java.util.Arrays;

/* compiled from: QrInfo.kt */
/* loaded from: classes5.dex */
public final class rne0 {
    public final ParsedResult a;
    public final ResultPoint[] b;
    public final yne0 c;
    public final String d;
    public final boolean e;

    public rne0(ParsedResult parsedResult, ResultPoint[] resultPointArr, yne0 yne0Var, String str, boolean z) {
        this.a = parsedResult;
        this.b = resultPointArr;
        this.c = yne0Var;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rne0)) {
            return false;
        }
        rne0 rne0Var = (rne0) obj;
        return epx.f(this.a, rne0Var.a) && epx.f(this.b, rne0Var.b) && epx.f(this.c, rne0Var.c) && epx.f(this.d, rne0Var.d) && this.e == rne0Var.e;
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31;
        yne0 yne0Var = this.c;
        return Boolean.hashCode(this.e) + urd0.a((hashCode + (yne0Var == null ? 0 : yne0Var.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrInfo(result=");
        sb.append(this.a);
        sb.append(", qrBorderPoints=");
        sb.append(Arrays.toString(this.b));
        sb.append(", qrPreviewInfo=");
        sb.append(this.c);
        sb.append(", rawText=");
        sb.append(this.d);
        sb.append(", isGoogleVision=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public rne0(Result result, boolean z) {
        this(ResultParser.parseResult(result), result.getResultPoints(), null, result.getText(), z);
    }
}
