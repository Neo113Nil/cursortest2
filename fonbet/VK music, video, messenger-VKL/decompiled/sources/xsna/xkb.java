package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xkb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ xkb(String str, String str2, int i) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        List<CatalogSectionDto> j;
        CatalogSectionDto catalogSectionDto;
        switch (this.b) {
            case 0:
                String str2 = this.c;
                String str3 = this.d;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("DELETE FROM audio_book_chapter WHERE uid = ? AND chapter_id = ?");
                try {
                    V0.D3(1, str2);
                    V0.D3(2, str3);
                    V0.step();
                    int p = sv1.p(hyg0Var);
                    V0.close();
                    return Integer.valueOf(p);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto = (CatalogCatalogResponseObjectDto) obj;
                List<AudioAudioDto> B = catalogCatalogResponseObjectDto.B();
                if (B == null) {
                    B = EmptyList.b;
                }
                List<AudioAudioDto> list = B;
                int e = on00.e(c5g.u(list, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj2 : list) {
                    AudioAudioDto audioAudioDto = (AudioAudioDto) obj2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(audioAudioDto.q());
                    sb.append('_');
                    sb.append(audioAudioDto.getId());
                    linkedHashMap.put(sb.toString(), obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), oc4.d((AudioAudioDto) entry.getValue()));
                }
                List<ShortVideoAudioDto> I2 = catalogCatalogResponseObjectDto.I2();
                if (I2 == null) {
                    I2 = EmptyList.b;
                }
                List<ShortVideoAudioDto> list2 = I2;
                int e2 = on00.e(c5g.u(list2, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
                for (Object obj3 : list2) {
                    ShortVideoAudioDto shortVideoAudioDto = (ShortVideoAudioDto) obj3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(shortVideoAudioDto.q());
                    sb2.append('_');
                    sb2.append(shortVideoAudioDto.getId());
                    linkedHashMap3.put(sb2.toString(), obj3);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    linkedHashMap4.put(entry2.getKey(), sfj0.c((ShortVideoAudioDto) entry2.getValue()));
                }
                linkedHashMap2.putAll(linkedHashMap4);
                CatalogCatalogDto F = catalogCatalogResponseObjectDto.F();
                String str4 = this.c;
                if (F == null || (str = F.e()) == null) {
                    str = str4;
                }
                CatalogDataType catalogDataType = CatalogDataType.DATA_SYNTHETIC_SECTION;
                EmptyList emptyList = EmptyList.b;
                CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
                CatalogSection catalogSection = new CatalogSection(str, catalogDataType, this.d, null, null, null, emptyList, new ArrayList(Collections.singletonList(new CatalogBlock("", catalogDataType2, null, str4, null, null, null, new CatalogLayout(CatalogViewType.LIST_PICKER, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType2, new ArrayList(linkedHashMap2.keySet()), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094964, null))), emptyList, null, null, null, null, null, 15360, null);
                CatalogExtendedData catalogExtendedData = new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, -1, 7, null);
                CatalogCatalogDto F2 = catalogCatalogResponseObjectDto.F();
                return new hda(catalogSection, catalogExtendedData, (F2 == null || (j = F2.j()) == null || (catalogSectionDto = (CatalogSectionDto) j5g.b0(0, j)) == null) ? null : catalogSectionDto.l());
        }
    }
}
