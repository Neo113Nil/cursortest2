package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.common.links.LaunchContext;
import kotlin.text.Regex;

/* compiled from: VideoAdFreeSubscriptionLauncherImpl.kt */
/* loaded from: classes.dex */
public final class xyr0 implements com.vk.libvideo.adfree.api.di.a {
    public final qdz a;

    public xyr0(qdz qdzVar) {
        this.a = qdzVar;
    }

    @Override // com.vk.libvideo.adfree.api.di.a
    public final void a(Context context, String str) {
        maz e = this.a.e();
        LaunchContext launchContext = LaunchContext.A;
        maz.c(e, context, str, LaunchContext.b.a(), null, null, 24);
    }

    @Override // com.vk.libvideo.adfree.api.di.a
    public final void b(Context context, String str) {
        String b;
        try {
            Uri g = jeq0.g(str);
            peq0 peq0Var = new peq0(g);
            if (peq0.p(peq0Var, new Regex("/(app[-0-9]+)(?:_([-0-9]+))?"), null, null, 14)) {
                b = peq0Var.a(1);
            } else if (!drm0.D(peq0Var.l(), "premium", true)) {
                return;
            } else {
                b = jeq0.b(peq0Var.h());
            }
            ver0.c(context, hg1.m(rsg0.y0(yfb.x(po40.s(ahn.c(), b, UtilsResolveScreenNameWithDataPlatformDto.ANDROID, null, null, str, null, 92)), null, null, 3), context, 0L, false, 62).subscribe(new fsq0(new n9(28, g, context), 2)));
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
    }
}
