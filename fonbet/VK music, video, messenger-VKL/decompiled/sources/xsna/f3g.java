package xsna;

import android.content.Context;
import com.vk.community.design.view.skeleton.community.header.CommunityLiveHeaderSkeleton;
import com.vk.community.design.view.skeleton.community.post.CommunityContentSkeleton;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.metrics.eventtracking.Event;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ f3g(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new j1g(context);
            case 1:
                int i2 = CommunityContentSkeleton.y;
                ThemableShimmer.a aVar = new ThemableShimmer.a(context);
                ThemableShimmer themableShimmer = aVar.a;
                themableShimmer.i = R.attr.vk_ui_background_content;
                themableShimmer.j = Float.POSITIVE_INFINITY;
                ThemableShimmer.a.d(aVar);
                return aVar.a();
            case 2:
                int i3 = CommunityLiveHeaderSkeleton.v;
                ThemableShimmer.a aVar2 = new ThemableShimmer.a(context);
                ThemableShimmer themableShimmer2 = aVar2.a;
                themableShimmer2.i = R.attr.vk_ui_skeleton_from;
                themableShimmer2.j = Float.POSITIVE_INFINITY;
                ThemableShimmer.a.d(aVar2);
                return aVar2.a();
            default:
                NativeLibLoader nativeLibLoader = NativeLibLoader.a;
                if (!NativeLibLoader.j(nativeLibLoader, NativeLib.SQLITE)) {
                    return null;
                }
                NativeLib nativeLib = NativeLib.SQLITE_OBSERVER;
                boolean j = NativeLibLoader.j(nativeLibLoader, nativeLib);
                if (j) {
                    com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a aVar3 = new Event.a();
                    aVar3.f();
                    aVar3.g(nativeLib.k());
                    aVar3.b("enabled", 1);
                    aVar3.c("screen_info", "ModelsStorage");
                    bVar.k(aVar3.e());
                }
                return new x330(context, j);
        }
    }
}
