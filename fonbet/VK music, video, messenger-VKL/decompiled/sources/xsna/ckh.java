package xsna;

import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentPhotosDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.cvd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ckh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ckh(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                fkh fkhVar = (fkh) obj3;
                iea0 iea0Var = (iea0) obj2;
                Pair pair = (Pair) obj;
                it80 it80Var = (it80) pair.i();
                it80 it80Var2 = (it80) pair.j();
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) it80Var.a;
                GroupsTabContentPhotosDto o = groupsGetContentForTabsResponseDto != null ? groupsGetContentForTabsResponseDto.o() : null;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto2 = (GroupsGetContentForTabsResponseDto) it80Var2.a;
                GroupsTabContentPhotosDto o2 = groupsGetContentForTabsResponseDto2 != null ? groupsGetContentForTabsResponseDto2.o() : null;
                if (z) {
                    List<PhotosPhotoDto> g = o != null ? o.g() : null;
                    if (g == null || g.isEmpty()) {
                        List<PhotosPhotoAlbumFullDto> d = o2 != null ? o2.d() : null;
                        if (d == null || d.isEmpty()) {
                            fkh.v(fkhVar, iea0Var, CommunityProfileContentItem.State.EMPTY, null, 4);
                            break;
                        }
                    }
                }
                iea0 i2 = iea0.i(iea0Var, null, null, null, null, false, false, null, null, null, 16383);
                if (o != null) {
                    ArrayList arrayList = new ArrayList();
                    cvd0.d dVar = i2.j;
                    if (dVar != null) {
                        arrayList.addAll(dVar.a);
                    }
                    List<PhotosPhotoDto> g2 = o.g();
                    if (g2 == null) {
                        g2 = EmptyList.b;
                    }
                    List<PhotosPhotoDto> list = g2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(xfa0.a((PhotosPhotoDto) it.next()));
                    }
                    arrayList.addAll(arrayList2);
                    i2 = iea0.i(i2, new cvd0.d(arrayList, EmptySet.b, 0), null, null, null, myc0.f(o.i()) && !arrayList2.isEmpty(), false, o.i(), z ? CommunityProfileContentItem.State.LOADED : i2.s, z ? i2.u : CommunityProfileContentItem.State.LOADED, 13742);
                }
                if (o2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    cvd0.c cVar = i2.k;
                    if (cVar != null) {
                        arrayList3.addAll(cVar.a);
                    }
                    List<PhotosPhotoAlbumFullDto> d2 = o2.d();
                    if (d2 == null) {
                        d2 = EmptyList.b;
                    }
                    List<PhotosPhotoAlbumFullDto> list2 = d2;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                    for (PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto : list2) {
                        tfa0.a.getClass();
                        arrayList4.add(tfa0.a(photosPhotoAlbumFullDto));
                    }
                    arrayList3.addAll(arrayList4);
                    iea0 i3 = iea0.i(i2, null, new cvd0.c(arrayList3), null, null, false, false, null, null, null, 16381);
                    boolean z2 = myc0.f(o2.e()) && !arrayList4.isEmpty();
                    i2 = i2.l.h() ? iea0.i(i3, null, new cvd0.c(arrayList3), null, o2.e(), z2, false, null, z ? CommunityProfileContentItem.State.LOADED : i2.s, z ? i2.u : CommunityProfileContentItem.State.LOADED, 13797) : iea0.i(i3, null, new cvd0.c(arrayList3), null, null, false, z2, null, null, null, 16349);
                }
                iea0 iea0Var2 = i2;
                if (z) {
                    CommunityProfileContentItem.ContentType contentType = iea0Var2.l;
                    cvd0.c cVar2 = iea0Var2.k;
                    cvd0.d dVar2 = iea0Var2.j;
                    if (contentType.l()) {
                        ArrayList arrayList5 = dVar2 != null ? dVar2.a : null;
                        if (arrayList5 == null || arrayList5.isEmpty()) {
                            iea0Var2 = iea0.i(iea0Var2, null, null, CommunityProfileContentItem.ContentType.ALBUMS, null, false, false, null, null, null, 16379);
                        }
                    }
                    if (contentType.l()) {
                        ArrayList arrayList6 = cVar2 != null ? cVar2.a : null;
                        if (arrayList6 == null || arrayList6.isEmpty()) {
                            iea0Var2 = iea0.i(iea0Var2, null, null, CommunityProfileContentItem.ContentType.ITEMS, null, false, false, null, null, null, 16379);
                        }
                    }
                    if (contentType.h()) {
                        ArrayList arrayList7 = dVar2 != null ? dVar2.a : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            iea0Var2 = iea0.i(iea0Var2, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, 16379);
                        }
                    }
                    if (contentType.j()) {
                        ArrayList arrayList8 = cVar2 != null ? cVar2.a : null;
                        if (arrayList8 != null && !arrayList8.isEmpty()) {
                            iea0Var2 = iea0.i(iea0Var2, null, null, CommunityProfileContentItem.ContentType.MIXED, null, false, false, null, null, null, 16379);
                        }
                    }
                }
                fkhVar.c.invoke(new d.f(iea0Var2));
                break;
            case 1:
                mc90 mc90Var = (mc90) obj3;
                yvj yvjVar = (yvj) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                if (z) {
                    com.vk.movika.sdk.base.ui.z zVar = new com.vk.movika.sdk.base.ui.z(12, mc90Var, yvjVar);
                    qcy<Object>[] qcyVarArr = qgi0.a;
                    tgi0Var.a(wfi0.y, new ck(null, zVar));
                    tgi0Var.a(wfi0.A, new ck(null, new com.vk.movika.sdk.base.logic.interactor.c(20, mc90Var, yvjVar)));
                } else {
                    fk fkVar = new fk(13, mc90Var, yvjVar);
                    qcy<Object>[] qcyVarArr2 = qgi0.a;
                    tgi0Var.a(wfi0.z, new ck(null, fkVar));
                    tgi0Var.a(wfi0.B, new ck(null, new com.vk.catalog2.common.ui.holders.a(22, mc90Var, yvjVar)));
                }
                break;
            case 2:
                gnq0 gnq0Var = (gnq0) obj3;
                mzt mztVar = (mzt) obj2;
                if (z) {
                    wmq0.B(gnq0Var, mztVar, CommunityProfileContentItem.State.ERROR, null, 4);
                } else {
                    wmq0.B(gnq0Var, mztVar, null, CommunityProfileContentItem.State.ERROR, 2);
                }
                break;
            default:
                VideoMinimizableScreenArgs videoMinimizableScreenArgs = (VideoMinimizableScreenArgs) obj;
                vvs0 vvs0Var = ((com.vk.video.ui.discovery.minimizable.g) obj3).h;
                VideoMinimizableScreenArgs.ControllerArgs controllerArgs = videoMinimizableScreenArgs.b;
                new VideoMinimizableScreenArgs(new VideoMinimizableScreenArgs.ControllerArgs((VideoFile) obj2, controllerArgs.c, controllerArgs.d, controllerArgs.e, controllerArgs.f, controllerArgs.g, controllerArgs.h, controllerArgs.i, controllerArgs.j), z ? VideoMinimizableScreenArgs.RelatedVideoArgs.Recommendations.b : videoMinimizableScreenArgs.c, videoMinimizableScreenArgs.d, videoMinimizableScreenArgs.e);
                vvs0Var.getClass();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ckh(boolean z, mc90 mc90Var, yvj yvjVar) {
        this.b = 1;
        this.c = z;
        this.d = mc90Var;
        this.e = yvjVar;
    }
}
