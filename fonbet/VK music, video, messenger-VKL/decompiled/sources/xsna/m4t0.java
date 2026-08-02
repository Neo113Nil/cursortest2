package xsna;

import com.vk.api.generated.video.dto.VideoViewSegmentsResponseDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class m4t0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m4t0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<CatalogBlock> list;
        switch (this.b) {
            case 0:
                n4t0 n4t0Var = (n4t0) this.c;
                String str = (String) this.d;
                hda hdaVar = (hda) obj;
                Object obj2 = hdaVar.a;
                CatalogExtendedData catalogExtendedData = hdaVar.b;
                Object obj3 = null;
                CatalogSection catalogSection = obj2 instanceof CatalogSection ? (CatalogSection) obj2 : null;
                if (catalogSection != null && (list = catalogSection.i) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            CatalogBlock catalogBlock = (CatalogBlock) next;
                            if (catalogBlock.c == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS && catalogBlock.i.b != CatalogViewType.INVISIBLE) {
                                obj3 = next;
                            }
                        }
                    }
                    CatalogBlock catalogBlock2 = (CatalogBlock) obj3;
                    if (catalogBlock2 != null) {
                        LinkedHashMap z0 = n4t0.z0(catalogBlock2, catalogExtendedData);
                        catalogExtendedData.zb(new CatalogExtendedData(null, null, null, z0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, 7, null));
                        List<? extends VideoFile> O0 = j5g.O0(z0.values());
                        if (str != null) {
                            rmk0 rmk0Var = new rmk0(2);
                            rmk0Var.b(n4t0Var.I.toArray(new VideoFile[0]));
                            rmk0Var.b(O0.toArray(new VideoFile[0]));
                            ArrayList<Object> arrayList = rmk0Var.a;
                            O0 = e43.l(arrayList.toArray(new VideoFile[arrayList.size()]));
                        }
                        n4t0Var.I = O0;
                        break;
                    }
                }
                break;
            case 1:
                crt0 crt0Var = (crt0) this.c;
                CachedVideoViewedSegments cachedVideoViewedSegments = (CachedVideoViewedSegments) this.d;
                ((VideoViewSegmentsResponseDto) obj).getClass();
                crt0Var.a.a(cachedVideoViewedSegments);
                crt0Var.a();
                break;
            default:
                wh50 wh50Var = (wh50) this.c;
                izs izsVar = (izs) this.d;
                ov70 ov70Var = (ov70) obj;
                ljo0 ljo0Var = (ljo0) wh50Var.getValue();
                if (ljo0Var != null) {
                    izsVar.invoke(Integer.valueOf(ljo0Var.b.h(ov70Var.a)));
                }
                break;
        }
        return s3q0.a;
    }
}
