package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommonImageViewer.kt */
/* loaded from: classes11.dex */
public final class tkg extends qe6 {
    public static final tkg a = new tkg();

    /* compiled from: CommonImageViewer.kt */
    public static final class a {
        public static gwn a(re6 re6Var) {
            ImageViewer.a b = re6Var.b();
            ewn ewnVar = b instanceof ewn ? (ewn) b : null;
            dwn k = ewnVar != null ? ewnVar.k() : null;
            ImFeatures imFeatures = ImFeatures.BLUR_POST;
            imFeatures.getClass();
            if (!com.vk.toggle.b.A.a(imFeatures) || k == null) {
                return null;
            }
            List e = re6Var.e();
            izs k2 = re6Var.k();
            ArrayList arrayList = new ArrayList(c5g.u(e, 10));
            Iterator it = e.iterator();
            while (it.hasNext()) {
                arrayList.add(k2.invoke(it.next()));
            }
            a1w a1wVar = q1w.a;
            return new gwn(arrayList, k, a1wVar != null ? a1wVar : null, g2v.c());
        }
    }
}
