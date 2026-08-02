package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;

/* compiled from: CommunityCatchUpBannerController.kt */
/* loaded from: classes5.dex */
public final class jtg {
    public final CommunityProfileFragment a;
    public final CatchUpBanner b;
    public ikv0 c;
    public final qap d = new qap();
    public final Handler e = new Handler(Looper.getMainLooper());
    public boolean f = true;
    public final ijr0 g;
    public final p69 h;

    public jtg(CommunityProfileFragment communityProfileFragment, CatchUpBanner catchUpBanner, eja ejaVar) {
        this.a = communityProfileFragment;
        this.b = catchUpBanner;
        ijr0 ijr0Var = new ijr0(1, 2, 3);
        ijr0Var.e = new m4g(this, 2);
        ijr0Var.a(3, true);
        ijr0Var.a(4, true);
        this.g = ijr0Var;
        this.h = new p69(this, 4);
    }
}
