package xsna;

import com.vk.api.generated.catalog.dto.CatalogBlockDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.playlist.playlistscreen.domain.PlaylistButtonDo;
import com.vk.video.playlist.playlistscreen.domain.PlaylistCatalogDo;
import com.vk.video.playlist.playlistscreen.domain.PlaylistCatalogSectionDo;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PlaylistScreenMapper.kt */
/* loaded from: classes6.dex */
public final class hdb0 {
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01af, code lost:
    
        if (r10 != null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e5  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PlaylistCatalogDo a(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto, o4a o4aVar) {
        ?? r5;
        VideoVideoAlbumFullDto videoVideoAlbumFullDto;
        PlaylistDataDo playlistDataDo;
        List<CatalogBlockDto> g;
        Object obj;
        Object obj2;
        List<String> f;
        String str;
        Object obj3;
        List<CatalogSectionDto> j;
        List<CatalogSectionDo> a = o4aVar.a(catalogCatalogResponseObjectDto);
        CatalogSectionDto catalogSectionDto = (CatalogSectionDto) j5g.Y(catalogCatalogResponseObjectDto.F().j());
        CatalogSectionDo catalogSectionDo = (CatalogSectionDo) j5g.Y(a);
        CatalogCatalogDto F = catalogCatalogResponseObjectDto.F();
        ?? r4 = 0;
        r4 = 0;
        if (F == null || (j = F.j()) == null) {
            r5 = null;
        } else {
            r5 = new ArrayList();
            Iterator it = j.iterator();
            while (it.hasNext()) {
                List<CatalogBlockDto> g2 = ((CatalogSectionDto) it.next()).g();
                if (g2 == null) {
                    g2 = EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : g2) {
                    if (((CatalogBlockDto) obj4).f3() != null) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    List<String> f3 = ((CatalogBlockDto) it2.next()).f3();
                    if (f3 == null) {
                        f3 = EmptyList.b;
                    }
                    g5g.y(f3, arrayList2);
                }
                g5g.y(arrayList2, r5);
            }
        }
        if (r5 == null) {
            r5 = EmptyList.b;
        }
        List<VideoVideoFullDto> V2 = catalogCatalogResponseObjectDto.V2();
        if (V2 == null) {
            V2 = EmptyList.b;
        }
        List<VideoVideoFullDto> list = V2;
        int e = on00.e(c5g.u(list, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj5 : list) {
            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) obj5;
            StringBuilder sb = new StringBuilder();
            sb.append(videoVideoFullDto.q());
            sb.append('_');
            sb.append(videoVideoFullDto.s1());
            linkedHashMap.put(sb.toString(), obj5);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = ((Iterable) r5).iterator();
        while (it3.hasNext()) {
            VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) linkedHashMap.get((String) it3.next());
            VideoFileOld d = videoVideoFullDto2 != null ? ums0.d(ums0.a, videoVideoFullDto2, null, null, null, 30) : null;
            if (d != null) {
                arrayList3.add(d);
            }
        }
        PlaylistCatalogSectionDo playlistCatalogSectionDo = new PlaylistCatalogSectionDo(catalogSectionDto.getId(), catalogSectionDto.getTitle(), catalogSectionDto.getUrl(), catalogSectionDo);
        List<CatalogBlockDto> g3 = catalogSectionDto.g();
        if (g3 != null) {
            Iterator it4 = g3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
                CatalogLayoutDto.NameDto f2 = catalogBlockDto.n1().f();
                if (catalogBlockDto.l0() == CatalogBlockDataTypeDto.ALBUMS && (f2 == CatalogLayoutDto.NameDto.BANNER || f2 == CatalogLayoutDto.NameDto.TITLE_SUBTITLE_AVATAR)) {
                    break;
                }
            }
            CatalogBlockDto catalogBlockDto2 = (CatalogBlockDto) obj2;
            if (catalogBlockDto2 != null && (f = catalogBlockDto2.f()) != null && (str = (String) j5g.a0(f)) != null) {
                List<VideoVideoAlbumFullDto> e2 = catalogCatalogResponseObjectDto.e();
                if (e2 != null) {
                    Iterator it5 = e2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it5.next();
                        VideoVideoAlbumFullDto videoVideoAlbumFullDto2 = (VideoVideoAlbumFullDto) obj3;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(videoVideoAlbumFullDto2.q());
                        sb2.append('_');
                        sb2.append(videoVideoAlbumFullDto2.getId());
                        if (epx.f(sb2.toString(), str)) {
                            break;
                        }
                    }
                    videoVideoAlbumFullDto = (VideoVideoAlbumFullDto) obj3;
                } else {
                    videoVideoAlbumFullDto = null;
                }
            }
        }
        List<VideoVideoAlbumFullDto> e3 = catalogCatalogResponseObjectDto.e();
        videoVideoAlbumFullDto = e3 != null ? (VideoVideoAlbumFullDto) j5g.a0(e3) : null;
        if (videoVideoAlbumFullDto == null) {
            playlistDataDo = null;
            g = catalogSectionDto.g();
            if (g != null) {
                Iterator it6 = g.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    CatalogBlockDto catalogBlockDto3 = (CatalogBlockDto) obj;
                    CatalogLayoutDto.NameDto f4 = catalogBlockDto3.n1().f();
                    if (catalogBlockDto3.l0() == CatalogBlockDataTypeDto.ALBUMS && (f4 == CatalogLayoutDto.NameDto.BANNER || f4 == CatalogLayoutDto.NameDto.TITLE_SUBTITLE_AVATAR)) {
                        if (catalogBlockDto3.e() != null && (!r2.isEmpty())) {
                            break;
                        }
                    }
                }
                CatalogBlockDto catalogBlockDto4 = (CatalogBlockDto) obj;
                if (catalogBlockDto4 != null) {
                    List<CatalogButtonDto> e4 = catalogBlockDto4.e();
                    if (e4 == null) {
                        e4 = EmptyList.b;
                    }
                    List<CatalogButtonDto> list2 = e4;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        arrayList4.add(p4a.c((CatalogButtonDto) it7.next(), catalogBlockDto4));
                    }
                    r4 = new ArrayList(c5g.u(arrayList4, 10));
                    Iterator it8 = arrayList4.iterator();
                    while (it8.hasNext()) {
                        CatalogButtonDo catalogButtonDo = (CatalogButtonDo) it8.next();
                        r4.add(new PlaylistButtonDo(catalogButtonDo.b, catalogButtonDo.c));
                    }
                }
            }
            if (r4 == 0) {
                r4 = EmptyList.b;
            }
            return new PlaylistCatalogDo(playlistCatalogSectionDo, playlistDataDo, r4, arrayList3);
        }
        VideoAlbum a2 = b1s0.a(videoVideoAlbumFullDto);
        playlistDataDo = new PlaylistDataDo(a2.b, a2.c, a2.l, false, a2.h, a2.d, a2);
        g = catalogSectionDto.g();
        if (g != null) {
        }
        if (r4 == 0) {
        }
        return new PlaylistCatalogDo(playlistCatalogSectionDo, playlistDataDo, r4, arrayList3);
    }
}
