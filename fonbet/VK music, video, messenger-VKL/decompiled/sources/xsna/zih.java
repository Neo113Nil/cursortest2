package xsna;

import android.view.View;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.lang.ref.WeakReference;

/* compiled from: CommunityProfileContentInfoItemCallback.kt */
/* loaded from: classes5.dex */
public interface zih {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(zih zihVar, CommunityProfileContentItem communityProfileContentItem, wfh wfhVar, WeakReference weakReference, int i) {
        if ((i & 4) != 0) {
            weakReference = null;
        }
        zihVar.f(communityProfileContentItem, wfhVar, weakReference, 0);
    }

    void b(CommunityProfileContentItem communityProfileContentItem);

    void c();

    void d(CommunityProfileContentItem communityProfileContentItem);

    void e(nu50 nu50Var);

    void f(CommunityProfileContentItem communityProfileContentItem, wfh wfhVar, WeakReference<View> weakReference, int i);

    void g();
}
