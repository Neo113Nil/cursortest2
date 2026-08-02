package xsna;

import com.vk.dto.masks.Mask;
import com.vk.dto.masks.MasksCatalogItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.face.pipeline_frugal.FrugalKeypointPipeline;
import ru.ok.gl.util.FrameHolder;
import ru.ok.tensorflow.util.Producer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class lus implements Producer, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lus(Object obj, boolean z, Object obj2) {
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    @Override // ru.ok.tensorflow.util.Producer
    public Object apply() {
        List lambda$process$1;
        lambda$process$1 = ((FrugalKeypointPipeline) this.c).lambda$process$1(this.b, (FrameHolder) this.d);
        return lambda$process$1;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Mask mask = (Mask) this.c;
        String str = (String) this.d;
        List list = (List) obj;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ArrayList<Mask> arrayList = ((MasksCatalogItem) it.next()).c;
            if (arrayList != null) {
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        Mask mask2 = arrayList.get(i);
                        if (mask2.d == mask.d) {
                            mask2.w = this.b;
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        if (z) {
            wmi0.a.m(str, list);
        }
        return Boolean.valueOf(z);
    }
}
