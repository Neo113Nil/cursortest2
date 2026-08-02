package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class a2w implements izs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ a2w() {
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                dx90 dx90Var = ow90.e;
                dx90Var.getClass();
                dx90Var.n = System.currentTimeMillis();
                dx90Var.r();
                return s3q0.a;
            default:
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockList) {
                    UIBlockList uIBlockList = (UIBlockList) uIBlock;
                    ArrayList<UIBlock> Sb = uIBlockList.Sb();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : Sb) {
                        CatalogDataType Cb = ((UIBlock) obj2).Cb();
                        if (Cb == CatalogDataType.DATA_TYPE_STICKER_PACKS || Cb == CatalogDataType.DATA_TYPE_STICKERS || Cb == CatalogDataType.DATA_TYPE_STICKERS_INFO) {
                            arrayList.add(obj2);
                        }
                    }
                    z = j5g.M(arrayList);
                    if (!z) {
                        ArrayList<UIBlock> Sb2 = uIBlockList.Sb();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : Sb2) {
                            if (obj3 instanceof UIBlockList) {
                                arrayList2.add(obj3);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ArrayList<UIBlock> Sb3 = ((UIBlockList) it.next()).Sb();
                            if (Sb3 == null || !Sb3.isEmpty()) {
                                Iterator<T> it2 = Sb3.iterator();
                                while (it2.hasNext()) {
                                    CatalogDataType Cb2 = ((UIBlock) it2.next()).Cb();
                                    if (Cb2 == CatalogDataType.DATA_TYPE_STICKER_PACKS || Cb2 == CatalogDataType.DATA_TYPE_STICKERS || Cb2 == CatalogDataType.DATA_TYPE_STICKERS_INFO) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ a2w(cal0 cal0Var) {
    }
}
