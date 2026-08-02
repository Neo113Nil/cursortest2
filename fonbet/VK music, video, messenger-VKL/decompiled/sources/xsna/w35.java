package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.clips.playlists.ClipsPlaylistsSmallFoldersLaunchParams;
import com.vk.core.ui.utils.ItemType;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.silentauth.SilentAuthInfo;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cwb0;
import xsna.dw20;
import xsna.eve;
import xsna.nue;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w35 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w35(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [T, xsna.dw20] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i4) {
            case 0:
                VkAuthState vkAuthState = (VkAuthState) obj6;
                SilentAuthInfo silentAuthInfo = (SilentAuthInfo) obj5;
                String str = (String) obj4;
                Context context = (Context) obj3;
                VkAuthMetaInfo vkAuthMetaInfo = (VkAuthMetaInfo) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    vkAuthState.d.put("validate_session", str2);
                }
                l55 l55Var = l55.a;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                return l55.i(l55Var, vdx0Var.e().b(vkAuthState, silentAuthInfo.d, silentAuthInfo.c, null, str), context, VkAuthMetaInfo.zb(vkAuthMetaInfo, null, null, silentAuthInfo.s, 31), vkAuthState, 24).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            case 1:
                com.vk.clips.playlists.b bVar = (com.vk.clips.playlists.b) obj6;
                ClipsPlaylistsSmallFoldersLaunchParams clipsPlaylistsSmallFoldersLaunchParams = (ClipsPlaylistsSmallFoldersLaunchParams) obj5;
                gzs gzsVar = (gzs) obj4;
                uue uueVar = (uue) obj3;
                gzs gzsVar2 = (gzs) obj2;
                eve eveVar = (eve) obj;
                if (eveVar.equals(eve.b.a)) {
                    vve.e(bVar.a, rve.a, clipsPlaylistsSmallFoldersLaunchParams.d, false, 4);
                } else {
                    if (!(eveVar instanceof eve.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((eve.a) eveVar).a) {
                        gzsVar.invoke();
                    } else {
                        uueVar.C(new nue.h(!((Boolean) gzsVar2.invoke()).booleanValue()));
                    }
                }
                return s3q0.a;
            case 2:
                brj0 brj0Var = (brj0) obj5;
                ihr ihrVar = (ihr) obj4;
                Context context2 = (Context) obj3;
                FragmentManager fragmentManager = (FragmentManager) obj2;
                brj0 brj0Var2 = (brj0) obj;
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj6).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                if (brj0Var2.a == brj0Var.a) {
                    if (((Boolean) ihrVar.e.get()).booleanValue()) {
                        i = R.string.voip_finish_scheduled_meeting_disconnect_title;
                        i2 = R.string.voip_finish_scheduled_meeting_disconnect_message;
                        i3 = R.string.voip_finish_scheduled_meeting_disconnect_action;
                    } else {
                        i = R.string.voip_finish_call_option_for_all_submit_title;
                        i2 = R.string.voip_finish_call_option_for_all_submit_description;
                        i3 = R.string.voip_finish_call_option_for_all_submit_yes;
                    }
                    bzb0.d(ihrVar.c, new cwb0.a1(i, null, i2, null, i3, null, R.string.voip_finish_call_option_for_all_submit_no, null, null, null, 938), new tvj(ihrVar, 8), null, null, 28);
                } else if (((Boolean) ihrVar.d.invoke()).booleanValue()) {
                    brj0 brj0Var3 = new brj0(0, 0, null, R.string.voip_grant_admin_on_exit_option_title, null, false, false, ItemType.TITLE, 0, null, null, null, null, null, 130806);
                    brj0 brj0Var4 = new brj0(1, 0, null, R.string.voip_grant_admin_on_exit_option_grant_button, null, false, false, null, R.id.voip_call_end_option_appoint, null, null, null, null, null, 130550);
                    brj0 brj0Var5 = new brj0(2, 0, null, R.string.voip_grant_admin_on_exit_option_exit_button, null, false, false, null, R.id.voip_call_end_option_leave_call, null, null, null, null, null, 130550);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    dw20.b P = new dw20.b(context2, null).P(e43.l(brj0Var3, brj0Var4, brj0Var5), new wyh(ref$ObjectRef, brj0Var4, ihrVar, brj0Var5, 1));
                    dhr0.a.getClass();
                    ?? a = P.u0(dhr0.u().c).a();
                    ref$ObjectRef.element = a;
                    a.Wn(fragmentManager, "grantAdminOrExitDialog");
                } else {
                    ihrVar.b.invoke(Boolean.FALSE);
                }
                return s3q0.a;
            default:
                tid0 tid0Var = (tid0) obj4;
                LinkedHashSet linkedHashSet = tid0Var.e;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) obj3;
                tmc tmcVar = (tmc) obj2;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                c5u c5uVar = (c5u) ((LinkedHashMap) obj5).get((MarketProductTileConfig) ((List) obj6).get(intValue));
                if (c5uVar != null) {
                    if (linkedHashSet.contains(c5uVar)) {
                        return s3q0.a;
                    }
                    linkedHashSet.add(c5uVar);
                    lt00.h((lt00) tid0Var.b.d, Long.valueOf(c5uVar.a), Long.valueOf(c5uVar.b.b), intValue > 0 ? num : null, commonMarketStat$TypeRefSource, null, Integer.valueOf(tmcVar.a), Long.valueOf(tmcVar.b.b), CommonMarketStat$TypeMarketContextContent.Type.CLIP, 16);
                }
                return s3q0.a;
        }
    }
}
