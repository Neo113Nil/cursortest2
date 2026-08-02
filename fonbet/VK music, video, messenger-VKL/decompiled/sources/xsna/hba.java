package xsna;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetRecommendationsResponseDto;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudioFromBlock;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hba implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ hba(String str, int i) {
        this.b = i;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                return str;
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, str);
                return s3q0.a;
            case 2:
                long j = ((UserId) obj).b;
                if (1 > j || j > Long.MAX_VALUE) {
                    throw new IllegalArgumentException(zr.a("Param ", str, " not in 1..9223372036854775807"));
                }
                return String.valueOf(j);
            default:
                List<AudioAudioDto> d = ((AudioGetRecommendationsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    linkedHashMap.put(((MusicTrack) next).Fb(), next);
                }
                CatalogExtendedData catalogExtendedData = new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, -1, 7, null);
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                String string = context.getString(R.string.music_playlist_controls_play_all);
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((MusicTrack) it3.next()).Fb());
                }
                CatalogButtonPlayAudioFromBlock catalogButtonPlayAudioFromBlock = new CatalogButtonPlayAudioFromBlock("play_audios_from_block", null, string, "synthetic_section_similar_tracks_block_tracks", arrayList2, false, null, 64, null);
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                String string2 = context2.getString(R.string.music_playlist_controls_shuffle);
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((MusicTrack) it4.next()).Fb());
                }
                ArrayList a = e43.a(catalogButtonPlayAudioFromBlock, new CatalogButtonPlayAudioFromBlock("play_shuffled_audios_from_block", null, string2, "synthetic_section_similar_tracks_block_tracks", arrayList3, true, null, 64, null));
                CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_ACTION;
                CatalogLayout catalogLayout = new CatalogLayout(CatalogViewType.BUTTONS_HORIZONTAL, null, null, null, null, false, null, null, null, 510, null);
                EmptyList emptyList = EmptyList.b;
                CatalogBlockItemsData catalogBlockItemsData = new CatalogBlockItemsData(catalogDataType, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 4094, null);
                String str2 = this.c;
                jgp jgpVar = jgp.b;
                CatalogBlock catalogBlock = new CatalogBlock("synthetic_section_similar_tracks_block_actions", catalogDataType, "synthetic_section_similar_tracks_block_actions", str2, null, null, null, catalogLayout, a, null, emptyList, catalogBlockItemsData, null, jgpVar, null, null, BuildConfig.FLAVOR, null, null, null, null, 1982464, null);
                CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
                CatalogLayout catalogLayout2 = new CatalogLayout(CatalogViewType.LIST, null, null, null, null, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 510, 0 == true ? 1 : 0);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((MusicTrack) it5.next()).Fb());
                }
                ArrayList o = e43.o(catalogBlock, new CatalogBlock("synthetic_section_similar_tracks_block_tracks", catalogDataType2, "synthetic_section_similar_tracks_block_tracks", str2, null, null, null, catalogLayout2, arrayList4, null, emptyList, new CatalogBlockItemsData(catalogDataType2, arrayList5, null, null, null, null, null, null, null, null, null, null, 4092, null), null, jgpVar, null, null, BuildConfig.FLAVOR, null, null, null, null, 1982464, null));
                CatalogDataType catalogDataType3 = CatalogDataType.DATA_TYPE_NONE;
                Context context3 = e43.a;
                String string3 = (context3 != null ? context3 : null).getString(R.string.similar_music_tracks_section_title);
                EmptyList emptyList2 = EmptyList.b;
                return new hda(new CatalogSection(str2, catalogDataType3, string3, null, null, null, emptyList2, o, emptyList2, null, null, null, null, null, 14336, null), catalogExtendedData, "");
        }
    }

    public /* synthetic */ hba(s550 s550Var, String str) {
        this.b = 3;
        this.c = str;
    }
}
