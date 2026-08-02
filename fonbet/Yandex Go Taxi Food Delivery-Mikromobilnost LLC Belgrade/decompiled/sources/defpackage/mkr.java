package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class mkr implements p8w {
    public final /* synthetic */ nf4 a;
    public final /* synthetic */ Merchant b;
    public final /* synthetic */ km0 c;
    public final /* synthetic */ rwo d;
    public final /* synthetic */ Payer e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ izy g;

    public mkr(nf4 nf4Var, Merchant merchant, km0 km0Var, pkr pkrVar, rwo rwoVar, Payer payer, Context context, izy izyVar) {
        this.a = nf4Var;
        this.b = merchant;
        this.c = km0Var;
        this.d = rwoVar;
        this.e = payer;
        this.f = context;
        this.g = izyVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        String uid;
        String oauthToken;
        iho L;
        String str;
        nf4 nf4Var = this.a;
        qyj0 e = n891.e(nf4Var.b());
        kyj0 kyj0Var = e instanceof kyj0 ? (kyj0) e : null;
        rs20 rs20Var = kyj0Var != null ? (rs20) kyj0Var.a : null;
        Payer payer = this.e;
        if ((rs20Var == null || (uid = rs20Var.b) == null) && (uid = payer.getUid()) == null) {
            uid = "";
        }
        if ((rs20Var == null || (oauthToken = rs20Var.a) == null) && (oauthToken = payer.getOauthToken()) == null) {
            oauthToken = "";
        }
        Pair pair = new Pair(uid, oauthToken);
        String str2 = (String) pair.getFirst();
        String str3 = (String) pair.getSecond();
        String uuid = UUID.randomUUID().toString();
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        kwu kwuVar = d5j0Var.a;
        m5j0 m5j0Var = d5j0Var.d;
        String Q = cvu0.x(kwuVar.b(), "//", false) ? evu0.Q("/", kwuVar.b()) : kwuVar.b();
        jwu g = kwuVar.g();
        g.g(Q);
        kwu e2 = g.e();
        t4j0 b = d5j0Var.b();
        b.a = e2;
        b.c.g(ExtFunctionsKt.HEADER_USER_AGENT, ofu.b);
        b.c.g("X-Request-ID", uuid);
        b.c.g("X-SDK-Version", "7.6.6");
        b.c.g("X-SERVICE-TOKEN", this.b.getServiceToken());
        b.c.g("X-SDK-PLATFORM", ConstantDeviceInfo.APP_PLATFORM);
        b.c.g("X-UID", str2);
        b.c.g("Content-Type", "application/json");
        b.c.g("Authorization", "OAuth " + str3);
        b.c.g("Accept-Language", Locale.getDefault().getLanguage());
        Object obj = this.c.a().get("api_instance_id");
        if (obj == null) {
            obj = "";
        }
        b.c.g("trace_id", (String) obj);
        String uuid2 = AppMetrica.getUuid(this.f);
        if (uuid2 != null) {
            b.d("X-UUID", uuid2);
        }
        b.e(d5j0Var.b, m5j0Var);
        d5j0 d5j0Var2 = new d5j0(b);
        Set set = pkr.a;
        String str4 = kwuVar.d;
        if (m5j0Var != null) {
            sv90 sv90Var = qv90.a;
            String b2 = kwuVar.b();
            try {
                yp6 yp6Var = new yp6();
                m5j0Var.d(yp6Var);
                str = yp6Var.I0();
            } catch (Exception e3) {
                LinkedHashMap linkedHashMap = zdz.a;
                ogb1.b("Error converting request body to string: " + e3.getMessage());
                str = "";
            }
            sv90Var.getClass();
            StringBuilder sb = new StringBuilder("Выполнение сетевого запроса по адресу ");
            sb.append(str4);
            sb.append(" в ручку ");
            sb.append(b2);
            String r = unr0.r(sb, " с параметрами: request_id = ", uuid, ", traceparent = ");
            sv90 sv90Var2 = qv90.a;
            wj00 i = vfc.i(0, "body", str, "target_path", b2);
            i.k("traceparent", "");
            i.k("request_id", uuid);
            i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, r);
            i.k(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, str4);
            L = y891.c("perform_request", i);
        } else {
            sv90 sv90Var3 = qv90.a;
            String b3 = kwuVar.b();
            sv90Var3.getClass();
            L = sv90.L(b3, "", uuid, str4);
        }
        y22 y22Var = (y22) this.d;
        y22Var.a(L);
        kvj0 b4 = zci0Var.b(d5j0Var2);
        if (pkr.a.contains(Integer.valueOf(b4.w))) {
            qyj0 e4 = n891.e(nf4Var.a());
            kyj0 kyj0Var2 = e4 instanceof kyj0 ? (kyj0) e4 : null;
            if (kyj0Var2 != null && ((Boolean) kyj0Var2.a).booleanValue()) {
                qyj0 e5 = n891.e(nf4Var.b());
                kyj0 kyj0Var3 = e5 instanceof kyj0 ? (kyj0) e5 : null;
                rs20 rs20Var2 = kyj0Var3 != null ? (rs20) kyj0Var3.a : null;
                t4j0 b5 = d5j0Var2.b();
                b5.c.g("Authorization", g8e.o("OAuth ", rs20Var2 != null ? rs20Var2.a : null));
                b4 = zci0Var.b(new d5j0(b5));
            }
        }
        izy izyVar = this.g;
        if (!izyVar.b) {
            izyVar.b = true;
            new Handler(Looper.getMainLooper()).postDelayed(new dhv(29, izyVar), 500L);
        }
        sv90 sv90Var4 = qv90.a;
        String b6 = kwuVar.b();
        String str5 = kwuVar.d;
        long j = b4.F - b4.E;
        int i2 = b4.w;
        sv90Var4.getClass();
        iho M = sv90.M(j, b6, "", uuid, str5, i2);
        y22Var.a(b4.J ? M.d(null) : iho.b(M, null, 3));
        return b4;
    }
}
