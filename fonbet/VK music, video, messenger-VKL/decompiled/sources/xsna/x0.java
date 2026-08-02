package xsna;

import android.graphics.Paint;
import android.view.VelocityTracker;
import androidx.core.app.NotificationCompat;
import com.vk.clips.design.view.camera.settings.ModalPrivacySettingsErrorView;
import com.vk.clips.download.impl.di.ClipsDownloadComponentImpl;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.im.engine.models.groups.Group;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.profile.community.subscription.impl.di.CommunitySubscriptionComponentImpl;
import com.vk.superapp.di.AboutAppComponentImpl;
import com.vk.superapp.vibration.js.bridge.impl.VibrationUtils;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ x0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = AboutAppComponentImpl.b;
                return new k2();
            case 1:
                return Boolean.valueOf(e370.s != null && com.vk.toggle.b.A.a(SaFeatures.SA_GAMES_NEW_DISCOUNT));
            case 2:
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_INLINE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 3:
                int i = ButtonsSwipeView.r;
                return VelocityTracker.obtain();
            case 4:
                return new uwf0();
            case 5:
                qcy<Object>[] qcyVarArr2 = ClipsDownloadComponentImpl.c;
                return new irc();
            case 6:
                qcy<Object>[] qcyVarArr3 = ClipsInterestsComponentImpl.o;
                return new yhe();
            case 7:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 8:
                qcy<Object>[] qcyVarArr4 = CommunitySubscriptionComponentImpl.e;
                return new d3i();
            case 9:
                return new j2c0();
            case 10:
                return new p4r();
            case 11:
                int i2 = EntriesListFragment.m0;
                return Boolean.valueOf(com.vk.toggle.d.i());
            case 12:
                return new tvb0(5);
            case 13:
                return new NotificationCompat.j();
            case 14:
                return new xf3();
            case 15:
                int i3 = GamesCatalogFragment.i0;
                int i4 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Boolean.FALSE;
            case 16:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 17:
                Serializer.c<Group> cVar = Group.CREATOR;
                return Pattern.compile("(club|group)\\d+$");
            case 18:
                return "#doClearCache succeed";
            case 19:
                return new VibrationUtils();
            case 20:
                return s3q0.a;
            case 21:
                return Pattern.compile("'''(.*?)'''");
            case 22:
                return Boolean.valueOf(gz80.a(33));
            case 23:
                return s3q0.a;
            case 24:
                int i5 = ModalPrivacySettingsErrorView.c;
                return s3q0.a;
            case 25:
                return Boolean.valueOf(MusicFeatures.AUDIO_ARTIST_CONCERTS_CHIPS.h());
            case 26:
                return new sv60();
            case 27:
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(com.vk.voip.ui.c.z0());
            case 28:
                Paint paint = new Paint(1);
                paint.setColor(l8g.f(0.6f, dhr0.t.c(R.attr.vk_ui_avatar_overlay)));
                paint.setStyle(Paint.Style.FILL);
                return paint;
            default:
                return new abs0();
        }
    }
}
