package xsna;

import android.graphics.Bitmap;
import android.util.Base64;
import android.view.View;
import com.ironsource.C4382j6;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonGenreCatalogRootVh;
import com.vk.core.fragments.FragmentImpl;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.masks.MasksController;
import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderDispatch;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameEncoderImpl;
import ru.ok.gl.tf.Tensorflow;
import xsna.fx10;
import xsna.skm0;
import xsna.wy2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class cs2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cs2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View selectedCellView;
        switch (this.b) {
            case 0:
                AnimojiRenderDispatch.a((AnimojiRenderDispatch) this.c);
                return;
            case 1:
                AudioBookPersonGenreCatalogRootVh audioBookPersonGenreCatalogRootVh = (AudioBookPersonGenreCatalogRootVh) this.c;
                g3a.a(audioBookPersonGenreCatalogRootVh.p, audioBookPersonGenreCatalogRootVh);
                return;
            case 2:
                VkCheckEditText vkCheckEditText = ((a37) this.c).t;
                if (vkCheckEditText == null || (selectedCellView = vkCheckEditText.getSelectedCellView()) == null) {
                    return;
                }
                t65.a(selectedCellView);
                return;
            case 3:
                lj8 lj8Var = (lj8) this.c;
                lj8Var.e.setVisibility(0);
                f4m.j(lj8Var.d);
                f4m.j(lj8Var.i);
                f4m.j(lj8Var.f);
                return;
            case 4:
                ((gg9) this.c).a();
                return;
            case 5:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) this.c;
                ClipsDraftPersistentStore.b.getClass();
                ClipsDraftPersistentStore.f(clipsDraftVk, false);
                return;
            case 6:
                String str = (String) this.c;
                vx2.a.getClass();
                wy2 b = vx2.b();
                l6r0 value = b.a.C.getValue();
                String token = value != null ? value.getToken() : null;
                if (token != null) {
                    wy2.a aVar = b.n;
                    synchronized (aVar) {
                        Mac mac = Mac.getInstance("HmacSHA256");
                        Charset charset = emb.b;
                        mac.init(new SecretKeySpec(str.getBytes(charset), "HmacSHA256"));
                        aVar.b = Base64.encodeToString(mac.doFinal(token.getBytes(charset)), 0);
                        aVar.a = true;
                    }
                    return;
                }
                return;
            case 7:
                com.vk.im.ui.components.viewcontrollers.dialog_header.info.b bVar = (com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) this.c;
                bVar.N.m = false;
                bVar.D();
                return;
            case 8:
                kd kdVar = (kd) this.c;
                qcy<Object>[] qcyVarArr = FragmentImpl.M;
                kdVar.invoke();
                return;
            case 9:
                ((FrameEncoderImpl) this.c).a();
                return;
            case 10:
                ((n3w) this.c).r.g("destroyAndAwait", true).await();
                return;
            case 11:
                ((kg00) this.c).a.b();
                return;
            case 12:
                ((MasksController) this.c).j();
                return;
            case 13:
                ((fx10.f) this.c).b();
                return;
            case 14:
                ((androidx.media3.transformer.y) this.c).i(Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888));
                return;
            case 15:
                ((e1j0) this.c).b();
                return;
            case 16:
                bwt0.p0((View) this.c, true);
                return;
            case 17:
                ((skm0.a) this.c).i();
                return;
            case 18:
                ((Tensorflow) this.c).handleRelease();
                return;
            case 19:
                ((lb6) this.c).invoke();
                return;
            case 20:
                VideoFullscreenBottomBarView fullscreenBottomBar = ((VideoView) this.c).getFullscreenBottomBar();
                if (fullscreenBottomBar != null) {
                    fullscreenBottomBar.setVisibility(4);
                    return;
                }
                return;
            case 21:
                ((ru.mail.libverify.b0.a) this.c).b();
                return;
            default:
                C4382j6.f((C4382j6) this.c);
                return;
        }
    }
}
