package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.material.DrawerValue;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.photos.dto.PhotosGetAlbumsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.clips.design.view.correction.CorrectionsRecyclerView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState;
import com.vk.clips.playlists.ui.picker.recycler.ClipItem$MultiSelectCheckboxState;
import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditScreenFragment;
import com.vk.editor.filters.correction.entity.CorrectionType;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.chapter.presentation.feature.AudioBookChapterMviState;
import com.vk.music.playlist.display.domain.h;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import xsna.aiq0;
import xsna.c2r0;
import xsna.fzd0;
import xsna.gm50;
import xsna.gp3;
import xsna.icl;
import xsna.ir5;
import xsna.k840;
import xsna.ltb;
import xsna.oxh;
import xsna.pta;
import xsna.tiq0;
import xsna.ty4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0266, code lost:
    
        if (((com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState.c.b.a) r2).a.contains(r11) == false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        hr5 hr5Var;
        ClipItem$MultiSelectCheckboxState clipItem$MultiSelectCheckboxState;
        boolean z;
        int i = 7;
        int i2 = 2;
        int i3 = 0;
        switch (this.b) {
            case 0:
                q50 q50Var = (q50) this.c;
                Throwable th = (Throwable) obj;
                int i4 = h03.a(th) ? R.string.story_delete_network_error : R.string.story_delete_api_error;
                Context context = q50Var.a.i0.getContext();
                cmf0.d(context, q50Var.a.i0.getWindow(), context.getString(i4), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 1:
                zj1 zj1Var = (zj1) this.c;
                PhotosGetAlbumsResponseDto photosGetAlbumsResponseDto = (PhotosGetAlbumsResponseDto) obj;
                List<PhotosPhotoAlbumFullDto> d = photosGetAlbumsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto : d) {
                    zj1Var.b.getClass();
                    arrayList.add(tfa0.a(photosPhotoAlbumFullDto));
                }
                VKList vKList = new VKList(arrayList);
                vKList.o(photosGetAlbumsResponseDto.getCount());
                return vKList;
            case 2:
                ((zak0) ((us1) this.c).d).setValue((tho0) obj);
                return s3q0.a;
            case 3:
                fp3 fp3Var = (fp3) this.c;
                gm50.a.a(fp3Var, ((gp3.a) obj).a, new yx0(fp3Var, i2));
                return s3q0.a;
            case 4:
                return new AudioBookChapterMviState((AudioBookChapterBottomSheetLaunchPoint) this.c);
            case 5:
                ((pv4) this.c).b.onCancel();
                return s3q0.a;
            case 6:
                mp5 mp5Var = (mp5) this.c;
                yp90<wiq0> yp90Var = mp5Var.c;
                io.reactivex.rxjava3.disposables.b bVar = mp5Var.f;
                ExtendedUserProfile extendedUserProfile = mp5Var.e;
                pta ptaVar = mp5Var.d;
                lyd0 lyd0Var = mp5Var.i;
                AtomicBoolean atomicBoolean = mp5Var.l;
                aiq0.a aVar = (aiq0.a) obj;
                if (epx.f(aVar, aiq0.a.C2544a.b)) {
                    lyd0Var.k().c();
                    atomicBoolean.set(false);
                    if (ptaVar.c.a instanceof ir5.a) {
                        mp5Var.e2(new aiq0.a.b(null));
                    } else {
                        mp5Var.e2(new ciq0(null));
                    }
                } else if (aVar instanceof aiq0.a.b) {
                    lyd0Var.k().b();
                    atomicBoolean.set(false);
                    String str = ((aiq0.a.b) aVar).b;
                    if (str != null) {
                        mp5Var.m = str;
                    }
                    mp5Var.e2(new aiq0.i.b(extendedUserProfile.a));
                } else {
                    int i5 = 3;
                    if (aVar instanceof aiq0.a.c) {
                        Intent intent = ((aiq0.a.c) aVar).b;
                        if (intent == null) {
                            atomicBoolean.set(false);
                        } else {
                            ir5 ir5Var = ptaVar.c.a;
                            if (ir5Var instanceof ir5.a) {
                                hr5Var = null;
                            } else if (ir5Var instanceof ir5.b) {
                                hr5Var = ((ir5.b) ir5Var).a;
                            } else {
                                if (!(ir5Var instanceof ir5.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hr5Var = ((ir5.c) ir5Var).a;
                            }
                            mq5 mq5Var = mp5Var.h;
                            UserId userId = extendedUserProfile.a.c;
                            mq5Var.getClass();
                            String stringExtra = intent.getStringExtra(X3.i.b);
                            if (stringExtra == null) {
                                stringExtra = "";
                            }
                            String str2 = stringExtra;
                            RectF rectF = (RectF) intent.getParcelableExtra("rect");
                            if (rectF == null) {
                                rectF = new RectF(intent.getFloatExtra(TtmlNode.LEFT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra("top", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra(TtmlNode.RIGHT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra("bottom", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            }
                            int i6 = 4;
                            bVar.b(mcr0.h(Uri.parse(str2)).U(new iu4(new lq5(mq5Var, rectF, new fzd0.b(str2, userId, true, rectF.left, rectF.top, rectF.right, rectF.bottom, intent.getBooleanExtra("post", false), intent.getBooleanExtra("story", false), null, null), i3), i5)).U(new lp0(new jp5(i3, mp5Var, hr5Var), i6)).subscribe(new vl0(new s6(mp5Var, 9), i6), new mp0(new wl0(mp5Var, 5), i5)));
                        }
                    } else if (epx.f(aVar, aiq0.a.d.b)) {
                        lyd0Var.k().d();
                        ir5 ir5Var2 = ptaVar.c.a;
                        if (ir5Var2 instanceof ir5.b) {
                            ir5.b bVar2 = (ir5.b) ir5Var2;
                            hr5 hr5Var2 = bVar2.a;
                            List<Integer> list = bVar2.c;
                            ir5 aVar2 = hr5Var2 == null ? new ir5.a(list) : new ir5.c(hr5Var2, list);
                            atomicBoolean.set(false);
                            mp5Var.e2(new aiq0.d.a(new pta.a.C3530a(aVar2)));
                        } else if (ir5Var2 instanceof ir5.c) {
                            ir5.c cVar = (ir5.c) ir5Var2;
                            int size = cVar.b.size();
                            UserId userId2 = extendedUserProfile.a.c;
                            io.reactivex.rxjava3.core.q L = rsg0.T(yfb.x(zga0.b(mp5Var.j, userId2, "-6", Boolean.TRUE, Integer.valueOf(size), 2, null, 13770))).L(new q9(new wd3(i2, mp5Var, userId2), i2), false).L(new com.vk.movika.sdk.base.ui.j(new mh4(1, mp5Var, cVar), 4), false);
                            int i7 = 5;
                            r41 r41Var = new r41(new p1(cVar, 7), i7);
                            L.getClass();
                            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.p1(L, r41Var).subscribe(new t00(new t40(mp5Var, i5), i5), new j22(new pd(mp5Var, 9), i7)));
                        } else {
                            if (!(ir5Var2 instanceof ir5.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            atomicBoolean.set(false);
                        }
                    } else if (aVar instanceof biq0) {
                        yp90Var.a(tiq0.a.b);
                        atomicBoolean.set(false);
                        aiq0.a aVar3 = ((biq0) aVar).b;
                        if (aVar3 != null) {
                            mp5Var.e2(aVar3);
                        }
                    } else {
                        if (!(aVar instanceof ciq0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        yp90Var.a(new tiq0.b(((ciq0) aVar).b));
                        atomicBoolean.set(false);
                    }
                }
                return s3q0.a;
            case 7:
                BookingEditScreenFragment bookingEditScreenFragment = (BookingEditScreenFragment) this.c;
                wr7.b(bookingEditScreenFragment, bookingEditScreenFragment.Q, (mm7) obj);
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((UIBlock) obj).h.contains(((oon0) ((n3a) this.c)).a));
            case 9:
                ((xgl0) obj).a().q(((v0b) this.c).d, ChannelActionInProgress.NONE, Boolean.TRUE);
                return s3q0.a;
            case 10:
                asb asbVar = (asb) this.c;
                bqx bqxVar = asbVar.i1;
                if (bqxVar == null) {
                    bqxVar = null;
                }
                Iterator<T> it = bqxVar.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        dqx dqxVar = (dqx) ((hfz) it.next());
                        if (dqxVar.c) {
                            o0w b = g2v.c().b();
                            Context requireContext = asbVar.requireContext();
                            long j = dqxVar.b;
                            gzs<s3q0> gzsVar = fkq0.a;
                            UserId userId3 = new UserId(j);
                            String str3 = (String) asbVar.j1.getValue();
                            if (!drm0.N(str3)) {
                                b.n(requireContext, userId3, str3, null, "chat_invite", new vg0(17));
                            }
                        }
                    } else {
                        bqx bqxVar2 = asbVar.i1;
                        qul qulVar = bqxVar2 == null ? null : bqxVar2;
                        if (bqxVar2 == null) {
                            bqxVar2 = null;
                        }
                        List<? extends hfz> list2 = bqxVar2.d;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!((dqx) ((hfz) obj2)).c) {
                                arrayList2.add(obj2);
                            }
                        }
                        qulVar.setItems(arrayList2);
                        asbVar.Yn();
                        bqx bqxVar3 = asbVar.i1;
                        if ((bqxVar3 != null ? bqxVar3 : null).d.isEmpty()) {
                            asbVar.hide();
                        }
                    }
                }
                return s3q0.a;
            case 11:
                ixb ixbVar = ((hxb) this.c).l;
                ltb ltbVar = (ltb) obj;
                if (ltbVar instanceof ltb.a) {
                    Throwable th2 = ((ltb.a) ltbVar).a;
                    ProgressWheel progressWheel = ixbVar.f;
                    if (progressWheel == null) {
                        progressWheel = null;
                    }
                    f4m.j(progressWheel);
                    RecyclerView recyclerView = ixbVar.e;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    f4m.j(recyclerView);
                    ViewGroup viewGroup = ixbVar.h;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    viewGroup.setVisibility(0);
                    TextView textView = ixbVar.g;
                    (textView != null ? textView : null).setText(zk70.b(th2));
                } else if (ltbVar instanceof ltb.b) {
                    List<hfz> list3 = ((ltb.b) ltbVar).a;
                    ProgressWheel progressWheel2 = ixbVar.f;
                    if (progressWheel2 == null) {
                        progressWheel2 = null;
                    }
                    f4m.j(progressWheel2);
                    ViewGroup viewGroup2 = ixbVar.h;
                    if (viewGroup2 == null) {
                        viewGroup2 = null;
                    }
                    f4m.j(viewGroup2);
                    RecyclerView recyclerView2 = ixbVar.e;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    recyclerView2.setVisibility(0);
                    pwb pwbVar = ixbVar.j;
                    (pwbVar != null ? pwbVar : null).setItems(list3);
                } else {
                    if (!epx.f(ltbVar, ltb.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewGroup viewGroup3 = ixbVar.h;
                    if (viewGroup3 == null) {
                        viewGroup3 = null;
                    }
                    f4m.j(viewGroup3);
                    RecyclerView recyclerView3 = ixbVar.e;
                    if (recyclerView3 == null) {
                        recyclerView3 = null;
                    }
                    f4m.j(recyclerView3);
                    ProgressWheel progressWheel3 = ixbVar.f;
                    (progressWheel3 != null ? progressWheel3 : null).setVisibility(0);
                }
                return s3q0.a;
            case 12:
                atd atdVar = (atd) this.c;
                if (((ClipsDraftPersistentStore) obj).n()) {
                    dw20 dw20Var = atdVar.j;
                    if (dw20Var != null) {
                        dw20Var.hide();
                    }
                    lmv clipsControls = atdVar.b.getClipsControls();
                    if (clipsControls != null) {
                        clipsControls.B3(false);
                    }
                } else {
                    ArrayList a = atd.a(ClipsDraftPersistentStore.m());
                    yvd0 yvd0Var = atdVar.k;
                    yvd0Var.f = a;
                    yvd0Var.notifyDataSetChanged();
                }
                return s3q0.a;
            case 13:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                int i8 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.go(new ng3(i, (ClipsFavoriteFolderContentListViewState.EmptyViewState) obj, clipsFavoriteFolderContentListFragment));
                return s3q0.a;
            case 14:
                eee eeeVar = (eee) this.c;
                wee weeVar = eeeVar.a;
                ufu ufuVar = eeeVar.b;
                ty4.b bVar3 = (ty4.b) obj;
                if (bVar3 instanceof ty4.b.a) {
                    wfu f = ufuVar.f();
                    gkg gkgVar = f instanceof gkg ? (gkg) f : null;
                    if (gkgVar != null) {
                        gkgVar.a.l6(((ty4.b.a) bVar3).b);
                    }
                    weeVar.g4(((ty4.b.a) bVar3).a);
                } else {
                    if (!(bVar3 instanceof ty4.b.C3778b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wfu f2 = ufuVar.f();
                    gkg gkgVar2 = f2 instanceof gkg ? (gkg) f2 : null;
                    if (gkgVar2 != null) {
                        gkgVar2.a.l6(((ty4.b.C3778b) bVar3).a);
                    }
                    weeVar.g4(null);
                }
                return s3q0.a;
            case 15:
                ClipsPlaylistPickerState.Content content = (ClipsPlaylistPickerState.Content) obj;
                vpe vpeVar = ((com.vk.clips.playlists.ui.picker.d) this.c).e;
                List<VideoFile> list4 = content.e;
                ClipsPlaylistPickerState.c cVar2 = content.b;
                vpeVar.getClass();
                List<VideoFile> list5 = list4;
                ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                for (VideoFile videoFile : list5) {
                    String r1 = videoFile.r1();
                    boolean z2 = cVar2 instanceof ClipsPlaylistPickerState.c.b.a;
                    if (z2) {
                        ClipsPlaylistPickerState.c.b.a aVar4 = (ClipsPlaylistPickerState.c.b.a) cVar2;
                        clipItem$MultiSelectCheckboxState = (aVar4.a.contains(r1) || aVar4.b.contains(r1)) ? ClipItem$MultiSelectCheckboxState.CHECKED : ClipItem$MultiSelectCheckboxState.UNCHECKED;
                    } else if (cVar2 instanceof ClipsPlaylistPickerState.c.b.C0630b) {
                        clipItem$MultiSelectCheckboxState = ((ClipsPlaylistPickerState.c.b.C0630b) cVar2).a.contains(r1) ? ClipItem$MultiSelectCheckboxState.CHECKED : ClipItem$MultiSelectCheckboxState.UNCHECKED;
                    } else {
                        if (!(cVar2 instanceof ClipsPlaylistPickerState.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        clipItem$MultiSelectCheckboxState = ClipItem$MultiSelectCheckboxState.HIDDEN;
                    }
                    ClipItem$MultiSelectCheckboxState clipItem$MultiSelectCheckboxState2 = clipItem$MultiSelectCheckboxState;
                    Image image = videoFile.getImage();
                    int L8 = videoFile.L8();
                    boolean d2 = g620.f().getPrivacy().d(videoFile);
                    if (z2) {
                        break;
                    } else {
                        if (!(cVar2 instanceof ClipsPlaylistPickerState.c.b.C0630b)) {
                            if (!(cVar2 instanceof ClipsPlaylistPickerState.c.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                        }
                        z = true;
                    }
                    arrayList3.add(new g0d(clipItem$MultiSelectCheckboxState2, r1, image, L8, d2, z));
                }
                return arrayList3;
            case 16:
                yzf yzfVar = (yzf) this.c;
                NewsfeedGetResponse newsfeedGetResponse = (NewsfeedGetResponse) obj;
                com.vk.newsfeed.common.util.j jVar = new com.vk.newsfeed.common.util.j();
                String str4 = newsfeedGetResponse.j() ? yzfVar.c : yzfVar.d;
                HashMap hashMap = new HashMap();
                Iterator<NewsEntry> it2 = newsfeedGetResponse.iterator();
                while (it2.hasNext()) {
                    NewsEntry next = it2.next();
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        com.vk.newsfeed.common.util.j.h(jVar, next, (s1c0) yzfVar.e.getValue(), "news", str4, arrayList4, null, 96);
                    } catch (Throwable th3) {
                        L.i(th3);
                    }
                    hashMap.put(next, new k0d0(arrayList4));
                }
                return new bl60(newsfeedGetResponse, newsfeedGetResponse.i(), newsfeedGetResponse.isSmartNews, newsfeedGetResponse.lists, hashMap, newsfeedGetResponse.reactionSets);
            case 17:
                ((rl7) this.c).invoke((Boolean) obj);
                return s3q0.a;
            case 18:
                it80 it80Var = (it80) obj;
                trg trgVar = ((vqg) this.c).g;
                return (trgVar != null ? trgVar : null).c((Location) it80Var.a);
            case 19:
                ((jyg) this.c).p.invoke();
                return s3q0.a;
            case 20:
                ((pxh) this.c).l.c(oxh.a.a);
                return s3q0.a;
            case 21:
                CorrectionType correctionType = (CorrectionType) this.c;
                int i9 = CorrectionsRecyclerView.i;
                return Boolean.valueOf(((lwj) obj).a == correctionType);
            case 22:
                return new osa((ViewGroup) obj, (icl.a) this.c);
            case 23:
                ((alm) this.c).d(((m480) obj).c);
                return s3q0.a;
            case 24:
                x5n x5nVar = ((e4n) this.c).g;
                x5nVar.getClass();
                i0q0.j(new sih(x5nVar, ((x960) obj) instanceof ovz));
                return s3q0.a;
            case 25:
                yfn yfnVar = (yfn) this.c;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new z8b0(h.a.C1349a.b.a, yfnVar.c));
                return s3q0.a;
            case 26:
                ((g3b) this.c).invoke();
                return s3q0.a;
            case 27:
                return new klo((DrawerValue) obj, (izs) this.c);
            case 28:
                HashMap hashMap2 = (HashMap) this.c;
                u1c0 u1c0Var = (u1c0) obj;
                NewsEntry newsEntry = u1c0Var.a;
                NewsEntry newsEntry2 = (NewsEntry) hashMap2.getOrDefault(newsEntry, newsEntry);
                NewsEntry newsEntry3 = u1c0Var.a;
                NewsEntry newsEntry4 = u1c0Var.b;
                if (newsEntry3 == newsEntry4) {
                    newsEntry4 = newsEntry2;
                }
                return lbs.c(u1c0Var, newsEntry2, newsEntry4, 0, 4);
            default:
                d2q d2qVar = (d2q) this.c;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (!d2qVar.A.contains(((c2r0.b) obj3).a)) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    c2r0.b bVar4 = (c2r0.b) it3.next();
                    UserId userId4 = bVar4.a;
                    arrayList6.add(new UserItem(userId4, bVar4.g, bVar4.b, bVar4.c, bVar4.d, bVar4.e, bVar4.f, d2qVar.y.get(userId4.b, -1).intValue(), bVar4.i, bVar4.j));
                }
                d2qVar.B0(arrayList6);
                return s3q0.a;
        }
    }
}
