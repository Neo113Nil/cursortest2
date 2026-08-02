package xsna;

import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import okhttp3.m;
import okhttp3.t;

/* compiled from: PasskeyBeginCommand.kt */
/* loaded from: classes6.dex */
public final class pl90 extends ara<rl90> {
    public final /* synthetic */ l7r0 b;
    public final /* synthetic */ ql90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl90(l7r0 l7r0Var, ql90 ql90Var) {
        super(l7r0Var);
        this.b = l7r0Var;
        this.c = ql90Var;
    }

    @Override // xsna.ara
    public final rl90 a(zqa zqaVar) {
        Object a;
        kpe0 kpe0Var = kpe0.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ql90 ql90Var = this.c;
        linkedHashMap.put(O6.e1, ql90Var.b);
        String str = ql90Var.c;
        if (str != null) {
            linkedHashMap.put("anonymous_token", str);
        }
        l7r0 l7r0Var = this.b;
        String a2 = kpe0.a(kpe0Var, linkedHashMap, l7r0Var.a.g, null, 0, null, null, PsExtractor.VIDEO_STREAM_MASK);
        String str2 = ql90Var.d;
        long j = dgn0.a().i;
        int i = dgn0.a().j;
        t.a aVar = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        okhttp3.m a3 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        aVar.getClass();
        alv alvVar = new alv(str2, j, i, 0, t.a.a(a2, a3), null, 40);
        a = zdq.a(l7r0Var, alvVar, new bgx0(l7r0Var, alvVar, ""), true);
        yfx0 yfx0Var = (yfx0) a;
        return new rl90((String) pn00.h("passkey_data", yfx0Var.b), (String) pn00.h(O6.e1, yfx0Var.b));
    }
}
