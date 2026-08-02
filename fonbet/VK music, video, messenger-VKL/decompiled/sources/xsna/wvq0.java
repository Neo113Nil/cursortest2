package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.hint.a;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.c8x0;
import xsna.gy50;
import xsna.qr60;
import xsna.yau0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wvq0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wvq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                zvq0 zvq0Var = (zvq0) this.c;
                zvq0Var.e(new awq0(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                zvq0Var.t();
                break;
            case 1:
                ((yyq0) this.c).invoke(obj);
                break;
            case 2:
                ((u2k0) this.c).invoke(obj);
                break;
            case 3:
                ((u2k0) this.c).invoke(obj);
                break;
            case 4:
                ((vqp) this.c).invoke(obj);
                break;
            case 5:
                ((pod0) this.c).invoke(obj);
                break;
            case 6:
                ((com.vk.video.ui.discovery.minimizable.dialog.related_videos.c) this.c).invoke(obj);
                break;
            case 7:
                ((u2k0) this.c).invoke(obj);
                break;
            case 8:
                ((yau0.a) this.c).invoke(obj);
                break;
            case 9:
                ((u2k0) this.c).invoke(obj);
                break;
            case 10:
                ((u2k0) this.c).invoke(obj);
                break;
            case 11:
                ((gfv0) this.c).invoke(obj);
                break;
            case 12:
                mjw0 mjw0Var = (mjw0) this.c;
                f69 f69Var = mjw0Var.S0;
                com.vk.voip.ui.hint.a aVar = mjw0Var.W;
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                VoipViewModelState voipViewModelState = com.vk.voip.ui.c.K0;
                VoipViewModelState voipViewModelState2 = VoipViewModelState.InCall;
                if (voipViewModelState == voipViewModelState2 && com.vk.voip.ui.c.J0 == voipViewModelState2) {
                    mjw0Var.setControlsAreHidden(false);
                }
                if (!(obj instanceof chw0)) {
                    if (!(obj instanceof wgw0) && !(obj instanceof qlk)) {
                        if (!(obj instanceof ll20)) {
                            if (!(obj instanceof uh9)) {
                                if (!(obj instanceof plk)) {
                                    if (!(obj instanceof rjj0)) {
                                        if (!(obj instanceof l4u0)) {
                                            if (!(obj instanceof k4u0)) {
                                                if (!(obj instanceof nij0)) {
                                                    if (!(obj instanceof ah10)) {
                                                        if (!(obj instanceof zg10)) {
                                                            if (!(obj instanceof fr80)) {
                                                                if (!(obj instanceof c8x0.f)) {
                                                                    mjw0Var.s();
                                                                    break;
                                                                } else {
                                                                    mjw0Var.I.c((c8x0.f) obj);
                                                                    break;
                                                                }
                                                            } else {
                                                                f69Var.a(new gy50.e(((fr80) obj).a));
                                                                break;
                                                            }
                                                        } else {
                                                            aVar.g(R.string.voip_mask_ml_model_is_loading);
                                                            break;
                                                        }
                                                    } else {
                                                        aVar.getClass();
                                                        aVar.h(R.string.voip_enable_your_camera_to_choose_mask_message, new jnr0(cVar, 1));
                                                        break;
                                                    }
                                                } else {
                                                    f69Var.a(gy50.k.a);
                                                    break;
                                                }
                                            } else {
                                                aVar.g(R.string.voip_virtual_background_ml_model_is_loading);
                                                break;
                                            }
                                        } else {
                                            aVar.getClass();
                                            aVar.h(R.string.voip_enable_your_camera_to_choose_virtual_background_message, new w550(cVar, 3));
                                            break;
                                        }
                                    } else {
                                        f69Var.a(gy50.m.a);
                                        break;
                                    }
                                } else {
                                    VoipHintView voipHintView = aVar.a;
                                    long currentTimeMillis = System.currentTimeMillis();
                                    if (currentTimeMillis - aVar.j >= UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                                        a.EnumC2056a enumC2056a = a.EnumC2056a.CurrentUserBadConnection;
                                        if (enumC2056a.h() >= aVar.a()) {
                                            VoipFeatures voipFeatures = VoipFeatures.BAD_NETWORK_INDICATOR;
                                            voipFeatures.getClass();
                                            voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(com.vk.toggle.b.A.a(voipFeatures) ? R.string.voip_call_network_status_me_unstable : R.string.voip_call_network_status_me_bad), Integer.valueOf(R.drawable.vk_icon_wifi_outline_56), null, null, false, 12));
                                            voipHintView.setVisibility(0);
                                            aVar.j = currentTimeMillis;
                                            aVar.i = enumC2056a;
                                            aVar.e.v0();
                                            aVar.j(io.reactivex.rxjava3.core.a.s(5000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new lx6(aVar, 7)));
                                            break;
                                        }
                                    }
                                }
                            } else {
                                ghu ghuVar = aVar.d;
                                VoipHintView voipHintView2 = aVar.a;
                                if ((!cVar.s0() || ghuVar.a) && cVar.s0()) {
                                    long j = ghuVar.b;
                                    a.EnumC2056a enumC2056a2 = a.EnumC2056a.CameraDisabledDueToBadConnection;
                                    if (enumC2056a2.h() >= aVar.a()) {
                                        voipHintView2.a(new VoipHintView.a(voipHintView2.getResources().getString(R.string.voip_camera_disabled_due_to_bad_connection), Integer.valueOf(R.drawable.vk_icon_videocam_slash_outline_28), null, null, false, 12));
                                        voipHintView2.setVisibility(0);
                                        aVar.j = System.currentTimeMillis();
                                        aVar.i = enumC2056a2;
                                        aVar.e.N0();
                                        aVar.j(io.reactivex.rxjava3.core.a.s(j, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ul0(aVar, 5)));
                                        break;
                                    }
                                }
                            }
                        } else {
                            VoipHintView voipHintView3 = aVar.a;
                            break;
                        }
                    } else {
                        mjw0Var.p();
                        break;
                    }
                } else {
                    mjw0Var.q();
                    break;
                }
                break;
            case 13:
                ((udk0) this.c).invoke(obj);
                break;
            default:
                ((vqp) this.c).invoke(obj);
                break;
        }
    }
}
