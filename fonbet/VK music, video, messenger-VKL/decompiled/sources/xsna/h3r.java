package xsna;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4281dc;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.vk.log.L;
import com.vk.prefui.fragments.MaterialPreferenceFragment;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class h3r implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h3r(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                m3r m3rVar = (m3r) this.c;
                p3h p3hVar = (p3h) this.d;
                nwk nwkVar = (nwk) this.e;
                m3rVar.u.removeCallbacksAndMessages(null);
                if (((Boolean) p3hVar.invoke()).booleanValue()) {
                    nwkVar.invoke();
                    break;
                }
                break;
            case 1:
                ((RecyclerView.o) this.d).smoothScrollToPosition((RecyclerView) this.e, null, MaterialPreferenceFragment.this.b0);
                break;
            case 2:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.c;
                rhq0 rhq0Var = (rhq0) this.d;
                try {
                    ((FragmentActivity) this.e).startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(extendedUserProfile.x0, new StringBuilder("https://twitter.com/"))));
                    break;
                } catch (Throwable th) {
                    if (th instanceof ActivityNotFoundException) {
                        return;
                    }
                    if ((th instanceof NullPointerException) && rhq0.c(rhq0Var)) {
                        L.G(ms9.b("Can't start activity cause of internal OS error: ", th));
                        return;
                    } else {
                        com.vk.metrics.eventtracking.b.a.q(th);
                        return;
                    }
                }
                break;
            default:
                C4281dc.a((C4281dc) this.c, (AdapterNativeAdData) this.d, (AdapterNativeAdViewBinder) this.e);
                break;
        }
    }
}
