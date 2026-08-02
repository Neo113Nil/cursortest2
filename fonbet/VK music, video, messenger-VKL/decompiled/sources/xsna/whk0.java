package xsna;

import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* compiled from: SpanData.java */
/* loaded from: classes8.dex */
public interface whk0 {
    int a();

    List<pyp> b();

    default q8x c() {
        an5 o = o();
        String str = o.b;
        int i = q8x.a;
        String str2 = o.c;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = o.d;
        return q8x.a(str, str2, str3 != null ? str3 : null, jk3.e);
    }

    gag0 d();

    default String e() {
        return ((sm5) i()).c;
    }

    List<d9z> f();

    long g();

    q94 getAttributes();

    SpanKind getKind();

    String getName();

    izk0 getStatus();

    default String h() {
        return ((sm5) i()).b;
    }

    qhk0 i();

    long j();

    int k();

    default String l() {
        return ((sm5) n()).c;
    }

    int m();

    qhk0 n();

    @Deprecated
    an5 o();
}
