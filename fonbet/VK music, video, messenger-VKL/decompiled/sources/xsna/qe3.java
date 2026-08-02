package xsna;

import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.captcha.impl.di.CaptchaComponentImpl;
import com.vk.channels.impl.list.onboarding.di.ChannelsOnboardingDiComponent;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.im.engine.models.attaches.ImageScaleType;
import com.vk.libvideo.autoplay.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vk.webapp.community_picker.AppsCommunityPickerFragment;
import com.vkontakte.android.R;
import java.util.Calendar;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import xsna.n7r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qe3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qe3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                int i = AppsCommunityPickerFragment.U;
                return s3q0.a;
            case 1:
                return b.c.a;
            case 2:
                return s3q0.a;
            case 3:
                return new u29();
            case 4:
                return new v7c0();
            case 5:
                qcy<Object>[] qcyVarArr = CaptchaComponentImpl.b;
                xzg0 xzg0Var = new xzg0();
                xzg0Var.c = new n7r0.c(null, false, true, false);
                return xzg0Var;
            case 6:
                return s3q0.a;
            case 7:
                qcy<Object>[] qcyVarArr2 = ChannelsOnboardingDiComponent.c;
                zdw zdwVar = i7o0.b;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                l7v b = zdwVar.g.getValue().b();
                zdw zdwVar2 = i7o0.b;
                cew cewVar = (zdwVar2 != null ? zdwVar2 : null).u;
                if (zdwVar2 == null) {
                    zdwVar2 = null;
                }
                a1w a1wVar = zdwVar2.b;
                bpn0 bpn0Var = o25.a;
                return new uhb(b, cewVar, a1wVar, o25.b((b25) (bpn0Var != null ? bpn0Var : null).getValue()));
            case 8:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 9:
                return s3q0.a;
            case 10:
                return new com.vk.clips.coauthors.domain.model.b();
            case 11:
                int i2 = ClipsInterestsFragment.Y;
                return new pkn0();
            case 12:
                return s3q0.a;
            case 13:
                return new zqu();
            case 14:
                return new pog();
            case 15:
                return 1;
            case 16:
                return new o6k(o25.a(), new rd9());
            case 17:
                return EmptySet.b;
            case 18:
                return s3q0.a;
            case 19:
                if (v8m.a != null) {
                    com.vk.metrics.eventtracking.b.a.n("IM.DIALOG_ACTION.CANCELED");
                    v8m.a = null;
                }
                return s3q0.a;
            case 20:
                return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_secondary));
            case 21:
                return new s6g0();
            case 22:
                return s3q0.a;
            case 23:
                return Calendar.getInstance();
            case 24:
                if (e370.s != null && com.vk.toggle.b.A.a(SaFeatures.SA_GAMES_GET_CATALOG)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                return new mvv();
            case 26:
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 27:
                return ImageScaleType.h();
            case 28:
                Path path = new Path();
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f);
                path.lineTo(1.0f, 0.8268492f);
                path.lineTo(2.0f, 0.1f);
                return path;
            default:
                return new Regex("me\\.sferum\\.ru");
        }
    }
}
