package defpackage;

import kotlinx.datetime.format.AmPmMarker;

/* loaded from: classes9.dex */
public interface g6z0 {
    void E(Integer num);

    Integer c();

    Integer d();

    void f(Integer num);

    default void g(qxg qxgVar) {
        k(qxgVar != null ? Integer.valueOf(qxgVar.a(9)) : null);
    }

    AmPmMarker h();

    void j(Integer num);

    void k(Integer num);

    Integer o();

    void p(AmPmMarker amPmMarker);

    Integer u();

    Integer x();

    void y(Integer num);

    default qxg z() {
        Integer c = c();
        if (c != null) {
            return new qxg(c.intValue(), 9);
        }
        return null;
    }
}
