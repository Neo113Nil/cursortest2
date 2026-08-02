package ru.ok.android.commons.http;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import xsna.gcy;
import xsna.rl3;
import xsna.wk3;
import xsna.zcl;
import xsna.zr;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes9.dex */
public final class HttpHeaders implements Iterable<HttpHeader>, gcy {
    public static final Companion Companion = new Companion(null);
    private final HttpHeader[] array;

    /* compiled from: HttpHeaders.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final HttpHeaders create(List<HttpHeader> list) {
            return new HttpHeaders((HttpHeader[]) list.toArray(new HttpHeader[0]), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ HttpHeaders(HttpHeader[] httpHeaderArr, zcl zclVar) {
        this(httpHeaderArr);
    }

    public static final HttpHeaders create(List<HttpHeader> list) {
        return Companion.create(list);
    }

    public final boolean contains(String str) {
        for (HttpHeader httpHeader : this.array) {
            if (httpHeader.nameMatches(str)) {
                return true;
            }
        }
        return false;
    }

    public final String get(String str) {
        HttpHeader httpHeader;
        HttpHeader[] httpHeaderArr = this.array;
        int length = httpHeaderArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                httpHeader = null;
                break;
            }
            httpHeader = httpHeaderArr[i];
            if (httpHeader.nameMatches(str)) {
                break;
            }
            i++;
        }
        if (httpHeader != null) {
            return httpHeader.getValue();
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<HttpHeader> iterator() {
        return new wk3(this.array);
    }

    public String toString() {
        return zr.a(X3.j.d, rl3.Z(this.array, ", ", null, null, null, 62), X3.j.e);
    }

    private HttpHeaders(HttpHeader[] httpHeaderArr) {
        this.array = httpHeaderArr;
    }
}
