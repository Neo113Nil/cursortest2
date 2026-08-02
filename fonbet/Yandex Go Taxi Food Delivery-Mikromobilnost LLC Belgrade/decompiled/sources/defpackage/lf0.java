package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.payments.mbank.navigation.d;
import ru.yandex.taxi.h;
import ru.yandex.taxi.preorder.source.userposition.repository.b;

/* loaded from: classes8.dex */
public final class lf0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final n3w e;
    public final xvf0 f;

    public lf0(eqh eqhVar, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = 6;
        this.b = eqhVar;
        this.e = n3wVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.f = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        n3w n3wVar = this.e;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new d(i5m.a(xvf0Var4), (po21) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var), (hf0) n3wVar.a);
            case 1:
                return new fl5((w030) xvf0Var4.get(), (Activity) xvf0Var3.get(), (yk5) xvf0Var2.get(), (el5) n3wVar.a, this.f);
            case 2:
                return new b((tst) xvf0Var4.get(), (k421) xvf0Var3.get(), i5m.a(xvf0Var2), i5m.a(xvf0Var), (icz) n3wVar.a);
            case 3:
                return new lzh((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (w49) xvf0Var2.get(), (jg30) xvf0Var.get(), (gg30) n3wVar.a);
            case 4:
                return new ss9((Context) xvf0Var4.get(), (w030) xvf0Var3.get(), (i130) xvf0Var2.get(), (hbe0) xvf0Var.get(), (lbe0) n3wVar.a);
            case 5:
                return new fl5((w030) xvf0Var4.get(), (Activity) xvf0Var3.get(), (wge0) xvf0Var2.get(), (yge0) n3wVar.a, (gf41) xvf0Var.get());
            default:
                return new dr7((w030) xvf0Var4.get(), (sli0) n3wVar.a, (it2) xvf0Var3.get(), (lg21) xvf0Var2.get(), (h) xvf0Var.get());
        }
    }

    public /* synthetic */ lf0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, n3w n3wVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.f = xvf0Var4;
        this.e = n3wVar;
    }

    public /* synthetic */ lf0(xvf0 xvf0Var, n3w n3wVar, n3w n3wVar2, n3w n3wVar3, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = n3wVar;
        this.d = n3wVar2;
        this.e = n3wVar3;
        this.f = v7pVar;
    }
}
