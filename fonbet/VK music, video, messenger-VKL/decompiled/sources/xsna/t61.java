package xsna;

import android.content.Context;
import android.graphics.Paint;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.datepicker.impl.di.DatePickerComponentImpl;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.ecomm.cart.api.di.CartComponent$Companion$STUB$1;
import com.vk.friends.requests.impl.di.FriendsRequestsComponentImpl;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class t61 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ t61(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 2:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_TOOLBAR_VH_REDESIGN;
                videoFeatures.getClass();
                break;
            case 3:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_AD_IN_PIP;
                videoFeatures2.getClass();
                break;
            case 4:
                AvatarView.a aVar = AvatarView.y;
                break;
            case 5:
                int i = BasePhotoListFragment.l0;
                FeedFeatures feedFeatures = FeedFeatures.POSTING_PHOTO_EDITOR;
                feedFeatures.getClass();
                break;
            case 7:
                qcy<Object>[] qcyVarArr = CartComponent$Companion$STUB$1.f;
                break;
            case 8:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                CatalogButtonOpenUrl catalogButtonOpenUrl = new CatalogButtonOpenUrl("open_url", null, context.getString(R.string.autodownloaded_banner_play), new ActionOpenUrl(i5s.a(new StringBuilder("https://"), a0a.d, "/audio_offline?section=synthetic_offline_music_autodownload_all"), ActionOpenUrl.Target.f88internal), null, null, null, null, "accent", 112, null);
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                String string = context2.getString(R.string.music_catalog_offline_autodownload);
                Context context3 = e43.a;
                break;
            case 10:
                break;
            case 11:
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                break;
            case 14:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                break;
            case 16:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                break;
            case 18:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                break;
            case 19:
                u6g0 u6g0Var = znk0.n;
                break;
            case 20:
                qcy<Object>[] qcyVarArr4 = DatePickerComponentImpl.b;
                break;
            case 24:
                qcy<Object>[] qcyVarArr5 = FriendsRequestsComponentImpl.g;
                break;
            case 25:
                int i2 = GalleryFragmentImpl.R0;
                break;
            case 26:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(-16777216);
                paint.setStyle(Paint.Style.FILL);
                break;
            case 28:
                nf9.b.k(StoryPublishEvent.HIDE_MASK_ACTIONS);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t61(Object obj, int i) {
        this.b = i;
    }
}
