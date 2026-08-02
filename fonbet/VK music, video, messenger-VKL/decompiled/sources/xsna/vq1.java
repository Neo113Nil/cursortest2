package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogItemBadgeDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockReorderState$ReorderData$Album;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsSliderView$AlbumVerticalState;
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
public final /* synthetic */ class vq1 implements f2a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        GroupsGroupFullDto groupsGroupFullDto;
        Group group;
        UsersUserFullDto usersUserFullDto;
        UserProfile userProfile;
        boolean z;
        boolean z2;
        Image image;
        Image image2;
        List<CatalogItemBadgeDto> d1;
        boolean z3;
        boolean z4;
        Object obj;
        Object obj2;
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
                        obj2 = null;
                        break;
                    }
                    obj2 = it4.next();
                    if (epx.f(((GroupsGroupFullDto) obj2).P0(), fkq0.a(a.q()))) {
                        break;
                    }
                }
                groupsGroupFullDto = (GroupsGroupFullDto) obj2;
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
                        obj = null;
                        break;
                    }
                    obj = it5.next();
                    if (epx.f(((UsersUserFullDto) obj).s1(), a.q())) {
                        break;
                    }
                }
                usersUserFullDto = (UsersUserFullDto) obj;
            } else {
                usersUserFullDto = null;
            }
            if (usersUserFullDto != null) {
                new j2r0();
                userProfile = j2r0.a(usersUserFullDto);
            } else {
                userProfile = null;
            }
            BlockId.CompositeId b = com.vk.catalog.mvi.block.a.b(videoVideoAlbumFullDto2.getId(), catalogBlockDto.getId());
            CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album = new CatalogBlockReorderState$ReorderData$Album(a.q().b, a.getId());
            if (group != null) {
                z2 = group.n0;
            } else if (userProfile != null) {
                z2 = userProfile.Y;
            } else {
                z = false;
                if (userProfile != null || (image2 = userProfile.O) == null) {
                    if (group == null) {
                        image2 = group.g;
                    } else {
                        image = null;
                        d1 = catalogBlockDto.d1();
                        if (d1 == null) {
                            List<CatalogItemBadgeDto> list = d1;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it6 = list.iterator();
                                while (it6.hasNext()) {
                                    if (epx.f(((CatalogItemBadgeDto) it6.next()).e(), a.zb())) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            }
                            z4 = false;
                            z3 = z4;
                        } else {
                            z3 = false;
                        }
                        arrayList2.add(new AlbumsSliderView$AlbumVerticalState(b, catalogBlockVariant, catalogBlockReorderState$ReorderData$Album, a, z, image, z3));
                    }
                }
                image = image2;
                d1 = catalogBlockDto.d1();
                if (d1 == null) {
                }
                arrayList2.add(new AlbumsSliderView$AlbumVerticalState(b, catalogBlockVariant, catalogBlockReorderState$ReorderData$Album, a, z, image, z3));
            }
            z = z2;
            if (userProfile != null) {
            }
            if (group == null) {
            }
        }
        return arrayList2;
    }
}
