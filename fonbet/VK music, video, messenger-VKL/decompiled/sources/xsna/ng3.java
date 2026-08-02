package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.stat.data.PhotoParamsEntity;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.channels.api.ChannelFilter;
import com.vk.clips.editor.templates.impl.player.MusicPlayerState;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.documents.impl.ui.fragments.AttachDocumentsFragment;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.ecomm.cart.impl.cart.ui.dialog.CartCommunityMenuAction;
import com.vk.ecomm.catalog.impl.geo.e;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsInitDecorPayload;
import com.vk.im.chat.clips.decoration.api.models.ImClipsDecorationKey;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.reporters.api.analytics.click.ImChatManagementClickAnalyticsItem;
import com.vk.log.L;
import com.vk.managed_groups.impl.list.ManagedGroupsListFragment;
import com.vk.managed_groups.impl.list.g;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.network.kbh.state.NetworkState;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.newsfeed.utils.NewsDebuggerPoint;
import com.vk.voip.ui.calls.presentation.model.list.FriendItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c99;
import xsna.cwb0;
import xsna.dis;
import xsna.f0r;
import xsna.fi3;
import xsna.gm50;
import xsna.k840;
import xsna.q2j;
import xsna.qvq;
import xsna.rv9;
import xsna.t0d;
import xsna.tlo0;
import xsna.ubg;
import xsna.v1j;
import xsna.wk50;
import xsna.xaz;
import xsna.xtn;
import xsna.y7f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ng3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ng3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        b34<T, VH> b34Var;
        String d;
        VkPlaceholder.a.C0857a c0857a;
        CatalogProfileLocalState catalogProfileLocalState;
        Map map;
        int i = 10;
        int i2 = 3;
        boolean z = false;
        int i3 = 1;
        switch (this.b) {
            case 0:
                m0g0 m0g0Var = (m0g0) this.c;
                fi3.b bVar = ((og3) this.d).p;
                m0g0Var.e((bVar == null ? null : bVar).b);
                return s3q0.a;
            case 1:
                AttachDocumentsFragment attachDocumentsFragment = (AttachDocumentsFragment) this.c;
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                xtn.a aVar = (xtn.a) obj;
                int i4 = AttachDocumentsFragment.R0;
                if (!epx.f(attachDocumentsFragment.q0, aVar.d)) {
                    throw new IllegalStateException("Requested query is not equals to result");
                }
                if (cVar != null && cVar.i() == 0 && (b34Var = attachDocumentsFragment.a0) != 0) {
                    b34Var.W0(aVar.b);
                }
                return new VkPaginationList(new ArrayList(aVar.a), aVar.e, aVar.c, 0, 8, null);
            case 2:
                rjo0 rjo0Var = (rjo0) this.c;
                izs izsVar = (izs) this.d;
                ljo0 ljo0Var = (ljo0) obj;
                if (rjo0Var != null) {
                    ((zak0) rjo0Var.a).setValue(ljo0Var);
                }
                if (izsVar != null) {
                    izsVar.invoke(ljo0Var);
                }
                return s3q0.a;
            case 3:
                m99 m99Var = (m99) this.c;
                m99Var.f(s99.a(m99Var.j(), null, null, null, new xaz.a((Throwable) obj, ((c99.c0) this.d).c), null, null, null, false, 247));
                return s3q0.a;
            case 4:
                com.vk.im.engine.internal.merge.channels.a aVar2 = (com.vk.im.engine.internal.merge.channels.a) this.c;
                vcb vcbVar = aVar2.e;
                vcb vcbVar2 = aVar2.f;
                w2w w2wVar = (w2w) this.d;
                List<eeb> list = aVar2.c;
                List<eeb> list2 = list;
                ChannelFilter channelFilter = aVar2.d;
                Iterable iterable = (Iterable) new ChannelsInfoMergeTask(list2, null, false, Boolean.valueOf(channelFilter == ChannelFilter.SUGGESTED), null, 18).o(w2wVar);
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((bdb) it.next()).b));
                }
                boolean z2 = aVar2.h;
                boolean z3 = aVar2.g;
                xgl0 I0 = w2wVar.I0();
                uib a = I0.a();
                wfb o = a.o(channelFilter);
                int j = I0.system().j();
                if ((o != null || z3) && ((o == null || o.b.compareTo(vcbVar) <= 0 || z3) && (o == null || o.b.compareTo(vcbVar2) >= 0 || z2))) {
                    ArrayList arrayList2 = new ArrayList();
                    p4g.a(new wfb(channelFilter, vcbVar2, z2, j), arrayList2, !r14.equals(o));
                    a.c0(arrayList2);
                }
                uib a2 = w2wVar.I0().a();
                List<eeb> list3 = list;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((eeb) it2.next()).a.a));
                }
                List Z = a2.Z(vcbVar, channelFilter, Direction.BEFORE, vcbVar2);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : Z) {
                    if (!arrayList3.contains(Long.valueOf(((bdb) obj2).b))) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(Long.valueOf(((bdb) it3.next()).b));
                }
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    a2.x(((Number) it4.next()).longValue(), vcb.d);
                }
                if (!arrayList5.isEmpty()) {
                    L.d(new sk(7, arrayList5, arrayList3));
                }
                xgl0 I02 = w2wVar.I0();
                if (!arrayList5.isEmpty()) {
                }
                return arrayList;
            case 5:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                izs izsVar2 = (izs) this.d;
                e.a aVar3 = (e.a) obj;
                if (aVar3 instanceof e.a.b) {
                    d = ((e.a.b) aVar3).b;
                } else {
                    if (!(aVar3 instanceof e.a.C0931a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d = ((e.a.C0931a) aVar3).a.d();
                }
                String str = d;
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                izsVar2.invoke(new dz00(str, aVar3.a.f().e(), aVar3.a.f().f()));
                return s3q0.a;
            case 6:
                qyd qydVar = (qyd) this.c;
                y7f.k kVar = (y7f.k) this.d;
                MusicPlayerState musicPlayerState = (MusicPlayerState) obj;
                if (musicPlayerState == MusicPlayerState.PROGRESS) {
                    int i5 = qydVar.f;
                    if (i5 >= 0 && qydVar.a.p(i5)) {
                        qydVar.f = -1;
                    }
                } else if (musicPlayerState == MusicPlayerState.PREPARED) {
                    y7f.this.e.b();
                }
                return s3q0.a;
            case 7:
                ClipsFavoriteFolderContentListViewState.EmptyViewState emptyViewState = (ClipsFavoriteFolderContentListViewState.EmptyViewState) this.c;
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.d;
                ClipsFavoriteFolderContentListFragment.b bVar2 = (ClipsFavoriteFolderContentListFragment.b) obj;
                int i6 = ClipsFavoriteFolderContentListFragment.W;
                bVar2.g.setWithPaddings(false);
                VkPlaceholder vkPlaceholder = bVar2.g;
                vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.clips_favorites_folder_content_list_empty_title)), new VkPlaceholder.b.C0859b(14, emptyViewState.a)));
                int i7 = ClipsFavoriteFolderContentListFragment.c.$EnumSwitchMapping$0[emptyViewState.b.ordinal()];
                if (i7 == 1) {
                    c0857a = new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.clips_favorites_folder_content_list_view_clips_button), (gzs) new com.vk.movika.sdk.base.logic.processor.actions.h(clipsFavoriteFolderContentListFragment, 23), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, (VkButton.Mode) null, (VkButton.Appearance) null, false, 476);
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0857a = new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.clips_favorites_folder_content_list_add_clips_button), (gzs) new com.vk.movika.sdk.base.logic.processor.actions.i(clipsFavoriteFolderContentListFragment, 18), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, (VkButton.Mode) null, (VkButton.Appearance) null, false, 476);
                }
                VkPlaceholder.a.C0857a c0857a2 = null;
                vkPlaceholder.setBottom(new VkPlaceholder.a.b(c0857a, c0857a2, c0857a2, null, 8));
                return s3q0.a;
            case 8:
                return io.reactivex.rxjava3.core.x.B(io.reactivex.rxjava3.core.x.k((e8b0) obj), (io.reactivex.rxjava3.internal.operators.single.y) this.c, new op0(new w61((List) this.d, 2), 8));
            case 9:
                return ((i8f) this.c).e.a((z7f) obj, (Set) this.d);
            case 10:
                ubg ubgVar = (ubg) this.c;
                ubg.a aVar4 = (ubg.a) this.d;
                xbg xbgVar = ubgVar.r;
                if (xbgVar != null) {
                    aVar4.c(xbgVar.e);
                }
                return s3q0.a;
            case 11:
                izs izsVar3 = (izs) this.c;
                UserId userId = (UserId) this.d;
                int i8 = lpg.$EnumSwitchMapping$0[((CartCommunityMenuAction) CartCommunityMenuAction.h().get(((ModalActionSheetListItem) obj).a)).ordinal()];
                if (i8 == 1) {
                    izsVar3.invoke(new rv9.a.f(userId));
                } else if (i8 == 2) {
                    izsVar3.invoke(new rv9.a.g(userId));
                } else {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar3.invoke(new rv9.a.b(userId));
                }
                return s3q0.a;
            case 12:
                ((u1j) this.c).v.invoke(new v1j.a(((lvi0) obj).a.a, ((q2j.h.a.c) ((q2j.h.a) this.d)).a));
                return s3q0.a;
            case 13:
                ((hv10) obj).l((bgk0) this.c, (ur4) this.d);
                return s3q0.a;
            case 14:
                asm asmVar = (asm) this.c;
                DialogExt dialogExt = (DialogExt) this.d;
                int intValue = ((Integer) obj).intValue();
                a1w a1wVar = asmVar.b;
                a1wVar.r().getClass();
                if (intValue < 5) {
                    a1wVar.D(asmVar, new iim(dialogExt.f));
                    a1wVar.r().O.x().a(new ImChatManagementClickAnalyticsItem.b(true, ImChatManagementClickAnalyticsItem.Source.CHAT_LIST_LONGTAP));
                } else {
                    bzb0.d(asmVar.e(), new cwb0.q0(asmVar.a, 5, a1wVar.r().h), null, null, null, 30);
                }
                return s3q0.a;
            case 15:
                InfoBar infoBar = (InfoBar) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                dnm d2 = ((xgl0) obj).b().d();
                InfoBar b = d2.b();
                boolean c = d2.c();
                if (!epx.f(b, infoBar)) {
                    d2.d(infoBar);
                    d2.e(false);
                    ref$BooleanRef.element = true;
                } else if (c) {
                    d2.e(false);
                    ref$BooleanRef.element = true;
                }
                return s3q0.a;
            case 16:
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.c;
                cVar2.q(cVar2.k() + cVar2.i());
                cVar2.r(false);
                ((gsq) this.d).setTags((List) obj);
                return s3q0.a;
            case 17:
                ((f0r.q) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 18:
                t1r.g((wk50.a) this.c, (qvq.i) this.d, (qih0) obj, true);
                return s3q0.a;
            case 19:
                ((dis.b) this.c).l.g(((FriendItem) this.d).b);
                return s3q0.a;
            case 20:
                rws rwsVar = (rws) this.c;
                wk50.a aVar5 = (wk50.a) this.d;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) j5g.a0((List) obj);
                if (sdkVideoFile == null) {
                    rwsVar.a.b(t0d.k.c.a);
                    return s3q0.a;
                }
                aVar5.b(new ClipItemPatch.d.b(sdkVideoFile));
                aVar5.a(ClipItemAction.h.c.b);
                return s3q0.a;
            case 21:
                ((cla) this.c).e.onClick(((v3u) this.d).itemView);
                return s3q0.a;
            case 22:
                GroupCardItemVh groupCardItemVh = (GroupCardItemVh) this.c;
                Group group = (Group) this.d;
                GroupSubscriptionState groupSubscriptionState = groupCardItemVh.t;
                GroupSubscriptionState groupSubscriptionState2 = GroupSubscriptionState.NotSubscribed;
                if (groupSubscriptionState == groupSubscriptionState2) {
                    TransitionDrawable transitionDrawable = new TransitionDrawable((BitmapDrawable[]) rli0.A(new ulp0(rli0.m(new ulp0(rl3.D(new Integer[]{Integer.valueOf(R.drawable.vk_icon_add_alt_20), Integer.valueOf(R.drawable.vk_icon_check_alt_20)}), new wd8(dhr0.a, 9))), new u3u(groupCardItemVh, i3))).toArray(new BitmapDrawable[0]));
                    transitionDrawable.setCrossFadeEnabled(true);
                    ImageButton imageButton = groupCardItemVh.m;
                    if (imageButton == null) {
                        imageButton = null;
                    }
                    imageButton.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ViewGroup viewGroup = groupCardItemVh.n;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    Property property = View.SCALE_X;
                    ObjectAnimator duration = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, 0.8333333f).setDuration(300L);
                    ViewGroup viewGroup2 = groupCardItemVh.n;
                    if (viewGroup2 == null) {
                        viewGroup2 = null;
                    }
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(viewGroup2, (Property<ViewGroup, Float>) property2, 0.8333333f).setDuration(300L);
                    ViewGroup viewGroup3 = groupCardItemVh.n;
                    if (viewGroup3 == null) {
                        viewGroup3 = null;
                    }
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(viewGroup3, (Property<ViewGroup, Float>) property, 1.0f).setDuration(300L);
                    duration3.setStartDelay(300L);
                    ViewGroup viewGroup4 = groupCardItemVh.n;
                    if (viewGroup4 == null) {
                        viewGroup4 = null;
                    }
                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(viewGroup4, (Property<ViewGroup, Float>) property2, 1.0f).setDuration(300L);
                    duration4.setStartDelay(300L);
                    animatorSet.playTogether(duration, duration2, duration3, duration4);
                    animatorSet.start();
                }
                if (groupCardItemVh.t != groupSubscriptionState2) {
                    UIBlockGroup uIBlockGroup = groupCardItemVh.e;
                    if (((uIBlockGroup == null || (catalogProfileLocalState = uIBlockGroup.A) == null) ? null : catalogProfileLocalState.b) == CatalogProfileLocalState.FollowSource.None) {
                        ImageButton imageButton2 = groupCardItemVh.m;
                        groupCardItemVh.k((imageButton2 == null ? null : imageButton2).getContext(), group);
                    } else {
                        ImageButton imageButton3 = groupCardItemVh.m;
                        (imageButton3 == null ? null : imageButton3).performHapticFeedback(17);
                        groupCardItemVh.j(group, false);
                    }
                } else {
                    ImageButton imageButton4 = groupCardItemVh.m;
                    if (imageButton4 == null) {
                        imageButton4 = null;
                    }
                    imageButton4.performHapticFeedback(16);
                    if (group.p == 1) {
                        ImageButton imageButton5 = groupCardItemVh.m;
                        ImageButton imageButton6 = imageButton5 == null ? null : imageButton5;
                        int l = krv0.l(R.attr.vk_ui_icon_accent);
                        imageButton6.getContext();
                        e.b bVar3 = new e.b(imageButton6, null, null, l, 6);
                        bVar3.w = R.layout.ds_internal_context_menu_item;
                        VkContextMenu.c.c(bVar3, R.string.group_event_join, null, false, null, new tx(15, groupCardItemVh, group), 30);
                        VkContextMenu.c.c(bVar3, R.string.group_event_join_unsure, null, false, null, new uk(i, groupCardItemVh, group), 30);
                        bVar3.a().j(false);
                    } else {
                        groupCardItemVh.r(group, true);
                    }
                }
                return s3q0.a;
            case 23:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                Peer peer = (Peer) this.d;
                Msg msg = gVar.r;
                if (msg == null) {
                    msg = null;
                }
                if (!(msg instanceof MsgFromChannel)) {
                    pkd pkdVar = (pkd) gVar.f.invoke();
                    if (pkdVar != null) {
                        pbw pbwVar = gVar.g;
                        if (pbwVar != null) {
                            k0w w = pbwVar.w();
                            Msg msg2 = gVar.r;
                            if (msg2 == null) {
                                msg2 = null;
                            }
                            w.b(msg2.c);
                        }
                        s2f e0 = pkdVar.e0();
                        AttachWithVideo attachWithVideo = gVar.q;
                        if (attachWithVideo == null) {
                            attachWithVideo = null;
                        }
                        SdkVideoFile c2 = e0.c(attachWithVideo.A());
                        int l2 = gVar.l();
                        Msg msg3 = gVar.r;
                        int i9 = (msg3 == null ? null : msg3).d;
                        if (msg3 == null) {
                            msg3 = null;
                        }
                        ImChatClipsInitDecorPayload imChatClipsInitDecorPayload = new ImChatClipsInitDecorPayload(i9, l2, null, msg3.c, true);
                        ClipsRouter a3 = pkdVar.a();
                        Context context = gVar.y;
                        if (context == null) {
                            context = null;
                        }
                        ImClipsDecorationKey imClipsDecorationKey = new ImClipsDecorationKey(peer);
                        ClipFeedTab.SingleClipWithDecoration.FeedType feedType = ClipFeedTab.SingleClipWithDecoration.FeedType.RecomOnly;
                        Msg msg4 = gVar.r;
                        if (msg4 == null) {
                            msg4 = null;
                        }
                        long j2 = msg4.c;
                        qbm qbmVar = gVar.h;
                        ClipsRouter.c(a3, context, Collections.singletonList(new ClipFeedTab.SingleClipWithDecoration(c2, null, "clips_messenger_similar", imClipsDecorationKey, imChatClipsInitDecorPayload, null, null, feedType, qbmVar != null ? qbmVar.c(j2) : null, 98, null)), null, null, null, null, null, true, null, 1916);
                    } else {
                        Activity m = gVar.m();
                        if (m != null) {
                            if (d6q0.t == NetworkState.UNSTABLE) {
                                cvk.t();
                            } else {
                                fh5 fh5Var = gVar.w;
                                uc.o(fh5Var == null ? null : fh5Var, m, false, null, null, null, 60);
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    }
                }
                return s3q0.a;
            case 24:
                ManagedGroupsListFragment managedGroupsListFragment = (ManagedGroupsListFragment) this.c;
                ci00 ci00Var = (ci00) this.d;
                int i10 = ManagedGroupsListFragment.X;
                gm50.a.a(managedGroupsListFragment, ((g.a) obj).a, new bbw(ci00Var, i2));
                return s3q0.a;
            case 25:
                ((oo10) this.c).c.a(((CodeState.MaxMessengerWait) this.d).h, false);
                return s3q0.a;
            case 26:
                MusicTrack musicTrack = (MusicTrack) this.c;
                m840 m840Var = (m840) this.d;
                lb50 lb50Var = new lb50(R.string.music_player_snack_bar_common_error, musicTrack);
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(lb50Var);
                m840Var.d.b(MusicHapticEvent.ERROR);
                return s3q0.a;
            case 27:
                fr50 fr50Var = (fr50) this.c;
                MyTargetInternalNativeAdBlsUiDto myTargetInternalNativeAdBlsUiDto = (MyTargetInternalNativeAdBlsUiDto) this.d;
                hi60 hi60Var = fr50Var.D;
                MyTargetNativeAdEntry myTargetNativeAdEntry = myTargetInternalNativeAdBlsUiDto.i;
                MyTargetNativeAdEntry.b bVar4 = myTargetNativeAdEntry.E;
                if (bVar4 == null || (map = bVar4.c) == null) {
                    map = jgp.b;
                }
                hi60Var.sa(new NewsfeedExternalAction.c.InterfaceC1439c.a(myTargetNativeAdEntry, map));
                return s3q0.a;
            case 28:
                dv60 dv60Var = (dv60) this.c;
                iw60 iw60Var = (iw60) this.d;
                j170 j170Var = (j170) obj;
                if (!dv60Var.x((qz60) dv60Var.b.getCurrentState(), iw60Var.c)) {
                    ts60 ts60Var = dv60Var.f;
                    NewsDebuggerPoint newsDebuggerPoint = NewsDebuggerPoint.ChangeList;
                    ts60Var.T();
                    dv60Var.w().b(iw60Var.c, j170Var.d, iw60Var.d, j170Var.c);
                }
                return s3q0.a;
            default:
                return Long.valueOf(((com.vk.attachpicker.stat.data.b) this.c).b.i((hyg0) obj, (PhotoParamsEntity) this.d));
        }
    }

    public /* synthetic */ ng3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }
}
