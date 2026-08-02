package xsna;

import android.graphics.Paint;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.core.preference.Preference;
import com.vk.internal.api.GsonHolder;
import com.vk.photos.root.di.PhotosComponentImpl;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragment;
import com.vk.preview.di.GalleryPickerPreviewComponentImpl;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ r(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                AdsintEventTypeDto adsintEventTypeDto = AdsintEventTypeDto.MRC_CLICK;
                AdsintEventTypeDto adsintEventTypeDto2 = AdsintEventTypeDto.MRC_IMPRESSION;
                return pn00.k(new Pair(adsintEventTypeDto, adsintEventTypeDto2), new Pair(AdsintEventTypeDto.MRC_CLICK_OPEN_LINK_URL, adsintEventTypeDto2), new Pair(AdsintEventTypeDto.MRC_CLICK_INSTALL_APP, adsintEventTypeDto2), new Pair(AdsintEventTypeDto.MRC_CLICK_OPEN_APP, adsintEventTypeDto2), new Pair(AdsintEventTypeDto.MRC_CLICK_HEADER, adsintEventTypeDto2), new Pair(AdsintEventTypeDto.MRC_CLICK_POST_LINK, adsintEventTypeDto2), new Pair(AdsintEventTypeDto.MRC_CLICK_PRETTY_CARD, AdsintEventTypeDto.MRC_IMPRESSION_PRETTY_CARD));
            case 2:
                return s3q0.a;
            case 3:
                FeedFeatures feedFeatures = FeedFeatures.SHARED_VIEW_POOL;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 4:
                return s3q0.a;
            case 5:
                return s3q0.a;
            case 6:
                SoccomFeatures soccomFeatures = SoccomFeatures.CHECKOUT_NEW_FLOW;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 7:
                return new Regex("/clips/effect/([-0-9]+)_([-0-9]+)");
            case 8:
                return new abs0();
            case 9:
                return new hte();
            case 10:
                ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 11:
                qcy<Object>[] qcyVarArr = GalleryPickerPreviewComponentImpl.e;
                return new d3m0();
            case 12:
                return new gmv0();
            case 13:
                FeedFeatures feedFeatures2 = FeedFeatures.FRIEND_COMMENTS_INLINE;
                feedFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures2));
            case 14:
                pqo pqoVar = nvz.a;
                return null;
            case 15:
                return s3q0.a;
            case 16:
                return Boolean.valueOf(com.vk.toggle.d.I());
            case 17:
                FeedFeatures feedFeatures3 = FeedFeatures.DEVICE_VOLUME;
                feedFeatures3.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures3));
            case 18:
                FeedFeatures feedFeatures4 = FeedFeatures.FILTER_ACTIVITIES;
                feedFeatures4.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures4));
            case 19:
                Paint paint = new Paint(1);
                paint.setColor(l8g.f(0.7f, dhr0.t.c(R.attr.vk_ui_background_contrast_inverse)));
                paint.setStyle(Paint.Style.FILL);
                return paint;
            case 20:
                return EmptyList.b;
            case 21:
                ky6 j = Preference.j();
                return new och0(j.getFloat("overlay_menu_button_position_x", 1.0f), j.getFloat("overlay_menu_button_position_y", 0.25f));
            case 22:
                ImFeatures imFeatures = ImFeatures.PERSONAL_CHANNEL_CREATION_ONBOARDING;
                imFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(imFeatures));
            case 23:
                qcy<Object>[] qcyVarArr2 = PhotosComponentImpl.u;
                return new PickVKPhotoFragment();
            case 24:
                fxc0.B().T().o(!fxc0.B().T().t());
                return s3q0.a;
            case 25:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.CONTACTING_SUPPORT, null, null, null, 28);
                return s3q0.a;
            case 26:
                return Boolean.valueOf(com.vk.toggle.b.A.a(ImFeatures.GRID_SHARING_CREATE_CHAT));
            case 27:
                return new vej0();
            case 28:
                return new d3l0();
            default:
                return GsonHolder.a();
        }
    }
}
