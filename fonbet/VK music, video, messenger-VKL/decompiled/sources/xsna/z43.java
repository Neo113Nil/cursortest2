package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import xsna.s16;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class z43 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ z43(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(epx.f(((StoriesContainer) obj).Ob(), str));
            case 1:
                s16.a aVar = (s16.a) obj;
                return Boolean.valueOf(epx.f(aVar.F(), str) || (aVar instanceof s16.a.C3647a));
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.s(tgi0Var, new us2(str));
                qgi0.n(tgi0Var, 0);
                return s3q0.a;
            case 3:
                qgi0.h((tgi0) obj, str);
                return s3q0.a;
            case 4:
                int i2 = RouletteView.k;
                return !((Boolean) obj).booleanValue() ? mcr0.s(str) : io.reactivex.rxjava3.internal.operators.completable.i.b;
            default:
                tfx tfxVar = new tfx("photos.verticalizeCheckStatus", new vga0(0), new or(27));
                tfx.o(tfxVar, "query_id", this.c, 0, 0, 12);
                return rsg0.T(yfb.x(tfxVar));
        }
    }

    public /* synthetic */ z43(eqr0 eqr0Var, String str) {
        this.b = 5;
        this.c = str;
    }
}
