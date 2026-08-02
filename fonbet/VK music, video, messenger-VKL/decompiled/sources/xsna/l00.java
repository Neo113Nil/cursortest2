package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.e;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.reactions.ItemReaction;
import com.vk.dto.reactions.ItemReactions;
import com.vk.ecomm.checklist.impl.presentation.model.CommunityCheckListSubscribeVkBusinessArgs;
import com.vk.ecomm.checklist.impl.presentation.model.CommunityCheckListSubscribeVkBusinessResult;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.log.LogLevel;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.metrics.eventtracking.Event;
import com.vk.photos.root.albums.presentation.a;
import com.vk.profile.community.creationonboarding.api.models.CommunityData;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vk.video.polls.nav.PollNavParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cwb0;
import xsna.dw20;
import xsna.emc;
import xsna.ikv0;
import xsna.pq8;
import xsna.pqb0;
import xsna.v88;
import xsna.wab;
import xsna.xse0;
import xsna.yqu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class l00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v128, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v15, types: [xsna.a1e] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ItemReactions a;
        Object obj2;
        ItemReaction itemReaction;
        Object obj3;
        Object parcelable;
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        int i4 = 0;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                ((o00) obj4).d.invoke();
                return s3q0.a;
            case 1:
                ((com.vk.photos.root.albums.presentation.b) obj4).C(new a.d((m7a0) obj));
                return s3q0.a;
            case 2:
                tp2 tp2Var = (tp2) obj4;
                bl2 bl2Var = (bl2) obj;
                xse0.a aVar = tp2Var.d;
                if (aVar != null) {
                    aVar.b(bl2Var);
                }
                tp2Var.d = null;
                tp2Var.c = null;
                return s3q0.a;
            case 3:
                jr4 jr4Var = jr4.this;
                lza0 lza0Var = jr4Var.k;
                ir4 ir4Var = jr4Var.j;
                ur4 b = ir4Var.b();
                if (b != null) {
                    ir4Var.E(lza0Var);
                    String a2 = qr4.a(lza0Var);
                    if (a2 != null) {
                        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                        el3 el3Var = Event.b;
                        Event.a b2 = h5s.b("audio_message_player_view");
                        b2.b("peer_id", Long.valueOf(b.d));
                        b2.b("conversation_message_id", Integer.valueOf(b.e));
                        StringBuilder sb = new StringBuilder();
                        sb.append(b.c);
                        sb.append('_');
                        sb.append(b.b);
                        b2.c("audio_message_id", sb.toString());
                        b2.c("source", a2);
                        b2.c("action", CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
                        com.vk.movika.sdk.base.model.n.c(b2, qr4.a, bVar);
                    }
                }
                return s3q0.a;
            case 4:
                ((dz4) obj4).a((CodecDrainer) obj);
                return s3q0.a;
            case 5:
                ((d06) obj4).c.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 6:
                BlacklistFragment blacklistFragment = (BlacklistFragment) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                blacklistFragment.U.set(booleanValue);
                if (booleanValue) {
                    RecyclerPaginatedView recyclerPaginatedView = blacklistFragment.T;
                    if (recyclerPaginatedView == null) {
                        recyclerPaginatedView = null;
                    }
                    recyclerPaginatedView.qg(null);
                }
                return s3q0.a;
            case 7:
                oh7 oh7Var = (oh7) obj4;
                Bitmap bitmap = (Bitmap) obj;
                if (!oh7Var.e) {
                    oh7Var.c.U(bitmap, false);
                }
                return s3q0.a;
            case 8:
                return new mk7((ViewGroup) obj, (BonusCatalogFragment) obj4);
            case 9:
                return new sl7((ViewGroup) obj, (ql7) obj4);
            case 10:
                v88 v88Var = (v88) obj4;
                pqb0 pqb0Var = (pqb0) obj;
                int i5 = v88.m1;
                if (pqb0Var instanceof pqb0.a) {
                    v88Var.tn();
                } else if (pqb0Var instanceof pqb0.b) {
                    UxPollEntryPointLocation.a aVar2 = UxPollEntryPointLocation.Companion;
                    UxPollEntryPointLocation uxPollEntryPointLocation = v88Var.co().c;
                    aVar2.getClass();
                    int i6 = v88.b.$EnumSwitchMapping$0[UxPollEntryPointLocation.a.a(uxPollEntryPointLocation).ordinal()];
                    if (i6 == 1) {
                        Context requireContext = v88Var.requireContext();
                        String str = ((pqb0.b) pqb0Var).a;
                        PollNavParams pollNavParams = v88Var.j1;
                        if (pollNavParams == null) {
                            pollNavParams = null;
                        }
                        int i7 = pollNavParams.e;
                        dw20.b z0 = new dw20.b(requireContext, tzp0.a(null, 3)).M(R.drawable.vk_icon_like_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).w0(str).z0(17);
                        float f = 48;
                        z0.p0(iah0.a(f)).m0(iah0.a(f)).u0(i7).I0(null);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ikv0.a aVar3 = new ikv0.a(v88Var.requireContext());
                        aVar3.u = new ikv0.d(((pqb0.b) pqb0Var).a, (String) null, (ikv0.d.a) null, 6);
                        aVar3.n();
                    }
                }
                return s3q0.a;
            case 11:
                pq8.a aVar4 = (pq8.a) obj4;
                w9y w9yVar = (w9y) obj;
                aVar4.getClass();
                w9yVar.c(1, "type_id");
                w9yVar.d(Long.valueOf(aVar4.b.b), "dialog_id");
                w9yVar.c(Integer.valueOf(aVar4.c), "msg_cnv_id");
                w9yVar.c(Integer.valueOf(aVar4.a), "position_in_keyboard");
                w9yVar.c(Integer.valueOf(aVar4.d), "carousel_item_position");
                return s3q0.a;
            case 12:
                int intValue = ((Integer) obj).intValue();
                return ImageList.Eb(intValue, intValue, ((ImageList) obj4).b);
            case 13:
                Throwable th = (Throwable) obj;
                f9w f9wVar = ((veb) obj4).d;
                if (!f9wVar.d(LogLevel.ERROR)) {
                    String str2 = f9wVar.a;
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.w(l, L.LogType.e, th, new Object[]{str2, "channels carousel counters update pipe error: "}, null, null, 24);
                    }
                }
                return s3q0.a;
            case 14:
                ((orb) obj4).a.c();
                return s3q0.a;
            case 15:
                xyb xybVar = (xyb) obj4;
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    azbVar.a().c(cwb0.t.e, new we0(xybVar, 14));
                }
                return s3q0.a;
            case 16:
                return new emc.f((emc) obj4, (ViewGroup) obj);
            case 17:
                j03.j(((gwc) obj4).f, (Throwable) obj);
                return s3q0.a;
            case 18:
                return o1d.u((o1d) obj4, (wch0) obj);
            case 19:
                ((x6d) obj4).e.a.a(l3d.b);
                return s3q0.a;
            case 20:
                com.vk.clips.editor.voiceover.impl.a aVar5 = (com.vk.clips.editor.voiceover.impl.a) obj4;
                Throwable th2 = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder("error save result state=");
                ?? r4 = aVar5.l;
                sb2.append(r4 != 0 ? r4 : null);
                sb2.append(' ');
                lyd.a.a("ClipsEditorVoiceoverDelegateImpl", new Exception(sb2.toString(), th2));
                aVar5.b().b.release();
                aVar5.f.d();
                aVar5.f();
                return s3q0.a;
            case 21:
                ((com.vk.clips.interests.impl.feature.a) obj4).T(new lhe((Throwable) obj));
                return s3q0.a;
            case 22:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj4;
                com.vk.clips.playlists.ui.picker.e eVar = (com.vk.clips.playlists.ui.picker.e) obj;
                int i8 = ClipsPlaylistPickerFragment.V;
                if (!(eVar instanceof e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vve.e(((ClipsPlaylistsComponentImpl) clipsPlaylistPickerFragment.Q.getValue()).Ff(), ((e.a) eVar).a, ((Boolean) clipsPlaylistPickerFragment.T.getValue()).booleanValue(), false, 4);
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((cbg) obj).a.getId() == ((iag) obj4).getId());
            case 24:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, (String) obj4);
                qgi0.r(tgi0Var, "communities_catalog_top_bar_create_button");
                return s3q0.a;
            case 25:
                oug ougVar = (oug) obj4;
                xgl0 xgl0Var = (xgl0) obj;
                r3b y = xgl0Var.y();
                int i9 = ougVar.d;
                Msg e = y.b.e(i9);
                MsgFromChannel msgFromChannel = e != null ? (MsgFromChannel) e : null;
                if (msgFromChannel != null) {
                    ItemReactions itemReactions = msgFromChannel.I.p;
                    wab wabVar = ougVar.e;
                    if (!(wabVar instanceof wab.a)) {
                        if (!epx.f(wabVar, wab.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (itemReactions != null) {
                            ArrayList<ItemReaction> arrayList = itemReactions.b;
                            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                            for (ItemReaction itemReaction2 : arrayList) {
                                int i10 = itemReaction2.b;
                                Integer num = itemReactions.e;
                                if (num != null && i10 == num.intValue()) {
                                    itemReaction2 = new ItemReaction(itemReaction2.b, itemReaction2.c - 1);
                                }
                                arrayList2.add(itemReaction2);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (((ItemReaction) next).c > 0) {
                                    arrayList3.add(next);
                                }
                            }
                            ArrayList q = p4g.q(arrayList3);
                            if (!q.isEmpty()) {
                                Iterator it2 = q.iterator();
                                while (it2.hasNext()) {
                                    i4 += ((ItemReaction) it2.next()).c;
                                }
                                a = ItemReactions.a(itemReactions, q, i4, null, 4);
                            }
                        }
                        a = null;
                    } else if (itemReactions == null) {
                        ArrayList arrayList4 = new ArrayList();
                        wab.a aVar6 = (wab.a) wabVar;
                        arrayList4.add(new ItemReaction(aVar6.a, 1));
                        a = new ItemReactions(arrayList4, 1, 0, Integer.valueOf(aVar6.a));
                    } else {
                        ArrayList<ItemReaction> arrayList5 = itemReactions.b;
                        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                        for (ItemReaction itemReaction3 : arrayList5) {
                            int i11 = itemReaction3.b;
                            if (i11 == ((wab.a) wabVar).a) {
                                itemReaction = new ItemReaction(i11, itemReaction3.c + 1);
                            } else {
                                Integer num2 = itemReactions.e;
                                if (num2 != null && i11 == num2.intValue()) {
                                    itemReaction = new ItemReaction(itemReaction3.b, itemReaction3.c - 1);
                                }
                                arrayList6.add(itemReaction3);
                            }
                            itemReaction3 = itemReaction;
                            arrayList6.add(itemReaction3);
                        }
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (((ItemReaction) next2).c > 0) {
                                arrayList7.add(next2);
                            }
                        }
                        ArrayList q2 = p4g.q(arrayList7);
                        Iterator it4 = q2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj2 = it4.next();
                                if (((ItemReaction) obj2).b == ((wab.a) wabVar).a) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            q2.add(new ItemReaction(((wab.a) wabVar).a, 1));
                        }
                        Iterator it5 = q2.iterator();
                        while (it5.hasNext()) {
                            i3 += ((ItemReaction) it5.next()).c;
                        }
                        a = ItemReactions.a(itemReactions, q2, i3, Integer.valueOf(((wab.a) wabVar).a), 4);
                    }
                    msgFromChannel.kc(a);
                    xgl0Var.y().o(msgFromChannel);
                }
                xgl0Var.y().D(i9, null);
                return s3q0.a;
            case 26:
                uwg uwgVar = (uwg) obj4;
                int i12 = uwg.g1;
                Bundle requireArguments = uwgVar.requireArguments();
                String l2 = fpf0.a(CommunityCheckListSubscribeVkBusinessArgs.class).l();
                if (l2 == null) {
                    l2 = "";
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable(l2, CommunityCheckListSubscribeVkBusinessArgs.class);
                    obj3 = (Parcelable) parcelable;
                } else {
                    ?? parcelable2 = requireArguments.getParcelable(l2);
                    obj3 = (CommunityCheckListSubscribeVkBusinessArgs) (parcelable2 instanceof CommunityCheckListSubscribeVkBusinessArgs ? parcelable2 : null);
                }
                CommunityCheckListSubscribeVkBusinessArgs communityCheckListSubscribeVkBusinessArgs = (CommunityCheckListSubscribeVkBusinessArgs) obj3;
                if (communityCheckListSubscribeVkBusinessArgs != null) {
                    FragmentManager supportFragmentManager = uwgVar.kn().getSupportFragmentManager();
                    String l3 = fpf0.a(CommunityCheckListSubscribeVkBusinessResult.class).l();
                    String str3 = l3 != null ? l3 : "";
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(fpf0.a(CommunityCheckListSubscribeVkBusinessResult.class).l(), new CommunityCheckListSubscribeVkBusinessResult(true, communityCheckListSubscribeVkBusinessArgs.b, communityCheckListSubscribeVkBusinessArgs.c));
                    s3q0 s3q0Var = s3q0.a;
                    supportFragmentManager.k0(bundle, str3);
                }
                uwgVar.dismiss();
                return s3q0.a;
            case 27:
                com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b bVar2 = (com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b) obj4;
                awg0 awg0Var = (awg0) obj;
                List<CommunityData> list = ((CommunityCreationOnboardingFinishState) bVar2.b.getCurrentState()).e;
                ArrayList arrayList8 = new ArrayList(c5g.u(list, 10));
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(new io.reactivex.rxjava3.internal.operators.completable.v(rsg0.Z(yfb.x(yqu.a.c(bVar2.c, fkq0.a(((CommunityData) it6.next()).d), null, null, null, null, null, null, null, 510))), io.reactivex.rxjava3.internal.functions.a.g));
                }
                return awg0Var.h(io.reactivex.rxjava3.core.a.m(arrayList8), new cp0(bVar2, 16), new ueb(bVar2, i2));
            case 28:
                ((d4h) obj4).i.invoke(new CommunityProfileAction.a.b((String) obj));
                return s3q0.a;
            default:
                zhf0 zhf0Var = (zhf0) obj;
                iuh iuhVar = ((xph) obj4).b;
                if (zhf0Var != null) {
                    iuhVar.getClass();
                    r7 = new h20(zhf0Var, 20);
                }
                iuhVar.l = r7;
                return s3q0.a;
        }
    }
}
