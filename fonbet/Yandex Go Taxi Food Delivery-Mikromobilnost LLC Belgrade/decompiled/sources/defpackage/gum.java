package defpackage;

import com.lightside.animations.a;
import com.yandex.passport.internal.ui.bouncer.roundabout.p;

/* loaded from: classes2.dex */
public final class gum implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object w;

    public /* synthetic */ gum(float f, float f2, int i, Object obj) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.w = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        float f = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                ((p) obj2).invoke(Integer.valueOf(m810.b(g8e.b(f, f2, ((Number) obj).floatValue(), f2))));
                break;
            default:
                ((a) obj2).a.setAlpha(g8e.b(f, f2, ((Number) obj).floatValue(), f2));
                break;
        }
        return zy11Var;
    }
}
