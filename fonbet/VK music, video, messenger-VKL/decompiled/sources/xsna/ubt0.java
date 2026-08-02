package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.auth.ui.consent.VkConsentView;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.superapp.bridges.dto.analytics.MiniAppPolicyScreenEventType;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.i;
import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vk.voip.ui.qr.ui.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.g69;
import xsna.jew0;
import xsna.xuw0;
import xsna.yau0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ubt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ubt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.video.ui.discovery.minimizable.dialog.related_videos.d) obj2).j.b(new i.d((VideoAlbum) obj));
                return s3q0.a;
            case 1:
                VideoToolbarView videoToolbarView = (VideoToolbarView) obj2;
                int i2 = VideoToolbarView.M;
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                boolean z = !com.vk.libvideo.autoplay.e.a();
                ebs0 ebs0Var = videoToolbarView.t;
                if (ebs0Var != null) {
                    ebs0Var.bk(new d4s0(z));
                }
                videoToolbarView.c(z);
                return s3q0.a;
            case 2:
                yau0 yau0Var = (yau0) obj2;
                com.vk.auth.ui.consent.g gVar = (com.vk.auth.ui.consent.g) obj;
                yau0.c cVar = yau0Var.g;
                Context context = yau0Var.e;
                View inflate = e3m.b(context).inflate(R.layout.vk_apps_vk_connect_scopes, (ViewGroup) null);
                VkConsentView vkConsentView = (VkConsentView) inflate.findViewById(R.id.vk_apps_vkc_consent_view);
                wdx0 wdx0Var = e370.f;
                if (wdx0Var == null) {
                    wdx0Var = null;
                }
                vkConsentView.setAvatarUrl(wdx0Var.e());
                vkConsentView.setConsentData(gVar);
                izs<String, String> izsVar = gVar.d;
                izs<String, String> izsVar2 = gVar.e;
                cVar.b = izsVar;
                cVar.c = izsVar2;
                vkConsentView.setLegalInfoOpenerDelegate(cVar);
                VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) inflate.findViewById(R.id.vk_apps_vkc_toolbar);
                r55 r55Var = r55.a;
                vkAuthToolbar.setPicture(r55.i().b(context));
                dw20.b bVar = new dw20.b(context, null);
                cbq.a(bVar);
                bVar.D0(inflate, false).u(0).x(0).F0(true).m(R.attr.vk_ui_background_content).c(new d5j(inflate)).I0("vkMiniAppsScopes");
                tau0 d = yau0Var.b.d();
                if (d != null) {
                    d.g("mini_app_vk_connect_launch_screen_view_permissions", MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_PERMISSIONS);
                }
                return s3q0.a;
            case 3:
                ((lcw0) obj2).c.invoke();
                return s3q0.a;
            case 4:
                kew0 kew0Var = (kew0) obj2;
                jew0 jew0Var = (jew0) obj;
                if (jew0Var instanceof jew0.b) {
                    io.reactivex.rxjava3.disposables.c cVar2 = kew0Var.b;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                } else {
                    if (!(jew0Var instanceof jew0.a)) {
                        kew0Var.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    io.reactivex.rxjava3.disposables.c cVar3 = kew0Var.b;
                    if (cVar3 != null) {
                        cVar3.dispose();
                    }
                    io.reactivex.rxjava3.disposables.c cVar4 = kew0Var.c;
                    if (cVar4 != null) {
                        cVar4.dispose();
                    }
                }
                return s3q0.a;
            case 5:
                ((zhw0) obj2).T((giw0) obj);
                return s3q0.a;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AppCompatImageView appCompatImageView = ((rdh0) obj2).e;
                appCompatImageView.setImageResource(booleanValue ? R.drawable.vk_icon_sound_wave_outline_28 : R.drawable.vk_icon_sound_wave_slash_outline_28);
                appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(booleanValue ? R.string.voip_audio_share_disable_accessibility : R.string.voip_audio_share_enable_accessibility));
                return s3q0.a;
            case 7:
                return ((qmw0) ((nmw0) obj2).h.getValue()).a(((Long) obj).longValue());
            case 8:
                nrw0 nrw0Var = (nrw0) obj2;
                FeatureId featureId = FeatureId.WATCH_TOGETHER;
                h69 h69Var = nrw0Var.M;
                if (h69Var != null) {
                    h69Var.d.onNext(new g69.e(featureId));
                }
                nrw0Var.K.c(MainMenuBroadcastFeature.Option.WATCH_TOGETHER);
                return s3q0.a;
            case 9:
                puw0 puw0Var = (puw0) obj2;
                CallsGetHistoryResponseDto callsGetHistoryResponseDto = (CallsGetHistoryResponseDto) obj;
                puw0Var.o.getClass();
                ArrayList a = qp90.a(callsGetHistoryResponseDto);
                xx1 xx1Var = puw0Var.n;
                List<UsersUserFullDto> j = callsGetHistoryResponseDto.j();
                xx1Var.getClass();
                LinkedHashMap n = xx1.n(j);
                LinkedHashMap l = xx1.l(callsGetHistoryResponseDto.e());
                LinkedHashMap i3 = xx1.i(callsGetHistoryResponseDto.d());
                Long i4 = callsGetHistoryResponseDto.i();
                return new xuw0.a(a, n, l, i3, i4 != null ? i4.longValue() : 0L, callsGetHistoryResponseDto.f());
            case 10:
                int i5 = VoipQrCodeScannerFragment.W;
                ((VoipQrCodeScannerFragment) obj2).fo((a.f) obj);
                return s3q0.a;
            default:
                return new lyw0((ViewGroup) obj, (qxw0) obj2);
        }
    }
}
