package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.l;
import okhttp3.m;
import ru.ok.android.commons.http.Http;
import xsna.an8;
import xsna.vl8;
import xsna.x2r0;

/* compiled from: FormBody.kt */
/* loaded from: classes8.dex */
public final class h extends t {
    public static final m e;
    public final List<String> c;
    public final List<String> d;

    /* compiled from: FormBody.kt */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();

        public a(int i) {
        }

        public final void a(String str, String str2) {
            this.a.add(l.b.a(str, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 91, false));
            this.b.add(l.b.a(str2, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 91, false));
        }
    }

    static {
        Pattern pattern = m.e;
        e = m.a.a(Http.ContentType.APPLICATION_X_WWW_FORM_URLENCODED);
    }

    public h(ArrayList arrayList, ArrayList arrayList2) {
        this.c = x2r0.w(arrayList);
        this.d = x2r0.w(arrayList2);
    }

    public final long a(an8 an8Var, boolean z) {
        vl8 vl8Var = z ? new vl8() : an8Var.C();
        List<String> list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                vl8Var.I(38);
            }
            vl8Var.S(list.get(i));
            vl8Var.I(61);
            vl8Var.S(this.d.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = vl8Var.c;
        vl8Var.m();
        return j;
    }

    @Override // okhttp3.t
    public final long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.t
    public final m contentType() {
        return e;
    }

    @Override // okhttp3.t
    public final void writeTo(an8 an8Var) throws IOException {
        a(an8Var, false);
    }
}
