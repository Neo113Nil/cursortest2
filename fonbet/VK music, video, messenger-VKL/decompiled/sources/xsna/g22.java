package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.fragment.CatalogShowAllFragment;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarVh;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.popup.Popup;
import com.vk.im.ui.components.msg_list.b;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.a;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.QualityChooserViewState;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.photogallery.c;
import com.vk.photogallery.view.CoordinatorLayoutWithContextMenuDelegate;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PhotoViewerLayout;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkworkout.types.SyncWorkoutReason;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b9a0;
import xsna.f0s;
import xsna.god0;
import xsna.ldh;
import xsna.nfd0;
import xsna.nzt;
import xsna.q22;
import xsna.r7d0;
import xsna.tij;
import xsna.tlo0;
import xsna.u610;
import xsna.uuf;
import xsna.w8v;
import xsna.wbb;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g22 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g22(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v90, types: [T, xsna.wqd0] */
    /* JADX WARN: Type inference failed for: r3v31, types: [com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$g] */
    /* JADX WARN: Type inference failed for: r3v32, types: [com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$j] */
    /* JADX WARN: Type inference failed for: r3v33, types: [com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$h] */
    /* JADX WARN: Type inference failed for: r3v36, types: [com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$k] */
    /* JADX WARN: Type inference failed for: r3v37, types: [com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$e] */
    /* JADX WARN: Type inference failed for: r3v39, types: [com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$d] */
    /* JADX WARN: Type inference failed for: r3v65, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$f] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicTrack musicTrack;
        Context context;
        Context context2;
        CommunityProfileAction.n.a.p fVar;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        nfd0.b bVar;
        Object obj2;
        fxh0<Integer> fxh0Var;
        boolean z2;
        yvv yvvVar;
        tlo0.a aVar;
        int i;
        float f;
        float f2;
        float f3;
        int b;
        int i2 = 8;
        int i3 = 13;
        int i4 = 2;
        switch (this.b) {
            case 0:
                q22.f fVar2 = (q22.f) this.c;
                com.vk.catalog2.common.ui.mvp.auto.a aVar2 = (com.vk.catalog2.common.ui.mvp.auto.a) this.d;
                List list = (List) obj;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        if (epx.f(((MusicTrack) next).Ib(), fVar2.a)) {
                            musicTrack = next;
                        }
                    } else {
                        musicTrack = null;
                    }
                }
                MusicTrack musicTrack2 = musicTrack;
                bn40.f("playTrack(id: " + fVar2 + ", ", " pivot:", String.valueOf(musicTrack2), " tracks:", Integer.valueOf(list.size()), ")");
                aVar2.f(fVar2.d, musicTrack2, list, fVar2.c, PlayRequestTrigger.FAST_PLAY_SINGLE_AUDIO, ShuffleMode.SHUFFLE_AUTO);
                return s3q0.a;
            case 1:
                WebApiApplication webApiApplication = (WebApiApplication) this.c;
                String str = (String) this.d;
                Fragment fragment = (Fragment) obj;
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    int i5 = VkFriendsPickerActivity.p;
                    fragment.startActivityForResult(VkFriendsPickerActivity.a.a(activity, webApiApplication.b, str), Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
                }
                return s3q0.a;
            case 2:
                return new bm7((ViewGroup) obj, (xl7) this.c, ((wl7) this.d).m);
            case 3:
                g3a g3aVar = (g3a) this.c;
                dcy dcyVar = (dcy) this.d;
                snn0 snn0Var = (snn0) obj;
                CatalogVh catalogVh = g3aVar.t;
                if (catalogVh == null || !catalogVh.A(snn0Var.a)) {
                    CatalogShowAllFragment.a aVar3 = new CatalogShowAllFragment.a();
                    aVar3.B(g3aVar.b);
                    aVar3.F(snn0Var.a);
                    aVar3.C(BuildInfo.q() ? VideoCatalogRootVh.class.getCanonicalName() : ((pfc) dcyVar).a().getCanonicalName());
                    Context context3 = e43.a;
                    aVar3.k(context3 != null ? context3 : null);
                }
                return s3q0.a;
            case 4:
                ((ubb) this.c).m(new wbb.c(((StoryEntry) this.d).Gb()));
                ((ikv0) obj).a();
                return s3q0.a;
            case 5:
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("DELETE FROM audio_book_to_chapters WHERE uid = ? AND chapter_id = ?");
                try {
                    V0.D3(1, str2);
                    V0.D3(2, str3);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 6:
                Activity activity2 = (Activity) this.c;
                final Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                activity2.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xsna.r3c
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((wh50) Ref$ObjectRef.this.element).setValue(Boolean.valueOf(bqx0.h(view, windowInsets).a.u(8)));
                        return view.onApplyWindowInsets(windowInsets);
                    }
                });
                return new y3c(activity2);
            case 7:
                ClipsAuthor clipsAuthor = (ClipsAuthor) this.c;
                ebd ebdVar = (ebd) this.d;
                String str4 = (String) obj;
                if (fkq0.d(clipsAuthor.b.b)) {
                    fxe fxeVar = ebdVar.z;
                    Context context4 = ebdVar.h;
                    dw20 dw20Var = ebdVar.y;
                    if (dw20Var == null || (context2 = dw20Var.mo2getContext()) == null) {
                        context2 = context4;
                    }
                    fxeVar.b(context4, str4, context2, new eo3(ebdVar, clipsAuthor, str4, i4));
                } else {
                    fxe fxeVar2 = ebdVar.z;
                    Context context5 = ebdVar.h;
                    dw20 dw20Var2 = ebdVar.y;
                    if (dw20Var2 == null || (context = dw20Var2.mo2getContext()) == null) {
                        context = ebdVar.h;
                    }
                    fxeVar2.c(context5, context, clipsAuthor, str4, new cv1(ebdVar, clipsAuthor, str4, i4));
                }
                return s3q0.a;
            case 8:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) this.c;
                ClipsPlaylistPickerFragment.a aVar4 = (ClipsPlaylistPickerFragment.a) this.d;
                int i6 = ClipsPlaylistPickerFragment.V;
                clipsPlaylistPickerFragment.fo((f.d) obj, aVar4);
                return s3q0.a;
            case 9:
                uuf.e eVar = (uuf.e) this.c;
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.d;
                wuf wufVar = (wuf) obj;
                int i7 = ClipsWrapperFragment.Q0;
                uuf.d dVar = eVar.a;
                if (dVar == null) {
                    wufVar.getTopBar().setAfter(null);
                    return s3q0.a;
                }
                VkTopBar topBar = wufVar.getTopBar();
                VkTopBar.a.c.f fVar3 = new VkTopBar.a.c.f(ClipsWrapperFragment.no(dVar), ClipsWrapperFragment.mo(dVar), new com.vk.movika.sdk.base.ui.s(5, eVar, clipsWrapperFragment), null, null, null, 56);
                uuf.d dVar2 = eVar.b;
                VkTopBar.a.b.C0877b c0877b = dVar2 != null ? new VkTopBar.a.b.C0877b(ClipsWrapperFragment.no(dVar2), ClipsWrapperFragment.mo(dVar2), new ie3(6, dVar2, clipsWrapperFragment), null, null, null, 56) : null;
                uuf.d dVar3 = eVar.c;
                topBar.setAfter(new VkTopBar.a.d(fVar3, c0877b, dVar3 != null ? new VkTopBar.a.b.C0877b(ClipsWrapperFragment.no(dVar3), ClipsWrapperFragment.mo(dVar3), new qg1(9, dVar3, clipsWrapperFragment), null, null, null, 56) : null));
                return s3q0.a;
            case 10:
                izs izsVar = (izs) this.c;
                ldh.a aVar5 = (ldh.a) this.d;
                r7d0 r7d0Var = (r7d0) obj;
                if (r7d0Var instanceof r7d0.a) {
                    r7d0.a aVar6 = (r7d0.a) r7d0Var;
                    fVar = new CommunityProfileAction.n.a.d(aVar6.a, aVar6.b);
                } else if (r7d0Var instanceof r7d0.b) {
                    r7d0.b bVar2 = (r7d0.b) r7d0Var;
                    fVar = new CommunityProfileAction.n.a.e(bVar2.a, bVar2.b);
                } else if (r7d0Var instanceof r7d0.f) {
                    r7d0.f fVar4 = (r7d0.f) r7d0Var;
                    fVar = new CommunityProfileAction.n.a.k(fVar4.a, fVar4.b);
                } else if (r7d0Var instanceof r7d0.c) {
                    r7d0.c cVar = (r7d0.c) r7d0Var;
                    fVar = new CommunityProfileAction.n.a.f(aVar5.n, cVar.a, cVar.b);
                } else if (r7d0Var instanceof r7d0.d) {
                    r7d0.d dVar4 = (r7d0.d) r7d0Var;
                    fVar = new CommunityProfileAction.n.a.h(dVar4.a, dVar4.b);
                } else if (r7d0Var instanceof r7d0.e) {
                    r7d0.e eVar2 = (r7d0.e) r7d0Var;
                    fVar = new CommunityProfileAction.n.a.j(eVar2.a, eVar2.b);
                } else if (r7d0Var instanceof r7d0.g) {
                    fVar = CommunityProfileAction.n.a.g.b;
                } else {
                    if (!(r7d0Var instanceof r7d0.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar = CommunityProfileAction.n.a.p.b;
                }
                izsVar.invoke(fVar);
                return s3q0.a;
            case 11:
                tij tijVar = (tij) this.c;
                tij.a aVar7 = (tij.a) this.d;
                ded0 ded0Var = (ded0) obj;
                List<ListFriends> list2 = ded0Var.a;
                List<ProfileFriendItem> list3 = ded0Var.b;
                tijVar.h = list2;
                List<UserId> list4 = aVar7.a;
                nfd0.b bVar3 = aVar7.f;
                Set S0 = j5g.S0(list4);
                Set S02 = j5g.S0(aVar7.b);
                Set S03 = j5g.S0(aVar7.c);
                Set S04 = j5g.S0(aVar7.d);
                boolean z3 = aVar7.e;
                if (z3) {
                    List<ProfileFriendItem> list5 = list3;
                    arrayList3 = new ArrayList();
                    for (Object obj3 : list5) {
                        if (S0.contains(((ProfileFriendItem) obj3).b)) {
                            arrayList3.add(obj3);
                        }
                    }
                    List<ListFriends> list6 = list2;
                    arrayList4 = new ArrayList();
                    for (Object obj4 : list6) {
                        if (S02.contains(Integer.valueOf(((ListFriends) obj4).b))) {
                            arrayList4.add(obj4);
                        }
                    }
                    arrayList = new ArrayList();
                    for (Object obj5 : list5) {
                        ProfileFriendItem profileFriendItem = (ProfileFriendItem) obj5;
                        boolean z4 = z3;
                        if (S03.contains(profileFriendItem.b) && !S0.contains(profileFriendItem.b)) {
                            arrayList.add(obj5);
                        }
                        z3 = z4;
                    }
                    z = z3;
                    arrayList2 = new ArrayList();
                    for (Object obj6 : list6) {
                        ListFriends listFriends = (ListFriends) obj6;
                        if (S04.contains(Integer.valueOf(listFriends.b)) && !S02.contains(Integer.valueOf(listFriends.b))) {
                            arrayList2.add(obj6);
                        }
                    }
                } else {
                    z = z3;
                    List<ProfileFriendItem> list7 = list3;
                    arrayList = new ArrayList();
                    for (Object obj7 : list7) {
                        if (S03.contains(((ProfileFriendItem) obj7).b)) {
                            arrayList.add(obj7);
                        }
                    }
                    List<ListFriends> list8 = list2;
                    arrayList2 = new ArrayList();
                    for (Object obj8 : list8) {
                        if (S04.contains(Integer.valueOf(((ListFriends) obj8).b))) {
                            arrayList2.add(obj8);
                        }
                    }
                    arrayList3 = new ArrayList();
                    for (Object obj9 : list7) {
                        ProfileFriendItem profileFriendItem2 = (ProfileFriendItem) obj9;
                        if (S0.contains(profileFriendItem2.b) && !S03.contains(profileFriendItem2.b)) {
                            arrayList3.add(obj9);
                        }
                    }
                    arrayList4 = new ArrayList();
                    for (Object obj10 : list8) {
                        ListFriends listFriends2 = (ListFriends) obj10;
                        if (S02.contains(Integer.valueOf(listFriends2.b)) && !S04.contains(Integer.valueOf(listFriends2.b))) {
                            arrayList4.add(obj10);
                        }
                    }
                }
                nfd0 Z0 = tijVar.Z0();
                Z0.c = arrayList3;
                Z0.d = arrayList4;
                nfd0 Z02 = tijVar.Z0();
                Z02.a = arrayList;
                Z02.b = arrayList2;
                nfd0 Z03 = tijVar.Z0();
                nfd0.b bVar4 = Z03.e;
                if (!epx.f(bVar4 != null ? bVar4.c : null, PrivacyRules.f)) {
                    nfd0.b bVar5 = Z03.f;
                    if (bVar5 != null && bVar5.a() && !Z03.b()) {
                        Iterator it2 = Z03.i.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (!((nfd0.b) obj2).a()) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        Z03.f = (nfd0.b) obj2;
                    }
                    nfd0.b bVar6 = Z03.e;
                    if (bVar6 != null && bVar6.a() && !Z03.a()) {
                        Iterator it3 = Z03.h.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                ?? next2 = it3.next();
                                if (!((nfd0.b) next2).a()) {
                                    bVar = next2;
                                }
                            } else {
                                bVar = null;
                            }
                        }
                        Z03.e = bVar;
                    }
                }
                tijVar.Z0().j = ded0Var.c;
                if (bVar3 == null) {
                    tijVar.n1();
                } else if (z && tijVar.Z0().a()) {
                    tijVar.h1(bVar3);
                } else if (z || !tijVar.Z0().b()) {
                    tijVar.n1();
                } else {
                    tijVar.h1(bVar3);
                }
                return s3q0.a;
            case 12:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
                f2w0 f2w0Var = (f2w0) this.d;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (jyu0.e((iyu0) obj)) {
                    f2w0Var.d(debugDevSettingsFragment.requireContext(), new ton0(SyncWorkoutReason.APP_START, false), new bvo0(), null, null, SelectedDataSource.GOOGLE_FIT);
                } else {
                    enj.r(debugDevSettingsFragment.requireContext(), "Отсутствуют разрешения для получения активности", 0);
                }
                return null;
            case 13:
                pdm pdmVar = (pdm) this.c;
                Map map = (Map) this.d;
                f0s l = pdmVar.l();
                l.b.b().f(l.a.a, null, new Object[0]);
                for (Map.Entry entry : map.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    Collection<String> collection = (Collection) entry.getValue();
                    f0s l2 = pdmVar.l();
                    l2.getClass();
                    if (!collection.isEmpty()) {
                        String g0 = j5g.g0(collection, null, null, null, 0, new e0s(intValue, 0), 31);
                        l2.b.b().j("INSERT OR REPLACE INTO " + l2.a.a + " (" + f0s.a.FOLDER_ID.getKey() + ", " + f0s.a.SUBLIST_TYPE.getKey() + ") VALUES " + g0);
                    }
                    pdmVar.p(intValue, pdmVar.g().b(collection));
                }
                return s3q0.a;
            case 14:
                Context context6 = (Context) this.c;
                String str5 = (String) this.d;
                List list9 = (List) obj;
                if ((2 & 20) != 0) {
                    list9 = EmptyList.b;
                }
                List list10 = list9;
                String str6 = (20 & 8) != 0 ? null : str5;
                int i8 = GiftsCatalogFragment.c0;
                GiftsCatalogFragment.b.a(context6, nzt.a.a(new nzt.a.C3428a(ahn.s()), list10, str6, null, EmptyList.b, false), false);
                s3q0 s3q0Var = s3q0.a;
                return s3q0.a;
            case 15:
                View view = (View) this.c;
                o7v o7vVar = (o7v) this.d;
                if (!f4m.h(view)) {
                    o7vVar.dismiss();
                }
                return s3q0.a;
            case 16:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new voz((izs) this.c, (SuspendLambda) this.d, null), 3));
            case 17:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                VkMarketSearchParams vkMarketSearchParams = (VkMarketSearchParams) this.d;
                ?? r0 = (wqd0) obj;
                if (ref$ObjectRef2.element == null && (fxh0Var = vkMarketSearchParams.d) != null && r0.a == fxh0Var.a.intValue()) {
                    ref$ObjectRef2.element = r0;
                }
                return s3q0.a;
            case 18:
                r610 r610Var = (r610) this.c;
                MediaContentItem mediaContentItem = (MediaContentItem) this.d;
                MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
                if (marketProductLinkedContentItemDto.d() == MarketProductLinkedContentItemDto.ContentTypeDto.VIDEO) {
                    g7s0 g7s0Var = r610Var.c;
                    VideoVideoFullDto g = marketProductLinkedContentItemDto.g();
                    z2 = g7s0Var.c(g != null ? ums0.d(ums0.a, g, null, null, null, 30) : null);
                } else {
                    z2 = false;
                }
                if (!z2) {
                    r610Var.e(new u610.c(mediaContentItem));
                }
                return s3q0.a;
            case 19:
                com.vk.im.ui.components.msg_list.c cVar2 = (com.vk.im.ui.components.msg_list.c) this.c;
                w8v w8vVar = (w8v) this.d;
                cVar2.getClass();
                if (w8vVar instanceof w8v.b) {
                    gj30 gj30Var = w8vVar.b;
                    a1w a1wVar = cVar2.a;
                    Dialog f4 = cVar2.f();
                    if (f4 != null && f4.Va() && gj30Var.isEmpty()) {
                        cau0 cau0Var = a1wVar.r().h;
                        cVar2.l.b(itg0.n(a1wVar.C(cVar2, new tpu(Collections.singletonList(f4.Zb()), Source.NETWORK, r7, i2)).q(asu0.a.c())));
                    }
                    if (!BuildInfo.m() && (yvvVar = zvv.a.get()) != null) {
                        yvvVar.a();
                        throw null;
                    }
                } else if (w8vVar instanceof w8v.f) {
                    cVar2.b(new b.a(((w8v.f) w8vVar).c));
                }
                return s3q0.a;
            case 20:
                MusicPageToolbarVh musicPageToolbarVh = (MusicPageToolbarVh) this.c;
                Toolbar toolbar = (Toolbar) this.d;
                UIBlock uIBlock = musicPageToolbarVh.d;
                kbj0 kbj0Var = musicPageToolbarVh.e;
                if (uIBlock != null) {
                    musicPageToolbarVh.c.a(new cfp0(uIBlock, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Share)));
                }
                UIBlock uIBlock2 = musicPageToolbarVh.d;
                if (uIBlock2 instanceof UIBlockMusicArtist) {
                    if (musicPageToolbarVh.g) {
                        Context context7 = e43.a;
                        Context context8 = context7 != null ? context7 : null;
                        String str7 = vm40.a;
                        mhy.a(context8, "https://" + a0a.d + "/artist/" + ((UIBlockMusicArtist) uIBlock2).z.b);
                        cvk.u(R.string.link_copied, false);
                    } else {
                        kbj0Var.l(toolbar.getContext(), ((UIBlockMusicArtist) uIBlock2).z);
                    }
                } else if (uIBlock2 instanceof UIBlockMusicCurator) {
                    kbj0Var.C(toolbar.getContext(), ((UIBlockMusicCurator) uIBlock2).z);
                }
                return Boolean.TRUE;
            case 21:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                    wh50Var.setValue(obj);
                } else {
                    wh50Var2.setValue(Boolean.TRUE);
                }
                return s3q0.a;
            case 22:
                ((k4a0) this.c).c.d((PhoneValidationContract$ValidationDialogMetaInfo) this.d);
                return s3q0.a;
            case 23:
                List list11 = (List) this.c;
                com.vk.photos.root.photoflow.presentation.b bVar7 = (com.vk.photos.root.photoflow.presentation.b) this.d;
                f4z f4zVar = bVar7.h;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    return s3q0.a;
                }
                r7 = num != null && num.intValue() == list11.size();
                if (r7) {
                    aVar = tlo0.Companion;
                    i = R.string.selected_photos_deleted;
                } else {
                    aVar = tlo0.Companion;
                    i = R.string.selected_photos_deleted_partial;
                }
                tlo0.f h = tq.h(aVar, i);
                if (r7) {
                    bVar7.X();
                    f4zVar.b(new b9a0.k(new j7k0(h, Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, false ? 1 : 0, null, 32)));
                } else {
                    f4zVar.b(new b9a0.k(new j7k0(h, Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), null, false ? 1 : 0, null, 32)));
                }
                f4zVar.b(b9a0.h.a);
                return s3q0.a;
            case 24:
                c.b bVar8 = (c.b) this.c;
                com.vk.photogallery.c cVar3 = (com.vk.photogallery.c) this.d;
                PhotoViewer photoViewer = bVar8.b;
                if (photoViewer == null) {
                    return s3q0.a;
                }
                List<q4t> j = bVar8.j(photoViewer.r);
                PhotoViewer photoViewer2 = bVar8.b;
                if (photoViewer2 != null) {
                    xmz xmzVar = new xmz(18);
                    PhotoViewerLayout photoViewerLayout = photoViewer2.w;
                    if (photoViewerLayout.isAttachedToWindow() && photoViewer2.l == null) {
                        photoViewer2.l = ((ViewPropertyAnimator) xmzVar.invoke(photoViewerLayout)).withStartAction(new wc2(photoViewer2, i3)).withEndAction(new nx3(photoViewer2, 12));
                    }
                }
                bVar8.i();
                a7u0 a7u0Var = cVar3.b;
                EditText editText = cVar3.q;
                a7u0Var.a(editText.getText().toString(), j);
                editText.setText("");
                CoordinatorLayoutWithContextMenuDelegate coordinatorLayoutWithContextMenuDelegate = cVar3.i;
                if (coordinatorLayoutWithContextMenuDelegate.isAttachedToWindow()) {
                    cVar3.e.removeView(coordinatorLayoutWithContextMenuDelegate);
                }
                return s3q0.a;
            case 25:
                ((gyb0) this.c).b.h((hyg0) obj, (hyb0) this.d);
                return s3q0.a;
            case 26:
                ((com.vk.im.popup.a) this.c).b((Popup.c) this.d, new jw30((io.reactivex.rxjava3.disposables.c) obj, i3));
                return s3q0.a;
            case 27:
                god0 god0Var = (god0) this.c;
                god0.a aVar8 = (god0.a) this.d;
                vcr vcrVar = (vcr) obj;
                ncr<vcr<?>> ncrVar = god0Var.b;
                if (ncrVar != null) {
                    ncrVar.c(vcrVar);
                }
                aVar8.a(null);
                return s3q0.a;
            case 28:
                com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a aVar9 = (com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                n7w n7wVar = aVar9.n1;
                xn50.a.c(aVar9, new a.C1240a(((QualityChooserViewState.QualityOption) arrayList5.get(n7wVar != null ? ((Number) n7wVar.invoke()).intValue() : 0)).a));
                return s3q0.a;
            default:
                gif0 gif0Var = (gif0) this.c;
                List list12 = (List) this.d;
                Canvas canvas = (Canvas) obj;
                float f5 = gif0Var.f;
                Path path = gif0Var.i;
                Matrix matrix = gif0Var.k;
                Path path2 = gif0Var.j;
                RectF rectF = gif0Var.l;
                if (!list12.isEmpty()) {
                    path.rewind();
                    glb0 glb0Var = (glb0) j5g.Y(list12);
                    float f6 = glb0Var.a;
                    float f7 = glb0Var.b;
                    Iterator it4 = list12.iterator();
                    while (it4.hasNext()) {
                        glb0 glb0Var2 = (glb0) it4.next();
                        kif0 kif0Var = gif0Var.a;
                        float f8 = kif0Var.a / 2.0f;
                        float f9 = kif0Var.b / 2.0f;
                        float f10 = glb0Var2.a;
                        float f11 = glb0Var2.b;
                        Iterator it5 = it4;
                        float f12 = f7;
                        rectF.set(f10 - f8, f11 - f9, f10 + f8, f11 + f9);
                        path2.rewind();
                        path2.addRoundRect(rectF, gif0Var.b, gif0Var.c, Path.Direction.CW);
                        matrix.reset();
                        matrix.postRotate(f5, f10, f11);
                        path.addPath(path2, matrix);
                        float f13 = f11;
                        double d = 2.0f;
                        float sqrt = (float) Math.sqrt(((float) Math.pow(f12 - f11, d)) + ((float) Math.pow(f6 - f10, d)));
                        float f14 = gif0Var.a.b / 3.0f;
                        if (sqrt < f14 || (b = an10.b((f3 = sqrt / f14))) < 0) {
                            f = f13;
                            f2 = f10;
                        } else {
                            int i9 = 0;
                            while (true) {
                                float f15 = i9;
                                float a = uq.a(f10 - f6, f15, f3, f6);
                                float f16 = (((f13 - f12) * f15) / f3) + f12;
                                f = f13;
                                f2 = f10;
                                rectF.set(a - f8, f16 - f9, a + f8, f16 + f9);
                                path2.rewind();
                                path2.addRoundRect(rectF, gif0Var.b, gif0Var.c, Path.Direction.CW);
                                matrix.reset();
                                matrix.postRotate(f5, rectF.centerX(), rectF.centerY());
                                path.addPath(path2, matrix);
                                if (i9 != b) {
                                    i9++;
                                    f13 = f;
                                    f10 = f2;
                                }
                            }
                        }
                        it4 = it5;
                        f7 = f;
                        f6 = f2;
                    }
                    canvas.drawPath(path, gif0Var.h);
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g22(izs izsVar, wzs wzsVar) {
        this.b = 16;
        this.c = izsVar;
        this.d = (SuspendLambda) wzsVar;
    }
}
