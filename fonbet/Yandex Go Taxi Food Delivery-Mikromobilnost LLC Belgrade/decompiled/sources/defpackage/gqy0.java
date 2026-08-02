package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;

/* loaded from: classes10.dex */
public final class gqy0 extends puz {
    public final /* synthetic */ vtz c;
    public final /* synthetic */ puz d;
    public final /* synthetic */ DocumentData e;

    public gqy0(vtz vtzVar, puz puzVar, DocumentData documentData) {
        this.c = vtzVar;
        this.d = puzVar;
        this.e = documentData;
    }

    @Override // defpackage.puz
    public final Object a(vtz vtzVar) {
        float f = vtzVar.a;
        float f2 = vtzVar.b;
        String str = ((DocumentData) vtzVar.c).a;
        String str2 = ((DocumentData) vtzVar.d).a;
        float f3 = vtzVar.e;
        float f4 = vtzVar.f;
        float f5 = vtzVar.g;
        vtz vtzVar2 = this.c;
        vtzVar2.a = f;
        vtzVar2.b = f2;
        vtzVar2.c = str;
        vtzVar2.d = str2;
        vtzVar2.e = f3;
        vtzVar2.f = f4;
        vtzVar2.g = f5;
        String str3 = (String) this.d.a(vtzVar2);
        DocumentData documentData = (DocumentData) (vtzVar.f == 1.0f ? vtzVar.d : vtzVar.c);
        String str4 = documentData.b;
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
        documentData2.a = str3;
        documentData2.b = str4;
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
