package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.bridges.ImageViewer;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMyShelfPlayable;
import com.vk.catalog2.feature.music.holders.OfflineHeaderRemoveAllVh;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.download.api.ClipsDownloadLauncher$ClipsDownloadQuality;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.model.PlaylistRawId;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.preference.Preference;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.user.UserProfile;
import com.vk.music.podcast.impl.ui.list.PodcastEpisodesListFragment;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.ivm.filter.FilterMessage;
import com.vk.photo.editor.ivm.filter.a;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import org.chromium.net.NetError;
import xsna.as30;
import xsna.aue;
import xsna.f17;
import xsna.h7u0;
import xsna.hnd;
import xsna.ig3;
import xsna.ikv0;
import xsna.ile;
import xsna.kte;
import xsna.lbf;
import xsna.mp90;
import xsna.ngd;
import xsna.oi3;
import xsna.pdv0;
import xsna.pwh;
import xsna.tlo0;
import xsna.vte;
import xsna.xn50;
import xsna.xo90;
import xsna.zi3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sh3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sh3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0181, code lost:
    
        if (r8 == null) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.util.Size, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v16, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Window window;
        View view;
        BigPlayerBottomSheetValue bigPlayerBottomSheetValue;
        float f;
        MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType objectType;
        Set<PlaylistRawId> set;
        PhotoTag photoTag;
        int i = this.b;
        int i2 = 8;
        int i3 = 10;
        int i4 = 4;
        int i5 = 2;
        ?? r8 = 0;
        s3q0 s3q0Var = null;
        r8 = 0;
        int i6 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ArchiveFragment archiveFragment = (ArchiveFragment) obj3;
                bpn0 bpn0Var = archiveFragment.X;
                bpn0 bpn0Var2 = archiveFragment.W;
                final nj3 nj3Var = (nj3) obj2;
                Context context = nj3Var.e;
                zi3 zi3Var = (zi3) obj;
                int i7 = ArchiveFragment.e0;
                if (zi3Var.equals(zi3.a.a)) {
                    archiveFragment.finish();
                } else if (zi3Var instanceof zi3.f) {
                    new SelectAlbumBottomSheet.Builder(archiveFragment.requireContext(), new SelectAlbumBottomSheet.Builder.Arguments((UserId) archiveFragment.Q.getValue(), archiveFragment.getString(R.string.return_from_photo_archive_title), archiveFragment.getString(R.string.return_from_photo_archive_action), Collections.singletonList(new PhotoAlbumWrapper.SpecialPhotoAlbum(NetError.ERR_ECH_NOT_NEGOTIATED, archiveFragment.getString(R.string.photo_tab_title), false)), null, Collections.singleton(-15), 16, null), new po1(archiveFragment, true ? 1 : 0)).I0(null);
                } else if (zi3Var instanceof dj3) {
                    dj3 dj3Var = (dj3) zi3Var;
                    RecyclerView recyclerView = nj3Var.h.getRecyclerView();
                    int i8 = dj3Var.b;
                    RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
                    if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                        List<oi3.b> list = dj3Var.c;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        for (oi3.b bVar : list) {
                            tlo0.f fVar = bVar.c;
                            fVar.getClass();
                            arrayList.add(new VkContextMenu.a(tlo0.b.a(fVar, context).toString(), dhr0.t.b(bVar.b, bVar.d), null, false, false, new hj3(nj3Var, bVar, dj3Var, 0), 28));
                        }
                        HashSet hashSet = iah0.a;
                        boolean z = i8 % ((!fnj.c(context) && !iah0.s(context)) ? 6 : 3) == ((fnj.c(context) || iah0.s(context)) ? 3 : 6) / 2;
                        int l = krv0.l(R.attr.vk_ui_icon_accent);
                        view.getContext();
                        e.b bVar2 = new e.b(view, null, null, l, 6);
                        bVar2.w = R.layout.ds_internal_context_menu_item;
                        bVar2.m = cn70.b(8);
                        bVar2.h(arrayList);
                        VkContextMenu a = bVar2.a();
                        com.vk.core.view.components.context.menu.e eVar = (com.vk.core.view.components.context.menu.e) a;
                        eVar.p = new ij3(view, 0);
                        eVar.q = new jj3(view, 0);
                        pli.r(a, view, z);
                    }
                } else if (zi3Var instanceof zi3.g) {
                    ((zi3.g) zi3Var).a.a(context, nj3Var.d).c();
                } else if (zi3Var instanceof aj3) {
                    final Photo photo = ((aj3) zi3Var).a;
                    int i9 = h7u0.p;
                    h7u0.a c = h7u0.b.c(context);
                    c.g0(R.string.photos_delete_single_title);
                    c.U(R.string.photos_delete_single_message);
                    c.c0(R.string.album_details_delete_photo_confirmation_button, new DialogInterface.OnClickListener() { // from class: xsna.kj3
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            nj3.this.d.invoke(new ig3.k.b(photo));
                        }
                    });
                    c.W(R.string.delete_album_dialog_cancel, null);
                    c.m();
                } else if (zi3Var instanceof cj3) {
                    List<oi3.a> list2 = ((cj3) zi3Var).a;
                    PhotoFlowToolbarView photoFlowToolbarView = nj3Var.i;
                    List<oi3.a> list3 = list2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    for (oi3.a aVar : list3) {
                        arrayList2.add(new VkContextMenu.a(aVar.c.a(context).toString(), dhr0.t.b(aVar.b, aVar.d), null, false, false, new dy0(i5, nj3Var, aVar), 28));
                    }
                    ImageView menuButton = photoFlowToolbarView.getMenuButton();
                    int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                    menuButton.getContext();
                    e.b bVar3 = new e.b(menuButton, null, null, l2, 6);
                    bVar3.w = R.layout.ds_internal_context_menu_item;
                    bVar3.m = cn70.b(8);
                    bVar3.h(arrayList2);
                    pli.r(bVar3.a(), photoFlowToolbarView.getMenuButton(), false);
                } else if (zi3Var instanceof bj3) {
                    List<Photo> list4 = ((bj3) zi3Var).a;
                    int i10 = h7u0.p;
                    h7u0.a c2 = h7u0.b.c(context);
                    c2.h0(enj.f(R.plurals.photos_delete_multiple_title2, list4.size(), context));
                    c2.U(R.string.photos_delete_from_archive_multiple_message);
                    c2.c0(R.string.album_details_delete_photo_confirmation_button, new gj3(nj3Var, 0));
                    c2.W(R.string.delete_album_dialog_cancel, null);
                    c2.m();
                } else if (zi3Var instanceof zi3.c) {
                    Dialog dialog = archiveFragment.s;
                    if (dialog != null && (window = dialog.getWindow()) != null) {
                        String g = j03.g(archiveFragment.mo2getContext(), null, R.string.error);
                        ikv0.a aVar2 = new ikv0.a(archiveFragment.requireContext());
                        aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_accent_orange), (Size) r8, 12);
                        aVar2.u = new ikv0.d(g, (String) r8, (ikv0.d.a) r8, r2);
                        aVar2.b().d(window);
                    }
                } else if (zi3Var.equals(zi3.e.a)) {
                    nj3Var.n.p(true);
                } else if (zi3Var instanceof zi3.b) {
                    zi3.b bVar4 = (zi3.b) zi3Var;
                    if (bVar4 instanceof zi3.b.C4180b) {
                        String str = ((zi3.b.C4180b) bVar4).a;
                        ((eha0) bpn0Var.getValue()).b(archiveFragment.requireContext(), str, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(archiveFragment, 4), new uh3(0, archiveFragment, str));
                    } else {
                        if (!(bVar4 instanceof zi3.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<String> list5 = ((zi3.b.a) bVar4).a;
                        if (list5.size() == 1) {
                            ((eha0) bpn0Var.getValue()).b(archiveFragment.requireContext(), (String) j5g.Y(list5), new yc(archiveFragment, 4), new defpackage.e0(3, archiveFragment, list5));
                        }
                    }
                } else if (zi3Var instanceof zi3.d.c) {
                    zi3.d.c cVar = (zi3.d.c) zi3Var;
                    VKList<Photo> vKList = cVar.b;
                    int i11 = 3;
                    dea0 dea0Var = new dea0(vKList.i(), vKList.size(), vKList.j(), new j9(nj3Var, i11), new s5(nj3Var, i11), new th3(archiveFragment, 0), null);
                    dea0Var.j = ((oga0) bpn0Var2.getValue()).n(archiveFragment.requireContext(), cVar.a, vKList, dea0Var);
                } else if (zi3Var instanceof zi3.d.a) {
                    oga0.a((oga0) bpn0Var2.getValue(), archiveFragment.requireContext(), ((zi3.d.a) zi3Var).a, null, 28);
                } else {
                    if (!(zi3Var instanceof zi3.d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((oga0) bpn0Var2.getValue()).s(archiveFragment.requireContext(), ((zi3.d.b) zi3Var).a);
                }
                return s3q0.a;
            case 1:
                final b64 b64Var = (b64) obj3;
                final izs izsVar = (izs) obj2;
                nvy.c((nvy) obj, b64Var.a.size(), null, new jai(1069340613, new zzs() { // from class: xsna.m54
                    @Override // xsna.zzs
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int intValue = ((Integer) obj5).intValue();
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj6;
                        int intValue2 = ((Integer) obj7).intValue();
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= aVar3.o(intValue) ? 32 : 16;
                        }
                        if (aVar3.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1069340613, intValue2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.attachedclips.AttachedClipsList.<anonymous>.<anonymous>.<anonymous> (AttachedClips.kt:101)");
                            }
                            p54.a((s44) b64.this.a.get(intValue), izsVar, null, aVar3, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, true), 6);
                return s3q0.a;
            case 2:
                return new UIBlockMyShelfPlayable(((bi20) obj3).b(), (CatalogButtonOpenUrl) obj2, null, (AudioBook) obj, 4, null);
            case 3:
                g07 g07Var = (g07) obj2;
                vgo vgoVar = (vgo) ((izs) obj3).invoke((q9x) obj);
                int i12 = f17.a.$EnumSwitchMapping$0[((BigPlayerBottomSheetValue) g07Var.c.i.getValue()).ordinal()];
                if (i12 == 1) {
                    bigPlayerBottomSheetValue = BigPlayerBottomSheetValue.Collapsed;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bigPlayerBottomSheetValue = BigPlayerBottomSheetValue.Expanded;
                    if (!vgoVar.f(bigPlayerBottomSheetValue)) {
                        bigPlayerBottomSheetValue = BigPlayerBottomSheetValue.Collapsed;
                    }
                }
                f12<BigPlayerBottomSheetValue> f12Var = g07Var.c;
                if (!epx.f(f12Var.c(), vgoVar)) {
                    ((zak0) f12Var.n).setValue(vgoVar);
                    if (!f12Var.i(bigPlayerBottomSheetValue)) {
                        ((zak0) f12Var.m).setValue(bigPlayerBottomSheetValue);
                    }
                }
                return s3q0.a;
            case 4:
                return new io.reactivex.rxjava3.internal.operators.observable.s1((io.reactivex.rxjava3.internal.operators.observable.b0) obj3, new t34(new mm1(i4, (io.reactivex.rxjava3.core.q) obj, (AtomicBoolean) obj2), i4));
            case 5:
                gza gzaVar = (gza) obj2;
                AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) j5g.b0(((Integer) obj).intValue(), (ArrayList) obj3);
                if (attachForMediaViewer == null) {
                    return null;
                }
                int xb = attachForMediaViewer.xb();
                vm30 vm30Var = gzaVar.b().o;
                if (vm30Var != null) {
                    return vm30Var.e(xb);
                }
                return null;
            case 6:
                ((q5c) obj3).b.a((r2c) obj2);
                return s3q0.a;
            case 7:
                ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) obj3;
                ClipsAudioFragment.b bVar5 = (ClipsAudioFragment.b) obj2;
                MusicTrack musicTrack = (MusicTrack) obj;
                int i13 = ClipsAudioFragment.Y;
                if (musicTrack != null) {
                    SelectRangeWaveFormView selectRangeWaveFormView = bVar5.d;
                    xn50.a.c(clipsAudioFragment, new ngd.d(bwt0.M(selectRangeWaveFormView) + selectRangeWaveFormView.getHeight() + ((int) selectRangeWaveFormView.getMaxTopOffset())));
                    bVar5.g.setText(musicTrack.d);
                    bVar5.h.setText(musicTrack.h);
                    float f2 = 1000.0f;
                    float min = (qwe0.c * 1000.0f) / Math.min(musicTrack.c0, URLUtil.isFileUrl(musicTrack.i) ? ynd.f : ynd.d);
                    int a2 = an10.a(Math.ceil((musicTrack.f * min) / SelectRangeWaveFormView.u0));
                    byte[] bArr = new byte[a2];
                    int i14 = 0;
                    while (i14 < a2) {
                        int i15 = i14 % 6;
                        int i16 = 33;
                        if (i15 != 1) {
                            if (i15 != 2) {
                                if (i15 == 3) {
                                    f = f2;
                                    i16 = 100;
                                } else if (i15 != 4) {
                                    f = f2;
                                    if (i15 != 5) {
                                        i16 = 0;
                                    }
                                }
                            }
                            f = f2;
                            i16 = 66;
                        } else {
                            f = f2;
                        }
                        bArr[i14] = (byte) i16;
                        i14++;
                        f2 = f;
                    }
                    selectRangeWaveFormView.s(0);
                    selectRangeWaveFormView.setWaveForm(bArr);
                    selectRangeWaveFormView.setMinSelectorWidth(Float.valueOf((min / f2) * ynd.e));
                    xn50.a.c(clipsAudioFragment, new ngd.n(musicTrack));
                }
                return s3q0.a;
            case 8:
                ((hnd.e) obj3).a.invoke();
                int i17 = ikv0.e;
                ikv0.b.a((Window) obj2);
                return s3q0.a;
            case 9:
                ikd ikdVar = (ikd) obj2;
                ClipsDownloadLauncher$ClipsDownloadQuality clipsDownloadLauncher$ClipsDownloadQuality = (ClipsDownloadLauncher$ClipsDownloadQuality) obj;
                ile ileVar = ((ird) obj3).c;
                if (ileVar != null) {
                    SdkVideoFile sdkVideoFile = ikdVar.a;
                    SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE;
                    MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype eventSubtype = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.DOWNLOAD;
                    SchemeStat$TypeClipViewerItem.ScreenType screenType = ileVar.a;
                    int i18 = ile.a.$EnumSwitchMapping$1[clipsDownloadLauncher$ClipsDownloadQuality.ordinal()];
                    if (i18 == 1) {
                        objectType = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType.FULLHD;
                    } else if (i18 == 2) {
                        objectType = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType.HD;
                    } else {
                        if (i18 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objectType = MobileOfficialAppsClipsStat$ClipsMoreMenuItem.ObjectType.SD;
                    }
                    ile.b(sdkVideoFile, eventType, eventSubtype, screenType, objectType);
                }
                return s3q0.a;
            case 10:
                ClipsEntryPointDraftsFragment clipsEntryPointDraftsFragment = (ClipsEntryPointDraftsFragment) obj3;
                ido idoVar = (ido) obj2;
                ModalActionSheetListItem modalActionSheetListItem = (ModalActionSheetListItem) obj;
                int i19 = ClipsEntryPointDraftsFragment.Y;
                clipsEntryPointDraftsFragment.io().Df().getClass();
                nsd nsdVar = fvr.c;
                if (nsdVar != null) {
                    nsdVar.a();
                } else {
                    Preference.F(0L, "clips_draft_prefs", "unseen_drafts_pref");
                }
                int i20 = modalActionSheetListItem.a;
                if (i20 == 1) {
                    new xxd(UiTracker.c(), new MobileOfficialAppsClipsStat$ClipsCreateContext(clipsEntryPointDraftsFragment.T, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER), new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.OPEN_DRAFT)).q();
                    if (idoVar.d != null) {
                        clipsEntryPointDraftsFragment.P.b(((v8f) clipsEntryPointDraftsFragment.X.getValue()).a(clipsEntryPointDraftsFragment.requireContext(), idoVar.d.b).m(asu0.a.d()).subscribe(new oz(new defpackage.y(i4, clipsEntryPointDraftsFragment, idoVar), i3), new qz(new td0(i2, clipsEntryPointDraftsFragment, idoVar), i2)));
                    } else {
                        m1e Df = clipsEntryPointDraftsFragment.io().Df();
                        String str2 = idoVar.a;
                        yad yadVar = new yad(clipsEntryPointDraftsFragment, i5);
                        Df.getClass();
                        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                        v53 v53Var = new v53(7, str2, yadVar);
                        clipsDraftPersistentStore.getClass();
                        ClipsDraftPersistentStore.o(v53Var);
                    }
                } else if (i20 == 2) {
                    new xxd(UiTracker.c(), new MobileOfficialAppsClipsStat$ClipsCreateContext(clipsEntryPointDraftsFragment.T, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER), new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.DELETE_DRAFT)).q();
                    m1e Df2 = clipsEntryPointDraftsFragment.io().Df();
                    qc qcVar = new qc(clipsEntryPointDraftsFragment, 16);
                    Df2.getClass();
                    ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                    defpackage.b0 b0Var = new defpackage.b0(i3, idoVar, qcVar);
                    clipsDraftPersistentStore2.getClass();
                    ClipsDraftPersistentStore.o(b0Var);
                }
                return s3q0.a;
            case 11:
                ste steVar = (ste) obj3;
                aue.a aVar3 = (aue.a) obj2;
                Pair pair = (Pair) obj;
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) pair.d();
                List list6 = (List) pair.g();
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType foldersLaunchType = aVar3.b;
                kte kteVar = aVar3.c;
                ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick singlePick = foldersLaunchType instanceof ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick ? (ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.SinglePick) foldersLaunchType : null;
                if (singlePick != null && (set = singlePick.c) != null) {
                    r8 = ste.U(kteVar.b, set);
                }
                if (r8 == 0) {
                    r8 = EmptySet.b;
                }
                steVar.T(new vte.h(shortVideoGetPlaylistsResponseDto, r8, new kte.c(list6), kteVar.b));
                return s3q0.a;
            case 12:
                q2f q2fVar = (q2f) obj3;
                q8e q8eVar = (q8e) obj2;
                int intValue = ((Integer) obj).intValue();
                int i21 = q2fVar.e;
                q2fVar.e = intValue;
                if (i21 != intValue && q8eVar.getScrollState() == 0) {
                    r2f r2fVar = q2fVar.a;
                    r2fVar.c(false);
                    r2fVar.b();
                }
                return s3q0.a;
            case 13:
                ((Float) obj).getClass();
                ((izs) obj3).invoke(new lbf.c.q(((ClipsUploadState.Loaded) obj2).b.e.p));
                return s3q0.a;
            case 14:
                ((gjh) obj3).c.invoke(new d.t.a.e((f5u) obj2, ((gmq) obj).X()));
                return s3q0.a;
            case 15:
                vwh vwhVar = (vwh) obj2;
                j2g0 j2g0Var = (j2g0) obj;
                int i22 = j2g0Var.a;
                Map<Integer, k4g0> map = vwhVar.i;
                LinkedHashMap linkedHashMap = j2g0Var.b;
                ((jwh) obj3).T(new pwh.e(i22, pn00.n(map, linkedHashMap), linkedHashMap.size() + vwhVar.f, pn00.n(vwhVar.k, j2g0Var.c)));
                return s3q0.a;
            case 16:
                a.b bVar6 = (a.b) obj2;
                com.vk.photo.editor.ivm.filter.c cVar2 = (com.vk.photo.editor.ivm.filter.c) obj;
                List<FilterUiModel> list7 = ((com.vk.photo.editor.ivm.filter.c) ((b8f0) ((com.vk.photo.editor.ivm.filter.b) obj3).b).b.getValue()).b;
                ArrayList arrayList3 = new ArrayList(c5g.u(list7, 10));
                boolean z2 = false;
                for (FilterUiModel filterUiModel : list7) {
                    if (epx.f(filterUiModel.e.a, bVar6.a)) {
                        filterUiModel = FilterUiModel.a(filterUiModel, new FilterUiModel.a.b(bVar6.b), false, 507);
                        z2 = true;
                    }
                    arrayList3.add(filterUiModel);
                    z2 = z2;
                }
                return z2 ? com.vk.photo.editor.ivm.filter.b.h(cVar2, arrayList3, FilterMessage.Source.Synthetic, false) : cVar2;
            case 17:
                xls xlsVar = (xls) obj3;
                String str3 = xlsVar.b.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str3, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_MODAL, null), 3);
                iid0Var.f = c3;
                iid0Var.g = b;
                iid0Var.q();
                ((wls) obj2).l.f(xlsVar.b);
                return s3q0.a;
            case 18:
                as30.a aVar4 = (as30.a) obj2;
                j4w j4wVar = ((com.vk.im.video.b) obj3).l;
                if ((j4wVar != null ? j4wVar : null).s()) {
                    aVar4.b();
                }
                return s3q0.a;
            case 19:
                ((OfflineHeaderRemoveAllVh) obj3).d.b(new ktf0((String) obj2), false);
                return s3q0.a;
            case 20:
                ((tgp0) obj).g((ur4) obj3, (Uri) obj2);
                return s3q0.a;
            case 21:
                wo80 wo80Var = (wo80) obj3;
                SwitchCompat switchCompat = (SwitchCompat) obj2;
                izs<Boolean, s3q0> izsVar2 = wo80Var.f1;
                if (izsVar2 != null) {
                    izsVar2.invoke(Boolean.valueOf(switchCompat.isChecked()));
                }
                wo80Var.hide();
                return s3q0.a;
            case 22:
                ur80 ur80Var = (ur80) obj2;
                yp80 yp80Var = ur80Var.e;
                Photo photo2 = (Photo) obj;
                Activity h = e3m.h((Context) obj3);
                if (h != null) {
                    boolean z3 = ur80Var.b;
                    String str4 = ur80Var.c;
                    if (z3 && str4 == null) {
                        myc0.d().g(0, Collections.singletonList(photo2), h, new ImageViewer.b(), o25.a().c());
                    } else {
                        pdv0.a b2 = vtk0.c().b(photo2);
                        if (str4 != null) {
                            bpn0 bpn0Var3 = cqm0.a;
                            try {
                                i6 = Integer.parseInt(str4);
                            } catch (Throwable unused) {
                            }
                            b2.F(i6);
                        }
                        if ((!photo2.b.isEmpty()) && (photoTag = (PhotoTag) j5g.a0(photo2.b)) != null) {
                            if (ur80Var.f) {
                                b2.j.putParcelableArrayList("friends_tags", new ArrayList<>(photo2.b));
                            } else if (ur80Var.g && !photoTag.l) {
                                b2.A(photoTag.b);
                                UserProfile userProfile = photoTag.m;
                                if (userProfile != null) {
                                    b2.I(userProfile);
                                }
                            }
                        }
                        b2.B(null);
                        b2.k(h);
                    }
                    if (yp80Var != null) {
                        yp80Var.onSuccess();
                        s3q0Var = s3q0.a;
                        break;
                    }
                }
                if (yp80Var != null) {
                    yp80Var.U();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return s3q0.a;
            case 23:
                ((bp90) obj3).t.a(new mp90.b.a.d(((xo90.a.d) ((xo90.a) obj2)).a));
                return s3q0.a;
            case 24:
                ((m8b0) obj3).b.h((hyg0) obj, (w8b0) obj2);
                return s3q0.a;
            case 25:
                com.vk.lists.c cVar3 = (com.vk.lists.c) obj2;
                VKList vKList2 = (VKList) obj;
                PodcastEpisodesListFragment podcastEpisodesListFragment = ((com.vk.music.podcast.impl.ui.list.a) obj3).c;
                podcastEpisodesListFragment.X.n0(vKList2);
                mzp0 mzp0Var = podcastEpisodesListFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(podcastEpisodesListFragment.getView());
                }
                cVar3.q(cVar3.k() + cVar3.i());
                cVar3.r(vKList2.size() == 30);
                return s3q0.a;
            case 26:
                com.vk.im.popup.b bVar7 = (com.vk.im.popup.b) obj3;
                izs izsVar3 = (izs) obj2;
                Object obj4 = ((brj0) obj).o;
                lwb0 lwb0Var = obj4 instanceof lwb0 ? (lwb0) obj4 : null;
                if (lwb0Var == null) {
                    return s3q0.a;
                }
                if (lwb0Var.i) {
                    bVar7.dismiss();
                }
                Object obj5 = lwb0Var.f;
                if (obj5 != null) {
                    izsVar3.invoke(obj5);
                }
                return s3q0.a;
            case 27:
                ((wh50) obj2).setValue(new pco(((azl) obj3).j1((int) (((ljo0) obj).c & 4294967295L))));
                return s3q0.a;
            case 28:
                j3n0 j3n0Var = (j3n0) obj3;
                View view2 = (View) obj2;
                MotionEvent motionEvent = (MotionEvent) obj;
                view2.getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                view2.setPressed(true);
                View view3 = j3n0Var.d;
                if (view3 != null) {
                    view3.removeCallbacks(j3n0Var.m);
                }
                return s3q0.a;
            default:
                int intValue2 = ((Integer) obj).intValue();
                ((wh50) obj3).setValue(Boolean.FALSE);
                ((rg50) obj2).C(intValue2);
                return s3q0.a;
        }
    }

    public /* synthetic */ sh3(kw70 kw70Var, ur4 ur4Var, Uri uri) {
        this.b = 20;
        this.c = ur4Var;
        this.d = uri;
    }
}
