package xsna;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.design.demo.di.DesignDemoComponentImpl;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.im.ui.di.DialogDraftUpdaterStubComponent;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.community.newsfeed.impl.di.CommunityNewsfeedComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.regex.Pattern;
import kotlin.collections.builders.MapBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class pr1 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pr1(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        CatalogDataType catalogDataType = null;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return new i1t0(true, bo.h());
            case 3:
                return new kl7();
            case 4:
                return new abl0();
            case 5:
                return new lu();
            case 6:
                return new x0p();
            case 7:
                qcy<Object>[] qcyVarArr = ClipsInterestsComponentImpl.o;
                return new ix3(new ngj0());
            case 8:
                return new xre();
            case 9:
                String str = ClipsUploadFragmentImpl.a0;
                return new p180(null);
            case 10:
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put(new sif0(CatalogViewType.GRID, catalogDataType, null == true ? 1 : 0, 6), 8);
                return mapBuilder.h();
            case 11:
                qcy<Object>[] qcyVarArr2 = CommunityNewsfeedComponentImpl.d;
                return new b5i();
            case 12:
                return new Handler(Looper.getMainLooper());
            case 13:
                return s3q0.a;
            case 14:
                int i = k7k.c.b;
                return new e520(i, R.drawable.vk_icon_logo_clips_outline_28, R.string.video_create_clip_from_video, i, false, 0, 0, false, null, 0, null, false, 8176);
            case 15:
                return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 16:
                qcy<Object>[] qcyVarArr3 = DesignDemoComponentImpl.c;
                return new t3m();
            case 17:
                qcy<Object>[] qcyVarArr4 = DialogDraftUpdaterStubComponent.b;
                return new fdm();
            case 18:
                qcy<Object>[] qcyVarArr5 = DiscoverSimilarFeedFragment.s0;
                return new y3v();
            case 19:
                return new StringBuilder();
            case 20:
                return Integer.valueOf((int) Math.floor(11 * Resources.getSystem().getDisplayMetrics().density));
            case 21:
                FeedFeatures feedFeatures = FeedFeatures.FEED_REMOVE_CUSTOM_REACTIONS;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 22:
                int i2 = FriendsRecommendationsFragment.b0;
                return new zi50();
            case 23:
                return new h1r0(new ikw());
            case 24:
                return new DecelerateInterpolator(1.25f);
            case 25:
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_PHONE_BOOK_STORIES;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 26:
                return s3q0.a;
            case 27:
                return Pattern.compile("'''\\[(\\S+?)\\|(.+?)]'''");
            case 28:
                return s3q0.a;
            default:
                return Boolean.valueOf(com.vk.toggle.d.M());
        }
    }
}
