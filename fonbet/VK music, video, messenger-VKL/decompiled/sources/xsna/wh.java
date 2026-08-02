package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.companion.core.CompanionAppImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class wh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new File(((xh) this.c).b, "timeoutErrorOccurred");
            case 1:
                CompanionAppImpl companionAppImpl = (CompanionAppImpl) this.c;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(companionAppImpl.a);
                if (launchIntentForPackage != null) {
                    return launchIntentForPackage.getComponent();
                }
                return null;
            case 2:
                return ((ClipsConfigViewersComponent) ((gxw) this.c).c().a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 3:
                return ((rx70) ((ny70) this.c).b.getValue()).a();
            case 4:
                qks0 qks0Var = (qks0) this.c;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_DOWNLOAD_RESTRICTION_SPLITTING;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures) && qks0Var.a);
            case 5:
                return new kke(g620.f().a(), ((k6v0) this.c).a);
            default:
                return ((VoipCallComponentImpl) this.c).h.getValue();
        }
    }
}
