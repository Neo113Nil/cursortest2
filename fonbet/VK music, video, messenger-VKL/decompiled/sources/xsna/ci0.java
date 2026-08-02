package xsna;

import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.auth.modal.qrwithcode.b;
import com.vk.catalog2.common.ui.holders.ads.AdShowCaseBannerVh;
import com.vk.channels.impl.donut.a;
import com.vk.dto.attaches.AttachImage;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.money.MoneyTransfersFragment;
import com.vk.money.createtransfer.input.TransferInputFieldView;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls20.SimpleControlsView;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import xsna.a2v0;
import xsna.dwn;
import xsna.gwn;
import xsna.iv20;
import xsna.lhu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ci0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ci0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TransformController.ScaleType scaleType;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AdShowCaseBannerVh adShowCaseBannerVh = (AdShowCaseBannerVh) obj;
                adShowCaseBannerVh.b.a();
                zu50 zu50Var = adShowCaseBannerVh.q;
                if (zu50Var != null) {
                    zu50Var.a();
                    return;
                }
                return;
            case 1:
                ((gv20) obj).c.invoke();
                return;
            case 2:
                ((mk7) obj).l.io();
                return;
            case 3:
                ((com.vk.channels.impl.donut.c) obj).b.invoke(a.b.b);
                return;
            case 4:
                ((ComponentImageView) obj).a(view);
                return;
            case 5:
                gwn.a aVar = (gwn.a) obj;
                gwn.a.InterfaceC2959a interfaceC2959a = aVar.c;
                gwn.b bVar = aVar.b;
                if (interfaceC2959a instanceof gwn.a.InterfaceC2959a.d) {
                    a1w a1wVar = gwn.this.c;
                    AttachImage attachImage = bVar.b;
                    a1wVar.D(bVar, new tfg0(attachImage.d, attachImage.e, attachImage.f));
                    return;
                } else {
                    if (interfaceC2959a instanceof gwn.a.InterfaceC2959a.c) {
                        String str = ((gwn.a.InterfaceC2959a.c) interfaceC2959a).b;
                        gwn gwnVar = gwn.this;
                        gwnVar.d.k().b(bVar.a, str);
                        dwn dwnVar = gwnVar.b;
                        dwn.b bVar2 = dwnVar instanceof dwn.b ? (dwn.b) dwnVar : null;
                        if (bVar2 != null) {
                            Long l = null;
                            new iid0(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNEL, SchemeStat$TypeAction.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, l, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 62, 0 == true ? 1 : 0), null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.CHANNEL_POST_DONUT_SUB_CLICK, null, Integer.valueOf((int) bVar2.c), l, null, null, Long.valueOf(bVar.b.f), null, null, null, null, null, 4026, null), 2)).q();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 6:
                gzs<s3q0> gzsVar = ((d5p0) obj).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    return;
                }
                return;
            case 7:
                ((com.vk.newsfeed.common.recycler.holders.e) obj).n.invoke(LeadFormHolder.ButtonAction.NEXT_PAGE);
                return;
            case 8:
                ((LiveView) obj).Q.E1();
                return;
            case 9:
                int i2 = MoneyTransfersFragment.b1;
                ((MoneyTransfersFragment) obj).Lo();
                return;
            case 10:
                com.vk.auth.modal.qrwithcode.a aVar2 = ((QrWithCodeAuthModal) obj).g;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                if (aVar2.k instanceof b.a) {
                    com.vk.registration.funnels.b bVar3 = com.vk.registration.funnels.b.a;
                    iv20.b bVar4 = aVar2.d;
                    if (bVar4 == null) {
                        bVar4 = null;
                    }
                    String str2 = bVar4.f;
                    bVar3.getClass();
                    ArrayList arrayList = new ArrayList();
                    SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID;
                    arrayList.add(com.vk.registration.funnels.b.d(name, str2));
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.QR_CODE_DEVICE_INFO_TAP, arrayList, null, null, null, null, null, 252);
                    iv20.b bVar5 = aVar2.d;
                    String str3 = (bVar5 != null ? bVar5 : null).f;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(com.vk.registration.funnels.b.d(name, str3));
                    qro0.c(new ln20(arrayList2, 24));
                    aVar2.e(b.C0406b.a, true);
                    return;
                }
                return;
            case 11:
                SimpleControlsView simpleControlsView = (SimpleControlsView) obj;
                TransformController transformController = simpleControlsView.B;
                if (transformController != null) {
                    int i3 = SimpleControlsView.g.$EnumSwitchMapping$0[transformController.e.ordinal()];
                    if (i3 == 1) {
                        scaleType = TransformController.ScaleType.CROP;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        scaleType = TransformController.ScaleType.FIT;
                    }
                    OneVideoPlayer oneVideoPlayer = simpleControlsView.x;
                    if ((oneVideoPlayer != null ? oneVideoPlayer.getState() : null) == OneVideoPlayer.State.PLAYING) {
                        i10.e(simpleControlsView.v, true);
                    }
                    transformController.f(scaleType, true);
                    return;
                }
                return;
            case 12:
                ((TransferInputFieldView) obj).f.requestFocus();
                mhy.i(null, view, true);
                return;
            case 13:
                gzs<s3q0> gzsVar2 = ((lhu0.c.C3269c) obj).a;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    return;
                }
                return;
            case 14:
                a2v0.d dVar = (a2v0.d) obj;
                if (fkq0.c(dVar.t)) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).i0(dVar.l.getApplicationContext(), dVar.t);
                    return;
                }
                return;
            default:
                fav0 fav0Var = (fav0) obj;
                fav0Var.a.a.invoke();
                dw20 dw20Var = fav0Var.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    return;
                }
                return;
        }
    }
}
