package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.ironsource.adapters.fyber.rewarded.FyberRewardedAdapter;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import xsna.ol6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nl6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nl6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                j1e0 j1e0Var = (j1e0) this.c;
                ol6.a aVar = (ol6.a) this.d;
                WeakReference<ol6> weakReference = aVar.f;
                if (!j1e0Var.getCurrentList().isEmpty()) {
                    ol6 ol6Var = weakReference.get();
                    if (ol6Var != null) {
                        ol6Var.f7(aVar.b);
                        break;
                    }
                } else {
                    ol6 ol6Var2 = weakReference.get();
                    if (ol6Var2 != null) {
                        ol6Var2.e7();
                        break;
                    }
                }
                break;
            case 1:
                ((re9) this.c).m((ArrayList) this.d);
                break;
            case 2:
                hrl hrlVar = (hrl) this.c;
                hrlVar.e((ClipsInterestsViewState.d) this.d);
                hrlVar.c(new com.vk.movika.sdk.base.logic.processor.actions.i(hrlVar, 28));
                break;
            case 3:
                FyberRewardedAdapter.showAd$lambda$3((FyberRewardedAdapter) this.c, (Activity) this.d);
                break;
            case 4:
                ((s450) this.c).a.k((String) this.d);
                break;
            case 5:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) this.c;
                int addAudioStream = bVar.i.addAudioStream(-1L, -1L, false, 0.65f, new File(new File((File) this.d, "video"), "0.mp4").getAbsolutePath(), true);
                bVar.A = addAudioStream;
                ExtraAudioSupplier extraAudioSupplier = bVar.i;
                extraAudioSupplier.seek(addAudioStream, 0L);
                extraAudioSupplier.setHeadsetCallback(bVar.E);
                break;
            case 6:
                VKCaptchaActivity vKCaptchaActivity = (VKCaptchaActivity) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                ImageView imageView = vKCaptchaActivity.c;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setImageBitmap(bitmap);
                ProgressBar progressBar = vKCaptchaActivity.d;
                (progressBar != null ? progressBar : null).setVisibility(8);
                break;
            default:
                yads.tl2.a((yads.tl2) this.c, (yads.md1) this.d);
                break;
        }
    }
}
