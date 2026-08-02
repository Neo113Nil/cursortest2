package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiscoverMediaIdProvider.kt */
/* loaded from: classes4.dex */
public final class m3n {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new pr6(10));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static DiscoverId a() {
        return (DiscoverId) a.getValue();
    }

    public static String b() {
        return y8g0.e(R.string.newsfeed_for_you_stub);
    }
}
