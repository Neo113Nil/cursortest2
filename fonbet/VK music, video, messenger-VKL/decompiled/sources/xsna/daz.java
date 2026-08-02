package xsna;

import android.content.Context;
import com.unity3d.services.core.properties.ClientProperties;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingComponentImpl;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.resetcounters.api.di.ResetCountersComponent$Companion$STUB$1;
import com.vk.sharing.im_engine_impl.di.SharingImEngineComponentImpl;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class daz implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ daz(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Context applicationContext;
        int i;
        JSONObject g;
        switch (this.b) {
            case 0:
                return Pattern.compile("\\b(?:([0-5]?\\d):)?([0-5]?\\d):([0-5]?\\d)\\b");
            case 1:
                return Integer.valueOf(krv0.l(R.attr.vk_ui_text_contrast));
            case 2:
                iyk0 iyk0Var = ym10.a;
                return Boolean.FALSE;
            case 3:
                return s3q0.a;
            case 4:
                return Integer.valueOf(iah0.a(128));
            case 5:
                return s3q0.a;
            case 6:
                FeedFeatures feedFeatures = FeedFeatures.FILTER_ACTIVITIES;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 7:
                qcy<Object>[] qcyVarArr = OnlineBookingComponentImpl.c;
                return new dp80();
            case 8:
                return f870.v(InternalVkMiniApps.ORD.h());
            case 9:
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                qof0.u.invoke();
                throw null;
            case 12:
                qcy<Object>[] qcyVarArr2 = ResetCountersComponent$Companion$STUB$1.b;
                return new ResetCountersComponent$Companion$STUB$1.a();
            case 13:
                return s3q0.a;
            case 14:
                return Integer.valueOf(n8g.l(dhr0.t.c(R.attr.vk_ui_text_primary), 81));
            case 15:
                return s3q0.a;
            case 16:
                int i2 = pii0.q1;
                return "";
            case 17:
                applicationContext = ClientProperties.getApplicationContext();
                return applicationContext;
            case 18:
                qcy<Object>[] qcyVarArr3 = SharingImEngineComponentImpl.m;
                return new s84();
            case 19:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i3 = com.vk.toggle.b.A.i(CoreFeatures.SINGLE_PREF_FULL_V2);
                try {
                    i = Integer.parseInt(i3 != null ? i3.c.toString() : null);
                } catch (Throwable unused) {
                    i = 0;
                }
                return Boolean.valueOf(i == 1);
            case 20:
                SmartCropFragmentInternalComponent.a aVar = SmartCropFragmentInternalComponent.g;
                return com.vk.core.utils.newtork.b.a;
            case 21:
                return UUID.randomUUID().toString();
            case 22:
                eqy<bek0> eqyVar2 = com.vk.toggle.d.a;
                b.d i4 = com.vk.toggle.b.A.i(StoriesFeatures.NEW_PRELOADER);
                return Integer.valueOf((i4 == null || (g = i4.g()) == null) ? 5 : g.optInt("authors"));
            case 23:
                return s3q0.a;
            case 24:
                int i5 = UserProfileFragment.p0;
                ComFeatures comFeatures = ComFeatures.COM_EASY_PROMOTE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 25:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_GROUP_VH_REDESIGN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 26:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_AD_IN_PIP;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 27:
                return s3q0.a;
            case 28:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_SHOU_ENTITY;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            default:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
        }
    }
}
