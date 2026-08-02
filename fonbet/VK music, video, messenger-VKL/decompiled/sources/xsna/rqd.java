package xsna;

import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rqd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ rqd(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            case 1:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (epx.f(((spp0) obj2).a, this.c)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                spp0 spp0Var = (spp0) obj2;
                String str = spp0Var != null ? spp0Var.b : null;
                return str != null ? io.reactivex.rxjava3.core.k.i(str) : io.reactivex.rxjava3.internal.operators.maybe.i.b;
            case 2:
                qgi0.e((tgi0) obj, this.c, null);
                return s3q0.a;
            case 3:
                return Boolean.valueOf(drm0.D("+" + ((wyj) obj).a.c, this.c, true));
            case 4:
                String str2 = this.c;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM meta WHERE storage_name = ?");
                try {
                    V0.D3(1, str2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "MusicPickerToolbarTitle");
                qgi0.h(tgi0Var, this.c);
                return s3q0.a;
        }
    }
}
