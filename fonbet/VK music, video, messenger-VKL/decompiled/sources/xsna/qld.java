package xsna;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.clips.models.VideoUrlPack;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.edit.impl.preview.source.VideoSourceCreatingException;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.video.gl.ScalablePlainGLScene;
import one.video.player.OneVideoPlayer;
import xsna.x4d0;

/* compiled from: ClipsChoosePreviewImpl.kt */
/* loaded from: classes17.dex */
public final class qld implements mld {
    public final gy a;
    public final cmd b;
    public final zld c;

    public qld(pld pldVar, ClipsChoosePreviewParams clipsChoosePreviewParams, lpj lpjVar, mef mefVar, gy gyVar) {
        this.a = gyVar;
        cmd cmdVar = new cmd(lpjVar);
        this.b = cmdVar;
        Timeline timeline = clipsChoosePreviewParams.i;
        zld zldVar = new zld(pldVar, lpjVar, clipsChoosePreviewParams, cmdVar, timeline == null ? new x4d0.b(clipsChoosePreviewParams.b, null) : new x4d0.a(timeline, clipsChoosePreviewParams.j), mefVar, new ie8(1, this, qld.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close(Lcom/vk/clips/upload/edit/api/preview/ClipsChoosePreviewResult;)V", 0, 3));
        cmdVar.U4(zldVar);
        cmdVar.setScheduler(mefVar.a().e().b());
        this.c = zldVar;
    }

    @Override // xsna.mld
    public final void a0() {
        this.c.a();
    }

    @Override // xsna.mld
    public final View getView() {
        return this.b;
    }

    @Override // xsna.mld
    public final void onCreate() {
        zld zldVar = this.c;
        cmd cmdVar = zldVar.d;
        mef mefVar = zldVar.f;
        zldVar.d();
        zldVar.l = false;
        x4d0 x4d0Var = zldVar.e;
        if (x4d0Var instanceof x4d0.a) {
            x4d0.a aVar = (x4d0.a) x4d0Var;
            hg1.b(cmdVar, new io.reactivex.rxjava3.internal.operators.single.v(new u15(1, zldVar, aVar)).q(mefVar.a().e().b()).m(mefVar.a().e().d()).subscribe(new jz(new a5(4, zldVar, aVar), 14), new ir0(new com.vk.movika.sdk.base.observable.p(zldVar, 25), 5)));
            return;
        }
        if (!(x4d0Var instanceof x4d0.b)) {
            throw new NoWhenBranchMatchedException();
        }
        x4d0.b bVar = (x4d0.b) x4d0Var;
        lpj lpjVar = zldVar.b;
        int i = wn80.a;
        rhh0 rhh0Var = new rhh0(8);
        xgp0 xgp0Var = xgp0.j;
        boolean z = wn80.e;
        r8l r8lVar = new r8l(false, false, 7);
        o3i0 o3i0Var = new o3i0(0L, 0L);
        psm0 psm0Var = new psm0(0);
        String str = bVar.b;
        if (str == null) {
            str = null;
        }
        xk80 xk80Var = new xk80(lpjVar.getApplicationContext(), null, null, str, null, true, rhh0Var, xgp0Var, z, r8lVar, 2000L, null, null, false, o3i0Var, psm0Var);
        ScalablePlainGLScene scalablePlainGLScene = new ScalablePlainGLScene();
        ScalablePlainGLScene.e(scalablePlainGLScene, ScalablePlainGLScene.ScaleType.CROP);
        xk80Var.G(scalablePlainGLScene);
        xk80Var.d0(new yld(zldVar));
        VideoUrlPack videoUrlPack = bVar.a;
        String str2 = videoUrlPack.f;
        String str3 = videoUrlPack.e;
        String str4 = videoUrlPack.d;
        String str5 = videoUrlPack.c;
        String str6 = videoUrlPack.b;
        sht0 ftkVar = (!p8l.b.a() || TextUtils.isEmpty(str6)) ? !TextUtils.isEmpty(str5) ? new ftk(Uri.parse(str5)) : !TextUtils.isEmpty(str4) ? new f9v(Uri.parse(str4), null) : !TextUtils.isEmpty(str3) ? new x9v(Uri.parse(str3)) : !TextUtils.isEmpty(str2) ? new ag30(Uri.parse(str2)) : null : new ftk(Uri.parse(str6));
        if (ftkVar != null) {
            xk80Var.C(ftkVar, 0L);
        } else {
            mefVar.a().d().b(new VideoSourceCreatingException());
            Toast.makeText(lpjVar, R.string.vk_error, 0).show();
        }
        zldVar.p = xk80Var;
        cmdVar.c5(xk80Var, bVar);
    }

    @Override // xsna.mld
    public final void onDestroy() {
        zld zldVar = this.c;
        if (zldVar.e instanceof x4d0.a) {
            Iterator<T> it = zldVar.o.iterator();
            while (it.hasNext()) {
                ((uq10) it.next()).e();
            }
        }
        cv10 cv10Var = zldVar.h;
        if (cv10Var != null) {
            cv10Var.release();
        }
        zldVar.h = null;
        OneVideoPlayer oneVideoPlayer = zldVar.p;
        if (oneVideoPlayer != null) {
            oneVideoPlayer.release();
        }
        zldVar.d.release();
    }
}
