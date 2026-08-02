package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.auth.verification.checkaccess.VkCheckAccessRequiredData;
import com.vk.channels.impl.post_settings.e;
import com.vk.channels.impl.post_settings.g;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollTile;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.log.L;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenUrl;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Parameters;
import com.vk.superapp.common.js.bridge.api.events.RetargetingPixel$Response;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.superapp.ui.widgets.SuperAppShowcaseScrollWidget;
import com.vk.superapp.ui.widgets.subscribe_tile.SubIcon;
import com.vk.voip.ui.call_list.scheduled.ui.items.ScheduledCallViewItem;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.share.link.pager_new.view.VoipShareLinkPagerViewNew;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.bjw0;
import xsna.e6w0;
import xsna.fh8;
import xsna.gh8;
import xsna.gm50;
import xsna.hpb0;
import xsna.jto0;
import xsna.q6h0;
import xsna.sgw0;
import xsna.udn0;
import xsna.zp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mz80 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mz80(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Uri uri;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                pa2 pa2Var = ((m990) obj3).e;
                Objects.toString(obj2);
                ((Throwable) obj).getLocalizedMessage();
                pa2Var.getClass();
                break;
            case 2:
                im90 im90Var = (im90) obj3;
                PasswordCheckInitStructure passwordCheckInitStructure = (PasswordCheckInitStructure) obj2;
                if (passwordCheckInitStructure.f) {
                    im90Var.b.Jd();
                }
                oju0 oju0Var = im90Var.c;
                String str = im90Var.e;
                boolean z = passwordCheckInitStructure.f;
                String str2 = passwordCheckInitStructure.c;
                Context context = oju0Var.a;
                VkCheckAccessRequiredData vkCheckAccessRequiredData = new VkCheckAccessRequiredData(str, z, str2, true);
                if (z) {
                    DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                    Intent intent = new Intent(context, (Class<?>) DefaultAuthActivity.BottomSheetActivity.class);
                    intent.putExtra("validateAccessData", vkCheckAccessRequiredData);
                    context.startActivity(intent);
                } else {
                    FragmentManager fragmentManager = oju0Var.b;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("open_sms", vkCheckAccessRequiredData);
                    s3q0 s3q0Var = s3q0.a;
                    fragmentManager.k0(bundle, "key_check_access_result");
                }
                break;
            case 3:
                String str3 = (String) obj3;
                PersonalBannerView personalBannerView = (PersonalBannerView) obj2;
                int i3 = PersonalBannerView.y;
                if (str3 != null) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    Context context2 = personalBannerView.x.getContext();
                    bpn0 bpn0Var = enj.a;
                    superappUiRouterBridge.O(e3m.h(context2), new VkAlertData.b("", str3, (VkAlertData.DialogType) null, new VkAlertData.a(personalBannerView.getContext().getString(R.string.vk_ok), null), (VkAlertData.a) null, 52), new n1a0());
                }
                break;
            case 4:
                cqa0 cqa0Var = (cqa0) obj3;
                RetargetingPixel$Parameters retargetingPixel$Parameters = (RetargetingPixel$Parameters) obj2;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    x1n0 x1n0Var = cqa0Var.b;
                    boolean booleanValue = bool.booleanValue();
                    String j = retargetingPixel$Parameters.j();
                    com.vk.superapp.base.js.bridge.b.p(x1n0Var.a, new JsMethod("VKWebAppRetargetingPixel"), new RetargetingPixel$Response(null, new RetargetingPixel$Response.Data(booleanValue, j), j, 1, null), null, null, false, null, 60);
                } else {
                    cqa0Var.c.n(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), retargetingPixel$Parameters.j(), 1, null));
                }
                break;
            case 5:
                tdu tduVar = (tdu) obj;
                tduVar.A(((kg50) obj3).getFloatValue());
                tduVar.B(((kg50) obj2).getFloatValue());
                break;
            case 6:
                hpb0 hpb0Var = (hpb0) obj3;
                hpb0.b bVar = (hpb0.b) obj2;
                List list = (List) obj;
                if (hpb0Var.f) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!(((PollBackground) obj4) instanceof PollTile)) {
                            arrayList.add(obj4);
                        }
                    }
                    list = arrayList;
                }
                bVar.b.invoke(list);
                RecyclerView.o layoutManager = hpb0Var.i().getRecyclerView().getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    ((LinearLayoutManager) layoutManager).K(hpb0Var.n.getCurrentPosition(), iah0.f().widthPixels / 3);
                }
                break;
            case 7:
                bzb0 bzb0Var = (bzb0) obj3;
                izs izsVar = (izs) obj2;
                Object obj5 = ((brj0) obj).o;
                jwb0 jwb0Var = obj5 instanceof jwb0 ? (jwb0) obj5 : null;
                if (jwb0Var == null) {
                    break;
                } else {
                    if (jwb0Var.j) {
                        bzb0Var.a();
                    }
                    T t = jwb0Var.f;
                    if (t != 0) {
                        izsVar.invoke(t);
                    }
                    break;
                }
            case 8:
                e.a aVar = (e.a) obj3;
                com.vk.channels.impl.post_settings.b bVar2 = (com.vk.channels.impl.post_settings.b) obj2;
                ChannelMsgSendConfig channelMsgSendConfig = ((j7c0) obj).a;
                if (aVar.d && !epx.f(channelMsgSendConfig.p(), Boolean.TRUE)) {
                    bVar2.n(g.a.a);
                }
                if (!aVar.d && epx.f(channelMsgSendConfig.p(), Boolean.TRUE)) {
                    bVar2.n(g.e.a);
                }
                break;
            case 9:
                ((q9d0) obj3).p.invoke(((zp0.b.a.C4192a) obj2).a, UserProfileDialogs.ItemCallPlace.PRIMARY_HOLDER);
                break;
            case 10:
                Activity activity = (Activity) obj3;
                UserId userId = (UserId) obj2;
                ((ikv0) obj).a();
                ww50 v = s200.v(activity);
                if (v instanceof nws0) {
                    ((nws0) v).a();
                } else if (v instanceof d6s0) {
                    ((d6s0) v).c();
                }
                xzd0 xzd0Var = v instanceof xzd0 ? (xzd0) v : null;
                if (xzd0Var != null) {
                    xzd0Var.a();
                }
                fxc0.B().Y().E(activity, userId);
                break;
            case 11:
                e6h0 e6h0Var = (e6h0) obj3;
                ScheduledCallViewItem.ScheduledCall scheduledCall = (ScheduledCallViewItem.ScheduledCall) obj2;
                e6h0Var.m.a(new q6h0.b(scheduledCall.f, !scheduledCall.e && e6h0Var.t));
                break;
            case 12:
                i9i0 i9i0Var = (i9i0) obj3;
                i9i0Var.b((VkInputSelect) obj2, i9i0Var.f, i9i0Var.h, new hy0(i9i0Var, 9));
                break;
            case 13:
                clj0 clj0Var = (clj0) obj3;
                gh8.g gVar = (gh8.g) obj2;
                Long l = (Long) obj;
                if (l.longValue() > 0) {
                    clj0Var.e.invoke(new fh8.j.a(gVar.a, l.longValue() * 1000));
                }
                break;
            case 14:
                break;
            case 15:
                tgi0 tgi0Var = (tgi0) obj;
                int i4 = SuperAppFragment.o0;
                qgi0.h(tgi0Var, ((SuperAppFragment) obj3).getString(R.string.accessibility_super_app_search));
                qgi0.e(tgi0Var, null, new h8n0((mqe0) obj2, i2));
                break;
            case 16:
                udn0.a aVar2 = (udn0.a) obj2;
                SuperAppShowcaseScrollWidget.Payload.ScrollItem scrollItem = ((udn0.b) obj3).a;
                WebAction webAction = scrollItem.e;
                if (webAction != null) {
                    if (webAction instanceof WebActionOpenUrl) {
                        WebActionOpenUrl webActionOpenUrl = (WebActionOpenUrl) webAction;
                        if (drm0.D(webActionOpenUrl.c, "club", true)) {
                            new ejc(aVar2.r && epx.f(scrollItem.g, SubIcon.VideoLive.b), Long.valueOf(webActionOpenUrl.h), null, MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP, CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR, 4).q();
                        }
                    }
                    aVar2.q.invoke(webAction, Integer.valueOf(aVar2.getBindingAdapterPosition()));
                }
                break;
            case 17:
                ((i0b0) obj3).invoke(jto0.b.a((jto0.b) obj2, null, null, null, null, false, (tho0) obj, false, false, false, false, null, false, false, false, null, false, 65503));
                break;
            case 18:
                dcp0 dcp0Var = (dcp0) obj3;
                viy viyVar = (viy) obj2;
                ConstraintLayout.b bVar3 = (ConstraintLayout.b) obj;
                Context context3 = dcp0Var.d;
                int i5 = R.dimen.video_topshelf_content_margin_horizontal;
                int a = e3m.a(R.dimen.video_topshelf_content_margin_horizontal, context3);
                Context context4 = dcp0Var.d;
                boolean z2 = dcp0Var.e;
                if (z2) {
                    i5 = R.dimen.video_topshelf_tablet_margins_horizontal;
                }
                int a2 = e3m.a(i5, context4);
                if (z2) {
                    bVar3.t = 0;
                }
                bVar3.k = wbp0.a(viyVar);
                bVar3.setMargins(a2, 0, a2, a);
                break;
            case 19:
                ((les0) obj3).a((k0h0) obj2);
                break;
            case 20:
                VkBrowserActivity vkBrowserActivity = (VkBrowserActivity) obj3;
                String str4 = (String) obj2;
                int i6 = VkBrowserActivity.l;
                try {
                    uri = Uri.parse(str4);
                } catch (Throwable unused) {
                    uri = null;
                }
                if (uri != null) {
                    rex0 rex0Var = e370.j;
                    (rex0Var != null ? rex0Var : null).b(vkBrowserActivity, uri);
                }
                if (uri != null) {
                    vkBrowserActivity.finish();
                }
                break;
            case 21:
                l9w0 l9w0Var = (l9w0) obj3;
                b8w0 b8w0Var = ((k9w0) obj2).l;
                if (l9w0Var.c) {
                    b8w0Var.a.invoke(e6w0.e.b);
                } else {
                    b8w0Var.a.invoke(new e6w0.n(l9w0Var.b));
                }
                break;
            case 22:
                mgw0 mgw0Var = (mgw0) obj3;
                L.i((Throwable) obj);
                mgw0Var.k = null;
                mgw0Var.j.b(sgw0.b.a);
                mgw0Var.V((rgw0) obj2);
                break;
            case 23:
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) obj2;
                int i7 = VoipCallServiceFragment.Y;
                sp.g(((VoipCallServiceFragment.c) obj3).a, 2);
                gm50.a.a(voipCallServiceFragment, ((bjw0.e) obj).a, new qzl0(voipCallServiceFragment, 20));
                break;
            default:
                Context context5 = (Context) obj3;
                mhy.a(context5, ((VoipShareLinkPagerViewNew) obj2).v);
                enj.q(R.string.voip_share_link_pager_bottom_sheet_link_copy, 0, context5);
                break;
        }
        return s3q0.a;
    }
}
