package defpackage;

import com.yandex.div.core.tooltip.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.c;

/* loaded from: classes2.dex */
public final class kil extends mx60 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kil(b bVar, gil gilVar, Div2View div2View) {
        super(true);
        this.e = bVar;
        this.f = gilVar;
    }

    @Override // defpackage.mx60
    public final void d() {
        c cVar;
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((b) obj2).d(((gil) obj).h);
                break;
            default:
                BouncerActivity bouncerActivity = (BouncerActivity) obj2;
                cVar = bouncerActivity.component;
                if (cVar == null) {
                    cVar = null;
                }
                if (!cVar.getBouncerRenderer().canGoBackInSloth() && !((LoginProperties) obj).getVisualProperties().getBlockBackButton()) {
                    h(false);
                    bouncerActivity.getOnBackPressedDispatcher().c();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kil(BouncerActivity bouncerActivity, LoginProperties loginProperties) {
        super(true);
        this.e = bouncerActivity;
        this.f = loginProperties;
    }
}
