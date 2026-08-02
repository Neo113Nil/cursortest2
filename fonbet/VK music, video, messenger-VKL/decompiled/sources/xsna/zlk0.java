package xsna;

import com.vk.geo.impl.model.BoundingBox;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zlk0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        yfz yfzVar = (yfz) obj;
        yfz yfzVar2 = (yfz) obj2;
        BoundingBox boundingBox = yfzVar.a.d;
        boundingBox.getClass();
        BoundingBox boundingBox2 = yfzVar.b.d;
        boundingBox2.getClass();
        float l0 = boundingBox.l0(boundingBox2);
        BoundingBox boundingBox3 = yfzVar2.a.d;
        boundingBox3.getClass();
        BoundingBox boundingBox4 = yfzVar2.b.d;
        boundingBox4.getClass();
        int compare = Float.compare(l0, boundingBox3.l0(boundingBox4));
        return compare == 0 ? Float.compare(((Number) yfzVar.c.getValue()).floatValue(), ((Number) yfzVar2.c.getValue()).floatValue()) : compare;
    }
}
