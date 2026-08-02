package xsna;

import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.navigation.NavigationDelegateActivity;

/* compiled from: MenuUtils.kt */
/* loaded from: classes3.dex */
public final class n820 extends aq80 {
    public final /* synthetic */ NavigationDelegateActivity c;
    public final /* synthetic */ Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n820(NavigationDelegateActivity navigationDelegateActivity, Uri uri) {
        super(navigationDelegateActivity);
        this.c = navigationDelegateActivity;
        this.d = uri;
    }

    @Override // xsna.yp80
    public final void U() {
        xwk.d().getBrowser().i(this.c, this.d, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863), null);
    }
}
