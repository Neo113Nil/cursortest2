package defpackage;

import com.yandex.payment.sdk.flex.impl.b;
import com.ybsdk.widgets.common.shimmer.ShimmerDrawable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class dhr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeakReference b;

    public /* synthetic */ dhr(WeakReference weakReference, int i) {
        this.a = i;
        this.b = weakReference;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                b bVar = (b) weakReference.get();
                if (bVar != null) {
                    bVar.h(map);
                    break;
                }
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    ShimmerDrawable shimmerDrawable = (ShimmerDrawable) weakReference.get();
                    if (shimmerDrawable != null) {
                        shimmerDrawable.stopShimmer();
                        break;
                    }
                } else {
                    ShimmerDrawable shimmerDrawable2 = (ShimmerDrawable) weakReference.get();
                    if (shimmerDrawable2 != null) {
                        shimmerDrawable2.startShimmer();
                        break;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
