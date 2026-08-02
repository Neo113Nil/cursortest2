package xsna;

import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import xsna.dum0;

/* compiled from: SublistsByFolderIdGetCmd.kt */
/* loaded from: classes18.dex */
public final class jum0 extends le6<List<? extends b0s>> {
    public final int b;
    public final e7b0 c = new e7b0();

    public jum0(int i) {
        this.b = i;
    }

    @Override // xsna.le6
    public final List<? extends b0s> e(w2w w2wVar) {
        pdm c = w2wVar.I0().b().c();
        ArrayList b = c.l().b(this.b);
        dum0 k = c.k();
        Cursor d = k.b.b().d(k.a.b(b, dum0.a.TYPE), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(dum0.b(d));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                List<gum0> O0 = j5g.O0(arrayList);
                ArrayList arrayList2 = new ArrayList(c5g.u(O0, 10));
                for (gum0 gum0Var : O0) {
                    this.c.getClass();
                    String str = gum0Var.a;
                    String str2 = gum0Var.b;
                    String str3 = gum0Var.c;
                    fum0 fum0Var = gum0Var.d;
                    arrayList2.add(new b0s(str, str2, str3, new cum0(fum0Var.a, fum0Var.b)));
                }
                return arrayList2;
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jum0) && this.b == ((jum0) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return vu5.b(new StringBuilder("SublistsByFolderIdGetCmd(folderId="), this.b, ')');
    }
}
