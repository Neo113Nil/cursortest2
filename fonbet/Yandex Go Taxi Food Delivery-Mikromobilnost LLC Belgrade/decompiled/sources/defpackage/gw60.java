package defpackage;

import com.yandex.plus.core.benchmark.b;
import com.yandex.plus.pay.common.api.network.OkHttpLog$Level;
import java.nio.charset.Charset;
import kotlin.collections.EmptyList;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes8.dex */
public final class gw60 implements p8w {
    public static final Charset c = Charset.forName("UTF-8");
    public final OkHttpLog$Level a;
    public final weu b;

    public gw60(OkHttpLog$Level okHttpLog$Level, weu weuVar) {
        this.a = okHttpLog$Level;
        this.b = weuVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        OkHttpLog$Level okHttpLog$Level = OkHttpLog$Level.NONE;
        OkHttpLog$Level okHttpLog$Level2 = this.a;
        if (okHttpLog$Level2 == okHttpLog$Level) {
            zci0 zci0Var = (zci0) m8wVar;
            return zci0Var.b(zci0Var.e);
        }
        zci0 zci0Var2 = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var2.e;
        fw60 fw60Var = new fw60();
        q66 q66Var = zci0Var2.d;
        RealConnection e = q66Var != null ? q66Var.e() : null;
        Protocol protocol = e != null ? e.g : null;
        if (protocol == null) {
            protocol = Protocol.HTTP_1_1;
        }
        m5j0 m5j0Var = d5j0Var.d;
        meu meuVar = d5j0Var.c;
        String str = d5j0Var.b + HexString.CHAR_SPACE + d5j0Var.a;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(str);
        sb.append(HexString.CHAR_SPACE);
        sb.append(protocol);
        sb.append(HexString.CHAR_SPACE);
        sb.append(m5j0Var == null ? "(no body)" : ums.j(m5j0Var.a(), m5j0Var.b()));
        fw60Var.a(sb.toString());
        OkHttpLog$Level okHttpLog$Level3 = OkHttpLog$Level.HEADERS;
        if (okHttpLog$Level2 == okHttpLog$Level3 || okHttpLog$Level2 == OkHttpLog$Level.BODY) {
            ums.e(fw60Var, meuVar);
        }
        if (m5j0Var != null && okHttpLog$Level2 == OkHttpLog$Level.BODY) {
            m5j0 m5j0Var2 = d5j0Var.d;
            if (m5j0Var2 == null) {
                ny61.g("Can't create body writer for request with no body.");
                return null;
            }
            yp6 yp6Var = new yp6();
            m5j0Var2.d(yp6Var);
            new nfh(yp6Var, m5j0Var2.b(), meuVar.a("Content-Encoding")).F(fw60Var);
        }
        fw60Var.a("--> END ".concat(str));
        String sb2 = fw60Var.a.toString();
        weu weuVar = this.b;
        weuVar.invoke(sb2);
        b bVar = new b("", EmptyList.a, new yci0());
        bVar.b();
        try {
            kvj0 b = ((zci0) m8wVar).b(d5j0Var);
            meu meuVar2 = b.y;
            rvj0 rvj0Var = b.z;
            bVar.c();
            fw60 fw60Var2 = new fw60();
            double a = w3n.a(bVar);
            String str2 = b.w + HexString.CHAR_SPACE + b.c;
            String str3 = Extension.O_BRAKE + a + "ms)";
            StringBuilder sb3 = new StringBuilder("<-- ");
            sb3.append(str2);
            sb3.append(HexString.CHAR_SPACE);
            sb3.append(b.a.a);
            sb3.append(HexString.CHAR_SPACE);
            sb3.append(str3);
            sb3.append(HexString.CHAR_SPACE);
            sb3.append(rvj0Var != null ? ums.j(rvj0Var.contentLength(), rvj0Var.contentType()) : "(no body)");
            fw60Var2.a(sb3.toString());
            if (okHttpLog$Level2 == okHttpLog$Level3 || okHttpLog$Level2 == OkHttpLog$Level.BODY) {
                ums.e(fw60Var2, meuVar2);
            }
            if (rvj0Var != null && okHttpLog$Level2 == OkHttpLog$Level.BODY) {
                qq6 source = rvj0Var.source();
                source.S(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                yp6 V0 = source.V0();
                wg10 contentType = rvj0Var.contentType();
                String a2 = meuVar2.a("Content-Encoding");
                new nfh(V0, contentType, a2 != null ? a2 : null).F(fw60Var2);
            }
            fw60Var2.a("<-- END HTTP");
            weuVar.invoke(fw60Var2.a.toString());
            return b;
        } catch (Exception e2) {
            weuVar.invoke("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }
}
