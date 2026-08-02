package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.donut.video.model.domain.video.DonutVideoModel;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.oauth.sber.VkSberBaseActivity;
import com.vk.oauth.sber.verification.VkSberVerificationActivity;
import com.vk.video.profile.presentation.f;
import com.vk.voip.ui.share.link.pager_new.model.VoipShareLinkSheetButton;
import com.vkontakte.android.R;
import xsna.dai;
import xsna.l1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cis0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cis0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dai.c a;
        kbe kbeVar;
        r80 a2;
        boolean z;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return dis0.d((dis0) obj3, (DonutVideoModel) obj2);
            case 1:
                ((com.vk.video.profile.presentation.c) obj3).T(new f.e.a((Throwable) obj, (UserId) obj2));
                return s3q0.a;
            case 2:
                String str = (String) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                VideoCellViewState.c a3 = ((vst0) obj3).c.a();
                if (a3 != null && (a = a3.a()) != null && (kbeVar = a.c) != null) {
                    bgi0.c(tgi0Var, kbeVar);
                }
                if (str != null) {
                    bgi0.d(tgi0Var, str);
                }
                qgi0.r(tgi0Var, "mvi_catalog_video_card_test_tag");
                return s3q0.a;
            case 3:
                com.vk.superapp.verification.account.d dVar = (com.vk.superapp.verification.account.d) obj3;
                int i2 = VkSberVerificationActivity.o;
                Context requireContext = dVar.requireContext();
                String str2 = VkSberBaseActivity.n;
                dVar.startActivityForResult(VkSberBaseActivity.a.a(requireContext, (String) obj).putExtras((Bundle) obj2), 114097);
                return s3q0.a;
            case 4:
                ViewGroup viewGroup = (ViewGroup) obj3;
                vuv0 vuv0Var = (vuv0) obj2;
                View view = (View) obj;
                String str3 = null;
                TextView textView = view instanceof TextView ? (TextView) view : null;
                if (textView != null) {
                    Context context = viewGroup.getContext();
                    if (context != null) {
                        l4v0 l4v0Var = vuv0Var.b;
                        if (l4v0Var != null && (a2 = l4v0Var.a()) != null) {
                            str3 = (String) a2.a;
                        }
                        str3 = context.getString(epx.f(str3, "common") ? R.string.music_vkmix_swipe_action_common : R.string.music_vkmix_swipe_action_my_music);
                    }
                    textView.setText(str3);
                }
                return s3q0.a;
            case 5:
                l1x0.b bVar = (l1x0.b) obj2;
                int i3 = l1x0.k1;
                ((l1x0) obj3).bo(bVar, bVar.d, (VoipShareLinkSheetButton) obj);
                return s3q0.a;
            default:
                s1y0 s1y0Var = (s1y0) obj3;
                c1y0 c1y0Var = (c1y0) obj2;
                if (s1y0Var != null) {
                    c1y0Var.b.getInputState();
                    z = s1y0Var.c();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
