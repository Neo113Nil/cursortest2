package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.channels.api.Channel;
import com.vk.clips.design.view.floatingbutton.model.FloatingButtonAnalyticsEvent;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.fragments.ImCreateChatFragment;
import com.vk.im.ui.views.InfoBarButtonsView;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vk.metrics.eventtracking.Event;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.toggle.Features;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.exo.offline.DownloadInfo;
import xsna.dan;
import xsna.e3m;
import xsna.g7b0;
import xsna.h7u0;
import xsna.hq80;
import xsna.ikv0;
import xsna.t0a;
import xsna.tlo0;
import xsna.utj;
import xsna.x6k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fh1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fh1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x054f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x083e  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        String Q2;
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        PrivateFiles.a b;
        HashMap f;
        Collection values;
        int i = this.b;
        int i2 = 7;
        int i3 = 5;
        int i4 = 6;
        int i5 = -1;
        int i6 = 3;
        int i7 = 0;
        r10 = false;
        boolean z = false;
        int i8 = 1;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                com.vk.photos.root.albumdetails.presentation.c cVar = (com.vk.photos.root.albumdetails.presentation.c) obj5;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cVar.m = booleanValue;
                jfi0<aaa0, k.c.C1491c> jfi0Var = cVar.G;
                if (!booleanValue) {
                    jfi0Var.d(false);
                } else if (!jfi0Var.y) {
                    ref$BooleanRef.element = true;
                }
                jfi0Var.y = booleanValue;
                return s3q0.a;
            case 1:
                bck0 bck0Var = (bck0) obj4;
                ((dq4) obj5).a.invoke(bck0.a(bck0Var, kx40.a(bck0Var.a, new uz4(((i600) obj).d, 4), null, null, false, 510)));
                return s3q0.a;
            case 2:
                iy0 iy0Var = (iy0) obj5;
                String str = (String) obj4;
                kih0 j = ((pi5) obj).j();
                if (j != null) {
                    VideoTextureViewAdapter.a.a(iy0Var.p.getVideoTextureViewAdapter(), j, str, iy0Var, null, null, 24);
                }
                return s3q0.a;
            case 3:
                final y1a y1aVar = (y1a) obj5;
                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder = (CatalogPaginatedListViewHolder) obj4;
                n3a n3aVar = (n3a) obj;
                if (n3aVar instanceof t8f0) {
                    UIBlockList uIBlockList = y1aVar.k;
                    if (uIBlockList != null) {
                        t8f0 t8f0Var = (t8f0) n3aVar;
                        if (t8f0Var.a.invoke(uIBlockList).booleanValue()) {
                            catalogPaginatedListViewHolder.Bl(t8f0Var.b);
                        }
                    }
                } else if (n3aVar instanceof buz) {
                    final UIBlockList uIBlockList2 = y1aVar.k;
                    if (uIBlockList2 != null) {
                        final buz buzVar = (buz) n3aVar;
                        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.x1a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                UIBlockList uIBlockList3;
                                buz buzVar2 = buz.this;
                                izs<UIBlockList, Boolean> izsVar = buzVar2.a;
                                UIBlockList uIBlockList4 = uIBlockList2;
                                Boolean invoke = izsVar.invoke(uIBlockList4);
                                boolean booleanValue2 = invoke.booleanValue();
                                y1a y1aVar2 = y1aVar;
                                Object obj6 = null;
                                UIBlockList invoke2 = booleanValue2 ? buzVar2.b.invoke(uIBlockList4.zb(), y1aVar2.d) : null;
                                if (booleanValue2 && ((uIBlockList3 = y1aVar2.k) == null || (obj6 = uIBlockList3.zb().y) == null)) {
                                    obj6 = EmptyList.b;
                                }
                                return new Triple(invoke, invoke2, obj6);
                            }
                        });
                        asu0 asu0Var = asu0.a;
                        asu0Var.getClass();
                        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = s0Var.r0(asu0.i()).a0(asu0Var.d());
                        ov2 ov2Var = new ov2(new zt4(y1aVar, i2), i3);
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        itg0.m(a0.E(ov2Var, lVar, kVar, kVar));
                    }
                } else if (n3aVar instanceof cer) {
                    UIBlockList uIBlockList3 = y1aVar.k;
                    if (uIBlockList3 != null) {
                        cer cerVar = (cer) n3aVar;
                        izs<UIBlockList, Boolean> izsVar = cerVar.e;
                        String str2 = cerVar.a;
                        if (izsVar.invoke(uIBlockList3).booleanValue()) {
                            for (UIBlock uIBlock : uIBlockList3.y) {
                                if (((uIBlock instanceof UIBlockActionFilter) && epx.f(((UIBlockActionFilter) uIBlock).z.b, str2)) || ((uIBlock instanceof UIBlockGroupFilter) && epx.f(((UIBlockGroupFilter) uIBlock).z.b, str2))) {
                                    i5 = i7;
                                    if (i5 >= 0) {
                                        catalogPaginatedListViewHolder.x(i5);
                                    }
                                } else {
                                    i7++;
                                }
                            }
                            if (i5 >= 0) {
                            }
                        }
                    }
                } else if (n3aVar instanceof ber) {
                    Features.Type type = Features.Type.FEATURE_VIDEO_CATALOG_NEW_FILTER_SWITCH;
                    type.getClass();
                    if (!com.vk.toggle.b.A.a(type)) {
                        return s3q0.a;
                    }
                    UIBlockList uIBlockList4 = y1aVar.k;
                    if (uIBlockList4 != null) {
                        Iterator<UIBlock> it = uIBlockList4.y.iterator();
                        int i9 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                UIBlock next = it.next();
                                if ((next instanceof UIBlockActionFilter) && brm0.v(((UIBlockActionFilter) next).z.b, ((ber) n3aVar).a, false)) {
                                    i5 = i9;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        if (i5 >= 0) {
                            catalogPaginatedListViewHolder.x(i5);
                        }
                    }
                }
                return s3q0.a;
            case 4:
                String str3 = (String) obj4;
                List list = (List) obj;
                ((z9a) obj5).getClass();
                switch (str3.hashCode()) {
                    case -1581161142:
                        if (str3.equals("offline_music_replacement_artist")) {
                            return j5g.D0(new aaa(i7), list);
                        }
                        break;
                    case -1529764530:
                        if (str3.equals("offline_music_replacement_name")) {
                            return j5g.D0(new ek0(i8), list);
                        }
                        break;
                    case -702484208:
                        if (str3.equals("offline_music_replacement_by_user")) {
                            return j5g.D0(new baa(i7), list);
                        }
                        break;
                    case -189985123:
                        if (str3.equals("offline_music_replacement_added")) {
                            return j5g.D0(new nd3(i8), list);
                        }
                        break;
                    case -185433675:
                        if (str3.equals("offline_music_replacement_old_first")) {
                            return j5g.y0(list);
                        }
                        break;
                    case 505811102:
                        if (str3.equals("offline_music_replacement_default")) {
                            return list;
                        }
                        break;
                }
                throw new IllegalArgumentException("Unknown replacement = ".concat(str3));
            case 5:
                Channel channel = (Channel) obj5;
                w8b w8bVar = (w8b) obj4;
                Group group = (Group) ((wpp) obj).c.get(Long.valueOf(channel.A.d));
                if (group != null) {
                    w8bVar.b.onNext(group);
                }
                return channel;
            case 6:
                ((izs) obj5).invoke(((Pair) ((List) obj4).get(((ModalActionSheetListItem) obj).a)).j());
                return s3q0.a;
            case 7:
                d9a d9aVar = ((zfc) obj5).j;
                long j2 = ((Good) obj4).b;
                d9aVar.getClass();
                d9aVar.b(new b9a(d9aVar, j2, (ProductTileCtaButtonType) obj));
                return s3q0.a;
            case 8:
                nad nadVar = (nad) obj5;
                kad kadVar = (kad) obj4;
                VideoFile videoFile = nadVar.f;
                ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
                if (clipVideoFile == null) {
                    kadVar.invoke();
                } else if (clipVideoFile.N1.isEmpty()) {
                    kadVar.invoke();
                } else {
                    int i10 = h7u0.p;
                    h7u0.a c = h7u0.b.c(nadVar.c);
                    c.g0(R.string.clips_edit_privacy_with_coauthors_title);
                    c.U(R.string.clips_edit_privacy_with_coauthors_subtitle);
                    c.c0(R.string.clips_edit_privacy_with_coauthors_change, new lad(kadVar, 0));
                    c.W(R.string.clips_edit_privacy_with_coauthors_cancel, new mad());
                    c.m();
                }
                return s3q0.a;
            case 9:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj5;
                int i11 = ClipsFavoriteFolderContentListFragment.W;
                VkTopBar vkTopBar = ((ClipsFavoriteFolderContentListFragment.b) obj).b;
                RectF o = zjq.o(vkTopBar.getRightMainRect());
                Rect rect = new Rect();
                o.roundOut(rect);
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                vkTopBar.getContext();
                e.c cVar2 = new e.c(null, rect, vkTopBar, l, 1);
                cVar2.e = clipsFavoriteFolderContentListFragment.requireContext();
                for (ClipsFavoriteFolderContentListViewState.f fVar : (List) obj4) {
                    CharSequence a = tlo0.b.a(fVar.c, clipsFavoriteFolderContentListFragment.requireContext());
                    String obj6 = a != null ? a.toString() : null;
                    if (obj6 == null) {
                        obj6 = "";
                    }
                    Context requireContext = clipsFavoriteFolderContentListFragment.requireContext();
                    int i12 = fVar.a;
                    e3m.a aVar = e3m.a;
                    VkContextMenu.c.d(cVar2, obj6, new baf0(m33.a(i12, requireContext), e3m.f(fVar.b, clipsFavoriteFolderContentListFragment.requireContext())), false, new sk(9, clipsFavoriteFolderContentListFragment, fVar), 28);
                }
                cVar2.l(false);
                return s3q0.a;
            case 10:
                y6k y6kVar = (y6k) obj5;
                ArrayList<Peer> arrayList = (ArrayList) obj4;
                x6k.a aVar2 = (x6k.a) obj;
                Throwable th = aVar2.d;
                Peer peer = aVar2.a;
                if (th != null) {
                    edw edwVar = edw.a;
                    edw.d(R.string.vkim_create_chat_avatar_error, y6kVar.i, true);
                }
                String str4 = y6kVar.l;
                Context context = y6kVar.i;
                if (str4 != null) {
                    y6kVar.v.c(peer, str4);
                }
                ImCreateChatFragment.b bVar = y6kVar.u;
                if (bVar != null) {
                    long j3 = peer.b;
                    ImCreateChatFragment imCreateChatFragment = ImCreateChatFragment.this;
                    mhy.d(imCreateChatFragment.getView());
                    Intent intent = new Intent();
                    Serializer.c<Peer> cVar3 = Peer.CREATOR;
                    intent.putExtra("dialog_id", Peer.a.b(j3));
                    s3q0 s3q0Var = s3q0.a;
                    imCreateChatFragment.Mf(-1, intent);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Peer peer2 : arrayList) {
                    Iterator<T> it2 = aVar2.b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (((Peer) next2).d == peer2.d) {
                                obj2 = next2;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 == null) {
                        Iterator<T> it3 = y6kVar.t.f.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj3 = it3.next();
                                if (((qtd0) obj3).getId().equals(Long.valueOf(peer2.d))) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        qtd0 qtd0Var = (qtd0) obj3;
                        if (qtd0Var != null) {
                            Q2 = qtd0Var.Q2(UserNameCase.ACC);
                            if (Q2 == null) {
                                arrayList2.add(Q2);
                            }
                        }
                    }
                    Q2 = null;
                    if (Q2 == null) {
                    }
                }
                ArrayList u0 = j5g.u0(aVar2.c, arrayList2);
                if (!u0.isEmpty()) {
                    String format = u0.size() <= 5 ? String.format(context.getString(R.string.vkim_create_chat_failed_add_members_less_5), Arrays.copyOf(new Object[]{j5g.g0(u0, null, null, null, 0, null, 63)}, 1)) : context.getResources().getQuantityString(R.plurals.vkim_create_chat_failed_add_members_more_5, u0.size(), Integer.valueOf(u0.size()));
                    ikv0.a aVar3 = new ikv0.a(context);
                    aVar3.u = new ikv0.d(format, (String) null, (ikv0.d.a) null, 6);
                    aVar3.n();
                }
                return s3q0.a;
            case 11:
                List list2 = (List) obj;
                return new e1l((Long) list2.get(0), (Long) list2.get(1), (Long) list2.get(2), new k9x(((Integer) list2.get(3)).intValue(), ((Integer) list2.get(4)).intValue(), 1), ((Integer) list2.get(5)).intValue(), (eai0) obj5, (Locale) obj4);
            case 12:
                bsr bsrVar = (bsr) obj5;
                xgq xgqVar = (xgq) obj4;
                bsrVar.a();
                lh3 lh3Var = bsrVar.a;
                if (lh3Var != null) {
                    lh3Var.b(xgqVar.a, FloatingButtonAnalyticsEvent.BUTTON_CLOSE);
                }
                return s3q0.a;
            case 13:
                ((n8w) obj5).d.addAll((Set) obj4);
                return s3q0.a;
            case 14:
                InfoBar.Button button = (InfoBar.Button) obj4;
                izs<? super InfoBar.Button, s3q0> izsVar2 = ((InfoBarButtonsView) obj5).g;
                if (izsVar2 != null) {
                    izsVar2.invoke(button);
                }
                return s3q0.a;
            case 15:
                wh50 wh50Var = (wh50) obj5;
                wh50 wh50Var2 = (wh50) obj4;
                VkTextArea vkTextArea = (VkTextArea) obj;
                vkTextArea.setError(wh50Var.getValue() == InputSelect$State.Error);
                vkTextArea.setValid(wh50Var.getValue() == InputSelect$State.Valid);
                vkTextArea.setHovered(wh50Var.getValue() == InputSelect$State.Hover);
                vkTextArea.setActive(wh50Var.getValue() == InputSelect$State.Active);
                vkTextArea.setEnabled(((zbo0) wh50Var2.getValue()).d);
                vkTextArea.setBefore(((zbo0) wh50Var2.getValue()).a != null ? new VkTextArea.b.a(new gko(R.drawable.vk_icon_headphones_24)) : null);
                vkTextArea.setAfter(((zbo0) wh50Var2.getValue()).b != null ? new VkTextArea.a.C0838a(new gko(R.drawable.vk_icon_view_24), new d0k(11), new x7g(R.attr.vk_ui_icon_secondary), null) : null);
                vkTextArea.setClear(((zbo0) wh50Var2.getValue()).c ? new VkTextArea.c() : null);
                vkTextArea.getEditText().setHint(((zbo0) wh50Var2.getValue()).e ? "Placeholder" : null);
                return s3q0.a;
            case 16:
                String str5 = (String) obj4;
                qtd0 Bb = ((ProfilesInfo) obj).Bb((Peer) obj5);
                if (Bb != null) {
                    el3 el3Var = Event.b;
                    Event.a aVar4 = new Event.a();
                    aVar4.g("vkm_invite_to_chat_click");
                    aVar4.c("entry_point", str5);
                    aVar4.b("id", Long.valueOf(Bb.id()));
                    aVar4.c("status", Bb instanceof Contact ? "contact" : ((Bb instanceof User) && ((User) Bb).z == 3) ? "friend" : "unknown");
                    aVar4.j(thp0.c);
                    com.vk.metrics.eventtracking.b.a.k(aVar4.e());
                }
                return s3q0.a;
            case 17:
                Photo photo = (Photo) obj5;
                izs izsVar3 = (izs) obj4;
                List list3 = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Integer.valueOf(((Photo) ((Pair) it4.next()).j()).c));
                }
                izsVar3.invoke(izi0.k(j5g.S0(arrayList3), Integer.valueOf(photo.c)));
                return s3q0.a;
            case 18:
                String str6 = (String) obj4;
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                nwy nwyVar = ((PlaylistScreenFragment) obj5).go().p;
                qcy<Object> qcyVar = PlaylistScreenFragmentInternalComponent.y[6];
                s0a s0aVar = ((g7b0) nwyVar.c()).a;
                int i13 = g7b0.a.$EnumSwitchMapping$1[((VideoPlaylistBottomSheetRedesign.Action) obj).ordinal()];
                if (i13 == 1) {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_OWNER;
                } else if (i13 == 2) {
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.COPY_LINK;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE;
                }
                s0aVar.a(new t0a.a(str6, null, null, new t0a.a.d(action, SchemeStat$EventItem.Type.VIDEO_PLAYLIST), 6));
                return s3q0.a;
            case 19:
                Context context2 = (Context) obj4;
                ce60.b.getClass();
                p870.f().e(100, (TagsSuggestions) obj5);
                iuc0 iuc0Var = iuc0.b;
                la60 e0 = iuc0.e0();
                hz9 hz9Var = new hz9(context2, i8);
                e0.getClass();
                utj.a aVar5 = new utj.a(context2);
                aVar5.j(R.string.photo_tags_suggestions_hidden_message);
                aVar5.d(R.string.photo_tags_suggestion_hidden_button, new el30(hz9Var, i4));
                aVar5.m();
                return s3q0.a;
            case 20:
                uih0 uih0Var = (uih0) obj5;
                ArrayList arrayList4 = (ArrayList) obj4;
                String str7 = (String) obj;
                String str8 = str7.length() > 0 ? str7 : null;
                tfx tfxVar = new tfx("newsfeed.getActivities", new zn(23), new ao(24));
                tfxVar.i("items", arrayList4);
                return new io.reactivex.rxjava3.internal.operators.maybe.o(rsg0.W(yfb.x(tfxVar), 7).l(new ao90(new du0(22, uih0Var, str8), i6)).v(), new ac20(new q8w(18), 15));
            case 21:
                obi0 obi0Var = (obi0) obj;
                ((bei0) obj5).l(obi0Var);
                ((izs) obj4).invoke(obi0Var);
                return s3q0.a;
            case 22:
                ArrayList arrayList5 = (ArrayList) obj5;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                ikv0 ikv0Var = (ikv0) obj;
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    ((izs) it5.next()).invoke(new e550(ikv0Var, 27));
                }
                arrayList5.clear();
                ikv0 ikv0Var2 = (ikv0) ref$ObjectRef.element;
                if (ikv0Var2 != null) {
                    ikv0Var2.a();
                }
                return s3q0.a;
            case 23:
                l7l0 l7l0Var = (l7l0) obj5;
                StickerStockItem stickerStockItem = (StickerStockItem) obj4;
                o7l0 o7l0Var = l7l0Var.b;
                StickerStockItem stickerStockItem2 = l7l0Var.d;
                if (stickerStockItem2 == null) {
                    stickerStockItem2 = null;
                }
                g7l0.Yg(o7l0Var, stickerStockItem2, stickerStockItem, null, PackStylesListHolder.State.LOADING, 0, 52);
                return s3q0.a;
            case 24:
                bmm0 bmm0Var = (bmm0) obj5;
                qo6 qo6Var = (qo6) obj4;
                Pair pair = (Pair) obj;
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) pair.d();
                Throwable th2 = (Throwable) pair.g();
                if (bmm0Var.a.getCurrentStoryView() instanceof dan) {
                    if (th2 != null || getStoriesResponse == null) {
                        bmm0Var.a(th2);
                    } else {
                        bmm0Var.b(getStoriesResponse);
                    }
                    return s3q0.a;
                }
                List<StoriesContainer> storiesContainer = bmm0Var.a.getStoriesContainer();
                if (storiesContainer == null) {
                    storiesContainer = EmptyList.b;
                }
                Iterator<StoriesContainer> it6 = storiesContainer.iterator();
                int i14 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i14 = -1;
                    } else if (!(it6.next() instanceof DiscoverStubStoriesContainer)) {
                        i14++;
                    }
                }
                if (i14 > -1) {
                    ((DiscoverStubStoriesContainer) storiesContainer.get(i14)).p = DiscoverStubStoriesContainer.State.NO_MORE_STORIES_AVAILABLE_STEP1;
                }
                dan danVar = (dan) qo6Var;
                ImageView imageView = danVar.g;
                TextView textView = danVar.h;
                ImageView imageView2 = danVar.e;
                TextView textView2 = danVar.f;
                int i15 = dan.a.$EnumSwitchMapping$0[danVar.getStoriesContainer().p.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    bwt0.p0(textView, false);
                    bwt0.p0(imageView, false);
                    bwt0.p0(imageView2, true);
                    bwt0.p0(textView2, true);
                    imageView2.setAlpha(1.0f);
                    textView2.setAlpha(1.0f);
                } else {
                    if (i15 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bwt0.p0(textView, false);
                    bwt0.p0(imageView, false);
                    bwt0.p0(imageView2, true);
                    imageView2.setAlpha(1.0f);
                    bwt0.p0(textView2, true);
                    textView2.setAlpha(1.0f);
                    textView2.setText(R.string.stories_discover_title_loader);
                }
                bmm0Var.g(false);
                return s3q0.a;
            case 25:
                UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) obj4;
                ((wtm0) obj5).getClass();
                ArrayList<UIBlock> arrayList6 = ((UIBlockList) obj).y;
                if (arrayList6 == null || !arrayList6.isEmpty()) {
                    Iterator<T> it7 = arrayList6.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            UIBlock uIBlock2 = (UIBlock) it7.next();
                            if ((uIBlock2 instanceof UIBlockList) && epx.f(uIBlockActionFilter.A, uIBlock2.b)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                hq80.a aVar6 = (hq80.a) obj4;
                mm80 O = ((ozs0) obj5).O();
                long j4 = 0;
                if (O != null && (f = O.f()) != null && (values = f.values()) != null) {
                    Iterator it8 = values.iterator();
                    while (it8.hasNext()) {
                        j4 += w8o.b((DownloadInfo) it8.next());
                    }
                }
                long j5 = aVar6.b.a + j4;
                r6m r6mVar = r6m.a;
                b = e8r.a.b(r3, PrivateSubdir.VIDEO_DOWNLOADS_INTERNAL.h(), true);
                String absolutePath = b.a.getAbsolutePath();
                r6mVar.getClass();
                return Boolean.valueOf(r6m.b(absolutePath) - 52428800 > j5);
        }
    }
}
