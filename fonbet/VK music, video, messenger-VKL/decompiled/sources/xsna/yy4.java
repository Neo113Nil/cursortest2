package xsna;

import android.media.AudioDeviceInfo;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import com.ironsource.C4405kb;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import com.vk.voip.ui.menu.ui.actions.a;
import com.vkontakte.android.R;
import java.util.UUID;
import org.webrtc.IceCandidateErrorEvent;
import ru.ok.android.webrtc.PeerConnectionClient;
import xsna.h8z0;
import xsna.ko40;
import xsna.plj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class yy4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yy4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wl4 wl4Var;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator withEndAction;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AudioTrackAudioOutput.b bVar = (AudioTrackAudioOutput.b) obj2;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (bVar.d != null && (wl4Var = androidx.media3.exoplayer.audio.c.this.h) != null && !audioDeviceInfo.equals(wl4Var.h)) {
                    wl4Var.h = audioDeviceInfo;
                    wl4Var.a(vl4.c(wl4Var.a, wl4Var.i, audioDeviceInfo));
                    break;
                }
                break;
            case 1:
                eq9.a(((UUID) obj).toString(), (dwx0) obj2);
                break;
            case 2:
                LevelPlayNativeAd.a((LevelPlayNativeAd) obj2, (AdInfo) obj);
                break;
            case 3:
                com.vk.photo.editor.features.mlenhance.c cVar = (com.vk.photo.editor.features.mlenhance.c) obj2;
                v3p v3pVar = cVar.c;
                v3pVar.c(true);
                v3pVar.u().a((o3p) obj);
                cVar.q = false;
                break;
            case 4:
                cw30 cw30Var = (cw30) obj2;
                x3r x3rVar = (x3r) obj;
                boolean z = cw30Var.d;
                View view = cw30Var.b;
                if (z) {
                    x3rVar.invoke();
                }
                view.setAlpha(1.0f);
                view.setVisibility(4);
                cw30Var.d = false;
                rvv.f.remove(cw30Var);
                break;
            case 5:
                ko40.a aVar = (ko40.a) obj2;
                ko40 ko40Var = (ko40) obj;
                int i2 = aVar.b;
                jo40 jo40Var = new jo40(ko40Var, i2 + 1 != ko40Var.p.size() ? i2 + 1 : 0, aVar);
                ko40 ko40Var2 = aVar.f;
                VideoTextureView videoTextureView = ko40Var2.m;
                if (videoTextureView != null) {
                    videoTextureView.setAlpha(1.0f);
                }
                VideoTextureView videoTextureView2 = ko40Var2.m;
                if (videoTextureView2 != null && (animate = videoTextureView2.animate()) != null && (alpha = animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null && (duration = alpha.setDuration(1500L)) != null && (withEndAction = duration.withEndAction(new ef2(jo40Var, 15))) != null) {
                    withEndAction.start();
                    break;
                }
                break;
            case 6:
                ((PeerConnectionClient) obj2).b((IceCandidateErrorEvent) obj);
                break;
            case 7:
                f7c0 f7c0Var = (f7c0) obj2;
                String str = (String) obj;
                VkOnboardingHighlighter vkOnboardingHighlighter = f7c0Var.p;
                TextView textView = f7c0Var.o;
                VkOnboardingHighlighter.e(vkOnboardingHighlighter, false, null, false, null, 12);
                if (dhr0.M()) {
                    dhr0.a.getClass();
                    textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, dhr0.y()));
                }
                textView.setText(str);
                break;
            case 8:
                float f = PrimaryActionsView.t;
                bwt0.j(((a.InterfaceC2066a.b) ((a.InterfaceC2066a) obj2)).a, new rj60((PrimaryActionsView) obj, 13));
                break;
            case 9:
                SdkProperties.lambda$notifyInitializationFailed$2((IUnityAdsInitializationListener) obj2, (String) obj);
                break;
            case 10:
                ((plj0.b) obj2).c.accept((erx0) obj);
                break;
            case 11:
                h8z0.h((b6z0) obj2, (h8z0.b) obj);
                break;
            default:
                C4405kb.a((C4405kb) obj2, (LevelPlayAdInfo) obj);
                break;
        }
    }
}
