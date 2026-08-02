package xsna;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.view.View;
import android.widget.EditText;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.im.popup.Popup;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.method.selector.impl.c;
import com.vk.network.eventhub.api.di.EventHubComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.rr50;
import xsna.rv30;
import xsna.w1g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m1y implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, xsna.jv20] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 8;
        Object obj = this.c;
        switch (i) {
            case 0:
                WebAdConfig c = ((n1y) obj).c(false);
                return Boolean.valueOf(c != null && c.d);
            case 1:
                return ((EventHubComponent) ((k7m) m7m.f((b500) obj)).a(fpf0.a(EventHubComponent.class))).getReporter();
            case 2:
                int i3 = MarketEditAlbumGoodsFragment.c1;
                ((MarketEditAlbumGoodsFragment) obj).Fo();
                return s3q0.a;
            case 3:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) obj;
                mfy mfyVar = marketItemReviewRepliesFragment.X;
                WriteBar writeBar = marketItemReviewRepliesFragment.S;
                EditText input = writeBar != null ? writeBar.getInput() : null;
                mfyVar.getClass();
                qcy<Object>[] qcyVarArr = MarketItemReviewRepliesFragment.b0;
                marketItemReviewRepliesFragment.eo(w1g0.f.b);
                s3q0 s3q0Var = s3q0.a;
                if (mfyVar.a && input != null) {
                    input.post(new sc4(input, i2));
                }
                return s3q0.a;
            case 4:
                ((zak0) ((su10) obj).k).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 5:
                VerificationMethodTypes verificationMethodTypes = ((com.vk.method.selector.impl.c) obj).c;
                switch (verificationMethodTypes == null ? -1 : c.a.$EnumSwitchMapping$0[verificationMethodTypes.ordinal()]) {
                    case -1:
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                        frf0.g(SchemeStatSak$EventScreen.PRIMARY_FACTOR_CHOICE, null, null, null, 12);
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 4:
                        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.VERIFICATION_FLOW;
                        bVar.getClass();
                        SchemeStatSak$RegistrationFieldItem f = com.vk.registration.funnels.b.f(name);
                        if (f != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(f);
                            RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                            frf0.l(SchemeStatSak$EventScreen.CONFIRM_AUTH_FAILED, arrayList);
                            frf0.l(SchemeStatSak$EventScreen.VERIFICATION_PASSKEY, arrayList);
                        }
                        RegistrationFunnelScreenStack registrationFunnelScreenStack3 = frf0.a;
                        frf0.g(SchemeStatSak$EventScreen.PRIMARY_FACTOR_CHOICE, null, null, null, 12);
                        break;
                }
                return s3q0.a;
            case 6:
                ((wv20) obj).b.G8();
                return s3q0.a;
            case 7:
                com.vk.im.ui.formatters.spans.dialogitem.a aVar = (com.vk.im.ui.formatters.spans.dialogitem.a) obj;
                Context context = aVar.a;
                boolean z = aVar.b;
                int i4 = R.attr.vk_ui_text_subhead;
                if ((!z || !aVar.d) && !aVar.c) {
                    i4 = R.attr.vk_ui_text_accent;
                }
                return Integer.valueOf(e3m.f(i4, context));
            case 8:
                ym30 ym30Var = ((vm30) obj).t0;
                if (ym30Var != null) {
                    ym30Var.s0();
                }
                return s3q0.a;
            case 9:
                return Integer.valueOf(e3m.a(R.dimen.vkim_msg_part_playlist_time_margin_top, ((zn30) obj).e()));
            case 10:
                rv30 rv30Var = (rv30) obj;
                Intent k = rv30Var.k(null, "msg_request_view");
                rv30.a aVar2 = rv30Var.x;
                k.putExtra("owner_id", aVar2.m);
                k.putExtra("peer_id", aVar2.n);
                return rv30Var.l(k);
            case 11:
                return new tn40((yn40) obj);
            case 12:
                jp40 jp40Var = (jp40) obj;
                jp40Var.c.dispose();
                jp40Var.c = ((com.vk.music.api.a) jp40Var.b.getValue()).b().subscribe(new ir0(new uv20(jp40Var, i2), 29));
                return s3q0.a;
            case 13:
                return ((y750) obj).findViewById(R.id.progress);
            case 14:
                cjx cjxVar = ((rr50) obj).J;
                return new rr50.d(cjxVar == null ? null : cjxVar);
            case 15:
                return ((SharingComponent) ((com.vk.newsfeed.common.helpers.a) obj).f.getValue()).v();
            case 16:
                return ((n7p0) obj).d();
            case 17:
                mo60 mo60Var = (mo60) obj;
                ju4 ju4Var = mo60Var.a;
                oo60 oo60Var = new oo60((AtomicReference) ju4Var.a);
                po60 po60Var = new po60((AtomicReference) ju4Var.b);
                bpn0 bpn0Var = mo60Var.M;
                ?? r9 = mo60Var.i;
                ?? r10 = mo60Var.k;
                bpn0 bpn0Var2 = mo60Var.G;
                bpn0 bpn0Var3 = mo60Var.H;
                bpn0 bpn0Var4 = mo60Var.L;
                bpn0 bpn0Var5 = mo60Var.E;
                ?? r15 = mo60Var.j;
                bpn0 bpn0Var6 = new bpn0(new xsw(mo60Var, 16));
                Lazy a = msy.a(LazyThreadSafetyMode.NONE, new fm20(mo60Var, 7));
                bpn0 bpn0Var7 = new bpn0(new hp30(mo60Var, 6));
                bpn0 bpn0Var8 = new bpn0(new jw30(mo60Var, 6));
                bpn0 bpn0Var9 = new bpn0(new so40(mo60Var, 3));
                bpn0 bpn0Var10 = fxc0.a;
                return new hu60(oo60Var, po60Var, bpn0Var, new iu60(r9, r10, bpn0Var4, bpn0Var2, bpn0Var3, bpn0Var5, r15, bpn0Var6, a, bpn0Var7, bpn0Var8, bpn0Var9, bpn0Var10 != null ? bpn0Var10 : null));
            case 18:
                ((n270) obj).l.v();
                return s3q0.a;
            case 19:
                vo70 vo70Var = (vo70) ((cp70) obj).a;
                if (vo70Var != null) {
                    vo70Var.e();
                }
                return s3q0.a;
            case 20:
                qcy<Object>[] qcyVarArr2 = b080.q1;
                UserId userId = (UserId) ((b080) obj).requireArguments().getParcelable("UID");
                return userId == null ? UserId.d : userId;
            case 21:
                etw etwVar = (etw) obj;
                if (etwVar != null) {
                    return new ftw(etwVar);
                }
                return null;
            case 22:
                qcy<Object>[] qcyVarArr3 = OrderListFragment.Q;
                return new com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.c(new gv80(), new com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.b(((BridgeComponent) m7m.d((OrderListFragment) obj).a(fpf0.a(BridgeComponent.class))).p().a()));
            case 23:
                Object obj2 = ((mm90) obj).o;
                ((km90) (obj2 != null ? obj2 : null)).d();
                return s3q0.a;
            case 24:
                int i5 = PastBroadcastsFragment.U;
                return ((VideoApiHelperComponent) m7m.d((PastBroadcastsFragment) obj).a(fpf0.a(VideoApiHelperComponent.class))).N4();
            case 25:
                return Integer.valueOf(((AudioManager) ((g3b0) obj).m.getValue()).getStreamMaxVolume(3));
            case 26:
                return ((PlaylistScreenFragmentInternalComponent) obj).g.e2();
            case 27:
                View view = ((Popup.g.a) ((Popup.a) obj).j).a;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view.getContext();
                e.b bVar2 = new e.b(view, null, null, l, 6);
                bVar2.w = R.layout.ds_internal_context_menu_item;
                return bVar2;
            case 28:
                ((NewsFeedComponent) ((k7m) m7m.f((y1c0) obj)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            default:
                int i6 = PostFragment.S0;
                return ((BridgeComponent) m7m.d((PostFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
        }
    }
}
