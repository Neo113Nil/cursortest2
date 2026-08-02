package xsna;

import android.util.Size;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.ecomm.products_selection.impl.di.ProductsSelectionComponentImpl;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.di.VideoHistoryRecordComponentImpl;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.push.rustore.impl.di.RuStoreComponentImpl;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class buc0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ buc0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        String str = null;
        switch (this.b) {
            case 0:
                return ((NewsFeedComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(NewsFeedComponent.class))).X5();
            case 1:
                qcy<Object>[] qcyVarArr = ProductsSelectionComponentImpl.b;
                return new com.vk.ecomm.products_selection.impl.a();
            case 2:
                int i = ProfileMainPhotosFragment.F0;
                return new zvw(null);
            case 3:
                qcy<Object>[] qcyVarArr2 = RuStoreComponentImpl.f;
                return new drg0();
            case 4:
                int i2 = idi0.j;
                return "";
            case 5:
                return new VmojiPromoInSuggestsRepositoryImpl();
            case 6:
                int i3 = StoryAvatarView.G;
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_FEED_NEW_DESIGN;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 7:
                return ((StoriesSettingsComponent) ((k7m) m7m.f(o0m0.b)).a(fpf0.a(StoriesSettingsComponent.class))).B7();
            case 8:
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            case 9:
                return new es();
            case 10:
                return new com.vk.music.player.playback.b();
            case 11:
                ComFeatures comFeatures = ComFeatures.COM_DISABLE_SUBSCRIBE_DIALOG;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 12:
                ComFeatures comFeatures2 = ComFeatures.COM_EASY_PROMOTE;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
            case 13:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_friends_swipe_disable_actions", false));
            case 14:
                int i4 = VideoFullscreenBottomBarView.l;
                return Boolean.valueOf(com.vk.toggle.d.v().a);
            case 15:
                qcy<Object>[] qcyVarArr3 = VideoHistoryRecordComponentImpl.b;
                return new kps0(new uft0());
            case 16:
                return new azs0();
            case 17:
                int i5 = VideoSkippablePartView.C;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NEW_CONTROLS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 18:
                if (e370.s != null) {
                    b.d i6 = com.vk.toggle.b.A.i(SaFeatures.SA_GAMES_NEW_DISCOUNT);
                    JSONObject g = i6 != null ? i6.g() : null;
                    if (g != null) {
                        str = f370.D(g, "dialog_type");
                    }
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1783949481) {
                        if (hashCode != 3172656) {
                            if (hashCode == 100313435 && str.equals("image")) {
                                return PersonalDiscountDialogType.IMAGE;
                            }
                        } else if (str.equals("gift")) {
                            return PersonalDiscountDialogType.GIFT;
                        }
                    } else if (str.equals("image_large")) {
                        return PersonalDiscountDialogType.IMAGE_LARGE;
                    }
                }
                return PersonalDiscountDialogType.IMAGE;
            case 19:
                return new rpj(fpf0.a(Size.class), null, new KSerializer[0]);
            case 20:
                throw null;
            case 21:
                par0.a.getClass();
                par0.a("[ExtraValidation] phone change was cancelled");
                return s3q0.a;
            case 22:
                b = e8r.a.b(r1, PrivateSubdir.VMOJI.h(), true);
                return b.a;
            case 23:
                return s3q0.a;
            default:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_voip_v2_show_mediastat", false));
        }
    }
}
