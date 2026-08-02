package xsna;

import com.vk.stickers.roulette.roulett_view.RouletteView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lng0 implements gzs {
    public final /* synthetic */ RouletteView b;
    public final /* synthetic */ int c;

    public /* synthetic */ lng0(RouletteView rouletteView, int i) {
        this.b = rouletteView;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = RouletteView.k;
        RouletteView rouletteView = this.b;
        nng0 presenter2 = rouletteView.getPresenter2();
        if (presenter2 != null) {
            presenter2.m6();
        }
        rouletteView.b.invoke(Integer.valueOf(this.c));
        return s3q0.a;
    }
}
