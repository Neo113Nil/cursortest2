package defpackage;

import android.content.Context;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.summary.selector.verticals.VerticalsWithBackgroundView;
import ru.yandex.taxi.preorder.summary.selector.verticals.bold.BoldVerticalsView;

/* loaded from: classes6.dex */
public final class lk31 {
    public final bk31 a;
    public final l86 b;
    public final mk31 c;

    public lk31(bk31 bk31Var, l86 l86Var, mk31 mk31Var) {
        this.a = bk31Var;
        this.b = l86Var;
        this.c = mk31Var;
    }

    public final kk31 a(wls wlsVar) {
        if (((g86) this.a.a.getValue()) != null) {
            t91 t91Var = this.b.a;
            return new BoldVerticalsView(wlsVar, (Context) t91Var.a.get(), (mqv0) t91Var.b.get(), (b) t91Var.c.get(), (hf31) t91Var.d.get(), (im4) t91Var.e.get());
        }
        dmw0 dmw0Var = this.c.a;
        return new VerticalsWithBackgroundView(wlsVar, (Context) ((xvf0) dmw0Var.a).get(), (hf31) ((xvf0) dmw0Var.b).get(), (kb31) ((im21) dmw0Var.c).get());
    }
}
