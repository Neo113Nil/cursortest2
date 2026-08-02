package xsna;

import android.content.Context;
import xsna.ii00;
import xsna.pl30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class p98 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p98(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((com.vk.core.service.a) this.c).h.dispose();
                break;
            case 1:
                ftb ftbVar = (ftb) this.c;
                ftbVar.n = null;
                ftbVar.e.r0();
                break;
            case 2:
                o9e o9eVar = (o9e) this.c;
                o9eVar.f.clear();
                int size = o9eVar.j.size();
                for (int i = 0; i < size; i++) {
                    o9eVar.f.put(((r4t) o9eVar.j.get(i)).b, Integer.valueOf(o9eVar.i.size() + i));
                }
                o9eVar.e.l = true;
                o9eVar.f();
                break;
            case 3:
                ((li00) this.c).d.onNext(ii00.b.a);
                break;
            case 4:
                uvq0 uvq0Var = (uvq0) this.c;
                uvq0Var.s().w().g(uvq0Var.h);
                uvq0Var.s().w().g(uvq0Var.k);
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                cuz.a(context).d(uvq0Var.j);
                uvq0Var.s().w().g(uvq0Var.i);
                break;
            case 5:
                l5v0 l5v0Var = (l5v0) this.c;
                l5v0Var.r = false;
                l5v0Var.k.onNext(new pl30.a(false));
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}
