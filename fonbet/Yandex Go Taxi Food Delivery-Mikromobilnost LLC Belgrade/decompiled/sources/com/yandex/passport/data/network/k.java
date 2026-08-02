package com.yandex.passport.data.network;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.exceptions.CaptchaRequiredException;
import com.yandex.passport.data.exceptions.InvalidTotpException;
import com.yandex.passport.data.exceptions.OtpRequiredException;
import com.yandex.passport.internal.flags.experiments.ExperimentsOperator;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.t2k0;
import defpackage.u1l;
import defpackage.w511;
import defpackage.yhl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class k implements com.yandex.passport.data.network.core.e {
    public final Object a;

    public /* synthetic */ k(Object obj) {
        this.a = obj;
    }

    public static boolean b(String str, String str2) {
        if (str.length() >= str2.length()) {
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == str2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static void c(String str, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        List W;
        StringBuilder sb;
        List W2;
        W = evu0.W(str, new String[]{"am_version"}, (r2 & 4) != 0 ? 0 : 2);
        int i = 1;
        String str2 = (String) W.get(1);
        sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char charAt = str2.charAt(i3);
            if (charAt != '!') {
                switch (charAt) {
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        sb2.append(charAt);
                        break;
                }
            }
            sb.append(charAt);
        }
        Pair pair = new Pair(sb.toString(), sb2.toString());
        com.yandex.passport.internal.flags.experiments.j jVar = ExperimentsOperator.Companion;
        String str3 = (String) pair.c();
        jVar.getClass();
        ExperimentsOperator a = com.yandex.passport.internal.flags.experiments.j.a(str3);
        W2 = evu0.W((String) pair.f(), new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        Iterator it = new u1l(2, W2).iterator();
        while (true) {
            ListIterator listIterator = ((t2k0) it).a;
            if (!listIterator.hasPrevious()) {
                com.yandex.passport.internal.flags.experiments.m mVar = new com.yandex.passport.internal.flags.experiments.m(a, i2);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str4 = (String) it2.next();
                    List list = (List) linkedHashMap.get(str4);
                    ArrayList arrayList2 = list != null ? new ArrayList(list) : new ArrayList();
                    arrayList2.add(mVar);
                    linkedHashMap.put(str4, arrayList2);
                }
                return;
            }
            i2 += Integer.parseInt((String) listIterator.previous()) * i;
            i *= 100;
        }
    }

    public static void d(String str, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        List W;
        List W2;
        W = evu0.W(str, new String[]{"appID"}, (r2 & 4) != 0 ? 0 : 2);
        List l = new Regex("((?<==))").l(2, (CharSequence) W.get(1));
        com.yandex.passport.internal.flags.experiments.j jVar = ExperimentsOperator.Companion;
        String str2 = (String) l.get(0);
        jVar.getClass();
        ExperimentsOperator a = com.yandex.passport.internal.flags.experiments.j.a(str2);
        W2 = evu0.W((CharSequence) l.get(1), new String[]{"[", ",", " ", "]"}, (r2 & 4) != 0 ? 0 : 2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : W2) {
            if (!evu0.J((String) obj)) {
                arrayList2.add(obj);
            }
        }
        com.yandex.passport.internal.flags.experiments.l lVar = new com.yandex.passport.internal.flags.experiments.l(a, arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            List list = (List) linkedHashMap.get(str3);
            ArrayList arrayList3 = list != null ? new ArrayList(list) : new ArrayList();
            arrayList3.add(lVar);
            linkedHashMap.put(str3, arrayList3);
        }
    }

    @Override // com.yandex.passport.data.network.core.e
    public Object a(Object obj, com.yandex.passport.common.network.j jVar) {
        Throwable otpRequiredException;
        e eVar = (e) obj;
        com.yandex.passport.internal.report.reporters.i iVar = (com.yandex.passport.internal.report.reporters.i) this.a;
        boolean z = false;
        if (jVar instanceof com.yandex.passport.common.network.i) {
            i iVar2 = (i) ((com.yandex.passport.common.network.i) jVar).a;
            com.yandex.passport.common.account.b bVar = MasterToken.Companion;
            String str = iVar2.b;
            bVar.getClass();
            MasterToken a = com.yandex.passport.common.account.b.a(str);
            String str2 = iVar2.c;
            com.yandex.passport.data.models.c cVar = new com.yandex.passport.data.models.c(a, iVar2.d, str2 != null ? new com.yandex.passport.data.models.e(str2, eVar.c()) : null);
            String g = eVar.g();
            iVar.getClass();
            iVar.f(com.yandex.passport.internal.report.g1.w, new com.yandex.passport.internal.report.yd(g, 12));
            return cVar;
        }
        if (!(jVar instanceof com.yandex.passport.common.network.g)) {
            w511.b();
            return null;
        }
        d dVar = (d) ((com.yandex.passport.common.network.g) jVar).a;
        List list = dVar.a;
        String str3 = dVar.c;
        if (list.contains(BackendError.CAPTCHA_REQUIRED) && str3 != null) {
            otpRequiredException = new CaptchaRequiredException(str3, eVar.g());
        } else {
            if (!jl40.l(dVar.b, "rfc_totp")) {
                if (list.contains(BackendError.RFC_OTD_INVALID) || list.contains(BackendError.OTD_EMPTY)) {
                    throw new InvalidTotpException(((BackendError) kotlin.collections.a.P(list)).name(), eVar.g());
                }
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    com.yandex.passport.internal.ui.c.z((BackendError) it.next());
                    throw null;
                }
                yhl.d(list, "Internal error: Can't throw exception for error list ");
                return null;
            }
            otpRequiredException = new OtpRequiredException(((BackendError) kotlin.collections.a.P(list)).name(), eVar.g());
        }
        String g2 = eVar.g();
        String valueOf = String.valueOf(otpRequiredException.getMessage());
        iVar.getClass();
        iVar.f(com.yandex.passport.internal.report.e1.w, new com.yandex.passport.internal.report.a(valueOf, 26, z), new com.yandex.passport.internal.report.yd(g2, 12));
        throw otpRequiredException;
    }
}
