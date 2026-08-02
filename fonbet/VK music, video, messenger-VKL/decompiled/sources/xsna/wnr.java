package xsna;

import android.app.Activity;
import com.vk.superapp.browser.internal.utils.FlashlightUtils;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wnr implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wnr(Activity activity, boolean z) {
        this.c = z;
        this.d = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue() && !z) {
                    return io.reactivex.rxjava3.core.x.k(FlashlightUtils.EnableFlashlightResult.SUCCESS);
                }
                io.reactivex.rxjava3.core.w wVar = FlashlightUtils.a;
                return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.b(new nu0(activity, 21)).q(io.reactivex.rxjava3.android.schedulers.a.b()), new c8(new xnr(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0), 14));
            default:
                int b = an10.b(((ccn) obj2).a.d());
                Integer valueOf = Integer.valueOf(b);
                if (!z) {
                    valueOf = null;
                }
                return new h9x(((valueOf != null ? valueOf.intValue() : 0) << 32) | (((z ? null : Integer.valueOf(b)) != null ? r2.intValue() : 0) & 4294967295L));
        }
    }

    public /* synthetic */ wnr(ccn ccnVar, boolean z) {
        this.d = ccnVar;
        this.c = z;
    }
}
