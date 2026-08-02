package xsna;

import com.vk.voip.ui.members.VoipDataProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e99 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ m99 c;

    public /* synthetic */ e99(m99 m99Var, int i) {
        this.b = i;
        this.c = m99Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.d(new com.vk.movika.sdk.base.observable.q((it80) obj, 10));
                return s3q0.a;
            default:
                List list = (List) obj;
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                io.reactivex.rxjava3.internal.operators.observable.j1 U = voipDataProvider.i(list).U(new kf3(new mo1(6), 4));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return new io.reactivex.rxjava3.internal.operators.observable.t2(U, 1L, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), true).a0(this.c.i);
        }
    }
}
