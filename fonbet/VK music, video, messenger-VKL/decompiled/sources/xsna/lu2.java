package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vk.ads.di.NewsfeedOptionalAdsComponentImpl;
import com.vk.audience.impl.di.AudienceResearchComponentImpl;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.friends.recommendations.impl.di.FriendsRecommendationsComponentImpl;
import com.vk.im.converters.ImJpegConverter;
import com.vk.libvideo.impl.di.AutoPlayDelegateComponentImpl;
import com.vk.music.player.ads.impl.di.PlayerAdsComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.util.concurrent.ExecutorService;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.i0t0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class lu2 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lu2(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ru2();
            case 1:
                Context context = e43.a;
                if (context != null) {
                    return context;
                }
                return null;
            case 2:
                return Boolean.valueOf(MusicFeatures.AUDIO_BOOK_CHAPTER_DOWNLOAD.h());
            case 3:
                qcy<Object>[] qcyVarArr = AutoPlayDelegateComponentImpl.b;
                return new b2f();
            case 4:
                return new ClipsFavoritesComponentImpl.a();
            case 5:
                return yjg.a;
            case 6:
                return new Handler(Looper.getMainLooper());
            case 7:
                return new Regex("(\\{\"key\":)<HIDE>(,\"value\":\"[^\"]*\")", RegexOption.IGNORE_CASE);
            case 8:
                return new ImJpegConverter();
            case 9:
                return new PlayerAdsComponentImpl.a();
            case 10:
                return new com.vk.toggle.a();
            case 11:
                FeedFeatures feedFeatures = FeedFeatures.DS_COAUTHOR_HEADER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_FREE_SUB_BANNER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return i0t0.a.a();
            case 14:
                return Boolean.valueOf(fxc0.B().J().s1());
            case 15:
                return new NewsfeedOptionalAdsComponentImpl.a();
            case 16:
                return new FriendsRecommendationsComponentImpl.a();
            case 17:
                return new AudienceResearchComponentImpl.a();
            default:
                asu0.a.getClass();
                ExecutorService n = asu0.n();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(n, true);
        }
    }
}
