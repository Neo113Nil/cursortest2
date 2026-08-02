package ru.mail.libverify.requests;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.mail.libverify.statistics.omicron.retriever.ParseException;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.json.JsonParseException;
import xsna.j5g;

/* loaded from: classes9.dex */
public final class h extends c<h, ru.mail.libverify.m.i> {
    private final ru.mail.libverify.p.b l;
    private final String m;
    private final ru.mail.libverify.r.a n;

    public h(w wVar, ru.mail.libverify.p.b bVar, String str, ru.mail.libverify.r.a aVar) {
        super(wVar);
        this.l = bVar;
        this.m = str;
        this.n = aVar;
    }

    private final ru.mail.libverify.p.a b(String str) throws JsonParseException, ParseException {
        try {
            this.l.getClass();
            FileLog.d("Omicron", "onConfigReceivedFromNetwork " + str);
            return (ru.mail.libverify.p.a) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.p.a.class);
        } catch (Throwable th) {
            throw new ParseException(th);
        }
    }

    @Override // ru.mail.libverify.j0.k
    public final /* bridge */ /* synthetic */ ru.mail.libverify.k0.a a(String str) {
        return null;
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    public final String e() {
        return "omicron/v1/get";
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    public final String o() {
        return "get";
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    public final ru.mail.libverify.j0.f p() {
        ru.mail.libverify.j0.f fVar = new ru.mail.libverify.j0.f();
        fVar.put("mytracker_id", this.m);
        Integer f = this.n.f();
        if (f != null) {
            fVar.put("config_v", String.valueOf(f.intValue()));
        }
        String a = this.n.a();
        if (a != null) {
            fVar.put("cond_s", a);
        }
        ru.mail.libverify.p.e b = this.n.b();
        if (b != null) {
            fVar.put("app_env", b.name());
        }
        String e = this.n.e();
        if (e != null) {
            fVar.put("account", e);
        }
        Map<String, String> d = this.n.d();
        if (d != null) {
            if (d.isEmpty()) {
                d = null;
            }
            if (d != null) {
                fVar.put(AnalyticsBaseParamsConstantsKt.SEGMENTS, j5g.g0(d.values(), StringUtils.COMMA, null, null, 0, null, 62));
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it = this.n.c().iterator();
        while (it.hasNext()) {
            ((ru.mail.libverify.q.b) it.next()).a(hashMap);
            for (Map.Entry entry : hashMap.entrySet()) {
                fVar.put((String) entry.getKey(), entry.getValue().toString());
            }
            hashMap.clear();
        }
        return fVar;
    }

    @Override // ru.mail.libverify.j0.k
    public final ru.mail.libverify.j0.l r() {
        return null;
    }

    @Override // ru.mail.libverify.j0.k
    public final ru.mail.libverify.j0.m t() {
        throw null;
    }

    @Override // ru.mail.libverify.requests.c
    public final boolean w() {
        return false;
    }

    @Override // ru.mail.libverify.j0.k
    public final ru.mail.libverify.k0.a e(ru.mail.verify.core.utils.b bVar) {
        try {
            ru.mail.verify.core.utils.c cVar = (ru.mail.verify.core.utils.c) bVar;
            String e = cVar.e();
            int f = cVar.f();
            this.l.getClass();
            FileLog.d("Omicron", "onConfigRequestEnded " + f);
            if (f != 200 && f != 202) {
                throw new ClientException("Code not 200", ClientException.a.DEFAULT);
            }
            ru.mail.libverify.p.b bVar2 = this.l;
            String str = this.m;
            bVar2.getClass();
            FileLog.d("Omicron", "onResponseSuccess " + str);
            return new ru.mail.libverify.m.i(ru.mail.libverify.r.c.SUCCESS, b(e));
        } catch (Throwable th) {
            this.l.getClass();
            FileLog.d("Omicron", "onConfigRequestFailedWithException " + th);
            if (th instanceof ServerException) {
                int a = ((ServerException) th).a();
                if (a == 304) {
                    ru.mail.libverify.p.b bVar3 = this.l;
                    String str2 = this.m;
                    bVar3.getClass();
                    FileLog.d("Omicron", "onResponseNotModified " + str2);
                    return new ru.mail.libverify.m.i(ru.mail.libverify.r.c.NOT_MODIFIED, null);
                }
                ru.mail.libverify.p.b bVar4 = this.l;
                String str3 = this.m;
                bVar4.getClass();
                FileLog.d("Omicron", "onResponseError " + str3 + ", " + a);
            } else if (th instanceof ParseException) {
                ru.mail.libverify.p.b bVar5 = this.l;
                String str4 = this.m;
                bVar5.getClass();
                FileLog.d("Omicron", "onResponseParseException " + str4 + ", " + ((ParseException) th));
            } else if (th instanceof IOException) {
                ru.mail.libverify.p.b bVar6 = this.l;
                String str5 = this.m;
                bVar6.getClass();
                FileLog.d("Omicron", "onResponseIOException " + str5 + ", " + ((IOException) th));
            }
            ru.mail.libverify.n0.b.a("Omicron", th, "Failed to retrieve Omicron config.", new Object[0]);
            return new ru.mail.libverify.m.i(ru.mail.libverify.r.c.ERROR, null);
        }
    }
}
