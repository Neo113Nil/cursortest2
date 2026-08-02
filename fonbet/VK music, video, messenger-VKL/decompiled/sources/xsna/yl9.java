package xsna;

import com.vkontakte.android.data.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yl9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yl9(int i, Object obj, int i2) {
        this.b = i2;
        this.c = i;
        this.d = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.q<md90> loadEntries;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                b.d dVar = (b.d) obj;
                dVar.b(Integer.valueOf(i2), "brand_id");
                Integer num = ((am9) obj2).b;
                if (num != null) {
                    nf9 nf9Var = nf9.b;
                    nf9.n(dVar, num);
                }
                return s3q0.a;
            case 1:
                String str = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE audio_track SET downloading_state = ? WHERE mid = ?");
                try {
                    V0.bindLong(1, i2);
                    V0.D3(2, str);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                uut0 uut0Var = (uut0) obj2;
                wc1 wc1Var = uut0Var.j.c;
                return (wc1Var == null || (loadEntries = uut0Var.e.loadEntries(wc1Var, i2, uut0Var.f)) == null) ? io.reactivex.rxjava3.internal.operators.observable.g0.b : loadEntries;
        }
    }

    public /* synthetic */ yl9(uut0 uut0Var, int i) {
        this.b = 2;
        this.d = uut0Var;
        this.c = i;
    }
}
