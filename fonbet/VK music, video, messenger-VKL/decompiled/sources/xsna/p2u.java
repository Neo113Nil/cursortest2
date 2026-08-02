package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.photos.dto.PhotosGetPhotosByIdWithTagsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoTagDto;
import com.vk.api.generated.stickers.dto.StickersSearchStickersResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import com.vk.comments.core.BoardComment;
import com.vk.core.view.StaticMapView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.users.User;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stickers.keyboard.navigation.KeyboardNavigationButton;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.gcw;
import xsna.hja0;
import xsna.n610;
import xsna.tt90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p2u implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ p2u(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        EmptyList emptyList;
        UserProfile userProfile;
        switch (this.b) {
            case 0:
                List<zpp<User>> list = ((tt90.a) obj).a;
                List<zpp<User>> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((User) ((zpp) it.next()).a);
                }
                return new gcw.d(list, new ProfilesSimpleInfo(arrayList, (Collection) null, (Collection) null, (Collection) null, (Collection) null, 30, (zcl) null));
            case 1:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return ((BoardComment) ((iag) obj)).h;
            case 2:
                List list3 = (List) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER ImItemListUpdatesSource squash events\n" + j5g.g0(list3, "\n", null, null, 0, null, 62)});
                }
                mpx mpxVar = mpx.a;
                if (list3.contains(mpxVar)) {
                    return mpxVar;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    if (obj2 instanceof e6w) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(((e6w) it2.next()).a);
                }
                return new e6w(linkedHashSet);
            case 3:
                return s3q0.a;
            case 4:
                hfz hfzVar = (hfz) obj;
                return Boolean.valueOf((hfzVar instanceof igy) && ((igy) hfzVar).b == KeyboardNavigationButton.UGC_CREATE);
            case 5:
                return n610.c.a;
            case 6:
                return (wci0) ((Pair) obj).i();
            case 7:
                ems0 ems0Var = (ems0) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(ems0Var.a);
                sb.append('x');
                sb.append(ems0Var.b);
                sb.append(',');
                sb.append(ems0Var.c);
                return sb.toString();
            case 8:
                return Boolean.valueOf(((Msg) obj).H6());
            case 9:
                return s3q0.a;
            case 10:
                return (MusicTrack) obj;
            case 11:
                Throwable th = (Throwable) obj;
                VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                if (vKApiExecutionException != null) {
                    Context context = e43.a;
                    rte0.z(context != null ? context : null, vKApiExecutionException);
                }
                return s3q0.a;
            case 12:
                qgi0.r((tgi0) obj, "audioBookTopBarTitle");
                return s3q0.a;
            case 13:
                PhotosGetPhotosByIdWithTagsResponseDto photosGetPhotosByIdWithTagsResponseDto = (PhotosGetPhotosByIdWithTagsResponseDto) obj;
                List<UsersUserFullDto> e = photosGetPhotosByIdWithTagsResponseDto.e();
                if (e != null) {
                    List<UsersUserFullDto> list4 = e;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                    Iterator<T> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new k2r0().a((UsersUserFullDto) it3.next()));
                    }
                    int e2 = on00.e(c5g.u(arrayList3, 10));
                    if (e2 < 16) {
                        e2 = 16;
                    }
                    linkedHashMap = new LinkedHashMap(e2);
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        linkedHashMap.put(((Owner) next).b, next);
                    }
                } else {
                    linkedHashMap = null;
                }
                List<PhotosPhotoTagDto> f = photosGetPhotosByIdWithTagsResponseDto.f();
                if (f != null) {
                    List<PhotosPhotoTagDto> list5 = f;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list5, 10));
                    for (PhotosPhotoTagDto photosPhotoTagDto : list5) {
                        UserId userId = new UserId(photosPhotoTagDto.e());
                        int id = photosPhotoTagDto.getId();
                        UserId userId2 = photosPhotoTagDto.getUserId();
                        long d = photosPhotoTagDto.d();
                        String f2 = photosPhotoTagDto.f();
                        String description = photosPhotoTagDto.getDescription();
                        double i = photosPhotoTagDto.i();
                        double j = photosPhotoTagDto.j();
                        PhotosGetPhotosByIdWithTagsResponseDto photosGetPhotosByIdWithTagsResponseDto2 = photosGetPhotosByIdWithTagsResponseDto;
                        double k = photosPhotoTagDto.k();
                        double l2 = photosPhotoTagDto.l();
                        boolean z = photosPhotoTagDto.g() == BaseBoolIntDto.YES;
                        if (linkedHashMap != null) {
                            Owner owner = (Owner) linkedHashMap.get(userId);
                            userProfile = owner != null ? new UserProfile(owner) : null;
                        } else {
                            userProfile = null;
                        }
                        arrayList4.add(new PhotoTag(id, userId2, userId, d, f2, description, i, j, k, l2, z, userProfile));
                        photosGetPhotosByIdWithTagsResponseDto = photosGetPhotosByIdWithTagsResponseDto2;
                    }
                    emptyList = arrayList4;
                } else {
                    emptyList = null;
                }
                PhotosGetPhotosByIdWithTagsResponseDto photosGetPhotosByIdWithTagsResponseDto3 = photosGetPhotosByIdWithTagsResponseDto;
                if (emptyList == null) {
                    emptyList = EmptyList.b;
                }
                List<PhotosPhotoDto> d2 = photosGetPhotosByIdWithTagsResponseDto3.d();
                ArrayList arrayList5 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it5 = d2.iterator();
                while (it5.hasNext()) {
                    Photo a = xfa0.a((PhotosPhotoDto) it5.next());
                    a.b = emptyList;
                    arrayList5.add(a);
                }
                return arrayList5;
            case 14:
                return new tm90((ViewGroup) obj);
            case 15:
                return ((hja0.b) ((hja0) obj)).b;
            case 16:
                qgi0.r((tgi0) obj, "PostingOpenGeoPickerButton");
                return s3q0.a;
            case 17:
                qgi0.r((tgi0) obj, "remainingTime");
                return s3q0.a;
            case 18:
                Throwable th2 = (Throwable) obj;
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.e, new Object[]{"Error while copying files: ".concat(mnh0.A(th2))});
                }
                return s3q0.a;
            case 19:
                PostingPreviewRatio postingPreviewRatio = ((PostingState.Editing) obj).i.j.e;
                int i2 = postingPreviewRatio.b;
                int i3 = postingPreviewRatio.c;
                return new kv9(i2 / i3, i2, i3);
            case 20:
                ((Integer) obj).intValue();
                int i4 = RedesignedClipsTopBar.N;
                return s3q0.a;
            case 21:
                Throwable th3 = (Throwable) obj;
                return h03.a(th3) ? io.reactivex.rxjava3.core.q.B0(3000L, TimeUnit.MILLISECONDS) : io.reactivex.rxjava3.core.q.H(th3);
            case 22:
                return new q7z(((Integer) obj).intValue());
            case 23:
                ysg0.b.a(new mru0((VkPeopleSearchParams) obj, true));
                return s3q0.a;
            case 24:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.r(tgi0Var, "TEST_TAG_RIGHT_ICON");
                return s3q0.a;
            case 25:
                qgi0.r((tgi0) obj, "select_group_verification_toolbar_back");
                return s3q0.a;
            case 26:
                return ((a.b) obj).c;
            case 27:
                return s3q0.a;
            case 28:
                int i5 = StaticMapView.n;
                ((oj00) obj).clear();
                return s3q0.a;
            default:
                StickersSearchStickersResponseDto stickersSearchStickersResponseDto = (StickersSearchStickersResponseDto) obj;
                boolean d3 = stickersSearchStickersResponseDto.d();
                List<BaseStickerDto> e3 = stickersSearchStickersResponseDto.e();
                ArrayList arrayList6 = new ArrayList(c5g.u(e3, 10));
                Iterator<T> it6 = e3.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(bo6.a((BaseStickerDto) it6.next()));
                }
                return new y860(arrayList6, d3);
        }
    }
}
