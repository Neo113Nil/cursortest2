package defpackage;

import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes8.dex */
public interface pzr0 extends rxr0 {
    default String a() {
        return "multiorder";
    }

    @Override // defpackage.rxr0
    default g18 b(qxr0 qxr0Var) {
        if (qxr0Var instanceof zvr0) {
            collapse();
        } else {
            jst.e.s(new UnsupportedOperationException(oyr.p("An operation `", String.valueOf(qxr0Var.getClass()), "` is not implemented")));
        }
        return g18.u1;
    }

    default r330 c() {
        r330 d = d();
        if (d instanceof SlideableModalView) {
            return (SlideableModalView) d;
        }
        return null;
    }

    default void collapse() {
        y700 d = d();
        if (d != null) {
            d.forceCollapse();
        }
    }

    y700 d();
}
