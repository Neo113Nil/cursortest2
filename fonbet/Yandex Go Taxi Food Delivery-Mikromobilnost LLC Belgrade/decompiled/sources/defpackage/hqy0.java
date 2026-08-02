package defpackage;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* loaded from: classes10.dex */
public final class hqy0 extends skx {
    public hqy0(List list) {
        super(list);
    }

    @Override // defpackage.i35
    public final Object g(rkx rkxVar, float f) {
        Object obj;
        Object obj2 = rkxVar.b;
        puz puzVar = this.e;
        if (puzVar == null) {
            return (f != 1.0f || (obj = rkxVar.c) == null) ? (DocumentData) obj2 : (DocumentData) obj;
        }
        float f2 = rkxVar.g;
        Float f3 = rkxVar.h;
        float floatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        DocumentData documentData = (DocumentData) obj2;
        Object obj3 = rkxVar.c;
        return (DocumentData) puzVar.b(f2, floatValue, documentData, obj3 == null ? documentData : (DocumentData) obj3, f, d(), this.d);
    }
}
