package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.preference.SwitchPreferenceCompat;
import com.vk.api.generated.artist.dto.ArtistArtistPromoDto;
import com.vk.api.generated.artist.dto.ArtistGetArtistPromoResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.content.design.view.photo.flow.PhotoFlowHeaderView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.media.pipeline.codec.CodecFeeder;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.photoflow.presentation.j;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.photoviewer.PhotoViewer;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.reefton.Reef;
import com.vk.reefton.d;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.b;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.chromium.net.NetError;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import xsna.b9a0;
import xsna.d8a0;
import xsna.fxk0;
import xsna.g8i;
import xsna.gm50;
import xsna.h7u0;
import xsna.hi00;
import xsna.ikv0;
import xsna.it80;
import xsna.jv60;
import xsna.k420;
import xsna.m8a0;
import xsna.mcz;
import xsna.qn60;
import xsna.qr60;
import xsna.r070;
import xsna.rfb0;
import xsna.sg60;
import xsna.sx40;
import xsna.tca0;
import xsna.tlo0;
import xsna.tq70;
import xsna.up90;
import xsna.vok0;
import xsna.whs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class f0z implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0z(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:?, code lost:
    
        return xsna.s3q0.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07e8  */
    /* JADX WARN: Type inference failed for: r1v160, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        f600 f600Var;
        Object obj2;
        sx40 sx40Var;
        boolean z;
        ArrayList<Playlist> arrayList;
        ArrayList<Playlist> arrayList2;
        final ArrayList<Playlist> arrayList3;
        s3q0 okIdsByExternalIds$lambda$0;
        String id;
        int i = this.b;
        int i2 = 6;
        int i3 = 28;
        int i4 = 2;
        int i5 = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                g0z g0zVar = (g0z) obj3;
                bn40.d("Failed to load playlist tracks");
                g0zVar.c(g0zVar.a, "net_error");
                return s3q0.a;
            case 1:
                ((zcz) obj3).e.onNext(mcz.b.a);
                return s3q0.a;
            case 2:
                ((io.reactivex.rxjava3.core.r) obj3).onNext((List) obj);
                return s3q0.a;
            case 3:
                mbl mblVar = ((hi00) obj3).a;
                return ((a1w) mblVar.b).C(mblVar, new nst(epx.f((hi00.a) obj, hi00.a.C2999a.a) ? Source.NETWORK : Source.CACHE)).l(new q9(new ehu(i2), 20));
            case 4:
                ((xgv) obj3).invoke((MarketBridgeCategory) obj);
                return s3q0.a;
            case 5:
                ((wh50) obj3).setValue(new q9x(((q9x) obj).a));
                return s3q0.a;
            case 6:
                ((kfp0) obj3).a();
                return CodecFeeder.FeedStatus.CONTINUE;
            case 7:
                h420 h420Var = (h420) obj3;
                k420 k420Var = h420Var.m;
                if (h420Var.l && (k420Var instanceof k420.c)) {
                    h420Var.j(((k420.c) k420Var).a);
                }
                return s3q0.a;
            case 8:
                s820 s820Var = (s820) obj3;
                n1l0 n1l0Var = s820Var.q;
                if (n1l0Var != null && (f600Var = s820Var.m) != null) {
                    f600Var.d(n1l0Var);
                }
                irc0 irc0Var = s820Var.n;
                if (irc0Var != null) {
                    irc0Var.invoke();
                }
                return s3q0.a;
            case 9:
                lb40 lb40Var = (lb40) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                return Integer.valueOf(booleanValue ? R.string.music_talkback_player_pause : (booleanValue || !lb40Var.g()) ? R.string.music_talkback_player_play : R.string.music_kids_talkback_player_play);
            case 10:
                rw40 rw40Var = (rw40) obj3;
                Iterator<T> it = ((ArtistGetArtistPromoResponseDto) obj).d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((ArtistArtistPromoDto) obj2).f() == ArtistArtistPromoDto.TypeDto.CONCERT) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ArtistArtistPromoDto artistArtistPromoDto = (ArtistArtistPromoDto) obj2;
                Integer e = artistArtistPromoDto != null ? artistArtistPromoDto.e() : null;
                if (artistArtistPromoDto != null && e != null) {
                    try {
                        z = Instant.ofEpochSecond(e.intValue()).isAfter(Instant.now());
                    } catch (Exception unused) {
                        z = false;
                    }
                    if (z) {
                        sx40Var = new sx40.f0(artistArtistPromoDto);
                        rw40Var.C(sx40Var);
                        return s3q0.a;
                    }
                }
                sx40Var = sx40.h.b;
                rw40Var.C(sx40Var);
                return s3q0.a;
            case 11:
                final g250 g250Var = (g250) obj3;
                final a9b0 a9b0Var = (a9b0) obj;
                if (a9b0Var instanceof b9b0) {
                    ArrayList<Playlist> arrayList4 = g250Var.d.i;
                    if (arrayList4 != null) {
                        b9b0 b9b0Var = (b9b0) a9b0Var;
                        if (b9b0Var.c) {
                            arrayList4.add(0, b9b0Var.a);
                            g250Var.y(new mn6(g250Var, a9b0Var));
                        }
                    }
                } else if ((a9b0Var instanceof i8b0) && (arrayList = g250Var.d.i) != null) {
                    arrayList.add(0, ((i8b0) a9b0Var).a);
                    g250Var.y(new tq70.b() { // from class: xsna.d250
                        @Override // xsna.tq70.b
                        public final void accept(Object obj4) {
                            ((rfb0.a) obj4).e(g250.this, ((i8b0) a9b0Var).a);
                        }
                    });
                }
                Playlist playlist = a9b0Var.a;
                ArrayList<Playlist> arrayList5 = g250Var.d.i;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    while (r7 < size) {
                        Playlist playlist2 = arrayList5.get(r7);
                        PlaylistLink playlistLink = playlist2.g;
                        PlaylistLink playlistLink2 = playlist2.f;
                        r7 = (playlist.equals(playlist2) || (playlistLink != null && playlistLink.b == playlist.b && epx.f(playlistLink.c, playlist.c)) || (playlistLink2 != null && playlistLink2.b == playlist.b && epx.f(playlistLink2.c, playlist.c))) ? 0 : r7 + 1;
                        if (!(a9b0Var instanceof gcb0)) {
                            final ArrayList<Playlist> arrayList6 = g250Var.d.i;
                            if (arrayList6 != null) {
                                g250Var.y(new tq70.b() { // from class: xsna.e250
                                    @Override // xsna.tq70.b
                                    public final void accept(Object obj4) {
                                        ((rfb0.a) obj4).c(g250.this, (Playlist) arrayList6.remove(r3));
                                    }
                                });
                            }
                        } else if (a9b0Var instanceof b9b0) {
                            if (!((b9b0) a9b0Var).c && (arrayList3 = g250Var.d.i) != null) {
                                g250Var.y(new tq70.b() { // from class: xsna.f250
                                    @Override // xsna.tq70.b
                                    public final void accept(Object obj4) {
                                        ((rfb0.a) obj4).h(g250.this, (Playlist) arrayList3.remove(r3), false);
                                    }
                                });
                            }
                        } else if ((a9b0Var instanceof c8b0) && (arrayList2 = g250Var.d.i) != null) {
                            arrayList2.set(r7, ((c8b0) a9b0Var).a);
                            g250Var.y(new d22(g250Var, a9b0Var));
                        }
                        return s3q0.a;
                    }
                }
                r7 = -1;
                if (!(a9b0Var instanceof gcb0)) {
                }
                return s3q0.a;
            case 12:
                StoryMusicInfo storyMusicInfo = (StoryMusicInfo) obj3;
                it80.a aVar = it80.b;
                txl0 txl0Var = new txl0(storyMusicInfo.b.Fb(), storyMusicInfo.c, 252);
                txl0Var.h = true;
                int i6 = storyMusicInfo.d;
                txl0Var.d = i6;
                int i7 = storyMusicInfo.e;
                txl0Var.e = i7;
                txl0Var.e = StrictMath.min((int) (i6 + 60000), i7);
                txl0Var.f = storyMusicInfo.f;
                txl0Var.g = 1.0f;
                txl0Var.c = (File) obj;
                aVar.getClass();
                return new it80(txl0Var);
            case 13:
                View view = (View) obj;
                cjx cjxVar = ((pq50) obj3).E;
                (cjxVar != null ? cjxVar : null).p(view, "DEFAULT");
                return s3q0.a;
            case 14:
                ((b.d) obj).b(((ClickableSticker) obj3).zb().zb(), "clickable_sticker");
                return s3q0.a;
            case 15:
                sg60.b bVar = (sg60.b) obj3;
                sg60.b.a(bVar, new a040(sg60.this, 9));
                return s3q0.a;
            case 16:
                uj60 uj60Var = (uj60) obj3;
                Throwable th = (Throwable) obj;
                uj60Var.e(new jv60.a.e(whs.b.a));
                Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(uj60Var.m.f(new vxf0(), new gjj0(uj60Var.n)));
                if (!(b instanceof Result.Failure)) {
                    qn60.c cVar = (qn60.c) b;
                    uj60Var.b.e(new kv60(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
                }
                Throwable a = Result.a(b);
                if (a != null) {
                    com.vk.metrics.eventtracking.b.a.a(a);
                }
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    if (!com.vk.core.utils.newtork.b.d()) {
                        uj60Var.a(r070.e.b.b);
                    }
                }
                return s3q0.a;
            case 17:
                okIdsByExternalIds$lambda$0 = OkApiServiceInternal.getOkIdsByExternalIds$lambda$0((OkApiServiceInternal) obj3, ((Long) obj).longValue());
                return okIdsByExternalIds$lambda$0;
            case 18:
                ((tp90) obj3).c.a((up90.b) obj);
                return s3q0.a;
            case 19:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) obj3;
                bpn0 bpn0Var = photoFlowFragment.Y;
                bpn0 bpn0Var2 = photoFlowFragment.f0;
                bpn0 bpn0Var3 = photoFlowFragment.b0;
                b9a0 b9a0Var = (b9a0) obj;
                int i8 = PhotoFlowFragment.m0;
                int i9 = 10;
                if (b9a0Var instanceof b9a0.f) {
                    b9a0.f fVar = (b9a0.f) b9a0Var;
                    if (fVar instanceof b9a0.f.C2600f) {
                        b9a0.f.C2600f c2600f = (b9a0.f.C2600f) fVar;
                        new SelectAlbumBottomSheet.Builder(photoFlowFragment.requireContext(), new SelectAlbumBottomSheet.Builder.Arguments(photoFlowFragment.go(), photoFlowFragment.getString(R.string.choose_album_to_move_title), photoFlowFragment.getString(R.string.choose_album_to_move_action), c2600f.c ? Collections.singletonList(new PhotoAlbumWrapper.SpecialPhotoAlbum(NetError.ERR_ECH_NOT_NEGOTIATED, photoFlowFragment.getString(R.string.photo_flow_tab_name), false)) : EmptyList.b, c2600f.b, null, 32, null), new mp3(25, photoFlowFragment, c2600f)).I0(null);
                    } else if (fVar instanceof b9a0.f.b) {
                        kbj0.e((kbj0) bpn0Var2.getValue(), photoFlowFragment.requireContext(), new PhotoAttachment(((b9a0.f.b) fVar).a), false, null, false, null, 60);
                    } else if (fVar instanceof b9a0.f.c) {
                        ArrayList arrayList7 = ((b9a0.f.c) fVar).a;
                        if (arrayList7.size() == 1) {
                            ((kbj0) bpn0Var2.getValue()).E(new jbs(photoFlowFragment), 25035, new PhotoAttachment((Photo) j5g.Y(arrayList7)), false);
                        }
                    } else if (fVar instanceof b9a0.f.d) {
                        oga0.a((oga0) bpn0Var3.getValue(), photoFlowFragment.requireContext(), ((b9a0.f.d) fVar).a, null, 28);
                    } else if (fVar instanceof b9a0.f.h) {
                        b9a0.f.h hVar = (b9a0.f.h) fVar;
                        VKList<Photo> vKList = hVar.b;
                        VKList<Photo> vKList2 = hVar.b;
                        dea0 dea0Var = new dea0(vKList.i(), vKList2.size(), vKList2.j(), new ba40(photoFlowFragment, i9), new x850(photoFlowFragment, 7), new zu3(photoFlowFragment, 13), new wf40(photoFlowFragment, i9));
                        photoFlowFragment.l0 = false;
                        dea0Var.j = ((oga0) bpn0Var3.getValue()).n(photoFlowFragment.requireContext(), hVar.a, vKList2, dea0Var);
                    } else if (fVar instanceof b9a0.f.g) {
                        b9a0.f.g gVar = (b9a0.f.g) fVar;
                        new lca0(photoFlowFragment.go(), gVar.a, gVar.b).k(photoFlowFragment.mo2getContext());
                    } else if (fVar instanceof b9a0.f.i) {
                        photoFlowFragment.l0 = false;
                        new m8a0.a(photoFlowFragment.requireContext(), new lo10(photoFlowFragment, 14)).I0(null);
                    } else if (fVar instanceof b9a0.f.e) {
                        b9a0.f.e eVar = (b9a0.f.e) fVar;
                        ((oga0) bpn0Var3.getValue()).j(eVar.b, photoFlowFragment.requireContext(), eVar.a);
                    } else {
                        if (!(fVar instanceof b9a0.f.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b9a0.f.a aVar2 = (b9a0.f.a) fVar;
                        ((krl0) photoFlowFragment.g0.getValue()).f(photoFlowFragment.requireContext(), MobileOfficialAppsCoreNavStat$EventScreen.ALBUM, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PHOTO_PROFILE, aVar2.a);
                        ((qfa0) photoFlowFragment.d0.getValue()).d().p(NetError.ERR_ECH_NOT_NEGOTIATED, aVar2.a.size());
                    }
                } else {
                    int i10 = 12;
                    if (b9a0Var instanceof b9a0.c) {
                        final com.vk.photos.root.photoflow.presentation.j jVar = photoFlowFragment.R;
                        if (jVar == null) {
                            jVar = null;
                        }
                        b9a0.c cVar2 = (b9a0.c) b9a0Var;
                        Context context = jVar.b;
                        if (cVar2 instanceof b9a0.c.e) {
                            b9a0.c.e eVar2 = (b9a0.c.e) cVar2;
                            int i11 = eVar2.b;
                            View a2 = jVar.a(i11);
                            if (a2 != null) {
                                List<d8a0.b> list = eVar2.c;
                                ArrayList arrayList8 = new ArrayList(c5g.u(list, 10));
                                for (d8a0.b bVar2 : list) {
                                    arrayList8.add(new VkContextMenu.a(bVar2.a(context), dhr0.t.b(bVar2.a, bVar2.c), null, false, false, new kt(jVar, bVar2, eVar2, 4), 28));
                                }
                                boolean z2 = i11 % j.a.a(context) == j.a.a(context) / 2;
                                int l = krv0.l(R.attr.vk_ui_icon_accent);
                                a2.getContext();
                                e.b bVar3 = new e.b(a2, null, null, l, 6);
                                bVar3.w = R.layout.ds_internal_context_menu_item;
                                bVar3.m = cn70.b(8);
                                bVar3.h(arrayList8);
                                VkContextMenu a3 = bVar3.a();
                                com.vk.core.view.components.context.menu.e eVar3 = (com.vk.core.view.components.context.menu.e) a3;
                                eVar3.p = new nrr(a2, 1);
                                eVar3.q = new tvh(a2, i5);
                                pli.r(a3, a2, z2);
                            }
                        } else if (cVar2 instanceof b9a0.c.a) {
                            b9a0.c.a aVar3 = (b9a0.c.a) cVar2;
                            String str = aVar3.b;
                            if (str == null) {
                                h7u0.a aVar4 = new h7u0.a(context);
                                aVar4.g0(R.string.photos_delete_single_title);
                                aVar4.U(R.string.photos_delete_single_message);
                                aVar4.c0(R.string.delete, new hj7(i4, jVar, aVar3));
                                aVar4.W(R.string.cancel, null);
                                aVar4.m();
                            } else {
                                h7u0.a aVar5 = new h7u0.a(context);
                                aVar5.g0(R.string.photos_delete_single_title);
                                aVar5.a.f = context.getString(R.string.photos_delete_single_message_album, str);
                                aVar5.c0(R.string.delete, new co90(i5, jVar, aVar3));
                                aVar5.W(R.string.cancel, null);
                                aVar5.m();
                            }
                        } else if (cVar2 instanceof b9a0.c.d) {
                            PhotoFlowHeaderView photoFlowHeaderView = jVar.k;
                            List<d8a0.a> list2 = ((b9a0.c.d) cVar2).a;
                            ArrayList arrayList9 = new ArrayList(c5g.u(list2, 10));
                            for (d8a0.a aVar6 : list2) {
                                arrayList9.add(new VkContextMenu.a(aVar6.a(context), dhr0.t.b(aVar6.a, aVar6.d), null, false, false, new ag1(i10, jVar, aVar6), 28));
                            }
                            ImageView multiSelectOptionsAnchorView = photoFlowHeaderView.getMultiSelectOptionsAnchorView();
                            int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                            multiSelectOptionsAnchorView.getContext();
                            e.b bVar4 = new e.b(multiSelectOptionsAnchorView, null, null, l2, 6);
                            bVar4.w = R.layout.ds_internal_context_menu_item;
                            bVar4.m = cn70.b(8);
                            bVar4.h(arrayList9);
                            pli.r(bVar4.a(), photoFlowHeaderView.getMultiSelectOptionsAnchorView(), false);
                        } else if (cVar2 instanceof b9a0.c.b) {
                            final b9a0.c.b bVar5 = (b9a0.c.b) cVar2;
                            ArrayList arrayList10 = bVar5.a;
                            String f = enj.f(R.plurals.photos_delete_multiple_title2, arrayList10.size(), context);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj4 : arrayList10) {
                                if (hashSet.add(Integer.valueOf(((Photo) obj4).d))) {
                                    arrayList11.add(obj4);
                                }
                            }
                            int i12 = arrayList11.size() == 1 ? R.string.photos_delete_multiple_message : R.string.photos_delete_multiple_message_album;
                            h7u0.a aVar7 = new h7u0.a(context);
                            aVar7.h0(f);
                            aVar7.U(i12);
                            aVar7.c0(R.string.delete, new DialogInterface.OnClickListener() { // from class: xsna.d9a0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    com.vk.photos.root.photoflow.presentation.j.this.e.invoke(new a.g.C1504a(bVar5.a));
                                }
                            });
                            aVar7.W(R.string.cancel, null);
                            aVar7.m();
                        } else {
                            if (!(cVar2 instanceof b9a0.c.C2599c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b9a0.c.C2599c c2599c = (b9a0.c.C2599c) cVar2;
                            CharSequence a4 = c2599c.b.a(context);
                            tlo0.f fVar2 = c2599c.a;
                            fVar2.getClass();
                            CharSequence a5 = tlo0.b.a(fVar2, context);
                            int i13 = h7u0.p;
                            h7u0.a c = h7u0.b.c(context);
                            c.h0(a5);
                            c.a.f = a4;
                            c.c0(R.string.photo_flow_confirm_move, new c9a0(c2599c, r7));
                            c.W(R.string.cancel, null);
                            c.m();
                        }
                    } else if (b9a0Var instanceof b9a0.k) {
                        com.vk.photos.root.photoflow.presentation.j jVar2 = photoFlowFragment.R;
                        com.vk.photos.root.photoflow.presentation.j jVar3 = jVar2 != null ? jVar2 : null;
                        jVar3.getClass();
                        ((b9a0.k) b9a0Var).a.a(jVar3.b, jVar3.e).c();
                    } else if (b9a0Var.equals(b9a0.g.a)) {
                        ((oga0) bpn0Var3.getValue()).d(photoFlowFragment.requireContext(), photoFlowFragment.go(), true);
                    } else if (b9a0Var instanceof b9a0.j) {
                        String g = j03.g(photoFlowFragment.mo2getContext(), null, R.string.error);
                        ikv0.a aVar8 = new ikv0.a(photoFlowFragment.requireContext());
                        aVar8.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_24, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                        aVar8.u = new ikv0.d(g, (String) null, (ikv0.d.a) null, 6);
                        aVar8.n();
                    } else if (b9a0Var.equals(b9a0.h.a)) {
                        com.vk.photos.root.photoflow.presentation.j jVar4 = photoFlowFragment.R;
                        com.vk.lists.c cVar3 = (jVar4 != null ? jVar4 : null).u;
                        if (cVar3 != null) {
                            cVar3.p(false);
                        }
                    } else if (b9a0Var instanceof b9a0.d) {
                        b9a0.d dVar = (b9a0.d) b9a0Var;
                        if (dVar instanceof b9a0.d.b) {
                            String str2 = ((b9a0.d.b) dVar).a;
                            ((eha0) bpn0Var.getValue()).b(photoFlowFragment.requireContext(), str2, new ko00(photoFlowFragment, 17), new mk(18, photoFlowFragment, str2));
                        } else {
                            if (!(dVar instanceof b9a0.d.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List<String> list3 = ((b9a0.d.a) dVar).a;
                            if (list3.size() == 1) {
                                ((eha0) bpn0Var.getValue()).b(photoFlowFragment.requireContext(), (String) j5g.Y(list3), new hvz(photoFlowFragment, 22), new jl4(15, photoFlowFragment, list3));
                            }
                        }
                    } else if (b9a0Var.equals(b9a0.b.a)) {
                        photoFlowFragment.finish();
                    } else if (b9a0Var.equals(b9a0.a.a)) {
                        ((oga0) bpn0Var3.getValue()).e(photoFlowFragment, GalleryPickerSourceConfiguration.EntryPoint.PHOTO_FLOW);
                    } else if (b9a0Var.equals(b9a0.i.a)) {
                        photoFlowFragment.s();
                    } else {
                        if (!(b9a0Var instanceof b9a0.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) m7m.d(photoFlowFragment).a(fpf0.a(ProfileFragmentProviderComponent.class));
                        long j = ((b9a0.e) b9a0Var).a;
                        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
                        profileFragmentProviderComponent.E7(j).l(photoFlowFragment);
                        Fragment parentFragment = photoFlowFragment.getParentFragment();
                        FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                        if (fragmentImpl != null) {
                            fragmentImpl.finish();
                        }
                    }
                }
                return s3q0.a;
            case 20:
                zaa0 zaa0Var = (zaa0) obj;
                io.reactivex.rxjava3.subjects.h hVar2 = ((tca0) obj3).b;
                int i14 = zaa0Var.a;
                hVar2.onNext(new tca0.a.AbstractC3738a.c(zaa0Var.b));
                return s3q0.a;
            case 21:
                ((View) obj).equals(((PhotoViewer) obj3).H);
                return false;
            case 22:
                ((ikc0) obj3).G = false;
                return s3q0.a;
            case 23:
                Reef reef = (Reef) obj3;
                d.a aVar9 = (d.a) obj;
                reef.getClass();
                return new vof0(reef.h, Reef.m.addAndGet(1), System.currentTimeMillis(), aVar9.c, Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000, SystemClock.elapsedRealtime(), Reef.n, aVar9.b, aVar9.a);
            case 24:
                o6g0 o6g0Var = (o6g0) obj3;
                vok0.a aVar10 = (vok0.a) obj;
                long e2 = zno.e(aVar10.c());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                g8i g8iVar = o6g0Var.a;
                String str3 = o6g0Var.d;
                g8i.a a6 = g8iVar.a(e2, timeUnit);
                g8i g8iVar2 = a6.d;
                if (g8iVar2 == null) {
                    return s3q0.a;
                }
                if (g8iVar2 == null || (id = g8iVar2.id()) == null) {
                    return s3q0.a;
                }
                aVar10.b(id, str3);
                if (!a6.a) {
                    g8iVar.await();
                    aVar10.a(g8iVar.id(), str3);
                }
                return s3q0.a;
            case 25:
                ((io.reactivex.rxjava3.disposables.c) obj3).dispose();
                return s3q0.a;
            case 26:
                ((b2e0) obj3).a();
                return s3q0.a;
            case 27:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj3;
                int i15 = SettingsGeneralFragment.z0;
                switchPreferenceCompat.O(false);
                switchPreferenceCompat.a(Boolean.FALSE);
                return null;
            case 28:
                com.vk.clips.sdk.shared.item.static_ads.c cVar4 = (com.vk.clips.sdk.shared.item.static_ads.c) obj3;
                gm50.a.a(cVar4, ((fxk0.b) obj).a, new ba40(cVar4, i3));
                return s3q0.a;
            default:
                s3l0 s3l0Var = (s3l0) obj3;
                d790 d790Var = new d790((StickerStockItem) obj);
                s3l0Var.f = d790Var;
                s3l0Var.z(d790Var, true);
                return s3q0.a;
        }
    }
}
