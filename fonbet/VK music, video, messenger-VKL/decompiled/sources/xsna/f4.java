package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.api.sdk.utils.log.Logger;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.oauth.di.OAuthComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.im.edu.organization.api.di.EduOrganizationInfoComponent;
import com.vk.newsfeed.posting.api.di.Posting2ComponentStub;
import com.vk.profile.community.creationonboarding.impl.di.CreationOnboardingComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SmbFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.hds;
import xsna.r46;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f4 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ f4(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ACTION_AFTER_LOGIN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 1:
                DecimalFormat decimalFormat = new DecimalFormat();
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols.setGroupingSeparator(' ');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                decimalFormat.setGroupingSize(3);
                return decimalFormat;
            case 2:
                return ((EduOrganizationInfoComponent) ((k7m) m7m.f(new r46.b())).mo408a(fpf0.a(EduOrganizationInfoComponent.class))).u9();
            case 3:
                return new ngj0();
            case 4:
                if (fxc0.B().J().g()) {
                    return new fjt0();
                }
                return null;
            case 5:
                return new t2a();
            case 6:
                return s3q0.a;
            case 7:
                return new jed0();
            case 8:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return h0f.b;
            case 9:
                cvk.u(R.string.voip_remote_dump_started, true);
                return s3q0.a;
            case 10:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 11:
                return s3q0.a;
            case 12:
                qcy<Object>[] qcyVarArr2 = CreationOnboardingComponentImpl.d;
                return new i0h();
            case 13:
                return new p4r();
            case 14:
                return Boolean.valueOf(com.vk.toggle.d.G());
            case 15:
                return Boolean.valueOf(!BuildInfo.g());
            case 16:
                return new Handler(Looper.getMainLooper());
            case 17:
                bpn0 bpn0Var = u8r.a;
                return "Using FileEventStorage with invalid config";
            case 18:
                return s3q0.a;
            case 19:
                return new dxs();
            case 20:
                return new ncv0();
            case 21:
                return Logger.LogLevel.DEBUG;
            case 22:
                List<VkOAuthService> e = ((OAuthComponent) x6y.H().a(fpf0.a(OAuthComponent.class))).B8().e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator<T> it = e.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VkOAuthService) it.next()).i());
                }
                return arrayList;
            case 23:
                SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
                smbFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbFeatures));
            case 24:
                return s3q0.a;
            case 25:
                return new k6v();
            case 26:
                return new iid0();
            case 27:
                return Boolean.valueOf(Preference.j().getBoolean("overlay_menu_is_enabled", true));
            case 28:
                return hds.a.a;
            default:
                qcy<Object>[] qcyVarArr3 = Posting2ComponentStub.d;
                return new Posting2ComponentStub.b();
        }
    }

    public /* synthetic */ f4(x6y x6yVar) {
        this.b = 22;
    }
}
