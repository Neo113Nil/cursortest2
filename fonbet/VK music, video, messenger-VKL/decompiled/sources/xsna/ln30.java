package xsna;

import java.io.InputStream;
import org.json.JSONObject;

/* compiled from: MsgPackJsonResponseTypeConverter.kt */
/* loaded from: classes11.dex */
public final class ln30 implements nay {
    public final bpn0 a = new bpn0(new rwe(5));

    @Override // xsna.nay
    public final boolean a(String str) {
        return drm0.D(str, "application/x-msgpack", true);
    }

    @Override // xsna.nay
    public final JSONObject b(InputStream inputStream) {
        return ((pn30) this.a.getValue()).a(inputStream);
    }
}
