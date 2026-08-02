package com.yandex.go.feedsdk.log;

import com.yandex.div.json.ParsingException;
import defpackage.b64;
import defpackage.cvw;
import defpackage.edx;
import defpackage.hst;
import defpackage.idx;
import defpackage.jst;
import defpackage.kqq;
import defpackage.mnt;
import defpackage.qv10;
import defpackage.sls;
import defpackage.w511;
import defpackage.xby;
import defpackage.yf61;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a implements kqq {
    public final String a;
    public final List b;
    public final List c;
    public final List w;
    public final int x;

    public a(int i, String str, List list, List list2, List list3) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.w = list3;
        this.x = i;
    }

    public static String a(String str, String str2, String str3, String str4) {
        StringBuilder t = qv10.t(str);
        if (str4 != null) {
            t.append("; type=");
            t.append(str4);
        }
        if (str3 != null) {
            t.append("; id=");
            t.append(str3);
        }
        if (str2 != null) {
            t.append("; msg=");
            t.append(str2);
        }
        return t.toString();
    }

    public final String b(String str) {
        return b64.l("FEED_SDK:", this.a, ":", str);
    }

    public final boolean c(String str, String str2, String str3) {
        boolean z;
        if (str != null) {
            List list = this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Regex) it.next()).h(str)) {
                        break;
                    }
                }
            }
        }
        if (str2 != null) {
            List list2 = this.c;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((Regex) it2.next()).h(str2)) {
                        break;
                    }
                }
            }
        }
        if (str3 != null) {
            List list3 = this.w;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (((Regex) it3.next()).h(str3)) {
                        z = true;
                    }
                }
            }
        }
        z = false;
        return !z;
    }

    @Override // defpackage.kqq
    public final void e(sls slsVar) {
        String str;
        Pair pair = (Pair) slsVar.invoke();
        Throwable th = (Throwable) pair.getFirst();
        String str2 = (String) pair.getSecond();
        String str3 = null;
        if (!(th instanceof ParsingException)) {
            String message = th.getMessage();
            if (message == null) {
                message = str2;
            }
            if (c(message, null, null)) {
                xby.l(jst.e, b("UNKNOWN"), null, th, a(th.getMessage(), str2, null, null), 2);
                return;
            }
            return;
        }
        ParsingException parsingException = (ParsingException) th;
        String message2 = parsingException.getMessage();
        edx source = parsingException.getSource();
        idx idxVar = source instanceof idx ? (idx) source : null;
        JSONObject jSONObject = idxVar != null ? idxVar.a : null;
        String J = jSONObject != null ? cvw.J("id", jSONObject) : null;
        String J2 = jSONObject != null ? cvw.J("type", jSONObject) : null;
        if (c(message2, J, J2)) {
            hst hstVar = jst.e;
            switch (mnt.a[parsingException.getReason().ordinal()]) {
                case 1:
                    str = "MISSING_TEMPLATE";
                    break;
                case 2:
                    str = "MISSING_VALUE";
                    break;
                case 3:
                    str = "MISSING_VARIABLE";
                    break;
                case 4:
                    str = "TYPE_MISMATCH";
                    break;
                case 5:
                    str = "INVALID_VALUE";
                    break;
                case 6:
                    str = "DEPENDENCY_FAILED";
                    break;
                default:
                    w511.b();
                    return;
            }
            String b = b(str);
            String a = a(message2, str2, J, J2);
            String jsonSummary = parsingException.getJsonSummary();
            if (jsonSummary != null) {
                int length = jsonSummary.length();
                int i = this.x;
                if (i <= length) {
                    length = i;
                }
                str3 = yf61.q(0, length, jsonSummary);
            }
            xby.l(hstVar, b, null, new GoFeedSdkErrorLogger$GoParsingException(str3, parsingException.getCause()), a, 2);
        }
    }

    @Override // defpackage.kqq
    public final void f(sls slsVar) {
        String str = (String) slsVar.invoke();
        if (c(str, null, null)) {
            xby.l(jst.e, b("PLAIN_TEXT"), null, null, a(str, null, null, null), 6);
        }
    }
}
