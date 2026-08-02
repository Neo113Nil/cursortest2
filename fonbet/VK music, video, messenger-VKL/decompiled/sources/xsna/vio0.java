package xsna;

import com.airbnb.lottie.model.DocumentData;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class vio0 extends phy<DocumentData> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.tf6
    public final Object g(nhy nhyVar, float f) {
        T t;
        T t2 = nhyVar.b;
        a900<A> a900Var = this.e;
        if (a900Var == 0) {
            return (f != 1.0f || (t = nhyVar.c) == 0) ? (DocumentData) t2 : (DocumentData) t;
        }
        float f2 = nhyVar.g;
        Float f3 = nhyVar.h;
        float floatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        DocumentData documentData = (DocumentData) t2;
        T t3 = nhyVar.c;
        return (DocumentData) a900Var.b(f2, floatValue, documentData, t3 == 0 ? documentData : (DocumentData) t3, f, d(), this.d);
    }
}
