package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.awg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf40 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lf40(int i, String str, String str2) {
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                String str2 = (String) this.e;
                AudioGetResponseDto audioGetResponseDto = (AudioGetResponseDto) obj;
                int count = audioGetResponseDto.getCount();
                int i = this.c + 20;
                String valueOf = count > i ? String.valueOf(i) : null;
                List<AudioAudioDto> d = audioGetResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (AudioAudioDto audioAudioDto : d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(audioAudioDto.q());
                    sb.append('_');
                    sb.append(audioAudioDto.getId());
                    arrayList.add(sb.toString());
                }
                HashMap hashMap = new HashMap();
                int size = audioGetResponseDto.d().size();
                for (int i2 = 0; i2 < size; i2++) {
                    hashMap.put(arrayList.get(i2), oc4.d(audioGetResponseDto.d().get(i2)));
                }
                CatalogDataType catalogDataType = CatalogDataType.DATA_SYNTHETIC_SECTION;
                EmptyList emptyList = EmptyList.b;
                CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_MUSIC_TRACKS;
                return new hda(new CatalogSection(str, catalogDataType, str2, null, null, null, emptyList, new ArrayList(Collections.singletonList(new CatalogBlock("", catalogDataType2, null, str, null, null, null, new CatalogLayout(CatalogViewType.LIST_PICKER, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType2, new ArrayList(arrayList), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094964, null))), emptyList, null, null, null, null, null, 15360, null), new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, hashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, -1, 7, null), valueOf);
            default:
                return awg0.a.a((awg0) obj, ((lq40) ((ts70) this.d).a.c).s(this.c), null, new axb((el50) this.e, 2), 1);
        }
    }

    public /* synthetic */ lf40(ts70 ts70Var, int i, el50 el50Var) {
        this.d = ts70Var;
        this.c = i;
        this.e = el50Var;
    }
}
