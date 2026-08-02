package xsna;

import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogRecomPlaylistRelationDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.artists.slider.entity.ArtistSliderState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: ArtistSliderStateMapper.kt */
/* loaded from: classes.dex */
public final class it3 implements f2a<ArtistSliderState> {
    public final u2b0 a;

    public it3(u2b0 u2b0Var) {
        this.a = u2b0Var;
    }

    @Override // xsna.f2a
    public final List<ArtistSliderState> a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArtistSliderState artistSliderState;
        ArrayList arrayList;
        Artist n;
        List<CatalogRecomPlaylistRelationDto> M = catalogBlockDto.M();
        if (M != null) {
            linkedHashMap = new LinkedHashMap();
            for (CatalogRecomPlaylistRelationDto catalogRecomPlaylistRelationDto : M) {
                linkedHashMap.put(catalogRecomPlaylistRelationDto.e(), catalogRecomPlaylistRelationDto.d());
            }
        } else {
            linkedHashMap = null;
        }
        List<AudioArtistDto> e = catalogExtraResponseObjectDto.e();
        if (e != null) {
            linkedHashMap2 = new LinkedHashMap();
            for (Object obj : e) {
                linkedHashMap2.put(((AudioArtistDto) obj).getId(), obj);
            }
        } else {
            linkedHashMap2 = null;
        }
        List<AudioPlaylistDto> d0 = catalogExtraResponseObjectDto.d0();
        if (d0 == null) {
            d0 = EmptyList.b;
        }
        List<AudioPlaylistDto> list = d0;
        int e2 = on00.e(c5g.u(list, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e2);
        for (Object obj2 : list) {
            AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) obj2;
            Set<Integer> set = Playlist.P;
            linkedHashMap3.put(Playlist.a.a(audioPlaylistDto.getId(), audioPlaylistDto.q()), obj2);
        }
        List<String> l2 = catalogBlockDto.l2();
        if (l2 == null) {
            return EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : l2) {
            AudioPlaylistDto audioPlaylistDto2 = (AudioPlaylistDto) linkedHashMap3.get(str);
            if (audioPlaylistDto2 != null) {
                jt4.a.getClass();
                Playlist a = jt4.a(audioPlaylistDto2);
                if (linkedHashMap2 != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list2 = linkedHashMap != null ? (List) linkedHashMap.get(str) : null;
                        Boolean valueOf = (str2 == null || list2 == null) ? null : Boolean.valueOf(list2.contains(str2));
                        if (valueOf != null ? valueOf.booleanValue() : false) {
                            linkedHashMap4.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList = new ArrayList(linkedHashMap4.size());
                    Iterator it = linkedHashMap4.entrySet().iterator();
                    while (it.hasNext()) {
                        n = sp.n((AudioArtistDto) ((Map.Entry) it.next()).getValue(), false);
                        arrayList.add(n);
                    }
                } else {
                    arrayList = null;
                }
                String id = catalogBlockDto.getId();
                PlayingState h = uzp.h(a, this.a);
                String id2 = catalogBlockDto.getId();
                List list3 = arrayList;
                if (arrayList == null) {
                    list3 = EmptyList.b;
                }
                artistSliderState = new ArtistSliderState(BlockId.Simple.a(id), catalogBlockVariant, h, a, list3, "", id2);
            } else {
                artistSliderState = null;
            }
            if (artistSliderState != null) {
                arrayList2.add(artistSliderState);
            }
        }
        return arrayList2;
    }
}
