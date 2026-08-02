package com.yandex.passport.common.network;

import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.util.ForegroundDetector;
import defpackage.hs31;
import defpackage.lz40;
import defpackage.n610;
import defpackage.scc;
import defpackage.sls;
import defpackage.zko;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        hs31 viewModel_delegate$lambda$0;
        List foregroundActivities_delegate$lambda$1;
        lz40 destroyedActivityMutableFlow_delegate$lambda$5;
        switch (this.a) {
            case 0:
                _init_$_anonymous_ = BackendError._init_$_anonymous_();
                return _init_$_anonymous_;
            case 1:
                throw new IllegalStateException("No DarkMode provided");
            case 2:
                throw new IllegalStateException("No isWhiteLabel provided");
            case 3:
                return androidx.compose.runtime.f.j(Boolean.FALSE);
            case 4:
                return scc.g(new Credentials("ixnjS4SWsp6DD8fshySJ/ClWdh38gE/8EyyCvNaD+qEPmlANxFG2IvCpi9PDzl/E", "iU22SNiVvsrSCJG7hy2Or80ApPky0d92/7+fYSB60nZjmc18fduySNaiLpXlwdwk"), new Credentials("2hjjG9aQvp6ECpK4h32OqmsKO/FS5MjrSC2k5jbpuulTxNlZJTbGu1qjNGMgGNCS", "iU/gT9fHts+HX8Wwhynb/E50SuXqPFgiEL9heWzkKIClKeZ/2bfgHBw5/9SWyu5F"));
            case 5:
                return scc.g(new Credentials("30iwH9LBts7aWsa+h3jW+Pw2Nhffr9+OKE6kZUd3myxUewFcIBLQ/nPv9h9McIAP", "3xG+HNSdvpjXXMe4h3/W+5IuRDGIssyuQYxU9exB1baFb1Y+JYPq4PI56ipR46e8"), new Credentials("2RGyS4eX5M3WCpSwhy3drvxsFZiazERFgXh7Xyaxay97+WpIBn2q/U89j4pq8Q/g", "2x2/StnG4J3aX8K5hy6K/CG+nXJ+DJToPsBAqhNMpZucmW/DxBbYG97ywOMObJ/f"));
            case 6:
                return kotlin.collections.a.m0((List) com.yandex.passport.internal.credentials.d.c.getValue(), (List) com.yandex.passport.internal.credentials.d.b.getValue());
            case 7:
                return new zko(Executors.newCachedThreadPool(new com.yandex.passport.common.coroutine.h("IPC", new AtomicInteger(1))));
            case 8:
                return n610.a(n610.a);
            case 9:
                viewModel_delegate$lambda$0 = GlobalRouterActivity.viewModel_delegate$lambda$0();
                return viewModel_delegate$lambda$0;
            case 10:
                foregroundActivities_delegate$lambda$1 = ForegroundDetector.foregroundActivities_delegate$lambda$1();
                return foregroundActivities_delegate$lambda$1;
            case 11:
                destroyedActivityMutableFlow_delegate$lambda$5 = ForegroundDetector.destroyedActivityMutableFlow_delegate$lambda$5();
                return destroyedActivityMutableFlow_delegate$lambda$5;
            default:
                return Pattern.compile("^https://yandex\\.(ru|com|com\\.tr|by|kz|ua)/legal/.*");
        }
    }
}
