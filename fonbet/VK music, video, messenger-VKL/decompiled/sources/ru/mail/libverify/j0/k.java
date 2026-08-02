package ru.mail.libverify.j0;

import android.content.Context;
import android.net.Network;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import ru.mail.libverify.j0.j;
import ru.mail.libverify.j0.k;
import ru.mail.libverify.k0.a;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.b;
import ru.mail.verify.core.utils.json.JsonParseException;
import xsna.d3d;
import xsna.u15;

/* loaded from: classes9.dex */
public abstract class k<REQ extends k<REQ, RESP>, RESP extends ru.mail.libverify.k0.a<RESP, REQ>> {
    private static volatile SimpleDateFormat g;

    @Nullable
    protected Network a = null;

    @Nullable
    private String b = null;
    private Long c;
    private String d;

    @NonNull
    protected final Context e;

    @NonNull
    protected final ru.mail.libverify.g0.q f;

    public k(@NonNull Context context, @NonNull ru.mail.libverify.g0.q qVar) {
        this.e = context;
        this.f = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(ru.mail.verify.core.utils.b bVar) {
        try {
            FileLog.v("ApiRequest", "try to disconnect");
            ((ru.mail.verify.core.utils.c) bVar).a();
            FileLog.v("ApiRequest", "disconnected");
        } catch (Exception e) {
            FileLog.v("ApiRequest", "failed to disconnect", e);
        }
    }

    private void d(@NonNull ru.mail.verify.core.utils.b bVar) throws ClientException, IOException, ServerException {
        if (this instanceof ru.mail.libverify.requests.f) {
            String a = ((ru.mail.verify.core.utils.c) bVar).a("Last-Modified", false);
            if (TextUtils.isEmpty(a)) {
                return;
            }
            try {
                Date parse = h().parse(a);
                if (parse != null) {
                    Long valueOf = Long.valueOf(parse.getTime());
                    this.c = valueOf;
                    FileLog.v("ApiRequest", "header %s value %s (%d)", "Last-Modified", a, valueOf);
                }
            } catch (ParseException e) {
                ru.mail.libverify.n0.b.a("ApiRequest", "failed to parse last modified timestamp from the response", e);
            }
        }
    }

    private static SimpleDateFormat h() {
        if (g == null) {
            synchronized (k.class) {
                try {
                    if (g == null) {
                        g = new SimpleDateFormat("EEE, dd MMM y HH:mm:ss 'GMT'", Locale.US);
                        g.setTimeZone(TimeZone.getTimeZone("GMT"));
                    }
                } finally {
                }
            }
        }
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ru.mail.verify.core.utils.c i() throws ClientException, IOException {
        String str;
        String s = s();
        if (v()) {
            String[] split = s.split("\\?");
            if (split.length == 2) {
                s = split[0];
                str = split[1];
                ru.mail.verify.core.utils.a c = this.f.a(s, this.a, a()).c();
                if (k() != null) {
                    c.a("If-None-Match", k());
                }
                if (this.f.g()) {
                    c.a(true);
                } else {
                    FileLog.v("ApiRequest", "keep-alive disabled because of proxy config");
                    c.a(false);
                }
                if (ru.mail.libverify.d0.a.a().e().a()) {
                    c.a();
                }
                c.a(!v() ? b.a.POST : b.a.GET);
                if (v()) {
                    if (!v()) {
                        throw new IllegalStateException("Request must declare any available post data method");
                    }
                    if (TextUtils.isEmpty(str)) {
                        throw new ClientException("Post url data must be provided", ClientException.a.DEFAULT);
                    }
                    c.a(str);
                }
                if (q() != null) {
                    c.b(q().intValue());
                }
                if (f() != null) {
                    c.a(f().intValue());
                }
                if (n() != null) {
                    c.a("If-Modified-Since", h().format(new Date(n().longValue())));
                }
                if (l() != null) {
                    c.a("If-None-Match", l());
                }
                return c.b();
            }
        }
        str = null;
        ru.mail.verify.core.utils.a c2 = this.f.a(s, this.a, a()).c();
        if (k() != null) {
        }
        if (this.f.g()) {
        }
        if (ru.mail.libverify.d0.a.a().e().a()) {
        }
        c2.a(!v() ? b.a.POST : b.a.GET);
        if (v()) {
        }
        if (q() != null) {
        }
        if (f() != null) {
        }
        if (n() != null) {
        }
        if (l() != null) {
        }
        return c2.b();
    }

    @Nullable
    public abstract RESP a(@NonNull String str) throws JsonParseException;

    public boolean a() {
        return true;
    }

    @NonNull
    public RESP b() throws ClientException, ServerException, IOException {
        return b(i());
    }

    @Nullable
    public abstract String c();

    @NonNull
    public String e() {
        return "";
    }

    @NonNull
    public String j() {
        l r = r();
        if (r == null || TextUtils.isEmpty(r.getId())) {
            throw new IllegalArgumentException("Request id can't be empty");
        }
        return o() + BundleUtil.UNDERLINE_TAG + r.getId();
    }

    @Nullable
    public String k() {
        return null;
    }

    @Nullable
    public String l() {
        return null;
    }

    @Nullable
    public final Long m() {
        return this.c;
    }

    @Nullable
    public Long n() {
        return null;
    }

    @Nullable
    public abstract String o();

    @NonNull
    public f p() {
        return new f();
    }

    @Nullable
    public Integer q() {
        return null;
    }

    @Nullable
    public abstract l r();

    @NonNull
    public String s() throws UnsupportedEncodingException {
        String str;
        if (this.b == null || c() == null || !this.b.contains(c())) {
            if (u()) {
                FileLog.v("ApiRequest", "buildRequestUrlSigned start");
                f p = p();
                StringBuilder sb = new StringBuilder(p.a());
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, String> entry : p.entrySet()) {
                    if (entry.getValue() == null || entry.getValue().length() >= 196) {
                        hashSet.add(entry);
                    } else {
                        a(sb, entry);
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    a(sb, (Map.Entry) it.next());
                }
                String str2 = c() + e() + "?" + sb.toString() + "&signature=" + a(p);
                sb.setLength(0);
                FileLog.v("ApiRequest", "buildRequestUrlSigned end");
                this.b = str2;
            } else {
                FileLog.v("ApiRequest", "buildRequestUrl start");
                f p2 = p();
                if (p2.isEmpty()) {
                    FileLog.v("ApiRequest", "buildRequestUrl end without params");
                    str = c() + e();
                } else {
                    StringBuilder sb2 = new StringBuilder(p2.a());
                    Iterator<Map.Entry<String, String>> it2 = p2.entrySet().iterator();
                    while (it2.hasNext()) {
                        a(sb2, it2.next());
                    }
                    str = c() + e() + "?" + ((Object) sb2);
                    sb2.setLength(0);
                    FileLog.v("ApiRequest", "buildRequestUrl end");
                }
                this.b = str;
            }
        }
        return this.b;
    }

    @Nullable
    public abstract m t() throws JsonParseException;

    public boolean u() {
        return false;
    }

    public boolean v() {
        return this instanceof ru.mail.libverify.requests.h;
    }

    @NonNull
    public Future a(@NonNull ExecutorService executorService, @NonNull ru.mail.libverify.p0.b bVar, @Nullable j.c cVar) {
        return new j(executorService, bVar, new d3d(this, 2), null, cVar).a();
    }

    @Nullable
    public RESP e(@NonNull ru.mail.verify.core.utils.b bVar) throws ClientException, ServerException, IOException {
        return a(((ru.mail.verify.core.utils.c) bVar).e());
    }

    @Nullable
    public Integer f() {
        return null;
    }

    @Nullable
    public final String g() {
        return this.d;
    }

    @NonNull
    public final Future<RESP> a(@NonNull ExecutorService executorService) throws ClientException, IOException {
        final ru.mail.verify.core.utils.c i = i();
        return new j(executorService, null, new u15(3, this, i), new j.b() { // from class: ru.mail.libverify.j0.q
            @Override // ru.mail.libverify.j0.j.b
            public final void a() {
                k.c(i);
            }
        }, null).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RESP b(@NonNull ru.mail.verify.core.utils.b bVar) throws ClientException, ServerException, IOException {
        try {
            d(bVar);
            if (this instanceof ru.mail.libverify.requests.f) {
                String a = ((ru.mail.verify.core.utils.c) bVar).a(Command.HTTP_HEADER_ETAG, false);
                if (!TextUtils.isEmpty(a)) {
                    this.d = a;
                    FileLog.v("ApiRequest", "header %s value %s", Command.HTTP_HEADER_ETAG, a);
                }
            }
            RESP e = e(bVar);
            if (e != null) {
                ru.mail.verify.core.utils.c cVar = (ru.mail.verify.core.utils.c) bVar;
                e.b(cVar.g());
                e.a(cVar.d());
                FileLog.d("ApiRequest", "Response received; Sent timestamp: %d; Receive timestamp: %d", Long.valueOf(e.c()), Long.valueOf(e.b()));
                e.a(this);
                return e;
            }
            throw new JsonParseException("Response can't be null");
        } catch (SecurityException e2) {
            if (!ru.mail.libverify.n0.e.b(this.e, "android.permission.INTERNET")) {
                throw new ClientException(e2);
            }
            throw e2;
        }
    }

    @NonNull
    public String d() {
        return o();
    }

    @NonNull
    public String a(@NonNull f fVar) throws UnsupportedEncodingException {
        return "";
    }

    public static void a(@NonNull StringBuilder sb, @NonNull Map.Entry entry) throws UnsupportedEncodingException {
        if (!TextUtils.isEmpty((CharSequence) entry.getValue())) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), C.UTF8_NAME));
            return;
        }
        FileLog.e("ApiRequest", "Url argument %s can't be empty", entry.getKey());
        throw new IllegalArgumentException("Url argument can't be empty");
    }
}
