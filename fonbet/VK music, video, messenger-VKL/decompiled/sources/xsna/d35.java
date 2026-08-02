package xsna;

import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;
import okhttp3.m;
import okhttp3.t;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;

/* compiled from: AuthExtendSilentTokenCommand.kt */
/* loaded from: classes6.dex */
public final class d35 extends nx2<bcu0> {
    public final String b;
    public final Object c;
    public final Object d;

    public d35(String str, int i, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2) {
        this.b = zr.a("https://", str, "/extend_silent_token");
        this.c = pn00.k(new Pair("client_id", String.valueOf(i)), new Pair("silent_token", str2), new Pair(LoginApiConstants.PARAM_NAME_PASSWORD, str3), new Pair("silent_token_uuid", str4));
        this.d = pn00.k(new Pair("provided_tokens", arrayList), new Pair("provided_uuids", arrayList2));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.nx2
    public final bcu0 f(l7r0 l7r0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        String a = kpe0.a(kpe0.a, this.c, l7r0Var.a.g, null, 0, this.d, null, 236);
        long j = dgn0.a().i;
        int i = dgn0.a().j;
        t.a aVar = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        okhttp3.m a2 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        aVar.getClass();
        alv alvVar = new alv(this.b, j, i, 0, t.a.a(a, a2), null, 40);
        com.vk.superapp.core.api.models.a aVar2 = (com.vk.superapp.core.api.models.a) zdq.a(l7r0Var, alvVar, new bo70(l7r0Var, l7r0Var.i(), alvVar), true);
        if (aVar2.A.length() != 0) {
            throw new VKWebAuthException(200, 56, aVar2.A, aVar2.B, null);
        }
        return new bcu0(aVar2.i, aVar2.j, TimeUnit.SECONDS.toMillis(aVar2.k) + currentTimeMillis, aVar2.l, aVar2.m);
    }
}
