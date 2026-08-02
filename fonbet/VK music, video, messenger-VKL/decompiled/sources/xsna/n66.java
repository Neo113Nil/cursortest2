package xsna;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.profile.user.impl.di.UserProfileParamsComponentImpl;
import com.vk.protect.di.ProtectAppComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.toggle.internal.ToggleManager;
import com.vk.trustedhash.di.TrustedHashComponent;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n66 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n66(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        n460 n460Var;
        s73 s73Var;
        boolean z;
        switch (this.b) {
            case 0:
                return ((TrustedHashComponent) ((p66) this.c).k0().a(fpf0.a(TrustedHashComponent.class))).c();
            case 1:
                ?? r0 = this.c;
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((DonutVideoComponent) r0.getValue()).J();
            case 2:
                return new en30(((j7b) this.c).a);
            case 3:
                return new UserProfileParamsComponentImpl.a((Application) this.c);
            case 4:
                return (p9w) this.c;
            case 5:
                return (VideoPip2Component) ((gxw) this.c).c().a(fpf0.a(VideoPip2Component.class));
            case 6:
                return ((InfoBridgeComponent) ((ProtectAppComponentImpl) this.c).b.getValue()).t().b();
            case 7:
                ToggleManager.b bVar = ((d0r0) this.c).a.j;
                return (bVar != null ? bVar : null).f.invoke();
            case 8:
                return new wj((l7r0) this.c);
            case 9:
                VKApplication vKApplication = (VKApplication) this.c;
                VKApplication.a aVar = VKApplication.c;
                hjv hjvVar = hjv.a;
                hjvVar.getClass();
                t260 t260Var = hjv.g;
                if (t260Var != null && (n460Var = hjv.c) != null && (s73Var = hjv.h) != null && t260Var.j.a) {
                    new dky(vKApplication, (m7y0) hjv.f.getValue(), n460Var, s73Var, t260Var, new ejv(0, hjvVar, hjv.class, "getCurrentXScreen", "getCurrentXScreen()Ljava/lang/String;", 0)).a();
                }
                return s3q0.a;
            case 10:
                if (((qks0) this.c).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_LIVE_UPCOMING_NOTIFY;
                    videoFeatures.getClass();
                    z = com.vk.toggle.b.A.a(videoFeatures);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                return LayoutInflater.from(((rot0) this.c).a).inflate(R.layout.clips_upload_ready_snackbar, (ViewGroup) null);
            default:
                return new osw(((VoipCallComponentImpl) this.c).a.a);
        }
    }
}
