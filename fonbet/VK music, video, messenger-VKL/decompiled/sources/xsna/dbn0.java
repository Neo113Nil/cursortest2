package xsna;

import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.navigation.NavigationDelegateActivity;

/* compiled from: SuperAppRouterImpl.kt */
/* loaded from: classes6.dex */
public final class dbn0 extends aq80 {
    public final /* synthetic */ NavigationDelegateActivity c;
    public final /* synthetic */ Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbn0(NavigationDelegateActivity navigationDelegateActivity, Uri uri) {
        super(navigationDelegateActivity);
        this.c = navigationDelegateActivity;
        this.d = uri;
    }

    @Override // xsna.yp80
    public final void U() {
        xwk.d().getBrowser().i(this.c, this.d, LaunchContext.A, null);
    }
}
