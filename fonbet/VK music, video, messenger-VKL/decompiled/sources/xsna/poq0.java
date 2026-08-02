package xsna;

import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.toggle.data.VideoAdFreeSubscriptionFeatureConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class poq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ poq0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((UserProfileDialogs) this.c).a.a((UserProfileAction) this.d);
                break;
            default:
                hzr0 hzr0Var = (hzr0) this.c;
                VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger = (VideoAdFreeTrapEventTrigger) this.d;
                hzr0Var.d = false;
                if (!((List) hzr0Var.l.getValue()).contains(videoAdFreeTrapEventTrigger) && com.vk.toggle.d.t().i.contains(VideoAdFreeSubscriptionFeatureConfig.ButtonStrategy.WITH_POPUP)) {
                    long j = hzr0Var.f().getLong("pref_key_last_ad_free_button_show", 0L);
                    int i = com.vk.toggle.d.t().b;
                    if (hzr0Var.e(j, i < 0 ? TimeUnit.SECONDS.toMillis(Math.abs(i)) : TimeUnit.DAYS.toMillis(i))) {
                        hzr0Var.h(true);
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
