package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import okio.ByteString;
import ru.ok.android.commons.http.Http;
import xsna.usj;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes8.dex */
public final class njv {
    static {
        new ByteString("\"\\".getBytes(emb.b)).c = "\"\\";
        new ByteString("\t ,=".getBytes(emb.b)).c = "\t ,=";
    }

    public static final boolean a(okhttp3.u uVar) {
        if (epx.f(uVar.b.b, "HEAD")) {
            return false;
        }
        int i = uVar.e;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || x2r0.j(uVar) != -1) {
            return true;
        }
        String a = uVar.g.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        return "chunked".equalsIgnoreCase(a);
    }

    public static final void b(wsj wsjVar, okhttp3.l lVar, okhttp3.k kVar) {
        if (wsjVar == wsj.a) {
            return;
        }
        Pattern pattern = usj.j;
        List<String> g = kVar.g(Http.Header.SET_COOKIE);
        int size = g.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            usj c = usj.b.c(lVar, g.get(i));
            if (c != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c);
            }
        }
        List unmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : EmptyList.b;
        if (unmodifiableList.isEmpty()) {
            return;
        }
        wsjVar.a(unmodifiableList);
    }
}
