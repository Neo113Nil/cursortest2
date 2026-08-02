package com.yandex.passport.internal.sso;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.entities.o;
import com.yandex.passport.internal.flags.presentation.s0;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.sso.announcing.SsoAnnouncingReceiver;
import com.yandex.passport.internal.util.p;
import defpackage.fgw0;
import defpackage.gw00;
import defpackage.h73;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.tls;
import defpackage.yw01;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes8.dex */
public final class g {
    public final Context a;
    public final com.yandex.passport.internal.config.a b;
    public final c0 c;
    public final X509Certificate d;

    public g(Context context, com.yandex.passport.internal.config.a aVar, c0 c0Var) {
        this.a = context;
        this.b = aVar;
        this.c = c0Var;
        this.d = (X509Certificate) CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(new ByteArrayInputStream(Base64.decode(context.getString(R.string.passport_sso_trusted_certificate), 0)));
    }

    public final List a() {
        Intent intent = new Intent(SsoAnnouncingReceiver.ACTION_SSO_ANNOUNCEMENT);
        Context context = this.a;
        final int i = 1;
        final int i2 = 0;
        List s = kotlin.sequences.b.s(kotlin.sequences.b.i(new yw01(kotlin.sequences.b.g(new h73(1, context.getPackageManager().queryBroadcastReceivers(intent, 512)), new tls(this) { // from class: com.yandex.passport.internal.sso.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i2;
                g gVar = this.b;
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(!jl40.l(resolveInfo.activityInfo.packageName, gVar.a.getPackageName()));
                    default:
                        return gVar.c(new com.yandex.passport.internal.core.announcing.f(9), resolveInfo.activityInfo.packageName);
                }
            }
        }), new tls(this) { // from class: com.yandex.passport.internal.sso.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i3 = i;
                g gVar = this.b;
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(!jl40.l(resolveInfo.activityInfo.packageName, gVar.a.getPackageName()));
                    default:
                        return gVar.c(new com.yandex.passport.internal.core.announcing.f(9), resolveInfo.activityInfo.packageName);
                }
            }
        })));
        if (s.isEmpty()) {
            return EmptyList.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : s) {
            String encodeToString = Base64.encodeToString(((c) obj).b().a(), 2);
            Object obj2 = linkedHashMap.get(encodeToString);
            if (obj2 == null) {
                obj2 = qv10.w(encodeToString, linkedHashMap);
            }
            ((List) obj2).add(obj);
        }
        byte[] bArr = o.c;
        o f = p.f(context.getPackageManager(), context.getPackageName());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!jl40.l(entry.getKey(), Base64.encodeToString(f.a(), 2))) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Collection<List> values = linkedHashMap2.values();
        ArrayList arrayList = new ArrayList(tcc.n(values, 10));
        for (List list : values) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                c cVar = (c) obj3;
                if (cVar.d(this.d, new fgw0(11, this, cVar))) {
                    arrayList2.add(obj3);
                }
            }
            arrayList.add(kotlin.collections.a.x0(arrayList2, new f()));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((List) next).isEmpty()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new m((List) it2.next()));
        }
        return arrayList4;
    }

    public final boolean b(String str) {
        c c = c(new com.yandex.passport.internal.core.announcing.f(9), str);
        if (c == null) {
            return false;
        }
        return c.d(this.d, new s0(7, this, str));
    }

    public final c c(tls tlsVar, String str) {
        Map f;
        com.yandex.passport.internal.config.a aVar = this.b;
        if (aVar != null) {
            Map<String, ?> all = ((SharedPreferences) aVar.b.getValue()).getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!jl40.l(entry.getKey(), "blacklisted_apps")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            f = new LinkedHashMap(gw00.d(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                f.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        } else {
            f = kotlin.collections.b.f();
        }
        return u.q(this.a, str, f, tlsVar);
    }
}
