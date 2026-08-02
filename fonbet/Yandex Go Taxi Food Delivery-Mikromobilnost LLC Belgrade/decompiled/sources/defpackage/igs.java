package defpackage;

import android.net.Uri;
import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.data.auth.api.TokenSource;
import com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.core.network.auth.a;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import kotlin.Result;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class igs implements zz50 {
    public static final zcx f = tje.a(sbx.d, new xvq(24));
    public final z22 a;
    public final hk3 b;
    public final a c;
    public final wo90 d;
    public final String e;

    public igs(rgs rgsVar, z22 z22Var, hk3 hk3Var, a aVar, wo90 wo90Var) {
        this.a = z22Var;
        this.b = hk3Var;
        this.c = aVar;
        this.d = wo90Var;
        this.e = Uri.parse(rgsVar.a()).getHost();
    }

    @Override // defpackage.zz50
    public final int a() {
        return 2;
    }

    @Override // defpackage.zz50
    public final s1k0 b(int i, String str, d5j0 d5j0Var, kvj0 kvj0Var) {
        Object failure;
        Integer num;
        Integer num2;
        Object failure2;
        d5j0 d5j0Var2;
        String str2;
        String a;
        TokenSource tokenSource;
        meu meuVar = kvj0Var.y;
        zcx zcxVar = f;
        kwu kwuVar = d5j0Var.a;
        boolean l = jl40.l(kwuVar.d, this.e);
        p1k0 p1k0Var = p1k0.a;
        if (l && kvj0Var.w == 403) {
            try {
                c m = qcx.m(zcxVar.d(str));
                b bVar = (b) m.get(AuthSdkActivity.RESPONSE_TYPE_CODE);
                Integer k = bVar != null ? qcx.k(qcx.n(bVar)) : null;
                b bVar2 = (b) m.get("subcode");
                failure = new hgs(k, bVar2 != null ? qcx.k(qcx.n(bVar2)) : null);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            hgs hgsVar = (hgs) failure;
            if (hgsVar != null && (num = hgsVar.a) != null && num.intValue() == 1004 && (num2 = hgsVar.b) != null && num2.intValue() == 1) {
                xk3 xk3Var = (xk3) this.b.c.a.getValue();
                qk3 qk3Var = xk3Var instanceof qk3 ? (qk3) xk3Var : null;
                String analyticsValue = (qk3Var == null || (tokenSource = qk3Var.b) == null) ? null : tokenSource.getAnalyticsValue();
                int i2 = i + 1;
                String b = nka1.b(d5j0Var);
                Integer num3 = hgsVar.a;
                try {
                    b bVar3 = (b) qcx.m(zcxVar.d(str)).get(Constants.KEY_MESSAGE);
                    failure2 = bVar3 != null ? qcx.n(bVar3).a() : null;
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                if (failure2 instanceof Result.Failure) {
                    failure2 = null;
                }
                String str3 = (String) failure2;
                Integer num4 = hgsVar.b;
                String str4 = d5j0Var.b;
                String b2 = kwuVar.b();
                Header header = Header.RequestId;
                String a2 = meuVar.a(header.getKey());
                if (a2 == null) {
                    a2 = null;
                }
                yz50 yz50Var = new yz50(i2, b, num3, str3, num4, str4, b2, a2 == null ? "" : a2, kvj0Var.w, analyticsValue);
                com.yandex.fintechsdk.core.analytics.impl.internal.a aVar = (com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a;
                aVar.a(yz50Var);
                if (this.c.b()) {
                    wo90 wo90Var = this.d;
                    wo90Var.getClass();
                    Header header2 = Header.Authorization;
                    if (d5j0Var.c.a(header2.getKey()) == null || (a = wo90Var.a.a()) == null) {
                        d5j0Var2 = null;
                    } else {
                        String format = String.format("OAuth %s", Arrays.copyOf(new Object[]{a}, 1));
                        t4j0 b3 = d5j0Var.b();
                        Header header3 = Header.OAuthToken;
                        b3.c.f(header3.getKey());
                        b3.c.f(header2.getKey());
                        b3.c.a(header3.getKey(), a);
                        b3.c.a(header2.getKey(), format);
                        d5j0Var2 = new d5j0(b3);
                    }
                    if (d5j0Var2 == null) {
                        String b4 = nka1.b(d5j0Var);
                        String b5 = kwuVar.b();
                        String a3 = meuVar.a(header.getKey());
                        str2 = a3 != null ? a3 : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        aVar.a(new aj3(i2, b4, b5, str2));
                        return p1k0Var;
                    }
                    String b6 = nka1.b(d5j0Var);
                    String b7 = kwuVar.b();
                    String a4 = meuVar.a(header.getKey());
                    str2 = a4 != null ? a4 : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar.a(new bj3(i2, b6, b7, str2));
                    return new q1k0(d5j0Var2);
                }
            }
        }
        return p1k0Var;
    }
}
