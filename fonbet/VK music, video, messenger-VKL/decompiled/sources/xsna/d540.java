package xsna;

import java.util.ArrayList;
import xsna.elo;

/* compiled from: MultiDraweeHolder.java */
@Deprecated
/* loaded from: classes12.dex */
public final class d540<DH extends elo> {
    public boolean a = false;
    public final ArrayList<flo<DH>> b = new ArrayList<>();

    public final flo<DH> a(int i) {
        return this.b.get(i);
    }

    public final void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        int i = 0;
        while (true) {
            ArrayList<flo<DH>> arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).f();
            i++;
        }
    }

    public final void c() {
        if (!this.a) {
            return;
        }
        int i = 0;
        this.a = false;
        while (true) {
            ArrayList<flo<DH>> arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).g();
            i++;
        }
    }
}
