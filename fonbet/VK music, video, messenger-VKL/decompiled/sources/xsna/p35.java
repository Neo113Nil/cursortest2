package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.sdk.VKApiConfig;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import okhttp3.m;
import okhttp3.t;
import ru.ok.android.sdk.SharedKt;

/* compiled from: AuthGetHashes.kt */
/* loaded from: classes6.dex */
public final class p35 extends ara<gcu0> {
    public final /* synthetic */ l7r0 b;
    public final /* synthetic */ q35 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p35(l7r0 l7r0Var, q35 q35Var) {
        super(l7r0Var);
        this.b = l7r0Var;
        this.c = q35Var;
    }

    @Override // xsna.ara
    public final gcu0 a(zqa zqaVar) {
        Object a;
        kpe0 kpe0Var = kpe0.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        q35 q35Var = this.c;
        String str = q35Var.d;
        if (str == null) {
            linkedHashMap.put("client_id", String.valueOf(q35Var.b));
            linkedHashMap.put(SharedKt.PARAM_CLIENT_SECRET, q35Var.c);
        } else {
            linkedHashMap.put("anonymous_token", str);
        }
        l7r0 l7r0Var = this.b;
        VKApiConfig vKApiConfig = l7r0Var.a;
        if (vKApiConfig.f.getValue().length() > 0) {
            linkedHashMap.put("device_id", vKApiConfig.f.getValue());
        }
        String a2 = kpe0.a(kpe0Var, linkedHashMap, vKApiConfig.g, null, 0, null, null, PsExtractor.VIDEO_STREAM_MASK);
        String str2 = q35Var.e;
        long j = dgn0.a().i;
        int i = dgn0.a().j;
        t.a aVar = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        okhttp3.m a3 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        aVar.getClass();
        alv alvVar = new alv(str2, j, i, 0, t.a.a(a2, a3), null, 40);
        a = zdq.a(l7r0Var, alvVar, new bgx0(l7r0Var, alvVar, ""), true);
        return new gcu0((String) pn00.h("nonce", ((yfx0) a).b));
    }
}
