package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.vk.api.generated.account.dto.AccountGetProfilesSwitcherInfoResponseDto;
import com.vk.api.generated.account.dto.AccountSwitcherInfoDto;
import com.vk.api.generated.account.dto.AccountSwitcherInfoErrorDto;
import com.vk.api.generated.healthCommon.dto.HealthCommonVkrunSyncBackgroundConfigDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stickers.StickerItem;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.folders.impl.configure.d;
import com.vk.folders.impl.configure.g;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.dialogs.b;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.posting.dto.PostCommentNewsEntry;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.menu.PostingMoreMenuMainButtonView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.core.js.bridge.api.events.GetLaunchParams$Response;
import com.vk.superapp.multiaccount.api.AgeGroup;
import com.vk.superapp.multiaccount.api.SimpleDate;
import com.vk.superapp.multiaccount.api.ValidationRequiredType;
import com.vk.superapp.multiaccount.api.f;
import com.vk.superapp.multiaccount.api.j;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.afm;
import xsna.avj0;
import xsna.ayr;
import xsna.bay;
import xsna.bgk0;
import xsna.bn40;
import xsna.c5g;
import xsna.c63;
import xsna.cq;
import xsna.d040;
import xsna.d1v;
import xsna.dfm;
import xsna.dlb;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.f810;
import xsna.f870;
import xsna.ffc;
import xsna.fhq0;
import xsna.fhu;
import xsna.fkq0;
import xsna.flc0;
import xsna.fno;
import xsna.fpq0;
import xsna.fsv;
import xsna.fum0;
import xsna.g5g;
import xsna.gfc;
import xsna.gkx0;
import xsna.glu;
import xsna.gm50;
import xsna.gum0;
import xsna.gzs;
import xsna.h8w;
import xsna.ha10;
import xsna.hmv0;
import xsna.hpm;
import xsna.hpt0;
import xsna.i340;
import xsna.ido;
import xsna.ikv0;
import xsna.iyu0;
import xsna.izs;
import xsna.j5g;
import xsna.jai;
import xsna.jhc0;
import xsna.jmq0;
import xsna.jyu0;
import xsna.k3n0;
import xsna.kw70;
import xsna.lj30;
import xsna.lmm;
import xsna.lqk0;
import xsna.m8b0;
import xsna.m900;
import xsna.m9l0;
import xsna.ndr0;
import xsna.ndw;
import xsna.nvy;
import xsna.o8q0;
import xsna.orj0;
import xsna.ow2;
import xsna.owt;
import xsna.oxh0;
import xsna.p3y;
import xsna.p680;
import xsna.p810;
import xsna.par0;
import xsna.pdm;
import xsna.pf8;
import xsna.pff;
import xsna.pnb0;
import xsna.pvo0;
import xsna.pxh0;
import xsna.qdc0;
import xsna.r480;
import xsna.r55;
import xsna.rec;
import xsna.rz00;
import xsna.s3q0;
import xsna.s9f0;
import xsna.sn;
import xsna.sum0;
import xsna.sxp;
import xsna.t53;
import xsna.tdx0;
import xsna.tgp0;
import xsna.tob0;
import xsna.tww;
import xsna.u7n0;
import xsna.ur4;
import xsna.usi0;
import xsna.v3c;
import xsna.v8f;
import xsna.vfm;
import xsna.vjm;
import xsna.w2w;
import xsna.wfm;
import xsna.wow;
import xsna.wzs;
import xsna.xn50;
import xsna.xuo0;
import xsna.xwr;
import xsna.y1n0;
import xsna.z53;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class y implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:341:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0998 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0912  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ImStoryState imStoryState;
        Map<Long, lj30> map;
        Map map2;
        int i;
        PinnedMsg pinnedMsg;
        w2w w2wVar;
        List<Integer> list;
        boolean z;
        boolean equals;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int i4;
        Boolean bool;
        int i5;
        vjm vjmVar;
        vjm vjmVar2;
        boolean z4;
        b bVar;
        ArrayList arrayList;
        List<String> d;
        Object obj2;
        MultipickerProduct.Owner owner;
        Object obj3;
        Object obj4;
        Object obj5;
        fhq0 c;
        List<AccountSwitcherInfoErrorDto> list2;
        Iterator it;
        AccountSwitcherInfoDto accountSwitcherInfoDto;
        Object obj6;
        j jVar;
        ikv0 ikv0Var;
        switch (this.b) {
            case 0:
                ((l0) this.c).w0().q(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, "Api method storage.getKeys is failed", new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), (String) this.d, 1, null));
                return s3q0.a;
            case 1:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) this.c;
                i.s sVar = (i.s) this.d;
                int i6 = AlbumDetailsFragment.p0;
                a.d dVar = new a.d((PhotoAlbumWrapper) obj, sVar.a, false);
                albumDetailsFragment.getClass();
                xn50.a.c(albumDetailsFragment, dVar);
                return s3q0.a;
            case 2:
                t53.a.b bVar2 = (t53.a.b) this.c;
                t53 t53Var = (t53) this.d;
                if (((tdx0) bVar2.l) != null) {
                    t53Var.d.f(null, null);
                }
                return s3q0.a;
            case 3:
                rec recVar = (rec) this.c;
                ffc ffcVar = (ffc) this.d;
                int i7 = rec.j1;
                gm50.a.a(recVar, ((gfc.a) obj).a, new pf8(ffcVar, 1));
                ffcVar.b(ffcVar.c);
                return s3q0.a;
            case 4:
                ClipsEntryPointDraftsFragment clipsEntryPointDraftsFragment = (ClipsEntryPointDraftsFragment) this.c;
                ido idoVar = (ido) this.d;
                int i8 = ClipsEntryPointDraftsFragment.Y;
                ((v8f) clipsEntryPointDraftsFragment.X.getValue()).d(clipsEntryPointDraftsFragment.requireView(), idoVar.d, (ShortVideoGetTemplateExtendedResponseDto) obj, idoVar.a);
                return s3q0.a;
            case 5:
                ((wzs) this.c).invoke(((CommunityAddContactsState.ContactField) this.d).d, Boolean.valueOf(((xwr) obj).s0()));
                return s3q0.a;
            case 6:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                CommunityAddressesFragment.f fVar = (CommunityAddressesFragment.f) this.d;
                View view = (View) obj;
                View view2 = communityAddressesFragment.W;
                if ((view2 == null ? null : view2).getMeasuredHeight() - view.getMeasuredHeight() > 0) {
                    int measuredHeight = view.getMeasuredHeight();
                    communityAddressesFragment.B0 = measuredHeight;
                    ndr0 ndr0Var = communityAddressesFragment.r0;
                    if (ndr0Var != null) {
                        ndr0Var.q(measuredHeight);
                    }
                }
                CommunityAddressesFragment.ko(communityAddressesFragment, fVar.b);
                return s3q0.a;
            case 7:
                Dialog dialog = (Dialog) this.c;
                afm afmVar = (afm) this.d;
                ndw ndwVar = (ndw) obj;
                if (ndwVar instanceof ndw.a) {
                    imStoryState = ((ndw.a) ndwVar).a.get(dialog.Zb());
                    if (imStoryState == null) {
                        imStoryState = ImStoryState.NONE;
                    }
                } else {
                    if (!epx.f(ndwVar, ndw.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imStoryState = ImStoryState.NONE;
                }
                dfm dfmVar = afmVar.z;
                if (dfmVar != null) {
                    dfmVar.v(imStoryState);
                }
                return s3q0.a;
            case 8:
                wfm wfmVar = (wfm) this.c;
                w2w w2wVar2 = (w2w) this.d;
                int i9 = wfmVar.e;
                d040 o = w2wVar2.I0().o();
                Collection<com.vk.im.engine.models.dialogs.a> collection = wfmVar.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(collection, 10));
                Iterator<T> it2 = collection.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((com.vk.im.engine.models.dialogs.a) it2.next()).a));
                }
                Map J = w2wVar2.I0().b().e().J(i9, arrayList2);
                Map<Long, lj30> R = o.R(arrayList2);
                int a = cq.a(w2wVar2);
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    com.vk.im.engine.models.dialogs.a aVar = (com.vk.im.engine.models.dialogs.a) it3.next();
                    long j = aVar.a;
                    BusinessNotifyInfo businessNotifyInfo = aVar.z;
                    int i10 = aVar.g;
                    boolean z5 = aVar.D;
                    vjm vjmVar3 = aVar.c;
                    b bVar3 = (b) J.get(Long.valueOf(j));
                    Iterator it4 = it3;
                    lj30 lj30Var = R.get(Long.valueOf(j));
                    if (bVar3 == null) {
                        gkx0 b = lmm.b(vjmVar3.c(z5 && i10 > 0).b(false).b, vjmVar3.c, ((lj30Var != null && !lj30Var.j) && (lj30Var != null && lj30Var.m)) ? lj30Var.c : 0, lj30Var != null ? lj30Var.c() : false);
                        PinnedMsg pinnedMsg2 = aVar.m;
                        bVar = new b(aVar, null, null, b, 0, 0, null, null, pinnedMsg2 != null ? pinnedMsg2.Bb(new vfm(0, w2wVar2)) : null, aVar.m != null, null, null, null, false, false, true, null, businessNotifyInfo != null, a, aVar.C, aVar.D, null, -1075314722, 2090623);
                        w2wVar = w2wVar2;
                        i = i9;
                        map = R;
                        map2 = J;
                        arrayList = arrayList3;
                    } else {
                        map = R;
                        PinnedMsg pinnedMsg3 = aVar.m;
                        map2 = J;
                        List<Integer> list3 = aVar.F;
                        ConversationCard conversationCard = aVar.o;
                        InfoBar infoBar = aVar.n;
                        if (pinnedMsg3 != null) {
                            i = i9;
                            pinnedMsg = pinnedMsg3.Bb(new pff(w2wVar2, 15));
                        } else {
                            i = i9;
                            pinnedMsg = null;
                        }
                        PinnedMsg pinnedMsg4 = bVar3.t;
                        List<Integer> list4 = bVar3.V;
                        DraftMsg draftMsg = bVar3.v;
                        int i11 = bVar3.k;
                        w2wVar = w2wVar2;
                        Boolean bool2 = bVar3.n;
                        ArrayList arrayList4 = arrayList3;
                        ConversationCard conversationCard2 = bVar3.x;
                        InfoBar infoBar2 = bVar3.w;
                        if (pinnedMsg == null || pinnedMsg4 == null) {
                            list = list3;
                        } else {
                            list = list3;
                            if (pinnedMsg.c == pinnedMsg4.c) {
                                hpt0.p(pinnedMsg, pinnedMsg4);
                            }
                        }
                        boolean z6 = pinnedMsg == null ? false : (pinnedMsg4 == null || pinnedMsg.c != pinnedMsg4.c) ? true : bVar3.u;
                        GroupCallInProgress groupCallInProgress = aVar.q;
                        GroupCallInProgress groupCallInProgress2 = bVar3.A;
                        if (groupCallInProgress != null) {
                            if (epx.f(groupCallInProgress.c, groupCallInProgress2 != null ? groupCallInProgress2.c : null)) {
                                z = bVar3.B;
                                BotKeyboard botKeyboard = aVar.s;
                                boolean z7 = botKeyboard != null ? false : botKeyboard.equals(bVar3.D) ? bVar3.E : true;
                                BusinessNotifyInfo businessNotifyInfo2 = bVar3.M;
                                boolean z8 = businessNotifyInfo != null && (businessNotifyInfo2 == null || bVar3.N || businessNotifyInfo.c > businessNotifyInfo2.c);
                                boolean f = epx.f(infoBar, infoBar2);
                                boolean f2 = epx.f(conversationCard, conversationCard2);
                                equals = Boolean.valueOf(aVar.h).equals(bool2);
                                z2 = wfmVar.f;
                                PinnedMsg pinnedMsg5 = pinnedMsg;
                                i2 = aVar.d;
                                i3 = bVar3.g;
                                z3 = i2 >= i3 ? true : z2;
                                i4 = aVar.f;
                                if (i4 <= 0) {
                                    z3 = true;
                                }
                                if (z3) {
                                    bool = bool2;
                                    i5 = i2;
                                } else {
                                    bool = bool2;
                                    i5 = i11;
                                }
                                Integer num = wfmVar.d;
                                if (i2 >= i3) {
                                    z2 = true;
                                }
                                if (i4 <= 0) {
                                    z2 = true;
                                }
                                int i12 = bVar3.j;
                                if (z2) {
                                    i12 = i10;
                                } else if (num != null && i11 < num.intValue()) {
                                    i12--;
                                }
                                vjmVar = bVar3.e;
                                if (vjmVar != null && vjmVar.b == vjmVar3.b) {
                                    vjmVar = null;
                                }
                                vjm vjmVar4 = aVar.c;
                                boolean z9 = !z5 && i10 > 0;
                                vjm vjmVar5 = vjmVar == null ? vjmVar4 : vjmVar;
                                boolean d2 = draftMsg.d();
                                int i13 = i12;
                                boolean z10 = lj30Var == null && !lj30Var.j;
                                if (lj30Var != null) {
                                    vjmVar2 = vjmVar4;
                                    if (lj30Var.m) {
                                        z4 = true;
                                        gkx0 b2 = lmm.b(vjmVar5.c(z9).b(d2).b, vjmVar5.c, (z10 || !z4) ? 0 : lj30Var.c, lj30Var == null ? lj30Var.c() : false);
                                        List<Integer> list5 = list4;
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj7 : list5) {
                                            gkx0 gkx0Var = b2;
                                            List<Integer> list6 = list;
                                            if (list6.contains(Integer.valueOf(((Number) obj7).intValue()))) {
                                                arrayList5.add(obj7);
                                            }
                                            list = list6;
                                            b2 = gkx0Var;
                                        }
                                        gkx0 gkx0Var2 = b2;
                                        List<Integer> list7 = list;
                                        hpm c2 = sn.c(w2wVar);
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Object obj8 : list5) {
                                            ArrayList arrayList7 = arrayList5;
                                            if (!list7.contains(Integer.valueOf(((Number) obj8).intValue()))) {
                                                arrayList6.add(obj8);
                                            }
                                            arrayList5 = arrayList7;
                                        }
                                        ArrayList arrayList8 = arrayList5;
                                        c2.j0(j, arrayList6);
                                        if (equals) {
                                            bool = null;
                                        }
                                        bVar = new b(aVar, vjmVar2, vjmVar, gkx0Var2, i5, i13, bool, bVar3.p, pinnedMsg5, z6, aVar.j.a != WritePermission.State.ENABLED ? draftMsg : new DraftMsg(w2wVar.f1(), null, null, null, null, null, 62, null), f ? infoBar : infoBar2, f2 ? conversationCard : conversationCard2, f ? false : bVar3.y, z, z7, bVar3.I, z8, a, aVar.C, aVar.D, arrayList8, -1241033786, 2074235);
                                        arrayList = arrayList4;
                                    }
                                } else {
                                    vjmVar2 = vjmVar4;
                                }
                                z4 = false;
                                gkx0 b22 = lmm.b(vjmVar5.c(z9).b(d2).b, vjmVar5.c, (z10 || !z4) ? 0 : lj30Var.c, lj30Var == null ? lj30Var.c() : false);
                                List<Integer> list52 = list4;
                                ArrayList arrayList52 = new ArrayList();
                                while (r5.hasNext()) {
                                }
                                gkx0 gkx0Var22 = b22;
                                List<Integer> list72 = list;
                                hpm c22 = sn.c(w2wVar);
                                ArrayList arrayList62 = new ArrayList();
                                while (r6.hasNext()) {
                                }
                                ArrayList arrayList82 = arrayList52;
                                c22.j0(j, arrayList62);
                                if (equals) {
                                }
                                bVar = new b(aVar, vjmVar2, vjmVar, gkx0Var22, i5, i13, bool, bVar3.p, pinnedMsg5, z6, aVar.j.a != WritePermission.State.ENABLED ? draftMsg : new DraftMsg(w2wVar.f1(), null, null, null, null, null, 62, null), f ? infoBar : infoBar2, f2 ? conversationCard : conversationCard2, f ? false : bVar3.y, z, z7, bVar3.I, z8, a, aVar.C, aVar.D, arrayList82, -1241033786, 2074235);
                                arrayList = arrayList4;
                            }
                        }
                        z = false;
                        BotKeyboard botKeyboard2 = aVar.s;
                        if (botKeyboard2 != null) {
                        }
                        BusinessNotifyInfo businessNotifyInfo22 = bVar3.M;
                        if (businessNotifyInfo != null) {
                            boolean f3 = epx.f(infoBar, infoBar2);
                            boolean f22 = epx.f(conversationCard, conversationCard2);
                            equals = Boolean.valueOf(aVar.h).equals(bool2);
                            z2 = wfmVar.f;
                            PinnedMsg pinnedMsg52 = pinnedMsg;
                            i2 = aVar.d;
                            i3 = bVar3.g;
                            if (i2 >= i3) {
                            }
                            i4 = aVar.f;
                            if (i4 <= 0) {
                            }
                            if (z3) {
                            }
                            Integer num2 = wfmVar.d;
                            if (i2 >= i3) {
                            }
                            if (i4 <= 0) {
                            }
                            int i122 = bVar3.j;
                            if (z2) {
                            }
                            vjmVar = bVar3.e;
                            if (vjmVar != null) {
                                vjmVar = null;
                            }
                            vjm vjmVar42 = aVar.c;
                            if (z5) {
                            }
                            if (vjmVar == null) {
                            }
                            boolean d22 = draftMsg.d();
                            int i132 = i122;
                            boolean z102 = lj30Var == null && !lj30Var.j;
                            if (lj30Var != null) {
                            }
                            z4 = false;
                            gkx0 b222 = lmm.b(vjmVar5.c(z9).b(d22).b, vjmVar5.c, (z102 || !z4) ? 0 : lj30Var.c, lj30Var == null ? lj30Var.c() : false);
                            List<Integer> list522 = list4;
                            ArrayList arrayList522 = new ArrayList();
                            while (r5.hasNext()) {
                            }
                            gkx0 gkx0Var222 = b222;
                            List<Integer> list722 = list;
                            hpm c222 = sn.c(w2wVar);
                            ArrayList arrayList622 = new ArrayList();
                            while (r6.hasNext()) {
                            }
                            ArrayList arrayList822 = arrayList522;
                            c222.j0(j, arrayList622);
                            if (equals) {
                            }
                            bVar = new b(aVar, vjmVar2, vjmVar, gkx0Var222, i5, i132, bool, bVar3.p, pinnedMsg52, z6, aVar.j.a != WritePermission.State.ENABLED ? draftMsg : new DraftMsg(w2wVar.f1(), null, null, null, null, null, 62, null), f3 ? infoBar : infoBar2, f22 ? conversationCard : conversationCard2, f3 ? false : bVar3.y, z, z7, bVar3.I, z8, a, aVar.C, aVar.D, arrayList822, -1241033786, 2074235);
                            arrayList = arrayList4;
                        }
                        boolean f32 = epx.f(infoBar, infoBar2);
                        boolean f222 = epx.f(conversationCard, conversationCard2);
                        equals = Boolean.valueOf(aVar.h).equals(bool2);
                        z2 = wfmVar.f;
                        PinnedMsg pinnedMsg522 = pinnedMsg;
                        i2 = aVar.d;
                        i3 = bVar3.g;
                        if (i2 >= i3) {
                        }
                        i4 = aVar.f;
                        if (i4 <= 0) {
                        }
                        if (z3) {
                        }
                        Integer num22 = wfmVar.d;
                        if (i2 >= i3) {
                        }
                        if (i4 <= 0) {
                        }
                        int i1222 = bVar3.j;
                        if (z2) {
                        }
                        vjmVar = bVar3.e;
                        if (vjmVar != null) {
                        }
                        vjm vjmVar422 = aVar.c;
                        if (z5) {
                        }
                        if (vjmVar == null) {
                        }
                        boolean d222 = draftMsg.d();
                        int i1322 = i1222;
                        boolean z1022 = lj30Var == null && !lj30Var.j;
                        if (lj30Var != null) {
                        }
                        z4 = false;
                        gkx0 b2222 = lmm.b(vjmVar5.c(z9).b(d222).b, vjmVar5.c, (z1022 || !z4) ? 0 : lj30Var.c, lj30Var == null ? lj30Var.c() : false);
                        List<Integer> list5222 = list4;
                        ArrayList arrayList5222 = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        gkx0 gkx0Var2222 = b2222;
                        List<Integer> list7222 = list;
                        hpm c2222 = sn.c(w2wVar);
                        ArrayList arrayList6222 = new ArrayList();
                        while (r6.hasNext()) {
                        }
                        ArrayList arrayList8222 = arrayList5222;
                        c2222.j0(j, arrayList6222);
                        if (equals) {
                        }
                        bVar = new b(aVar, vjmVar2, vjmVar, gkx0Var2222, i5, i1322, bool, bVar3.p, pinnedMsg522, z6, aVar.j.a != WritePermission.State.ENABLED ? draftMsg : new DraftMsg(w2wVar.f1(), null, null, null, null, null, 62, null), f32 ? infoBar : infoBar2, f222 ? conversationCard : conversationCard2, f32 ? false : bVar3.y, z, z7, bVar3.I, z8, a, aVar.C, aVar.D, arrayList8222, -1241033786, 2074235);
                        arrayList = arrayList4;
                    }
                    arrayList.add(bVar);
                    it3 = it4;
                    arrayList3 = arrayList;
                    R = map;
                    J = map2;
                    i9 = i;
                    w2wVar2 = w2wVar;
                }
                w2w w2wVar3 = w2wVar2;
                Map<Long, lj30> map3 = R;
                Map map4 = J;
                ArrayList arrayList9 = arrayList3;
                w2wVar3.I0().b().e().Y(i9, arrayList9);
                pdm c3 = w2wVar3.I0().b().c();
                List O0 = j5g.O0(c3.k().a());
                Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    b bVar4 = (b) it5.next();
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj9 : O0) {
                        int i14 = bVar4.W;
                        fum0 fum0Var = ((gum0) obj9).d;
                        if ((fum0Var.b ^ (i14 & fum0Var.a)) == 0) {
                            arrayList10.add(obj9);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(c5g.u(arrayList10, 10));
                    Iterator it6 = arrayList10.iterator();
                    while (it6.hasNext()) {
                        arrayList11.add(((gum0) it6.next()).a);
                    }
                    long j2 = bVar4.b;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    c3.b.b().h(new dlb(c3, Peer.a.b(j2), arrayList11, 3));
                }
                new h8w(new h8w.a.b(wfmVar.c, map4, map3, a, wfmVar.f)).o(w2wVar3);
                return arrayList9;
            case 9:
                g gVar = (g) this.c;
                d dVar2 = (d) this.d;
                if ((((ayr) obj).a.size() - ((g.d) gVar).b) - 1 <= 30) {
                    dVar2.j.a(30);
                }
                return s3q0.a;
            case 10:
                fhu fhuVar = (fhu) this.c;
                sxp sxpVar = (sxp) obj;
                long j3 = ((DialogExt) this.d).e;
                fhuVar.getClass();
                return Boolean.valueOf(((sxpVar instanceof r480) && ((r480) sxpVar).c.b(Long.valueOf(j3))) || (sxpVar instanceof OnCacheInvalidateEvent) || (sxpVar instanceof p680));
            case 11:
                HealthCommonVkrunSyncBackgroundConfigDto healthCommonVkrunSyncBackgroundConfigDto = (HealthCommonVkrunSyncBackgroundConfigDto) this.c;
                hmv0 hmv0Var = ((d1v) this.d).d;
                if (!jyu0.a((iyu0) obj) || !healthCommonVkrunSyncBackgroundConfigDto.e() || (d = healthCommonVkrunSyncBackgroundConfigDto.d()) == null || d.isEmpty()) {
                    hmv0Var.a();
                } else {
                    List<String> d3 = healthCommonVkrunSyncBackgroundConfigDto.d();
                    if (d3 != null) {
                        hmv0Var.c(f870.B(d3, ";", null));
                    }
                }
                return s3q0.a;
            case 12:
                tww.b bVar5 = (tww.b) this.c;
                bVar5.n.u0(bVar5.itemView.getContext(), new u7n0.a((UniversalWidget) this.d, SchemeStat$TypeUniversalWidget.ElementUiType.ITEM, 0, 12), (WebAction) obj);
                return s3q0.a;
            case 13:
                p3y p3yVar = (p3y) this.c;
                String str = (String) this.d;
                y1n0 X0 = p3yVar.X0();
                X0.getClass();
                com.vk.superapp.base.js.bridge.b.p(X0.a, new JsMethod("VKWebAppGetLaunchParams"), new GetLaunchParams$Response(null, bay.e(((z53) obj).a.put(CommonUrlParts.REQUEST_ID, str).toString()), str, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 14:
                ArrayList arrayList12 = (ArrayList) this.c;
                f810 f810Var = (f810) this.d;
                MarketSearchResponseDto marketSearchResponseDto = (MarketSearchResponseDto) obj;
                List<MarketMarketItemDto> d4 = marketSearchResponseDto.d();
                ArrayList arrayList13 = new ArrayList(c5g.u(d4, 10));
                for (MarketMarketItemDto marketMarketItemDto : d4) {
                    boolean z11 = f810Var.k;
                    UserId q = marketMarketItemDto.q();
                    Iterator it7 = arrayList12.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj2 = it7.next();
                            if (epx.f(((glu) obj2).b, fkq0.a(q))) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    glu gluVar = (glu) obj2;
                    if (gluVar != null) {
                        UserId userId = gluVar.b;
                        String str2 = gluVar.d;
                        Boolean bool3 = gluVar.f;
                        owner = new MultipickerProduct.Owner(userId, str2, bool3 != null ? bool3.booleanValue() : false);
                    } else {
                        owner = null;
                    }
                    arrayList13.add(new ha10(fno.a(marketMarketItemDto, z11, owner)));
                }
                return new p810.c(marketSearchResponseDto.getCount(), arrayList13, arrayList12);
            case 15:
                i340 i340Var = (i340) this.c;
                List list8 = (List) this.d;
                AccountGetProfilesSwitcherInfoResponseDto accountGetProfilesSwitcherInfoResponseDto = (AccountGetProfilesSwitcherInfoResponseDto) obj;
                List<AccountSwitcherInfoDto> e = accountGetProfilesSwitcherInfoResponseDto.e();
                List<AccountSwitcherInfoErrorDto> d5 = accountGetProfilesSwitcherInfoResponseDto.d();
                r55 r55Var = r55.a;
                int i15 = r55.f().b.b;
                ArrayList arrayList14 = new ArrayList(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    arrayList14.add(null);
                }
                Iterator it8 = e.iterator();
                while (it8.hasNext()) {
                    AccountSwitcherInfoDto accountSwitcherInfoDto2 = (AccountSwitcherInfoDto) it8.next();
                    UserId userId2 = accountSwitcherInfoDto2.getUserId();
                    String k = drm0.N(accountSwitcherInfoDto2.n()) ? accountSwitcherInfoDto2.k() : accountSwitcherInfoDto2.k() + ' ' + accountSwitcherInfoDto2.n();
                    String f4 = accountSwitcherInfoDto2.f();
                    String o2 = accountSwitcherInfoDto2.o();
                    String j4 = accountSwitcherInfoDto2.j();
                    int i17 = accountSwitcherInfoDto2.i();
                    Boolean M = accountSwitcherInfoDto2.M();
                    Boolean D = accountSwitcherInfoDto2.D();
                    Integer d6 = accountSwitcherInfoDto2.d();
                    Boolean K = accountSwitcherInfoDto2.K();
                    AgeGroup.a aVar2 = AgeGroup.Companion;
                    Integer e2 = accountSwitcherInfoDto2.e();
                    aVar2.getClass();
                    AgeGroup a2 = AgeGroup.a.a(e2);
                    AccountProfileType.a aVar3 = AccountProfileType.Companion;
                    Integer p = accountSwitcherInfoDto2.p();
                    aVar3.getClass();
                    AccountProfileType a3 = AccountProfileType.a.a(p);
                    if (a3 == null) {
                        a3 = AccountProfileType.NORMAL;
                    }
                    AccountProfileType accountProfileType = a3;
                    Iterator it9 = i340Var.a.e().iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            obj6 = it9.next();
                            accountSwitcherInfoDto = accountSwitcherInfoDto2;
                            list2 = d5;
                            it = it8;
                            if (((usi0.a) obj6).c().a.b != accountSwitcherInfoDto.getUserId().b) {
                                accountSwitcherInfoDto2 = accountSwitcherInfoDto;
                                d5 = list2;
                                it8 = it;
                            }
                        } else {
                            list2 = d5;
                            it = it8;
                            accountSwitcherInfoDto = accountSwitcherInfoDto2;
                            obj6 = null;
                        }
                    }
                    usi0 usi0Var = (usi0) obj6;
                    usi0.a.b bVar6 = usi0Var instanceof usi0.a.b ? (usi0.a.b) usi0Var : null;
                    com.vk.superapp.multiaccount.api.g gVar2 = new com.vk.superapp.multiaccount.api.g(userId2, k, f4, o2, j4, i17, M, D, d6, K, a2, accountProfileType, bVar6 != null ? bVar6.g : null, accountSwitcherInfoDto.G());
                    Integer g = accountSwitcherInfoDto.g();
                    if (g == null) {
                        g = accountSwitcherInfoDto.u();
                    }
                    if (accountSwitcherInfoDto.C() || (g == null && accountSwitcherInfoDto.F())) {
                        jVar = j.c.b;
                    } else if (g != null) {
                        SimpleDate.b bVar7 = SimpleDate.e;
                        long intValue = g.intValue() * 1000;
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(intValue);
                        jVar = new j.b(new SimpleDate(calendar, true));
                    } else {
                        jVar = j.d.b;
                    }
                    arrayList14.set(accountSwitcherInfoDto.l(), accountSwitcherInfoDto.B() ? new f.c.a(gVar2, jVar) : accountSwitcherInfoDto.F() ? new f.c.b(gVar2, jVar) : new f.a.C1892a(gVar2));
                    d5 = list2;
                    it8 = it;
                }
                for (AccountSwitcherInfoErrorDto accountSwitcherInfoErrorDto : d5) {
                    usi0.a aVar4 = (usi0.a) j5g.b0(accountSwitcherInfoErrorDto.e(), list8);
                    UserId userId3 = (aVar4 == null || (c = aVar4.c()) == null) ? null : c.a;
                    Iterator<T> it10 = i340Var.d().iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            obj3 = it10.next();
                            if (epx.f(((f) obj3).a().b, userId3)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    f fVar2 = (f) obj3;
                    if (fVar2 == null) {
                        Iterator<T> it11 = i340Var.h.a().c().iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                obj4 = it11.next();
                                if (epx.f(((f.c) obj4).a().b, userId3)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        fVar2 = (f.c) obj4;
                        if (fVar2 == null) {
                            Iterator<T> it12 = i340Var.g.a().c().iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    obj5 = it12.next();
                                    if (epx.f(((f.a) obj5).a().b, userId3)) {
                                    }
                                } else {
                                    obj5 = null;
                                }
                            }
                            fVar2 = (f.a) obj5;
                        }
                    }
                    if (fVar2 == null) {
                        arrayList14.set(accountSwitcherInfoErrorDto.e(), null);
                        par0 par0Var = par0.a;
                        String str3 = "Couldn't find user at " + accountSwitcherInfoErrorDto.e();
                        par0Var.getClass();
                        par0.a(str3);
                    } else {
                        if (accountSwitcherInfoErrorDto.d() != 1117) {
                            fVar2 = new f.c.C1893c(fVar2.a(), ValidationRequiredType.FULL_AUTH);
                        }
                        arrayList14.set(accountSwitcherInfoErrorDto.e(), fVar2);
                    }
                }
                ArrayList arrayList15 = new ArrayList();
                Iterator it13 = arrayList14.iterator();
                while (it13.hasNext()) {
                    f fVar3 = (f) it13.next();
                    if (fVar3 != null) {
                        arrayList15.add(fVar3);
                    }
                }
                ArrayList E = g5g.E(arrayList15, f.a.class);
                ArrayList arrayList16 = new ArrayList();
                Iterator it14 = arrayList14.iterator();
                while (it14.hasNext()) {
                    f fVar4 = (f) it14.next();
                    if (fVar4 != null) {
                        arrayList16.add(fVar4);
                    }
                }
                return new i340.e(E, g5g.E(arrayList16, f.c.class));
            case 16:
                ow2 ow2Var = (ow2) this.c;
                fsv fsvVar = (fsv) this.d;
                View view3 = (View) obj;
                T t = ow2Var.l;
                if (t != 0) {
                    fsvVar.Ig(view3.getId(), t);
                }
                return s3q0.a;
            case 17:
                NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.c;
                f.d.b bVar8 = (f.d.b) this.d;
                int i18 = NewsfeedFilterListFragment2.X;
                newsfeedFilterListFragment2.getFeature().C(new b.c(bVar8.a, bVar8.b, bVar8.c));
                newsfeedFilterListFragment2.getFeature().V(new f.a.C1064a(bVar8.a));
                ((ikv0) obj).a();
                return s3q0.a;
            case 18:
                ((tgp0) obj).n((bgk0) this.c, (ur4) this.d);
                return s3q0.a;
            case 19:
                return m8b0.p((String) this.d, (m8b0) this.c);
            case 20:
                Calendar calendar2 = (Calendar) this.c;
                tob0 tob0Var = (tob0) this.d;
                Calendar d7 = pvo0.d();
                d7.setTimeInMillis(((Long) obj).longValue());
                int i19 = d7.get(1);
                int i20 = d7.get(2);
                int i21 = d7.get(5);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(calendar2.getTimeInMillis());
                calendar3.set(i19, i20, i21);
                long timeInMillis = calendar3.getTimeInMillis();
                xuo0 xuo0Var = xuo0.a;
                xuo0Var.getClass();
                Object[] objArr = timeInMillis < TimeUnit.MINUTES.toMillis(5L) + xuo0.a();
                long timeInMillis2 = calendar3.getTimeInMillis();
                xuo0Var.getClass();
                boolean z12 = timeInMillis2 > TimeUnit.DAYS.toMillis(30L) + xuo0.a();
                if (objArr != true && !z12) {
                    calendar2.set(i19, i20, i21);
                    xn50.a.c(tob0Var.a, new pnb0.a.d(calendar2.getTimeInMillis()));
                    return s3q0.a;
                }
                int i22 = objArr != false ? R.string.poll_start_limit_error : R.string.poll_end_limit_error;
                Context mo2getContext = tob0Var.b.mo2getContext();
                if (mo2getContext != null) {
                    tob0.a(mo2getContext, mo2getContext.getString(i22));
                }
                return s3q0.a;
            case 21:
                return ((com.vk.newsfeed.impl.posting.a) this.c).d((ArrayList) this.d, (flc0) obj);
            case 22:
                PostingMoreMenuMainButtonView postingMoreMenuMainButtonView = (PostingMoreMenuMainButtonView) this.c;
                jhc0 jhc0Var = (jhc0) this.d;
                if (!postingMoreMenuMainButtonView.v) {
                    qdc0 qdc0Var = jhc0Var.t;
                    if (qdc0Var != null) {
                        qdc0Var.Te();
                    }
                    gzs<s3q0> gzsVar = jhc0Var.u;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                return s3q0.a;
            case 23:
                PostCommentNewsEntry postCommentNewsEntry = (PostCommentNewsEntry) this.c;
                NewsComment newsComment = (NewsComment) this.d;
                Integer num3 = (Integer) obj;
                num3.getClass();
                int i23 = postCommentNewsEntry.m;
                UserId userId4 = postCommentNewsEntry.i;
                String str4 = postCommentNewsEntry.p;
                int i24 = newsComment.k;
                return new owt(i23, userId4, str4, num3, i24 > 0 ? Integer.valueOf(i24) : null, 0, null, null, null, 992);
            case 24:
                s9f0 s9f0Var = (s9f0) this.c;
                orj0 orj0Var = (orj0) this.d;
                List<StickerItem> list9 = (List) obj;
                s9f0Var.c.onNext(list9);
                m9l0 m9l0Var = s9f0Var.a;
                m9l0Var.a(new avj0(list9, m9l0Var));
                orj0Var.invoke();
                return s3q0.a;
            case 25:
                ArrayList arrayList17 = (ArrayList) this.c;
                izs izsVar = (izs) this.d;
                nvy nvyVar = (nvy) obj;
                wow wowVar = new wow(arrayList17);
                com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.a aVar5 = com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.a.b;
                nvyVar.e(arrayList17.size(), aVar5 != null ? new v3c(1, wowVar, aVar5) : null, new oxh0(wowVar), new jai(802480018, new pxh0(wowVar, izsVar), true));
                return s3q0.a;
            case 26:
                izs izsVar2 = (izs) this.c;
                List list10 = (List) this.d;
                ((Boolean) obj).getClass();
                ArrayList arrayList18 = new ArrayList(c5g.u(new wow(list10), 10));
                Iterator it15 = list10.iterator();
                while (it15.hasNext()) {
                    arrayList18.add(sum0.d.a((sum0.d) it15.next(), null, null, null, false, null, false, null, false, 0, null, false, !r7.l, 2047));
                }
                izsVar2.invoke(arrayList18);
                return s3q0.a;
            case 27:
                k3n0 k3n0Var = (k3n0) this.c;
                Context context = (Context) this.d;
                VKList vKList = (VKList) obj;
                bn40.g("HSNMan", "playAll:", Integer.valueOf(vKList.size()));
                if (vKList.isEmpty()) {
                    k3n0Var.a(context);
                } else {
                    k3n0Var.e.N0(new lqk0((StartPlaySource) null, (MusicTrack) null, vKList, k3n0Var.d, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 883));
                }
                return s3q0.a;
            case 28:
                o8q0 o8q0Var = (o8q0) this.c;
                Good good = (Good) this.d;
                ikv0 ikv0Var2 = (ikv0) obj;
                c63 c63Var = c63.a;
                Activity b3 = c63.b();
                if (b3 != null) {
                    ikv0Var = ikv0Var2;
                    o8q0Var.a.e(b3, new rz00(good, CommonMarketStat$TypeRefSource.MINIAPPS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532));
                } else {
                    ikv0Var = ikv0Var2;
                }
                ikv0Var.a();
                return s3q0.a;
            default:
                jmq0 jmq0Var = (jmq0) this.c;
                String str5 = (String) obj;
                if (jmq0Var.c.a(((ExtendedUserProfile) this.d).a.c)) {
                    m900<String, ImageSize> m900Var = ImageSize.e;
                    Intent putExtra = new Intent("com.vkontakte.android.USER_PHOTO_CHANGED").putExtra("photo", str5).putExtra("id", jmq0Var.b.a).putExtra("reload_wall", true).putExtra("image", new Image((List<ImageSize>) e43.m(ImageSize.b.b(str5))));
                    fpq0 fpq0Var = jmq0Var.k;
                    (fpq0Var != null ? fpq0Var : null).B(new f.g(putExtra));
                    jmq0Var.c.l(str5);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ y(kw70 kw70Var, bgk0 bgk0Var, ur4 ur4Var) {
        this.b = 18;
        this.c = bgk0Var;
        this.d = ur4Var;
    }
}
