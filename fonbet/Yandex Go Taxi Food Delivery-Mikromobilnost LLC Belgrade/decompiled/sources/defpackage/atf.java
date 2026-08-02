package defpackage;

import android.net.Uri;
import com.yandex.payment.divkit.license.DKLicenseFragment;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class atf implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKLicenseFragment b;

    public /* synthetic */ atf(DKLicenseFragment dKLicenseFragment, int i) {
        this.a = i;
        this.b = dKLicenseFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        tc5 activityViewModel;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        DKLicenseFragment dKLicenseFragment = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if (jl40.l(uri.getHost(), "close_legal") && jl40.l(uri.getScheme(), "payment-sdk")) {
                    activityViewModel = dKLicenseFragment.getActivityViewModel();
                    ((xc5) activityViewModel).c.l(c950.c);
                    break;
                }
                break;
            default:
                dKLicenseFragment.observeDivData((cnk) obj);
                break;
        }
        return zy11Var;
    }
}
