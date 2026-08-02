package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes8.dex */
public final class hwe0 {
    public final b8r a;
    public final k b;

    public hwe0(b8r b8rVar, k kVar) {
        this.a = b8rVar;
        this.b = kVar;
    }

    public final void a(String str, String str2) {
        String str3 = null;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            za31 e = this.a.e(str);
            if (e != null) {
                if (gwk0.C(e.a, str2)) {
                    str3 = str2;
                } else {
                    mi31 mi31Var = e.c;
                    if (mi31Var != null) {
                        str3 = mi31Var.f;
                    }
                }
            }
            if (str3 != null) {
                str2 = str3;
            }
        }
        this.b.j.f = str2;
    }
}
