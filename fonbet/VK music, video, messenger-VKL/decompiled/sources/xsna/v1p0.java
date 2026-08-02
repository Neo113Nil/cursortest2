package xsna;

import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: TokenConfirmationRefresher.kt */
/* loaded from: classes15.dex */
public final class v1p0 {
    public final wy2 a;

    /* compiled from: TokenConfirmationRefresher.kt */
    public static final class a implements k7r0<Pair<? extends String, ? extends String>> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            return new Pair(jSONObject2.getString("token"), jSONObject2.optString("secret"));
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public v1p0(wy2 wy2Var) {
        this.a = wy2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7 A[Catch: Exception -> 0x0122, TryCatch #0 {Exception -> 0x0122, blocks: (B:12:0x007f, B:14:0x009d, B:16:0x00b9, B:20:0x00c3, B:22:0x00e7, B:24:0x00ed, B:26:0x0107, B:30:0x0116, B:33:0x010e, B:35:0x00c0, B:36:0x0121), top: B:11:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107 A[Catch: Exception -> 0x0122, TryCatch #0 {Exception -> 0x0122, blocks: (B:12:0x007f, B:14:0x009d, B:16:0x00b9, B:20:0x00c3, B:22:0x00e7, B:24:0x00ed, B:26:0x0107, B:30:0x0116, B:33:0x010e, B:35:0x00c0, B:36:0x0121), top: B:11:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(VKApiExecutionException vKApiExecutionException) {
        UserId userId;
        h7r0 h7r0Var;
        UtilityTokens utilityTokens;
        wy2 wy2Var = this.a;
        if (wy2Var.l == null) {
            throw vKApiExecutionException;
        }
        if (wy2Var.i == null) {
            throw vKApiExecutionException;
        }
        ij20.a aVar = new ij20.a();
        aVar.c = "auth.refreshToken";
        wy2 wy2Var2 = this.a;
        aVar.d = wy2Var2.a.g;
        aVar.h = true;
        v6l v6lVar = wy2Var2.j;
        if (v6lVar == null || !v6lVar.a) {
            Pair pair = (Pair) wy2Var2.l.a.invoke();
            aVar.b("receipt", (String) pair.i());
            aVar.f.put("push_timestamp", Long.valueOf(this.a.l.a(((Number) pair.j()).longValue())).toString());
        } else {
            aVar.b("receipt", "yssp9o9p9pamz5t-nvmq8spgwtin3e0==");
            aVar.w = true;
        }
        aVar.f.put("timestamp", Long.valueOf(this.a.l.a(System.currentTimeMillis())).toString());
        try {
            Pair pair2 = (Pair) this.a.d(new ij20(aVar), new a());
            if (((CharSequence) pair2.i()).length() <= 0) {
                throw vKApiExecutionException;
            }
            zx2 zx2Var = this.a.i;
            h7r0 h7r0Var2 = (h7r0) j5g.a0(this.a.i().e.getValue());
            if (h7r0Var2 != null) {
                userId = h7r0Var2.e;
                if (userId == null) {
                }
                UserId userId2 = userId;
                String str = (String) pair2.i();
                String str2 = (String) pair2.j();
                h7r0 h7r0Var3 = (h7r0) j5g.a0(this.a.i().e.getValue());
                int i = h7r0Var3 == null ? h7r0Var3.c : 0;
                long currentTimeMillis = System.currentTimeMillis();
                h7r0Var = (h7r0) j5g.a0(this.a.i().e.getValue());
                if (h7r0Var != null) {
                    utilityTokens = h7r0Var.f;
                    if (utilityTokens != null) {
                    }
                    zx2Var.a(Collections.singletonList(new com.vk.api.sdk.auth.a(i, currentTimeMillis, utilityTokens, userId2, str, str2)));
                }
                UtilityTokens.CREATOR.getClass();
                utilityTokens = UtilityTokens.c;
                zx2Var.a(Collections.singletonList(new com.vk.api.sdk.auth.a(i, currentTimeMillis, utilityTokens, userId2, str, str2)));
            }
            userId = UserId.d;
            UserId userId22 = userId;
            String str3 = (String) pair2.i();
            String str22 = (String) pair2.j();
            h7r0 h7r0Var32 = (h7r0) j5g.a0(this.a.i().e.getValue());
            int i2 = h7r0Var32 == null ? h7r0Var32.c : 0;
            long currentTimeMillis2 = System.currentTimeMillis();
            h7r0Var = (h7r0) j5g.a0(this.a.i().e.getValue());
            if (h7r0Var != null) {
            }
            UtilityTokens.CREATOR.getClass();
            utilityTokens = UtilityTokens.c;
            zx2Var.a(Collections.singletonList(new com.vk.api.sdk.auth.a(i2, currentTimeMillis2, utilityTokens, userId22, str3, str22)));
        } catch (Exception unused) {
            throw vKApiExecutionException;
        }
    }
}
