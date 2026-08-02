package xsna;

import android.content.Context;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import java.lang.ref.WeakReference;

/* compiled from: ClipsWrapperRouterImpl.kt */
/* loaded from: classes17.dex */
public final class ltf {
    public static final String h = i5s.a(new StringBuilder("https://"), a0a.d, "/app6363684#?act=clip&clip_id=");
    public final VkClientMultiAccountComponent a;
    public final ClipsInterestsComponent b;
    public final SearchStatsLoggingInfo c;
    public final ClipsEntryPointsComponent d;
    public final syk0 e;
    public final on f;
    public WeakReference<Context> g;

    public ltf(VkClientMultiAccountComponent vkClientMultiAccountComponent, ClipsInterestsComponent clipsInterestsComponent, SearchStatsLoggingInfo searchStatsLoggingInfo, ClipsEntryPointsComponent clipsEntryPointsComponent, syk0 syk0Var, on onVar) {
        this.a = vkClientMultiAccountComponent;
        this.b = clipsInterestsComponent;
        this.c = searchStatsLoggingInfo;
        this.d = clipsEntryPointsComponent;
        this.e = syk0Var;
        this.f = onVar;
    }

    public final Context a() {
        WeakReference<Context> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
