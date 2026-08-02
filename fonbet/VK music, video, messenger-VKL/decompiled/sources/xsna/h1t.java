package xsna;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: GLCollageController.kt */
/* loaded from: classes4.dex */
public final class h1t {
    public final int a;
    public final int b;
    public ArrayList c;
    public final /* synthetic */ z1g d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ l1t f;

    public h1t(z1g z1gVar, ArrayList arrayList, l1t l1tVar) {
        this.d = z1gVar;
        this.e = arrayList;
        this.f = l1tVar;
        this.a = z1gVar.a;
        this.b = z1gVar.b;
        this.c = arrayList;
    }

    public final void a() {
        HashSet hashSet = new HashSet();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            m1t m1tVar = (m1t) it.next();
            f2t f2tVar = m1tVar.j;
            if (f2tVar != null) {
                hashSet.add(f2tVar);
            }
            f2t f2tVar2 = m1tVar.k;
            if (f2tVar2 != null) {
                hashSet.add(f2tVar2);
            }
        }
        h2t h2tVar = this.f.p;
        List O0 = j5g.O0(hashSet);
        l3g l3gVar = h2tVar.c;
        y1t y1tVar = (y1t) l3gVar.b;
        synchronized (y1tVar.g) {
            try {
                Iterator it2 = O0.iterator();
                while (it2.hasNext()) {
                    y1tVar.g.add(Integer.valueOf(((f2t) it2.next()).a));
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        ((k3g) l3gVar.c).p.b();
    }
}
