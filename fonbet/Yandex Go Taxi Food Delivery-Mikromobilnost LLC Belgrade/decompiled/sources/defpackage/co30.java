package defpackage;

import android.content.Context;
import com.yandex.feedsdk.di.FeedSdkComponent;
import defpackage.gi30;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;

/* loaded from: classes6.dex */
public final class co30 extends fkr {
    public final d130 G;
    public final jo30 H;

    public co30(d130 d130Var, jo30 jo30Var) {
        this.G = d130Var;
        this.H = jo30Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.G;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        gi30.a aVar = ((bi30) obj).a;
        Float f = aVar.a;
        Integer num = aVar.b;
        Integer num2 = aVar.c;
        Integer num3 = aVar.d;
        wrr wrrVar = this.H.a;
        return new MtMainFlexModalView(f, num, num2, num3, (Context) ((xvf0) wrrVar.b).get(), (FeedSdkComponent) ((xvf0) wrrVar.c).get(), (dwc) ((xvf0) wrrVar.w).get(), (lo30) ((ii9) wrrVar.x).get(), (c2x0) ((xvf0) wrrVar.y).get(), (pwy0) ((xvf0) wrrVar.z).get(), (ip11) ((xvf0) wrrVar.A).get());
    }
}
