package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogItemBadgeDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockReorderState$ReorderData$Album;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsListView$AlbumHorizontalState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.Image;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class to1 implements f2a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0196  */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        GroupsGroupFullDto groupsGroupFullDto;
        Group group;
        UsersUserFullDto usersUserFullDto;
        UserProfile userProfile;
        CatalogButtonDto catalogButtonDto;
        Image image;
        Image image2;
        List<CatalogItemBadgeDto> d1;
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        List<String> f = catalogBlockDto.f();
        if (f == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f.iterator();
        while (true) {
            VideoVideoAlbumFullDto videoVideoAlbumFullDto = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) j5g.k0(drm0.c0((String) it.next(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
            if (str != null) {
                int parseInt = Integer.parseInt(str);
                List<VideoVideoAlbumFullDto> d = catalogExtraResponseObjectDto.d();
                if (d != null) {
                    Iterator<T> it2 = d.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((VideoVideoAlbumFullDto) next).getId() == parseInt) {
                            videoVideoAlbumFullDto = next;
                            break;
                        }
                    }
                    videoVideoAlbumFullDto = videoVideoAlbumFullDto;
                }
            }
            if (videoVideoAlbumFullDto != null) {
                arrayList.add(videoVideoAlbumFullDto);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            VideoVideoAlbumFullDto videoVideoAlbumFullDto2 = (VideoVideoAlbumFullDto) it3.next();
            VideoAlbum a = b1s0.a(videoVideoAlbumFullDto2);
            List<GroupsGroupFullDto> g = catalogExtraResponseObjectDto.g();
            if (g != null) {
                Iterator<T> it4 = g.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it4.next();
                    if (epx.f(((GroupsGroupFullDto) obj3).P0(), fkq0.a(a.q()))) {
                        break;
                    }
                }
                groupsGroupFullDto = (GroupsGroupFullDto) obj3;
            } else {
                groupsGroupFullDto = null;
            }
            if (groupsGroupFullDto != null) {
                new dqu();
                group = dqu.a(groupsGroupFullDto);
            } else {
                group = null;
            }
            List<UsersUserFullDto> n = catalogExtraResponseObjectDto.n();
            if (n != null) {
                Iterator<T> it5 = n.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it5.next();
                    if (epx.f(((UsersUserFullDto) obj2).s1(), a.q())) {
                        break;
                    }
                }
                usersUserFullDto = (UsersUserFullDto) obj2;
            } else {
                usersUserFullDto = null;
            }
            if (usersUserFullDto != null) {
                new j2r0();
                userProfile = j2r0.a(usersUserFullDto);
            } else {
                userProfile = null;
            }
            List<CatalogButtonDto> e = catalogBlockDto.e();
            if (e != null) {
                Iterator<T> it6 = e.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    BaseLinkButtonActionDto d2 = ((CatalogButtonDto) obj).d();
                    if ((d2 != null ? d2.C() : null) == BaseLinkButtonActionTypeDto.REORDER_ITEMS) {
                        break;
                    }
                }
                catalogButtonDto = (CatalogButtonDto) obj;
            } else {
                catalogButtonDto = null;
            }
            boolean z2 = true;
            boolean z3 = catalogButtonDto != null;
            BlockId.CompositeId b = com.vk.catalog.mvi.block.a.b(videoVideoAlbumFullDto2.getId(), catalogBlockDto.getId());
            CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album = new CatalogBlockReorderState$ReorderData$Album(a.q().b, a.getId());
            boolean z4 = group != null ? group.n0 : userProfile != null ? userProfile.Y : false;
            if (userProfile == null || (image2 = userProfile.O) == null) {
                if (group != null) {
                    image2 = group.g;
                } else {
                    image = null;
                    d1 = catalogBlockDto.d1();
                    if (d1 == null) {
                        List<CatalogItemBadgeDto> list = d1;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it7 = list.iterator();
                            while (it7.hasNext()) {
                                if (epx.f(((CatalogItemBadgeDto) it7.next()).e(), a.zb())) {
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        z = z2;
                    } else {
                        z = false;
                    }
                    arrayList2.add(new AlbumsListView$AlbumHorizontalState(b, catalogBlockVariant, catalogBlockReorderState$ReorderData$Album, a, z4, image, null, false, z, z3, PsExtractor.AUDIO_STREAM, null));
                }
            }
            image = image2;
            d1 = catalogBlockDto.d1();
            if (d1 == null) {
            }
            arrayList2.add(new AlbumsListView$AlbumHorizontalState(b, catalogBlockVariant, catalogBlockReorderState$ReorderData$Album, a, z4, image, null, false, z, z3, PsExtractor.AUDIO_STREAM, null));
        }
        return arrayList2;
    }
}
