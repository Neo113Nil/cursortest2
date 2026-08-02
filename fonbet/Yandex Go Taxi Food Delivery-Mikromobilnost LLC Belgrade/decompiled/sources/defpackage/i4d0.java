package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.domain.auth.impl.a;
import com.yandex.plus.home.internal.di.b;

/* loaded from: classes2.dex */
public final class i4d0 {
    public final jnp0 a;
    public final cop0 b;
    public final ol5 c;
    public final b d;
    public final wog e;
    public final x3m f;
    public final a g;
    public final ckd0 h;
    public final i3y i = kotlin.a.a(new r0d0(2, this));

    public i4d0(jnp0 jnp0Var, cop0 cop0Var, ol5 ol5Var, b bVar, wog wogVar, x3m x3mVar, a aVar, ckd0 ckd0Var) {
        this.a = jnp0Var;
        this.b = cop0Var;
        this.c = ol5Var;
        this.d = bVar;
        this.e = wogVar;
        this.f = x3mVar;
        this.g = aVar;
        this.h = ckd0Var;
        h4d0 h4d0Var = new h4d0(this);
        PlusLogTag plusLogTag = PlusLogTag.SDK;
        StringBuilder sb = new StringBuilder("Init PlusHomeSdkComponent\n");
        sb.append("selectedCardId=" + ((String) jnp0Var.c.invoke()));
        sb.append("\nhomeLoadingAnimator=null\npanelLoadingAnimator=null\n");
        skd0.e(plusLogTag, sb.toString());
        jnp0Var.b.a(h4d0Var);
    }

    public static com.yandex.plus.home.feature.webviews.internalapi.factory.a a(i4d0 i4d0Var) {
        return new com.yandex.plus.home.feature.webviews.internalapi.factory.a((yv41) i4d0Var.i.getValue(), y2d0.a);
    }
}
