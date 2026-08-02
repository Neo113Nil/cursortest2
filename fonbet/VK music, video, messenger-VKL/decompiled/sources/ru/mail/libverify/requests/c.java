package ru.mail.libverify.requests;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.j0.j;
import ru.mail.libverify.m.c;
import ru.mail.libverify.platform.core.ServiceType;
import ru.mail.libverify.requests.c;
import ru.mail.libverify.u.w;
import ru.mail.libverify.u.z;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import xsna.pkb;

/* loaded from: classes9.dex */
public abstract class c<REQ extends c<REQ, RESP>, RESP extends ru.mail.libverify.m.c<RESP, REQ>> extends ru.mail.libverify.j0.k<REQ, RESP> {
    private static final String[] j = "https://clientapi.mail.ru/".split(";");
    private static int k = 0;

    @NonNull
    protected final w h;

    @NonNull
    private final z i;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ServiceType.values().length];
            a = iArr;
            try {
                iArr[ServiceType.Huawei.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ServiceType.Firebase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(@NonNull w wVar) {
        super(wVar.getContext(), wVar.D());
        this.h = wVar;
        this.i = new z(wVar);
    }

    public static void z() {
        if (j.length == 1) {
            return;
        }
        synchronized (c.class) {
            k = 0;
            FileLog.d("ClientApiRequest", "reset api host to %d", 0);
        }
    }

    public final boolean A() {
        String[] strArr = j;
        if (strArr.length == 0) {
            throw new IllegalArgumentException("Wrong api host config");
        }
        if (strArr.length == 1) {
            return false;
        }
        synchronized (c.class) {
            if (k == strArr.length - 1) {
                return false;
            }
            try {
                if (!s().contains(strArr[k])) {
                    return false;
                }
            } catch (UnsupportedEncodingException unused) {
            }
            int i = k;
            int i2 = i + 1;
            k = i2;
            String[] strArr2 = j;
            FileLog.d("ClientApiRequest", "switch api host from %s to %s", strArr2[i], strArr2[i2]);
            return true;
        }
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final String a(@NonNull ru.mail.libverify.j0.f fVar) throws UnsupportedEncodingException {
        TreeSet treeSet = new TreeSet();
        StringBuilder sb = new StringBuilder(fVar.a());
        for (Map.Entry<String, String> entry : fVar.entrySet()) {
            treeSet.add(entry.getKey() + URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o());
        sb2.append((Object) sb);
        String A = this.h.A();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            sb3.append(Integer.toHexString(A.charAt(i)));
        }
        sb2.append(sb3.toString());
        return URLEncoder.encode(ru.mail.libverify.n0.e.e(sb2.toString()), C.UTF8_NAME);
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public String c() {
        String str;
        String[] strArr = j;
        if (strArr.length == 0) {
            throw new IllegalArgumentException("Wrong api host config");
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        synchronized (c.class) {
            try {
                int i = k;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException("Wrong api host config");
                }
                str = strArr[i];
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public String e() {
        return "fcgi-bin/" + o();
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public abstract String o();

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public ru.mail.libverify.j0.f p() {
        ru.mail.libverify.j0.f fVar = new ru.mail.libverify.j0.f();
        if (w() && !this.h.I()) {
            ru.mail.libverify.f0.a b = this.h.b();
            String j2 = b.j();
            String e = b.e();
            String d = b.d();
            Boolean g = b.g();
            Boolean h = b.h();
            String m = b.m();
            String l = b.l();
            String f = b.f();
            if (!TextUtils.isEmpty(d)) {
                fVar.put(O6.e1, d);
            }
            if (!TextUtils.isEmpty(e)) {
                fVar.put("ssn", e);
            }
            if (!TextUtils.isEmpty(j2)) {
                fVar.put("iso_country_code", j2);
            }
            if (!TextUtils.isEmpty(m)) {
                fVar.put("sim_state", m);
            }
            if (!TextUtils.isEmpty(l)) {
                fVar.put("sim_operator", l);
            }
            if (!TextUtils.isEmpty(f)) {
                fVar.put("network_operator", f);
            }
            if (g != null && g.booleanValue()) {
                fVar.put("roaming", "1");
            }
            if (h != null && h.booleanValue()) {
                fVar.put("roaming_net_allowed", "1");
            }
        }
        fVar.put(B5.o, a.a[VerificationFactory.getPlatformService(this.h.getContext()).getServiceType().ordinal()] != 1 ? "gps" : "hms");
        fVar.put("version", this.h.k());
        fVar.put("application", this.h.G());
        fVar.put("platform", "android");
        fVar.put("application_id", this.h.getId());
        this.h.N();
        fVar.put("os_version", Build.VERSION.RELEASE);
        this.h.getClass();
        fVar.put("libverify_version", "2.18.2");
        this.h.getClass();
        fVar.put("libverify_build", "297");
        String[] y = y();
        String str = "call_number_fragment,call_session_hash,background_verify,ping_v2,request_id,safety_net_v3,mow,route_info,mobileid_redirects";
        if (y != null && y.length > 0) {
            StringBuilder sb = new StringBuilder("call_number_fragment,call_session_hash,background_verify,ping_v2,request_id,safety_net_v3,mow,route_info,mobileid_redirects");
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : y) {
                sb2.append(StringUtils.COMMA);
                sb2.append(str2);
            }
            sb.append(sb2.toString());
            str = sb.toString();
        }
        fVar.put("capabilities", str);
        String b2 = this.i.b();
        if (!TextUtils.isEmpty(b2)) {
            fVar.put("push_token_id", b2);
        }
        String t = this.h.t();
        if (!TextUtils.isEmpty(t)) {
            fVar.put("device_id", t);
        }
        String l2 = this.h.l();
        if (!TextUtils.isEmpty(l2)) {
            fVar.put("device_id2", l2);
        }
        String r = this.h.r();
        if (!TextUtils.isEmpty(r)) {
            fVar.put("system_id", r);
        }
        String M = this.h.M();
        if (!TextUtils.isEmpty(M)) {
            fVar.put(AnalyticsBaseParamsConstantsKt.TIMEZONE, M);
        }
        return fVar;
    }

    @Override // ru.mail.libverify.j0.k
    public boolean u() {
        return !(this instanceof h);
    }

    public abstract boolean w();

    @Override // ru.mail.libverify.j0.k
    @NonNull
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final RESP b() throws ClientException, ServerException, IOException {
        RESP resp = (RESP) super.b();
        this.h.u().a(resp.f(), resp.c(), resp.b());
        return resp;
    }

    @Nullable
    public String[] y() {
        return null;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final Future a(@NonNull ExecutorService executorService, @NonNull ru.mail.libverify.p0.b bVar, @Nullable j.c cVar) {
        return new ru.mail.libverify.j0.j(executorService, bVar, new pkb(this, 2), null, cVar).a();
    }
}
