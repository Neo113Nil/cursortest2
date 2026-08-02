package xsna;

import android.content.ComponentName;
import android.content.Intent;
import com.vk.core.fragments.FragmentEntry;
import com.vk.log.L;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.superapp.api.dto.app.WebSubscriptionInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.FragmentWrapperActivity;
import xsna.l310;
import xsna.skm0;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class p210 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p210(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [xsna.rsr] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                l310.q.g gVar = (l310.q.g) obj;
                r210.f((wk50.a) obj3, (x410) obj2, gVar.b, gVar.c, new gzn(14));
                break;
            case 1:
                FragmentEntry fragmentEntry = (FragmentEntry) obj3;
                nx50 nx50Var = (nx50) obj2;
                Intent intent = (Intent) obj;
                if (fragmentEntry != null && nx50Var.s(intent)) {
                    nx50Var.r(intent);
                } else if (fragmentEntry == null || !q6r0.f().A()) {
                    L.G("onNewIntent(), fragment entry = null");
                } else {
                    nx50Var.Z();
                    NavigationDelegateActivity navigationDelegateActivity = nx50Var.b;
                    rsr rsrVar = oz50.k;
                    ?? r5 = oz50.k;
                    (r5 != 0 ? r5 : null).getClass();
                    navigationDelegateActivity.startActivity(intent.setComponent(new ComponentName(navigationDelegateActivity, (Class<?>) FragmentWrapperActivity.class)));
                }
                nx50Var.Q0(nx50.B0(intent, nx50Var.E), false);
                break;
            case 2:
                break;
            case 3:
                ((cjx) obj3).b((ajx) obj2);
                ((skm0.a) obj).e();
                break;
            default:
                mov0 mov0Var = (mov0) obj3;
                WebSubscriptionInfo webSubscriptionInfo = (WebSubscriptionInfo) obj2;
                JsApiMethodType jsApiMethodType = (JsApiMethodType) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).t0(((ggu0) mov0Var.f.c).b);
                mov0Var.i = true;
                mov0Var.j = webSubscriptionInfo;
                mov0Var.k = jsApiMethodType;
                mov0Var.h(VkAppsErrors.Client.USER_DENIED);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p210(r210 r210Var, wk50.a aVar, x410 x410Var, l310.q.g gVar) {
        this.b = 0;
        this.c = aVar;
        this.d = x410Var;
        this.e = gVar;
    }
}
