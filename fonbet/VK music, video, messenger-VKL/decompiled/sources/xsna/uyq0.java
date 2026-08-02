package xsna;

import android.widget.TextView;
import com.vk.auth.ui.fastlogin.VkConnectInfoHeader;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryRootVh;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.onboardingscreens.api.di.OnboardingScreensComponent;
import com.vk.onboardingscreens.impl.recomthemes.presentation.fragment.UserRecomThemesFragment;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import kotlin.Lazy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uyq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uyq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r0.i() == true) goto L24;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = UserRecomThemesFragment.U;
                return ((OnboardingScreensComponent) ((k7m) m7m.f((UserRecomThemesFragment) obj)).mo408a(fpf0.a(OnboardingScreensComponent.class))).Ye();
            case 1:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((b9s0) obj)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 2:
                ((VideoCatalogRootVh) obj).P.d();
                return s3q0.a;
            case 3:
                ((VideoCategoryRootVh) obj).t.d();
                return s3q0.a;
            case 4:
                com.vk.video.ui.discovery.minimizable.m mVar = ((VideoMinimizableDiscoveryFragment) obj).J0;
                if (mVar != null) {
                    z = true;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 5:
                ((jat0) obj).f.Ff("video_quality_new_settings");
                return s3q0.a;
            case 6:
                return (tcg0) ((Lazy) obj).getValue();
            case 7:
                ggu0 ggu0Var = (ggu0) obj;
                return (qxv0) ggu0Var.R.invoke(ggu0Var.q());
            case 8:
                int i3 = VkConnectInfoHeader.h;
                return (TextView) ((VkConnectInfoHeader) obj).findViewById(R.id.services_text_info);
            case 9:
                return new TextView(((VkGroupHeader.b) obj).b);
            case 10:
                return ((nmw0) obj).c.a();
            default:
                ((maj) obj).invoke();
                return s3q0.a;
        }
    }
}
