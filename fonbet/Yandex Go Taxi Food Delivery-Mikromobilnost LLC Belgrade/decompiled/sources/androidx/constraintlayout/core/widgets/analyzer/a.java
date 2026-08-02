package androidx.constraintlayout.core.widgets.analyzer;

import defpackage.xwi;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public class a implements xwi {
    public final h d;
    public int f;
    public int g;
    public h a = null;
    public boolean b = false;
    public boolean c = false;
    public DependencyNode$Type e = DependencyNode$Type.UNKNOWN;
    public int h = 1;
    public b i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public a(h hVar) {
        this.d = hVar;
    }

    @Override // defpackage.xwi
    public final void a(xwi xwiVar) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).j) {
                return;
            }
        }
        this.c = true;
        h hVar = this.a;
        if (hVar != null) {
            hVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        a aVar = null;
        int i = 0;
        while (it2.hasNext()) {
            a aVar2 = (a) it2.next();
            if (!(aVar2 instanceof b)) {
                i++;
                aVar = aVar2;
            }
        }
        if (aVar != null && i == 1 && aVar.j) {
            b bVar = this.i;
            if (bVar != null) {
                if (!bVar.j) {
                    return;
                } else {
                    this.f = this.h * bVar.g;
                }
            }
            d(aVar.g + this.f);
        }
        h hVar2 = this.a;
        if (hVar2 != null) {
            hVar2.a(this);
        }
    }

    public final void b(h hVar) {
        this.k.add(hVar);
        if (this.j) {
            hVar.a(hVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            xwi xwiVar = (xwi) it.next();
            xwiVar.a(xwiVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.k0);
        sb.append(":");
        sb.append(this.e);
        sb.append(Extension.O_BRAKE);
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
