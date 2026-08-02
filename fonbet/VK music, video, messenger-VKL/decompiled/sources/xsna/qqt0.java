package xsna;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebRights;
import com.vk.libvideo.impl.di.VkVideoPromoComponentImpl;
import com.vk.log.L;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vk.whitelabelauth.di.WhiteLabelAuthComponent;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.Conversation;
import xsna.dw20;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qqt0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qqt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r1 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Type inference failed for: r1v40, types: [T, xsna.dw20] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Integer num;
        List<WebRights> list;
        boolean isCreator;
        VoipChatInfo voipChatInfo;
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                ebs0 ebs0Var = ((sqt0) this.c).b;
                if (ebs0Var != null) {
                    ebs0Var.bk(ea80.a);
                }
                return s3q0.a;
            case 1:
                ((b78) this.c).a().invoke(sx40.f.b);
                return s3q0.a;
            case 2:
                ggu0 vn = ((com.vk.superapp.browser.ui.a) this.c).vn();
                ddr0 l = vn.l();
                String n = vn.n();
                ufu0 ufu0Var = new ufu0(vn, i);
                l.b(true);
                Context context = ((ggu0) l.e.c).b;
                fvv0 fvv0Var = l.b;
                WebApiApplication v = fvv0Var.v();
                if (v == null || (list = v.d0) == null) {
                    num = null;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        i2 += ((WebRights) it.next()).e;
                    }
                    num = Integer.valueOf(i2);
                }
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                zen0 d = vdx0Var.d();
                long appId = fvv0Var.getAppId();
                String l2 = fvv0Var.l();
                WebApiApplication v2 = fvv0Var.v();
                l.d.b(d.b(appId, num, n, l2, v2 != null ? v2.w : null).subscribe(new w250(new aq1(26, l, ufu0Var), 28), new a8v(new g86(23, l, context), 25)));
                return s3q0.a;
            case 3:
                return Integer.valueOf(krv0.m(R.attr.vk_ui_overlay_secondary, (Context) this.c));
            case 4:
                VideoGrowthComponent videoGrowthComponent = (VideoGrowthComponent) this.c;
                qcy<Object>[] qcyVarArr = VkVideoPromoComponentImpl.c;
                return new j0w0(videoGrowthComponent.Af());
            case 5:
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.c;
                int i3 = VoipCallActivity.P;
                if (OKVoipEngine.b.isGroupCall()) {
                    dhw0 dhw0Var = OKVoipEngine.B;
                    if (!((dhw0Var == null || (voipChatInfo = dhw0Var.B) == null) ? false : epx.f(voipChatInfo.e, Boolean.TRUE))) {
                        Conversation conversation = OKVoipEngine.E.getConversation();
                        if (conversation != null) {
                            isCreator = conversation.getMe().isCreator();
                            break;
                        } else {
                            isCreator = false;
                            break;
                        }
                    }
                    if (i == 0) {
                        ihr ihrVar = voipCallActivity.K;
                        if (ihrVar != null) {
                            FragmentManager supportFragmentManager = voipCallActivity.getSupportFragmentManager();
                            brj0 brj0Var = new brj0(0, 0, null, R.string.voip_finish_call_option_only_me, null, false, false, null, R.id.voip_call_end_option_only_me, null, null, null, null, null, 130550);
                            brj0 brj0Var2 = new brj0(1, 0, null, R.string.voip_finish_call_option_for_all, null, false, false, null, R.id.voip_call_end_option_for_all, null, null, null, null, null, 130550);
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            dw20.b P = new dw20.b(voipCallActivity, null).P(e43.l(brj0Var, brj0Var2), new w35(ref$ObjectRef, brj0Var2, ihrVar, voipCallActivity, supportFragmentManager, 2));
                            dhr0.a.getClass();
                            ?? a = P.u0(dhr0.u().c).a();
                            ref$ObjectRef.element = a;
                            a.Wn(supportFragmentManager, "finishOptionsDialog");
                        }
                    } else {
                        L.A("VoipCallActivity", "finishCallCallback declineOrHang");
                        com.vk.voip.ui.c.C(com.vk.voip.ui.c.b, null, 500L, false, false, false, null, 237);
                    }
                    return s3q0.a;
                }
                i = 0;
                if (i == 0) {
                }
                return s3q0.a;
            case 6:
                ((mjw0) this.c).getClass();
                com.vk.voip.ui.c.b.getClass();
                return s3q0.a;
            case 7:
                ((gvw0) this.c).g = false;
                return s3q0.a;
            case 8:
                return ((WhiteLabelAuthComponent) m7m.a(((xkx0) this.c).y).a(fpf0.a(WhiteLabelAuthComponent.class))).Bc();
            case 9:
                ((com.vk.writebar.g) this.c).getClass();
                com.vk.writebar.f fVar = new com.vk.writebar.f();
                iah0.a(70.0f);
                return fVar;
            default:
                return f4m.c((View) this.c);
        }
    }
}
