package xsna;

import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.MutableBoundingBox;
import com.vk.log.L;

/* compiled from: BoundingBoxPool.kt */
/* loaded from: classes2.dex */
public final class y98 extends bvb0<MutableBoundingBox> {
    public static final y98 e = new y98(40);

    @Override // xsna.bvb0
    public final void b(MutableBoundingBox mutableBoundingBox) {
        MutableBoundingBox mutableBoundingBox2 = mutableBoundingBox;
        L.p(new RuntimeException("its ok! not real exception! clearing " + mutableBoundingBox2));
        long j = Coordinate.b;
        mutableBoundingBox2.g = j;
        mutableBoundingBox2.h = j;
    }
}
