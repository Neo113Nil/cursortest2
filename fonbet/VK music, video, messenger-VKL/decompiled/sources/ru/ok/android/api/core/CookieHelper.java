package ru.ok.android.api.core;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.commons.http.Http;
import ru.ok.android.commons.http.HttpHeader;
import ru.ok.android.commons.http.HttpHeaders;
import xsna.c5g;
import xsna.fw3;

/* compiled from: CookieHelper.kt */
/* loaded from: classes11.dex */
public interface CookieHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    String getCookieString();

    void logSetCookie(String str);

    void reportProblem(Exception exc);

    void setCookieString(String str);

    /* compiled from: CookieHelper.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CookieHelper NONE = new CookieHelper() { // from class: ru.ok.android.api.core.CookieHelper$Companion$NONE$1
            @Override // ru.ok.android.api.core.CookieHelper
            public String getCookieString() {
                return null;
            }

            @Override // ru.ok.android.api.core.CookieHelper
            public void logSetCookie(String str) {
            }

            @Override // ru.ok.android.api.core.CookieHelper
            public void reportProblem(Exception exc) {
            }

            @Override // ru.ok.android.api.core.CookieHelper
            public void setCookieString(String str) {
            }
        };

        private Companion() {
        }

        public final CookieHelper getNONE() {
            return NONE;
        }

        public final List<HttpCookie> parse(CookieHelper cookieHelper, String str) {
            try {
                return HttpCookie.parse(str);
            } catch (Exception e) {
                cookieHelper.reportProblem(e);
                return EmptyList.b;
            }
        }

        public final String parse(CookieHelper cookieHelper, HttpHeaders httpHeaders) {
            Object obj;
            ArrayList arrayList = new ArrayList();
            for (HttpHeader httpHeader : httpHeaders) {
                if (Http.Header.SET_COOKIE.equals(httpHeader.getName())) {
                    arrayList.add(httpHeader);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add($$INSTANCE.parse(cookieHelper, ((HttpHeader) it.next()).getValue()));
            }
            ArrayList v = c5g.v(arrayList2);
            ArrayList arrayList3 = new ArrayList(c5g.u(v, 10));
            Iterator it2 = v.iterator();
            while (it2.hasNext()) {
                HttpCookie httpCookie = (HttpCookie) it2.next();
                cookieHelper.logSetCookie(httpCookie.toString());
                arrayList3.add(httpCookie);
            }
            Iterator it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if ("vdt".equals(((HttpCookie) obj).getName())) {
                    break;
                }
            }
            HttpCookie httpCookie2 = (HttpCookie) obj;
            if (httpCookie2 != null) {
                return fw3.c(httpCookie2.getName(), "=\"", httpCookie2.getValue(), "\"");
            }
            return null;
        }
    }
}
