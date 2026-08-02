package com.apollographql.apollo3.api.http;

import defpackage.g1f;
import defpackage.i3y;
import defpackage.ici0;
import defpackage.ny61;
import defpackage.o16;
import defpackage.oq6;
import defpackage.pq6;
import defpackage.quu;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.uga1;
import defpackage.unr0;
import defpackage.yp6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import okio.ByteString;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class c implements quu {
    public final Map a;
    public final ByteString b;
    public final String c;
    public final String w;
    public final i3y x;

    public c(Map map, ByteString byteString) {
        this.a = map;
        this.b = byteString;
        String uuid = UUID.randomUUID().toString();
        this.c = uuid;
        this.w = "multipart/form-data; boundary=".concat(uuid);
        this.x = kotlin.a.a(new sls() { // from class: com.apollographql.apollo3.api.http.UploadsHttpBody$contentLength$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                new o16();
                g1f g1fVar = new g1f();
                ici0 ici0Var = new ici0(g1fVar);
                c.this.b(ici0Var);
                ici0Var.flush();
                long j = g1fVar.a;
                Iterator it = c.this.a.values().iterator();
                if (it.hasNext()) {
                    throw unr0.i(it);
                }
                return Long.valueOf(j);
            }
        });
    }

    @Override // defpackage.quu
    public final void a(oq6 oq6Var) {
        b(oq6Var);
    }

    public final void b(oq6 oq6Var) {
        StringBuilder sb = new StringBuilder("--");
        String str = this.c;
        sb.append(str);
        sb.append(Constants.LINE_SEPARATOR);
        oq6Var.p1(sb.toString());
        oq6Var.p1("Content-Disposition: form-data; name=\"operations\"\r\n");
        oq6Var.p1("Content-Type: application/json\r\n");
        StringBuilder sb2 = new StringBuilder("Content-Length: ");
        ByteString byteString = this.b;
        sb2.append(byteString.h());
        sb2.append(Constants.LINE_SEPARATOR);
        oq6Var.p1(sb2.toString());
        oq6Var.p1(Constants.LINE_SEPARATOR);
        oq6Var.N0(byteString);
        yp6 yp6Var = new yp6();
        pq6 pq6Var = new pq6(yp6Var);
        Map map = this.a;
        Set entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(tcc.n(entrySet, 10));
        int i = 0;
        for (Object obj : entrySet) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(new Pair(String.valueOf(i), Collections.singletonList(((Map.Entry) obj).getKey())));
            i = i2;
        }
        uga1.f(pq6Var, kotlin.collections.b.s(arrayList));
        ByteString l0 = yp6Var.l0(yp6Var.b);
        oq6Var.p1("\r\n--" + str + Constants.LINE_SEPARATOR);
        oq6Var.p1("Content-Disposition: form-data; name=\"map\"\r\n");
        oq6Var.p1("Content-Type: application/json\r\n");
        oq6Var.p1("Content-Length: " + l0.h() + Constants.LINE_SEPARATOR);
        oq6Var.p1(Constants.LINE_SEPARATOR);
        oq6Var.N0(l0);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            oq6Var.p1("\r\n--" + str + "--\r\n");
            return;
        }
        if (it.next() != null) {
            ny61.u();
            return;
        }
        oq6Var.p1("\r\n--" + str + Constants.LINE_SEPARATOR);
        oq6Var.p1("Content-Disposition: form-data; name=\"0\"");
        throw null;
    }

    @Override // defpackage.quu
    public final long getContentLength() {
        return ((Number) this.x.getValue()).longValue();
    }

    @Override // defpackage.quu
    public final String getContentType() {
        return this.w;
    }
}
