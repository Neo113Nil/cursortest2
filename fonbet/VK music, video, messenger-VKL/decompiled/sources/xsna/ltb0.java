package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.events.GetAdRevenueEventData;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.newsfeed.posting.impl.di.Posting2ComponentImpl;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.superapp.verification.account.di.VerificationAccountComponentImpl;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.web.view.marker.di.WebViewMarkerComponentImpl;
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.nfv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ltb0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ltb0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        GetAdRevenueEventData initialize$lambda$220$lambda$138;
        switch (this.b) {
            case 0:
                int i = PollVotersFragment.a0;
                return 2;
            case 1:
                return Boolean.valueOf(com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS));
            case 2:
                qcy<Object>[] qcyVarArr = Posting2ComponentImpl.h;
                return new HashMap();
            case 3:
                return h5s.a("vk-push-reader-thread");
            case 4:
                return ojo0.a;
            case 5:
                initialize$lambda$220$lambda$138 = ServiceProvider.initialize$lambda$220$lambda$138();
                return initialize$lambda$220$lambda$138;
            case 6:
                return new es();
            case 7:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_VIDEO_HISTORY;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 8:
                return new yup0();
            case 9:
                qcy<Object>[] qcyVarArr2 = VerificationAccountComponentImpl.b;
                return new oyv0();
            case 10:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return Integer.valueOf(context.getColor(R.color.vk_white));
            case 11:
                return Boolean.valueOf(fxc0.B().i().g());
            case 12:
                return new vbs0();
            case 13:
                return Boolean.valueOf(fxc0.B().J().s1());
            case 14:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(fxc0.B().J().t());
            case 15:
                return new ozr0(fxc0.B().J().a());
            case 16:
                com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                y84 y84Var = new y84(22);
                bVar.getClass();
                com.vk.registration.funnels.b.a(y84Var);
                return s3q0.a;
            case 17:
                return new bsp(TextUtils.TruncateAt.values(), "android.text.TextUtils.TruncateAt");
            case 18:
                return new nfv0.a();
            case 19:
                return new yd10();
            case 20:
                return new q73(new ykg());
            default:
                qcy<Object>[] qcyVarArr3 = WebViewMarkerComponentImpl.c;
                return new djx0();
        }
    }
}
