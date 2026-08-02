package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.search.params.api.VkPeopleSearchParams;
import io.opentelemetry.api.trace.StatusCode;
import one.video.player.error.OneVideoPlaybackException;
import xsna.nn20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class t6n implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t6n(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                xsh0 xsh0Var = (xsh0) obj5;
                FragmentManager fragmentManager = (FragmentManager) ((gbh) obj4).c;
                VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) obj3;
                Activity activity = (Activity) obj2;
                if (((Boolean) DiscoverSearchTabs.a.getValue()).booleanValue()) {
                    Context baseContext = activity.getBaseContext();
                    int i2 = DiscoverSearchFragment.s0;
                    xsh0Var.a(baseContext, fragmentManager, vkPeopleSearchParams);
                } else {
                    dxh0 dxh0Var = new dxh0(activity, new nv90(vkPeopleSearchParams, activity));
                    int i3 = DiscoverSearchFragment.s0;
                    dxh0Var.a(fragmentManager);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((nn20) obj5).f((nn20.a) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(391));
                break;
            case 2:
                sht0 sht0Var = (sht0) obj4;
                OneVideoPlaybackException oneVideoPlaybackException = (OneVideoPlaybackException) obj3;
                ohk0 ohk0Var = (ohk0) obj;
                ((ks80) obj5).b.remove((String) obj2);
                ohk0Var.l(StatusCode.ERROR);
                lk3 lk3Var = new lk3();
                if (sht0Var != null) {
                    lk3Var.b("videoSource.type", sht0Var.a.name());
                    lk3Var.d("videoSource.isLive", sht0Var.c);
                    lk3Var.b("videoSource.uri", sht0Var.b.toString());
                }
                ohk0Var.d(lk3Var.e());
                ohk0Var.f(oneVideoPlaybackException);
                break;
            default:
                ((Integer) obj2).getClass();
                d0s0.b((e0s0) obj5, (gzs) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t6n(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
