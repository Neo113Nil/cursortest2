package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.libvideo.autoplay.b;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import com.vkontakte.android.R;
import xsna.xa5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class na5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ na5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                myc0.h((yvj) obj4, null, null, new xa5.a((ka5) obj3, null, (bc90) obj, (mc90) obj2), 3);
                break;
            case 1:
                en8 en8Var = (en8) obj4;
                Activity activity = (Activity) obj3;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj2;
                VkInputSelect vkInputSelect = (VkInputSelect) obj;
                String valueOf = String.valueOf(vkInputSelect != null ? vkInputSelect.getText() : null);
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                d3b0 v0 = b.C1208b.a().e(k15.A(sdkVideoFile), null).v0();
                VideoTechBugreportData b = v0 != null ? w7o0.b(v0, VideoTechBugreportData.VideoType.CLIP) : null;
                if (b != null) {
                    en8Var.c.a(activity, b, valueOf, null);
                    cvk.u(R.string.clips_tech_bugreport_thanks, false);
                }
                break;
            case 2:
                e2b0 e2b0Var = (e2b0) obj4;
                String str = (String) obj3;
                PlaybackActionMeta playbackActionMeta = (PlaybackActionMeta) obj2;
                String str2 = (String) obj;
                if (e2b0.o0(e2b0Var.u) == PlayState.PLAYING && ("new".equals(str) || (playbackActionMeta.b == 35 && ("next".equals(str) || "prev".equals(str))))) {
                    e2b0Var.o.f(e2b0Var.v0(str, str2), null);
                    e2b0Var.h();
                }
                break;
            default:
                fwf0 fwf0Var = (fwf0) obj4;
                Activity activity2 = (Activity) obj3;
                ikd ikdVar = (ikd) obj2;
                nkd nkdVar = (nkd) obj;
                SdkVideoFile sdkVideoFile2 = ikdVar.a;
                if (sdkVideoFile2.o0() != 0) {
                    fxc0.B().g0(activity2, k15.A(sdkVideoFile2), ikdVar.d, new hn9(24, nkdVar, ikdVar), new l22(28, nkdVar, ikdVar));
                    ile ileVar = fwf0Var.b;
                    if (ileVar != null) {
                        ileVar.a(sdkVideoFile2);
                    }
                } else if (nkdVar != null) {
                    nkdVar.a(ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER, sdkVideoFile2);
                }
                break;
        }
        return s3q0.a;
    }
}
