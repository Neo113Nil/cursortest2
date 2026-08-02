package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.util.Size;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.VoipGroupSelectorFragment;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerState;
import com.vk.voip.ui.share.link.pager.view.c;
import com.vk.voip.ui.share.link.pager_new.view.VoipShareLinkPagerViewNew;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.hp90;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tuw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tuw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_positive);
                VoipPastCallsFragment voipPastCallsFragment = (VoipPastCallsFragment) obj2;
                x49 x49Var = (x49) obj;
                if (x49Var instanceof whg) {
                    yhg yhgVar = voipPastCallsFragment.Y;
                    (yhgVar != null ? yhgVar : null).a((whg) x49Var);
                } else if (x49Var instanceof hp90) {
                    kp90 kp90Var = voipPastCallsFragment.Z;
                    if (kp90Var == null) {
                        kp90Var = null;
                    }
                    hp90 hp90Var = (hp90) x49Var;
                    kp90Var.getClass();
                    Context context = kp90Var.a;
                    if (hp90Var instanceof hp90.d) {
                        CallsUserId callsUserId = ((hp90.d) hp90Var).a;
                        VoipGroupSelectorConfig voipGroupSelectorConfig = new VoipGroupSelectorConfig("request_key_past_calls_filter_group_id", callsUserId != null ? com.vk.voip.userid.a.b(callsUserId) : null, new VoipGroupSelectorConfig.TitleConfig.ResId(R.string.voip_history_past_calls_dialog_filter_title), new VoipGroupSelectorConfig.ButtonConfig.ResId(R.string.voip_history_past_calls_dialog_filter_select), false, false, 32, null);
                        vbs vbsVar = kp90Var.b;
                        VoipGroupSelectorFragment voipGroupSelectorFragment = new VoipGroupSelectorFragment();
                        voipGroupSelectorFragment.setArguments(yfb.b(new Pair("arg_config", voipGroupSelectorConfig)));
                        voipGroupSelectorFragment.Fn(vbsVar, "VoipGroupSelectorFragment");
                        s3q0 s3q0Var = s3q0.a;
                    } else if (hp90Var.equals(hp90.b.a)) {
                        String string = context.getString(R.string.voip_clear_call_history_snack_immediate);
                        ikv0.a aVar = new ikv0.a(context);
                        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, valueOf, (Size) null, 12);
                        aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
                        aVar.e = 3000L;
                        aVar.b().c();
                    } else if (hp90Var.equals(hp90.a.a)) {
                        String string2 = context.getString(R.string.voip_call_deleted_snackbar);
                        ikv0.a aVar2 = new ikv0.a(context);
                        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, valueOf, (Size) null, 12);
                        aVar2.u = new ikv0.d(string2, (String) null, (ikv0.d.a) null, 6);
                        aVar2.e = 3000L;
                        aVar2.b().c();
                    } else {
                        if (!hp90Var.equals(hp90.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ikv0.a aVar3 = new ikv0.a(context);
                        aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                        aVar3.u = new ikv0.d(context.getString(R.string.voip_report_call_snackbar), (String) null, (ikv0.d.a) null, 6);
                        aVar3.n();
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } else {
                    int i2 = VoipPastCallsFragment.a0;
                }
                return s3q0.a;
            case 1:
                VoipShareLinkPagerViewNew voipShareLinkPagerViewNew = (VoipShareLinkPagerViewNew) obj2;
                VoipShareLinkPagerState voipShareLinkPagerState = (VoipShareLinkPagerState) obj;
                bwt0.p0(voipShareLinkPagerViewNew.u, voipShareLinkPagerState.b.isEmpty());
                com.vk.voip.ui.share.link.pager.view.c cVar = voipShareLinkPagerState.a;
                VkTextArea vkTextArea = voipShareLinkPagerViewNew.t;
                if (cVar instanceof c.a) {
                    c.a aVar4 = (c.a) cVar;
                    String str = aVar4.a;
                    voipShareLinkPagerViewNew.v = str;
                    voipShareLinkPagerViewNew.w = aVar4;
                    vkTextArea.setMiddle(new VkTextArea.d(14, oq.d(tlo0.Companion, str), null));
                } else {
                    if (!(cVar instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.b bVar = (c.b) cVar;
                    String string3 = voipShareLinkPagerViewNew.getContext().getString(R.string.voip_share_link_page_with_password_link, bVar.a, bVar.b);
                    voipShareLinkPagerViewNew.v = string3;
                    voipShareLinkPagerViewNew.w = bVar;
                    vkTextArea.setMiddle(new VkTextArea.d(14, oq.d(tlo0.Companion, string3), null));
                }
                return s3q0.a;
            case 2:
                com.vk.superapp.widget_settings.p004new.b bVar2 = (com.vk.superapp.widget_settings.p004new.b) obj2;
                bVar2.e.onNext(Boolean.TRUE);
                bVar2.m.incrementAndGet();
                return s3q0.a;
            default:
                ((h5y0) obj2).e = SystemClock.elapsedRealtime();
                return s3q0.a;
        }
    }
}
