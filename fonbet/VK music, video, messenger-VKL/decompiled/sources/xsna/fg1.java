package xsna;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.likes.LikesGetList;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.ui.mvp.holder.header.AnimSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.services.presentation.a;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.a;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.location.common.LocationCommon;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.mvi.core.internal.executors.ThreadType;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.profile.community.subscription.impl.di.CommunitySubscriptionComponentImpl;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;
import xsna.cxl;
import xsna.g7z;
import xsna.izj;
import xsna.kyl;
import xsna.lbf;
import xsna.nqd0;
import xsna.o9t;
import xsna.p940;
import xsna.sx40;
import xsna.tj50;
import xsna.u2b0;
import xsna.w4;
import xsna.wrg;
import xsna.ws00;
import xsna.xn50;
import xsna.xyj;
import xsna.znj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fg1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fg1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 onHandUp$lambda$0;
        UIBlockActionClearSection uIBlockActionClearSection;
        int i = 2;
        int i2 = 0;
        r6 = null;
        String str = null;
        switch (this.b) {
            case 0:
                ((gg1) this.c).C(a.d.a((a.d) this.d));
                return s3q0.a;
            case 1:
                AnimStartSearchView animStartSearchView = (AnimStartSearchView) this.c;
                AnimSearchQueryVh animSearchQueryVh = (AnimSearchQueryVh) this.d;
                EditText editText = animStartSearchView.b;
                if (editText.getText().length() > 0) {
                    editText.setText("");
                }
                animStartSearchView.b(true);
                animSearchQueryVh.e.invoke("");
                return s3q0.a;
            case 2:
                ((iyp) this.c).a((pk50) this.d);
                return s3q0.a;
            case 3:
                izs izsVar = (izs) this.c;
                ((wh50) this.d).setValue(new tho0((String) null, 0L, 7));
                izsVar.invoke(a.C0979a.b);
                return s3q0.a;
            case 4:
                ((izs) this.c).invoke(new lbf.c.r(((ClipsUploadState.Loaded) this.d).b.e.p));
                return s3q0.a;
            case 5:
                mdg mdgVar = (mdg) this.c;
                ReactionsFragment.a aVar = new ReactionsFragment.a(mdgVar.i, ((iag) this.d).getId());
                LikesGetList.Type type = LikesGetList.Type.COMMENT;
                Bundle bundle = aVar.j;
                bundle.putSerializable("ltype", type);
                bundle.putSerializable("lptype", mdgVar.D);
                aVar.k(mdgVar.e.getContext());
                return s3q0.a;
            case 6:
                wrg wrgVar = (wrg) this.c;
                d4h d4hVar = (d4h) this.d;
                if (wrgVar instanceof wrg.a) {
                    d3h d3hVar = (d3h) d4hVar.c.invoke();
                    wrg.a aVar2 = (wrg.a) wrgVar;
                    UserId userId = aVar2.e;
                    UserId userId2 = aVar2.f;
                    Set<String> set = p0e0.a;
                    g2h g2hVar = new g2h(userId);
                    g2hVar.b = "app_button";
                    g2hVar.f = String.valueOf(userId2.b);
                    g2hVar.a();
                    d3hVar.l("https://" + a0a.d + "/app" + userId2 + '_' + userId);
                } else {
                    if (!(wrgVar instanceof wrg.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((d3h) d4hVar.c.invoke()).k(d4hVar.m, null, null, ((wrg.b) wrgVar).d);
                }
                return s3q0.a;
            case 7:
                BridgeComponent bridgeComponent = (BridgeComponent) this.c;
                DataRepositoryComponent dataRepositoryComponent = (DataRepositoryComponent) this.d;
                qcy<Object>[] qcyVarArr = CommunitySubscriptionComponentImpl.e;
                o0r0 F = bridgeComponent.F();
                a1w a1wVar = q1w.a;
                return new d7h(F, a1wVar != null ? a1wVar : null, dataRepositoryComponent.D());
            case 8:
                Context context = (Context) this.c;
                izj izjVar = (izj) this.d;
                LocationCommon.a.getClass();
                if (LocationCommon.b(context)) {
                    AtomicReference<Location> atomicReference = oxz.a;
                    izjVar.b = oxz.c(5000L, context).subscribe(new izj.a(new fzj(izjVar, i2)), new izj.a(new jdf(izjVar, i)));
                } else {
                    oxz.i(context);
                    izjVar.a.a(xyj.j.b.b);
                }
                return s3q0.a;
            case 9:
                kyl.e eVar = (kyl.e) this.c;
                izs izsVar2 = (izs) this.d;
                if ((eVar instanceof kyl.e.d ? (kyl.e.d) eVar : null) != null) {
                    izsVar2.invoke(cxl.u.b);
                }
                return s3q0.a;
            case 10:
                vop vopVar = (vop) this.c;
                VkAuthCredentials vkAuthCredentials = (VkAuthCredentials) this.d;
                ((tdk) vopVar.M.getValue()).b();
                cop copVar = (cop) vopVar.a;
                if (copVar != null) {
                    copVar.setLogin(vkAuthCredentials.b);
                }
                SignUpDataHolder signUpDataHolder = vopVar.p;
                (signUpDataHolder != null ? signUpDataHolder : null).y = vkAuthCredentials.c;
                vopVar.A = true;
                vopVar.D();
                return s3q0.a;
            case 11:
                ((izs) this.c).invoke(new o9t.q.c((zbt) this.d));
                return s3q0.a;
            case 12:
                Set set2 = (Set) this.c;
                m5w m5wVar = (m5w) this.d;
                return "IM_ITEMS_LOADER ImItemHistoryGetByIdCmd\nupdateIds -> " + j5g.g0(set2, ", ", null, null, 0, null, 62) + "\nupdatedItems\n" + j5g.g0(m5wVar.a.a, "\n", null, null, 0, new b40(19), 30) + "\ndeletions -> " + j5g.g0(m5wVar.b, ", ", null, null, 0, null, 62);
            case 13:
                fdj0 fdj0Var = (fdj0) this.c;
                fw20 fw20Var = (fw20) this.d;
                if (fdj0Var.b.c.invoke(SheetValue.Expanded).booleanValue()) {
                    myc0.h(fw20Var.b, null, null, new eix(fdj0Var, null), 3);
                }
                return Boolean.TRUE;
            case 14:
                hg1.a((io.reactivex.rxjava3.disposables.c) this.c, (f5z) this.d);
                return s3q0.a;
            case 15:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) this.c;
                ws00.b bVar = (ws00.b) this.d;
                int i3 = MarketAllReviewsFragment.d0;
                xn50.a.c(marketAllReviewsFragment, new a.g.C1006a(bVar.b));
                return s3q0.a;
            case 16:
                MsgListEmptyViewState.ForDialog forDialog = (MsgListEmptyViewState.ForDialog) this.c;
                com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) this.d;
                qtd0 zb = forDialog.b.zb(forDialog.a.Zb());
                User user = zb instanceof User ? (User) zb : null;
                if (user != null && e43.l(0, 2).contains(Integer.valueOf(user.z))) {
                    int i4 = a.b.$EnumSwitchMapping$0[user.R.ordinal()];
                    if (i4 == 1) {
                        aVar3.e(new b.a(user));
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar3.e(new b.c(user));
                    }
                }
                if (user != null && e43.l(1, 3).contains(Integer.valueOf(user.z))) {
                    int i5 = a.b.$EnumSwitchMapping$0[user.R.ordinal()];
                    if (i5 == 1) {
                        aVar3.e(new b.k(user));
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar3.e(new b.m(user));
                    }
                }
                return s3q0.a;
            case 17:
                cw30 cw30Var = (cw30) this.c;
                cw30Var.b.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(iah0.a(48)).setDuration(cw30Var.c).setInterpolator(new ilq()).withEndAction(new yy4(4, cw30Var, (x3r) this.d)).start();
                return s3q0.a;
            case 18:
                rw40 rw40Var = (rw40) this.c;
                sx40 sx40Var = (sx40) this.d;
                u2b0 u2b0Var = rw40Var.y;
                int i6 = ((sx40.c0) sx40Var).b;
                u2b0.a aVar4 = u2b0.a;
                u2b0Var.B0(i6, new PlaybackActionMeta(17, 0L, 2, null));
                return s3q0.a;
            case 19:
                izs izsVar3 = (izs) this.c;
                tj50.a aVar5 = (tj50.a) this.d;
                ThreadType.a aVar6 = ThreadType.Companion;
                ThreadType[] threadTypeArr = {ThreadType.STATE};
                aVar6.getClass();
                ThreadType.a.a(threadTypeArr);
                return (fm50) izsVar3.invoke(aVar5);
            case 20:
                Context context2 = (Context) this.c;
                vif0 vif0Var = (vif0) this.d;
                int min = Math.min(iah0.a(296.0f), iah0.z(context2) - iah0.a(64.0f));
                ViewGroup.LayoutParams layoutParams = vif0Var.itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = min;
                }
                vif0Var.itemView.requestLayout();
                return s3q0.a;
            case 21:
                return pn00.i(new Pair(16, Collections.singletonList(new vuj0(new p940.a(0), new kly(new hs90(new fi90((du70) this.d, new cwa0(new jkl(), new m4v0(), new tml())))), new fsw()))), new Pair(32, Collections.singletonList(new vuj0(new p940.a(new g7z.a(0), true), new fr9(), new mhz((khz) this.c)))));
            case 22:
                ((izs) this.c).invoke(new nqd0.a(((usd0) this.d).c));
                return s3q0.a;
            case 23:
                ((com.vk.qrcode.p) this.c).invoke((String) this.d);
                return s3q0.a;
            case 24:
                View view = (View) this.c;
                izs izsVar4 = (izs) this.d;
                cl40.a(view, MusicHapticEvent.LIGHT);
                izsVar4.invoke(new sx40.h0(PlayerContext.FULL));
                return s3q0.a;
            case 25:
                znj0 znj0Var = (znj0) this.c;
                h7v h7vVar = (h7v) this.d;
                w4.a aVar7 = new w4.a(null, VkButton.Mode.Outline, 2);
                znj0.a aVar8 = znj0Var.c;
                return new qoj0(Collections.singletonList(new w4(h7vVar, aVar8.b, aVar8.c, aVar8.d, aVar8.e, aVar7, "button_similars", null, 128)));
            case 26:
                onHandUp$lambda$0 = StereoRoomHandsQueueImpl.onHandUp$lambda$0((CallWaitingRoomEvent.HandUp) this.c, (StereoRoomHandsQueueImpl) this.d);
                return onHandUp$lambda$0;
            case 27:
                ((acn0) this.c).h6((ien0) this.d, true);
                return s3q0.a;
            case 28:
                ToolbarVh toolbarVh = (ToolbarVh) this.c;
                String str2 = (String) this.d;
                Toolbar toolbar = toolbarVh.t;
                if (toolbar == null) {
                    toolbar = null;
                }
                toolbarVh.c(toolbar, false);
                q3a q3aVar = toolbarVh.c;
                UIBlockList uIBlockList = toolbarVh.z;
                if (uIBlockList != null && (uIBlockActionClearSection = uIBlockList.E) != null) {
                    str = uIBlockActionClearSection.z;
                }
                q3aVar.b(new v1i0(str2, str), true);
                return s3q0.a;
            default:
                fh5 fh5Var = (fh5) this.c;
                VideoItemAutoPlayVh videoItemAutoPlayVh = (VideoItemAutoPlayVh) this.d;
                yg5 yg5Var = fh5Var.j;
                (yg5Var != null ? yg5Var : null).T(videoItemAutoPlayVh.B);
                return s3q0.a;
        }
    }
}
