package defpackage;

import com.yandex.div.core.view2.Div2View;

/* loaded from: classes.dex */
public final class aw5 {
    public final Div2View a;
    public final rvo b;

    public aw5(Div2View div2View, rvo rvoVar) {
        this.a = div2View;
        this.b = rvoVar;
    }

    public final aw5 a(rvo rvoVar) {
        return jl40.l(this.b, rvoVar) ? this : new aw5(this.a, rvoVar);
    }
}
