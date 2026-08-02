package xsna;

import com.vk.dto.common.data.Subscription;
import java.util.Set;

/* compiled from: BuyMusicSubscriptionButtonModel.kt */
/* loaded from: classes3.dex */
public interface ys8 {
    public static final a a = a.a;

    /* compiled from: BuyMusicSubscriptionButtonModel.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Set<String> b = rl3.y0(new String[]{"subscription_3month_trial", "3m0325_vkmusic_rustore_trial_0", "3m0325_vkmusic_rustore_retrial_0"});
        public static final Set<String> c = rl3.y0(new String[]{"subscription3", "subscription3_no_trial", "vk_music_notrial", "subscription2", "subscription_3month_trial", "vk_music", "combo_android_trial", "combo_android_standard_1monthtrial", "combo_android_notrial"});
    }

    /* compiled from: BuyMusicSubscriptionButtonModel.kt */
    public interface b {
        void a();

        void b(Subscription subscription);

        void onError(int i);
    }

    Subscription a();

    void b(b bVar);

    void release();
}
