package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vfo0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vfo0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                kw8 kw8Var = (kw8) obj;
                break;
            case 1:
                u8r0 u8r0Var = (u8r0) this.c;
                WebAction webAction = (WebAction) this.d;
                eag0 eag0Var = (eag0) obj;
                p8r0 p8r0Var = u8r0Var.a;
                WebApiApplication webApiApplication = eag0Var.a;
                String str = ((WebActionOpenVkApp) webAction).e;
                if (str == null) {
                    str = eag0Var.b.a;
                }
                p8r0Var.h(webApiApplication, str);
                break;
            case 2:
                ((sbs0) this.c).a((View) this.d);
                break;
            case 3:
                VideoItemAutoPlayVh videoItemAutoPlayVh = (VideoItemAutoPlayVh) this.c;
                UIBlockVideo uIBlockVideo = (UIBlockVideo) this.d;
                fh5 fh5Var = (fh5) obj;
                fg1 fg1Var = videoItemAutoPlayVh.A;
                if (fg1Var != null) {
                    fg1Var.invoke();
                }
                videoItemAutoPlayVh.A = null;
                yg5 yg5Var = fh5Var.j;
                (yg5Var != null ? yg5Var : null).f0(videoItemAutoPlayVh.B);
                videoItemAutoPlayVh.A = new fg1(29, fh5Var, videoItemAutoPlayVh);
                videoItemAutoPlayVh.e(fh5Var, uIBlockVideo);
                break;
            default:
                k4v0 k4v0Var = (k4v0) this.c;
                MusicBaseVkMixInteractiveVh.b bVar = (MusicBaseVkMixInteractiveVh.b) this.d;
                aud audVar = k4v0Var.b;
                UIBlockActionOpenUrl uIBlockActionOpenUrl = audVar.c().size() > 1 ? (UIBlockActionOpenUrl) audVar.c().get(1) : null;
                if (uIBlockActionOpenUrl != null) {
                    bVar.invoke(uIBlockActionOpenUrl);
                }
                break;
        }
        return s3q0.a;
    }
}
