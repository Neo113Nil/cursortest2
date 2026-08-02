package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class aqt0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aqt0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        d3b0 v0;
        ebs0 ebs0Var;
        View view;
        CharSequence charSequence;
        CharSequence charSequence2;
        switch (this.b) {
            case 0:
                VideoView videoView = (VideoView) this.c;
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.d;
                yg5 yg5Var = videoView.I;
                sc4 sc4Var = videoView.E0;
                if (yg5Var != null && (v0 = yg5Var.v0()) != null && (ebs0Var = videoView.s) != null) {
                    ebs0Var.bk(fxc0.B().J().l0() ? new x0t0(v0) : new y0t0(v0));
                }
                appCompatTextView.removeCallbacks(sc4Var);
                sc4Var.run();
                break;
            case 1:
                y7w0 y7w0Var = ((m6w0) this.c).g;
                y7w0Var.getClass();
                nr4.b().j(y7w0Var.c, (String) this.d, (ShareVmojiStoryParams) obj);
                break;
            case 2:
                VoipScheduledCallsFragment voipScheduledCallsFragment = (VoipScheduledCallsFragment) this.c;
                CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) this.d;
                m59 m59Var = (m59) obj;
                voipScheduledCallsFragment.V.setItems(m59Var.a);
                customSwipeRefreshLayout.setRefreshing(m59Var.b);
                break;
            default:
                xkx0 xkx0Var = (xkx0) this.c;
                vkx0 vkx0Var = (vkx0) this.d;
                SilentAuthInfo silentAuthInfo = (SilentAuthInfo) ((it80) obj).a;
                if (silentAuthInfo != null) {
                    xkx0Var.z = silentAuthInfo;
                    bpn0 bpn0Var = vkx0Var.x;
                    VKImageController.b a = adu0.a(6, vkx0Var.requireContext());
                    TextView textView = vkx0Var.t;
                    if (textView != null) {
                        sou0 sou0Var = (sou0) bpn0Var.getValue();
                        if (sou0Var != null) {
                            vkx0Var.requireContext();
                            charSequence2 = sou0Var.b();
                        } else {
                            charSequence2 = null;
                        }
                        textView.setText(charSequence2);
                    }
                    TextView textView2 = vkx0Var.t;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    TextView textView3 = vkx0Var.u;
                    if (textView3 != null) {
                        sou0 sou0Var2 = (sou0) bpn0Var.getValue();
                        if (sou0Var2 != null) {
                            vkx0Var.requireContext();
                            charSequence = sou0Var2.a();
                        } else {
                            charSequence = null;
                        }
                        textView3.setText(charSequence);
                    }
                    TextView textView4 = vkx0Var.u;
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                    TextView textView5 = vkx0Var.v;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                    TextView textView6 = vkx0Var.w;
                    if (textView6 != null) {
                        textView6.setVisibility(0);
                    }
                    String str = silentAuthInfo.i;
                    if (str != null) {
                        VKImageController<? extends View> vKImageController = vkx0Var.z;
                        if (vKImageController != null && (view = vKImageController.getView()) != null) {
                            view.setVisibility(0);
                        }
                        VKImageController<? extends View> vKImageController2 = vkx0Var.z;
                        if (vKImageController2 != null) {
                            vKImageController2.f(str, a);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                    TextView textView7 = vkx0Var.v;
                    if (textView7 != null) {
                        textView7.setText(silentAuthInfo.f + ' ' + silentAuthInfo.j);
                    }
                    TextView textView8 = vkx0Var.w;
                    if (textView8 != null) {
                        String str2 = silentAuthInfo.k;
                        textView8.setText(str2 != null ? str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null);
                    }
                    VkLoadingButton vkLoadingButton = vkx0Var.k;
                    if (vkLoadingButton != null) {
                        vkLoadingButton.setVisibility(0);
                    }
                    VkLoadingButton vkLoadingButton2 = vkx0Var.y;
                    if (vkLoadingButton2 != null) {
                        vkLoadingButton2.setVisibility(0);
                    }
                    com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                    bVar.getClass();
                    com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.SILENT_AUTH_EXISTING_ACCOUNT, null, null, null, 30);
                } else {
                    xkx0Var.C0();
                }
                break;
        }
        return s3q0.a;
    }
}
