package defpackage;

import android.view.animation.LinearInterpolator;
import com.yandex.alicekit.core.views.animator.DslAnimatorBuilder;
import defpackage.g8e;
import defpackage.m810;
import defpackage.zy11;

/* loaded from: classes11.dex */
public final /* synthetic */ class pxc0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nw70 b;

    public /* synthetic */ pxc0(nw70 nw70Var, int i) {
        this.a = i;
        this.b = nw70Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        nw70 nw70Var = this.b;
        switch (i) {
            case 0:
                DslAnimatorBuilder dslAnimatorBuilder = (DslAnimatorBuilder) obj;
                dslAnimatorBuilder.targets(new pxc0(nw70Var, 1));
                dslAnimatorBuilder.setDuration(0L);
                dslAnimatorBuilder.setInterpolator(new LinearInterpolator());
                break;
            case 1:
                final pxc0 pxc0Var = new pxc0(nw70Var, 2);
                final float f = 0.0f;
                ((hum) obj).a.invoke(new zj2(new tls() { // from class: com.yandex.alicekit.core.views.animator.DslTargetBuilder$custom$$inlined$onNewValue$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        float floatValue = ((Number) obj2).floatValue();
                        float f2 = f;
                        pxc0Var.invoke(Integer.valueOf(m810.b(g8e.b(f, f2, floatValue, f2))));
                        return zy11.a;
                    }
                }));
                break;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                ((i4b0) nw70Var.b).invoke(num);
                break;
        }
        return zy11Var;
    }
}
