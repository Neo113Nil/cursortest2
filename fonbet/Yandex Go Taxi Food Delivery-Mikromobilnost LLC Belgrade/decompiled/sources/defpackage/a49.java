package defpackage;

import ru.yandex.taxi.cashback.l;

/* loaded from: classes8.dex */
public final class a49 {
    public final pav a;
    public final l b;

    public a49(pav pavVar, l lVar) {
        this.a = pavVar;
        this.b = lVar;
    }

    public final void a(String str, tls tlsVar, tls tlsVar2) {
        if (evu0.J(str)) {
            tlsVar.invoke(new NullPointerException());
        } else {
            this.a.b().i(new obv(str, null, 6, 0)).h(l76.l(tlsVar, new wg0(5, tlsVar2)));
        }
    }
}
