package xsna;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class uio0 extends a900<DocumentData> {
    public final /* synthetic */ p800 c;
    public final /* synthetic */ a900 d;
    public final /* synthetic */ DocumentData e;

    public uio0(p800 p800Var, a900 a900Var, DocumentData documentData) {
        this.c = p800Var;
        this.d = a900Var;
        this.e = documentData;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // xsna.a900
    public final DocumentData a(p800<DocumentData> p800Var) {
        float f = p800Var.a;
        float f2 = p800Var.b;
        ?? r2 = p800Var.c.a;
        ?? r3 = p800Var.d.a;
        float f3 = p800Var.e;
        float f4 = p800Var.f;
        float f5 = p800Var.g;
        p800 p800Var2 = this.c;
        p800Var2.a = f;
        p800Var2.b = f2;
        p800Var2.c = r2;
        p800Var2.d = r3;
        p800Var2.e = f3;
        p800Var2.f = f4;
        p800Var2.g = f5;
        String str = (String) this.d.a(p800Var2);
        DocumentData documentData = p800Var.f == 1.0f ? p800Var.d : p800Var.c;
        String str2 = documentData.b;
        float f6 = documentData.c;
        DocumentData.Justification justification = documentData.d;
        int i = documentData.e;
        float f7 = documentData.f;
        float f8 = documentData.g;
        int i2 = documentData.h;
        int i3 = documentData.i;
        float f9 = documentData.j;
        boolean z = documentData.k;
        PointF pointF = documentData.l;
        PointF pointF2 = documentData.m;
        DocumentData documentData2 = this.e;
        documentData2.a = str;
        documentData2.b = str2;
        documentData2.c = f6;
        documentData2.d = justification;
        documentData2.e = i;
        documentData2.f = f7;
        documentData2.g = f8;
        documentData2.h = i2;
        documentData2.i = i3;
        documentData2.j = f9;
        documentData2.k = z;
        documentData2.l = pointF;
        documentData2.m = pointF2;
        return documentData2;
    }
}
