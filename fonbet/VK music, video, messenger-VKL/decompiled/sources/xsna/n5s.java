package xsna;

import java.util.ArrayList;
import xsna.o5s;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes11.dex */
public final class n5s implements o7j<o5s.a> {
    public final /* synthetic */ String b;

    public n5s(String str) {
        this.b = str;
    }

    @Override // xsna.o7j
    public final void accept(o5s.a aVar) {
        o5s.a aVar2 = aVar;
        synchronized (o5s.c) {
            try {
                dpj0<String, ArrayList<o7j<o5s.a>>> dpj0Var = o5s.d;
                ArrayList<o7j<o5s.a>> arrayList = dpj0Var.get(this.b);
                if (arrayList == null) {
                    return;
                }
                dpj0Var.remove(this.b);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
