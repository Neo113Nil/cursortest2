package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.List;
import xsna.cs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mvq implements izs {
    public final /* synthetic */ nvq b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ mvq(nvq nvqVar, List list, int i, String str) {
        this.b = nvqVar;
        this.c = list;
        this.d = i;
        this.e = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (!(th instanceof VKApiExecutionException) || ((VKApiExecutionException) th).s() != 104) {
            return io.reactivex.rxjava3.core.q.H(th);
        }
        dz2 x = yfb.x(cs.a.e(this.b.a, this.c, Integer.valueOf(this.d), this.e, null, 8));
        x.n = true;
        return rsg0.T(x);
    }
}
