package defpackage;

import com.yandex.go.payments.data.k;

/* loaded from: classes8.dex */
public final class aiq0 {
    public final String a;
    public final k b;

    public aiq0(String str, k kVar) {
        this.a = str;
        this.b = kVar;
    }

    public final void a(lv90 lv90Var, String str) {
        k kVar = this.b;
        if (lv90Var == null) {
            kVar.a().w(b(str));
            return;
        }
        kVar.a().r(b(str), ((xnt) kVar.a).e(lv90Var, lv90.Companion.serializer()));
    }

    public final String b(String str) {
        return g8e.p(this.a, "_", str);
    }
}
