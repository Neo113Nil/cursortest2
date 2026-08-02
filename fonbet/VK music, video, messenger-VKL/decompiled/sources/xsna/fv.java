package xsna;

import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fv implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fv(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                final fw fwVar = (fw) this.d;
                fwVar.d.b();
                io.reactivex.rxjava3.internal.operators.single.b0 m = hg1.k(fwVar.a.i0.getDependencies().a.o(fwVar.a.i0.getCurrentStory()), fwVar.a.i0.getContext()).m(io.reactivex.rxjava3.android.schedulers.a.b());
                final int i = this.c;
                m.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.dw
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        fw fwVar2 = fw.this;
                        fwVar2.d.c();
                        cmf0.a.c(fwVar2.a.i0.getContext(), fwVar2.a.i0.getWindow(), R.string.story_reply_is_hidden);
                        fwVar2.e.c(i);
                    }
                }, new ew(fwVar, 0));
                break;
            case 1:
                u9k0 u9k0Var = ((b4d0) this.d).Q;
                u9k0Var.a.smoothScrollTo((int) (((Number) rli0.A(new ulp0(new jxt0(u9k0Var.b), new ubj0(2))).get(this.c)).floatValue() - u9k0Var.a()), 0);
                break;
            default:
                vez0 vez0Var = (vez0) this.d;
                int i2 = this.c;
                if (i2 == -2 || i2 == -1) {
                    vez0Var.d();
                    gu8.c(null, "InterstitialPromoMediaPresenterS2: Audiofocus loss, pausing");
                    break;
                }
                break;
        }
    }
}
