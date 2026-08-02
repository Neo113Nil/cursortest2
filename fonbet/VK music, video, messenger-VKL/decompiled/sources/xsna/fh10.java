package xsna;

import com.vk.dto.masks.MasksCatalogItem;
import com.vk.masks.MasksController;
import com.vk.tabbar.core.api.domain.TabbarState;
import java.util.ArrayList;
import java.util.List;
import xsna.bi10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fh10 implements io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fh10(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                MasksController masksController = (MasksController) this.c;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList<bi10> arrayList2 = masksController.b;
                boolean isEmpty = arrayList2.isEmpty();
                for (int i = 0; i < list.size(); i++) {
                    MasksCatalogItem masksCatalogItem = (MasksCatalogItem) list.get(i);
                    if (masksCatalogItem.Ab() != null) {
                        for (int i2 = 0; i2 < masksCatalogItem.Ab().size(); i2++) {
                            if (i2 == 0) {
                                arrayList.add(new bi10.d(masksCatalogItem.Ab().get(i2), masksCatalogItem.Bb(), false));
                            } else {
                                int id = masksCatalogItem.Ab().get(i2).getId();
                                if (id < -6999 || id > -6000) {
                                    arrayList.add(new bi10.d(masksCatalogItem.Ab().get(i2), null, false));
                                } else if (isEmpty) {
                                    arrayList2.add(new bi10.b(masksCatalogItem.Ab().get(i2)));
                                }
                            }
                        }
                    }
                }
                return arrayList;
            default:
                return (TabbarState) ((m3w) this.c).invoke(obj);
        }
    }
}
