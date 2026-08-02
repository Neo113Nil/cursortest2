package xsna;

import android.os.Bundle;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.google.zxing.client.result.URIParsedResult;

/* compiled from: AwayUriParsedResult.kt */
/* loaded from: classes5.dex */
public final class iu5 extends ParsedResult {
    public final Bundle a;
    public final URIParsedResult b;

    public iu5(String str, String str2, Bundle bundle) {
        super(ParsedResultType.URI);
        this.a = bundle;
        this.b = new URIParsedResult(str, str2);
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public final String getDisplayResult() {
        return this.b.getDisplayResult();
    }
}
