package xsna;

import java.util.ArrayList;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class xn01 implements la01 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ vjq f;

    public xn01(vjq vjqVar, ArrayList arrayList, ArrayList arrayList2, long j, boolean z, ArrayList arrayList3) {
        this.f = vjqVar;
        this.a = arrayList;
        this.b = arrayList2;
        this.c = j;
        this.d = z;
        this.e = arrayList3;
    }

    @Override // xsna.la01
    public final void a(int i) {
        this.f.i(6, i, null, null, null, null, null);
    }

    @Override // xsna.la01
    public final void zza() {
        vjq vjqVar = this.f;
        vjqVar.l.addAll(this.a);
        vjqVar.m.addAll(this.b);
        Long valueOf = Long.valueOf(this.c);
        vjqVar.i(5, 0, valueOf, valueOf, null, null, null);
    }

    @Override // xsna.la01
    public final void zzc() {
        if (this.d) {
            return;
        }
        vjq vjqVar = this.f;
        xd01 h = vjqVar.i.h();
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = this.b;
        long j = this.c;
        ArrayList arrayList3 = this.e;
        h.a(arrayList3, new xn01(vjqVar, arrayList, arrayList2, j, true, arrayList3));
    }
}
