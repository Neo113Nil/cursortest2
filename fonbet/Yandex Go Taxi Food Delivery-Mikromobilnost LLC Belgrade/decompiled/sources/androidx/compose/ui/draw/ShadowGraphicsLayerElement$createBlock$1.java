package androidx.compose.ui.draw;

import defpackage.m2k0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2k0;", "Lzy11;", "invoke", "(Lm2k0;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class ShadowGraphicsLayerElement$createBlock$1 extends Lambda implements tls {
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowGraphicsLayerElement$createBlock$1(d dVar) {
        super(1);
        this.this$0 = dVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        m2k0 m2k0Var = (m2k0) obj;
        m2k0Var.x(m2k0Var.K.getDensity() * this.this$0.a);
        m2k0Var.y(this.this$0.b);
        m2k0Var.g(this.this$0.c);
        m2k0Var.d(this.this$0.w);
        m2k0Var.A(this.this$0.x);
        return zy11.a;
    }
}
