package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.stories.design.view.editor.verticalization.VerticalizationLoadingView;
import com.vk.toggle.features.VideoFeatures;
import com.vk.whitelabelauth.di.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class chr0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ chr0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(new go70(VkOAuthService.ESIA, 1));
                } catch (Throwable unused) {
                }
                try {
                    arrayList.add(new go70(VkOAuthService.TINKOFF, 4));
                } catch (Throwable unused2) {
                }
                try {
                    arrayList.add(new go70(VkOAuthService.SBER, 1));
                } catch (Throwable unused3) {
                }
                try {
                    arrayList.add(new go70(VkOAuthService.ALFA, 1));
                } catch (Throwable unused4) {
                }
                try {
                    arrayList.add(new go70(VkOAuthService.VTB, 1));
                } catch (Throwable unused5) {
                }
                return arrayList;
            case 2:
                List<Integer> list = VerticalizationLoadingView.A;
                return new Handler(Looper.getMainLooper());
            case 3:
                return new j7t0(eiu0.a);
            case 4:
                VideoFeatures videoFeatures = VideoFeatures.STOP_VIDEO_IF_BACKGROUND;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 5:
                return s3q0.a;
            case 6:
                return (bof0) jfv0.q.getValue();
            case 7:
                return new zs20(R.dimen.music_vk_mix_interactive_height_small, R.dimen.music_vk_mix_interactive_play_margin_small, R.dimen.music_vk_mix_interactive_title_margin_small, R.dimen.music_vk_mix_interactive_title_margin_placeholder_small);
            case 8:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.j0();
            case 9:
                mqw0 mqw0Var = mqw0.a;
                return Boolean.TRUE;
            case 10:
                com.vk.voip.ui.c.b.getClass();
                v2x0 v2x0Var = com.vk.voip.ui.c.r0;
                return (v2x0Var != null ? v2x0Var : null).g.b;
            default:
                return new b.a.C2098a();
        }
    }
}
